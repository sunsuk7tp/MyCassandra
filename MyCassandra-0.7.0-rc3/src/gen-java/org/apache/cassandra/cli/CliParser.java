// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g 2011-01-01 16:05:55

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NODE_CONNECT", "NODE_DESCRIBE_TABLE", "NODE_USE_TABLE", "NODE_EXIT", "NODE_HELP", "NODE_NO_OP", "NODE_SHOW_CLUSTER_NAME", "NODE_SHOW_VERSION", "NODE_SHOW_KEYSPACES", "NODE_THRIFT_GET", "NODE_THRIFT_GET_WITH_CONDITIONS", "NODE_THRIFT_SET", "NODE_THRIFT_COUNT", "NODE_THRIFT_DEL", "NODE_ADD_COLUMN_FAMILY", "NODE_ADD_KEYSPACE", "NODE_DEL_KEYSPACE", "NODE_DEL_COLUMN_FAMILY", "NODE_UPDATE_KEYSPACE", "NODE_UPDATE_COLUMN_FAMILY", "NODE_LIST", "NODE_TRUNCATE", "NODE_ASSUME", "NODE_COLUMN_ACCESS", "NODE_ID_LIST", "NODE_NEW_CF_ACCESS", "NODE_NEW_KEYSPACE_ACCESS", "CONVERT_TO_TYPE", "FUNCTION_CALL", "CONDITION", "CONDITIONS", "ARRAY", "HASH", "PAIR", "NODE_LIMIT", "NODE_KEY_RANGE", "SEMICOLON", "CONNECT", "HELP", "USE", "DESCRIBE", "KEYSPACE", "EXIT", "QUIT", "SHOW", "CLUSTER", "NAME", "KEYSPACES", "VERSION", "CREATE", "UPDATE", "COLUMN", "FAMILY", "DROP", "GET", "SET", "DEL", "COUNT", "LIST", "TRUNCATE", "ASSUME", "IntegerLiteral", "Identifier", "StringLiteral", "WITH", "TTL", "AND", "DoubleLiteral", "IP_ADDRESS", "CONFIG", "FILE", "LIMIT", "Letter", "Digit", "Alnum", "WS", "COMMENT", "'/'", "'?'", "'AS'", "'WHERE'", "'='", "'>'", "'<'", "'>='", "'<='", "'['", "','", "']'", "'{'", "'}'", "':'", "'('", "')'", "'.'"
    };
    public static final int NODE_THRIFT_GET_WITH_CONDITIONS=14;
    public static final int TTL=69;
    public static final int NODE_SHOW_KEYSPACES=12;
    public static final int CONDITION=33;
    public static final int COUNT=61;
    public static final int EOF=-1;
    public static final int Identifier=66;
    public static final int NODE_UPDATE_COLUMN_FAMILY=23;
    public static final int NODE_USE_TABLE=6;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int NODE_DEL_KEYSPACE=20;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int NAME=50;
    public static final int CREATE=53;
    public static final int NODE_CONNECT=4;
    public static final int T__90=90;
    public static final int CONNECT=41;
    public static final int FAMILY=56;
    public static final int GET=58;
    public static final int NODE_DESCRIBE_TABLE=5;
    public static final int COMMENT=80;
    public static final int SHOW=48;
    public static final int T__98=98;
    public static final int ARRAY=35;
    public static final int NODE_ADD_KEYSPACE=19;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int EXIT=46;
    public static final int T__81=81;
    public static final int NODE_THRIFT_DEL=17;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int SEMICOLON=40;
    public static final int KEYSPACES=51;
    public static final int T__85=85;
    public static final int CONDITIONS=34;
    public static final int FILE=74;
    public static final int T__84=84;
    public static final int NODE_LIMIT=38;
    public static final int LIST=62;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int IP_ADDRESS=72;
    public static final int NODE_THRIFT_SET=15;
    public static final int NODE_NO_OP=9;
    public static final int NODE_ID_LIST=28;
    public static final int WS=79;
    public static final int ASSUME=64;
    public static final int NODE_THRIFT_COUNT=16;
    public static final int DESCRIBE=44;
    public static final int Alnum=78;
    public static final int NODE_SHOW_CLUSTER_NAME=10;
    public static final int USE=43;
    public static final int FUNCTION_CALL=32;
    public static final int Letter=76;
    public static final int DoubleLiteral=71;
    public static final int HELP=42;
    public static final int NODE_EXIT=7;
    public static final int LIMIT=75;
    public static final int DEL=60;
    public static final int NODE_LIST=24;
    public static final int UPDATE=54;
    public static final int NODE_UPDATE_KEYSPACE=22;
    public static final int VERSION=52;
    public static final int NODE_NEW_CF_ACCESS=29;
    public static final int AND=70;
    public static final int QUIT=47;
    public static final int NODE_TRUNCATE=25;
    public static final int NODE_SHOW_VERSION=11;
    public static final int NODE_NEW_KEYSPACE_ACCESS=30;
    public static final int TRUNCATE=63;
    public static final int COLUMN=55;
    public static final int PAIR=37;
    public static final int WITH=68;
    public static final int HASH=36;
    public static final int SET=59;
    public static final int Digit=77;
    public static final int NODE_ASSUME=26;
    public static final int CONVERT_TO_TYPE=31;
    public static final int NODE_THRIFT_GET=13;
    public static final int NODE_DEL_COLUMN_FAMILY=21;
    public static final int NODE_KEY_RANGE=39;
    public static final int KEYSPACE=45;
    public static final int StringLiteral=67;
    public static final int NODE_HELP=8;
    public static final int CONFIG=73;
    public static final int DROP=57;
    public static final int CLUSTER=49;
    public static final int NODE_ADD_COLUMN_FAMILY=18;
    public static final int IntegerLiteral=65;
    public static final int NODE_COLUMN_ACCESS=27;

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
    public String getGrammarFileName() { return "/Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g"; }


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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:134:1: root : statement ( SEMICOLON )? EOF -> statement ;
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
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:134:5: ( statement ( SEMICOLON )? EOF -> statement )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:134:7: statement ( SEMICOLON )? EOF
            {
            pushFollow(FOLLOW_statement_in_root379);
            statement1=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement1.getTree());
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:134:17: ( SEMICOLON )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SEMICOLON) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:0:0: SEMICOLON
                    {
                    SEMICOLON2=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_root381); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON2);


                    }
                    break;

            }

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_root384); if (state.failed) return retval; 
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
            // 134:32: -> statement
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:136:1: statement : ( connectStatement | exitStatement | countStatement | describeTable | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | delStatement | getStatement | helpStatement | setStatement | showStatement | listStatement | truncateStatement | assumeStatement | -> ^( NODE_NO_OP ) );
    public final CliParser.statement_return statement() throws RecognitionException {
        CliParser.statement_return retval = new CliParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.connectStatement_return connectStatement4 = null;

        CliParser.exitStatement_return exitStatement5 = null;

        CliParser.countStatement_return countStatement6 = null;

        CliParser.describeTable_return describeTable7 = null;

        CliParser.addKeyspace_return addKeyspace8 = null;

        CliParser.addColumnFamily_return addColumnFamily9 = null;

        CliParser.updateKeyspace_return updateKeyspace10 = null;

        CliParser.updateColumnFamily_return updateColumnFamily11 = null;

        CliParser.delColumnFamily_return delColumnFamily12 = null;

        CliParser.delKeyspace_return delKeyspace13 = null;

        CliParser.useKeyspace_return useKeyspace14 = null;

        CliParser.delStatement_return delStatement15 = null;

        CliParser.getStatement_return getStatement16 = null;

        CliParser.helpStatement_return helpStatement17 = null;

        CliParser.setStatement_return setStatement18 = null;

        CliParser.showStatement_return showStatement19 = null;

        CliParser.listStatement_return listStatement20 = null;

        CliParser.truncateStatement_return truncateStatement21 = null;

        CliParser.assumeStatement_return assumeStatement22 = null;



        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:137:5: ( connectStatement | exitStatement | countStatement | describeTable | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | delStatement | getStatement | helpStatement | setStatement | showStatement | listStatement | truncateStatement | assumeStatement | -> ^( NODE_NO_OP ) )
            int alt2=20;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:137:7: connectStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_connectStatement_in_statement400);
                    connectStatement4=connectStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, connectStatement4.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:138:7: exitStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_exitStatement_in_statement408);
                    exitStatement5=exitStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exitStatement5.getTree());

                    }
                    break;
                case 3 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:139:7: countStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_countStatement_in_statement416);
                    countStatement6=countStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, countStatement6.getTree());

                    }
                    break;
                case 4 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:140:7: describeTable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_describeTable_in_statement424);
                    describeTable7=describeTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, describeTable7.getTree());

                    }
                    break;
                case 5 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:141:7: addKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_addKeyspace_in_statement432);
                    addKeyspace8=addKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addKeyspace8.getTree());

                    }
                    break;
                case 6 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:142:7: addColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_addColumnFamily_in_statement440);
                    addColumnFamily9=addColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addColumnFamily9.getTree());

                    }
                    break;
                case 7 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:143:7: updateKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_updateKeyspace_in_statement448);
                    updateKeyspace10=updateKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, updateKeyspace10.getTree());

                    }
                    break;
                case 8 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:144:7: updateColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_updateColumnFamily_in_statement456);
                    updateColumnFamily11=updateColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, updateColumnFamily11.getTree());

                    }
                    break;
                case 9 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:145:7: delColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delColumnFamily_in_statement464);
                    delColumnFamily12=delColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delColumnFamily12.getTree());

                    }
                    break;
                case 10 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:146:7: delKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delKeyspace_in_statement472);
                    delKeyspace13=delKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delKeyspace13.getTree());

                    }
                    break;
                case 11 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:147:7: useKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_useKeyspace_in_statement480);
                    useKeyspace14=useKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, useKeyspace14.getTree());

                    }
                    break;
                case 12 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:148:7: delStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delStatement_in_statement488);
                    delStatement15=delStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delStatement15.getTree());

                    }
                    break;
                case 13 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:149:7: getStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_getStatement_in_statement496);
                    getStatement16=getStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, getStatement16.getTree());

                    }
                    break;
                case 14 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:150:7: helpStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_helpStatement_in_statement504);
                    helpStatement17=helpStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, helpStatement17.getTree());

                    }
                    break;
                case 15 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:151:7: setStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_setStatement_in_statement512);
                    setStatement18=setStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setStatement18.getTree());

                    }
                    break;
                case 16 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:152:7: showStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showStatement_in_statement520);
                    showStatement19=showStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showStatement19.getTree());

                    }
                    break;
                case 17 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:153:7: listStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_listStatement_in_statement528);
                    listStatement20=listStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, listStatement20.getTree());

                    }
                    break;
                case 18 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:154:7: truncateStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_truncateStatement_in_statement536);
                    truncateStatement21=truncateStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, truncateStatement21.getTree());

                    }
                    break;
                case 19 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:155:7: assumeStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assumeStatement_in_statement544);
                    assumeStatement22=assumeStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assumeStatement22.getTree());

                    }
                    break;
                case 20 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:156:7: 
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
                    // 156:7: -> ^( NODE_NO_OP )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:156:10: ^( NODE_NO_OP )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:159:1: connectStatement : ( CONNECT host '/' port -> ^( NODE_CONNECT host port ) | CONNECT ip_address '/' port -> ^( NODE_CONNECT ip_address port ) );
    public final CliParser.connectStatement_return connectStatement() throws RecognitionException {
        CliParser.connectStatement_return retval = new CliParser.connectStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONNECT23=null;
        Token char_literal25=null;
        Token CONNECT27=null;
        Token char_literal29=null;
        CliParser.host_return host24 = null;

        CliParser.port_return port26 = null;

        CliParser.ip_address_return ip_address28 = null;

        CliParser.port_return port30 = null;


        CommonTree CONNECT23_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree CONNECT27_tree=null;
        CommonTree char_literal29_tree=null;
        RewriteRuleTokenStream stream_CONNECT=new RewriteRuleTokenStream(adaptor,"token CONNECT");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_port=new RewriteRuleSubtreeStream(adaptor,"rule port");
        RewriteRuleSubtreeStream stream_ip_address=new RewriteRuleSubtreeStream(adaptor,"rule ip_address");
        RewriteRuleSubtreeStream stream_host=new RewriteRuleSubtreeStream(adaptor,"rule host");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:160:5: ( CONNECT host '/' port -> ^( NODE_CONNECT host port ) | CONNECT ip_address '/' port -> ^( NODE_CONNECT ip_address port ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CONNECT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==IP_ADDRESS) ) {
                    alt3=2;
                }
                else if ( (LA3_1==Identifier) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:160:7: CONNECT host '/' port
                    {
                    CONNECT23=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connectStatement573); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT23);

                    pushFollow(FOLLOW_host_in_connectStatement575);
                    host24=host();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_host.add(host24.getTree());
                    char_literal25=(Token)match(input,81,FOLLOW_81_in_connectStatement577); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_81.add(char_literal25);

                    pushFollow(FOLLOW_port_in_connectStatement579);
                    port26=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port26.getTree());


                    // AST REWRITE
                    // elements: port, host
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 161:9: -> ^( NODE_CONNECT host port )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:161:12: ^( NODE_CONNECT host port )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"), root_1);

                        adaptor.addChild(root_1, stream_host.nextTree());
                        adaptor.addChild(root_1, stream_port.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:162:7: CONNECT ip_address '/' port
                    {
                    CONNECT27=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connectStatement606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT27);

                    pushFollow(FOLLOW_ip_address_in_connectStatement608);
                    ip_address28=ip_address();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ip_address.add(ip_address28.getTree());
                    char_literal29=(Token)match(input,81,FOLLOW_81_in_connectStatement610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_81.add(char_literal29);

                    pushFollow(FOLLOW_port_in_connectStatement612);
                    port30=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port30.getTree());


                    // AST REWRITE
                    // elements: ip_address, port
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 163:9: -> ^( NODE_CONNECT ip_address port )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:163:12: ^( NODE_CONNECT ip_address port )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"), root_1);

                        adaptor.addChild(root_1, stream_ip_address.nextTree());
                        adaptor.addChild(root_1, stream_port.nextTree());

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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:166:1: helpStatement : ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP DESCRIBE KEYSPACE -> ^( NODE_HELP NODE_DESCRIBE_TABLE ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW CLUSTER NAME -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) );
    public final CliParser.helpStatement_return helpStatement() throws RecognitionException {
        CliParser.helpStatement_return retval = new CliParser.helpStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token HELP31=null;
        Token HELP32=null;
        Token HELP33=null;
        Token CONNECT34=null;
        Token HELP35=null;
        Token USE36=null;
        Token HELP37=null;
        Token DESCRIBE38=null;
        Token KEYSPACE39=null;
        Token HELP40=null;
        Token EXIT41=null;
        Token HELP42=null;
        Token QUIT43=null;
        Token HELP44=null;
        Token SHOW45=null;
        Token CLUSTER46=null;
        Token NAME47=null;
        Token HELP48=null;
        Token SHOW49=null;
        Token KEYSPACES50=null;
        Token HELP51=null;
        Token SHOW52=null;
        Token VERSION53=null;
        Token HELP54=null;
        Token CREATE55=null;
        Token KEYSPACE56=null;
        Token HELP57=null;
        Token UPDATE58=null;
        Token KEYSPACE59=null;
        Token HELP60=null;
        Token CREATE61=null;
        Token COLUMN62=null;
        Token FAMILY63=null;
        Token HELP64=null;
        Token UPDATE65=null;
        Token COLUMN66=null;
        Token FAMILY67=null;
        Token HELP68=null;
        Token DROP69=null;
        Token KEYSPACE70=null;
        Token HELP71=null;
        Token DROP72=null;
        Token COLUMN73=null;
        Token FAMILY74=null;
        Token HELP75=null;
        Token GET76=null;
        Token HELP77=null;
        Token SET78=null;
        Token HELP79=null;
        Token DEL80=null;
        Token HELP81=null;
        Token COUNT82=null;
        Token HELP83=null;
        Token LIST84=null;
        Token HELP85=null;
        Token TRUNCATE86=null;
        Token HELP87=null;
        Token ASSUME88=null;
        Token HELP89=null;
        Token char_literal90=null;

        CommonTree HELP31_tree=null;
        CommonTree HELP32_tree=null;
        CommonTree HELP33_tree=null;
        CommonTree CONNECT34_tree=null;
        CommonTree HELP35_tree=null;
        CommonTree USE36_tree=null;
        CommonTree HELP37_tree=null;
        CommonTree DESCRIBE38_tree=null;
        CommonTree KEYSPACE39_tree=null;
        CommonTree HELP40_tree=null;
        CommonTree EXIT41_tree=null;
        CommonTree HELP42_tree=null;
        CommonTree QUIT43_tree=null;
        CommonTree HELP44_tree=null;
        CommonTree SHOW45_tree=null;
        CommonTree CLUSTER46_tree=null;
        CommonTree NAME47_tree=null;
        CommonTree HELP48_tree=null;
        CommonTree SHOW49_tree=null;
        CommonTree KEYSPACES50_tree=null;
        CommonTree HELP51_tree=null;
        CommonTree SHOW52_tree=null;
        CommonTree VERSION53_tree=null;
        CommonTree HELP54_tree=null;
        CommonTree CREATE55_tree=null;
        CommonTree KEYSPACE56_tree=null;
        CommonTree HELP57_tree=null;
        CommonTree UPDATE58_tree=null;
        CommonTree KEYSPACE59_tree=null;
        CommonTree HELP60_tree=null;
        CommonTree CREATE61_tree=null;
        CommonTree COLUMN62_tree=null;
        CommonTree FAMILY63_tree=null;
        CommonTree HELP64_tree=null;
        CommonTree UPDATE65_tree=null;
        CommonTree COLUMN66_tree=null;
        CommonTree FAMILY67_tree=null;
        CommonTree HELP68_tree=null;
        CommonTree DROP69_tree=null;
        CommonTree KEYSPACE70_tree=null;
        CommonTree HELP71_tree=null;
        CommonTree DROP72_tree=null;
        CommonTree COLUMN73_tree=null;
        CommonTree FAMILY74_tree=null;
        CommonTree HELP75_tree=null;
        CommonTree GET76_tree=null;
        CommonTree HELP77_tree=null;
        CommonTree SET78_tree=null;
        CommonTree HELP79_tree=null;
        CommonTree DEL80_tree=null;
        CommonTree HELP81_tree=null;
        CommonTree COUNT82_tree=null;
        CommonTree HELP83_tree=null;
        CommonTree LIST84_tree=null;
        CommonTree HELP85_tree=null;
        CommonTree TRUNCATE86_tree=null;
        CommonTree HELP87_tree=null;
        CommonTree ASSUME88_tree=null;
        CommonTree HELP89_tree=null;
        CommonTree char_literal90_tree=null;
        RewriteRuleTokenStream stream_EXIT=new RewriteRuleTokenStream(adaptor,"token EXIT");
        RewriteRuleTokenStream stream_HELP=new RewriteRuleTokenStream(adaptor,"token HELP");
        RewriteRuleTokenStream stream_DEL=new RewriteRuleTokenStream(adaptor,"token DEL");
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_VERSION=new RewriteRuleTokenStream(adaptor,"token VERSION");
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleTokenStream stream_KEYSPACES=new RewriteRuleTokenStream(adaptor,"token KEYSPACES");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_LIST=new RewriteRuleTokenStream(adaptor,"token LIST");
        RewriteRuleTokenStream stream_QUIT=new RewriteRuleTokenStream(adaptor,"token QUIT");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_CONNECT=new RewriteRuleTokenStream(adaptor,"token CONNECT");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_ASSUME=new RewriteRuleTokenStream(adaptor,"token ASSUME");
        RewriteRuleTokenStream stream_TRUNCATE=new RewriteRuleTokenStream(adaptor,"token TRUNCATE");
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_CLUSTER=new RewriteRuleTokenStream(adaptor,"token CLUSTER");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:167:5: ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP DESCRIBE KEYSPACE -> ^( NODE_HELP NODE_DESCRIBE_TABLE ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW CLUSTER NAME -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) )
            int alt4=24;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:167:7: HELP HELP
                    {
                    HELP31=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement648); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP31);

                    HELP32=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement650); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP32);



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
                    // 168:9: -> ^( NODE_HELP NODE_HELP )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:168:12: ^( NODE_HELP NODE_HELP )
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
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:169:7: HELP CONNECT
                    {
                    HELP33=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement675); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP33);

                    CONNECT34=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_helpStatement677); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT34);



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
                    // 170:9: -> ^( NODE_HELP NODE_CONNECT )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:170:12: ^( NODE_HELP NODE_CONNECT )
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
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:171:7: HELP USE
                    {
                    HELP35=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement702); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP35);

                    USE36=(Token)match(input,USE,FOLLOW_USE_in_helpStatement704); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USE.add(USE36);



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
                    // 172:9: -> ^( NODE_HELP NODE_USE_TABLE )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:172:12: ^( NODE_HELP NODE_USE_TABLE )
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
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:173:7: HELP DESCRIBE KEYSPACE
                    {
                    HELP37=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement729); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP37);

                    DESCRIBE38=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_helpStatement731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE38);

                    KEYSPACE39=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement733); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE39);



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
                    // 174:9: -> ^( NODE_HELP NODE_DESCRIBE_TABLE )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:174:12: ^( NODE_HELP NODE_DESCRIBE_TABLE )
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
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:175:7: HELP EXIT
                    {
                    HELP40=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP40);

                    EXIT41=(Token)match(input,EXIT,FOLLOW_EXIT_in_helpStatement760); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXIT.add(EXIT41);



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
                    // 176:9: -> ^( NODE_HELP NODE_EXIT )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:176:12: ^( NODE_HELP NODE_EXIT )
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
                case 6 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:177:7: HELP QUIT
                    {
                    HELP42=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement785); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP42);

                    QUIT43=(Token)match(input,QUIT,FOLLOW_QUIT_in_helpStatement787); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUIT.add(QUIT43);



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
                    // 178:9: -> ^( NODE_HELP NODE_EXIT )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:178:12: ^( NODE_HELP NODE_EXIT )
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
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:179:7: HELP SHOW CLUSTER NAME
                    {
                    HELP44=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP44);

                    SHOW45=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement814); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW45);

                    CLUSTER46=(Token)match(input,CLUSTER,FOLLOW_CLUSTER_in_helpStatement816); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLUSTER.add(CLUSTER46);

                    NAME47=(Token)match(input,NAME,FOLLOW_NAME_in_helpStatement818); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NAME.add(NAME47);



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
                    // 180:9: -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:180:12: ^( NODE_HELP NODE_SHOW_CLUSTER_NAME )
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
                case 8 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:181:7: HELP SHOW KEYSPACES
                    {
                    HELP48=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP48);

                    SHOW49=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement845); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW49);

                    KEYSPACES50=(Token)match(input,KEYSPACES,FOLLOW_KEYSPACES_in_helpStatement847); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACES.add(KEYSPACES50);



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
                    // 182:9: -> ^( NODE_HELP NODE_SHOW_KEYSPACES )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:182:12: ^( NODE_HELP NODE_SHOW_KEYSPACES )
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
                case 9 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:183:7: HELP SHOW VERSION
                    {
                    HELP51=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement872); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP51);

                    SHOW52=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement874); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW52);

                    VERSION53=(Token)match(input,VERSION,FOLLOW_VERSION_in_helpStatement876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VERSION.add(VERSION53);



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
                    // 184:9: -> ^( NODE_HELP NODE_SHOW_VERSION )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:184:12: ^( NODE_HELP NODE_SHOW_VERSION )
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
                case 10 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:185:7: HELP CREATE KEYSPACE
                    {
                    HELP54=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement901); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP54);

                    CREATE55=(Token)match(input,CREATE,FOLLOW_CREATE_in_helpStatement903); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CREATE.add(CREATE55);

                    KEYSPACE56=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE56);



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
                    // 186:9: -> ^( NODE_HELP NODE_ADD_KEYSPACE )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:186:12: ^( NODE_HELP NODE_ADD_KEYSPACE )
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
                case 11 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:187:7: HELP UPDATE KEYSPACE
                    {
                    HELP57=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement930); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP57);

                    UPDATE58=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_helpStatement932); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE58);

                    KEYSPACE59=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE59);



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
                    // 188:9: -> ^( NODE_HELP NODE_UPDATE_KEYSPACE )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:188:12: ^( NODE_HELP NODE_UPDATE_KEYSPACE )
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
                case 12 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:189:7: HELP CREATE COLUMN FAMILY
                    {
                    HELP60=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement958); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP60);

                    CREATE61=(Token)match(input,CREATE,FOLLOW_CREATE_in_helpStatement960); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CREATE.add(CREATE61);

                    COLUMN62=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement962); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN62);

                    FAMILY63=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement964); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY63);



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
                    // 190:9: -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:190:12: ^( NODE_HELP NODE_ADD_COLUMN_FAMILY )
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
                case 13 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:191:7: HELP UPDATE COLUMN FAMILY
                    {
                    HELP64=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement989); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP64);

                    UPDATE65=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_helpStatement991); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE65);

                    COLUMN66=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement993); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN66);

                    FAMILY67=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement995); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY67);



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
                    // 192:9: -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:192:12: ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY )
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
                case 14 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:193:7: HELP DROP KEYSPACE
                    {
                    HELP68=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP68);

                    DROP69=(Token)match(input,DROP,FOLLOW_DROP_in_helpStatement1021); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DROP.add(DROP69);

                    KEYSPACE70=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement1023); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE70);



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
                    // 194:9: -> ^( NODE_HELP NODE_DEL_KEYSPACE )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:194:12: ^( NODE_HELP NODE_DEL_KEYSPACE )
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
                case 15 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:195:7: HELP DROP COLUMN FAMILY
                    {
                    HELP71=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1048); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP71);

                    DROP72=(Token)match(input,DROP,FOLLOW_DROP_in_helpStatement1050); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DROP.add(DROP72);

                    COLUMN73=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement1052); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN73);

                    FAMILY74=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement1054); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY74);



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
                    // 196:9: -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:196:12: ^( NODE_HELP NODE_DEL_COLUMN_FAMILY )
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
                case 16 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:197:7: HELP GET
                    {
                    HELP75=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP75);

                    GET76=(Token)match(input,GET,FOLLOW_GET_in_helpStatement1081); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET76);



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
                    // 198:9: -> ^( NODE_HELP NODE_THRIFT_GET )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:198:12: ^( NODE_HELP NODE_THRIFT_GET )
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
                case 17 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:199:7: HELP SET
                    {
                    HELP77=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1106); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP77);

                    SET78=(Token)match(input,SET,FOLLOW_SET_in_helpStatement1108); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SET.add(SET78);



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
                    // 200:9: -> ^( NODE_HELP NODE_THRIFT_SET )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:200:12: ^( NODE_HELP NODE_THRIFT_SET )
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
                case 18 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:201:7: HELP DEL
                    {
                    HELP79=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1133); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP79);

                    DEL80=(Token)match(input,DEL,FOLLOW_DEL_in_helpStatement1135); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEL.add(DEL80);



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
                    // 202:9: -> ^( NODE_HELP NODE_THRIFT_DEL )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:202:12: ^( NODE_HELP NODE_THRIFT_DEL )
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
                case 19 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:203:7: HELP COUNT
                    {
                    HELP81=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1160); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP81);

                    COUNT82=(Token)match(input,COUNT,FOLLOW_COUNT_in_helpStatement1162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COUNT.add(COUNT82);



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
                    // 204:9: -> ^( NODE_HELP NODE_THRIFT_COUNT )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:204:12: ^( NODE_HELP NODE_THRIFT_COUNT )
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
                case 20 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:205:7: HELP LIST
                    {
                    HELP83=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1187); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP83);

                    LIST84=(Token)match(input,LIST,FOLLOW_LIST_in_helpStatement1189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIST.add(LIST84);



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
                    // 206:9: -> ^( NODE_HELP NODE_LIST )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:206:12: ^( NODE_HELP NODE_LIST )
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
                case 21 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:207:7: HELP TRUNCATE
                    {
                    HELP85=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1214); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP85);

                    TRUNCATE86=(Token)match(input,TRUNCATE,FOLLOW_TRUNCATE_in_helpStatement1216); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUNCATE.add(TRUNCATE86);



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
                    // 208:9: -> ^( NODE_HELP NODE_TRUNCATE )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:208:12: ^( NODE_HELP NODE_TRUNCATE )
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
                case 22 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:209:7: HELP ASSUME
                    {
                    HELP87=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1240); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP87);

                    ASSUME88=(Token)match(input,ASSUME,FOLLOW_ASSUME_in_helpStatement1242); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSUME.add(ASSUME88);



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
                    // 210:9: -> ^( NODE_HELP NODE_ASSUME )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:210:12: ^( NODE_HELP NODE_ASSUME )
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
                case 23 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:211:7: HELP
                    {
                    HELP89=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1266); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP89);



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
                    // 212:9: -> ^( NODE_HELP )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:212:12: ^( NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:213:7: '?'
                    {
                    char_literal90=(Token)match(input,82,FOLLOW_82_in_helpStatement1289); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_82.add(char_literal90);



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
                    // 214:9: -> ^( NODE_HELP )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:214:12: ^( NODE_HELP )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:217:1: exitStatement : ( QUIT -> ^( NODE_EXIT ) | EXIT -> ^( NODE_EXIT ) );
    public final CliParser.exitStatement_return exitStatement() throws RecognitionException {
        CliParser.exitStatement_return retval = new CliParser.exitStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUIT91=null;
        Token EXIT92=null;

        CommonTree QUIT91_tree=null;
        CommonTree EXIT92_tree=null;
        RewriteRuleTokenStream stream_EXIT=new RewriteRuleTokenStream(adaptor,"token EXIT");
        RewriteRuleTokenStream stream_QUIT=new RewriteRuleTokenStream(adaptor,"token QUIT");

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:218:5: ( QUIT -> ^( NODE_EXIT ) | EXIT -> ^( NODE_EXIT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==QUIT) ) {
                alt5=1;
            }
            else if ( (LA5_0==EXIT) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:218:7: QUIT
                    {
                    QUIT91=(Token)match(input,QUIT,FOLLOW_QUIT_in_exitStatement1324); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUIT.add(QUIT91);



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
                    // 218:12: -> ^( NODE_EXIT )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:218:15: ^( NODE_EXIT )
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
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:219:7: EXIT
                    {
                    EXIT92=(Token)match(input,EXIT,FOLLOW_EXIT_in_exitStatement1338); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXIT.add(EXIT92);



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
                    // 219:12: -> ^( NODE_EXIT )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:219:15: ^( NODE_EXIT )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:222:1: getStatement : ( GET columnFamilyExpr ( 'AS' typeIdentifier )? -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ) | GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerLiteral )* -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )* ) );
    public final CliParser.getStatement_return getStatement() throws RecognitionException {
        CliParser.getStatement_return retval = new CliParser.getStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token limit=null;
        Token GET93=null;
        Token string_literal95=null;
        Token GET97=null;
        Token string_literal99=null;
        Token string_literal101=null;
        Token string_literal103=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr94 = null;

        CliParser.typeIdentifier_return typeIdentifier96 = null;

        CliParser.columnFamily_return columnFamily98 = null;

        CliParser.getCondition_return getCondition100 = null;

        CliParser.getCondition_return getCondition102 = null;


        CommonTree limit_tree=null;
        CommonTree GET93_tree=null;
        CommonTree string_literal95_tree=null;
        CommonTree GET97_tree=null;
        CommonTree string_literal99_tree=null;
        CommonTree string_literal101_tree=null;
        CommonTree string_literal103_tree=null;
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_IntegerLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerLiteral");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_typeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule typeIdentifier");
        RewriteRuleSubtreeStream stream_getCondition=new RewriteRuleSubtreeStream(adaptor,"rule getCondition");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:223:5: ( GET columnFamilyExpr ( 'AS' typeIdentifier )? -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ) | GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerLiteral )* -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )* ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==GET) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==Identifier) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==90) ) {
                        alt9=1;
                    }
                    else if ( (LA9_2==84) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:223:7: GET columnFamilyExpr ( 'AS' typeIdentifier )?
                    {
                    GET93=(Token)match(input,GET,FOLLOW_GET_in_getStatement1361); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET93);

                    pushFollow(FOLLOW_columnFamilyExpr_in_getStatement1363);
                    columnFamilyExpr94=columnFamilyExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr94.getTree());
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:223:28: ( 'AS' typeIdentifier )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==83) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:223:29: 'AS' typeIdentifier
                            {
                            string_literal95=(Token)match(input,83,FOLLOW_83_in_getStatement1366); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_83.add(string_literal95);

                            pushFollow(FOLLOW_typeIdentifier_in_getStatement1368);
                            typeIdentifier96=typeIdentifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeIdentifier.add(typeIdentifier96.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: columnFamilyExpr, typeIdentifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 224:9: -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:224:12: ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_GET, "NODE_THRIFT_GET"), root_1);

                        adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:224:47: ( ^( CONVERT_TO_TYPE typeIdentifier ) )?
                        if ( stream_typeIdentifier.hasNext() ) {
                            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:224:49: ^( CONVERT_TO_TYPE typeIdentifier )
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
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:225:7: GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerLiteral )*
                    {
                    GET97=(Token)match(input,GET,FOLLOW_GET_in_getStatement1406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET97);

                    pushFollow(FOLLOW_columnFamily_in_getStatement1408);
                    columnFamily98=columnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily98.getTree());
                    string_literal99=(Token)match(input,84,FOLLOW_84_in_getStatement1410); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_84.add(string_literal99);

                    pushFollow(FOLLOW_getCondition_in_getStatement1412);
                    getCondition100=getCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_getCondition.add(getCondition100.getTree());
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:225:45: ( 'AND' getCondition )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==AND) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:225:46: 'AND' getCondition
                    	    {
                    	    string_literal101=(Token)match(input,AND,FOLLOW_AND_in_getStatement1415); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_AND.add(string_literal101);

                    	    pushFollow(FOLLOW_getCondition_in_getStatement1417);
                    	    getCondition102=getCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_getCondition.add(getCondition102.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:225:67: ( 'LIMIT' limit= IntegerLiteral )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==LIMIT) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:225:68: 'LIMIT' limit= IntegerLiteral
                    	    {
                    	    string_literal103=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_getStatement1422); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LIMIT.add(string_literal103);

                    	    limit=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_getStatement1426); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_IntegerLiteral.add(limit);


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: getCondition, columnFamily, limit
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
                    // 226:9: -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )* )
                    {
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:226:12: ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_GET_WITH_CONDITIONS, "NODE_THRIFT_GET_WITH_CONDITIONS"), root_1);

                        adaptor.addChild(root_1, stream_columnFamily.nextTree());
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:226:59: ^( CONDITIONS ( getCondition )+ )
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
                        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:226:87: ( ^( NODE_LIMIT $limit) )*
                        while ( stream_limit.hasNext() ) {
                            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:226:87: ^( NODE_LIMIT $limit)
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:229:1: getCondition : columnOrSuperColumn operator value -> ^( CONDITION operator columnOrSuperColumn value ) ;
    public final CliParser.getCondition_return getCondition() throws RecognitionException {
        CliParser.getCondition_return retval = new CliParser.getCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.columnOrSuperColumn_return columnOrSuperColumn104 = null;

        CliParser.operator_return operator105 = null;

        CliParser.value_return value106 = null;


        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_columnOrSuperColumn=new RewriteRuleSubtreeStream(adaptor,"rule columnOrSuperColumn");
        RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:230:5: ( columnOrSuperColumn operator value -> ^( CONDITION operator columnOrSuperColumn value ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:230:7: columnOrSuperColumn operator value
            {
            pushFollow(FOLLOW_columnOrSuperColumn_in_getCondition1477);
            columnOrSuperColumn104=columnOrSuperColumn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(columnOrSuperColumn104.getTree());
            pushFollow(FOLLOW_operator_in_getCondition1479);
            operator105=operator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_operator.add(operator105.getTree());
            pushFollow(FOLLOW_value_in_getCondition1481);
            value106=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value106.getTree());


            // AST REWRITE
            // elements: columnOrSuperColumn, value, operator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 231:9: -> ^( CONDITION operator columnOrSuperColumn value )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:231:12: ^( CONDITION operator columnOrSuperColumn value )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:234:1: operator : ( '=' | '>' | '<' | '>=' | '<=' );
    public final CliParser.operator_return operator() throws RecognitionException {
        CliParser.operator_return retval = new CliParser.operator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set107=null;

        CommonTree set107_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:235:5: ( '=' | '>' | '<' | '>=' | '<=' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set107=(Token)input.LT(1);
            if ( (input.LA(1)>=85 && input.LA(1)<=89) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set107));
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:238:1: typeIdentifier : ( Identifier | StringLiteral | IntegerLiteral );
    public final CliParser.typeIdentifier_return typeIdentifier() throws RecognitionException {
        CliParser.typeIdentifier_return retval = new CliParser.typeIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set108=null;

        CommonTree set108_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:239:5: ( Identifier | StringLiteral | IntegerLiteral )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set108=(Token)input.LT(1);
            if ( (input.LA(1)>=IntegerLiteral && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set108));
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:242:1: setStatement : SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= value )? -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? ) ;
    public final CliParser.setStatement_return setStatement() throws RecognitionException {
        CliParser.setStatement_return retval = new CliParser.setStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SET109=null;
        Token char_literal111=null;
        Token WITH112=null;
        Token TTL113=null;
        Token char_literal114=null;
        CliParser.value_return objectValue = null;

        CliParser.value_return ttlValue = null;

        CliParser.columnFamilyExpr_return columnFamilyExpr110 = null;


        CommonTree SET109_tree=null;
        CommonTree char_literal111_tree=null;
        CommonTree WITH112_tree=null;
        CommonTree TTL113_tree=null;
        CommonTree char_literal114_tree=null;
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleTokenStream stream_TTL=new RewriteRuleTokenStream(adaptor,"token TTL");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:243:5: ( SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= value )? -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:243:7: SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= value )?
            {
            SET109=(Token)match(input,SET,FOLLOW_SET_in_setStatement1577); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SET.add(SET109);

            pushFollow(FOLLOW_columnFamilyExpr_in_setStatement1579);
            columnFamilyExpr110=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr110.getTree());
            char_literal111=(Token)match(input,85,FOLLOW_85_in_setStatement1581); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_85.add(char_literal111);

            pushFollow(FOLLOW_value_in_setStatement1585);
            objectValue=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(objectValue.getTree());
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:243:50: ( WITH TTL '=' ttlValue= value )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==WITH) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:243:51: WITH TTL '=' ttlValue= value
                    {
                    WITH112=(Token)match(input,WITH,FOLLOW_WITH_in_setStatement1588); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WITH.add(WITH112);

                    TTL113=(Token)match(input,TTL,FOLLOW_TTL_in_setStatement1590); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TTL.add(TTL113);

                    char_literal114=(Token)match(input,85,FOLLOW_85_in_setStatement1592); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_85.add(char_literal114);

                    pushFollow(FOLLOW_value_in_setStatement1596);
                    ttlValue=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(ttlValue.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: columnFamilyExpr, objectValue, ttlValue
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
            // 244:9: -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:244:12: ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_SET, "NODE_THRIFT_SET"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                adaptor.addChild(root_1, stream_objectValue.nextTree());
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:244:60: ( $ttlValue)?
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:247:1: countStatement : COUNT columnFamilyExpr -> ^( NODE_THRIFT_COUNT columnFamilyExpr ) ;
    public final CliParser.countStatement_return countStatement() throws RecognitionException {
        CliParser.countStatement_return retval = new CliParser.countStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COUNT115=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr116 = null;


        CommonTree COUNT115_tree=null;
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:248:5: ( COUNT columnFamilyExpr -> ^( NODE_THRIFT_COUNT columnFamilyExpr ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:248:7: COUNT columnFamilyExpr
            {
            COUNT115=(Token)match(input,COUNT,FOLLOW_COUNT_in_countStatement1642); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COUNT.add(COUNT115);

            pushFollow(FOLLOW_columnFamilyExpr_in_countStatement1644);
            columnFamilyExpr116=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr116.getTree());


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
            // 249:9: -> ^( NODE_THRIFT_COUNT columnFamilyExpr )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:249:12: ^( NODE_THRIFT_COUNT columnFamilyExpr )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:252:1: delStatement : DEL columnFamilyExpr -> ^( NODE_THRIFT_DEL columnFamilyExpr ) ;
    public final CliParser.delStatement_return delStatement() throws RecognitionException {
        CliParser.delStatement_return retval = new CliParser.delStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEL117=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr118 = null;


        CommonTree DEL117_tree=null;
        RewriteRuleTokenStream stream_DEL=new RewriteRuleTokenStream(adaptor,"token DEL");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:253:5: ( DEL columnFamilyExpr -> ^( NODE_THRIFT_DEL columnFamilyExpr ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:253:7: DEL columnFamilyExpr
            {
            DEL117=(Token)match(input,DEL,FOLLOW_DEL_in_delStatement1678); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEL.add(DEL117);

            pushFollow(FOLLOW_columnFamilyExpr_in_delStatement1680);
            columnFamilyExpr118=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr118.getTree());


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
            // 254:9: -> ^( NODE_THRIFT_DEL columnFamilyExpr )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:254:12: ^( NODE_THRIFT_DEL columnFamilyExpr )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:257:1: showStatement : ( showClusterName | showVersion | showKeyspaces );
    public final CliParser.showStatement_return showStatement() throws RecognitionException {
        CliParser.showStatement_return retval = new CliParser.showStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.showClusterName_return showClusterName119 = null;

        CliParser.showVersion_return showVersion120 = null;

        CliParser.showKeyspaces_return showKeyspaces121 = null;



        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:258:5: ( showClusterName | showVersion | showKeyspaces )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==SHOW) ) {
                switch ( input.LA(2) ) {
                case CLUSTER:
                    {
                    alt11=1;
                    }
                    break;
                case VERSION:
                    {
                    alt11=2;
                    }
                    break;
                case KEYSPACES:
                    {
                    alt11=3;
                    }
                    break;
                default:
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
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:258:7: showClusterName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showClusterName_in_showStatement1714);
                    showClusterName119=showClusterName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showClusterName119.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:259:7: showVersion
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showVersion_in_showStatement1722);
                    showVersion120=showVersion();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showVersion120.getTree());

                    }
                    break;
                case 3 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:260:7: showKeyspaces
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showKeyspaces_in_showStatement1730);
                    showKeyspaces121=showKeyspaces();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showKeyspaces121.getTree());

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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:263:1: listStatement : LIST columnFamily ( keyRangeExpr )? ( 'LIMIT' limit= IntegerLiteral )? -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( ^( NODE_LIMIT $limit) )? ) ;
    public final CliParser.listStatement_return listStatement() throws RecognitionException {
        CliParser.listStatement_return retval = new CliParser.listStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token limit=null;
        Token LIST122=null;
        Token string_literal125=null;
        CliParser.columnFamily_return columnFamily123 = null;

        CliParser.keyRangeExpr_return keyRangeExpr124 = null;


        CommonTree limit_tree=null;
        CommonTree LIST122_tree=null;
        CommonTree string_literal125_tree=null;
        RewriteRuleTokenStream stream_IntegerLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerLiteral");
        RewriteRuleTokenStream stream_LIST=new RewriteRuleTokenStream(adaptor,"token LIST");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_keyRangeExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyRangeExpr");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:264:5: ( LIST columnFamily ( keyRangeExpr )? ( 'LIMIT' limit= IntegerLiteral )? -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( ^( NODE_LIMIT $limit) )? ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:264:7: LIST columnFamily ( keyRangeExpr )? ( 'LIMIT' limit= IntegerLiteral )?
            {
            LIST122=(Token)match(input,LIST,FOLLOW_LIST_in_listStatement1747); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LIST.add(LIST122);

            pushFollow(FOLLOW_columnFamily_in_listStatement1749);
            columnFamily123=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily123.getTree());
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:264:25: ( keyRangeExpr )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==90) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:0:0: keyRangeExpr
                    {
                    pushFollow(FOLLOW_keyRangeExpr_in_listStatement1751);
                    keyRangeExpr124=keyRangeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keyRangeExpr.add(keyRangeExpr124.getTree());

                    }
                    break;

            }

            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:264:39: ( 'LIMIT' limit= IntegerLiteral )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LIMIT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:264:40: 'LIMIT' limit= IntegerLiteral
                    {
                    string_literal125=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_listStatement1755); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIMIT.add(string_literal125);

                    limit=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_listStatement1759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IntegerLiteral.add(limit);


                    }
                    break;

            }



            // AST REWRITE
            // elements: columnFamily, limit, keyRangeExpr
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
            // 265:9: -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( ^( NODE_LIMIT $limit) )? )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:265:12: ^( NODE_LIST columnFamily ( keyRangeExpr )? ( ^( NODE_LIMIT $limit) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIST, "NODE_LIST"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:265:37: ( keyRangeExpr )?
                if ( stream_keyRangeExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyRangeExpr.nextTree());

                }
                stream_keyRangeExpr.reset();
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:265:51: ( ^( NODE_LIMIT $limit) )?
                if ( stream_limit.hasNext() ) {
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:265:51: ^( NODE_LIMIT $limit)
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:268:1: truncateStatement : TRUNCATE columnFamily -> ^( NODE_TRUNCATE columnFamily ) ;
    public final CliParser.truncateStatement_return truncateStatement() throws RecognitionException {
        CliParser.truncateStatement_return retval = new CliParser.truncateStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TRUNCATE126=null;
        CliParser.columnFamily_return columnFamily127 = null;


        CommonTree TRUNCATE126_tree=null;
        RewriteRuleTokenStream stream_TRUNCATE=new RewriteRuleTokenStream(adaptor,"token TRUNCATE");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:269:5: ( TRUNCATE columnFamily -> ^( NODE_TRUNCATE columnFamily ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:269:7: TRUNCATE columnFamily
            {
            TRUNCATE126=(Token)match(input,TRUNCATE,FOLLOW_TRUNCATE_in_truncateStatement1805); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRUNCATE.add(TRUNCATE126);

            pushFollow(FOLLOW_columnFamily_in_truncateStatement1807);
            columnFamily127=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily127.getTree());


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
            // 270:9: -> ^( NODE_TRUNCATE columnFamily )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:270:12: ^( NODE_TRUNCATE columnFamily )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:273:1: assumeStatement : ASSUME columnFamily assumptionElement= Identifier 'AS' defaultType= Identifier -> ^( NODE_ASSUME columnFamily $assumptionElement $defaultType) ;
    public final CliParser.assumeStatement_return assumeStatement() throws RecognitionException {
        CliParser.assumeStatement_return retval = new CliParser.assumeStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token assumptionElement=null;
        Token defaultType=null;
        Token ASSUME128=null;
        Token string_literal130=null;
        CliParser.columnFamily_return columnFamily129 = null;


        CommonTree assumptionElement_tree=null;
        CommonTree defaultType_tree=null;
        CommonTree ASSUME128_tree=null;
        CommonTree string_literal130_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_ASSUME=new RewriteRuleTokenStream(adaptor,"token ASSUME");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:274:5: ( ASSUME columnFamily assumptionElement= Identifier 'AS' defaultType= Identifier -> ^( NODE_ASSUME columnFamily $assumptionElement $defaultType) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:274:7: ASSUME columnFamily assumptionElement= Identifier 'AS' defaultType= Identifier
            {
            ASSUME128=(Token)match(input,ASSUME,FOLLOW_ASSUME_in_assumeStatement1840); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSUME.add(ASSUME128);

            pushFollow(FOLLOW_columnFamily_in_assumeStatement1842);
            columnFamily129=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily129.getTree());
            assumptionElement=(Token)match(input,Identifier,FOLLOW_Identifier_in_assumeStatement1846); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(assumptionElement);

            string_literal130=(Token)match(input,83,FOLLOW_83_in_assumeStatement1848); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(string_literal130);

            defaultType=(Token)match(input,Identifier,FOLLOW_Identifier_in_assumeStatement1852); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(defaultType);



            // AST REWRITE
            // elements: defaultType, assumptionElement, columnFamily
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
            // 275:9: -> ^( NODE_ASSUME columnFamily $assumptionElement $defaultType)
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:275:12: ^( NODE_ASSUME columnFamily $assumptionElement $defaultType)
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

    public static class showClusterName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showClusterName"
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:278:1: showClusterName : SHOW CLUSTER NAME -> ^( NODE_SHOW_CLUSTER_NAME ) ;
    public final CliParser.showClusterName_return showClusterName() throws RecognitionException {
        CliParser.showClusterName_return retval = new CliParser.showClusterName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW131=null;
        Token CLUSTER132=null;
        Token NAME133=null;

        CommonTree SHOW131_tree=null;
        CommonTree CLUSTER132_tree=null;
        CommonTree NAME133_tree=null;
        RewriteRuleTokenStream stream_CLUSTER=new RewriteRuleTokenStream(adaptor,"token CLUSTER");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:279:5: ( SHOW CLUSTER NAME -> ^( NODE_SHOW_CLUSTER_NAME ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:279:7: SHOW CLUSTER NAME
            {
            SHOW131=(Token)match(input,SHOW,FOLLOW_SHOW_in_showClusterName1891); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW131);

            CLUSTER132=(Token)match(input,CLUSTER,FOLLOW_CLUSTER_in_showClusterName1893); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLUSTER.add(CLUSTER132);

            NAME133=(Token)match(input,NAME,FOLLOW_NAME_in_showClusterName1895); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAME.add(NAME133);



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
            // 280:9: -> ^( NODE_SHOW_CLUSTER_NAME )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:280:12: ^( NODE_SHOW_CLUSTER_NAME )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:283:1: addKeyspace : CREATE KEYSPACE keyValuePairExpr -> ^( NODE_ADD_KEYSPACE keyValuePairExpr ) ;
    public final CliParser.addKeyspace_return addKeyspace() throws RecognitionException {
        CliParser.addKeyspace_return retval = new CliParser.addKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE134=null;
        Token KEYSPACE135=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr136 = null;


        CommonTree CREATE134_tree=null;
        CommonTree KEYSPACE135_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:284:5: ( CREATE KEYSPACE keyValuePairExpr -> ^( NODE_ADD_KEYSPACE keyValuePairExpr ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:284:7: CREATE KEYSPACE keyValuePairExpr
            {
            CREATE134=(Token)match(input,CREATE,FOLLOW_CREATE_in_addKeyspace1927); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE134);

            KEYSPACE135=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_addKeyspace1929); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE135);

            pushFollow(FOLLOW_keyValuePairExpr_in_addKeyspace1931);
            keyValuePairExpr136=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr136.getTree());


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
            // 285:9: -> ^( NODE_ADD_KEYSPACE keyValuePairExpr )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:285:12: ^( NODE_ADD_KEYSPACE keyValuePairExpr )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:288:1: addColumnFamily : CREATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr ) ;
    public final CliParser.addColumnFamily_return addColumnFamily() throws RecognitionException {
        CliParser.addColumnFamily_return retval = new CliParser.addColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE137=null;
        Token COLUMN138=null;
        Token FAMILY139=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr140 = null;


        CommonTree CREATE137_tree=null;
        CommonTree COLUMN138_tree=null;
        CommonTree FAMILY139_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:289:5: ( CREATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:289:7: CREATE COLUMN FAMILY keyValuePairExpr
            {
            CREATE137=(Token)match(input,CREATE,FOLLOW_CREATE_in_addColumnFamily1965); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE137);

            COLUMN138=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_addColumnFamily1967); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN138);

            FAMILY139=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_addColumnFamily1969); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY139);

            pushFollow(FOLLOW_keyValuePairExpr_in_addColumnFamily1971);
            keyValuePairExpr140=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr140.getTree());


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
            // 290:9: -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:290:12: ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:293:1: updateKeyspace : UPDATE KEYSPACE keyValuePairExpr -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr ) ;
    public final CliParser.updateKeyspace_return updateKeyspace() throws RecognitionException {
        CliParser.updateKeyspace_return retval = new CliParser.updateKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UPDATE141=null;
        Token KEYSPACE142=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr143 = null;


        CommonTree UPDATE141_tree=null;
        CommonTree KEYSPACE142_tree=null;
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:294:5: ( UPDATE KEYSPACE keyValuePairExpr -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:294:7: UPDATE KEYSPACE keyValuePairExpr
            {
            UPDATE141=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_updateKeyspace2005); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE141);

            KEYSPACE142=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_updateKeyspace2007); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE142);

            pushFollow(FOLLOW_keyValuePairExpr_in_updateKeyspace2009);
            keyValuePairExpr143=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr143.getTree());


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
            // 295:9: -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:295:12: ^( NODE_UPDATE_KEYSPACE keyValuePairExpr )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:298:1: updateColumnFamily : UPDATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr ) ;
    public final CliParser.updateColumnFamily_return updateColumnFamily() throws RecognitionException {
        CliParser.updateColumnFamily_return retval = new CliParser.updateColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UPDATE144=null;
        Token COLUMN145=null;
        Token FAMILY146=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr147 = null;


        CommonTree UPDATE144_tree=null;
        CommonTree COLUMN145_tree=null;
        CommonTree FAMILY146_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:299:5: ( UPDATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:299:7: UPDATE COLUMN FAMILY keyValuePairExpr
            {
            UPDATE144=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_updateColumnFamily2042); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE144);

            COLUMN145=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_updateColumnFamily2044); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN145);

            FAMILY146=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_updateColumnFamily2046); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY146);

            pushFollow(FOLLOW_keyValuePairExpr_in_updateColumnFamily2048);
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
            // 300:9: -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:300:12: ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:303:1: delKeyspace : DROP KEYSPACE keyspace -> ^( NODE_DEL_KEYSPACE keyspace ) ;
    public final CliParser.delKeyspace_return delKeyspace() throws RecognitionException {
        CliParser.delKeyspace_return retval = new CliParser.delKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DROP148=null;
        Token KEYSPACE149=null;
        CliParser.keyspace_return keyspace150 = null;


        CommonTree DROP148_tree=null;
        CommonTree KEYSPACE149_tree=null;
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:304:5: ( DROP KEYSPACE keyspace -> ^( NODE_DEL_KEYSPACE keyspace ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:304:7: DROP KEYSPACE keyspace
            {
            DROP148=(Token)match(input,DROP,FOLLOW_DROP_in_delKeyspace2081); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP148);

            KEYSPACE149=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_delKeyspace2083); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE149);

            pushFollow(FOLLOW_keyspace_in_delKeyspace2085);
            keyspace150=keyspace();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyspace.add(keyspace150.getTree());


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
            // 305:9: -> ^( NODE_DEL_KEYSPACE keyspace )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:305:12: ^( NODE_DEL_KEYSPACE keyspace )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:308:1: delColumnFamily : DROP COLUMN FAMILY columnFamily -> ^( NODE_DEL_COLUMN_FAMILY columnFamily ) ;
    public final CliParser.delColumnFamily_return delColumnFamily() throws RecognitionException {
        CliParser.delColumnFamily_return retval = new CliParser.delColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DROP151=null;
        Token COLUMN152=null;
        Token FAMILY153=null;
        CliParser.columnFamily_return columnFamily154 = null;


        CommonTree DROP151_tree=null;
        CommonTree COLUMN152_tree=null;
        CommonTree FAMILY153_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:309:5: ( DROP COLUMN FAMILY columnFamily -> ^( NODE_DEL_COLUMN_FAMILY columnFamily ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:309:7: DROP COLUMN FAMILY columnFamily
            {
            DROP151=(Token)match(input,DROP,FOLLOW_DROP_in_delColumnFamily2119); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP151);

            COLUMN152=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_delColumnFamily2121); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN152);

            FAMILY153=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_delColumnFamily2123); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY153);

            pushFollow(FOLLOW_columnFamily_in_delColumnFamily2125);
            columnFamily154=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily154.getTree());


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
            // 310:9: -> ^( NODE_DEL_COLUMN_FAMILY columnFamily )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:310:12: ^( NODE_DEL_COLUMN_FAMILY columnFamily )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:313:1: showVersion : SHOW VERSION -> ^( NODE_SHOW_VERSION ) ;
    public final CliParser.showVersion_return showVersion() throws RecognitionException {
        CliParser.showVersion_return retval = new CliParser.showVersion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW155=null;
        Token VERSION156=null;

        CommonTree SHOW155_tree=null;
        CommonTree VERSION156_tree=null;
        RewriteRuleTokenStream stream_VERSION=new RewriteRuleTokenStream(adaptor,"token VERSION");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:314:5: ( SHOW VERSION -> ^( NODE_SHOW_VERSION ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:314:7: SHOW VERSION
            {
            SHOW155=(Token)match(input,SHOW,FOLLOW_SHOW_in_showVersion2159); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW155);

            VERSION156=(Token)match(input,VERSION,FOLLOW_VERSION_in_showVersion2161); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VERSION.add(VERSION156);



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
            // 315:9: -> ^( NODE_SHOW_VERSION )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:315:12: ^( NODE_SHOW_VERSION )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:318:1: showKeyspaces : SHOW KEYSPACES -> ^( NODE_SHOW_KEYSPACES ) ;
    public final CliParser.showKeyspaces_return showKeyspaces() throws RecognitionException {
        CliParser.showKeyspaces_return retval = new CliParser.showKeyspaces_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW157=null;
        Token KEYSPACES158=null;

        CommonTree SHOW157_tree=null;
        CommonTree KEYSPACES158_tree=null;
        RewriteRuleTokenStream stream_KEYSPACES=new RewriteRuleTokenStream(adaptor,"token KEYSPACES");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:319:5: ( SHOW KEYSPACES -> ^( NODE_SHOW_KEYSPACES ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:319:7: SHOW KEYSPACES
            {
            SHOW157=(Token)match(input,SHOW,FOLLOW_SHOW_in_showKeyspaces2193); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW157);

            KEYSPACES158=(Token)match(input,KEYSPACES,FOLLOW_KEYSPACES_in_showKeyspaces2195); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACES.add(KEYSPACES158);



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
            // 320:9: -> ^( NODE_SHOW_KEYSPACES )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:320:12: ^( NODE_SHOW_KEYSPACES )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:323:1: describeTable : DESCRIBE KEYSPACE keyspace -> ^( NODE_DESCRIBE_TABLE keyspace ) ;
    public final CliParser.describeTable_return describeTable() throws RecognitionException {
        CliParser.describeTable_return retval = new CliParser.describeTable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DESCRIBE159=null;
        Token KEYSPACE160=null;
        CliParser.keyspace_return keyspace161 = null;


        CommonTree DESCRIBE159_tree=null;
        CommonTree KEYSPACE160_tree=null;
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:324:5: ( DESCRIBE KEYSPACE keyspace -> ^( NODE_DESCRIBE_TABLE keyspace ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:324:7: DESCRIBE KEYSPACE keyspace
            {
            DESCRIBE159=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeTable2227); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE159);

            KEYSPACE160=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_describeTable2229); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE160);

            pushFollow(FOLLOW_keyspace_in_describeTable2231);
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
            // 325:9: -> ^( NODE_DESCRIBE_TABLE keyspace )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:325:12: ^( NODE_DESCRIBE_TABLE keyspace )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DESCRIBE_TABLE, "NODE_DESCRIBE_TABLE"), root_1);

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
    // $ANTLR end "describeTable"

    public static class useKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "useKeyspace"
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:328:1: useKeyspace : USE keyspace ( username )? ( password )? -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? ) ;
    public final CliParser.useKeyspace_return useKeyspace() throws RecognitionException {
        CliParser.useKeyspace_return retval = new CliParser.useKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token USE162=null;
        CliParser.keyspace_return keyspace163 = null;

        CliParser.username_return username164 = null;

        CliParser.password_return password165 = null;


        CommonTree USE162_tree=null;
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleSubtreeStream stream_username=new RewriteRuleSubtreeStream(adaptor,"rule username");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        RewriteRuleSubtreeStream stream_password=new RewriteRuleSubtreeStream(adaptor,"rule password");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:329:5: ( USE keyspace ( username )? ( password )? -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:329:7: USE keyspace ( username )? ( password )?
            {
            USE162=(Token)match(input,USE,FOLLOW_USE_in_useKeyspace2269); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_USE.add(USE162);

            pushFollow(FOLLOW_keyspace_in_useKeyspace2271);
            keyspace163=keyspace();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyspace.add(keyspace163.getTree());
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:329:20: ( username )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Identifier) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:329:22: username
                    {
                    pushFollow(FOLLOW_username_in_useKeyspace2275);
                    username164=username();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_username.add(username164.getTree());

                    }
                    break;

            }

            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:329:34: ( password )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==StringLiteral) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:329:36: password
                    {
                    pushFollow(FOLLOW_password_in_useKeyspace2282);
                    password165=password();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_password.add(password165.getTree());

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
            // 330:9: -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:330:12: ^( NODE_USE_TABLE keyspace ( username )? ( password )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_USE_TABLE, "NODE_USE_TABLE"), root_1);

                adaptor.addChild(root_1, stream_keyspace.nextTree());
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:330:38: ( username )?
                if ( stream_username.hasNext() ) {
                    adaptor.addChild(root_1, stream_username.nextTree());

                }
                stream_username.reset();
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:330:52: ( password )?
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:334:1: keyValuePairExpr : objectName ( ( AND | WITH ) keyValuePair )* -> ^( NODE_NEW_KEYSPACE_ACCESS objectName ( keyValuePair )* ) ;
    public final CliParser.keyValuePairExpr_return keyValuePairExpr() throws RecognitionException {
        CliParser.keyValuePairExpr_return retval = new CliParser.keyValuePairExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND167=null;
        Token WITH168=null;
        CliParser.objectName_return objectName166 = null;

        CliParser.keyValuePair_return keyValuePair169 = null;


        CommonTree AND167_tree=null;
        CommonTree WITH168_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_objectName=new RewriteRuleSubtreeStream(adaptor,"rule objectName");
        RewriteRuleSubtreeStream stream_keyValuePair=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePair");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:335:5: ( objectName ( ( AND | WITH ) keyValuePair )* -> ^( NODE_NEW_KEYSPACE_ACCESS objectName ( keyValuePair )* ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:335:7: objectName ( ( AND | WITH ) keyValuePair )*
            {
            pushFollow(FOLLOW_objectName_in_keyValuePairExpr2334);
            objectName166=objectName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_objectName.add(objectName166.getTree());
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:335:18: ( ( AND | WITH ) keyValuePair )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==WITH||LA17_0==AND) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:335:20: ( AND | WITH ) keyValuePair
            	    {
            	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:335:20: ( AND | WITH )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==AND) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==WITH) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:335:21: AND
            	            {
            	            AND167=(Token)match(input,AND,FOLLOW_AND_in_keyValuePairExpr2339); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_AND.add(AND167);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:335:27: WITH
            	            {
            	            WITH168=(Token)match(input,WITH,FOLLOW_WITH_in_keyValuePairExpr2343); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_WITH.add(WITH168);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_keyValuePair_in_keyValuePairExpr2346);
            	    keyValuePair169=keyValuePair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_keyValuePair.add(keyValuePair169.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
            // 336:9: -> ^( NODE_NEW_KEYSPACE_ACCESS objectName ( keyValuePair )* )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:336:12: ^( NODE_NEW_KEYSPACE_ACCESS objectName ( keyValuePair )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_NEW_KEYSPACE_ACCESS, "NODE_NEW_KEYSPACE_ACCESS"), root_1);

                adaptor.addChild(root_1, stream_objectName.nextTree());
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:336:50: ( keyValuePair )*
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:339:1: keyValuePair : attr_name '=' attrValue -> attr_name attrValue ;
    public final CliParser.keyValuePair_return keyValuePair() throws RecognitionException {
        CliParser.keyValuePair_return retval = new CliParser.keyValuePair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal171=null;
        CliParser.attr_name_return attr_name170 = null;

        CliParser.attrValue_return attrValue172 = null;


        CommonTree char_literal171_tree=null;
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_attr_name=new RewriteRuleSubtreeStream(adaptor,"rule attr_name");
        RewriteRuleSubtreeStream stream_attrValue=new RewriteRuleSubtreeStream(adaptor,"rule attrValue");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:340:5: ( attr_name '=' attrValue -> attr_name attrValue )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:340:7: attr_name '=' attrValue
            {
            pushFollow(FOLLOW_attr_name_in_keyValuePair2404);
            attr_name170=attr_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attr_name.add(attr_name170.getTree());
            char_literal171=(Token)match(input,85,FOLLOW_85_in_keyValuePair2406); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_85.add(char_literal171);

            pushFollow(FOLLOW_attrValue_in_keyValuePair2408);
            attrValue172=attrValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attrValue.add(attrValue172.getTree());


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
            // 341:6: -> attr_name attrValue
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:344:1: attrValue : ( arrayConstruct | attrValueString | attrValueInt | attrValueDouble );
    public final CliParser.attrValue_return attrValue() throws RecognitionException {
        CliParser.attrValue_return retval = new CliParser.attrValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.arrayConstruct_return arrayConstruct173 = null;

        CliParser.attrValueString_return attrValueString174 = null;

        CliParser.attrValueInt_return attrValueInt175 = null;

        CliParser.attrValueDouble_return attrValueDouble176 = null;



        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:345:5: ( arrayConstruct | attrValueString | attrValueInt | attrValueDouble )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt18=1;
                }
                break;
            case Identifier:
            case StringLiteral:
                {
                alt18=2;
                }
                break;
            case IntegerLiteral:
                {
                alt18=3;
                }
                break;
            case DoubleLiteral:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:345:7: arrayConstruct
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayConstruct_in_attrValue2437);
                    arrayConstruct173=arrayConstruct();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayConstruct173.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:346:7: attrValueString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueString_in_attrValue2445);
                    attrValueString174=attrValueString();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueString174.getTree());

                    }
                    break;
                case 3 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:347:7: attrValueInt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueInt_in_attrValue2453);
                    attrValueInt175=attrValueInt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueInt175.getTree());

                    }
                    break;
                case 4 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:348:7: attrValueDouble
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueDouble_in_attrValue2461);
                    attrValueDouble176=attrValueDouble();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueDouble176.getTree());

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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:352:1: arrayConstruct : '[' ( hashConstruct ( ',' )? )+ ']' -> ^( ARRAY ( hashConstruct )+ ) ;
    public final CliParser.arrayConstruct_return arrayConstruct() throws RecognitionException {
        CliParser.arrayConstruct_return retval = new CliParser.arrayConstruct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal177=null;
        Token char_literal179=null;
        Token char_literal180=null;
        CliParser.hashConstruct_return hashConstruct178 = null;


        CommonTree char_literal177_tree=null;
        CommonTree char_literal179_tree=null;
        CommonTree char_literal180_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_hashConstruct=new RewriteRuleSubtreeStream(adaptor,"rule hashConstruct");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:353:5: ( '[' ( hashConstruct ( ',' )? )+ ']' -> ^( ARRAY ( hashConstruct )+ ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:353:7: '[' ( hashConstruct ( ',' )? )+ ']'
            {
            char_literal177=(Token)match(input,90,FOLLOW_90_in_arrayConstruct2480); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_90.add(char_literal177);

            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:353:11: ( hashConstruct ( ',' )? )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==93) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:353:12: hashConstruct ( ',' )?
            	    {
            	    pushFollow(FOLLOW_hashConstruct_in_arrayConstruct2483);
            	    hashConstruct178=hashConstruct();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hashConstruct.add(hashConstruct178.getTree());
            	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:353:26: ( ',' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==91) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:0:0: ','
            	            {
            	            char_literal179=(Token)match(input,91,FOLLOW_91_in_arrayConstruct2485); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_91.add(char_literal179);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            char_literal180=(Token)match(input,92,FOLLOW_92_in_arrayConstruct2490); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_92.add(char_literal180);



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
            // 354:9: -> ^( ARRAY ( hashConstruct )+ )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:354:12: ^( ARRAY ( hashConstruct )+ )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:357:1: hashConstruct : '{' hashElementPair ( ',' hashElementPair )* '}' -> ^( HASH ( hashElementPair )+ ) ;
    public final CliParser.hashConstruct_return hashConstruct() throws RecognitionException {
        CliParser.hashConstruct_return retval = new CliParser.hashConstruct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal181=null;
        Token char_literal183=null;
        Token char_literal185=null;
        CliParser.hashElementPair_return hashElementPair182 = null;

        CliParser.hashElementPair_return hashElementPair184 = null;


        CommonTree char_literal181_tree=null;
        CommonTree char_literal183_tree=null;
        CommonTree char_literal185_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_hashElementPair=new RewriteRuleSubtreeStream(adaptor,"rule hashElementPair");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:358:5: ( '{' hashElementPair ( ',' hashElementPair )* '}' -> ^( HASH ( hashElementPair )+ ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:358:7: '{' hashElementPair ( ',' hashElementPair )* '}'
            {
            char_literal181=(Token)match(input,93,FOLLOW_93_in_hashConstruct2528); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(char_literal181);

            pushFollow(FOLLOW_hashElementPair_in_hashConstruct2530);
            hashElementPair182=hashElementPair();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hashElementPair.add(hashElementPair182.getTree());
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:358:27: ( ',' hashElementPair )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==91) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:358:28: ',' hashElementPair
            	    {
            	    char_literal183=(Token)match(input,91,FOLLOW_91_in_hashConstruct2533); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_91.add(char_literal183);

            	    pushFollow(FOLLOW_hashElementPair_in_hashConstruct2535);
            	    hashElementPair184=hashElementPair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hashElementPair.add(hashElementPair184.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            char_literal185=(Token)match(input,94,FOLLOW_94_in_hashConstruct2539); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_94.add(char_literal185);



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
            // 359:9: -> ^( HASH ( hashElementPair )+ )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:359:12: ^( HASH ( hashElementPair )+ )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:362:1: hashElementPair : rowKey ':' value -> ^( PAIR rowKey value ) ;
    public final CliParser.hashElementPair_return hashElementPair() throws RecognitionException {
        CliParser.hashElementPair_return retval = new CliParser.hashElementPair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal187=null;
        CliParser.rowKey_return rowKey186 = null;

        CliParser.value_return value188 = null;


        CommonTree char_literal187_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_rowKey=new RewriteRuleSubtreeStream(adaptor,"rule rowKey");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:363:5: ( rowKey ':' value -> ^( PAIR rowKey value ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:363:7: rowKey ':' value
            {
            pushFollow(FOLLOW_rowKey_in_hashElementPair2575);
            rowKey186=rowKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowKey.add(rowKey186.getTree());
            char_literal187=(Token)match(input,95,FOLLOW_95_in_hashElementPair2577); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_95.add(char_literal187);

            pushFollow(FOLLOW_value_in_hashElementPair2579);
            value188=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value188.getTree());


            // AST REWRITE
            // elements: rowKey, value
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 364:9: -> ^( PAIR rowKey value )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:364:12: ^( PAIR rowKey value )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:367:1: columnFamilyExpr : columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )? -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? ) ;
    public final CliParser.columnFamilyExpr_return columnFamilyExpr() throws RecognitionException {
        CliParser.columnFamilyExpr_return retval = new CliParser.columnFamilyExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal190=null;
        Token char_literal192=null;
        Token char_literal193=null;
        Token char_literal194=null;
        Token char_literal195=null;
        Token char_literal196=null;
        CliParser.columnOrSuperColumn_return column = null;

        CliParser.columnOrSuperColumn_return super_column = null;

        CliParser.columnFamily_return columnFamily189 = null;

        CliParser.rowKey_return rowKey191 = null;


        CommonTree char_literal190_tree=null;
        CommonTree char_literal192_tree=null;
        CommonTree char_literal193_tree=null;
        CommonTree char_literal194_tree=null;
        CommonTree char_literal195_tree=null;
        CommonTree char_literal196_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_rowKey=new RewriteRuleSubtreeStream(adaptor,"rule rowKey");
        RewriteRuleSubtreeStream stream_columnOrSuperColumn=new RewriteRuleSubtreeStream(adaptor,"rule columnOrSuperColumn");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:368:5: ( columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )? -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:368:7: columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )?
            {
            pushFollow(FOLLOW_columnFamily_in_columnFamilyExpr2614);
            columnFamily189=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily189.getTree());
            char_literal190=(Token)match(input,90,FOLLOW_90_in_columnFamilyExpr2616); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_90.add(char_literal190);

            pushFollow(FOLLOW_rowKey_in_columnFamilyExpr2618);
            rowKey191=rowKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowKey.add(rowKey191.getTree());
            char_literal192=(Token)match(input,92,FOLLOW_92_in_columnFamilyExpr2620); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_92.add(char_literal192);

            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:369:9: ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==90) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:369:11: '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )?
                    {
                    char_literal193=(Token)match(input,90,FOLLOW_90_in_columnFamilyExpr2633); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(char_literal193);

                    pushFollow(FOLLOW_columnOrSuperColumn_in_columnFamilyExpr2637);
                    column=columnOrSuperColumn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(column.getTree());
                    char_literal194=(Token)match(input,92,FOLLOW_92_in_columnFamilyExpr2639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(char_literal194);

                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:370:13: ( '[' super_column= columnOrSuperColumn ']' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==90) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:370:14: '[' super_column= columnOrSuperColumn ']'
                            {
                            char_literal195=(Token)match(input,90,FOLLOW_90_in_columnFamilyExpr2655); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_90.add(char_literal195);

                            pushFollow(FOLLOW_columnOrSuperColumn_in_columnFamilyExpr2659);
                            super_column=columnOrSuperColumn();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(super_column.getTree());
                            char_literal196=(Token)match(input,92,FOLLOW_92_in_columnFamilyExpr2661); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_92.add(char_literal196);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: column, super_column, rowKey, columnFamily
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
            // 372:7: -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:372:10: ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_COLUMN_ACCESS, "NODE_COLUMN_ACCESS"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                adaptor.addChild(root_1, stream_rowKey.nextTree());
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:372:51: ( $column ( $super_column)? )?
                if ( stream_column.hasNext()||stream_super_column.hasNext() ) {
                    adaptor.addChild(root_1, stream_column.nextTree());
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:372:60: ( $super_column)?
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:375:1: keyRangeExpr : '[' ( ( startKey )? ':' ( endKey )? )? ']' -> ^( NODE_KEY_RANGE ( startKey )? ( endKey )? ) ;
    public final CliParser.keyRangeExpr_return keyRangeExpr() throws RecognitionException {
        CliParser.keyRangeExpr_return retval = new CliParser.keyRangeExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal197=null;
        Token char_literal199=null;
        Token char_literal201=null;
        CliParser.startKey_return startKey198 = null;

        CliParser.endKey_return endKey200 = null;


        CommonTree char_literal197_tree=null;
        CommonTree char_literal199_tree=null;
        CommonTree char_literal201_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_endKey=new RewriteRuleSubtreeStream(adaptor,"rule endKey");
        RewriteRuleSubtreeStream stream_startKey=new RewriteRuleSubtreeStream(adaptor,"rule startKey");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:376:5: ( '[' ( ( startKey )? ':' ( endKey )? )? ']' -> ^( NODE_KEY_RANGE ( startKey )? ( endKey )? ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:376:10: '[' ( ( startKey )? ':' ( endKey )? )? ']'
            {
            char_literal197=(Token)match(input,90,FOLLOW_90_in_keyRangeExpr2724); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_90.add(char_literal197);

            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:376:14: ( ( startKey )? ':' ( endKey )? )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=Identifier && LA26_0<=StringLiteral)||LA26_0==95) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:376:16: ( startKey )? ':' ( endKey )?
                    {
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:376:16: ( startKey )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=Identifier && LA24_0<=StringLiteral)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:0:0: startKey
                            {
                            pushFollow(FOLLOW_startKey_in_keyRangeExpr2728);
                            startKey198=startKey();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_startKey.add(startKey198.getTree());

                            }
                            break;

                    }

                    char_literal199=(Token)match(input,95,FOLLOW_95_in_keyRangeExpr2731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_95.add(char_literal199);

                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:376:30: ( endKey )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=Identifier && LA25_0<=StringLiteral)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:0:0: endKey
                            {
                            pushFollow(FOLLOW_endKey_in_keyRangeExpr2733);
                            endKey200=endKey();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_endKey.add(endKey200.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal201=(Token)match(input,92,FOLLOW_92_in_keyRangeExpr2739); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_92.add(char_literal201);



            // AST REWRITE
            // elements: endKey, startKey
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 377:7: -> ^( NODE_KEY_RANGE ( startKey )? ( endKey )? )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:377:10: ^( NODE_KEY_RANGE ( startKey )? ( endKey )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_KEY_RANGE, "NODE_KEY_RANGE"), root_1);

                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:377:27: ( startKey )?
                if ( stream_startKey.hasNext() ) {
                    adaptor.addChild(root_1, stream_startKey.nextTree());

                }
                stream_startKey.reset();
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:377:37: ( endKey )?
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:380:1: columnName : Identifier ;
    public final CliParser.columnName_return columnName() throws RecognitionException {
        CliParser.columnName_return retval = new CliParser.columnName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier202=null;

        CommonTree Identifier202_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:381:2: ( Identifier )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:381:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier202=(Token)match(input,Identifier,FOLLOW_Identifier_in_columnName2771); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier202_tree = (CommonTree)adaptor.create(Identifier202);
            adaptor.addChild(root_0, Identifier202_tree);
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:384:1: attr_name : Identifier ;
    public final CliParser.attr_name_return attr_name() throws RecognitionException {
        CliParser.attr_name_return retval = new CliParser.attr_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier203=null;

        CommonTree Identifier203_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:385:2: ( Identifier )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:385:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier203=(Token)match(input,Identifier,FOLLOW_Identifier_in_attr_name2782); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier203_tree = (CommonTree)adaptor.create(Identifier203);
            adaptor.addChild(root_0, Identifier203_tree);
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:388:1: attrValueString : ( Identifier | StringLiteral ) ;
    public final CliParser.attrValueString_return attrValueString() throws RecognitionException {
        CliParser.attrValueString_return retval = new CliParser.attrValueString_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set204=null;

        CommonTree set204_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:389:2: ( ( Identifier | StringLiteral ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:389:4: ( Identifier | StringLiteral )
            {
            root_0 = (CommonTree)adaptor.nil();

            set204=(Token)input.LT(1);
            if ( (input.LA(1)>=Identifier && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set204));
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:392:1: attrValueInt : IntegerLiteral ;
    public final CliParser.attrValueInt_return attrValueInt() throws RecognitionException {
        CliParser.attrValueInt_return retval = new CliParser.attrValueInt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IntegerLiteral205=null;

        CommonTree IntegerLiteral205_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:393:2: ( IntegerLiteral )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:393:4: IntegerLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            IntegerLiteral205=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_attrValueInt2816); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IntegerLiteral205_tree = (CommonTree)adaptor.create(IntegerLiteral205);
            adaptor.addChild(root_0, IntegerLiteral205_tree);
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:396:1: attrValueDouble : DoubleLiteral ;
    public final CliParser.attrValueDouble_return attrValueDouble() throws RecognitionException {
        CliParser.attrValueDouble_return retval = new CliParser.attrValueDouble_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DoubleLiteral206=null;

        CommonTree DoubleLiteral206_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:397:2: ( DoubleLiteral )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:397:4: DoubleLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            DoubleLiteral206=(Token)match(input,DoubleLiteral,FOLLOW_DoubleLiteral_in_attrValueDouble2827); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DoubleLiteral206_tree = (CommonTree)adaptor.create(DoubleLiteral206);
            adaptor.addChild(root_0, DoubleLiteral206_tree);
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:400:1: objectName : Identifier ;
    public final CliParser.objectName_return objectName() throws RecognitionException {
        CliParser.objectName_return retval = new CliParser.objectName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier207=null;

        CommonTree Identifier207_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:401:2: ( Identifier )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:401:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier207=(Token)match(input,Identifier,FOLLOW_Identifier_in_objectName2840); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier207_tree = (CommonTree)adaptor.create(Identifier207);
            adaptor.addChild(root_0, Identifier207_tree);
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:404:1: keyspace : Identifier ;
    public final CliParser.keyspace_return keyspace() throws RecognitionException {
        CliParser.keyspace_return retval = new CliParser.keyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier208=null;

        CommonTree Identifier208_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:405:2: ( Identifier )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:405:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier208=(Token)match(input,Identifier,FOLLOW_Identifier_in_keyspace2851); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier208_tree = (CommonTree)adaptor.create(Identifier208);
            adaptor.addChild(root_0, Identifier208_tree);
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:408:1: replica_placement_strategy : StringLiteral ;
    public final CliParser.replica_placement_strategy_return replica_placement_strategy() throws RecognitionException {
        CliParser.replica_placement_strategy_return retval = new CliParser.replica_placement_strategy_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral209=null;

        CommonTree StringLiteral209_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:409:2: ( StringLiteral )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:409:4: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral209=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_replica_placement_strategy2862); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral209_tree = (CommonTree)adaptor.create(StringLiteral209);
            adaptor.addChild(root_0, StringLiteral209_tree);
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:412:1: replication_factor : IntegerLiteral ;
    public final CliParser.replication_factor_return replication_factor() throws RecognitionException {
        CliParser.replication_factor_return retval = new CliParser.replication_factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IntegerLiteral210=null;

        CommonTree IntegerLiteral210_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:413:2: ( IntegerLiteral )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:413:4: IntegerLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            IntegerLiteral210=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_replication_factor2873); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IntegerLiteral210_tree = (CommonTree)adaptor.create(IntegerLiteral210);
            adaptor.addChild(root_0, IntegerLiteral210_tree);
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:416:1: keyspaceNewName : Identifier ;
    public final CliParser.keyspaceNewName_return keyspaceNewName() throws RecognitionException {
        CliParser.keyspaceNewName_return retval = new CliParser.keyspaceNewName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier211=null;

        CommonTree Identifier211_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:417:2: ( Identifier )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:417:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier211=(Token)match(input,Identifier,FOLLOW_Identifier_in_keyspaceNewName2884); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier211_tree = (CommonTree)adaptor.create(Identifier211);
            adaptor.addChild(root_0, Identifier211_tree);
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:420:1: comparator : StringLiteral ;
    public final CliParser.comparator_return comparator() throws RecognitionException {
        CliParser.comparator_return retval = new CliParser.comparator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral212=null;

        CommonTree StringLiteral212_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:421:2: ( StringLiteral )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:421:4: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral212=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_comparator2895); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral212_tree = (CommonTree)adaptor.create(StringLiteral212);
            adaptor.addChild(root_0, StringLiteral212_tree);
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:424:1: command : Identifier ;
    public final CliParser.command_return command() throws RecognitionException {
        CliParser.command_return retval = new CliParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier213=null;

        CommonTree Identifier213_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:424:9: ( Identifier )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:424:11: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier213=(Token)match(input,Identifier,FOLLOW_Identifier_in_command2911); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier213_tree = (CommonTree)adaptor.create(Identifier213);
            adaptor.addChild(root_0, Identifier213_tree);
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:427:1: newColumnFamily : Identifier ;
    public final CliParser.newColumnFamily_return newColumnFamily() throws RecognitionException {
        CliParser.newColumnFamily_return retval = new CliParser.newColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier214=null;

        CommonTree Identifier214_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:428:2: ( Identifier )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:428:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier214=(Token)match(input,Identifier,FOLLOW_Identifier_in_newColumnFamily2922); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier214_tree = (CommonTree)adaptor.create(Identifier214);
            adaptor.addChild(root_0, Identifier214_tree);
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:431:1: username : Identifier ;
    public final CliParser.username_return username() throws RecognitionException {
        CliParser.username_return retval = new CliParser.username_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier215=null;

        CommonTree Identifier215_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:431:9: ( Identifier )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:431:11: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier215=(Token)match(input,Identifier,FOLLOW_Identifier_in_username2931); if (state.failed) return retval;
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
    // $ANTLR end "username"

    public static class password_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "password"
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:434:1: password : StringLiteral ;
    public final CliParser.password_return password() throws RecognitionException {
        CliParser.password_return retval = new CliParser.password_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral216=null;

        CommonTree StringLiteral216_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:434:9: ( StringLiteral )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:434:11: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral216=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_password2940); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral216_tree = (CommonTree)adaptor.create(StringLiteral216);
            adaptor.addChild(root_0, StringLiteral216_tree);
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:437:1: columnFamily : Identifier ;
    public final CliParser.columnFamily_return columnFamily() throws RecognitionException {
        CliParser.columnFamily_return retval = new CliParser.columnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier217=null;

        CommonTree Identifier217_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:438:2: ( Identifier )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:438:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier217=(Token)match(input,Identifier,FOLLOW_Identifier_in_columnFamily2951); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier217_tree = (CommonTree)adaptor.create(Identifier217);
            adaptor.addChild(root_0, Identifier217_tree);
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:441:1: rowKey : ( Identifier | StringLiteral | IntegerLiteral | functionCall ) ;
    public final CliParser.rowKey_return rowKey() throws RecognitionException {
        CliParser.rowKey_return retval = new CliParser.rowKey_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier218=null;
        Token StringLiteral219=null;
        Token IntegerLiteral220=null;
        CliParser.functionCall_return functionCall221 = null;


        CommonTree Identifier218_tree=null;
        CommonTree StringLiteral219_tree=null;
        CommonTree IntegerLiteral220_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:442:5: ( ( Identifier | StringLiteral | IntegerLiteral | functionCall ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:442:8: ( Identifier | StringLiteral | IntegerLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:442:8: ( Identifier | StringLiteral | IntegerLiteral | functionCall )
            int alt27=4;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==96) ) {
                    alt27=4;
                }
                else if ( (LA27_1==92||LA27_1==95) ) {
                    alt27=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
                }
                break;
            case StringLiteral:
                {
                alt27=2;
                }
                break;
            case IntegerLiteral:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:442:9: Identifier
                    {
                    Identifier218=(Token)match(input,Identifier,FOLLOW_Identifier_in_rowKey2968); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier218_tree = (CommonTree)adaptor.create(Identifier218);
                    adaptor.addChild(root_0, Identifier218_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:442:22: StringLiteral
                    {
                    StringLiteral219=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_rowKey2972); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral219_tree = (CommonTree)adaptor.create(StringLiteral219);
                    adaptor.addChild(root_0, StringLiteral219_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:442:38: IntegerLiteral
                    {
                    IntegerLiteral220=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_rowKey2976); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerLiteral220_tree = (CommonTree)adaptor.create(IntegerLiteral220);
                    adaptor.addChild(root_0, IntegerLiteral220_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:442:55: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_rowKey2980);
                    functionCall221=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall221.getTree());

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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:445:1: value : ( Identifier | IntegerLiteral | StringLiteral | functionCall ) ;
    public final CliParser.value_return value() throws RecognitionException {
        CliParser.value_return retval = new CliParser.value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier222=null;
        Token IntegerLiteral223=null;
        Token StringLiteral224=null;
        CliParser.functionCall_return functionCall225 = null;


        CommonTree Identifier222_tree=null;
        CommonTree IntegerLiteral223_tree=null;
        CommonTree StringLiteral224_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:446:5: ( ( Identifier | IntegerLiteral | StringLiteral | functionCall ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:446:7: ( Identifier | IntegerLiteral | StringLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:446:7: ( Identifier | IntegerLiteral | StringLiteral | functionCall )
            int alt28=4;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==96) ) {
                    alt28=4;
                }
                else if ( (LA28_1==EOF||LA28_1==SEMICOLON||LA28_1==WITH||LA28_1==AND||LA28_1==LIMIT||LA28_1==91||LA28_1==94) ) {
                    alt28=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case IntegerLiteral:
                {
                alt28=2;
                }
                break;
            case StringLiteral:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:446:8: Identifier
                    {
                    Identifier222=(Token)match(input,Identifier,FOLLOW_Identifier_in_value2997); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier222_tree = (CommonTree)adaptor.create(Identifier222);
                    adaptor.addChild(root_0, Identifier222_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:446:21: IntegerLiteral
                    {
                    IntegerLiteral223=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_value3001); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerLiteral223_tree = (CommonTree)adaptor.create(IntegerLiteral223);
                    adaptor.addChild(root_0, IntegerLiteral223_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:446:38: StringLiteral
                    {
                    StringLiteral224=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_value3005); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral224_tree = (CommonTree)adaptor.create(StringLiteral224);
                    adaptor.addChild(root_0, StringLiteral224_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:446:54: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_value3009);
                    functionCall225=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall225.getTree());

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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:449:1: functionCall : functionName= Identifier '(' ( functionArgument )? ')' -> ^( FUNCTION_CALL $functionName ( functionArgument )? ) ;
    public final CliParser.functionCall_return functionCall() throws RecognitionException {
        CliParser.functionCall_return retval = new CliParser.functionCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token functionName=null;
        Token char_literal226=null;
        Token char_literal228=null;
        CliParser.functionArgument_return functionArgument227 = null;


        CommonTree functionName_tree=null;
        CommonTree char_literal226_tree=null;
        CommonTree char_literal228_tree=null;
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_functionArgument=new RewriteRuleSubtreeStream(adaptor,"rule functionArgument");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:450:5: (functionName= Identifier '(' ( functionArgument )? ')' -> ^( FUNCTION_CALL $functionName ( functionArgument )? ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:450:7: functionName= Identifier '(' ( functionArgument )? ')'
            {
            functionName=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall3027); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(functionName);

            char_literal226=(Token)match(input,96,FOLLOW_96_in_functionCall3029); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_96.add(char_literal226);

            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:450:35: ( functionArgument )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=IntegerLiteral && LA29_0<=StringLiteral)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:0:0: functionArgument
                    {
                    pushFollow(FOLLOW_functionArgument_in_functionCall3031);
                    functionArgument227=functionArgument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionArgument.add(functionArgument227.getTree());

                    }
                    break;

            }

            char_literal228=(Token)match(input,97,FOLLOW_97_in_functionCall3034); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_97.add(char_literal228);



            // AST REWRITE
            // elements: functionArgument, functionName
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
            // 451:9: -> ^( FUNCTION_CALL $functionName ( functionArgument )? )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:451:12: ^( FUNCTION_CALL $functionName ( functionArgument )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

                adaptor.addChild(root_1, stream_functionName.nextNode());
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:451:42: ( functionArgument )?
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:454:1: functionArgument : ( Identifier | StringLiteral | IntegerLiteral );
    public final CliParser.functionArgument_return functionArgument() throws RecognitionException {
        CliParser.functionArgument_return retval = new CliParser.functionArgument_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set229=null;

        CommonTree set229_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:455:5: ( Identifier | StringLiteral | IntegerLiteral )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set229=(Token)input.LT(1);
            if ( (input.LA(1)>=IntegerLiteral && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set229));
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:458:1: startKey : ( Identifier | StringLiteral ) ;
    public final CliParser.startKey_return startKey() throws RecognitionException {
        CliParser.startKey_return retval = new CliParser.startKey_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set230=null;

        CommonTree set230_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:459:5: ( ( Identifier | StringLiteral ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:459:7: ( Identifier | StringLiteral )
            {
            root_0 = (CommonTree)adaptor.nil();

            set230=(Token)input.LT(1);
            if ( (input.LA(1)>=Identifier && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set230));
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:462:1: endKey : ( Identifier | StringLiteral ) ;
    public final CliParser.endKey_return endKey() throws RecognitionException {
        CliParser.endKey_return retval = new CliParser.endKey_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set231=null;

        CommonTree set231_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:463:5: ( ( Identifier | StringLiteral ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:463:7: ( Identifier | StringLiteral )
            {
            root_0 = (CommonTree)adaptor.nil();

            set231=(Token)input.LT(1);
            if ( (input.LA(1)>=Identifier && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set231));
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:466:1: columnOrSuperColumn : ( Identifier | IntegerLiteral | StringLiteral | functionCall ) ;
    public final CliParser.columnOrSuperColumn_return columnOrSuperColumn() throws RecognitionException {
        CliParser.columnOrSuperColumn_return retval = new CliParser.columnOrSuperColumn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier232=null;
        Token IntegerLiteral233=null;
        Token StringLiteral234=null;
        CliParser.functionCall_return functionCall235 = null;


        CommonTree Identifier232_tree=null;
        CommonTree IntegerLiteral233_tree=null;
        CommonTree StringLiteral234_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:467:2: ( ( Identifier | IntegerLiteral | StringLiteral | functionCall ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:467:4: ( Identifier | IntegerLiteral | StringLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:467:4: ( Identifier | IntegerLiteral | StringLiteral | functionCall )
            int alt30=4;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==96) ) {
                    alt30=4;
                }
                else if ( ((LA30_1>=85 && LA30_1<=89)||LA30_1==92) ) {
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
            case IntegerLiteral:
                {
                alt30=2;
                }
                break;
            case StringLiteral:
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
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:467:5: Identifier
                    {
                    Identifier232=(Token)match(input,Identifier,FOLLOW_Identifier_in_columnOrSuperColumn3136); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier232_tree = (CommonTree)adaptor.create(Identifier232);
                    adaptor.addChild(root_0, Identifier232_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:467:18: IntegerLiteral
                    {
                    IntegerLiteral233=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_columnOrSuperColumn3140); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerLiteral233_tree = (CommonTree)adaptor.create(IntegerLiteral233);
                    adaptor.addChild(root_0, IntegerLiteral233_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:467:35: StringLiteral
                    {
                    StringLiteral234=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_columnOrSuperColumn3144); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral234_tree = (CommonTree)adaptor.create(StringLiteral234);
                    adaptor.addChild(root_0, StringLiteral234_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:467:51: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_columnOrSuperColumn3148);
                    functionCall235=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall235.getTree());

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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:470:1: host : host_name -> ^( NODE_ID_LIST host_name ) ;
    public final CliParser.host_return host() throws RecognitionException {
        CliParser.host_return retval = new CliParser.host_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.host_name_return host_name236 = null;


        RewriteRuleSubtreeStream stream_host_name=new RewriteRuleSubtreeStream(adaptor,"rule host_name");
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:471:5: ( host_name -> ^( NODE_ID_LIST host_name ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:471:7: host_name
            {
            pushFollow(FOLLOW_host_name_in_host3164);
            host_name236=host_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_host_name.add(host_name236.getTree());


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
            // 472:9: -> ^( NODE_ID_LIST host_name )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:472:12: ^( NODE_ID_LIST host_name )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:475:1: host_name : Identifier ( '.' Identifier )* ;
    public final CliParser.host_name_return host_name() throws RecognitionException {
        CliParser.host_name_return retval = new CliParser.host_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier237=null;
        Token char_literal238=null;
        Token Identifier239=null;

        CommonTree Identifier237_tree=null;
        CommonTree char_literal238_tree=null;
        CommonTree Identifier239_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:476:2: ( Identifier ( '.' Identifier )* )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:476:4: Identifier ( '.' Identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier237=(Token)match(input,Identifier,FOLLOW_Identifier_in_host_name3191); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier237_tree = (CommonTree)adaptor.create(Identifier237);
            adaptor.addChild(root_0, Identifier237_tree);
            }
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:476:15: ( '.' Identifier )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==98) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:476:16: '.' Identifier
            	    {
            	    char_literal238=(Token)match(input,98,FOLLOW_98_in_host_name3194); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal238_tree = (CommonTree)adaptor.create(char_literal238);
            	    adaptor.addChild(root_0, char_literal238_tree);
            	    }
            	    Identifier239=(Token)match(input,Identifier,FOLLOW_Identifier_in_host_name3196); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Identifier239_tree = (CommonTree)adaptor.create(Identifier239);
            	    adaptor.addChild(root_0, Identifier239_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:479:1: ip_address : IP_ADDRESS -> ^( NODE_ID_LIST IP_ADDRESS ) ;
    public final CliParser.ip_address_return ip_address() throws RecognitionException {
        CliParser.ip_address_return retval = new CliParser.ip_address_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IP_ADDRESS240=null;

        CommonTree IP_ADDRESS240_tree=null;
        RewriteRuleTokenStream stream_IP_ADDRESS=new RewriteRuleTokenStream(adaptor,"token IP_ADDRESS");

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:480:2: ( IP_ADDRESS -> ^( NODE_ID_LIST IP_ADDRESS ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:480:4: IP_ADDRESS
            {
            IP_ADDRESS240=(Token)match(input,IP_ADDRESS,FOLLOW_IP_ADDRESS_in_ip_address3210); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IP_ADDRESS.add(IP_ADDRESS240);



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
            // 481:6: -> ^( NODE_ID_LIST IP_ADDRESS )
            {
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:481:9: ^( NODE_ID_LIST IP_ADDRESS )
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
    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:485:1: port : IntegerLiteral ;
    public final CliParser.port_return port() throws RecognitionException {
        CliParser.port_return retval = new CliParser.port_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IntegerLiteral241=null;

        CommonTree IntegerLiteral241_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:486:5: ( IntegerLiteral )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:486:7: IntegerLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            IntegerLiteral241=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_port3240); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IntegerLiteral241_tree = (CommonTree)adaptor.create(IntegerLiteral241);
            adaptor.addChild(root_0, IntegerLiteral241_tree);
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
    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA2_eotS =
        "\30\uffff";
    static final String DFA2_eofS =
        "\1\21\27\uffff";
    static final String DFA2_minS =
        "\1\50\4\uffff\3\55\20\uffff";
    static final String DFA2_maxS =
        "\1\122\4\uffff\3\67\20\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1"+
        "\21\1\22\1\23\1\24\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA2_specialS =
        "\30\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\21\1\1\1\13\1\10\1\4\1\uffff\2\2\1\15\4\uffff\1\5\1\6\2\uffff"+
            "\1\7\1\12\1\14\1\11\1\3\1\16\1\17\1\20\21\uffff\1\13",
            "",
            "",
            "",
            "",
            "\1\22\11\uffff\1\23",
            "\1\24\11\uffff\1\25",
            "\1\27\11\uffff\1\26",
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
            return "136:1: statement : ( connectStatement | exitStatement | countStatement | describeTable | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | delStatement | getStatement | helpStatement | setStatement | showStatement | listStatement | truncateStatement | assumeStatement | -> ^( NODE_NO_OP ) );";
        }
    }
    static final String DFA4_eotS =
        "\36\uffff";
    static final String DFA4_eofS =
        "\1\uffff\1\24\34\uffff";
    static final String DFA4_minS =
        "\1\52\1\50\7\uffff\1\61\3\55\21\uffff";
    static final String DFA4_maxS =
        "\1\122\1\100\7\uffff\1\64\3\67\21\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\30\1\1\1\2\1\3\1\4\1\5\1\6\4\uffff\1\20\1\21\1\22\1\23"+
        "\1\24\1\25\1\26\1\27\1\7\1\10\1\11\1\12\1\14\1\13\1\15\1\16\1\17";
    static final String DFA4_specialS =
        "\36\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\47\uffff\1\2",
            "\1\24\1\4\1\3\1\5\1\6\1\uffff\1\7\1\10\1\11\4\uffff\1\12\1"+
            "\13\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\1\uffff\1\26\1\27",
            "\1\30\11\uffff\1\31",
            "\1\32\11\uffff\1\33",
            "\1\34\11\uffff\1\35",
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "166:1: helpStatement : ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP DESCRIBE KEYSPACE -> ^( NODE_HELP NODE_DESCRIBE_TABLE ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW CLUSTER NAME -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) );";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_root379 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_root381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_root384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connectStatement_in_statement400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitStatement_in_statement408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStatement_in_statement416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_describeTable_in_statement424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addKeyspace_in_statement432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addColumnFamily_in_statement440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateKeyspace_in_statement448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateColumnFamily_in_statement456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delColumnFamily_in_statement464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delKeyspace_in_statement472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useKeyspace_in_statement480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delStatement_in_statement488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getStatement_in_statement496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_helpStatement_in_statement504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setStatement_in_statement512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showStatement_in_statement520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listStatement_in_statement528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_truncateStatement_in_statement536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assumeStatement_in_statement544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONNECT_in_connectStatement573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_host_in_connectStatement575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_connectStatement577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_port_in_connectStatement579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONNECT_in_connectStatement606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ip_address_in_connectStatement608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_connectStatement610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_port_in_connectStatement612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement648 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_HELP_in_helpStatement650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement675 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_CONNECT_in_helpStatement677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement702 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_USE_in_helpStatement704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement729 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_DESCRIBE_in_helpStatement731 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement758 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_EXIT_in_helpStatement760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement785 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_QUIT_in_helpStatement787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement812 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement814 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_CLUSTER_in_helpStatement816 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_NAME_in_helpStatement818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement843 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement845 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KEYSPACES_in_helpStatement847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement872 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement874 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_VERSION_in_helpStatement876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement901 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_CREATE_in_helpStatement903 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement930 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_UPDATE_in_helpStatement932 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement958 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_CREATE_in_helpStatement960 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement962 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement989 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_UPDATE_in_helpStatement991 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement993 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1019 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_DROP_in_helpStatement1021 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1048 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_DROP_in_helpStatement1050 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement1052 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1079 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_GET_in_helpStatement1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1106 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_SET_in_helpStatement1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1133 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_DEL_in_helpStatement1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1160 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_COUNT_in_helpStatement1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1187 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LIST_in_helpStatement1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1214 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_TRUNCATE_in_helpStatement1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ASSUME_in_helpStatement1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_helpStatement1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUIT_in_exitStatement1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_exitStatement1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getStatement1361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_getStatement1363 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_getStatement1366 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_typeIdentifier_in_getStatement1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getStatement1406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_columnFamily_in_getStatement1408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_getStatement1410 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_getCondition_in_getStatement1412 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000840L});
    public static final BitSet FOLLOW_AND_in_getStatement1415 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_getCondition_in_getStatement1417 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000840L});
    public static final BitSet FOLLOW_LIMIT_in_getStatement1422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_getStatement1426 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_getCondition1477 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_operator_in_getCondition1479 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_value_in_getCondition1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeIdentifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setStatement1577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_setStatement1579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_setStatement1581 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_value_in_setStatement1585 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_WITH_in_setStatement1588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_TTL_in_setStatement1590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_setStatement1592 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_value_in_setStatement1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_countStatement1642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_countStatement1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEL_in_delStatement1678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_delStatement1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showClusterName_in_showStatement1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showVersion_in_showStatement1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showKeyspaces_in_showStatement1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_listStatement1747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_columnFamily_in_listStatement1749 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000800L});
    public static final BitSet FOLLOW_keyRangeExpr_in_listStatement1751 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_LIMIT_in_listStatement1755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_listStatement1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUNCATE_in_truncateStatement1805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_columnFamily_in_truncateStatement1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSUME_in_assumeStatement1840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_columnFamily_in_assumeStatement1842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_assumeStatement1846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_assumeStatement1848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_assumeStatement1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showClusterName1891 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_CLUSTER_in_showClusterName1893 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_NAME_in_showClusterName1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_addKeyspace1927 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_addKeyspace1929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_addKeyspace1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_addColumnFamily1965 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_addColumnFamily1967 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_addColumnFamily1969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_addColumnFamily1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_updateKeyspace2005 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_updateKeyspace2007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_updateKeyspace2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_updateColumnFamily2042 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_updateColumnFamily2044 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_updateColumnFamily2046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_updateColumnFamily2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_delKeyspace2081 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_delKeyspace2083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_keyspace_in_delKeyspace2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_delColumnFamily2119 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_delColumnFamily2121 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_delColumnFamily2123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_columnFamily_in_delColumnFamily2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showVersion2159 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_VERSION_in_showVersion2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showKeyspaces2193 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KEYSPACES_in_showKeyspaces2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeTable2227 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_describeTable2229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_keyspace_in_describeTable2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_useKeyspace2269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_keyspace_in_useKeyspace2271 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_username_in_useKeyspace2275 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_password_in_useKeyspace2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectName_in_keyValuePairExpr2334 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_AND_in_keyValuePairExpr2339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_WITH_in_keyValuePairExpr2343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_keyValuePair_in_keyValuePairExpr2346 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_attr_name_in_keyValuePair2404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_keyValuePair2406 = new BitSet(new long[]{0x0000000000000000L,0x000000000400008EL});
    public static final BitSet FOLLOW_attrValue_in_keyValuePair2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayConstruct_in_attrValue2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueString_in_attrValue2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueInt_in_attrValue2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueDouble_in_attrValue2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_arrayConstruct2480 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_hashConstruct_in_arrayConstruct2483 = new BitSet(new long[]{0x0000000000000000L,0x0000000038000000L});
    public static final BitSet FOLLOW_91_in_arrayConstruct2485 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_92_in_arrayConstruct2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_hashConstruct2528 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_hashElementPair_in_hashConstruct2530 = new BitSet(new long[]{0x0000000000000000L,0x0000000048000000L});
    public static final BitSet FOLLOW_91_in_hashConstruct2533 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_hashElementPair_in_hashConstruct2535 = new BitSet(new long[]{0x0000000000000000L,0x0000000048000000L});
    public static final BitSet FOLLOW_94_in_hashConstruct2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rowKey_in_hashElementPair2575 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_hashElementPair2577 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_value_in_hashElementPair2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnFamily_in_columnFamilyExpr2614 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_columnFamilyExpr2616 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_rowKey_in_columnFamilyExpr2618 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_columnFamilyExpr2620 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_columnFamilyExpr2633 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_columnFamilyExpr2637 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_columnFamilyExpr2639 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_columnFamilyExpr2655 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_columnFamilyExpr2659 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_columnFamilyExpr2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_keyRangeExpr2724 = new BitSet(new long[]{0x0000000000000000L,0x000000009000000CL});
    public static final BitSet FOLLOW_startKey_in_keyRangeExpr2728 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_keyRangeExpr2731 = new BitSet(new long[]{0x0000000000000000L,0x000000001000000CL});
    public static final BitSet FOLLOW_endKey_in_keyRangeExpr2733 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_keyRangeExpr2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_columnName2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_attr_name2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attrValueString2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_attrValueInt2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DoubleLiteral_in_attrValueDouble2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_objectName2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_keyspace2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_replica_placement_strategy2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_replication_factor2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_keyspaceNewName2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_comparator2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_command2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_newColumnFamily2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_username2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_password2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_columnFamily2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_rowKey2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_rowKey2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_rowKey2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_rowKey2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_value2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_value3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_value3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_value3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_functionCall3027 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_functionCall3029 = new BitSet(new long[]{0x0000000000000000L,0x000000020000000EL});
    public static final BitSet FOLLOW_functionArgument_in_functionCall3031 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_functionCall3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_functionArgument0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_startKey3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_endKey3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_columnOrSuperColumn3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_columnOrSuperColumn3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_columnOrSuperColumn3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_columnOrSuperColumn3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_name_in_host3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_host_name3191 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_host_name3194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_host_name3196 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_IP_ADDRESS_in_ip_address3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_port3240 = new BitSet(new long[]{0x0000000000000002L});

}