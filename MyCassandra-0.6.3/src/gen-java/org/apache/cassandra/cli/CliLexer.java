// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g 2010-07-02 01:46:03

package org.apache.cassandra.cli;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CliLexer extends Lexer {
    public static final int K_TABLES=33;
    public static final int NODE_EXIT=7;
    public static final int K_EXIT=24;
    public static final int K_GET=25;
    public static final int K_CONNECT=20;
    public static final int K_DEL=28;
    public static final int K_CONFIG=41;
    public static final int EOF=-1;
    public static final int Identifier=37;
    public static final int K_SET=26;
    public static final int NODE_USE_TABLE=6;
    public static final int K_DESCRIBE=34;
    public static final int K_USE=36;
    public static final int NODE_SHOW_VERSION=11;
    public static final int SLASH=21;
    public static final int T__51=51;
    public static final int NODE_CONNECT=4;
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
    public static final int NODE_SHOW_CLUSTER_NAME=10;
    public static final int IntegerLiteral=40;
    public static final int Letter=43;
    public static final int NODE_COLUMN_ACCESS=17;

    // delegates
    // delegators

    public CliLexer() {;} 
    public CliLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CliLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g"; }

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:7:7: ( '?' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:7:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:8:7: ( '=' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:8:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:9:7: ( '[' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:9:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:10:7: ( ']' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:10:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "K_CONFIG"
    public final void mK_CONFIG() throws RecognitionException {
        try {
            int _type = K_CONFIG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:178:9: ( 'CONFIG' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:178:15: 'CONFIG'
            {
            match("CONFIG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_CONFIG"

    // $ANTLR start "K_CONNECT"
    public final void mK_CONNECT() throws RecognitionException {
        try {
            int _type = K_CONNECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:179:10: ( 'CONNECT' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:179:15: 'CONNECT'
            {
            match("CONNECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_CONNECT"

    // $ANTLR start "K_COUNT"
    public final void mK_COUNT() throws RecognitionException {
        try {
            int _type = K_COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:180:8: ( 'COUNT' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:180:15: 'COUNT'
            {
            match("COUNT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_COUNT"

    // $ANTLR start "K_CLUSTER"
    public final void mK_CLUSTER() throws RecognitionException {
        try {
            int _type = K_CLUSTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:181:10: ( 'CLUSTER' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:181:15: 'CLUSTER'
            {
            match("CLUSTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_CLUSTER"

    // $ANTLR start "K_DEL"
    public final void mK_DEL() throws RecognitionException {
        try {
            int _type = K_DEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:182:6: ( 'DEL' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:182:15: 'DEL'
            {
            match("DEL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DEL"

    // $ANTLR start "K_DESCRIBE"
    public final void mK_DESCRIBE() throws RecognitionException {
        try {
            int _type = K_DESCRIBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:183:11: ( 'DESCRIBE' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:183:15: 'DESCRIBE'
            {
            match("DESCRIBE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DESCRIBE"

    // $ANTLR start "K_USE"
    public final void mK_USE() throws RecognitionException {
        try {
            int _type = K_USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:184:6: ( 'USE' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:184:15: 'USE'
            {
            match("USE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_USE"

    // $ANTLR start "K_GET"
    public final void mK_GET() throws RecognitionException {
        try {
            int _type = K_GET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:185:6: ( 'GET' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:185:15: 'GET'
            {
            match("GET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_GET"

    // $ANTLR start "K_HELP"
    public final void mK_HELP() throws RecognitionException {
        try {
            int _type = K_HELP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:186:7: ( 'HELP' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:186:15: 'HELP'
            {
            match("HELP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_HELP"

    // $ANTLR start "K_EXIT"
    public final void mK_EXIT() throws RecognitionException {
        try {
            int _type = K_EXIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:187:7: ( 'EXIT' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:187:15: 'EXIT'
            {
            match("EXIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_EXIT"

    // $ANTLR start "K_FILE"
    public final void mK_FILE() throws RecognitionException {
        try {
            int _type = K_FILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:188:7: ( 'FILE' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:188:15: 'FILE'
            {
            match("FILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_FILE"

    // $ANTLR start "K_NAME"
    public final void mK_NAME() throws RecognitionException {
        try {
            int _type = K_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:189:7: ( 'NAME' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:189:15: 'NAME'
            {
            match("NAME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_NAME"

    // $ANTLR start "K_QUIT"
    public final void mK_QUIT() throws RecognitionException {
        try {
            int _type = K_QUIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:190:7: ( 'QUIT' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:190:15: 'QUIT'
            {
            match("QUIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_QUIT"

    // $ANTLR start "K_SET"
    public final void mK_SET() throws RecognitionException {
        try {
            int _type = K_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:191:6: ( 'SET' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:191:15: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_SET"

    // $ANTLR start "K_SHOW"
    public final void mK_SHOW() throws RecognitionException {
        try {
            int _type = K_SHOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:192:7: ( 'SHOW' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:192:15: 'SHOW'
            {
            match("SHOW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_SHOW"

    // $ANTLR start "K_TABLE"
    public final void mK_TABLE() throws RecognitionException {
        try {
            int _type = K_TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:193:8: ( 'KEYSPACE' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:193:15: 'KEYSPACE'
            {
            match("KEYSPACE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TABLE"

    // $ANTLR start "K_TABLES"
    public final void mK_TABLES() throws RecognitionException {
        try {
            int _type = K_TABLES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:194:9: ( 'KEYSPACES' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:194:15: 'KEYSPACES'
            {
            match("KEYSPACES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TABLES"

    // $ANTLR start "K_VERSION"
    public final void mK_VERSION() throws RecognitionException {
        try {
            int _type = K_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:195:10: ( 'API VERSION' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:195:15: 'API VERSION'
            {
            match("API VERSION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_VERSION"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:200:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:206:5: ( '0' .. '9' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:206:7: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "Alnum"
    public final void mAlnum() throws RecognitionException {
        try {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:211:5: ( Letter | Digit )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Alnum"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:217:5: ( Letter ( Alnum | '_' | '-' )* )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:217:7: Letter ( Alnum | '_' | '-' )*
            {
            mLetter(); 
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:217:14: ( Alnum | '_' | '-' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:222:5: ( '\\'' (~ '\\'' )* '\\'' ( '\\'' (~ '\\'' )* '\\'' )* )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:223:5: '\\'' (~ '\\'' )* '\\'' ( '\\'' (~ '\\'' )* '\\'' )*
            {
            match('\''); 
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:223:10: (~ '\\'' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:223:11: ~ '\\''
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\''); 
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:223:24: ( '\\'' (~ '\\'' )* '\\'' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\'') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:223:26: '\\'' (~ '\\'' )* '\\''
            	    {
            	    match('\''); 
            	    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:223:31: (~ '\\'' )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:223:32: ~ '\\''
            	    	    {
            	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    match('\''); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "IntegerLiteral"
    public final void mIntegerLiteral() throws RecognitionException {
        try {
            int _type = IntegerLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:228:4: ( ( Digit )+ )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:228:6: ( Digit )+
            {
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:228:6: ( Digit )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:228:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IntegerLiteral"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:235:5: ( '.' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:235:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:239:5: ( '/' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:239:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:243:5: ( ';' )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:243:7: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:247:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:247:8: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:251:5: ( '--' (~ ( '\\n' | '\\r' ) )* | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='-') ) {
                alt8=1;
            }
            else if ( (LA8_0=='/') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:251:7: '--' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("--"); 

                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:251:12: (~ ( '\\n' | '\\r' ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:251:13: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                     _channel=HIDDEN; 

                    }
                    break;
                case 2 :
                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:252:7: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:252:12: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:252:39: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match("*/"); 

                     _channel=HIDDEN; 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:8: ( T__48 | T__49 | T__50 | T__51 | K_CONFIG | K_CONNECT | K_COUNT | K_CLUSTER | K_DEL | K_DESCRIBE | K_USE | K_GET | K_HELP | K_EXIT | K_FILE | K_NAME | K_QUIT | K_SET | K_SHOW | K_TABLE | K_TABLES | K_VERSION | Identifier | StringLiteral | IntegerLiteral | DOT | SLASH | SEMICOLON | WS | COMMENT )
        int alt9=30;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:10: T__48
                {
                mT__48(); 

                }
                break;
            case 2 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:16: T__49
                {
                mT__49(); 

                }
                break;
            case 3 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:22: T__50
                {
                mT__50(); 

                }
                break;
            case 4 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:28: T__51
                {
                mT__51(); 

                }
                break;
            case 5 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:34: K_CONFIG
                {
                mK_CONFIG(); 

                }
                break;
            case 6 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:43: K_CONNECT
                {
                mK_CONNECT(); 

                }
                break;
            case 7 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:53: K_COUNT
                {
                mK_COUNT(); 

                }
                break;
            case 8 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:61: K_CLUSTER
                {
                mK_CLUSTER(); 

                }
                break;
            case 9 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:71: K_DEL
                {
                mK_DEL(); 

                }
                break;
            case 10 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:77: K_DESCRIBE
                {
                mK_DESCRIBE(); 

                }
                break;
            case 11 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:88: K_USE
                {
                mK_USE(); 

                }
                break;
            case 12 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:94: K_GET
                {
                mK_GET(); 

                }
                break;
            case 13 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:100: K_HELP
                {
                mK_HELP(); 

                }
                break;
            case 14 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:107: K_EXIT
                {
                mK_EXIT(); 

                }
                break;
            case 15 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:114: K_FILE
                {
                mK_FILE(); 

                }
                break;
            case 16 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:121: K_NAME
                {
                mK_NAME(); 

                }
                break;
            case 17 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:128: K_QUIT
                {
                mK_QUIT(); 

                }
                break;
            case 18 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:135: K_SET
                {
                mK_SET(); 

                }
                break;
            case 19 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:141: K_SHOW
                {
                mK_SHOW(); 

                }
                break;
            case 20 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:148: K_TABLE
                {
                mK_TABLE(); 

                }
                break;
            case 21 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:156: K_TABLES
                {
                mK_TABLES(); 

                }
                break;
            case 22 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:165: K_VERSION
                {
                mK_VERSION(); 

                }
                break;
            case 23 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:175: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 24 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:186: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 25 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:200: IntegerLiteral
                {
                mIntegerLiteral(); 

                }
                break;
            case 26 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:215: DOT
                {
                mDOT(); 

                }
                break;
            case 27 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:219: SLASH
                {
                mSLASH(); 

                }
                break;
            case 28 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:225: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 29 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:235: WS
                {
                mWS(); 

                }
                break;
            case 30 :
                // /Users/sunsuk7tp/workspace/MyCassandra-0.6.3/src/java/org/apache/cassandra/cli/Cli.g:1:238: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\5\uffff\14\21\4\uffff\1\47\3\uffff\16\21\1\uffff\3\21\1\74\1\21"+
        "\1\76\1\77\5\21\1\105\7\21\1\uffff\1\21\2\uffff\1\116\1\117\1\120"+
        "\1\121\1\122\1\uffff\1\123\1\21\1\uffff\2\21\1\127\2\21\6\uffff"+
        "\1\21\1\133\1\21\1\uffff\3\21\1\uffff\1\140\1\141\2\21\2\uffff\1"+
        "\144\1\146\1\uffff\1\147\2\uffff";
    static final String DFA9_eofS =
        "\150\uffff";
    static final String DFA9_minS =
        "\1\11\4\uffff\1\114\1\105\1\123\2\105\1\130\1\111\1\101\1\125\2"+
        "\105\1\120\4\uffff\1\52\3\uffff\1\116\1\125\1\114\1\105\1\124\1"+
        "\114\1\111\1\114\1\115\1\111\1\124\1\117\1\131\1\111\1\uffff\1\106"+
        "\1\116\1\123\1\55\1\103\2\55\1\120\1\124\2\105\1\124\1\55\1\127"+
        "\1\123\1\40\1\111\1\105\2\124\1\uffff\1\122\2\uffff\5\55\1\uffff"+
        "\1\55\1\120\1\uffff\1\107\1\103\1\55\1\105\1\111\6\uffff\1\101\1"+
        "\55\1\124\1\uffff\1\122\1\102\1\103\1\uffff\2\55\2\105\2\uffff\2"+
        "\55\1\uffff\1\55\2\uffff";
    static final String DFA9_maxS =
        "\1\172\4\uffff\1\117\1\105\1\123\2\105\1\130\1\111\1\101\1\125\1"+
        "\110\1\105\1\120\4\uffff\1\52\3\uffff\2\125\1\123\1\105\1\124\1"+
        "\114\1\111\1\114\1\115\1\111\1\124\1\117\1\131\1\111\1\uffff\2\116"+
        "\1\123\1\172\1\103\2\172\1\120\1\124\2\105\1\124\1\172\1\127\1\123"+
        "\1\40\1\111\1\105\2\124\1\uffff\1\122\2\uffff\5\172\1\uffff\1\172"+
        "\1\120\1\uffff\1\107\1\103\1\172\1\105\1\111\6\uffff\1\101\1\172"+
        "\1\124\1\uffff\1\122\1\102\1\103\1\uffff\2\172\2\105\2\uffff\2\172"+
        "\1\uffff\1\172\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\14\uffff\1\27\1\30\1\31\1\32\1\uffff\1"+
        "\34\1\35\1\36\16\uffff\1\33\24\uffff\1\11\1\uffff\1\13\1\14\5\uffff"+
        "\1\22\2\uffff\1\26\5\uffff\1\15\1\16\1\17\1\20\1\21\1\23\3\uffff"+
        "\1\7\3\uffff\1\5\4\uffff\1\6\1\10\2\uffff\1\12\1\uffff\1\24\1\25";
    static final String DFA9_specialS =
        "\150\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\27\2\uffff\1\27\22\uffff\1\27\6\uffff\1\22\5\uffff\1\30\1"+
            "\24\1\25\12\23\1\uffff\1\26\1\uffff\1\2\1\uffff\1\1\1\uffff"+
            "\1\20\1\21\1\5\1\6\1\12\1\13\1\10\1\11\2\21\1\17\2\21\1\14\2"+
            "\21\1\15\1\21\1\16\1\21\1\7\5\21\1\3\1\uffff\1\4\3\uffff\32"+
            "\21",
            "",
            "",
            "",
            "",
            "\1\32\2\uffff\1\31",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43\2\uffff\1\44",
            "\1\45",
            "\1\46",
            "",
            "",
            "",
            "",
            "\1\30",
            "",
            "",
            "",
            "\1\50\6\uffff\1\51",
            "\1\52",
            "\1\53\6\uffff\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "\1\70\7\uffff\1\71",
            "\1\72",
            "\1\73",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\75",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\1\115",
            "",
            "",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\124",
            "",
            "\1\125",
            "\1\126",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\130",
            "\1\131",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\134",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\142",
            "\1\143",
            "",
            "",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\21\2\uffff\12\21\7\uffff\22\21\1\145\7\21\4\uffff\1\21\1"+
            "\uffff\32\21",
            "",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__48 | T__49 | T__50 | T__51 | K_CONFIG | K_CONNECT | K_COUNT | K_CLUSTER | K_DEL | K_DESCRIBE | K_USE | K_GET | K_HELP | K_EXIT | K_FILE | K_NAME | K_QUIT | K_SET | K_SHOW | K_TABLE | K_TABLES | K_VERSION | Identifier | StringLiteral | IntegerLiteral | DOT | SLASH | SEMICOLON | WS | COMMENT );";
        }
    }
 

}