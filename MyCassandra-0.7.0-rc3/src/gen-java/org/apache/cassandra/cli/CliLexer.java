// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g 2011-01-01 16:05:57

package org.apache.cassandra.cli;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CliLexer extends Lexer {
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
    public static final int ARRAY=35;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int NODE_ADD_KEYSPACE=19;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int EXIT=46;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int NODE_THRIFT_DEL=17;
    public static final int T__83=83;
    public static final int SEMICOLON=40;
    public static final int KEYSPACES=51;
    public static final int CONDITIONS=34;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int FILE=74;
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

        public void reportError(RecognitionException e) 
        {
            StringBuilder errorMessage = new StringBuilder("Syntax error at position " + e.charPositionInLine + ": ");

            if (e instanceof NoViableAltException)
            {
                int index = e.charPositionInLine;
                String error = this.input.substring(index, index);
                String statement = this.input.substring(0, this.input.size() - 1);

                errorMessage.append("unexpected \"" + error + "\" for `" + statement + "`.");
            }
            else
            {
                errorMessage.append(this.getErrorMessage(e, this.getTokenNames()));
            }

            throw new RuntimeException(errorMessage.toString());
        }


    // delegates
    // delegators

    public CliLexer() {;} 
    public CliLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CliLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g"; }

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:28:7: ( '/' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:28:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:29:7: ( '?' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:29:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:30:7: ( 'AS' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:30:9: 'AS'
            {
            match("AS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:31:7: ( 'WHERE' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:31:9: 'WHERE'
            {
            match("WHERE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:32:7: ( '=' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:32:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:33:7: ( '>' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:33:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:34:7: ( '<' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:34:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:35:7: ( '>=' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:35:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:36:7: ( '<=' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:36:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:37:7: ( '[' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:37:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:38:7: ( ',' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:38:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:39:7: ( ']' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:39:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:40:7: ( '{' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:40:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:41:7: ( '}' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:41:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:42:7: ( ':' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:42:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:43:7: ( '(' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:43:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:44:7: ( ')' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:44:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:45:7: ( '.' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:45:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "CONFIG"
    public final void mCONFIG() throws RecognitionException {
        try {
            int _type = CONFIG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:499:7: ( 'CONFIG' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:499:13: 'CONFIG'
            {
            match("CONFIG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONFIG"

    // $ANTLR start "CONNECT"
    public final void mCONNECT() throws RecognitionException {
        try {
            int _type = CONNECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:500:8: ( 'CONNECT' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:500:13: 'CONNECT'
            {
            match("CONNECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONNECT"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:501:6: ( 'COUNT' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:501:13: 'COUNT'
            {
            match("COUNT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COUNT"

    // $ANTLR start "CLUSTER"
    public final void mCLUSTER() throws RecognitionException {
        try {
            int _type = CLUSTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:502:8: ( 'CLUSTER' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:502:13: 'CLUSTER'
            {
            match("CLUSTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLUSTER"

    // $ANTLR start "DEL"
    public final void mDEL() throws RecognitionException {
        try {
            int _type = DEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:503:4: ( 'DEL' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:503:13: 'DEL'
            {
            match("DEL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEL"

    // $ANTLR start "DESCRIBE"
    public final void mDESCRIBE() throws RecognitionException {
        try {
            int _type = DESCRIBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:504:9: ( 'DESCRIBE' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:504:13: 'DESCRIBE'
            {
            match("DESCRIBE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESCRIBE"

    // $ANTLR start "USE"
    public final void mUSE() throws RecognitionException {
        try {
            int _type = USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:505:4: ( 'USE' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:505:13: 'USE'
            {
            match("USE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USE"

    // $ANTLR start "GET"
    public final void mGET() throws RecognitionException {
        try {
            int _type = GET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:506:4: ( 'GET' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:506:13: 'GET'
            {
            match("GET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GET"

    // $ANTLR start "HELP"
    public final void mHELP() throws RecognitionException {
        try {
            int _type = HELP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:507:5: ( 'HELP' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:507:13: 'HELP'
            {
            match("HELP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HELP"

    // $ANTLR start "EXIT"
    public final void mEXIT() throws RecognitionException {
        try {
            int _type = EXIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:508:5: ( 'EXIT' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:508:13: 'EXIT'
            {
            match("EXIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXIT"

    // $ANTLR start "FILE"
    public final void mFILE() throws RecognitionException {
        try {
            int _type = FILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:509:5: ( 'FILE' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:509:13: 'FILE'
            {
            match("FILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FILE"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:510:5: ( 'NAME' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:510:13: 'NAME'
            {
            match("NAME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "QUIT"
    public final void mQUIT() throws RecognitionException {
        try {
            int _type = QUIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:511:5: ( 'QUIT' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:511:13: 'QUIT'
            {
            match("QUIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUIT"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:512:4: ( 'SET' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:512:13: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "SHOW"
    public final void mSHOW() throws RecognitionException {
        try {
            int _type = SHOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:513:5: ( 'SHOW' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:513:13: 'SHOW'
            {
            match("SHOW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHOW"

    // $ANTLR start "KEYSPACE"
    public final void mKEYSPACE() throws RecognitionException {
        try {
            int _type = KEYSPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:514:9: ( 'KEYSPACE' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:514:13: 'KEYSPACE'
            {
            match("KEYSPACE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYSPACE"

    // $ANTLR start "KEYSPACES"
    public final void mKEYSPACES() throws RecognitionException {
        try {
            int _type = KEYSPACES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:515:10: ( 'KEYSPACES' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:515:13: 'KEYSPACES'
            {
            match("KEYSPACES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYSPACES"

    // $ANTLR start "VERSION"
    public final void mVERSION() throws RecognitionException {
        try {
            int _type = VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:516:8: ( 'API VERSION' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:516:13: 'API VERSION'
            {
            match("API VERSION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VERSION"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:517:7: ( 'CREATE' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:517:13: 'CREATE'
            {
            match("CREATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:518:5: ( 'DROP' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:518:13: 'DROP'
            {
            match("DROP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "COLUMN"
    public final void mCOLUMN() throws RecognitionException {
        try {
            int _type = COLUMN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:519:7: ( 'COLUMN' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:519:13: 'COLUMN'
            {
            match("COLUMN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLUMN"

    // $ANTLR start "FAMILY"
    public final void mFAMILY() throws RecognitionException {
        try {
            int _type = FAMILY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:520:7: ( 'FAMILY' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:520:13: 'FAMILY'
            {
            match("FAMILY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FAMILY"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:521:5: ( 'WITH' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:521:13: 'WITH'
            {
            match("WITH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:522:4: ( 'AND' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:522:13: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:523:7: ( 'UPDATE' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:523:13: 'UPDATE'
            {
            match("UPDATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "LIST"
    public final void mLIST() throws RecognitionException {
        try {
            int _type = LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:524:5: ( 'LIST' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:524:13: 'LIST'
            {
            match("LIST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIST"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:525:6: ( 'LIMIT' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:525:13: 'LIMIT'
            {
            match("LIMIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "TRUNCATE"
    public final void mTRUNCATE() throws RecognitionException {
        try {
            int _type = TRUNCATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:526:9: ( 'TRUNCATE' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:526:13: 'TRUNCATE'
            {
            match("TRUNCATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUNCATE"

    // $ANTLR start "ASSUME"
    public final void mASSUME() throws RecognitionException {
        try {
            int _type = ASSUME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:527:7: ( 'ASSUME' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:527:13: 'ASSUME'
            {
            match("ASSUME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSUME"

    // $ANTLR start "TTL"
    public final void mTTL() throws RecognitionException {
        try {
            int _type = TTL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:528:4: ( 'TTL' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:528:13: 'TTL'
            {
            match("TTL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TTL"

    // $ANTLR start "IP_ADDRESS"
    public final void mIP_ADDRESS() throws RecognitionException {
        try {
            int _type = IP_ADDRESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:531:5: ( IntegerLiteral '.' IntegerLiteral '.' IntegerLiteral '.' IntegerLiteral )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:531:7: IntegerLiteral '.' IntegerLiteral '.' IntegerLiteral '.' IntegerLiteral
            {
            mIntegerLiteral(); 
            match('.'); 
            mIntegerLiteral(); 
            match('.'); 
            mIntegerLiteral(); 
            match('.'); 
            mIntegerLiteral(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IP_ADDRESS"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:537:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:
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
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:543:5: ( '0' .. '9' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:543:7: '0' .. '9'
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
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:548:5: ( Letter | Digit )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:
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

    // $ANTLR start "IntegerLiteral"
    public final void mIntegerLiteral() throws RecognitionException {
        try {
            int _type = IntegerLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:554:4: ( ( Digit )+ )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:554:6: ( Digit )+
            {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:554:6: ( Digit )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:554:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IntegerLiteral"

    // $ANTLR start "DoubleLiteral"
    public final void mDoubleLiteral() throws RecognitionException {
        try {
            int _type = DoubleLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:558:4: ( ( Digit )+ '.' ( Digit )+ )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:558:6: ( Digit )+ '.' ( Digit )+
            {
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:558:6: ( Digit )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:558:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('.'); 
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:558:17: ( Digit )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:558:17: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DoubleLiteral"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:561:5: ( ( Letter | Alnum ) ( Alnum | '_' | '-' )* )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:561:7: ( Letter | Alnum ) ( Alnum | '_' | '-' )*
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:561:24: ( Alnum | '_' | '-' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:
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
    // $ANTLR end "Identifier"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:566:5: ( '\\'' (~ '\\'' )* '\\'' ( '\\'' (~ '\\'' )* '\\'' )* )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:567:5: '\\'' (~ '\\'' )* '\\'' ( '\\'' (~ '\\'' )* '\\'' )*
            {
            match('\''); 
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:567:10: (~ '\\'' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:567:11: ~ '\\''
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
            	    break loop5;
                }
            } while (true);

            match('\''); 
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:567:24: ( '\\'' (~ '\\'' )* '\\'' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\'') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:567:26: '\\'' (~ '\\'' )* '\\''
            	    {
            	    match('\''); 
            	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:567:31: (~ '\\'' )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='\uFFFF')) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:567:32: ~ '\\''
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
            	    	    break loop6;
            	        }
            	    } while (true);

            	    match('\''); 

            	    }
            	    break;

            	default :
            	    break loop7;
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

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:575:5: ( ';' )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:575:7: ';'
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
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:579:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:579:8: ( ' ' | '\\r' | '\\t' | '\\n' )
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
            // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:583:5: ( '--' (~ ( '\\n' | '\\r' ) )* | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='-') ) {
                alt10=1;
            }
            else if ( (LA10_0=='/') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:583:7: '--' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("--"); 

                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:583:12: (~ ( '\\n' | '\\r' ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:583:13: ~ ( '\\n' | '\\r' )
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
                    	    break loop8;
                        }
                    } while (true);

                     _channel=HIDDEN; 

                    }
                    break;
                case 2 :
                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:584:7: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:584:12: ( options {greedy=false; } : . )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='*') ) {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1=='/') ) {
                                alt9=2;
                            }
                            else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                                alt9=1;
                            }


                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:584:39: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
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
        // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:8: ( T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | CONFIG | CONNECT | COUNT | CLUSTER | DEL | DESCRIBE | USE | GET | HELP | EXIT | FILE | NAME | QUIT | SET | SHOW | KEYSPACE | KEYSPACES | VERSION | CREATE | DROP | COLUMN | FAMILY | WITH | AND | UPDATE | LIST | LIMIT | TRUNCATE | ASSUME | TTL | IP_ADDRESS | IntegerLiteral | DoubleLiteral | Identifier | StringLiteral | SEMICOLON | WS | COMMENT )
        int alt11=56;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:10: T__81
                {
                mT__81(); 

                }
                break;
            case 2 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:16: T__82
                {
                mT__82(); 

                }
                break;
            case 3 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:22: T__83
                {
                mT__83(); 

                }
                break;
            case 4 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:28: T__84
                {
                mT__84(); 

                }
                break;
            case 5 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:34: T__85
                {
                mT__85(); 

                }
                break;
            case 6 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:40: T__86
                {
                mT__86(); 

                }
                break;
            case 7 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:46: T__87
                {
                mT__87(); 

                }
                break;
            case 8 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:52: T__88
                {
                mT__88(); 

                }
                break;
            case 9 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:58: T__89
                {
                mT__89(); 

                }
                break;
            case 10 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:64: T__90
                {
                mT__90(); 

                }
                break;
            case 11 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:70: T__91
                {
                mT__91(); 

                }
                break;
            case 12 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:76: T__92
                {
                mT__92(); 

                }
                break;
            case 13 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:82: T__93
                {
                mT__93(); 

                }
                break;
            case 14 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:88: T__94
                {
                mT__94(); 

                }
                break;
            case 15 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:94: T__95
                {
                mT__95(); 

                }
                break;
            case 16 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:100: T__96
                {
                mT__96(); 

                }
                break;
            case 17 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:106: T__97
                {
                mT__97(); 

                }
                break;
            case 18 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:112: T__98
                {
                mT__98(); 

                }
                break;
            case 19 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:118: CONFIG
                {
                mCONFIG(); 

                }
                break;
            case 20 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:125: CONNECT
                {
                mCONNECT(); 

                }
                break;
            case 21 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:133: COUNT
                {
                mCOUNT(); 

                }
                break;
            case 22 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:139: CLUSTER
                {
                mCLUSTER(); 

                }
                break;
            case 23 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:147: DEL
                {
                mDEL(); 

                }
                break;
            case 24 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:151: DESCRIBE
                {
                mDESCRIBE(); 

                }
                break;
            case 25 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:160: USE
                {
                mUSE(); 

                }
                break;
            case 26 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:164: GET
                {
                mGET(); 

                }
                break;
            case 27 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:168: HELP
                {
                mHELP(); 

                }
                break;
            case 28 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:173: EXIT
                {
                mEXIT(); 

                }
                break;
            case 29 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:178: FILE
                {
                mFILE(); 

                }
                break;
            case 30 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:183: NAME
                {
                mNAME(); 

                }
                break;
            case 31 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:188: QUIT
                {
                mQUIT(); 

                }
                break;
            case 32 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:193: SET
                {
                mSET(); 

                }
                break;
            case 33 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:197: SHOW
                {
                mSHOW(); 

                }
                break;
            case 34 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:202: KEYSPACE
                {
                mKEYSPACE(); 

                }
                break;
            case 35 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:211: KEYSPACES
                {
                mKEYSPACES(); 

                }
                break;
            case 36 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:221: VERSION
                {
                mVERSION(); 

                }
                break;
            case 37 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:229: CREATE
                {
                mCREATE(); 

                }
                break;
            case 38 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:236: DROP
                {
                mDROP(); 

                }
                break;
            case 39 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:241: COLUMN
                {
                mCOLUMN(); 

                }
                break;
            case 40 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:248: FAMILY
                {
                mFAMILY(); 

                }
                break;
            case 41 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:255: WITH
                {
                mWITH(); 

                }
                break;
            case 42 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:260: AND
                {
                mAND(); 

                }
                break;
            case 43 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:264: UPDATE
                {
                mUPDATE(); 

                }
                break;
            case 44 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:271: LIST
                {
                mLIST(); 

                }
                break;
            case 45 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:276: LIMIT
                {
                mLIMIT(); 

                }
                break;
            case 46 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:282: TRUNCATE
                {
                mTRUNCATE(); 

                }
                break;
            case 47 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:291: ASSUME
                {
                mASSUME(); 

                }
                break;
            case 48 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:298: TTL
                {
                mTTL(); 

                }
                break;
            case 49 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:302: IP_ADDRESS
                {
                mIP_ADDRESS(); 

                }
                break;
            case 50 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:313: IntegerLiteral
                {
                mIntegerLiteral(); 

                }
                break;
            case 51 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:328: DoubleLiteral
                {
                mDoubleLiteral(); 

                }
                break;
            case 52 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:342: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 53 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:353: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 54 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:367: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 55 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:377: WS
                {
                mWS(); 

                }
                break;
            case 56 :
                // /Users/sunsuk7tp/workspace/Cassandra_MySQL/MyCassandra-0.7.0-rc3/src/java/org/apache/cassandra/cli/Cli.g:1:380: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\44\1\uffff\2\37\1\uffff\1\53\1\55\11\uffff\15\37\1\102"+
        "\6\uffff\1\106\4\37\4\uffff\24\37\2\uffff\1\102\1\37\1\uffff\1\37"+
        "\1\146\7\37\1\157\2\37\1\162\1\37\1\164\6\37\1\173\5\37\1\u0081"+
        "\1\u0082\1\37\2\uffff\1\37\1\u0086\6\37\1\uffff\1\37\1\u008e\1\uffff"+
        "\1\37\1\uffff\1\u0090\1\u0091\1\u0092\1\37\1\u0094\1\u0095\1\uffff"+
        "\1\u0096\1\37\1\u0098\2\37\3\uffff\1\37\1\u009c\1\uffff\2\37\1\u009f"+
        "\4\37\1\uffff\1\37\3\uffff\1\37\3\uffff\1\37\1\uffff\1\u00a7\1\37"+
        "\1\u00a9\1\uffff\1\u00aa\1\37\1\uffff\1\u00ac\1\37\1\u00ae\1\37"+
        "\1\u00b0\1\u00b1\1\37\1\uffff\1\37\2\uffff\1\u00b4\1\uffff\1\u00b5"+
        "\1\uffff\1\37\2\uffff\2\37\2\uffff\1\u00b9\1\u00bb\1\u00bc\1\uffff"+
        "\1\u00bd\3\uffff";
    static final String DFA11_eofS =
        "\u00be\uffff";
    static final String DFA11_minS =
        "\1\11\1\52\1\uffff\1\116\1\110\1\uffff\2\75\11\uffff\1\114\1\105"+
        "\1\120\2\105\1\130\2\101\1\125\2\105\1\111\1\122\1\55\6\uffff\1"+
        "\55\1\111\1\104\1\105\1\124\4\uffff\1\114\1\125\1\105\1\114\1\117"+
        "\1\105\1\104\1\124\1\114\1\111\1\114\2\115\1\111\1\124\1\117\1\131"+
        "\1\115\1\125\1\114\1\uffff\1\60\1\55\1\125\1\uffff\1\40\1\55\1\122"+
        "\1\110\1\106\1\116\1\125\1\123\1\101\1\55\1\103\1\120\1\55\1\101"+
        "\1\55\1\120\1\124\1\105\1\111\1\105\1\124\1\55\1\127\1\123\1\124"+
        "\1\111\1\116\1\55\1\56\1\115\2\uffff\1\105\1\55\1\111\1\105\1\124"+
        "\1\115\2\124\1\uffff\1\122\1\55\1\uffff\1\124\1\uffff\3\55\1\114"+
        "\2\55\1\uffff\1\55\1\120\1\55\1\124\1\103\3\uffff\1\105\1\55\1\uffff"+
        "\1\107\1\103\1\55\1\116\2\105\1\111\1\uffff\1\105\3\uffff\1\131"+
        "\3\uffff\1\101\1\uffff\1\55\1\101\1\55\1\uffff\1\55\1\124\1\uffff"+
        "\1\55\1\122\1\55\1\102\2\55\1\103\1\uffff\1\124\2\uffff\1\55\1\uffff"+
        "\1\55\1\uffff\1\105\2\uffff\2\105\2\uffff\3\55\1\uffff\1\55\3\uffff";
    static final String DFA11_maxS =
        "\1\175\1\52\1\uffff\1\123\1\111\1\uffff\2\75\11\uffff\2\122\1\123"+
        "\2\105\1\130\1\111\1\101\1\125\1\110\1\105\1\111\1\124\1\172\6\uffff"+
        "\1\172\1\111\1\104\1\105\1\124\4\uffff\2\125\1\105\1\123\1\117\1"+
        "\105\1\104\1\124\1\114\1\111\1\114\2\115\1\111\1\124\1\117\1\131"+
        "\1\123\1\125\1\114\1\uffff\1\71\1\172\1\125\1\uffff\1\40\1\172\1"+
        "\122\1\110\2\116\1\125\1\123\1\101\1\172\1\103\1\120\1\172\1\101"+
        "\1\172\1\120\1\124\1\105\1\111\1\105\1\124\1\172\1\127\1\123\1\124"+
        "\1\111\1\116\1\172\1\71\1\115\2\uffff\1\105\1\172\1\111\1\105\1"+
        "\124\1\115\2\124\1\uffff\1\122\1\172\1\uffff\1\124\1\uffff\3\172"+
        "\1\114\2\172\1\uffff\1\172\1\120\1\172\1\124\1\103\3\uffff\1\105"+
        "\1\172\1\uffff\1\107\1\103\1\172\1\116\2\105\1\111\1\uffff\1\105"+
        "\3\uffff\1\131\3\uffff\1\101\1\uffff\1\172\1\101\1\172\1\uffff\1"+
        "\172\1\124\1\uffff\1\172\1\122\1\172\1\102\2\172\1\103\1\uffff\1"+
        "\124\2\uffff\1\172\1\uffff\1\172\1\uffff\1\105\2\uffff\2\105\2\uffff"+
        "\3\172\1\uffff\1\172\3\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\2\uffff\1\5\2\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1"+
        "\20\1\21\1\22\16\uffff\1\64\1\65\1\66\1\67\1\70\1\1\5\uffff\1\10"+
        "\1\6\1\11\1\7\24\uffff\1\62\3\uffff\1\3\36\uffff\1\44\1\52\10\uffff"+
        "\1\27\2\uffff\1\31\1\uffff\1\32\6\uffff\1\40\5\uffff\1\60\1\63\1"+
        "\61\2\uffff\1\51\7\uffff\1\46\1\uffff\1\33\1\34\1\35\1\uffff\1\36"+
        "\1\37\1\41\1\uffff\1\54\3\uffff\1\4\2\uffff\1\25\7\uffff\1\55\1"+
        "\uffff\1\57\1\23\1\uffff\1\47\1\uffff\1\45\1\uffff\1\53\1\50\2\uffff"+
        "\1\24\1\26\3\uffff\1\30\1\uffff\1\42\1\56\1\43";
    static final String DFA11_specialS =
        "\u00be\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\42\2\uffff\1\42\22\uffff\1\42\6\uffff\1\40\1\16\1\17\2\uffff"+
            "\1\11\1\43\1\20\1\1\12\36\1\15\1\41\1\7\1\5\1\6\1\2\1\uffff"+
            "\1\3\1\37\1\21\1\22\1\26\1\27\1\24\1\25\2\37\1\33\1\34\1\37"+
            "\1\30\2\37\1\31\1\37\1\32\1\35\1\23\1\37\1\4\3\37\1\10\1\uffff"+
            "\1\12\3\uffff\32\37\1\13\1\uffff\1\14",
            "\1\43",
            "",
            "\1\47\1\uffff\1\46\2\uffff\1\45",
            "\1\50\1\51",
            "",
            "\1\52",
            "\1\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57\2\uffff\1\56\2\uffff\1\60",
            "\1\61\14\uffff\1\62",
            "\1\64\2\uffff\1\63",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\71\7\uffff\1\70",
            "\1\72",
            "\1\73",
            "\1\74\2\uffff\1\75",
            "\1\76",
            "\1\77",
            "\1\100\1\uffff\1\101",
            "\1\37\1\103\1\uffff\12\104\7\uffff\32\37\4\uffff\1\37\1\uffff"+
            "\32\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37\2\uffff\12\37\7\uffff\22\37\1\105\7\37\4\uffff\1\37\1"+
            "\uffff\32\37",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "",
            "",
            "",
            "\1\115\1\uffff\1\113\6\uffff\1\114",
            "\1\116",
            "\1\117",
            "\1\120\6\uffff\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\140\5\uffff\1\137",
            "\1\141",
            "\1\142",
            "",
            "\12\143",
            "\1\37\1\103\1\uffff\12\104\7\uffff\32\37\4\uffff\1\37\1\uffff"+
            "\32\37",
            "\1\144",
            "",
            "\1\145",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\147",
            "\1\150",
            "\1\151\7\uffff\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\160",
            "\1\161",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\163",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0083\1\uffff\12\143",
            "\1\u0084",
            "",
            "",
            "\1\u0085",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u008f",
            "",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0093",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0097",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0099",
            "\1\u009a",
            "",
            "",
            "",
            "\1\u009b",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "",
            "",
            "",
            "\1\u00a5",
            "",
            "",
            "",
            "\1\u00a6",
            "",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00a8",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00ab",
            "",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00ad",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00af",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "",
            "",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00b6",
            "",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\37\2\uffff\12\37\7\uffff\22\37\1\u00ba\7\37\4\uffff\1\37"+
            "\1\uffff\32\37",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\37\2\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | CONFIG | CONNECT | COUNT | CLUSTER | DEL | DESCRIBE | USE | GET | HELP | EXIT | FILE | NAME | QUIT | SET | SHOW | KEYSPACE | KEYSPACES | VERSION | CREATE | DROP | COLUMN | FAMILY | WITH | AND | UPDATE | LIST | LIMIT | TRUNCATE | ASSUME | TTL | IP_ADDRESS | IntegerLiteral | DoubleLiteral | Identifier | StringLiteral | SEMICOLON | WS | COMMENT );";
        }
    }
 

}