package org.apache.cassandra.db.engine;

import com.g414.haildb.DatabaseConfiguration;
import com.g414.haildb.DatabaseConfiguration.FileFormat;
import com.g414.haildb.DatabaseConfiguration.FlushMethod;
import com.g414.haildb.DatabaseConfiguration.LogFlushMode;
import com.g414.haildb.DatabaseConfiguration.RecoveryMethod;

public class HailDBConfig {
    public boolean filePerTableEnabled;
//    public LogFlushMode flushLogAtTrxCommitMode;
//    public FlushMethod flushMethod;
//    public RecoveryMethod recoveryMethod;
    public int ioCapacityIOPS;
    public int syncSpinLoops;
    public boolean printVerboseLog;
    public boolean statusFileEnabled;
    public boolean sysMallocEnabled;
    public boolean rollbackOnTimeoutEnabled;
    public boolean adaptiveHashEnabled;
    public boolean adaptiveFlushingEnabled;
    public long additionalMemPoolSize;
    public int autoextendIncrementSizePages;
    public long bufferPoolSize;
    public boolean pageChecksumsEnabled;
    public String datafilePath;
    public boolean doublewriteEnabled;
//    public FileFormat fileFormat;
    public int openFilesLimit;
    public int lockWaitTimeoutSeconds;
    public String logBufferSize;
    public String logFileSize;
    public int logFilesInGroup;
    public String logFileHomeDirectory;
    public String dataHomeDir;
    public int maxDirtyPagesPct;
    public int maxPurgeLagSeconds;
    public int lruOldBlocksPct;
    public int lruBlockAccessRecency;
}
