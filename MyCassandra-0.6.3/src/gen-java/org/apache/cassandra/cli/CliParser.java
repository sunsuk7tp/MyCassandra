// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g 2010-07-02 01:46:02

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NODE_CONNECT", "NODE_DESCRIBE_TABLE", "NODE_USE_TABLE", "NODE_EXIT", "NODE_HELP", "NODE_NO_OP", "NODE_SHOW_CLUSTER_NAME", "NODE_SHOW_VERSION", "NODE_SHOW_TABLES", "NODE_THRIFT_GET", "NODE_THRIFT_SET", "NODE_THRIFT_COUNT", "NODE_THRIFT_DEL", "NODE_COLUMN_ACCESS", "NODE_ID_LIST", "SEMICOLON", "K_CONNECT", "SLASH", "K_HELP", "K_QUIT", "K_EXIT", "K_GET", "K_SET", "K_COUNT", "K_DEL", "K_SHOW", "K_CLUSTER", "K_NAME", "K_VERSION", "K_TABLES", "K_DESCRIBE", "K_TABLE", "K_USE", "Identifier", "StringLiteral", "DOT", "IntegerLiteral", "K_CONFIG", "K_FILE", "Letter", "Digit", "Alnum", "WS", "COMMENT", "'?'", "'='", "'['", "']'"
    };
    public static final int K_TABLES=33;
    public static final int NODE_EXIT=7;
    public static final int K_EXIT=24;
    public static final int K_GET=25;
    public static final int K_CONNECT=20;
    public static final int K_CONFIG=41;
    public static final int K_DEL=28;
    public static final int EOF=-1;
    public static final int Identifier=37;
    public static final int K_SET=26;
    public static final int NODE_USE_TABLE=6;
    public static final int K_DESCRIBE=34;
    public static final int NODE_SHOW_VERSION=11;
    public static final int K_USE=36;
    public static final int NODE_CONNECT=4;
    public static final int T__51=51;
    public static final int SLASH=21;
    public static final int NODE_SHOW_TABLES=12;
    public static final int K_CLUSTER=30;
    public static final int NODE_DESCRIBE_TABLE=5;
    public static final int K_SHOW=29;
    public static final int K_TABLE=35;
    public static final int COMMENT=47;
    public static final int K_NAME=31;
    public static final int DOT=39;
    public static final int T__50=50;
    public static final int K_QUIT=23;
    public static final int K_COUNT=27;
    public static final int K_VERSION=32;
    public static final int NODE_THRIFT_DEL=16;
    public static final int K_FILE=42;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int SEMICOLON=19;
    public static final int Digit=44;
    public static final int NODE_THRIFT_GET=13;
    public static final int StringLiteral=38;
    public static final int NODE_THRIFT_SET=14;
    public static final int NODE_NO_OP=9;
    public static final int NODE_HELP=8;
    public static final int NODE_ID_LIST=18;
    public static final int WS=46;
    public static final int NODE_THRIFT_COUNT=15;
    public static final int K_HELP=22;
    public static final int Alnum=45;
    public static final int IntegerLiteral=40;
    public static final int NODE_SHOW_CLUSTER_NAME=10;
    public static final int Letter=43;
    public static final int NODE_COLUMN_ACCESS=17;

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
    public String getGrammarFileName() { return "/Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g"; }


    public static class root_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "root"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:69:1: root : stmt ( SEMICOLON )? EOF -> stmt ;
    public final CliParser.root_return root() throws RecognitionException {
        CliParser.root_return retval = new CliParser.root_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMICOLON2=null;
        Token EOF3=null;
        CliParser.stmt_return stmt1 = null;


        CommonTree SEMICOLON2_tree=null;
        CommonTree EOF3_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:69:5: ( stmt ( SEMICOLON )? EOF -> stmt )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:69:7: stmt ( SEMICOLON )? EOF
            {
            pushFollow(FOLLOW_stmt_in_root208);
            stmt1=stmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmt.add(stmt1.getTree());
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:69:12: ( SEMICOLON )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SEMICOLON) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:0:0: SEMICOLON
                    {
                    SEMICOLON2=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_root210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON2);


                    }
                    break;

            }

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_root213); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF3);



            // AST REWRITE
            // elements: stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 69:27: -> stmt
            {
                adaptor.addChild(root_0, stream_stmt.nextTree());

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

    public static class stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmt"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:71:1: stmt : ( connectStmt | exitStmt | countStmt | describeTable | useTable | delStmt | getStmt | helpStmt | setStmt | showStmt | -> ^( NODE_NO_OP ) );
    public final CliParser.stmt_return stmt() throws RecognitionException {
        CliParser.stmt_return retval = new CliParser.stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.connectStmt_return connectStmt4 = null;

        CliParser.exitStmt_return exitStmt5 = null;

        CliParser.countStmt_return countStmt6 = null;

        CliParser.describeTable_return describeTable7 = null;

        CliParser.useTable_return useTable8 = null;

        CliParser.delStmt_return delStmt9 = null;

        CliParser.getStmt_return getStmt10 = null;

        CliParser.helpStmt_return helpStmt11 = null;

        CliParser.setStmt_return setStmt12 = null;

        CliParser.showStmt_return showStmt13 = null;



        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:72:5: ( connectStmt | exitStmt | countStmt | describeTable | useTable | delStmt | getStmt | helpStmt | setStmt | showStmt | -> ^( NODE_NO_OP ) )
            int alt2=11;
            switch ( input.LA(1) ) {
            case K_CONNECT:
                {
                alt2=1;
                }
                break;
            case K_QUIT:
            case K_EXIT:
                {
                alt2=2;
                }
                break;
            case K_COUNT:
                {
                alt2=3;
                }
                break;
            case K_DESCRIBE:
                {
                alt2=4;
                }
                break;
            case K_USE:
                {
                alt2=5;
                }
                break;
            case K_DEL:
                {
                alt2=6;
                }
                break;
            case K_GET:
                {
                alt2=7;
                }
                break;
            case K_HELP:
            case 48:
                {
                alt2=8;
                }
                break;
            case K_SET:
                {
                alt2=9;
                }
                break;
            case K_SHOW:
                {
                alt2=10;
                }
                break;
            case EOF:
            case SEMICOLON:
                {
                alt2=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:72:7: connectStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_connectStmt_in_stmt229);
                    connectStmt4=connectStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, connectStmt4.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:73:7: exitStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_exitStmt_in_stmt237);
                    exitStmt5=exitStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exitStmt5.getTree());

                    }
                    break;
                case 3 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:74:7: countStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_countStmt_in_stmt245);
                    countStmt6=countStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, countStmt6.getTree());

                    }
                    break;
                case 4 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:75:7: describeTable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_describeTable_in_stmt253);
                    describeTable7=describeTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, describeTable7.getTree());

                    }
                    break;
                case 5 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:76:7: useTable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_useTable_in_stmt261);
                    useTable8=useTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, useTable8.getTree());

                    }
                    break;
                case 6 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:77:7: delStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delStmt_in_stmt269);
                    delStmt9=delStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delStmt9.getTree());

                    }
                    break;
                case 7 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:78:7: getStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_getStmt_in_stmt277);
                    getStmt10=getStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, getStmt10.getTree());

                    }
                    break;
                case 8 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:79:7: helpStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_helpStmt_in_stmt285);
                    helpStmt11=helpStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, helpStmt11.getTree());

                    }
                    break;
                case 9 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:80:7: setStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_setStmt_in_stmt293);
                    setStmt12=setStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setStmt12.getTree());

                    }
                    break;
                case 10 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:81:7: showStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showStmt_in_stmt301);
                    showStmt13=showStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showStmt13.getTree());

                    }
                    break;
                case 11 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:82:7: 
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
                    // 82:7: -> ^( NODE_NO_OP )
                    {
                        // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:82:10: ^( NODE_NO_OP )
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
    // $ANTLR end "stmt"

    public static class connectStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "connectStmt"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:85:1: connectStmt : ( K_CONNECT host SLASH port -> ^( NODE_CONNECT host port ) | K_CONNECT ipaddr SLASH port -> ^( NODE_CONNECT ipaddr port ) );
    public final CliParser.connectStmt_return connectStmt() throws RecognitionException {
        CliParser.connectStmt_return retval = new CliParser.connectStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_CONNECT14=null;
        Token SLASH16=null;
        Token K_CONNECT18=null;
        Token SLASH20=null;
        CliParser.host_return host15 = null;

        CliParser.port_return port17 = null;

        CliParser.ipaddr_return ipaddr19 = null;

        CliParser.port_return port21 = null;


        CommonTree K_CONNECT14_tree=null;
        CommonTree SLASH16_tree=null;
        CommonTree K_CONNECT18_tree=null;
        CommonTree SLASH20_tree=null;
        RewriteRuleTokenStream stream_SLASH=new RewriteRuleTokenStream(adaptor,"token SLASH");
        RewriteRuleTokenStream stream_K_CONNECT=new RewriteRuleTokenStream(adaptor,"token K_CONNECT");
        RewriteRuleSubtreeStream stream_port=new RewriteRuleSubtreeStream(adaptor,"rule port");
        RewriteRuleSubtreeStream stream_ipaddr=new RewriteRuleSubtreeStream(adaptor,"rule ipaddr");
        RewriteRuleSubtreeStream stream_host=new RewriteRuleSubtreeStream(adaptor,"rule host");
        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:86:5: ( K_CONNECT host SLASH port -> ^( NODE_CONNECT host port ) | K_CONNECT ipaddr SLASH port -> ^( NODE_CONNECT ipaddr port ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==K_CONNECT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==IntegerLiteral) ) {
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
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:86:7: K_CONNECT host SLASH port
                    {
                    K_CONNECT14=(Token)match(input,K_CONNECT,FOLLOW_K_CONNECT_in_connectStmt330); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_K_CONNECT.add(K_CONNECT14);

                    pushFollow(FOLLOW_host_in_connectStmt332);
                    host15=host();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_host.add(host15.getTree());
                    SLASH16=(Token)match(input,SLASH,FOLLOW_SLASH_in_connectStmt334); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SLASH.add(SLASH16);

                    pushFollow(FOLLOW_port_in_connectStmt336);
                    port17=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port17.getTree());


                    // AST REWRITE
                    // elements: host, port
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 86:33: -> ^( NODE_CONNECT host port )
                    {
                        // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:86:36: ^( NODE_CONNECT host port )
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
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:87:7: K_CONNECT ipaddr SLASH port
                    {
                    K_CONNECT18=(Token)match(input,K_CONNECT,FOLLOW_K_CONNECT_in_connectStmt354); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_K_CONNECT.add(K_CONNECT18);

                    pushFollow(FOLLOW_ipaddr_in_connectStmt356);
                    ipaddr19=ipaddr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ipaddr.add(ipaddr19.getTree());
                    SLASH20=(Token)match(input,SLASH,FOLLOW_SLASH_in_connectStmt358); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SLASH.add(SLASH20);

                    pushFollow(FOLLOW_port_in_connectStmt360);
                    port21=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port21.getTree());


                    // AST REWRITE
                    // elements: ipaddr, port
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 87:35: -> ^( NODE_CONNECT ipaddr port )
                    {
                        // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:87:38: ^( NODE_CONNECT ipaddr port )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"), root_1);

                        adaptor.addChild(root_1, stream_ipaddr.nextTree());
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
    // $ANTLR end "connectStmt"

    public static class helpStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "helpStmt"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:90:1: helpStmt : ( K_HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) );
    public final CliParser.helpStmt_return helpStmt() throws RecognitionException {
        CliParser.helpStmt_return retval = new CliParser.helpStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_HELP22=null;
        Token char_literal23=null;

        CommonTree K_HELP22_tree=null;
        CommonTree char_literal23_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_K_HELP=new RewriteRuleTokenStream(adaptor,"token K_HELP");

        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:91:5: ( K_HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==K_HELP) ) {
                alt4=1;
            }
            else if ( (LA4_0==48) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:91:7: K_HELP
                    {
                    K_HELP22=(Token)match(input,K_HELP,FOLLOW_K_HELP_in_helpStmt387); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_K_HELP.add(K_HELP22);



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
                    // 91:14: -> ^( NODE_HELP )
                    {
                        // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:91:17: ^( NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:92:7: '?'
                    {
                    char_literal23=(Token)match(input,48,FOLLOW_48_in_helpStmt401); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_48.add(char_literal23);



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
                    // 92:14: -> ^( NODE_HELP )
                    {
                        // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:92:17: ^( NODE_HELP )
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
    // $ANTLR end "helpStmt"

    public static class exitStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exitStmt"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:95:1: exitStmt : ( K_QUIT -> ^( NODE_EXIT ) | K_EXIT -> ^( NODE_EXIT ) );
    public final CliParser.exitStmt_return exitStmt() throws RecognitionException {
        CliParser.exitStmt_return retval = new CliParser.exitStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_QUIT24=null;
        Token K_EXIT25=null;

        CommonTree K_QUIT24_tree=null;
        CommonTree K_EXIT25_tree=null;
        RewriteRuleTokenStream stream_K_EXIT=new RewriteRuleTokenStream(adaptor,"token K_EXIT");
        RewriteRuleTokenStream stream_K_QUIT=new RewriteRuleTokenStream(adaptor,"token K_QUIT");

        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:96:5: ( K_QUIT -> ^( NODE_EXIT ) | K_EXIT -> ^( NODE_EXIT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==K_QUIT) ) {
                alt5=1;
            }
            else if ( (LA5_0==K_EXIT) ) {
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
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:96:7: K_QUIT
                    {
                    K_QUIT24=(Token)match(input,K_QUIT,FOLLOW_K_QUIT_in_exitStmt427); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_K_QUIT.add(K_QUIT24);



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
                    // 96:14: -> ^( NODE_EXIT )
                    {
                        // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:96:17: ^( NODE_EXIT )
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
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:97:7: K_EXIT
                    {
                    K_EXIT25=(Token)match(input,K_EXIT,FOLLOW_K_EXIT_in_exitStmt441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_K_EXIT.add(K_EXIT25);



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
                    // 97:14: -> ^( NODE_EXIT )
                    {
                        // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:97:17: ^( NODE_EXIT )
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
    // $ANTLR end "exitStmt"

    public static class getStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getStmt"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:100:1: getStmt : K_GET columnFamilyExpr -> ^( NODE_THRIFT_GET columnFamilyExpr ) ;
    public final CliParser.getStmt_return getStmt() throws RecognitionException {
        CliParser.getStmt_return retval = new CliParser.getStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_GET26=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr27 = null;


        CommonTree K_GET26_tree=null;
        RewriteRuleTokenStream stream_K_GET=new RewriteRuleTokenStream(adaptor,"token K_GET");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:101:5: ( K_GET columnFamilyExpr -> ^( NODE_THRIFT_GET columnFamilyExpr ) )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:101:7: K_GET columnFamilyExpr
            {
            K_GET26=(Token)match(input,K_GET,FOLLOW_K_GET_in_getStmt464); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_GET.add(K_GET26);

            pushFollow(FOLLOW_columnFamilyExpr_in_getStmt466);
            columnFamilyExpr27=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr27.getTree());


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
            // 101:30: -> ^( NODE_THRIFT_GET columnFamilyExpr )
            {
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:101:33: ^( NODE_THRIFT_GET columnFamilyExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_GET, "NODE_THRIFT_GET"), root_1);

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
    // $ANTLR end "getStmt"

    public static class setStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setStmt"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:104:1: setStmt : K_SET columnFamilyExpr '=' value -> ^( NODE_THRIFT_SET columnFamilyExpr value ) ;
    public final CliParser.setStmt_return setStmt() throws RecognitionException {
        CliParser.setStmt_return retval = new CliParser.setStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_SET28=null;
        Token char_literal30=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr29 = null;

        CliParser.value_return value31 = null;


        CommonTree K_SET28_tree=null;
        CommonTree char_literal30_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_K_SET=new RewriteRuleTokenStream(adaptor,"token K_SET");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:105:5: ( K_SET columnFamilyExpr '=' value -> ^( NODE_THRIFT_SET columnFamilyExpr value ) )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:105:7: K_SET columnFamilyExpr '=' value
            {
            K_SET28=(Token)match(input,K_SET,FOLLOW_K_SET_in_setStmt491); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_SET.add(K_SET28);

            pushFollow(FOLLOW_columnFamilyExpr_in_setStmt493);
            columnFamilyExpr29=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr29.getTree());
            char_literal30=(Token)match(input,49,FOLLOW_49_in_setStmt495); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal30);

            pushFollow(FOLLOW_value_in_setStmt497);
            value31=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value31.getTree());


            // AST REWRITE
            // elements: value, columnFamilyExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 105:40: -> ^( NODE_THRIFT_SET columnFamilyExpr value )
            {
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:105:43: ^( NODE_THRIFT_SET columnFamilyExpr value )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_SET, "NODE_THRIFT_SET"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
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
    // $ANTLR end "setStmt"

    public static class countStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "countStmt"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:108:1: countStmt : K_COUNT columnFamilyExpr -> ^( NODE_THRIFT_COUNT columnFamilyExpr ) ;
    public final CliParser.countStmt_return countStmt() throws RecognitionException {
        CliParser.countStmt_return retval = new CliParser.countStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_COUNT32=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr33 = null;


        CommonTree K_COUNT32_tree=null;
        RewriteRuleTokenStream stream_K_COUNT=new RewriteRuleTokenStream(adaptor,"token K_COUNT");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:109:5: ( K_COUNT columnFamilyExpr -> ^( NODE_THRIFT_COUNT columnFamilyExpr ) )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:109:7: K_COUNT columnFamilyExpr
            {
            K_COUNT32=(Token)match(input,K_COUNT,FOLLOW_K_COUNT_in_countStmt524); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_COUNT.add(K_COUNT32);

            pushFollow(FOLLOW_columnFamilyExpr_in_countStmt526);
            columnFamilyExpr33=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr33.getTree());


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
            // 109:32: -> ^( NODE_THRIFT_COUNT columnFamilyExpr )
            {
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:109:35: ^( NODE_THRIFT_COUNT columnFamilyExpr )
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
    // $ANTLR end "countStmt"

    public static class delStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delStmt"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:112:1: delStmt : K_DEL columnFamilyExpr -> ^( NODE_THRIFT_DEL columnFamilyExpr ) ;
    public final CliParser.delStmt_return delStmt() throws RecognitionException {
        CliParser.delStmt_return retval = new CliParser.delStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_DEL34=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr35 = null;


        CommonTree K_DEL34_tree=null;
        RewriteRuleTokenStream stream_K_DEL=new RewriteRuleTokenStream(adaptor,"token K_DEL");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:113:5: ( K_DEL columnFamilyExpr -> ^( NODE_THRIFT_DEL columnFamilyExpr ) )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:113:7: K_DEL columnFamilyExpr
            {
            K_DEL34=(Token)match(input,K_DEL,FOLLOW_K_DEL_in_delStmt551); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_DEL.add(K_DEL34);

            pushFollow(FOLLOW_columnFamilyExpr_in_delStmt553);
            columnFamilyExpr35=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr35.getTree());


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
            // 113:30: -> ^( NODE_THRIFT_DEL columnFamilyExpr )
            {
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:113:33: ^( NODE_THRIFT_DEL columnFamilyExpr )
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
    // $ANTLR end "delStmt"

    public static class showStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showStmt"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:116:1: showStmt : ( showClusterName | showVersion | showTables );
    public final CliParser.showStmt_return showStmt() throws RecognitionException {
        CliParser.showStmt_return retval = new CliParser.showStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.showClusterName_return showClusterName36 = null;

        CliParser.showVersion_return showVersion37 = null;

        CliParser.showTables_return showTables38 = null;



        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:117:5: ( showClusterName | showVersion | showTables )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==K_SHOW) ) {
                switch ( input.LA(2) ) {
                case K_CLUSTER:
                    {
                    alt6=1;
                    }
                    break;
                case K_VERSION:
                    {
                    alt6=2;
                    }
                    break;
                case K_TABLES:
                    {
                    alt6=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:117:7: showClusterName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showClusterName_in_showStmt578);
                    showClusterName36=showClusterName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showClusterName36.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:118:7: showVersion
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showVersion_in_showStmt586);
                    showVersion37=showVersion();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showVersion37.getTree());

                    }
                    break;
                case 3 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:119:7: showTables
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showTables_in_showStmt594);
                    showTables38=showTables();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showTables38.getTree());

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
    // $ANTLR end "showStmt"

    public static class showClusterName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showClusterName"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:122:1: showClusterName : K_SHOW K_CLUSTER K_NAME -> ^( NODE_SHOW_CLUSTER_NAME ) ;
    public final CliParser.showClusterName_return showClusterName() throws RecognitionException {
        CliParser.showClusterName_return retval = new CliParser.showClusterName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_SHOW39=null;
        Token K_CLUSTER40=null;
        Token K_NAME41=null;

        CommonTree K_SHOW39_tree=null;
        CommonTree K_CLUSTER40_tree=null;
        CommonTree K_NAME41_tree=null;
        RewriteRuleTokenStream stream_K_SHOW=new RewriteRuleTokenStream(adaptor,"token K_SHOW");
        RewriteRuleTokenStream stream_K_NAME=new RewriteRuleTokenStream(adaptor,"token K_NAME");
        RewriteRuleTokenStream stream_K_CLUSTER=new RewriteRuleTokenStream(adaptor,"token K_CLUSTER");

        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:123:5: ( K_SHOW K_CLUSTER K_NAME -> ^( NODE_SHOW_CLUSTER_NAME ) )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:123:7: K_SHOW K_CLUSTER K_NAME
            {
            K_SHOW39=(Token)match(input,K_SHOW,FOLLOW_K_SHOW_in_showClusterName611); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_SHOW.add(K_SHOW39);

            K_CLUSTER40=(Token)match(input,K_CLUSTER,FOLLOW_K_CLUSTER_in_showClusterName613); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_CLUSTER.add(K_CLUSTER40);

            K_NAME41=(Token)match(input,K_NAME,FOLLOW_K_NAME_in_showClusterName615); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_NAME.add(K_NAME41);



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
            // 123:31: -> ^( NODE_SHOW_CLUSTER_NAME )
            {
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:123:34: ^( NODE_SHOW_CLUSTER_NAME )
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

    public static class showVersion_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showVersion"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:126:1: showVersion : K_SHOW K_VERSION -> ^( NODE_SHOW_VERSION ) ;
    public final CliParser.showVersion_return showVersion() throws RecognitionException {
        CliParser.showVersion_return retval = new CliParser.showVersion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_SHOW42=null;
        Token K_VERSION43=null;

        CommonTree K_SHOW42_tree=null;
        CommonTree K_VERSION43_tree=null;
        RewriteRuleTokenStream stream_K_SHOW=new RewriteRuleTokenStream(adaptor,"token K_SHOW");
        RewriteRuleTokenStream stream_K_VERSION=new RewriteRuleTokenStream(adaptor,"token K_VERSION");

        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:127:5: ( K_SHOW K_VERSION -> ^( NODE_SHOW_VERSION ) )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:127:7: K_SHOW K_VERSION
            {
            K_SHOW42=(Token)match(input,K_SHOW,FOLLOW_K_SHOW_in_showVersion638); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_SHOW.add(K_SHOW42);

            K_VERSION43=(Token)match(input,K_VERSION,FOLLOW_K_VERSION_in_showVersion640); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_VERSION.add(K_VERSION43);



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
            // 127:24: -> ^( NODE_SHOW_VERSION )
            {
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:127:27: ^( NODE_SHOW_VERSION )
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

    public static class showTables_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showTables"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:130:1: showTables : K_SHOW K_TABLES -> ^( NODE_SHOW_TABLES ) ;
    public final CliParser.showTables_return showTables() throws RecognitionException {
        CliParser.showTables_return retval = new CliParser.showTables_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_SHOW44=null;
        Token K_TABLES45=null;

        CommonTree K_SHOW44_tree=null;
        CommonTree K_TABLES45_tree=null;
        RewriteRuleTokenStream stream_K_SHOW=new RewriteRuleTokenStream(adaptor,"token K_SHOW");
        RewriteRuleTokenStream stream_K_TABLES=new RewriteRuleTokenStream(adaptor,"token K_TABLES");

        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:131:5: ( K_SHOW K_TABLES -> ^( NODE_SHOW_TABLES ) )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:131:7: K_SHOW K_TABLES
            {
            K_SHOW44=(Token)match(input,K_SHOW,FOLLOW_K_SHOW_in_showTables663); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_SHOW.add(K_SHOW44);

            K_TABLES45=(Token)match(input,K_TABLES,FOLLOW_K_TABLES_in_showTables665); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_TABLES.add(K_TABLES45);



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
            // 131:23: -> ^( NODE_SHOW_TABLES )
            {
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:131:26: ^( NODE_SHOW_TABLES )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_TABLES, "NODE_SHOW_TABLES"), root_1);

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
    // $ANTLR end "showTables"

    public static class describeTable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "describeTable"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:134:1: describeTable : K_DESCRIBE K_TABLE table -> ^( NODE_DESCRIBE_TABLE table ) ;
    public final CliParser.describeTable_return describeTable() throws RecognitionException {
        CliParser.describeTable_return retval = new CliParser.describeTable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_DESCRIBE46=null;
        Token K_TABLE47=null;
        CliParser.table_return table48 = null;


        CommonTree K_DESCRIBE46_tree=null;
        CommonTree K_TABLE47_tree=null;
        RewriteRuleTokenStream stream_K_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token K_DESCRIBE");
        RewriteRuleTokenStream stream_K_TABLE=new RewriteRuleTokenStream(adaptor,"token K_TABLE");
        RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");
        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:135:5: ( K_DESCRIBE K_TABLE table -> ^( NODE_DESCRIBE_TABLE table ) )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:135:7: K_DESCRIBE K_TABLE table
            {
            K_DESCRIBE46=(Token)match(input,K_DESCRIBE,FOLLOW_K_DESCRIBE_in_describeTable688); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_DESCRIBE.add(K_DESCRIBE46);

            K_TABLE47=(Token)match(input,K_TABLE,FOLLOW_K_TABLE_in_describeTable690); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_TABLE.add(K_TABLE47);

            pushFollow(FOLLOW_table_in_describeTable692);
            table48=table();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_table.add(table48.getTree());


            // AST REWRITE
            // elements: table
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 135:32: -> ^( NODE_DESCRIBE_TABLE table )
            {
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:135:35: ^( NODE_DESCRIBE_TABLE table )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DESCRIBE_TABLE, "NODE_DESCRIBE_TABLE"), root_1);

                adaptor.addChild(root_1, stream_table.nextTree());

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

    public static class useTable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "useTable"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:137:1: useTable : K_USE table ( username )? ( password )? -> ^( NODE_USE_TABLE table ( username )? ( password )? ) ;
    public final CliParser.useTable_return useTable() throws RecognitionException {
        CliParser.useTable_return retval = new CliParser.useTable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_USE49=null;
        CliParser.table_return table50 = null;

        CliParser.username_return username51 = null;

        CliParser.password_return password52 = null;


        CommonTree K_USE49_tree=null;
        RewriteRuleTokenStream stream_K_USE=new RewriteRuleTokenStream(adaptor,"token K_USE");
        RewriteRuleSubtreeStream stream_username=new RewriteRuleSubtreeStream(adaptor,"rule username");
        RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");
        RewriteRuleSubtreeStream stream_password=new RewriteRuleSubtreeStream(adaptor,"rule password");
        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:138:5: ( K_USE table ( username )? ( password )? -> ^( NODE_USE_TABLE table ( username )? ( password )? ) )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:138:7: K_USE table ( username )? ( password )?
            {
            K_USE49=(Token)match(input,K_USE,FOLLOW_K_USE_in_useTable716); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_USE.add(K_USE49);

            pushFollow(FOLLOW_table_in_useTable718);
            table50=table();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_table.add(table50.getTree());
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:138:19: ( username )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Identifier) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:138:21: username
                    {
                    pushFollow(FOLLOW_username_in_useTable722);
                    username51=username();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_username.add(username51.getTree());

                    }
                    break;

            }

            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:138:33: ( password )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==StringLiteral) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:138:35: password
                    {
                    pushFollow(FOLLOW_password_in_useTable729);
                    password52=password();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_password.add(password52.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: table, password, username
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 138:47: -> ^( NODE_USE_TABLE table ( username )? ( password )? )
            {
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:138:50: ^( NODE_USE_TABLE table ( username )? ( password )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_USE_TABLE, "NODE_USE_TABLE"), root_1);

                adaptor.addChild(root_1, stream_table.nextTree());
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:138:73: ( username )?
                if ( stream_username.hasNext() ) {
                    adaptor.addChild(root_1, stream_username.nextTree());

                }
                stream_username.reset();
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:138:87: ( password )?
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
    // $ANTLR end "useTable"

    public static class columnFamilyExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnFamilyExpr"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:140:1: columnFamilyExpr : columnFamily '[' rowKey ']' ( '[' a+= columnOrSuperColumn ']' ( '[' a+= columnOrSuperColumn ']' )? )? -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( ( $a)+ )? ) ;
    public final CliParser.columnFamilyExpr_return columnFamilyExpr() throws RecognitionException {
        CliParser.columnFamilyExpr_return retval = new CliParser.columnFamilyExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal54=null;
        Token char_literal56=null;
        Token char_literal57=null;
        Token char_literal58=null;
        Token char_literal59=null;
        Token char_literal60=null;
        List list_a=null;
        CliParser.columnFamily_return columnFamily53 = null;

        CliParser.rowKey_return rowKey55 = null;

        CliParser.columnOrSuperColumn_return a = null;
         a = null;
        CommonTree char_literal54_tree=null;
        CommonTree char_literal56_tree=null;
        CommonTree char_literal57_tree=null;
        CommonTree char_literal58_tree=null;
        CommonTree char_literal59_tree=null;
        CommonTree char_literal60_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_rowKey=new RewriteRuleSubtreeStream(adaptor,"rule rowKey");
        RewriteRuleSubtreeStream stream_columnOrSuperColumn=new RewriteRuleSubtreeStream(adaptor,"rule columnOrSuperColumn");
        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:141:5: ( columnFamily '[' rowKey ']' ( '[' a+= columnOrSuperColumn ']' ( '[' a+= columnOrSuperColumn ']' )? )? -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( ( $a)+ )? ) )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:141:7: columnFamily '[' rowKey ']' ( '[' a+= columnOrSuperColumn ']' ( '[' a+= columnOrSuperColumn ']' )? )?
            {
            pushFollow(FOLLOW_columnFamily_in_columnFamilyExpr766);
            columnFamily53=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily53.getTree());
            char_literal54=(Token)match(input,50,FOLLOW_50_in_columnFamilyExpr768); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(char_literal54);

            pushFollow(FOLLOW_rowKey_in_columnFamilyExpr770);
            rowKey55=rowKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowKey.add(rowKey55.getTree());
            char_literal56=(Token)match(input,51,FOLLOW_51_in_columnFamilyExpr772); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal56);

            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:142:9: ( '[' a+= columnOrSuperColumn ']' ( '[' a+= columnOrSuperColumn ']' )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==50) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:142:11: '[' a+= columnOrSuperColumn ']' ( '[' a+= columnOrSuperColumn ']' )?
                    {
                    char_literal57=(Token)match(input,50,FOLLOW_50_in_columnFamilyExpr785); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal57);

                    pushFollow(FOLLOW_columnOrSuperColumn_in_columnFamilyExpr789);
                    a=columnOrSuperColumn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(a.getTree());
                    if (list_a==null) list_a=new ArrayList();
                    list_a.add(a.getTree());

                    char_literal58=(Token)match(input,51,FOLLOW_51_in_columnFamilyExpr791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_51.add(char_literal58);

                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:143:13: ( '[' a+= columnOrSuperColumn ']' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==50) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:143:14: '[' a+= columnOrSuperColumn ']'
                            {
                            char_literal59=(Token)match(input,50,FOLLOW_50_in_columnFamilyExpr807); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_50.add(char_literal59);

                            pushFollow(FOLLOW_columnOrSuperColumn_in_columnFamilyExpr811);
                            a=columnOrSuperColumn();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(a.getTree());
                            if (list_a==null) list_a=new ArrayList();
                            list_a.add(a.getTree());

                            char_literal60=(Token)match(input,51,FOLLOW_51_in_columnFamilyExpr813); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_51.add(char_literal60);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: a, columnFamily, rowKey
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: a
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",list_a);
            root_0 = (CommonTree)adaptor.nil();
            // 145:7: -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( ( $a)+ )? )
            {
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:145:10: ^( NODE_COLUMN_ACCESS columnFamily rowKey ( ( $a)+ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_COLUMN_ACCESS, "NODE_COLUMN_ACCESS"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                adaptor.addChild(root_1, stream_rowKey.nextTree());
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:145:51: ( ( $a)+ )?
                if ( stream_a.hasNext() ) {
                    if ( !(stream_a.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_a.hasNext() ) {
                        adaptor.addChild(root_1, stream_a.nextTree());

                    }
                    stream_a.reset();

                }
                stream_a.reset();

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

    public static class table_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:148:1: table : Identifier ;
    public final CliParser.table_return table() throws RecognitionException {
        CliParser.table_return retval = new CliParser.table_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier61=null;

        CommonTree Identifier61_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:148:6: ( Identifier )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:148:8: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier61=(Token)match(input,Identifier,FOLLOW_Identifier_in_table862); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier61_tree = (CommonTree)adaptor.create(Identifier61);
            adaptor.addChild(root_0, Identifier61_tree);
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
    // $ANTLR end "table"

    public static class username_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "username"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:150:1: username : Identifier ;
    public final CliParser.username_return username() throws RecognitionException {
        CliParser.username_return retval = new CliParser.username_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier62=null;

        CommonTree Identifier62_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:150:9: ( Identifier )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:150:11: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier62=(Token)match(input,Identifier,FOLLOW_Identifier_in_username869); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier62_tree = (CommonTree)adaptor.create(Identifier62);
            adaptor.addChild(root_0, Identifier62_tree);
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
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:152:1: password : StringLiteral ;
    public final CliParser.password_return password() throws RecognitionException {
        CliParser.password_return retval = new CliParser.password_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral63=null;

        CommonTree StringLiteral63_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:152:9: ( StringLiteral )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:152:11: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral63=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_password876); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral63_tree = (CommonTree)adaptor.create(StringLiteral63);
            adaptor.addChild(root_0, StringLiteral63_tree);
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
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:154:1: columnFamily : Identifier ;
    public final CliParser.columnFamily_return columnFamily() throws RecognitionException {
        CliParser.columnFamily_return retval = new CliParser.columnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier64=null;

        CommonTree Identifier64_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:154:13: ( Identifier )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:154:15: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier64=(Token)match(input,Identifier,FOLLOW_Identifier_in_columnFamily883); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier64_tree = (CommonTree)adaptor.create(Identifier64);
            adaptor.addChild(root_0, Identifier64_tree);
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
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:156:1: rowKey : StringLiteral ;
    public final CliParser.rowKey_return rowKey() throws RecognitionException {
        CliParser.rowKey_return retval = new CliParser.rowKey_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral65=null;

        CommonTree StringLiteral65_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:156:7: ( StringLiteral )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:156:11: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral65=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_rowKey892); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral65_tree = (CommonTree)adaptor.create(StringLiteral65);
            adaptor.addChild(root_0, StringLiteral65_tree);
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
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:158:1: value : StringLiteral ;
    public final CliParser.value_return value() throws RecognitionException {
        CliParser.value_return retval = new CliParser.value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral66=null;

        CommonTree StringLiteral66_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:158:6: ( StringLiteral )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:158:8: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral66=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_value899); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral66_tree = (CommonTree)adaptor.create(StringLiteral66);
            adaptor.addChild(root_0, StringLiteral66_tree);
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

    public static class columnOrSuperColumn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnOrSuperColumn"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:160:1: columnOrSuperColumn : StringLiteral ;
    public final CliParser.columnOrSuperColumn_return columnOrSuperColumn() throws RecognitionException {
        CliParser.columnOrSuperColumn_return retval = new CliParser.columnOrSuperColumn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral67=null;

        CommonTree StringLiteral67_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:160:20: ( StringLiteral )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:160:22: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral67=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_columnOrSuperColumn906); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral67_tree = (CommonTree)adaptor.create(StringLiteral67);
            adaptor.addChild(root_0, StringLiteral67_tree);
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
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:162:1: host : id+= Identifier (id+= DOT id+= Identifier )* -> ^( NODE_ID_LIST ( $id)+ ) ;
    public final CliParser.host_return host() throws RecognitionException {
        CliParser.host_return retval = new CliParser.host_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token id=null;
        List list_id=null;

        CommonTree id_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:162:5: (id+= Identifier (id+= DOT id+= Identifier )* -> ^( NODE_ID_LIST ( $id)+ ) )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:162:7: id+= Identifier (id+= DOT id+= Identifier )*
            {
            id=(Token)match(input,Identifier,FOLLOW_Identifier_in_host915); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:162:22: (id+= DOT id+= Identifier )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==DOT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:162:23: id+= DOT id+= Identifier
            	    {
            	    id=(Token)match(input,DOT,FOLLOW_DOT_in_host920); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(id);

            	    if (list_id==null) list_id=new ArrayList();
            	    list_id.add(id);

            	    id=(Token)match(input,Identifier,FOLLOW_Identifier_in_host924); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Identifier.add(id);

            	    if (list_id==null) list_id=new ArrayList();
            	    list_id.add(id);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: id
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id", list_id);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 162:48: -> ^( NODE_ID_LIST ( $id)+ )
            {
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:162:51: ^( NODE_ID_LIST ( $id)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ID_LIST, "NODE_ID_LIST"), root_1);

                if ( !(stream_id.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_id.nextNode());

                }
                stream_id.reset();

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

    public static class ipaddr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ipaddr"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:164:1: ipaddr : id+= IntegerLiteral id+= DOT id+= IntegerLiteral id+= DOT id+= IntegerLiteral id+= DOT id+= IntegerLiteral -> ^( NODE_ID_LIST ( $id)+ ) ;
    public final CliParser.ipaddr_return ipaddr() throws RecognitionException {
        CliParser.ipaddr_return retval = new CliParser.ipaddr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token id=null;
        List list_id=null;

        CommonTree id_tree=null;
        RewriteRuleTokenStream stream_IntegerLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerLiteral");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");

        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:164:7: (id+= IntegerLiteral id+= DOT id+= IntegerLiteral id+= DOT id+= IntegerLiteral id+= DOT id+= IntegerLiteral -> ^( NODE_ID_LIST ( $id)+ ) )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:164:9: id+= IntegerLiteral id+= DOT id+= IntegerLiteral id+= DOT id+= IntegerLiteral id+= DOT id+= IntegerLiteral
            {
            id=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_ipaddr945); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IntegerLiteral.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            id=(Token)match(input,DOT,FOLLOW_DOT_in_ipaddr949); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            id=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_ipaddr953); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IntegerLiteral.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            id=(Token)match(input,DOT,FOLLOW_DOT_in_ipaddr957); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            id=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_ipaddr961); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IntegerLiteral.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            id=(Token)match(input,DOT,FOLLOW_DOT_in_ipaddr965); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            id=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_ipaddr969); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IntegerLiteral.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);



            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: id
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id", list_id);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 164:109: -> ^( NODE_ID_LIST ( $id)+ )
            {
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:164:112: ^( NODE_ID_LIST ( $id)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ID_LIST, "NODE_ID_LIST"), root_1);

                if ( !(stream_id.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_id.nextNode());

                }
                stream_id.reset();

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
    // $ANTLR end "ipaddr"

    public static class port_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "port"
    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:166:1: port : IntegerLiteral ;
    public final CliParser.port_return port() throws RecognitionException {
        CliParser.port_return retval = new CliParser.port_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IntegerLiteral68=null;

        CommonTree IntegerLiteral68_tree=null;

        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:166:5: ( IntegerLiteral )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:166:7: IntegerLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            IntegerLiteral68=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_port986); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IntegerLiteral68_tree = (CommonTree)adaptor.create(IntegerLiteral68);
            adaptor.addChild(root_0, IntegerLiteral68_tree);
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


 

    public static final BitSet FOLLOW_stmt_in_root208 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SEMICOLON_in_root210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_root213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connectStmt_in_stmt229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitStmt_in_stmt237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStmt_in_stmt245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_describeTable_in_stmt253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useTable_in_stmt261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delStmt_in_stmt269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getStmt_in_stmt277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_helpStmt_in_stmt285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setStmt_in_stmt293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showStmt_in_stmt301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CONNECT_in_connectStmt330 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_host_in_connectStmt332 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_SLASH_in_connectStmt334 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_port_in_connectStmt336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CONNECT_in_connectStmt354 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ipaddr_in_connectStmt356 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_SLASH_in_connectStmt358 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_port_in_connectStmt360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_HELP_in_helpStmt387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_helpStmt401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_QUIT_in_exitStmt427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_EXIT_in_exitStmt441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_GET_in_getStmt464 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_getStmt466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SET_in_setStmt491 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_setStmt493 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_setStmt495 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_value_in_setStmt497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COUNT_in_countStmt524 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_countStmt526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DEL_in_delStmt551 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_delStmt553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showClusterName_in_showStmt578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showVersion_in_showStmt586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showTables_in_showStmt594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SHOW_in_showClusterName611 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_K_CLUSTER_in_showClusterName613 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_K_NAME_in_showClusterName615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SHOW_in_showVersion638 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_K_VERSION_in_showVersion640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SHOW_in_showTables663 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_K_TABLES_in_showTables665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DESCRIBE_in_describeTable688 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_K_TABLE_in_describeTable690 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_table_in_describeTable692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USE_in_useTable716 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_table_in_useTable718 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_username_in_useTable722 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_password_in_useTable729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnFamily_in_columnFamilyExpr766 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_columnFamilyExpr768 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rowKey_in_columnFamilyExpr770 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_columnFamilyExpr772 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_columnFamilyExpr785 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_columnFamilyExpr789 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_columnFamilyExpr791 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_columnFamilyExpr807 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_columnFamilyExpr811 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_columnFamilyExpr813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_table862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_username869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_password876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_columnFamily883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_rowKey892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_value899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_columnOrSuperColumn906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_host915 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_DOT_in_host920 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_Identifier_in_host924 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_ipaddr945 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOT_in_ipaddr949 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IntegerLiteral_in_ipaddr953 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOT_in_ipaddr957 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IntegerLiteral_in_ipaddr961 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOT_in_ipaddr965 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IntegerLiteral_in_ipaddr969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_port986 = new BitSet(new long[]{0x0000000000000002L});

}