/*                                                                                                                                                                                 
 * Copyright 2011 Shunsuke Nakamura, and contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.cassandra.db.engine;

import java.io.*;
import java.net.URL;

import com.g414.haildb.DatabaseConfiguration;
import com.g414.haildb.DatabaseConfiguration.FileFormat;
import com.g414.haildb.DatabaseConfiguration.FlushMethod;
import com.g414.haildb.DatabaseConfiguration.LogFlushMode;
import com.g414.haildb.DatabaseConfiguration.RecoveryMethod;

import org.apache.cassandra.config.Config;
import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.config.ConfigurationException;

import org.yaml.snakeyaml.Loader;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.error.YAMLException;

public class HailDBConfigure
{
    private final static String DEFAULT_CONFIGURATION = "haildb.yaml";
    
    private static URL getConfigURL() throws ConfigurationException
    {
        String configUrl = System.getProperty("cassandra.haildb");
        if (configUrl == null)
            configUrl = DEFAULT_CONFIGURATION;
        
        URL url;
        try
        {
            url = new URL(configUrl);
            url.openStream();
        }
        catch (Exception e)
        {
            ClassLoader loader = DatabaseDescriptor.class.getClassLoader();
            url = loader.getResource(configUrl);
            if (url == null)
                throw new ConfigurationException("Cannot locate " + configUrl);
        }

        return url;
    }

    static DatabaseConfiguration getConfiguration()
    {
        try
        {
            URL url = getConfigURL();

            InputStream input = null;
            try
            {
                input = url.openStream();
            }
            catch (IOException e)
            {
                throw new AssertionError();
            }
            org.yaml.snakeyaml.constructor.Constructor constructor = new org.yaml.snakeyaml.constructor.Constructor(HailDBConfig.class);
            TypeDescription desc = new TypeDescription(HailDBConfig.class);
            constructor.addTypeDescription(desc);
            Yaml yaml = new Yaml(new Loader(constructor));
            HailDBConfig conf = (HailDBConfig)yaml.load(input);

            DatabaseConfiguration config = new DatabaseConfiguration();
            config.setAdaptiveHashEnabled(conf.adaptiveHashEnabled);
            config.setAdaptiveFlushingEnabled(conf.adaptiveFlushingEnabled);
            if (conf.additionalMemPoolSize > 0)
                config.setAdditionalMemPoolSize(conf.additionalMemPoolSize);
            //if (conf.recoveryMethod != null)
            //    config.setRecoveryMethod(conf.recoveryMethod);
            if (conf.autoextendIncrementSizePages > 0)
                config.setAutoextendIncrementSizePages(conf.autoextendIncrementSizePages);
            if (conf.bufferPoolSize > 0)
                config.setBufferPoolSize(conf.bufferPoolSize);
            config.setPageChecksumsEnabled(conf.pageChecksumsEnabled);
            if (conf.datafilePath != null)
                config.setDatafilePath(conf.datafilePath + File.separator);
            if (conf.dataHomeDir != null)
                config.setDataHomeDir(conf.dataHomeDir + File.separator);
            config.setDoublewriteEnabled(conf.doublewriteEnabled);
            //if (conf.fileFormat != null)
            //    config.setFileFormat(conf.fileFormat);
            if (conf.openFilesLimit > 0)
                config.setOpenFilesLimit(conf.openFilesLimit);
            if (conf.lockWaitTimeoutSeconds > 0)
                config.setLockWaitTimeoutSeconds(conf.lockWaitTimeoutSeconds);
            if (conf.logBufferSize != null)
                config.setLogBufferSize(conf.logBufferSize);
            if (conf.logFileSize != null)
               config.setLogFileSizeMegabytes(conf.logFileSize);
            if (conf.logFilesInGroup > 0)
                config.setLogFilesInGroup(conf.logFilesInGroup);
            if (conf.logFileHomeDirectory != null)
                config.setLogFileHomeDirectory(conf.logFileHomeDirectory + File.separator);
            if (conf.maxDirtyPagesPct > 0)
                config.setMaxDirtyPagesPct(conf.maxDirtyPagesPct);
            if (conf.maxPurgeLagSeconds > 0)
                config.setMaxPurgeLagSeconds(conf.maxPurgeLagSeconds);
            if (conf.lruOldBlocksPct > 0)
                config.setLruOldBlocksPct(conf.lruOldBlocksPct);
            if (conf.lruBlockAccessRecency > 0)
                config.setLruBlockAccessRecency(conf.lruBlockAccessRecency);
            config.setFilePerTableEnabled(conf.filePerTableEnabled);
            //if (conf.flushLogAtTrxCommitMode != null)
            //    config.setFlushLogAtTrxCommitMode(conf.flushLogAtTrxCommitMode);
            //if (conf.flushMethod != null)
            //    config.setFlushMethod(conf.flushMethod);
            if (conf.ioCapacityIOPS > 0)
                config.setIoCapacityIOPS(conf.ioCapacityIOPS);
            if (conf.syncSpinLoops > 0)
                config.setSyncSpinLoops(conf.syncSpinLoops);
            config.setPrintVerboseLog(conf.printVerboseLog);
            config.setStatusFileEnabled(conf.statusFileEnabled);
            config.setSysMallocEnabled(conf.sysMallocEnabled);
            config.setRollbackOnTimeoutEnabled(conf.rollbackOnTimeoutEnabled);

            return config;
        }
        catch (ConfigurationException e)
        {
            System.err.println(e.getMessage() + "\nFatal configuration error; unable to start server.  See log for stacktrace.");
            System.exit(1);
        }
        catch (YAMLException e)
        {
            System.err.println(e.getMessage() + "\nInvalid yaml; unable to start server.  See log for stacktrace.");
            System.exit(1);
        }
        return new DatabaseConfiguration();
    }
}
