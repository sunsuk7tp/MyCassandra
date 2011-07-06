// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g 2011-07-11 23:00:06

package org.apache.cassandra.cli;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class CliParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NODE_CONNECT", "NODE_DESCRIBE_TABLE", "NODE_DESCRIBE_CLUSTER", "NODE_USE_TABLE", "NODE_EXIT", "NODE_HELP", "NODE_NO_OP", "NODE_SHOW_CLUSTER_NAME", "NODE_SHOW_VERSION", "NODE_SHOW_KEYSPACES", "NODE_THRIFT_GET", "NODE_THRIFT_GET_WITH_CONDITIONS", "NODE_THRIFT_SET", "NODE_THRIFT_COUNT", "NODE_THRIFT_DEL", "NODE_ADD_COLUMN_FAMILY", "NODE_ADD_KEYSPACE", "NODE_DEL_KEYSPACE", "NODE_DEL_COLUMN_FAMILY", "NODE_UPDATE_KEYSPACE", "NODE_UPDATE_COLUMN_FAMILY", "NODE_LIST", "NODE_TRUNCATE", "NODE_ASSUME", "NODE_CONSISTENCY_LEVEL", "NODE_COLUMN_ACCESS", "NODE_ID_LIST", "NODE_NEW_CF_ACCESS", "NODE_NEW_KEYSPACE_ACCESS", "CONVERT_TO_TYPE", "FUNCTION_CALL", "CONDITION", "CONDITIONS", "ARRAY", "HASH", "PAIR", "NODE_LIMIT", "NODE_KEY_RANGE", "SEMICOLON", "CONNECT", "HELP", "USE", "DESCRIBE", "KEYSPACE", "EXIT", "QUIT", "SHOW", "KEYSPACES", "API_VERSION", "CREATE", "UPDATE", "COLUMN", "FAMILY", "DROP", "GET", "SET", "DEL", "COUNT", "LIST", "TRUNCATE", "ASSUME", "CONSISTENCYLEVEL", "IntegerLiteral", "Identifier", "StringLiteral", "WITH", "TTL", "AND", "DoubleLiteral", "IP_ADDRESS", "CONFIG", "FILE", "LIMIT", "Letter", "Digit", "Alnum", "WS", "COMMENT", "'/'", "'CLUSTER'", "'CLUSTER NAME'", "'?'", "'AS'", "'WHERE'", "'='", "'>'", "'<'", "'>='", "'<='", "'['", "','", "']'", "'{'", "'}'", "':'", "'('", "')'", "'.'"
    };
    public static final int NODE_THRIFT_GET_WITH_CONDITIONS=15;
    public static final int TTL=70;
    public static final int NODE_SHOW_KEYSPACES=13;
    public static final int CONDITION=35;
    public static final int COUNT=61;
    public static final int EOF=-1;
    public static final int Identifier=67;
    public static final int NODE_UPDATE_COLUMN_FAMILY=24;
    public static final int NODE_USE_TABLE=7;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int NODE_DEL_KEYSPACE=21;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int CREATE=53;
    public static final int NODE_CONNECT=4;
    public static final int T__90=90;
    public static final int CONNECT=43;
    public static final int FAMILY=56;
    public static final int GET=58;
    public static final int NODE_DESCRIBE_TABLE=5;
    public static final int COMMENT=81;
    public static final int SHOW=50;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int ARRAY=37;
    public static final int NODE_ADD_KEYSPACE=20;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int EXIT=48;
    public static final int NODE_THRIFT_DEL=18;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int SEMICOLON=42;
    public static final int KEYSPACES=51;
    public static final int T__85=85;
    public static final int CONDITIONS=36;
    public static final int FILE=75;
    public static final int T__84=84;
    public static final int NODE_LIMIT=40;
    public static final int LIST=62;
    public static final int T__87=87;
    public static final int NODE_DESCRIBE_CLUSTER=6;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int IP_ADDRESS=73;
    public static final int NODE_THRIFT_SET=16;
    public static final int NODE_NO_OP=10;
    public static final int NODE_ID_LIST=30;
    public static final int WS=80;
    public static final int ASSUME=64;
    public static final int NODE_THRIFT_COUNT=17;
    public static final int DESCRIBE=46;
    public static final int Alnum=79;
    public static final int NODE_SHOW_CLUSTER_NAME=11;
    public static final int USE=45;
    public static final int FUNCTION_CALL=34;
    public static final int Letter=77;
    public static final int DoubleLiteral=72;
    public static final int HELP=44;
    public static final int NODE_EXIT=8;
    public static final int LIMIT=76;
    public static final int DEL=60;
    public static final int NODE_LIST=25;
    public static final int UPDATE=54;
    public static final int NODE_UPDATE_KEYSPACE=23;
    public static final int NODE_NEW_CF_ACCESS=31;
    public static final int AND=71;
    public static final int CONSISTENCYLEVEL=65;
    public static final int QUIT=49;
    public static final int NODE_TRUNCATE=26;
    public static final int NODE_SHOW_VERSION=12;
    public static final int NODE_NEW_KEYSPACE_ACCESS=32;
    public static final int TRUNCATE=63;
    public static final int COLUMN=55;
    public static final int PAIR=39;
    public static final int NODE_CONSISTENCY_LEVEL=28;
    public static final int WITH=69;
    public static final int HASH=38;
    public static final int SET=59;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int Digit=78;
    public static final int API_VERSION=52;
    public static final int NODE_ASSUME=27;
    public static final int CONVERT_TO_TYPE=33;
    public static final int NODE_THRIFT_GET=14;
    public static final int NODE_DEL_COLUMN_FAMILY=22;
    public static final int NODE_KEY_RANGE=41;
    public static final int KEYSPACE=47;
    public static final int StringLiteral=68;
    public static final int NODE_HELP=9;
    public static final int CONFIG=74;
    public static final int DROP=57;
    public static final int NODE_ADD_COLUMN_FAMILY=19;
    public static final int IntegerLiteral=66;
    public static final int NODE_COLUMN_ACCESS=29;

    // delegates
    // delegators


        public CliParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CliParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CliParser.tokenNames; }
    public String getGrammarFileName() { return "/home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g"; }


        public void reportError(RecognitionException e) 
        {
            String errorMessage;

            if (e instanceof NoViableAltException)
            {
                errorMessage = "Command not found: `" + this.input + "`. Type 'help' or '?' for help.";
            }
            else
            {
                errorMessage = "Syntax error at position " + e.charPositionInLine + ": " + this.getErrorMessage(e, this.getTokenNames());
            }

            throw new RuntimeException(errorMessage);
        }


    public static class root_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "root"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:136:1: root : statement ( SEMICOLON )? EOF -> statement ;
    public final CliParser.root_return root() throws RecognitionException {
        CliParser.root_return retval = new CliParser.root_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMICOLON2=null;
        Token EOF3=null;
        CliParser.statement_return statement1 = null;


        CommonTree SEMICOLON2_tree=null;
        CommonTree EOF3_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:136:5: ( statement ( SEMICOLON )? EOF -> statement )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:136:7: statement ( SEMICOLON )? EOF
            {
            pushFollow(FOLLOW_statement_in_root393);
            statement1=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement1.getTree());
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:136:17: ( SEMICOLON )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SEMICOLON) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:0:0: SEMICOLON
                    {
                    SEMICOLON2=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_root395); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON2);


                    }
                    break;

            }

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_root398); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF3);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 136:32: -> statement
            {
                adaptor.addChild(root_0, stream_statement.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "root"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:138:1: statement : ( connectStatement | exitStatement | countStatement | describeTable | describeCluster | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | delStatement | getStatement | helpStatement | setStatement | showStatement | listStatement | truncateStatement | assumeStatement | consistencyLevelStatement | -> ^( NODE_NO_OP ) );
    public final CliParser.statement_return statement() throws RecognitionException {
        CliParser.statement_return retval = new CliParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.connectStatement_return connectStatement4 = null;

        CliParser.exitStatement_return exitStatement5 = null;

        CliParser.countStatement_return countStatement6 = null;

        CliParser.describeTable_return describeTable7 = null;

        CliParser.describeCluster_return describeCluster8 = null;

        CliParser.addKeyspace_return addKeyspace9 = null;

        CliParser.addColumnFamily_return addColumnFamily10 = null;

        CliParser.updateKeyspace_return updateKeyspace11 = null;

        CliParser.updateColumnFamily_return updateColumnFamily12 = null;

        CliParser.delColumnFamily_return delColumnFamily13 = null;

        CliParser.delKeyspace_return delKeyspace14 = null;

        CliParser.useKeyspace_return useKeyspace15 = null;

        CliParser.delStatement_return delStatement16 = null;

        CliParser.getStatement_return getStatement17 = null;

        CliParser.helpStatement_return helpStatement18 = null;

        CliParser.setStatement_return setStatement19 = null;

        CliParser.showStatement_return showStatement20 = null;

        CliParser.listStatement_return listStatement21 = null;

        CliParser.truncateStatement_return truncateStatement22 = null;

        CliParser.assumeStatement_return assumeStatement23 = null;

        CliParser.consistencyLevelStatement_return consistencyLevelStatement24 = null;



        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:139:5: ( connectStatement | exitStatement | countStatement | describeTable | describeCluster | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | delStatement | getStatement | helpStatement | setStatement | showStatement | listStatement | truncateStatement | assumeStatement | consistencyLevelStatement | -> ^( NODE_NO_OP ) )
            int alt2=22;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:139:7: connectStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_connectStatement_in_statement414);
                    connectStatement4=connectStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, connectStatement4.getTree());

                    }
                    break;
                case 2 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:140:7: exitStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_exitStatement_in_statement422);
                    exitStatement5=exitStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exitStatement5.getTree());

                    }
                    break;
                case 3 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:141:7: countStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_countStatement_in_statement430);
                    countStatement6=countStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, countStatement6.getTree());

                    }
                    break;
                case 4 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:142:7: describeTable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_describeTable_in_statement438);
                    describeTable7=describeTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, describeTable7.getTree());

                    }
                    break;
                case 5 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:143:7: describeCluster
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_describeCluster_in_statement446);
                    describeCluster8=describeCluster();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, describeCluster8.getTree());

                    }
                    break;
                case 6 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:144:7: addKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_addKeyspace_in_statement454);
                    addKeyspace9=addKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addKeyspace9.getTree());

                    }
                    break;
                case 7 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:145:7: addColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_addColumnFamily_in_statement462);
                    addColumnFamily10=addColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addColumnFamily10.getTree());

                    }
                    break;
                case 8 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:146:7: updateKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_updateKeyspace_in_statement470);
                    updateKeyspace11=updateKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, updateKeyspace11.getTree());

                    }
                    break;
                case 9 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:147:7: updateColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_updateColumnFamily_in_statement478);
                    updateColumnFamily12=updateColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, updateColumnFamily12.getTree());

                    }
                    break;
                case 10 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:148:7: delColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delColumnFamily_in_statement486);
                    delColumnFamily13=delColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delColumnFamily13.getTree());

                    }
                    break;
                case 11 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:149:7: delKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delKeyspace_in_statement494);
                    delKeyspace14=delKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delKeyspace14.getTree());

                    }
                    break;
                case 12 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:150:7: useKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_useKeyspace_in_statement502);
                    useKeyspace15=useKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, useKeyspace15.getTree());

                    }
                    break;
                case 13 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:151:7: delStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delStatement_in_statement510);
                    delStatement16=delStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delStatement16.getTree());

                    }
                    break;
                case 14 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:152:7: getStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_getStatement_in_statement518);
                    getStatement17=getStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, getStatement17.getTree());

                    }
                    break;
                case 15 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:153:7: helpStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_helpStatement_in_statement526);
                    helpStatement18=helpStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, helpStatement18.getTree());

                    }
                    break;
                case 16 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:154:7: setStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_setStatement_in_statement534);
                    setStatement19=setStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setStatement19.getTree());

                    }
                    break;
                case 17 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:155:7: showStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showStatement_in_statement542);
                    showStatement20=showStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showStatement20.getTree());

                    }
                    break;
                case 18 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:156:7: listStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_listStatement_in_statement550);
                    listStatement21=listStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, listStatement21.getTree());

                    }
                    break;
                case 19 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:157:7: truncateStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_truncateStatement_in_statement558);
                    truncateStatement22=truncateStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, truncateStatement22.getTree());

                    }
                    break;
                case 20 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:158:7: assumeStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assumeStatement_in_statement566);
                    assumeStatement23=assumeStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assumeStatement23.getTree());

                    }
                    break;
                case 21 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:159:7: consistencyLevelStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_consistencyLevelStatement_in_statement574);
                    consistencyLevelStatement24=consistencyLevelStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, consistencyLevelStatement24.getTree());

                    }
                    break;
                case 22 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:160:7: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 160:7: -> ^( NODE_NO_OP )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:160:10: ^( NODE_NO_OP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_NO_OP, "NODE_NO_OP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class connectStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "connectStatement"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:163:1: connectStatement : ( CONNECT host '/' port ( username password )? -> ^( NODE_CONNECT host port ( username password )? ) | CONNECT ip_address '/' port ( username password )? -> ^( NODE_CONNECT ip_address port ( username password )? ) );
    public final CliParser.connectStatement_return connectStatement() throws RecognitionException {
        CliParser.connectStatement_return retval = new CliParser.connectStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONNECT25=null;
        Token char_literal27=null;
        Token CONNECT31=null;
        Token char_literal33=null;
        CliParser.host_return host26 = null;

        CliParser.port_return port28 = null;

        CliParser.username_return username29 = null;

        CliParser.password_return password30 = null;

        CliParser.ip_address_return ip_address32 = null;

        CliParser.port_return port34 = null;

        CliParser.username_return username35 = null;

        CliParser.password_return password36 = null;


        CommonTree CONNECT25_tree=null;
        CommonTree char_literal27_tree=null;
        CommonTree CONNECT31_tree=null;
        CommonTree char_literal33_tree=null;
        RewriteRuleTokenStream stream_CONNECT=new RewriteRuleTokenStream(adaptor,"token CONNECT");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleSubtreeStream stream_port=new RewriteRuleSubtreeStream(adaptor,"rule port");
        RewriteRuleSubtreeStream stream_ip_address=new RewriteRuleSubtreeStream(adaptor,"rule ip_address");
        RewriteRuleSubtreeStream stream_username=new RewriteRuleSubtreeStream(adaptor,"rule username");
        RewriteRuleSubtreeStream stream_host=new RewriteRuleSubtreeStream(adaptor,"rule host");
        RewriteRuleSubtreeStream stream_password=new RewriteRuleSubtreeStream(adaptor,"rule password");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:164:5: ( CONNECT host '/' port ( username password )? -> ^( NODE_CONNECT host port ( username password )? ) | CONNECT ip_address '/' port ( username password )? -> ^( NODE_CONNECT ip_address port ( username password )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CONNECT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==IP_ADDRESS) ) {
                    alt5=2;
                }
                else if ( (LA5_1==Identifier) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:164:7: CONNECT host '/' port ( username password )?
                    {
                    CONNECT25=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connectStatement603); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT25);

                    pushFollow(FOLLOW_host_in_connectStatement605);
                    host26=host();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_host.add(host26.getTree());
                    char_literal27=(Token)match(input,82,FOLLOW_82_in_connectStatement607); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_82.add(char_literal27);

                    pushFollow(FOLLOW_port_in_connectStatement609);
                    port28=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port28.getTree());
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:164:29: ( username password )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==Identifier) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:164:30: username password
                            {
                            pushFollow(FOLLOW_username_in_connectStatement612);
                            username29=username();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_username.add(username29.getTree());
                            pushFollow(FOLLOW_password_in_connectStatement614);
                            password30=password();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_password.add(password30.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: host, username, port, password
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 165:9: -> ^( NODE_CONNECT host port ( username password )? )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:165:12: ^( NODE_CONNECT host port ( username password )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"), root_1);

                        adaptor.addChild(root_1, stream_host.nextTree());
                        adaptor.addChild(root_1, stream_port.nextTree());
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:165:37: ( username password )?
                        if ( stream_username.hasNext()||stream_password.hasNext() ) {
                            adaptor.addChild(root_1, stream_username.nextTree());
                            adaptor.addChild(root_1, stream_password.nextTree());

                        }
                        stream_username.reset();
                        stream_password.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:166:7: CONNECT ip_address '/' port ( username password )?
                    {
                    CONNECT31=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connectStatement649); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT31);

                    pushFollow(FOLLOW_ip_address_in_connectStatement651);
                    ip_address32=ip_address();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ip_address.add(ip_address32.getTree());
                    char_literal33=(Token)match(input,82,FOLLOW_82_in_connectStatement653); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_82.add(char_literal33);

                    pushFollow(FOLLOW_port_in_connectStatement655);
                    port34=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port34.getTree());
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:166:35: ( username password )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==Identifier) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:166:36: username password
                            {
                            pushFollow(FOLLOW_username_in_connectStatement658);
                            username35=username();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_username.add(username35.getTree());
                            pushFollow(FOLLOW_password_in_connectStatement660);
                            password36=password();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_password.add(password36.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: password, ip_address, port, username
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 167:9: -> ^( NODE_CONNECT ip_address port ( username password )? )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:167:12: ^( NODE_CONNECT ip_address port ( username password )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"), root_1);

                        adaptor.addChild(root_1, stream_ip_address.nextTree());
                        adaptor.addChild(root_1, stream_port.nextTree());
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:167:43: ( username password )?
                        if ( stream_password.hasNext()||stream_username.hasNext() ) {
                            adaptor.addChild(root_1, stream_username.nextTree());
                            adaptor.addChild(root_1, stream_password.nextTree());

                        }
                        stream_password.reset();
                        stream_username.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "connectStatement"

    public static class helpStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "helpStatement"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:170:1: helpStatement : ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP DESCRIBE KEYSPACE -> ^( NODE_HELP NODE_DESCRIBE_TABLE ) | HELP DESCRIBE 'CLUSTER' -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW 'CLUSTER NAME' -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW API_VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP CONSISTENCYLEVEL -> ^( NODE_HELP NODE_CONSISTENCY_LEVEL ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) );
    public final CliParser.helpStatement_return helpStatement() throws RecognitionException {
        CliParser.helpStatement_return retval = new CliParser.helpStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token HELP37=null;
        Token HELP38=null;
        Token HELP39=null;
        Token CONNECT40=null;
        Token HELP41=null;
        Token USE42=null;
        Token HELP43=null;
        Token DESCRIBE44=null;
        Token KEYSPACE45=null;
        Token HELP46=null;
        Token DESCRIBE47=null;
        Token string_literal48=null;
        Token HELP49=null;
        Token EXIT50=null;
        Token HELP51=null;
        Token QUIT52=null;
        Token HELP53=null;
        Token SHOW54=null;
        Token string_literal55=null;
        Token HELP56=null;
        Token SHOW57=null;
        Token KEYSPACES58=null;
        Token HELP59=null;
        Token SHOW60=null;
        Token API_VERSION61=null;
        Token HELP62=null;
        Token CREATE63=null;
        Token KEYSPACE64=null;
        Token HELP65=null;
        Token UPDATE66=null;
        Token KEYSPACE67=null;
        Token HELP68=null;
        Token CREATE69=null;
        Token COLUMN70=null;
        Token FAMILY71=null;
        Token HELP72=null;
        Token UPDATE73=null;
        Token COLUMN74=null;
        Token FAMILY75=null;
        Token HELP76=null;
        Token DROP77=null;
        Token KEYSPACE78=null;
        Token HELP79=null;
        Token DROP80=null;
        Token COLUMN81=null;
        Token FAMILY82=null;
        Token HELP83=null;
        Token GET84=null;
        Token HELP85=null;
        Token SET86=null;
        Token HELP87=null;
        Token DEL88=null;
        Token HELP89=null;
        Token COUNT90=null;
        Token HELP91=null;
        Token LIST92=null;
        Token HELP93=null;
        Token TRUNCATE94=null;
        Token HELP95=null;
        Token ASSUME96=null;
        Token HELP97=null;
        Token CONSISTENCYLEVEL98=null;
        Token HELP99=null;
        Token char_literal100=null;

        CommonTree HELP37_tree=null;
        CommonTree HELP38_tree=null;
        CommonTree HELP39_tree=null;
        CommonTree CONNECT40_tree=null;
        CommonTree HELP41_tree=null;
        CommonTree USE42_tree=null;
        CommonTree HELP43_tree=null;
        CommonTree DESCRIBE44_tree=null;
        CommonTree KEYSPACE45_tree=null;
        CommonTree HELP46_tree=null;
        CommonTree DESCRIBE47_tree=null;
        CommonTree string_literal48_tree=null;
        CommonTree HELP49_tree=null;
        CommonTree EXIT50_tree=null;
        CommonTree HELP51_tree=null;
        CommonTree QUIT52_tree=null;
        CommonTree HELP53_tree=null;
        CommonTree SHOW54_tree=null;
        CommonTree string_literal55_tree=null;
        CommonTree HELP56_tree=null;
        CommonTree SHOW57_tree=null;
        CommonTree KEYSPACES58_tree=null;
        CommonTree HELP59_tree=null;
        CommonTree SHOW60_tree=null;
        CommonTree API_VERSION61_tree=null;
        CommonTree HELP62_tree=null;
        CommonTree CREATE63_tree=null;
        CommonTree KEYSPACE64_tree=null;
        CommonTree HELP65_tree=null;
        CommonTree UPDATE66_tree=null;
        CommonTree KEYSPACE67_tree=null;
        CommonTree HELP68_tree=null;
        CommonTree CREATE69_tree=null;
        CommonTree COLUMN70_tree=null;
        CommonTree FAMILY71_tree=null;
        CommonTree HELP72_tree=null;
        CommonTree UPDATE73_tree=null;
        CommonTree COLUMN74_tree=null;
        CommonTree FAMILY75_tree=null;
        CommonTree HELP76_tree=null;
        CommonTree DROP77_tree=null;
        CommonTree KEYSPACE78_tree=null;
        CommonTree HELP79_tree=null;
        CommonTree DROP80_tree=null;
        CommonTree COLUMN81_tree=null;
        CommonTree FAMILY82_tree=null;
        CommonTree HELP83_tree=null;
        CommonTree GET84_tree=null;
        CommonTree HELP85_tree=null;
        CommonTree SET86_tree=null;
        CommonTree HELP87_tree=null;
        CommonTree DEL88_tree=null;
        CommonTree HELP89_tree=null;
        CommonTree COUNT90_tree=null;
        CommonTree HELP91_tree=null;
        CommonTree LIST92_tree=null;
        CommonTree HELP93_tree=null;
        CommonTree TRUNCATE94_tree=null;
        CommonTree HELP95_tree=null;
        CommonTree ASSUME96_tree=null;
        CommonTree HELP97_tree=null;
        CommonTree CONSISTENCYLEVEL98_tree=null;
        CommonTree HELP99_tree=null;
        CommonTree char_literal100_tree=null;
        RewriteRuleTokenStream stream_EXIT=new RewriteRuleTokenStream(adaptor,"token EXIT");
        RewriteRuleTokenStream stream_HELP=new RewriteRuleTokenStream(adaptor,"token HELP");
        RewriteRuleTokenStream stream_DEL=new RewriteRuleTokenStream(adaptor,"token DEL");
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleTokenStream stream_KEYSPACES=new RewriteRuleTokenStream(adaptor,"token KEYSPACES");
        RewriteRuleTokenStream stream_API_VERSION=new RewriteRuleTokenStream(adaptor,"token API_VERSION");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_LIST=new RewriteRuleTokenStream(adaptor,"token LIST");
        RewriteRuleTokenStream stream_CONSISTENCYLEVEL=new RewriteRuleTokenStream(adaptor,"token CONSISTENCYLEVEL");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_QUIT=new RewriteRuleTokenStream(adaptor,"token QUIT");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_CONNECT=new RewriteRuleTokenStream(adaptor,"token CONNECT");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_ASSUME=new RewriteRuleTokenStream(adaptor,"token ASSUME");
        RewriteRuleTokenStream stream_TRUNCATE=new RewriteRuleTokenStream(adaptor,"token TRUNCATE");
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:171:5: ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP DESCRIBE KEYSPACE -> ^( NODE_HELP NODE_DESCRIBE_TABLE ) | HELP DESCRIBE 'CLUSTER' -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW 'CLUSTER NAME' -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW API_VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP CONSISTENCYLEVEL -> ^( NODE_HELP NODE_CONSISTENCY_LEVEL ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) )
            int alt6=26;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:171:7: HELP HELP
                    {
                    HELP37=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement704); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP37);

                    HELP38=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement706); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP38);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 172:9: -> ^( NODE_HELP NODE_HELP )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:172:12: ^( NODE_HELP NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:173:7: HELP CONNECT
                    {
                    HELP39=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP39);

                    CONNECT40=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_helpStatement733); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT40);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 174:9: -> ^( NODE_HELP NODE_CONNECT )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:174:12: ^( NODE_HELP NODE_CONNECT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:175:7: HELP USE
                    {
                    HELP41=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP41);

                    USE42=(Token)match(input,USE,FOLLOW_USE_in_helpStatement760); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USE.add(USE42);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 176:9: -> ^( NODE_HELP NODE_USE_TABLE )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:176:12: ^( NODE_HELP NODE_USE_TABLE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_USE_TABLE, "NODE_USE_TABLE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:177:7: HELP DESCRIBE KEYSPACE
                    {
                    HELP43=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement785); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP43);

                    DESCRIBE44=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_helpStatement787); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE44);

                    KEYSPACE45=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement789); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE45);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 178:9: -> ^( NODE_HELP NODE_DESCRIBE_TABLE )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:178:12: ^( NODE_HELP NODE_DESCRIBE_TABLE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DESCRIBE_TABLE, "NODE_DESCRIBE_TABLE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:179:7: HELP DESCRIBE 'CLUSTER'
                    {
                    HELP46=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement814); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP46);

                    DESCRIBE47=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_helpStatement816); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE47);

                    string_literal48=(Token)match(input,83,FOLLOW_83_in_helpStatement818); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_83.add(string_literal48);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 180:9: -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:180:12: ^( NODE_HELP NODE_DESCRIBE_CLUSTER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DESCRIBE_CLUSTER, "NODE_DESCRIBE_CLUSTER"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:181:7: HELP EXIT
                    {
                    HELP49=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement842); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP49);

                    EXIT50=(Token)match(input,EXIT,FOLLOW_EXIT_in_helpStatement844); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXIT.add(EXIT50);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 182:9: -> ^( NODE_HELP NODE_EXIT )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:182:12: ^( NODE_HELP NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:183:7: HELP QUIT
                    {
                    HELP51=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement869); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP51);

                    QUIT52=(Token)match(input,QUIT,FOLLOW_QUIT_in_helpStatement871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUIT.add(QUIT52);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 184:9: -> ^( NODE_HELP NODE_EXIT )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:184:12: ^( NODE_HELP NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:185:7: HELP SHOW 'CLUSTER NAME'
                    {
                    HELP53=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement896); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP53);

                    SHOW54=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement898); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW54);

                    string_literal55=(Token)match(input,84,FOLLOW_84_in_helpStatement900); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_84.add(string_literal55);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 186:9: -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:186:12: ^( NODE_HELP NODE_SHOW_CLUSTER_NAME )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_CLUSTER_NAME, "NODE_SHOW_CLUSTER_NAME"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:187:7: HELP SHOW KEYSPACES
                    {
                    HELP56=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement924); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP56);

                    SHOW57=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement926); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW57);

                    KEYSPACES58=(Token)match(input,KEYSPACES,FOLLOW_KEYSPACES_in_helpStatement928); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACES.add(KEYSPACES58);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 188:9: -> ^( NODE_HELP NODE_SHOW_KEYSPACES )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:188:12: ^( NODE_HELP NODE_SHOW_KEYSPACES )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_KEYSPACES, "NODE_SHOW_KEYSPACES"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:189:7: HELP SHOW API_VERSION
                    {
                    HELP59=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP59);

                    SHOW60=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW60);

                    API_VERSION61=(Token)match(input,API_VERSION,FOLLOW_API_VERSION_in_helpStatement957); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_API_VERSION.add(API_VERSION61);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 190:9: -> ^( NODE_HELP NODE_SHOW_VERSION )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:190:12: ^( NODE_HELP NODE_SHOW_VERSION )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_VERSION, "NODE_SHOW_VERSION"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:191:7: HELP CREATE KEYSPACE
                    {
                    HELP62=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement981); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP62);

                    CREATE63=(Token)match(input,CREATE,FOLLOW_CREATE_in_helpStatement983); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CREATE.add(CREATE63);

                    KEYSPACE64=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement985); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE64);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 192:9: -> ^( NODE_HELP NODE_ADD_KEYSPACE )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:192:12: ^( NODE_HELP NODE_ADD_KEYSPACE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_ADD_KEYSPACE, "NODE_ADD_KEYSPACE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:193:7: HELP UPDATE KEYSPACE
                    {
                    HELP65=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1010); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP65);

                    UPDATE66=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_helpStatement1012); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE66);

                    KEYSPACE67=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement1014); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE67);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 194:9: -> ^( NODE_HELP NODE_UPDATE_KEYSPACE )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:194:12: ^( NODE_HELP NODE_UPDATE_KEYSPACE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_UPDATE_KEYSPACE, "NODE_UPDATE_KEYSPACE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:195:7: HELP CREATE COLUMN FAMILY
                    {
                    HELP68=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1038); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP68);

                    CREATE69=(Token)match(input,CREATE,FOLLOW_CREATE_in_helpStatement1040); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CREATE.add(CREATE69);

                    COLUMN70=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement1042); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN70);

                    FAMILY71=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement1044); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY71);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 196:9: -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:196:12: ^( NODE_HELP NODE_ADD_COLUMN_FAMILY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_ADD_COLUMN_FAMILY, "NODE_ADD_COLUMN_FAMILY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:197:7: HELP UPDATE COLUMN FAMILY
                    {
                    HELP72=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1069); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP72);

                    UPDATE73=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_helpStatement1071); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE73);

                    COLUMN74=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement1073); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN74);

                    FAMILY75=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement1075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY75);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 198:9: -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:198:12: ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_UPDATE_COLUMN_FAMILY, "NODE_UPDATE_COLUMN_FAMILY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:199:7: HELP DROP KEYSPACE
                    {
                    HELP76=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1099); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP76);

                    DROP77=(Token)match(input,DROP,FOLLOW_DROP_in_helpStatement1101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DROP.add(DROP77);

                    KEYSPACE78=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement1103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE78);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 200:9: -> ^( NODE_HELP NODE_DEL_KEYSPACE )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:200:12: ^( NODE_HELP NODE_DEL_KEYSPACE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DEL_KEYSPACE, "NODE_DEL_KEYSPACE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:201:7: HELP DROP COLUMN FAMILY
                    {
                    HELP79=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP79);

                    DROP80=(Token)match(input,DROP,FOLLOW_DROP_in_helpStatement1130); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DROP.add(DROP80);

                    COLUMN81=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement1132); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN81);

                    FAMILY82=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement1134); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY82);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 202:9: -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:202:12: ^( NODE_HELP NODE_DEL_COLUMN_FAMILY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DEL_COLUMN_FAMILY, "NODE_DEL_COLUMN_FAMILY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:203:7: HELP GET
                    {
                    HELP83=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP83);

                    GET84=(Token)match(input,GET,FOLLOW_GET_in_helpStatement1161); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET84);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 204:9: -> ^( NODE_HELP NODE_THRIFT_GET )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:204:12: ^( NODE_HELP NODE_THRIFT_GET )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_GET, "NODE_THRIFT_GET"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:205:7: HELP SET
                    {
                    HELP85=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1186); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP85);

                    SET86=(Token)match(input,SET,FOLLOW_SET_in_helpStatement1188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SET.add(SET86);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 206:9: -> ^( NODE_HELP NODE_THRIFT_SET )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:206:12: ^( NODE_HELP NODE_THRIFT_SET )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_SET, "NODE_THRIFT_SET"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:207:7: HELP DEL
                    {
                    HELP87=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP87);

                    DEL88=(Token)match(input,DEL,FOLLOW_DEL_in_helpStatement1215); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEL.add(DEL88);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 208:9: -> ^( NODE_HELP NODE_THRIFT_DEL )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:208:12: ^( NODE_HELP NODE_THRIFT_DEL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_DEL, "NODE_THRIFT_DEL"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:209:7: HELP COUNT
                    {
                    HELP89=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1240); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP89);

                    COUNT90=(Token)match(input,COUNT,FOLLOW_COUNT_in_helpStatement1242); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COUNT.add(COUNT90);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 210:9: -> ^( NODE_HELP NODE_THRIFT_COUNT )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:210:12: ^( NODE_HELP NODE_THRIFT_COUNT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_COUNT, "NODE_THRIFT_COUNT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:211:7: HELP LIST
                    {
                    HELP91=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1267); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP91);

                    LIST92=(Token)match(input,LIST,FOLLOW_LIST_in_helpStatement1269); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIST.add(LIST92);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 212:9: -> ^( NODE_HELP NODE_LIST )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:212:12: ^( NODE_HELP NODE_LIST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_LIST, "NODE_LIST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:213:7: HELP TRUNCATE
                    {
                    HELP93=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1294); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP93);

                    TRUNCATE94=(Token)match(input,TRUNCATE,FOLLOW_TRUNCATE_in_helpStatement1296); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUNCATE.add(TRUNCATE94);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 214:9: -> ^( NODE_HELP NODE_TRUNCATE )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:214:12: ^( NODE_HELP NODE_TRUNCATE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_TRUNCATE, "NODE_TRUNCATE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:215:7: HELP ASSUME
                    {
                    HELP95=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1320); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP95);

                    ASSUME96=(Token)match(input,ASSUME,FOLLOW_ASSUME_in_helpStatement1322); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSUME.add(ASSUME96);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 216:9: -> ^( NODE_HELP NODE_ASSUME )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:216:12: ^( NODE_HELP NODE_ASSUME )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_ASSUME, "NODE_ASSUME"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:217:7: HELP CONSISTENCYLEVEL
                    {
                    HELP97=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1346); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP97);

                    CONSISTENCYLEVEL98=(Token)match(input,CONSISTENCYLEVEL,FOLLOW_CONSISTENCYLEVEL_in_helpStatement1348); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONSISTENCYLEVEL.add(CONSISTENCYLEVEL98);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 218:9: -> ^( NODE_HELP NODE_CONSISTENCY_LEVEL )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:218:12: ^( NODE_HELP NODE_CONSISTENCY_LEVEL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_CONSISTENCY_LEVEL, "NODE_CONSISTENCY_LEVEL"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:219:7: HELP
                    {
                    HELP99=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1372); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP99);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 220:9: -> ^( NODE_HELP )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:220:12: ^( NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:221:7: '?'
                    {
                    char_literal100=(Token)match(input,85,FOLLOW_85_in_helpStatement1395); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_85.add(char_literal100);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 222:9: -> ^( NODE_HELP )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:222:12: ^( NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "helpStatement"

    public static class exitStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exitStatement"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:225:1: exitStatement : ( QUIT -> ^( NODE_EXIT ) | EXIT -> ^( NODE_EXIT ) );
    public final CliParser.exitStatement_return exitStatement() throws RecognitionException {
        CliParser.exitStatement_return retval = new CliParser.exitStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUIT101=null;
        Token EXIT102=null;

        CommonTree QUIT101_tree=null;
        CommonTree EXIT102_tree=null;
        RewriteRuleTokenStream stream_EXIT=new RewriteRuleTokenStream(adaptor,"token EXIT");
        RewriteRuleTokenStream stream_QUIT=new RewriteRuleTokenStream(adaptor,"token QUIT");

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:226:5: ( QUIT -> ^( NODE_EXIT ) | EXIT -> ^( NODE_EXIT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==QUIT) ) {
                alt7=1;
            }
            else if ( (LA7_0==EXIT) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:226:7: QUIT
                    {
                    QUIT101=(Token)match(input,QUIT,FOLLOW_QUIT_in_exitStatement1430); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUIT.add(QUIT101);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 226:12: -> ^( NODE_EXIT )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:226:15: ^( NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:227:7: EXIT
                    {
                    EXIT102=(Token)match(input,EXIT,FOLLOW_EXIT_in_exitStatement1444); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXIT.add(EXIT102);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 227:12: -> ^( NODE_EXIT )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:227:15: ^( NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exitStatement"

    public static class getStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getStatement"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:230:1: getStatement : ( GET columnFamilyExpr ( 'AS' typeIdentifier )? -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ) | GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerLiteral )* -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )* ) );
    public final CliParser.getStatement_return getStatement() throws RecognitionException {
        CliParser.getStatement_return retval = new CliParser.getStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token limit=null;
        Token GET103=null;
        Token string_literal105=null;
        Token GET107=null;
        Token string_literal109=null;
        Token string_literal111=null;
        Token string_literal113=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr104 = null;

        CliParser.typeIdentifier_return typeIdentifier106 = null;

        CliParser.columnFamily_return columnFamily108 = null;

        CliParser.getCondition_return getCondition110 = null;

        CliParser.getCondition_return getCondition112 = null;


        CommonTree limit_tree=null;
        CommonTree GET103_tree=null;
        CommonTree string_literal105_tree=null;
        CommonTree GET107_tree=null;
        CommonTree string_literal109_tree=null;
        CommonTree string_literal111_tree=null;
        CommonTree string_literal113_tree=null;
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_IntegerLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerLiteral");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_typeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule typeIdentifier");
        RewriteRuleSubtreeStream stream_getCondition=new RewriteRuleSubtreeStream(adaptor,"rule getCondition");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:231:5: ( GET columnFamilyExpr ( 'AS' typeIdentifier )? -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ) | GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerLiteral )* -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )* ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==GET) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==Identifier) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==93) ) {
                        alt11=1;
                    }
                    else if ( (LA11_2==87) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:231:7: GET columnFamilyExpr ( 'AS' typeIdentifier )?
                    {
                    GET103=(Token)match(input,GET,FOLLOW_GET_in_getStatement1467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET103);

                    pushFollow(FOLLOW_columnFamilyExpr_in_getStatement1469);
                    columnFamilyExpr104=columnFamilyExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr104.getTree());
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:231:28: ( 'AS' typeIdentifier )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==86) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:231:29: 'AS' typeIdentifier
                            {
                            string_literal105=(Token)match(input,86,FOLLOW_86_in_getStatement1472); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_86.add(string_literal105);

                            pushFollow(FOLLOW_typeIdentifier_in_getStatement1474);
                            typeIdentifier106=typeIdentifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeIdentifier.add(typeIdentifier106.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: typeIdentifier, columnFamilyExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 232:9: -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:232:12: ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_GET, "NODE_THRIFT_GET"), root_1);

                        adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:232:47: ( ^( CONVERT_TO_TYPE typeIdentifier ) )?
                        if ( stream_typeIdentifier.hasNext() ) {
                            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:232:49: ^( CONVERT_TO_TYPE typeIdentifier )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONVERT_TO_TYPE, "CONVERT_TO_TYPE"), root_2);

                            adaptor.addChild(root_2, stream_typeIdentifier.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_typeIdentifier.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:233:7: GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerLiteral )*
                    {
                    GET107=(Token)match(input,GET,FOLLOW_GET_in_getStatement1512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET107);

                    pushFollow(FOLLOW_columnFamily_in_getStatement1514);
                    columnFamily108=columnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily108.getTree());
                    string_literal109=(Token)match(input,87,FOLLOW_87_in_getStatement1516); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_87.add(string_literal109);

                    pushFollow(FOLLOW_getCondition_in_getStatement1518);
                    getCondition110=getCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_getCondition.add(getCondition110.getTree());
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:233:45: ( 'AND' getCondition )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==AND) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:233:46: 'AND' getCondition
                    	    {
                    	    string_literal111=(Token)match(input,AND,FOLLOW_AND_in_getStatement1521); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_AND.add(string_literal111);

                    	    pushFollow(FOLLOW_getCondition_in_getStatement1523);
                    	    getCondition112=getCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_getCondition.add(getCondition112.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:233:67: ( 'LIMIT' limit= IntegerLiteral )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==LIMIT) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:233:68: 'LIMIT' limit= IntegerLiteral
                    	    {
                    	    string_literal113=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_getStatement1528); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LIMIT.add(string_literal113);

                    	    limit=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_getStatement1532); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_IntegerLiteral.add(limit);


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: columnFamily, limit, getCondition
                    // token labels: limit
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 234:9: -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )* )
                    {
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:234:12: ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_GET_WITH_CONDITIONS, "NODE_THRIFT_GET_WITH_CONDITIONS"), root_1);

                        adaptor.addChild(root_1, stream_columnFamily.nextTree());
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:234:59: ^( CONDITIONS ( getCondition )+ )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITIONS, "CONDITIONS"), root_2);

                        if ( !(stream_getCondition.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_getCondition.hasNext() ) {
                            adaptor.addChild(root_2, stream_getCondition.nextTree());

                        }
                        stream_getCondition.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:234:87: ( ^( NODE_LIMIT $limit) )*
                        while ( stream_limit.hasNext() ) {
                            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:234:87: ^( NODE_LIMIT $limit)
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIMIT, "NODE_LIMIT"), root_2);

                            adaptor.addChild(root_2, stream_limit.nextNode());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_limit.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "getStatement"

    public static class getCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getCondition"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:237:1: getCondition : columnOrSuperColumn operator value -> ^( CONDITION operator columnOrSuperColumn value ) ;
    public final CliParser.getCondition_return getCondition() throws RecognitionException {
        CliParser.getCondition_return retval = new CliParser.getCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.columnOrSuperColumn_return columnOrSuperColumn114 = null;

        CliParser.operator_return operator115 = null;

        CliParser.value_return value116 = null;


        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_columnOrSuperColumn=new RewriteRuleSubtreeStream(adaptor,"rule columnOrSuperColumn");
        RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:238:5: ( columnOrSuperColumn operator value -> ^( CONDITION operator columnOrSuperColumn value ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:238:7: columnOrSuperColumn operator value
            {
            pushFollow(FOLLOW_columnOrSuperColumn_in_getCondition1583);
            columnOrSuperColumn114=columnOrSuperColumn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(columnOrSuperColumn114.getTree());
            pushFollow(FOLLOW_operator_in_getCondition1585);
            operator115=operator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_operator.add(operator115.getTree());
            pushFollow(FOLLOW_value_in_getCondition1587);
            value116=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value116.getTree());


            // AST REWRITE
            // elements: value, columnOrSuperColumn, operator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 239:9: -> ^( CONDITION operator columnOrSuperColumn value )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:239:12: ^( CONDITION operator columnOrSuperColumn value )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_1);

                adaptor.addChild(root_1, stream_operator.nextTree());
                adaptor.addChild(root_1, stream_columnOrSuperColumn.nextTree());
                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "getCondition"

    public static class operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:242:1: operator : ( '=' | '>' | '<' | '>=' | '<=' );
    public final CliParser.operator_return operator() throws RecognitionException {
        CliParser.operator_return retval = new CliParser.operator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set117=null;

        CommonTree set117_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:243:5: ( '=' | '>' | '<' | '>=' | '<=' )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set117=(Token)input.LT(1);
            if ( (input.LA(1)>=88 && input.LA(1)<=92) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set117));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operator"

    public static class typeIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeIdentifier"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:246:1: typeIdentifier : ( Identifier | StringLiteral | IntegerLiteral );
    public final CliParser.typeIdentifier_return typeIdentifier() throws RecognitionException {
        CliParser.typeIdentifier_return retval = new CliParser.typeIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set118=null;

        CommonTree set118_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:247:5: ( Identifier | StringLiteral | IntegerLiteral )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set118=(Token)input.LT(1);
            if ( (input.LA(1)>=IntegerLiteral && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set118));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeIdentifier"

    public static class setStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setStatement"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:250:1: setStatement : SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= value )? -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? ) ;
    public final CliParser.setStatement_return setStatement() throws RecognitionException {
        CliParser.setStatement_return retval = new CliParser.setStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SET119=null;
        Token char_literal121=null;
        Token WITH122=null;
        Token TTL123=null;
        Token char_literal124=null;
        CliParser.value_return objectValue = null;

        CliParser.value_return ttlValue = null;

        CliParser.columnFamilyExpr_return columnFamilyExpr120 = null;


        CommonTree SET119_tree=null;
        CommonTree char_literal121_tree=null;
        CommonTree WITH122_tree=null;
        CommonTree TTL123_tree=null;
        CommonTree char_literal124_tree=null;
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleTokenStream stream_TTL=new RewriteRuleTokenStream(adaptor,"token TTL");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:251:5: ( SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= value )? -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:251:7: SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= value )?
            {
            SET119=(Token)match(input,SET,FOLLOW_SET_in_setStatement1683); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SET.add(SET119);

            pushFollow(FOLLOW_columnFamilyExpr_in_setStatement1685);
            columnFamilyExpr120=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr120.getTree());
            char_literal121=(Token)match(input,88,FOLLOW_88_in_setStatement1687); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_88.add(char_literal121);

            pushFollow(FOLLOW_value_in_setStatement1691);
            objectValue=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(objectValue.getTree());
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:251:50: ( WITH TTL '=' ttlValue= value )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==WITH) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:251:51: WITH TTL '=' ttlValue= value
                    {
                    WITH122=(Token)match(input,WITH,FOLLOW_WITH_in_setStatement1694); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WITH.add(WITH122);

                    TTL123=(Token)match(input,TTL,FOLLOW_TTL_in_setStatement1696); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TTL.add(TTL123);

                    char_literal124=(Token)match(input,88,FOLLOW_88_in_setStatement1698); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_88.add(char_literal124);

                    pushFollow(FOLLOW_value_in_setStatement1702);
                    ttlValue=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(ttlValue.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: objectValue, columnFamilyExpr, ttlValue
            // token labels: 
            // rule labels: retval, ttlValue, objectValue
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ttlValue=new RewriteRuleSubtreeStream(adaptor,"rule ttlValue",ttlValue!=null?ttlValue.tree:null);
            RewriteRuleSubtreeStream stream_objectValue=new RewriteRuleSubtreeStream(adaptor,"rule objectValue",objectValue!=null?objectValue.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 252:9: -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:252:12: ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_SET, "NODE_THRIFT_SET"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                adaptor.addChild(root_1, stream_objectValue.nextTree());
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:252:60: ( $ttlValue)?
                if ( stream_ttlValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_ttlValue.nextTree());

                }
                stream_ttlValue.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "setStatement"

    public static class countStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "countStatement"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:255:1: countStatement : COUNT columnFamilyExpr -> ^( NODE_THRIFT_COUNT columnFamilyExpr ) ;
    public final CliParser.countStatement_return countStatement() throws RecognitionException {
        CliParser.countStatement_return retval = new CliParser.countStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COUNT125=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr126 = null;


        CommonTree COUNT125_tree=null;
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:256:5: ( COUNT columnFamilyExpr -> ^( NODE_THRIFT_COUNT columnFamilyExpr ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:256:7: COUNT columnFamilyExpr
            {
            COUNT125=(Token)match(input,COUNT,FOLLOW_COUNT_in_countStatement1748); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COUNT.add(COUNT125);

            pushFollow(FOLLOW_columnFamilyExpr_in_countStatement1750);
            columnFamilyExpr126=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr126.getTree());


            // AST REWRITE
            // elements: columnFamilyExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 257:9: -> ^( NODE_THRIFT_COUNT columnFamilyExpr )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:257:12: ^( NODE_THRIFT_COUNT columnFamilyExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_COUNT, "NODE_THRIFT_COUNT"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "countStatement"

    public static class delStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delStatement"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:260:1: delStatement : DEL columnFamilyExpr -> ^( NODE_THRIFT_DEL columnFamilyExpr ) ;
    public final CliParser.delStatement_return delStatement() throws RecognitionException {
        CliParser.delStatement_return retval = new CliParser.delStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEL127=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr128 = null;


        CommonTree DEL127_tree=null;
        RewriteRuleTokenStream stream_DEL=new RewriteRuleTokenStream(adaptor,"token DEL");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:261:5: ( DEL columnFamilyExpr -> ^( NODE_THRIFT_DEL columnFamilyExpr ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:261:7: DEL columnFamilyExpr
            {
            DEL127=(Token)match(input,DEL,FOLLOW_DEL_in_delStatement1784); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEL.add(DEL127);

            pushFollow(FOLLOW_columnFamilyExpr_in_delStatement1786);
            columnFamilyExpr128=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr128.getTree());


            // AST REWRITE
            // elements: columnFamilyExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 262:9: -> ^( NODE_THRIFT_DEL columnFamilyExpr )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:262:12: ^( NODE_THRIFT_DEL columnFamilyExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_DEL, "NODE_THRIFT_DEL"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delStatement"

    public static class showStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showStatement"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:265:1: showStatement : ( showClusterName | showVersion | showKeyspaces );
    public final CliParser.showStatement_return showStatement() throws RecognitionException {
        CliParser.showStatement_return retval = new CliParser.showStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.showClusterName_return showClusterName129 = null;

        CliParser.showVersion_return showVersion130 = null;

        CliParser.showKeyspaces_return showKeyspaces131 = null;



        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:266:5: ( showClusterName | showVersion | showKeyspaces )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==SHOW) ) {
                switch ( input.LA(2) ) {
                case 84:
                    {
                    alt13=1;
                    }
                    break;
                case API_VERSION:
                    {
                    alt13=2;
                    }
                    break;
                case KEYSPACES:
                    {
                    alt13=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:266:7: showClusterName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showClusterName_in_showStatement1820);
                    showClusterName129=showClusterName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showClusterName129.getTree());

                    }
                    break;
                case 2 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:267:7: showVersion
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showVersion_in_showStatement1828);
                    showVersion130=showVersion();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showVersion130.getTree());

                    }
                    break;
                case 3 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:268:7: showKeyspaces
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showKeyspaces_in_showStatement1836);
                    showKeyspaces131=showKeyspaces();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showKeyspaces131.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showStatement"

    public static class listStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listStatement"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:271:1: listStatement : LIST columnFamily ( keyRangeExpr )? ( 'LIMIT' limit= IntegerLiteral )? -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( ^( NODE_LIMIT $limit) )? ) ;
    public final CliParser.listStatement_return listStatement() throws RecognitionException {
        CliParser.listStatement_return retval = new CliParser.listStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token limit=null;
        Token LIST132=null;
        Token string_literal135=null;
        CliParser.columnFamily_return columnFamily133 = null;

        CliParser.keyRangeExpr_return keyRangeExpr134 = null;


        CommonTree limit_tree=null;
        CommonTree LIST132_tree=null;
        CommonTree string_literal135_tree=null;
        RewriteRuleTokenStream stream_IntegerLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerLiteral");
        RewriteRuleTokenStream stream_LIST=new RewriteRuleTokenStream(adaptor,"token LIST");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_keyRangeExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyRangeExpr");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:272:5: ( LIST columnFamily ( keyRangeExpr )? ( 'LIMIT' limit= IntegerLiteral )? -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( ^( NODE_LIMIT $limit) )? ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:272:7: LIST columnFamily ( keyRangeExpr )? ( 'LIMIT' limit= IntegerLiteral )?
            {
            LIST132=(Token)match(input,LIST,FOLLOW_LIST_in_listStatement1853); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LIST.add(LIST132);

            pushFollow(FOLLOW_columnFamily_in_listStatement1855);
            columnFamily133=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily133.getTree());
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:272:25: ( keyRangeExpr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==93) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:0:0: keyRangeExpr
                    {
                    pushFollow(FOLLOW_keyRangeExpr_in_listStatement1857);
                    keyRangeExpr134=keyRangeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keyRangeExpr.add(keyRangeExpr134.getTree());

                    }
                    break;

            }

            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:272:39: ( 'LIMIT' limit= IntegerLiteral )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LIMIT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:272:40: 'LIMIT' limit= IntegerLiteral
                    {
                    string_literal135=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_listStatement1861); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIMIT.add(string_literal135);

                    limit=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_listStatement1865); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IntegerLiteral.add(limit);


                    }
                    break;

            }



            // AST REWRITE
            // elements: keyRangeExpr, columnFamily, limit
            // token labels: limit
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 273:9: -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( ^( NODE_LIMIT $limit) )? )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:273:12: ^( NODE_LIST columnFamily ( keyRangeExpr )? ( ^( NODE_LIMIT $limit) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIST, "NODE_LIST"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:273:37: ( keyRangeExpr )?
                if ( stream_keyRangeExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyRangeExpr.nextTree());

                }
                stream_keyRangeExpr.reset();
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:273:51: ( ^( NODE_LIMIT $limit) )?
                if ( stream_limit.hasNext() ) {
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:273:51: ^( NODE_LIMIT $limit)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIMIT, "NODE_LIMIT"), root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_limit.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listStatement"

    public static class truncateStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "truncateStatement"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:276:1: truncateStatement : TRUNCATE columnFamily -> ^( NODE_TRUNCATE columnFamily ) ;
    public final CliParser.truncateStatement_return truncateStatement() throws RecognitionException {
        CliParser.truncateStatement_return retval = new CliParser.truncateStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TRUNCATE136=null;
        CliParser.columnFamily_return columnFamily137 = null;


        CommonTree TRUNCATE136_tree=null;
        RewriteRuleTokenStream stream_TRUNCATE=new RewriteRuleTokenStream(adaptor,"token TRUNCATE");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:277:5: ( TRUNCATE columnFamily -> ^( NODE_TRUNCATE columnFamily ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:277:7: TRUNCATE columnFamily
            {
            TRUNCATE136=(Token)match(input,TRUNCATE,FOLLOW_TRUNCATE_in_truncateStatement1911); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRUNCATE.add(TRUNCATE136);

            pushFollow(FOLLOW_columnFamily_in_truncateStatement1913);
            columnFamily137=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily137.getTree());


            // AST REWRITE
            // elements: columnFamily
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 278:9: -> ^( NODE_TRUNCATE columnFamily )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:278:12: ^( NODE_TRUNCATE columnFamily )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_TRUNCATE, "NODE_TRUNCATE"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "truncateStatement"

    public static class assumeStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assumeStatement"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:281:1: assumeStatement : ASSUME columnFamily assumptionElement= Identifier 'AS' defaultType= Identifier -> ^( NODE_ASSUME columnFamily $assumptionElement $defaultType) ;
    public final CliParser.assumeStatement_return assumeStatement() throws RecognitionException {
        CliParser.assumeStatement_return retval = new CliParser.assumeStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token assumptionElement=null;
        Token defaultType=null;
        Token ASSUME138=null;
        Token string_literal140=null;
        CliParser.columnFamily_return columnFamily139 = null;


        CommonTree assumptionElement_tree=null;
        CommonTree defaultType_tree=null;
        CommonTree ASSUME138_tree=null;
        CommonTree string_literal140_tree=null;
        RewriteRuleTokenStream stream_ASSUME=new RewriteRuleTokenStream(adaptor,"token ASSUME");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:282:5: ( ASSUME columnFamily assumptionElement= Identifier 'AS' defaultType= Identifier -> ^( NODE_ASSUME columnFamily $assumptionElement $defaultType) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:282:7: ASSUME columnFamily assumptionElement= Identifier 'AS' defaultType= Identifier
            {
            ASSUME138=(Token)match(input,ASSUME,FOLLOW_ASSUME_in_assumeStatement1946); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSUME.add(ASSUME138);

            pushFollow(FOLLOW_columnFamily_in_assumeStatement1948);
            columnFamily139=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily139.getTree());
            assumptionElement=(Token)match(input,Identifier,FOLLOW_Identifier_in_assumeStatement1952); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(assumptionElement);

            string_literal140=(Token)match(input,86,FOLLOW_86_in_assumeStatement1954); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_86.add(string_literal140);

            defaultType=(Token)match(input,Identifier,FOLLOW_Identifier_in_assumeStatement1958); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(defaultType);



            // AST REWRITE
            // elements: columnFamily, defaultType, assumptionElement
            // token labels: defaultType, assumptionElement
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_defaultType=new RewriteRuleTokenStream(adaptor,"token defaultType",defaultType);
            RewriteRuleTokenStream stream_assumptionElement=new RewriteRuleTokenStream(adaptor,"token assumptionElement",assumptionElement);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 283:9: -> ^( NODE_ASSUME columnFamily $assumptionElement $defaultType)
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:283:12: ^( NODE_ASSUME columnFamily $assumptionElement $defaultType)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ASSUME, "NODE_ASSUME"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                adaptor.addChild(root_1, stream_assumptionElement.nextNode());
                adaptor.addChild(root_1, stream_defaultType.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assumeStatement"

    public static class consistencyLevelStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "consistencyLevelStatement"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:286:1: consistencyLevelStatement : CONSISTENCYLEVEL 'AS' defaultType= Identifier -> ^( NODE_CONSISTENCY_LEVEL $defaultType) ;
    public final CliParser.consistencyLevelStatement_return consistencyLevelStatement() throws RecognitionException {
        CliParser.consistencyLevelStatement_return retval = new CliParser.consistencyLevelStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token defaultType=null;
        Token CONSISTENCYLEVEL141=null;
        Token string_literal142=null;

        CommonTree defaultType_tree=null;
        CommonTree CONSISTENCYLEVEL141_tree=null;
        CommonTree string_literal142_tree=null;
        RewriteRuleTokenStream stream_CONSISTENCYLEVEL=new RewriteRuleTokenStream(adaptor,"token CONSISTENCYLEVEL");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:287:5: ( CONSISTENCYLEVEL 'AS' defaultType= Identifier -> ^( NODE_CONSISTENCY_LEVEL $defaultType) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:287:7: CONSISTENCYLEVEL 'AS' defaultType= Identifier
            {
            CONSISTENCYLEVEL141=(Token)match(input,CONSISTENCYLEVEL,FOLLOW_CONSISTENCYLEVEL_in_consistencyLevelStatement1997); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSISTENCYLEVEL.add(CONSISTENCYLEVEL141);

            string_literal142=(Token)match(input,86,FOLLOW_86_in_consistencyLevelStatement1999); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_86.add(string_literal142);

            defaultType=(Token)match(input,Identifier,FOLLOW_Identifier_in_consistencyLevelStatement2003); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(defaultType);



            // AST REWRITE
            // elements: defaultType
            // token labels: defaultType
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_defaultType=new RewriteRuleTokenStream(adaptor,"token defaultType",defaultType);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 288:9: -> ^( NODE_CONSISTENCY_LEVEL $defaultType)
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:288:12: ^( NODE_CONSISTENCY_LEVEL $defaultType)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONSISTENCY_LEVEL, "NODE_CONSISTENCY_LEVEL"), root_1);

                adaptor.addChild(root_1, stream_defaultType.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "consistencyLevelStatement"

    public static class showClusterName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showClusterName"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:291:1: showClusterName : SHOW 'CLUSTER NAME' -> ^( NODE_SHOW_CLUSTER_NAME ) ;
    public final CliParser.showClusterName_return showClusterName() throws RecognitionException {
        CliParser.showClusterName_return retval = new CliParser.showClusterName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW143=null;
        Token string_literal144=null;

        CommonTree SHOW143_tree=null;
        CommonTree string_literal144_tree=null;
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:292:5: ( SHOW 'CLUSTER NAME' -> ^( NODE_SHOW_CLUSTER_NAME ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:292:7: SHOW 'CLUSTER NAME'
            {
            SHOW143=(Token)match(input,SHOW,FOLLOW_SHOW_in_showClusterName2037); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW143);

            string_literal144=(Token)match(input,84,FOLLOW_84_in_showClusterName2039); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_84.add(string_literal144);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 293:9: -> ^( NODE_SHOW_CLUSTER_NAME )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:293:12: ^( NODE_SHOW_CLUSTER_NAME )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_CLUSTER_NAME, "NODE_SHOW_CLUSTER_NAME"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showClusterName"

    public static class addKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addKeyspace"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:296:1: addKeyspace : CREATE KEYSPACE keyValuePairExpr -> ^( NODE_ADD_KEYSPACE keyValuePairExpr ) ;
    public final CliParser.addKeyspace_return addKeyspace() throws RecognitionException {
        CliParser.addKeyspace_return retval = new CliParser.addKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE145=null;
        Token KEYSPACE146=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr147 = null;


        CommonTree CREATE145_tree=null;
        CommonTree KEYSPACE146_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:297:5: ( CREATE KEYSPACE keyValuePairExpr -> ^( NODE_ADD_KEYSPACE keyValuePairExpr ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:297:7: CREATE KEYSPACE keyValuePairExpr
            {
            CREATE145=(Token)match(input,CREATE,FOLLOW_CREATE_in_addKeyspace2070); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE145);

            KEYSPACE146=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_addKeyspace2072); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE146);

            pushFollow(FOLLOW_keyValuePairExpr_in_addKeyspace2074);
            keyValuePairExpr147=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr147.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 298:9: -> ^( NODE_ADD_KEYSPACE keyValuePairExpr )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:298:12: ^( NODE_ADD_KEYSPACE keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ADD_KEYSPACE, "NODE_ADD_KEYSPACE"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addKeyspace"

    public static class addColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addColumnFamily"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:301:1: addColumnFamily : CREATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr ) ;
    public final CliParser.addColumnFamily_return addColumnFamily() throws RecognitionException {
        CliParser.addColumnFamily_return retval = new CliParser.addColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE148=null;
        Token COLUMN149=null;
        Token FAMILY150=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr151 = null;


        CommonTree CREATE148_tree=null;
        CommonTree COLUMN149_tree=null;
        CommonTree FAMILY150_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:302:5: ( CREATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:302:7: CREATE COLUMN FAMILY keyValuePairExpr
            {
            CREATE148=(Token)match(input,CREATE,FOLLOW_CREATE_in_addColumnFamily2108); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE148);

            COLUMN149=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_addColumnFamily2110); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN149);

            FAMILY150=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_addColumnFamily2112); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY150);

            pushFollow(FOLLOW_keyValuePairExpr_in_addColumnFamily2114);
            keyValuePairExpr151=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr151.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 303:9: -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:303:12: ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ADD_COLUMN_FAMILY, "NODE_ADD_COLUMN_FAMILY"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addColumnFamily"

    public static class updateKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "updateKeyspace"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:306:1: updateKeyspace : UPDATE KEYSPACE keyValuePairExpr -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr ) ;
    public final CliParser.updateKeyspace_return updateKeyspace() throws RecognitionException {
        CliParser.updateKeyspace_return retval = new CliParser.updateKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UPDATE152=null;
        Token KEYSPACE153=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr154 = null;


        CommonTree UPDATE152_tree=null;
        CommonTree KEYSPACE153_tree=null;
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:307:5: ( UPDATE KEYSPACE keyValuePairExpr -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:307:7: UPDATE KEYSPACE keyValuePairExpr
            {
            UPDATE152=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_updateKeyspace2148); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE152);

            KEYSPACE153=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_updateKeyspace2150); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE153);

            pushFollow(FOLLOW_keyValuePairExpr_in_updateKeyspace2152);
            keyValuePairExpr154=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr154.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 308:9: -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:308:12: ^( NODE_UPDATE_KEYSPACE keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_UPDATE_KEYSPACE, "NODE_UPDATE_KEYSPACE"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "updateKeyspace"

    public static class updateColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "updateColumnFamily"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:311:1: updateColumnFamily : UPDATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr ) ;
    public final CliParser.updateColumnFamily_return updateColumnFamily() throws RecognitionException {
        CliParser.updateColumnFamily_return retval = new CliParser.updateColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UPDATE155=null;
        Token COLUMN156=null;
        Token FAMILY157=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr158 = null;


        CommonTree UPDATE155_tree=null;
        CommonTree COLUMN156_tree=null;
        CommonTree FAMILY157_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:312:5: ( UPDATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:312:7: UPDATE COLUMN FAMILY keyValuePairExpr
            {
            UPDATE155=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_updateColumnFamily2185); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE155);

            COLUMN156=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_updateColumnFamily2187); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN156);

            FAMILY157=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_updateColumnFamily2189); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY157);

            pushFollow(FOLLOW_keyValuePairExpr_in_updateColumnFamily2191);
            keyValuePairExpr158=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr158.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 313:9: -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:313:12: ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_UPDATE_COLUMN_FAMILY, "NODE_UPDATE_COLUMN_FAMILY"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "updateColumnFamily"

    public static class delKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delKeyspace"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:316:1: delKeyspace : DROP KEYSPACE keyspace -> ^( NODE_DEL_KEYSPACE keyspace ) ;
    public final CliParser.delKeyspace_return delKeyspace() throws RecognitionException {
        CliParser.delKeyspace_return retval = new CliParser.delKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DROP159=null;
        Token KEYSPACE160=null;
        CliParser.keyspace_return keyspace161 = null;


        CommonTree DROP159_tree=null;
        CommonTree KEYSPACE160_tree=null;
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:317:5: ( DROP KEYSPACE keyspace -> ^( NODE_DEL_KEYSPACE keyspace ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:317:7: DROP KEYSPACE keyspace
            {
            DROP159=(Token)match(input,DROP,FOLLOW_DROP_in_delKeyspace2224); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP159);

            KEYSPACE160=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_delKeyspace2226); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE160);

            pushFollow(FOLLOW_keyspace_in_delKeyspace2228);
            keyspace161=keyspace();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyspace.add(keyspace161.getTree());


            // AST REWRITE
            // elements: keyspace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 318:9: -> ^( NODE_DEL_KEYSPACE keyspace )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:318:12: ^( NODE_DEL_KEYSPACE keyspace )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DEL_KEYSPACE, "NODE_DEL_KEYSPACE"), root_1);

                adaptor.addChild(root_1, stream_keyspace.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delKeyspace"

    public static class delColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delColumnFamily"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:321:1: delColumnFamily : DROP COLUMN FAMILY columnFamily -> ^( NODE_DEL_COLUMN_FAMILY columnFamily ) ;
    public final CliParser.delColumnFamily_return delColumnFamily() throws RecognitionException {
        CliParser.delColumnFamily_return retval = new CliParser.delColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DROP162=null;
        Token COLUMN163=null;
        Token FAMILY164=null;
        CliParser.columnFamily_return columnFamily165 = null;


        CommonTree DROP162_tree=null;
        CommonTree COLUMN163_tree=null;
        CommonTree FAMILY164_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:322:5: ( DROP COLUMN FAMILY columnFamily -> ^( NODE_DEL_COLUMN_FAMILY columnFamily ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:322:7: DROP COLUMN FAMILY columnFamily
            {
            DROP162=(Token)match(input,DROP,FOLLOW_DROP_in_delColumnFamily2262); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP162);

            COLUMN163=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_delColumnFamily2264); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN163);

            FAMILY164=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_delColumnFamily2266); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY164);

            pushFollow(FOLLOW_columnFamily_in_delColumnFamily2268);
            columnFamily165=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily165.getTree());


            // AST REWRITE
            // elements: columnFamily
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 323:9: -> ^( NODE_DEL_COLUMN_FAMILY columnFamily )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:323:12: ^( NODE_DEL_COLUMN_FAMILY columnFamily )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DEL_COLUMN_FAMILY, "NODE_DEL_COLUMN_FAMILY"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delColumnFamily"

    public static class showVersion_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showVersion"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:326:1: showVersion : SHOW API_VERSION -> ^( NODE_SHOW_VERSION ) ;
    public final CliParser.showVersion_return showVersion() throws RecognitionException {
        CliParser.showVersion_return retval = new CliParser.showVersion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW166=null;
        Token API_VERSION167=null;

        CommonTree SHOW166_tree=null;
        CommonTree API_VERSION167_tree=null;
        RewriteRuleTokenStream stream_API_VERSION=new RewriteRuleTokenStream(adaptor,"token API_VERSION");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:327:5: ( SHOW API_VERSION -> ^( NODE_SHOW_VERSION ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:327:7: SHOW API_VERSION
            {
            SHOW166=(Token)match(input,SHOW,FOLLOW_SHOW_in_showVersion2302); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW166);

            API_VERSION167=(Token)match(input,API_VERSION,FOLLOW_API_VERSION_in_showVersion2304); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_API_VERSION.add(API_VERSION167);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 328:9: -> ^( NODE_SHOW_VERSION )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:328:12: ^( NODE_SHOW_VERSION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_VERSION, "NODE_SHOW_VERSION"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showVersion"

    public static class showKeyspaces_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showKeyspaces"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:331:1: showKeyspaces : SHOW KEYSPACES -> ^( NODE_SHOW_KEYSPACES ) ;
    public final CliParser.showKeyspaces_return showKeyspaces() throws RecognitionException {
        CliParser.showKeyspaces_return retval = new CliParser.showKeyspaces_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW168=null;
        Token KEYSPACES169=null;

        CommonTree SHOW168_tree=null;
        CommonTree KEYSPACES169_tree=null;
        RewriteRuleTokenStream stream_KEYSPACES=new RewriteRuleTokenStream(adaptor,"token KEYSPACES");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:332:5: ( SHOW KEYSPACES -> ^( NODE_SHOW_KEYSPACES ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:332:7: SHOW KEYSPACES
            {
            SHOW168=(Token)match(input,SHOW,FOLLOW_SHOW_in_showKeyspaces2335); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW168);

            KEYSPACES169=(Token)match(input,KEYSPACES,FOLLOW_KEYSPACES_in_showKeyspaces2337); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACES.add(KEYSPACES169);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 333:9: -> ^( NODE_SHOW_KEYSPACES )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:333:12: ^( NODE_SHOW_KEYSPACES )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_KEYSPACES, "NODE_SHOW_KEYSPACES"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showKeyspaces"

    public static class describeTable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "describeTable"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:336:1: describeTable : DESCRIBE KEYSPACE ( keyspace )? -> ^( NODE_DESCRIBE_TABLE ( keyspace )? ) ;
    public final CliParser.describeTable_return describeTable() throws RecognitionException {
        CliParser.describeTable_return retval = new CliParser.describeTable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DESCRIBE170=null;
        Token KEYSPACE171=null;
        CliParser.keyspace_return keyspace172 = null;


        CommonTree DESCRIBE170_tree=null;
        CommonTree KEYSPACE171_tree=null;
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:337:5: ( DESCRIBE KEYSPACE ( keyspace )? -> ^( NODE_DESCRIBE_TABLE ( keyspace )? ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:337:7: DESCRIBE KEYSPACE ( keyspace )?
            {
            DESCRIBE170=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeTable2369); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE170);

            KEYSPACE171=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_describeTable2371); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE171);

            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:337:25: ( keyspace )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Identifier) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:337:26: keyspace
                    {
                    pushFollow(FOLLOW_keyspace_in_describeTable2374);
                    keyspace172=keyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keyspace.add(keyspace172.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: keyspace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 338:9: -> ^( NODE_DESCRIBE_TABLE ( keyspace )? )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:338:12: ^( NODE_DESCRIBE_TABLE ( keyspace )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DESCRIBE_TABLE, "NODE_DESCRIBE_TABLE"), root_1);

                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:338:34: ( keyspace )?
                if ( stream_keyspace.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyspace.nextTree());

                }
                stream_keyspace.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "describeTable"

    public static class describeCluster_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "describeCluster"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:341:1: describeCluster : DESCRIBE 'CLUSTER' -> ^( NODE_DESCRIBE_CLUSTER ) ;
    public final CliParser.describeCluster_return describeCluster() throws RecognitionException {
        CliParser.describeCluster_return retval = new CliParser.describeCluster_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DESCRIBE173=null;
        Token string_literal174=null;

        CommonTree DESCRIBE173_tree=null;
        CommonTree string_literal174_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:342:5: ( DESCRIBE 'CLUSTER' -> ^( NODE_DESCRIBE_CLUSTER ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:342:7: DESCRIBE 'CLUSTER'
            {
            DESCRIBE173=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeCluster2416); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE173);

            string_literal174=(Token)match(input,83,FOLLOW_83_in_describeCluster2418); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(string_literal174);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 343:9: -> ^( NODE_DESCRIBE_CLUSTER )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:343:12: ^( NODE_DESCRIBE_CLUSTER )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DESCRIBE_CLUSTER, "NODE_DESCRIBE_CLUSTER"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "describeCluster"

    public static class useKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "useKeyspace"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:346:1: useKeyspace : USE keyspace ( username )? ( password )? -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? ) ;
    public final CliParser.useKeyspace_return useKeyspace() throws RecognitionException {
        CliParser.useKeyspace_return retval = new CliParser.useKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token USE175=null;
        CliParser.keyspace_return keyspace176 = null;

        CliParser.username_return username177 = null;

        CliParser.password_return password178 = null;


        CommonTree USE175_tree=null;
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleSubtreeStream stream_username=new RewriteRuleSubtreeStream(adaptor,"rule username");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        RewriteRuleSubtreeStream stream_password=new RewriteRuleSubtreeStream(adaptor,"rule password");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:347:5: ( USE keyspace ( username )? ( password )? -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:347:7: USE keyspace ( username )? ( password )?
            {
            USE175=(Token)match(input,USE,FOLLOW_USE_in_useKeyspace2449); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_USE.add(USE175);

            pushFollow(FOLLOW_keyspace_in_useKeyspace2451);
            keyspace176=keyspace();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyspace.add(keyspace176.getTree());
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:347:20: ( username )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Identifier) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:347:22: username
                    {
                    pushFollow(FOLLOW_username_in_useKeyspace2455);
                    username177=username();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_username.add(username177.getTree());

                    }
                    break;

            }

            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:347:34: ( password )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==StringLiteral) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:347:36: password
                    {
                    pushFollow(FOLLOW_password_in_useKeyspace2462);
                    password178=password();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_password.add(password178.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: password, keyspace, username
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 348:9: -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:348:12: ^( NODE_USE_TABLE keyspace ( username )? ( password )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_USE_TABLE, "NODE_USE_TABLE"), root_1);

                adaptor.addChild(root_1, stream_keyspace.nextTree());
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:348:38: ( username )?
                if ( stream_username.hasNext() ) {
                    adaptor.addChild(root_1, stream_username.nextTree());

                }
                stream_username.reset();
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:348:52: ( password )?
                if ( stream_password.hasNext() ) {
                    adaptor.addChild(root_1, stream_password.nextTree());

                }
                stream_password.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "useKeyspace"

    public static class keyValuePairExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyValuePairExpr"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:352:1: keyValuePairExpr : objectName ( ( AND | WITH ) keyValuePair )* -> ^( NODE_NEW_KEYSPACE_ACCESS objectName ( keyValuePair )* ) ;
    public final CliParser.keyValuePairExpr_return keyValuePairExpr() throws RecognitionException {
        CliParser.keyValuePairExpr_return retval = new CliParser.keyValuePairExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND180=null;
        Token WITH181=null;
        CliParser.objectName_return objectName179 = null;

        CliParser.keyValuePair_return keyValuePair182 = null;


        CommonTree AND180_tree=null;
        CommonTree WITH181_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_objectName=new RewriteRuleSubtreeStream(adaptor,"rule objectName");
        RewriteRuleSubtreeStream stream_keyValuePair=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePair");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:353:5: ( objectName ( ( AND | WITH ) keyValuePair )* -> ^( NODE_NEW_KEYSPACE_ACCESS objectName ( keyValuePair )* ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:353:7: objectName ( ( AND | WITH ) keyValuePair )*
            {
            pushFollow(FOLLOW_objectName_in_keyValuePairExpr2514);
            objectName179=objectName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_objectName.add(objectName179.getTree());
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:353:18: ( ( AND | WITH ) keyValuePair )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==WITH||LA20_0==AND) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:353:20: ( AND | WITH ) keyValuePair
            	    {
            	    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:353:20: ( AND | WITH )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==AND) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==WITH) ) {
            	        alt19=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:353:21: AND
            	            {
            	            AND180=(Token)match(input,AND,FOLLOW_AND_in_keyValuePairExpr2519); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_AND.add(AND180);


            	            }
            	            break;
            	        case 2 :
            	            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:353:27: WITH
            	            {
            	            WITH181=(Token)match(input,WITH,FOLLOW_WITH_in_keyValuePairExpr2523); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_WITH.add(WITH181);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_keyValuePair_in_keyValuePairExpr2526);
            	    keyValuePair182=keyValuePair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_keyValuePair.add(keyValuePair182.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);



            // AST REWRITE
            // elements: objectName, keyValuePair
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 354:9: -> ^( NODE_NEW_KEYSPACE_ACCESS objectName ( keyValuePair )* )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:354:12: ^( NODE_NEW_KEYSPACE_ACCESS objectName ( keyValuePair )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_NEW_KEYSPACE_ACCESS, "NODE_NEW_KEYSPACE_ACCESS"), root_1);

                adaptor.addChild(root_1, stream_objectName.nextTree());
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:354:50: ( keyValuePair )*
                while ( stream_keyValuePair.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyValuePair.nextTree());

                }
                stream_keyValuePair.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyValuePairExpr"

    public static class keyValuePair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyValuePair"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:357:1: keyValuePair : attr_name '=' attrValue -> attr_name attrValue ;
    public final CliParser.keyValuePair_return keyValuePair() throws RecognitionException {
        CliParser.keyValuePair_return retval = new CliParser.keyValuePair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal184=null;
        CliParser.attr_name_return attr_name183 = null;

        CliParser.attrValue_return attrValue185 = null;


        CommonTree char_literal184_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleSubtreeStream stream_attr_name=new RewriteRuleSubtreeStream(adaptor,"rule attr_name");
        RewriteRuleSubtreeStream stream_attrValue=new RewriteRuleSubtreeStream(adaptor,"rule attrValue");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:358:5: ( attr_name '=' attrValue -> attr_name attrValue )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:358:7: attr_name '=' attrValue
            {
            pushFollow(FOLLOW_attr_name_in_keyValuePair2584);
            attr_name183=attr_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attr_name.add(attr_name183.getTree());
            char_literal184=(Token)match(input,88,FOLLOW_88_in_keyValuePair2586); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_88.add(char_literal184);

            pushFollow(FOLLOW_attrValue_in_keyValuePair2588);
            attrValue185=attrValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attrValue.add(attrValue185.getTree());


            // AST REWRITE
            // elements: attr_name, attrValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 359:6: -> attr_name attrValue
            {
                adaptor.addChild(root_0, stream_attr_name.nextTree());
                adaptor.addChild(root_0, stream_attrValue.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyValuePair"

    public static class attrValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValue"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:362:1: attrValue : ( arrayConstruct | attrValueString | attrValueInt | attrValueDouble );
    public final CliParser.attrValue_return attrValue() throws RecognitionException {
        CliParser.attrValue_return retval = new CliParser.attrValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.arrayConstruct_return arrayConstruct186 = null;

        CliParser.attrValueString_return attrValueString187 = null;

        CliParser.attrValueInt_return attrValueInt188 = null;

        CliParser.attrValueDouble_return attrValueDouble189 = null;



        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:363:5: ( arrayConstruct | attrValueString | attrValueInt | attrValueDouble )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt21=1;
                }
                break;
            case Identifier:
            case StringLiteral:
                {
                alt21=2;
                }
                break;
            case IntegerLiteral:
                {
                alt21=3;
                }
                break;
            case DoubleLiteral:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:363:7: arrayConstruct
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayConstruct_in_attrValue2617);
                    arrayConstruct186=arrayConstruct();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayConstruct186.getTree());

                    }
                    break;
                case 2 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:364:7: attrValueString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueString_in_attrValue2625);
                    attrValueString187=attrValueString();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueString187.getTree());

                    }
                    break;
                case 3 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:365:7: attrValueInt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueInt_in_attrValue2633);
                    attrValueInt188=attrValueInt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueInt188.getTree());

                    }
                    break;
                case 4 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:366:7: attrValueDouble
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueDouble_in_attrValue2641);
                    attrValueDouble189=attrValueDouble();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueDouble189.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValue"

    public static class arrayConstruct_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayConstruct"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:370:1: arrayConstruct : '[' ( hashConstruct ( ',' )? )+ ']' -> ^( ARRAY ( hashConstruct )+ ) ;
    public final CliParser.arrayConstruct_return arrayConstruct() throws RecognitionException {
        CliParser.arrayConstruct_return retval = new CliParser.arrayConstruct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal190=null;
        Token char_literal192=null;
        Token char_literal193=null;
        CliParser.hashConstruct_return hashConstruct191 = null;


        CommonTree char_literal190_tree=null;
        CommonTree char_literal192_tree=null;
        CommonTree char_literal193_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_hashConstruct=new RewriteRuleSubtreeStream(adaptor,"rule hashConstruct");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:371:5: ( '[' ( hashConstruct ( ',' )? )+ ']' -> ^( ARRAY ( hashConstruct )+ ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:371:7: '[' ( hashConstruct ( ',' )? )+ ']'
            {
            char_literal190=(Token)match(input,93,FOLLOW_93_in_arrayConstruct2660); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(char_literal190);

            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:371:11: ( hashConstruct ( ',' )? )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==96) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:371:12: hashConstruct ( ',' )?
            	    {
            	    pushFollow(FOLLOW_hashConstruct_in_arrayConstruct2663);
            	    hashConstruct191=hashConstruct();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hashConstruct.add(hashConstruct191.getTree());
            	    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:371:26: ( ',' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==94) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:0:0: ','
            	            {
            	            char_literal192=(Token)match(input,94,FOLLOW_94_in_arrayConstruct2665); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_94.add(char_literal192);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            char_literal193=(Token)match(input,95,FOLLOW_95_in_arrayConstruct2670); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_95.add(char_literal193);



            // AST REWRITE
            // elements: hashConstruct
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 372:9: -> ^( ARRAY ( hashConstruct )+ )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:372:12: ^( ARRAY ( hashConstruct )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, "ARRAY"), root_1);

                if ( !(stream_hashConstruct.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hashConstruct.hasNext() ) {
                    adaptor.addChild(root_1, stream_hashConstruct.nextTree());

                }
                stream_hashConstruct.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayConstruct"

    public static class hashConstruct_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hashConstruct"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:375:1: hashConstruct : '{' hashElementPair ( ',' hashElementPair )* '}' -> ^( HASH ( hashElementPair )+ ) ;
    public final CliParser.hashConstruct_return hashConstruct() throws RecognitionException {
        CliParser.hashConstruct_return retval = new CliParser.hashConstruct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal194=null;
        Token char_literal196=null;
        Token char_literal198=null;
        CliParser.hashElementPair_return hashElementPair195 = null;

        CliParser.hashElementPair_return hashElementPair197 = null;


        CommonTree char_literal194_tree=null;
        CommonTree char_literal196_tree=null;
        CommonTree char_literal198_tree=null;
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleSubtreeStream stream_hashElementPair=new RewriteRuleSubtreeStream(adaptor,"rule hashElementPair");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:376:5: ( '{' hashElementPair ( ',' hashElementPair )* '}' -> ^( HASH ( hashElementPair )+ ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:376:7: '{' hashElementPair ( ',' hashElementPair )* '}'
            {
            char_literal194=(Token)match(input,96,FOLLOW_96_in_hashConstruct2708); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_96.add(char_literal194);

            pushFollow(FOLLOW_hashElementPair_in_hashConstruct2710);
            hashElementPair195=hashElementPair();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hashElementPair.add(hashElementPair195.getTree());
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:376:27: ( ',' hashElementPair )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==94) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:376:28: ',' hashElementPair
            	    {
            	    char_literal196=(Token)match(input,94,FOLLOW_94_in_hashConstruct2713); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_94.add(char_literal196);

            	    pushFollow(FOLLOW_hashElementPair_in_hashConstruct2715);
            	    hashElementPair197=hashElementPair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hashElementPair.add(hashElementPair197.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            char_literal198=(Token)match(input,97,FOLLOW_97_in_hashConstruct2719); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_97.add(char_literal198);



            // AST REWRITE
            // elements: hashElementPair
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 377:9: -> ^( HASH ( hashElementPair )+ )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:377:12: ^( HASH ( hashElementPair )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(HASH, "HASH"), root_1);

                if ( !(stream_hashElementPair.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hashElementPair.hasNext() ) {
                    adaptor.addChild(root_1, stream_hashElementPair.nextTree());

                }
                stream_hashElementPair.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "hashConstruct"

    public static class hashElementPair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hashElementPair"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:380:1: hashElementPair : rowKey ':' value -> ^( PAIR rowKey value ) ;
    public final CliParser.hashElementPair_return hashElementPair() throws RecognitionException {
        CliParser.hashElementPair_return retval = new CliParser.hashElementPair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal200=null;
        CliParser.rowKey_return rowKey199 = null;

        CliParser.value_return value201 = null;


        CommonTree char_literal200_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_rowKey=new RewriteRuleSubtreeStream(adaptor,"rule rowKey");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:381:5: ( rowKey ':' value -> ^( PAIR rowKey value ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:381:7: rowKey ':' value
            {
            pushFollow(FOLLOW_rowKey_in_hashElementPair2755);
            rowKey199=rowKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowKey.add(rowKey199.getTree());
            char_literal200=(Token)match(input,98,FOLLOW_98_in_hashElementPair2757); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_98.add(char_literal200);

            pushFollow(FOLLOW_value_in_hashElementPair2759);
            value201=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value201.getTree());


            // AST REWRITE
            // elements: value, rowKey
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 382:9: -> ^( PAIR rowKey value )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:382:12: ^( PAIR rowKey value )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PAIR, "PAIR"), root_1);

                adaptor.addChild(root_1, stream_rowKey.nextTree());
                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "hashElementPair"

    public static class columnFamilyExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnFamilyExpr"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:385:1: columnFamilyExpr : columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )? -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? ) ;
    public final CliParser.columnFamilyExpr_return columnFamilyExpr() throws RecognitionException {
        CliParser.columnFamilyExpr_return retval = new CliParser.columnFamilyExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal203=null;
        Token char_literal205=null;
        Token char_literal206=null;
        Token char_literal207=null;
        Token char_literal208=null;
        Token char_literal209=null;
        CliParser.columnOrSuperColumn_return column = null;

        CliParser.columnOrSuperColumn_return super_column = null;

        CliParser.columnFamily_return columnFamily202 = null;

        CliParser.rowKey_return rowKey204 = null;


        CommonTree char_literal203_tree=null;
        CommonTree char_literal205_tree=null;
        CommonTree char_literal206_tree=null;
        CommonTree char_literal207_tree=null;
        CommonTree char_literal208_tree=null;
        CommonTree char_literal209_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_rowKey=new RewriteRuleSubtreeStream(adaptor,"rule rowKey");
        RewriteRuleSubtreeStream stream_columnOrSuperColumn=new RewriteRuleSubtreeStream(adaptor,"rule columnOrSuperColumn");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:386:5: ( columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )? -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:386:7: columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )?
            {
            pushFollow(FOLLOW_columnFamily_in_columnFamilyExpr2794);
            columnFamily202=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily202.getTree());
            char_literal203=(Token)match(input,93,FOLLOW_93_in_columnFamilyExpr2796); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(char_literal203);

            pushFollow(FOLLOW_rowKey_in_columnFamilyExpr2798);
            rowKey204=rowKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowKey.add(rowKey204.getTree());
            char_literal205=(Token)match(input,95,FOLLOW_95_in_columnFamilyExpr2800); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_95.add(char_literal205);

            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:387:9: ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==93) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:387:11: '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )?
                    {
                    char_literal206=(Token)match(input,93,FOLLOW_93_in_columnFamilyExpr2813); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(char_literal206);

                    pushFollow(FOLLOW_columnOrSuperColumn_in_columnFamilyExpr2817);
                    column=columnOrSuperColumn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(column.getTree());
                    char_literal207=(Token)match(input,95,FOLLOW_95_in_columnFamilyExpr2819); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_95.add(char_literal207);

                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:388:13: ( '[' super_column= columnOrSuperColumn ']' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==93) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:388:14: '[' super_column= columnOrSuperColumn ']'
                            {
                            char_literal208=(Token)match(input,93,FOLLOW_93_in_columnFamilyExpr2835); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_93.add(char_literal208);

                            pushFollow(FOLLOW_columnOrSuperColumn_in_columnFamilyExpr2839);
                            super_column=columnOrSuperColumn();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(super_column.getTree());
                            char_literal209=(Token)match(input,95,FOLLOW_95_in_columnFamilyExpr2841); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_95.add(char_literal209);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: columnFamily, column, super_column, rowKey
            // token labels: 
            // rule labels: retval, column, super_column
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_column=new RewriteRuleSubtreeStream(adaptor,"rule column",column!=null?column.tree:null);
            RewriteRuleSubtreeStream stream_super_column=new RewriteRuleSubtreeStream(adaptor,"rule super_column",super_column!=null?super_column.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 390:7: -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:390:10: ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_COLUMN_ACCESS, "NODE_COLUMN_ACCESS"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                adaptor.addChild(root_1, stream_rowKey.nextTree());
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:390:51: ( $column ( $super_column)? )?
                if ( stream_column.hasNext()||stream_super_column.hasNext() ) {
                    adaptor.addChild(root_1, stream_column.nextTree());
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:390:60: ( $super_column)?
                    if ( stream_super_column.hasNext() ) {
                        adaptor.addChild(root_1, stream_super_column.nextTree());

                    }
                    stream_super_column.reset();

                }
                stream_column.reset();
                stream_super_column.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnFamilyExpr"

    public static class keyRangeExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyRangeExpr"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:393:1: keyRangeExpr : '[' ( ( startKey )? ':' ( endKey )? )? ']' -> ^( NODE_KEY_RANGE ( startKey )? ( endKey )? ) ;
    public final CliParser.keyRangeExpr_return keyRangeExpr() throws RecognitionException {
        CliParser.keyRangeExpr_return retval = new CliParser.keyRangeExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal210=null;
        Token char_literal212=null;
        Token char_literal214=null;
        CliParser.startKey_return startKey211 = null;

        CliParser.endKey_return endKey213 = null;


        CommonTree char_literal210_tree=null;
        CommonTree char_literal212_tree=null;
        CommonTree char_literal214_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_endKey=new RewriteRuleSubtreeStream(adaptor,"rule endKey");
        RewriteRuleSubtreeStream stream_startKey=new RewriteRuleSubtreeStream(adaptor,"rule startKey");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:394:5: ( '[' ( ( startKey )? ':' ( endKey )? )? ']' -> ^( NODE_KEY_RANGE ( startKey )? ( endKey )? ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:394:10: '[' ( ( startKey )? ':' ( endKey )? )? ']'
            {
            char_literal210=(Token)match(input,93,FOLLOW_93_in_keyRangeExpr2904); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(char_literal210);

            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:394:14: ( ( startKey )? ':' ( endKey )? )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=Identifier && LA29_0<=StringLiteral)||LA29_0==98) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:394:16: ( startKey )? ':' ( endKey )?
                    {
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:394:16: ( startKey )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=Identifier && LA27_0<=StringLiteral)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:0:0: startKey
                            {
                            pushFollow(FOLLOW_startKey_in_keyRangeExpr2908);
                            startKey211=startKey();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_startKey.add(startKey211.getTree());

                            }
                            break;

                    }

                    char_literal212=(Token)match(input,98,FOLLOW_98_in_keyRangeExpr2911); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_98.add(char_literal212);

                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:394:30: ( endKey )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=Identifier && LA28_0<=StringLiteral)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:0:0: endKey
                            {
                            pushFollow(FOLLOW_endKey_in_keyRangeExpr2913);
                            endKey213=endKey();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_endKey.add(endKey213.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal214=(Token)match(input,95,FOLLOW_95_in_keyRangeExpr2919); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_95.add(char_literal214);



            // AST REWRITE
            // elements: startKey, endKey
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 395:7: -> ^( NODE_KEY_RANGE ( startKey )? ( endKey )? )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:395:10: ^( NODE_KEY_RANGE ( startKey )? ( endKey )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_KEY_RANGE, "NODE_KEY_RANGE"), root_1);

                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:395:27: ( startKey )?
                if ( stream_startKey.hasNext() ) {
                    adaptor.addChild(root_1, stream_startKey.nextTree());

                }
                stream_startKey.reset();
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:395:37: ( endKey )?
                if ( stream_endKey.hasNext() ) {
                    adaptor.addChild(root_1, stream_endKey.nextTree());

                }
                stream_endKey.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyRangeExpr"

    public static class columnName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnName"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:398:1: columnName : Identifier ;
    public final CliParser.columnName_return columnName() throws RecognitionException {
        CliParser.columnName_return retval = new CliParser.columnName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier215=null;

        CommonTree Identifier215_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:399:2: ( Identifier )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:399:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier215=(Token)match(input,Identifier,FOLLOW_Identifier_in_columnName2951); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier215_tree = (CommonTree)adaptor.create(Identifier215);
            adaptor.addChild(root_0, Identifier215_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnName"

    public static class attr_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attr_name"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:402:1: attr_name : Identifier ;
    public final CliParser.attr_name_return attr_name() throws RecognitionException {
        CliParser.attr_name_return retval = new CliParser.attr_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier216=null;

        CommonTree Identifier216_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:403:2: ( Identifier )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:403:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier216=(Token)match(input,Identifier,FOLLOW_Identifier_in_attr_name2962); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier216_tree = (CommonTree)adaptor.create(Identifier216);
            adaptor.addChild(root_0, Identifier216_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attr_name"

    public static class attrValueString_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValueString"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:406:1: attrValueString : ( Identifier | StringLiteral ) ;
    public final CliParser.attrValueString_return attrValueString() throws RecognitionException {
        CliParser.attrValueString_return retval = new CliParser.attrValueString_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set217=null;

        CommonTree set217_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:407:2: ( ( Identifier | StringLiteral ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:407:4: ( Identifier | StringLiteral )
            {
            root_0 = (CommonTree)adaptor.nil();

            set217=(Token)input.LT(1);
            if ( (input.LA(1)>=Identifier && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set217));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValueString"

    public static class attrValueInt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValueInt"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:410:1: attrValueInt : IntegerLiteral ;
    public final CliParser.attrValueInt_return attrValueInt() throws RecognitionException {
        CliParser.attrValueInt_return retval = new CliParser.attrValueInt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IntegerLiteral218=null;

        CommonTree IntegerLiteral218_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:411:2: ( IntegerLiteral )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:411:4: IntegerLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            IntegerLiteral218=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_attrValueInt2996); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IntegerLiteral218_tree = (CommonTree)adaptor.create(IntegerLiteral218);
            adaptor.addChild(root_0, IntegerLiteral218_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValueInt"

    public static class attrValueDouble_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValueDouble"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:414:1: attrValueDouble : DoubleLiteral ;
    public final CliParser.attrValueDouble_return attrValueDouble() throws RecognitionException {
        CliParser.attrValueDouble_return retval = new CliParser.attrValueDouble_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DoubleLiteral219=null;

        CommonTree DoubleLiteral219_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:415:2: ( DoubleLiteral )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:415:4: DoubleLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            DoubleLiteral219=(Token)match(input,DoubleLiteral,FOLLOW_DoubleLiteral_in_attrValueDouble3007); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DoubleLiteral219_tree = (CommonTree)adaptor.create(DoubleLiteral219);
            adaptor.addChild(root_0, DoubleLiteral219_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValueDouble"

    public static class objectName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectName"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:418:1: objectName : Identifier ;
    public final CliParser.objectName_return objectName() throws RecognitionException {
        CliParser.objectName_return retval = new CliParser.objectName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier220=null;

        CommonTree Identifier220_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:419:2: ( Identifier )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:419:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier220=(Token)match(input,Identifier,FOLLOW_Identifier_in_objectName3020); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier220_tree = (CommonTree)adaptor.create(Identifier220);
            adaptor.addChild(root_0, Identifier220_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "objectName"

    public static class keyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyspace"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:422:1: keyspace : Identifier ;
    public final CliParser.keyspace_return keyspace() throws RecognitionException {
        CliParser.keyspace_return retval = new CliParser.keyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier221=null;

        CommonTree Identifier221_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:423:2: ( Identifier )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:423:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier221=(Token)match(input,Identifier,FOLLOW_Identifier_in_keyspace3031); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier221_tree = (CommonTree)adaptor.create(Identifier221);
            adaptor.addChild(root_0, Identifier221_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyspace"

    public static class replica_placement_strategy_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "replica_placement_strategy"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:426:1: replica_placement_strategy : StringLiteral ;
    public final CliParser.replica_placement_strategy_return replica_placement_strategy() throws RecognitionException {
        CliParser.replica_placement_strategy_return retval = new CliParser.replica_placement_strategy_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral222=null;

        CommonTree StringLiteral222_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:427:2: ( StringLiteral )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:427:4: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral222=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_replica_placement_strategy3042); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral222_tree = (CommonTree)adaptor.create(StringLiteral222);
            adaptor.addChild(root_0, StringLiteral222_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "replica_placement_strategy"

    public static class replication_factor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "replication_factor"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:430:1: replication_factor : IntegerLiteral ;
    public final CliParser.replication_factor_return replication_factor() throws RecognitionException {
        CliParser.replication_factor_return retval = new CliParser.replication_factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IntegerLiteral223=null;

        CommonTree IntegerLiteral223_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:431:2: ( IntegerLiteral )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:431:4: IntegerLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            IntegerLiteral223=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_replication_factor3053); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IntegerLiteral223_tree = (CommonTree)adaptor.create(IntegerLiteral223);
            adaptor.addChild(root_0, IntegerLiteral223_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "replication_factor"

    public static class keyspaceNewName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyspaceNewName"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:434:1: keyspaceNewName : Identifier ;
    public final CliParser.keyspaceNewName_return keyspaceNewName() throws RecognitionException {
        CliParser.keyspaceNewName_return retval = new CliParser.keyspaceNewName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier224=null;

        CommonTree Identifier224_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:435:2: ( Identifier )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:435:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier224=(Token)match(input,Identifier,FOLLOW_Identifier_in_keyspaceNewName3064); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier224_tree = (CommonTree)adaptor.create(Identifier224);
            adaptor.addChild(root_0, Identifier224_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyspaceNewName"

    public static class comparator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparator"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:438:1: comparator : StringLiteral ;
    public final CliParser.comparator_return comparator() throws RecognitionException {
        CliParser.comparator_return retval = new CliParser.comparator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral225=null;

        CommonTree StringLiteral225_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:439:2: ( StringLiteral )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:439:4: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral225=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_comparator3075); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral225_tree = (CommonTree)adaptor.create(StringLiteral225);
            adaptor.addChild(root_0, StringLiteral225_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparator"

    public static class command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:442:1: command : Identifier ;
    public final CliParser.command_return command() throws RecognitionException {
        CliParser.command_return retval = new CliParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier226=null;

        CommonTree Identifier226_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:442:9: ( Identifier )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:442:11: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier226=(Token)match(input,Identifier,FOLLOW_Identifier_in_command3091); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier226_tree = (CommonTree)adaptor.create(Identifier226);
            adaptor.addChild(root_0, Identifier226_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "command"

    public static class newColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newColumnFamily"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:445:1: newColumnFamily : Identifier ;
    public final CliParser.newColumnFamily_return newColumnFamily() throws RecognitionException {
        CliParser.newColumnFamily_return retval = new CliParser.newColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier227=null;

        CommonTree Identifier227_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:446:2: ( Identifier )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:446:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier227=(Token)match(input,Identifier,FOLLOW_Identifier_in_newColumnFamily3102); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier227_tree = (CommonTree)adaptor.create(Identifier227);
            adaptor.addChild(root_0, Identifier227_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "newColumnFamily"

    public static class username_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "username"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:449:1: username : Identifier ;
    public final CliParser.username_return username() throws RecognitionException {
        CliParser.username_return retval = new CliParser.username_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier228=null;

        CommonTree Identifier228_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:449:9: ( Identifier )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:449:11: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier228=(Token)match(input,Identifier,FOLLOW_Identifier_in_username3111); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier228_tree = (CommonTree)adaptor.create(Identifier228);
            adaptor.addChild(root_0, Identifier228_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "username"

    public static class password_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "password"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:452:1: password : StringLiteral ;
    public final CliParser.password_return password() throws RecognitionException {
        CliParser.password_return retval = new CliParser.password_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral229=null;

        CommonTree StringLiteral229_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:452:9: ( StringLiteral )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:452:11: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral229=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_password3120); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral229_tree = (CommonTree)adaptor.create(StringLiteral229);
            adaptor.addChild(root_0, StringLiteral229_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "password"

    public static class columnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnFamily"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:455:1: columnFamily : Identifier ;
    public final CliParser.columnFamily_return columnFamily() throws RecognitionException {
        CliParser.columnFamily_return retval = new CliParser.columnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier230=null;

        CommonTree Identifier230_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:456:2: ( Identifier )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:456:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier230=(Token)match(input,Identifier,FOLLOW_Identifier_in_columnFamily3131); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier230_tree = (CommonTree)adaptor.create(Identifier230);
            adaptor.addChild(root_0, Identifier230_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnFamily"

    public static class rowKey_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rowKey"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:459:1: rowKey : ( Identifier | StringLiteral | IntegerLiteral | functionCall ) ;
    public final CliParser.rowKey_return rowKey() throws RecognitionException {
        CliParser.rowKey_return retval = new CliParser.rowKey_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier231=null;
        Token StringLiteral232=null;
        Token IntegerLiteral233=null;
        CliParser.functionCall_return functionCall234 = null;


        CommonTree Identifier231_tree=null;
        CommonTree StringLiteral232_tree=null;
        CommonTree IntegerLiteral233_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:460:5: ( ( Identifier | StringLiteral | IntegerLiteral | functionCall ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:460:8: ( Identifier | StringLiteral | IntegerLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:460:8: ( Identifier | StringLiteral | IntegerLiteral | functionCall )
            int alt30=4;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==99) ) {
                    alt30=4;
                }
                else if ( (LA30_1==95||LA30_1==98) ) {
                    alt30=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
                }
                break;
            case StringLiteral:
                {
                alt30=2;
                }
                break;
            case IntegerLiteral:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:460:9: Identifier
                    {
                    Identifier231=(Token)match(input,Identifier,FOLLOW_Identifier_in_rowKey3148); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier231_tree = (CommonTree)adaptor.create(Identifier231);
                    adaptor.addChild(root_0, Identifier231_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:460:22: StringLiteral
                    {
                    StringLiteral232=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_rowKey3152); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral232_tree = (CommonTree)adaptor.create(StringLiteral232);
                    adaptor.addChild(root_0, StringLiteral232_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:460:38: IntegerLiteral
                    {
                    IntegerLiteral233=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_rowKey3156); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerLiteral233_tree = (CommonTree)adaptor.create(IntegerLiteral233);
                    adaptor.addChild(root_0, IntegerLiteral233_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:460:55: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_rowKey3160);
                    functionCall234=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall234.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rowKey"

    public static class value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:463:1: value : ( Identifier | IntegerLiteral | StringLiteral | functionCall ) ;
    public final CliParser.value_return value() throws RecognitionException {
        CliParser.value_return retval = new CliParser.value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier235=null;
        Token IntegerLiteral236=null;
        Token StringLiteral237=null;
        CliParser.functionCall_return functionCall238 = null;


        CommonTree Identifier235_tree=null;
        CommonTree IntegerLiteral236_tree=null;
        CommonTree StringLiteral237_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:464:5: ( ( Identifier | IntegerLiteral | StringLiteral | functionCall ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:464:7: ( Identifier | IntegerLiteral | StringLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:464:7: ( Identifier | IntegerLiteral | StringLiteral | functionCall )
            int alt31=4;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==99) ) {
                    alt31=4;
                }
                else if ( (LA31_1==EOF||LA31_1==SEMICOLON||LA31_1==WITH||LA31_1==AND||LA31_1==LIMIT||LA31_1==94||LA31_1==97) ) {
                    alt31=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
                }
                break;
            case IntegerLiteral:
                {
                alt31=2;
                }
                break;
            case StringLiteral:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:464:8: Identifier
                    {
                    Identifier235=(Token)match(input,Identifier,FOLLOW_Identifier_in_value3177); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier235_tree = (CommonTree)adaptor.create(Identifier235);
                    adaptor.addChild(root_0, Identifier235_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:464:21: IntegerLiteral
                    {
                    IntegerLiteral236=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_value3181); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerLiteral236_tree = (CommonTree)adaptor.create(IntegerLiteral236);
                    adaptor.addChild(root_0, IntegerLiteral236_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:464:38: StringLiteral
                    {
                    StringLiteral237=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_value3185); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral237_tree = (CommonTree)adaptor.create(StringLiteral237);
                    adaptor.addChild(root_0, StringLiteral237_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:464:54: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_value3189);
                    functionCall238=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall238.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class functionCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCall"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:467:1: functionCall : functionName= Identifier '(' ( functionArgument )? ')' -> ^( FUNCTION_CALL $functionName ( functionArgument )? ) ;
    public final CliParser.functionCall_return functionCall() throws RecognitionException {
        CliParser.functionCall_return retval = new CliParser.functionCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token functionName=null;
        Token char_literal239=null;
        Token char_literal241=null;
        CliParser.functionArgument_return functionArgument240 = null;


        CommonTree functionName_tree=null;
        CommonTree char_literal239_tree=null;
        CommonTree char_literal241_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_functionArgument=new RewriteRuleSubtreeStream(adaptor,"rule functionArgument");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:468:5: (functionName= Identifier '(' ( functionArgument )? ')' -> ^( FUNCTION_CALL $functionName ( functionArgument )? ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:468:7: functionName= Identifier '(' ( functionArgument )? ')'
            {
            functionName=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall3207); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(functionName);

            char_literal239=(Token)match(input,99,FOLLOW_99_in_functionCall3209); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_99.add(char_literal239);

            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:468:35: ( functionArgument )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=IntegerLiteral && LA32_0<=StringLiteral)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:0:0: functionArgument
                    {
                    pushFollow(FOLLOW_functionArgument_in_functionCall3211);
                    functionArgument240=functionArgument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionArgument.add(functionArgument240.getTree());

                    }
                    break;

            }

            char_literal241=(Token)match(input,100,FOLLOW_100_in_functionCall3214); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_100.add(char_literal241);



            // AST REWRITE
            // elements: functionName, functionArgument
            // token labels: functionName
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_functionName=new RewriteRuleTokenStream(adaptor,"token functionName",functionName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 469:9: -> ^( FUNCTION_CALL $functionName ( functionArgument )? )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:469:12: ^( FUNCTION_CALL $functionName ( functionArgument )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

                adaptor.addChild(root_1, stream_functionName.nextNode());
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:469:42: ( functionArgument )?
                if ( stream_functionArgument.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionArgument.nextTree());

                }
                stream_functionArgument.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class functionArgument_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionArgument"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:472:1: functionArgument : ( Identifier | StringLiteral | IntegerLiteral );
    public final CliParser.functionArgument_return functionArgument() throws RecognitionException {
        CliParser.functionArgument_return retval = new CliParser.functionArgument_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set242=null;

        CommonTree set242_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:473:5: ( Identifier | StringLiteral | IntegerLiteral )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set242=(Token)input.LT(1);
            if ( (input.LA(1)>=IntegerLiteral && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set242));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionArgument"

    public static class startKey_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "startKey"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:476:1: startKey : ( Identifier | StringLiteral ) ;
    public final CliParser.startKey_return startKey() throws RecognitionException {
        CliParser.startKey_return retval = new CliParser.startKey_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set243=null;

        CommonTree set243_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:477:5: ( ( Identifier | StringLiteral ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:477:7: ( Identifier | StringLiteral )
            {
            root_0 = (CommonTree)adaptor.nil();

            set243=(Token)input.LT(1);
            if ( (input.LA(1)>=Identifier && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set243));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "startKey"

    public static class endKey_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "endKey"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:480:1: endKey : ( Identifier | StringLiteral ) ;
    public final CliParser.endKey_return endKey() throws RecognitionException {
        CliParser.endKey_return retval = new CliParser.endKey_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set244=null;

        CommonTree set244_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:481:5: ( ( Identifier | StringLiteral ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:481:7: ( Identifier | StringLiteral )
            {
            root_0 = (CommonTree)adaptor.nil();

            set244=(Token)input.LT(1);
            if ( (input.LA(1)>=Identifier && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set244));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "endKey"

    public static class columnOrSuperColumn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnOrSuperColumn"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:484:1: columnOrSuperColumn : ( Identifier | IntegerLiteral | StringLiteral | functionCall ) ;
    public final CliParser.columnOrSuperColumn_return columnOrSuperColumn() throws RecognitionException {
        CliParser.columnOrSuperColumn_return retval = new CliParser.columnOrSuperColumn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier245=null;
        Token IntegerLiteral246=null;
        Token StringLiteral247=null;
        CliParser.functionCall_return functionCall248 = null;


        CommonTree Identifier245_tree=null;
        CommonTree IntegerLiteral246_tree=null;
        CommonTree StringLiteral247_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:485:2: ( ( Identifier | IntegerLiteral | StringLiteral | functionCall ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:485:4: ( Identifier | IntegerLiteral | StringLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:485:4: ( Identifier | IntegerLiteral | StringLiteral | functionCall )
            int alt33=4;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==99) ) {
                    alt33=4;
                }
                else if ( ((LA33_1>=88 && LA33_1<=92)||LA33_1==95) ) {
                    alt33=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case IntegerLiteral:
                {
                alt33=2;
                }
                break;
            case StringLiteral:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:485:5: Identifier
                    {
                    Identifier245=(Token)match(input,Identifier,FOLLOW_Identifier_in_columnOrSuperColumn3316); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier245_tree = (CommonTree)adaptor.create(Identifier245);
                    adaptor.addChild(root_0, Identifier245_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:485:18: IntegerLiteral
                    {
                    IntegerLiteral246=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_columnOrSuperColumn3320); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerLiteral246_tree = (CommonTree)adaptor.create(IntegerLiteral246);
                    adaptor.addChild(root_0, IntegerLiteral246_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:485:35: StringLiteral
                    {
                    StringLiteral247=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_columnOrSuperColumn3324); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral247_tree = (CommonTree)adaptor.create(StringLiteral247);
                    adaptor.addChild(root_0, StringLiteral247_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:485:51: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_columnOrSuperColumn3328);
                    functionCall248=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall248.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnOrSuperColumn"

    public static class host_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "host"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:488:1: host : host_name -> ^( NODE_ID_LIST host_name ) ;
    public final CliParser.host_return host() throws RecognitionException {
        CliParser.host_return retval = new CliParser.host_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.host_name_return host_name249 = null;


        RewriteRuleSubtreeStream stream_host_name=new RewriteRuleSubtreeStream(adaptor,"rule host_name");
        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:489:5: ( host_name -> ^( NODE_ID_LIST host_name ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:489:7: host_name
            {
            pushFollow(FOLLOW_host_name_in_host3344);
            host_name249=host_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_host_name.add(host_name249.getTree());


            // AST REWRITE
            // elements: host_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 490:9: -> ^( NODE_ID_LIST host_name )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:490:12: ^( NODE_ID_LIST host_name )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ID_LIST, "NODE_ID_LIST"), root_1);

                adaptor.addChild(root_1, stream_host_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "host"

    public static class host_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "host_name"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:493:1: host_name : Identifier ( '.' Identifier )* ;
    public final CliParser.host_name_return host_name() throws RecognitionException {
        CliParser.host_name_return retval = new CliParser.host_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier250=null;
        Token char_literal251=null;
        Token Identifier252=null;

        CommonTree Identifier250_tree=null;
        CommonTree char_literal251_tree=null;
        CommonTree Identifier252_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:494:2: ( Identifier ( '.' Identifier )* )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:494:4: Identifier ( '.' Identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier250=(Token)match(input,Identifier,FOLLOW_Identifier_in_host_name3371); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier250_tree = (CommonTree)adaptor.create(Identifier250);
            adaptor.addChild(root_0, Identifier250_tree);
            }
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:494:15: ( '.' Identifier )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==101) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:494:16: '.' Identifier
            	    {
            	    char_literal251=(Token)match(input,101,FOLLOW_101_in_host_name3374); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal251_tree = (CommonTree)adaptor.create(char_literal251);
            	    adaptor.addChild(root_0, char_literal251_tree);
            	    }
            	    Identifier252=(Token)match(input,Identifier,FOLLOW_Identifier_in_host_name3376); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Identifier252_tree = (CommonTree)adaptor.create(Identifier252);
            	    adaptor.addChild(root_0, Identifier252_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "host_name"

    public static class ip_address_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ip_address"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:497:1: ip_address : IP_ADDRESS -> ^( NODE_ID_LIST IP_ADDRESS ) ;
    public final CliParser.ip_address_return ip_address() throws RecognitionException {
        CliParser.ip_address_return retval = new CliParser.ip_address_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IP_ADDRESS253=null;

        CommonTree IP_ADDRESS253_tree=null;
        RewriteRuleTokenStream stream_IP_ADDRESS=new RewriteRuleTokenStream(adaptor,"token IP_ADDRESS");

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:498:2: ( IP_ADDRESS -> ^( NODE_ID_LIST IP_ADDRESS ) )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:498:4: IP_ADDRESS
            {
            IP_ADDRESS253=(Token)match(input,IP_ADDRESS,FOLLOW_IP_ADDRESS_in_ip_address3390); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IP_ADDRESS.add(IP_ADDRESS253);



            // AST REWRITE
            // elements: IP_ADDRESS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 499:6: -> ^( NODE_ID_LIST IP_ADDRESS )
            {
                // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:499:9: ^( NODE_ID_LIST IP_ADDRESS )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ID_LIST, "NODE_ID_LIST"), root_1);

                adaptor.addChild(root_1, stream_IP_ADDRESS.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ip_address"

    public static class port_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "port"
    // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:503:1: port : IntegerLiteral ;
    public final CliParser.port_return port() throws RecognitionException {
        CliParser.port_return retval = new CliParser.port_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IntegerLiteral254=null;

        CommonTree IntegerLiteral254_tree=null;

        try {
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:504:5: ( IntegerLiteral )
            // /home/nakamura/MyCassandra/MyCassandra-0.2.1/src/java/org/apache/cassandra/cli/Cli.g:504:7: IntegerLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            IntegerLiteral254=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_port3420); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IntegerLiteral254_tree = (CommonTree)adaptor.create(IntegerLiteral254);
            adaptor.addChild(root_0, IntegerLiteral254_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "port"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA2_eotS =
        "\33\uffff";
    static final String DFA2_eofS =
        "\1\22\32\uffff";
    static final String DFA2_minS =
        "\1\52\3\uffff\4\57\23\uffff";
    static final String DFA2_maxS =
        "\1\125\3\uffff\1\123\3\67\23\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\4\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
        "\1\23\1\24\1\25\1\26\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA2_specialS =
        "\33\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\22\1\1\1\13\1\10\1\4\1\uffff\2\2\1\15\2\uffff\1\5\1\6\2\uffff"+
            "\1\7\1\12\1\14\1\11\1\3\1\16\1\17\1\20\1\21\23\uffff\1\13",
            "",
            "",
            "",
            "\1\23\43\uffff\1\24",
            "\1\25\7\uffff\1\26",
            "\1\27\7\uffff\1\30",
            "\1\32\7\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "138:1: statement : ( connectStatement | exitStatement | countStatement | describeTable | describeCluster | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | delStatement | getStatement | helpStatement | setStatement | showStatement | listStatement | truncateStatement | assumeStatement | consistencyLevelStatement | -> ^( NODE_NO_OP ) );";
        }
    }
    static final String DFA6_eotS =
        "\41\uffff";
    static final String DFA6_eofS =
        "\1\uffff\1\25\37\uffff";
    static final String DFA6_minS =
        "\1\54\1\52\4\uffff\1\57\2\uffff\1\63\3\57\24\uffff";
    static final String DFA6_maxS =
        "\1\125\1\101\4\uffff\1\123\2\uffff\1\124\3\67\24\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\32\1\1\1\2\1\3\1\uffff\1\6\1\7\4\uffff\1\21\1\22\1\23"+
        "\1\24\1\25\1\26\1\27\1\30\1\31\1\4\1\5\1\10\1\11\1\12\1\13\1\15"+
        "\1\14\1\16\1\17\1\20";
    static final String DFA6_specialS =
        "\41\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\50\uffff\1\2",
            "\1\25\1\4\1\3\1\5\1\6\1\uffff\1\7\1\10\1\11\2\uffff\1\12\1"+
            "\13\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "",
            "",
            "",
            "",
            "\1\26\43\uffff\1\27",
            "",
            "",
            "\1\31\1\32\37\uffff\1\30",
            "\1\33\7\uffff\1\34",
            "\1\35\7\uffff\1\36",
            "\1\37\7\uffff\1\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "170:1: helpStatement : ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP DESCRIBE KEYSPACE -> ^( NODE_HELP NODE_DESCRIBE_TABLE ) | HELP DESCRIBE 'CLUSTER' -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW 'CLUSTER NAME' -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW API_VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP CONSISTENCYLEVEL -> ^( NODE_HELP NODE_CONSISTENCY_LEVEL ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) );";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_root393 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_root395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_root398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connectStatement_in_statement414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitStatement_in_statement422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStatement_in_statement430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_describeTable_in_statement438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_describeCluster_in_statement446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addKeyspace_in_statement454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addColumnFamily_in_statement462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateKeyspace_in_statement470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateColumnFamily_in_statement478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delColumnFamily_in_statement486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delKeyspace_in_statement494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useKeyspace_in_statement502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delStatement_in_statement510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getStatement_in_statement518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_helpStatement_in_statement526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setStatement_in_statement534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showStatement_in_statement542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listStatement_in_statement550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_truncateStatement_in_statement558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assumeStatement_in_statement566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_consistencyLevelStatement_in_statement574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONNECT_in_connectStatement603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_host_in_connectStatement605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_connectStatement607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_port_in_connectStatement609 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_username_in_connectStatement612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_password_in_connectStatement614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONNECT_in_connectStatement649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ip_address_in_connectStatement651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_connectStatement653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_port_in_connectStatement655 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_username_in_connectStatement658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_password_in_connectStatement660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement704 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_HELP_in_helpStatement706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement731 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_CONNECT_in_helpStatement733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement758 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_USE_in_helpStatement760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement785 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_DESCRIBE_in_helpStatement787 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement814 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_DESCRIBE_in_helpStatement816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_helpStatement818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement842 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_EXIT_in_helpStatement844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement869 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_QUIT_in_helpStatement871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement896 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_helpStatement900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement924 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement926 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KEYSPACES_in_helpStatement928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement953 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement955 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_API_VERSION_in_helpStatement957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement981 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_CREATE_in_helpStatement983 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1010 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_UPDATE_in_helpStatement1012 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1038 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_CREATE_in_helpStatement1040 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement1042 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1069 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_UPDATE_in_helpStatement1071 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement1073 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1099 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_DROP_in_helpStatement1101 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1128 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_DROP_in_helpStatement1130 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement1132 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1159 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_GET_in_helpStatement1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1186 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_SET_in_helpStatement1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1213 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_DEL_in_helpStatement1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1240 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_COUNT_in_helpStatement1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1267 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LIST_in_helpStatement1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1294 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_TRUNCATE_in_helpStatement1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ASSUME_in_helpStatement1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_CONSISTENCYLEVEL_in_helpStatement1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_helpStatement1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUIT_in_exitStatement1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_exitStatement1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getStatement1467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_getStatement1469 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_getStatement1472 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_typeIdentifier_in_getStatement1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getStatement1512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_columnFamily_in_getStatement1514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_getStatement1516 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_getCondition_in_getStatement1518 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001080L});
    public static final BitSet FOLLOW_AND_in_getStatement1521 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_getCondition_in_getStatement1523 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001080L});
    public static final BitSet FOLLOW_LIMIT_in_getStatement1528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IntegerLiteral_in_getStatement1532 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_getCondition1583 = new BitSet(new long[]{0x0000000000000000L,0x000000001F000000L});
    public static final BitSet FOLLOW_operator_in_getCondition1585 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_value_in_getCondition1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeIdentifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setStatement1683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_setStatement1685 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_setStatement1687 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_value_in_setStatement1691 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_WITH_in_setStatement1694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_TTL_in_setStatement1696 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_setStatement1698 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_value_in_setStatement1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_countStatement1748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_countStatement1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEL_in_delStatement1784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_delStatement1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showClusterName_in_showStatement1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showVersion_in_showStatement1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showKeyspaces_in_showStatement1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_listStatement1853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_columnFamily_in_listStatement1855 = new BitSet(new long[]{0x0000000000000002L,0x0000000020001000L});
    public static final BitSet FOLLOW_keyRangeExpr_in_listStatement1857 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_LIMIT_in_listStatement1861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IntegerLiteral_in_listStatement1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUNCATE_in_truncateStatement1911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_columnFamily_in_truncateStatement1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSUME_in_assumeStatement1946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_columnFamily_in_assumeStatement1948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_Identifier_in_assumeStatement1952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_assumeStatement1954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_Identifier_in_assumeStatement1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSISTENCYLEVEL_in_consistencyLevelStatement1997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_consistencyLevelStatement1999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_Identifier_in_consistencyLevelStatement2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showClusterName2037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_showClusterName2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_addKeyspace2070 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_addKeyspace2072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_addKeyspace2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_addColumnFamily2108 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_addColumnFamily2110 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_addColumnFamily2112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_addColumnFamily2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_updateKeyspace2148 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_updateKeyspace2150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_updateKeyspace2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_updateColumnFamily2185 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_updateColumnFamily2187 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_updateColumnFamily2189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_updateColumnFamily2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_delKeyspace2224 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_delKeyspace2226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_keyspace_in_delKeyspace2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_delColumnFamily2262 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_delColumnFamily2264 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_delColumnFamily2266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_columnFamily_in_delColumnFamily2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showVersion2302 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_API_VERSION_in_showVersion2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showKeyspaces2335 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KEYSPACES_in_showKeyspaces2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeTable2369 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_describeTable2371 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_keyspace_in_describeTable2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeCluster2416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_describeCluster2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_useKeyspace2449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_keyspace_in_useKeyspace2451 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_username_in_useKeyspace2455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_password_in_useKeyspace2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectName_in_keyValuePairExpr2514 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000A0L});
    public static final BitSet FOLLOW_AND_in_keyValuePairExpr2519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_WITH_in_keyValuePairExpr2523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_keyValuePair_in_keyValuePairExpr2526 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000A0L});
    public static final BitSet FOLLOW_attr_name_in_keyValuePair2584 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_keyValuePair2586 = new BitSet(new long[]{0x0000000000000000L,0x000000002000011CL});
    public static final BitSet FOLLOW_attrValue_in_keyValuePair2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayConstruct_in_attrValue2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueString_in_attrValue2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueInt_in_attrValue2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueDouble_in_attrValue2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_arrayConstruct2660 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_hashConstruct_in_arrayConstruct2663 = new BitSet(new long[]{0x0000000000000000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_94_in_arrayConstruct2665 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_95_in_arrayConstruct2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_hashConstruct2708 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_hashElementPair_in_hashConstruct2710 = new BitSet(new long[]{0x0000000000000000L,0x0000000240000000L});
    public static final BitSet FOLLOW_94_in_hashConstruct2713 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_hashElementPair_in_hashConstruct2715 = new BitSet(new long[]{0x0000000000000000L,0x0000000240000000L});
    public static final BitSet FOLLOW_97_in_hashConstruct2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rowKey_in_hashElementPair2755 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_hashElementPair2757 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_value_in_hashElementPair2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnFamily_in_columnFamilyExpr2794 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_columnFamilyExpr2796 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_rowKey_in_columnFamilyExpr2798 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_columnFamilyExpr2800 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_columnFamilyExpr2813 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_columnFamilyExpr2817 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_columnFamilyExpr2819 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_columnFamilyExpr2835 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_columnFamilyExpr2839 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_columnFamilyExpr2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_keyRangeExpr2904 = new BitSet(new long[]{0x0000000000000000L,0x0000000480000018L});
    public static final BitSet FOLLOW_startKey_in_keyRangeExpr2908 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_keyRangeExpr2911 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000018L});
    public static final BitSet FOLLOW_endKey_in_keyRangeExpr2913 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_keyRangeExpr2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_columnName2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_attr_name2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attrValueString2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_attrValueInt2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DoubleLiteral_in_attrValueDouble3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_objectName3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_keyspace3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_replica_placement_strategy3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_replication_factor3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_keyspaceNewName3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_comparator3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_command3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_newColumnFamily3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_username3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_password3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_columnFamily3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_rowKey3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_rowKey3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_rowKey3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_rowKey3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_value3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_value3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_value3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_value3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_functionCall3207 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_functionCall3209 = new BitSet(new long[]{0x0000000000000000L,0x000000100000001CL});
    public static final BitSet FOLLOW_functionArgument_in_functionCall3211 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_functionCall3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_functionArgument0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_startKey3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_endKey3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_columnOrSuperColumn3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_columnOrSuperColumn3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_columnOrSuperColumn3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_columnOrSuperColumn3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_name_in_host3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_host_name3371 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_host_name3374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_Identifier_in_host_name3376 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_IP_ADDRESS_in_ip_address3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_port3420 = new BitSet(new long[]{0x0000000000000002L});

}