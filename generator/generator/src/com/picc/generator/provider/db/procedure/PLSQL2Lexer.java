// $ANTLR 3.2 Sep 23, 2009 12:02:23 src/org/plsql/PLSQL2.g 2011-02-11 20:49:41

package com.picc.generator.provider.db.procedure;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PLSQL2Lexer extends Lexer {
    public static final int FUNCTION=8;
    public static final int PACKAGE=116;
    public static final int EXTERNAL=118;
    public static final int EXPONENT=100;
    public static final int WHILE=88;
    public static final int DETERMINISTIC=38;
    public static final int VARYING=28;
    public static final int CASE=51;
    public static final int DOUBLEDOT=67;
    public static final int NOT=20;
    public static final int SUBTYPE=25;
    public static final int EOF=-1;
    public static final int SQL=101;
    public static final int RPAREN=12;
    public static final int CREATE=115;
    public static final int INSERT=80;
    public static final int USING=63;
    public static final int RETURNING=64;
    public static final int LOOP=50;
    public static final int BEGIN=42;
    public static final int SAVEPOINT=83;
    public static final int RETURN=9;
    public static final int RAISE=75;
    public static final int BODY=117;
    public static final int GEQ=94;
    public static final int EQ=89;
    public static final int GOTO=70;
    public static final int SELECT=84;
    public static final int INTO=60;
    public static final int ISOPEN=103;
    public static final int ARRAY=29;
    public static final int DIVIDE=4;
    public static final int EXCEPTION=23;
    public static final int EXIT=57;
    public static final int RBRACK=126;
    public static final int RECORD=26;
    public static final int N=129;
    public static final int TRANSACTION=86;
    public static final int NULL=21;
    public static final int ELSE=52;
    public static final int AT_SIGN=125;
    public static final int DEFINER=121;
    public static final int DELETE=49;
    public static final int DOUBLEVERTBAR=98;
    public static final int ROLLBACK=82;
    public static final int AUTHID=119;
    public static final int NOCOPY=17;
    public static final int WS=131;
    public static final int LANGUAGE=122;
    public static final int FETCH=58;
    public static final int OUT=16;
    public static final int REAL_NUMBER=106;
    public static final int PIPELINED=39;
    public static final int SL_COMMENT=132;
    public static final int OR=45;
    public static final int CONSTANT=22;
    public static final int ELSIF=72;
    public static final int END=43;
    public static final int FALSE=108;
    public static final int COLLECT=62;
    public static final int CURSOR=18;
    public static final int OTHERS=46;
    public static final int LBRACK=127;
    public static final int POINT=124;
    public static final int CURRENT_USER=120;
    public static final int LIMIT=59;
    public static final int EXECUTE=55;
    public static final int INSERTING=111;
    public static final int GTH=93;
    public static final int NOTFOUND=104;
    public static final int PRAGMA=74;
    public static final int RESULT_CACHE=41;
    public static final int TABLE=31;
    public static final int LLABEL=77;
    public static final int UPDATE=87;
    public static final int FOR=65;
    public static final int ID=7;
    public static final int AND=69;
    public static final int ASTERISK=99;
    public static final int LPAREN=10;
    public static final int LOCK=81;
    public static final int UPDATING=112;
    public static final int IF=71;
    public static final int RLABEL=78;
    public static final int ML_COMMENT=133;
    public static final int INDEX=32;
    public static final int AS=24;
    public static final int ROWTYPE=37;
    public static final int THEN=47;
    public static final int IN=15;
    public static final int CONTINUE=54;
    public static final int OBJECT=27;
    public static final int COMMA=11;
    public static final int IS=19;
    public static final int PLUS=97;
    public static final int QUOTED_STRING=109;
    public static final int EXISTS=110;
    public static final int DOT=35;
    public static final int LIKE=95;
    public static final int INTEGER=105;
    public static final int VARRAY=30;
    public static final int BY=33;
    public static final int PERCENT=36;
    public static final int PARALLEL_ENABLE=40;
    public static final int DOUBLEQUOTED_STRING=123;
    public static final int DEFAULT=14;
    public static final int FORALL=66;
    public static final int SET=85;
    public static final int MINUS=96;
    public static final int SEMI=5;
    public static final int TRUE=107;
    public static final int PROCEDURE=6;
    public static final int NOT_EQ=90;
    public static final int REF=34;
    public static final int VERTBAR=128;
    public static final int LTH=91;
    public static final int OPEN=73;
    public static final int COLON=48;
    public static final int COMMIT=79;
    public static final int BULK_ROWCOUNT=102;
    public static final int CLOSE=53;
    public static final int WHEN=44;
    public static final int ASSIGN=13;
    public static final int IMMEDIATE=56;
    public static final int NUMBER_VALUE=130;
    public static final int DECLARE=76;
    public static final int ARROW=114;
    public static final int DELETING=113;
    public static final int BULK=61;
    public static final int BETWEEN=68;
    public static final int LEQ=92;

    public String getErrorHeader(RecognitionException e) {
        return getSourceName()+":"+e.line+":"+(e.charPositionInLine+1)+":";
    }

    // needed for things like BETWEEN 1..2 where 1. would be treated as a literal
    private boolean numberDotValid() {
        int i = 1;
        while (input.LA(i) >= '0' && input.LA(i) <= '9') {
            i++;
        }
        return input.LA(i) == '.' && input.LA(i+1) != '.';
    }


    // delegates
    // delegators

    public PLSQL2Lexer() {;} 
    public PLSQL2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PLSQL2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
   // public String getGrammarFileName() { return "com/picc/plsql/PLSQL2.g"; }
    public String getGrammarFileName() { return "generator/src/com/picc/generator/provider/db/procedure/PLSQL2.g"; }

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:799:5: ( 'and' )
            // src/org/plsql/PLSQL2.g:799:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:800:7: ( 'array' )
            // src/org/plsql/PLSQL2.g:800:9: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARRAY"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:801:4: ( 'as' )
            // src/org/plsql/PLSQL2.g:801:6: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "AUTHID"
    public final void mAUTHID() throws RecognitionException {
        try {
            int _type = AUTHID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:802:7: ( 'authid' )
            // src/org/plsql/PLSQL2.g:802:9: 'authid'
            {
            match("authid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AUTHID"

    // $ANTLR start "BETWEEN"
    public final void mBETWEEN() throws RecognitionException {
        try {
            int _type = BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:803:9: ( 'between' )
            // src/org/plsql/PLSQL2.g:803:11: 'between'
            {
            match("between"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BETWEEN"

    // $ANTLR start "BODY"
    public final void mBODY() throws RecognitionException {
        try {
            int _type = BODY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:804:6: ( 'body' )
            // src/org/plsql/PLSQL2.g:804:8: 'body'
            {
            match("body"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BODY"

    // $ANTLR start "BULK"
    public final void mBULK() throws RecognitionException {
        try {
            int _type = BULK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:805:5: ( 'bulk' )
            // src/org/plsql/PLSQL2.g:805:7: 'bulk'
            {
            match("bulk"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BULK"

    // $ANTLR start "BULK_ROWCOUNT"
    public final void mBULK_ROWCOUNT() throws RecognitionException {
        try {
            int _type = BULK_ROWCOUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:806:14: ( 'bulk_rowcount' )
            // src/org/plsql/PLSQL2.g:806:16: 'bulk_rowcount'
            {
            match("bulk_rowcount"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BULK_ROWCOUNT"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:807:4: ( 'by' )
            // src/org/plsql/PLSQL2.g:807:6: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:808:5: ( 'case' )
            // src/org/plsql/PLSQL2.g:808:7: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:809:7: ( 'create' )
            // src/org/plsql/PLSQL2.g:809:9: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "COLLECT"
    public final void mCOLLECT() throws RecognitionException {
        try {
            int _type = COLLECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:810:8: ( 'collect' )
            // src/org/plsql/PLSQL2.g:810:10: 'collect'
            {
            match("collect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLLECT"

    // $ANTLR start "COMMIT"
    public final void mCOMMIT() throws RecognitionException {
        try {
            int _type = COMMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:811:8: ( 'commit' )
            // src/org/plsql/PLSQL2.g:811:10: 'commit'
            {
            match("commit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMIT"

    // $ANTLR start "CURRENT_USER"
    public final void mCURRENT_USER() throws RecognitionException {
        try {
            int _type = CURRENT_USER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:812:13: ( 'current_user' )
            // src/org/plsql/PLSQL2.g:812:15: 'current_user'
            {
            match("current_user"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURRENT_USER"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:813:9: ( 'default' )
            // src/org/plsql/PLSQL2.g:813:11: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "DEFINER"
    public final void mDEFINER() throws RecognitionException {
        try {
            int _type = DEFINER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:814:8: ( 'definer' )
            // src/org/plsql/PLSQL2.g:814:10: 'definer'
            {
            match("definer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFINER"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:815:8: ( 'delete' )
            // src/org/plsql/PLSQL2.g:815:10: 'delete'
            {
            match("delete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:816:6: ( 'else' )
            // src/org/plsql/PLSQL2.g:816:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELSIF"
    public final void mELSIF() throws RecognitionException {
        try {
            int _type = ELSIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:817:7: ( 'elsif' )
            // src/org/plsql/PLSQL2.g:817:9: 'elsif'
            {
            match("elsif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSIF"

    // $ANTLR start "EXTERNAL"
    public final void mEXTERNAL() throws RecognitionException {
        try {
            int _type = EXTERNAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:818:9: ( 'external' )
            // src/org/plsql/PLSQL2.g:818:11: 'external'
            {
            match("external"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTERNAL"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:819:7: ( 'false' )
            // src/org/plsql/PLSQL2.g:819:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "FETCH"
    public final void mFETCH() throws RecognitionException {
        try {
            int _type = FETCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:820:7: ( 'fetch' )
            // src/org/plsql/PLSQL2.g:820:9: 'fetch'
            {
            match("fetch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FETCH"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:821:5: ( 'for' )
            // src/org/plsql/PLSQL2.g:821:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FORALL"
    public final void mFORALL() throws RecognitionException {
        try {
            int _type = FORALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:822:8: ( 'forall' )
            // src/org/plsql/PLSQL2.g:822:10: 'forall'
            {
            match("forall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FORALL"

    // $ANTLR start "GOTO"
    public final void mGOTO() throws RecognitionException {
        try {
            int _type = GOTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:823:6: ( 'goto' )
            // src/org/plsql/PLSQL2.g:823:8: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GOTO"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:824:4: ( 'if' )
            // src/org/plsql/PLSQL2.g:824:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:825:4: ( 'in' )
            // src/org/plsql/PLSQL2.g:825:6: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "INDEX"
    public final void mINDEX() throws RecognitionException {
        try {
            int _type = INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:826:7: ( 'index' )
            // src/org/plsql/PLSQL2.g:826:9: 'index'
            {
            match("index"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDEX"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:827:8: ( 'insert' )
            // src/org/plsql/PLSQL2.g:827:10: 'insert'
            {
            match("insert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:828:6: ( 'into' )
            // src/org/plsql/PLSQL2.g:828:8: 'into'
            {
            match("into"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:829:4: ( 'is' )
            // src/org/plsql/PLSQL2.g:829:6: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "LANGUAGE"
    public final void mLANGUAGE() throws RecognitionException {
        try {
            int _type = LANGUAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:830:9: ( 'language' )
            // src/org/plsql/PLSQL2.g:830:11: 'language'
            {
            match("language"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LANGUAGE"

    // $ANTLR start "LIKE"
    public final void mLIKE() throws RecognitionException {
        try {
            int _type = LIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:831:6: ( 'like' )
            // src/org/plsql/PLSQL2.g:831:8: 'like'
            {
            match("like"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIKE"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:832:7: ( 'limit' )
            // src/org/plsql/PLSQL2.g:832:9: 'limit'
            {
            match("limit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "LOCK"
    public final void mLOCK() throws RecognitionException {
        try {
            int _type = LOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:833:6: ( 'lock' )
            // src/org/plsql/PLSQL2.g:833:8: 'lock'
            {
            match("lock"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOCK"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:834:5: ( 'not' )
            // src/org/plsql/PLSQL2.g:834:7: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NOTFOUND"
    public final void mNOTFOUND() throws RecognitionException {
        try {
            int _type = NOTFOUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:835:9: ( 'notfound' )
            // src/org/plsql/PLSQL2.g:835:11: 'notfound'
            {
            match("notfound"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTFOUND"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:836:6: ( 'null' )
            // src/org/plsql/PLSQL2.g:836:8: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "OPEN"
    public final void mOPEN() throws RecognitionException {
        try {
            int _type = OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:837:6: ( 'open' )
            // src/org/plsql/PLSQL2.g:837:8: 'open'
            {
            match("open"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:838:4: ( 'or' )
            // src/org/plsql/PLSQL2.g:838:6: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "PACKAGE"
    public final void mPACKAGE() throws RecognitionException {
        try {
            int _type = PACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:839:8: ( 'package' )
            // src/org/plsql/PLSQL2.g:839:10: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PACKAGE"

    // $ANTLR start "RAISE"
    public final void mRAISE() throws RecognitionException {
        try {
            int _type = RAISE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:840:7: ( 'raise' )
            // src/org/plsql/PLSQL2.g:840:9: 'raise'
            {
            match("raise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RAISE"

    // $ANTLR start "ROLLBACK"
    public final void mROLLBACK() throws RecognitionException {
        try {
            int _type = ROLLBACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:841:9: ( 'rollback' )
            // src/org/plsql/PLSQL2.g:841:11: 'rollback'
            {
            match("rollback"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROLLBACK"

    // $ANTLR start "SAVEPOINT"
    public final void mSAVEPOINT() throws RecognitionException {
        try {
            int _type = SAVEPOINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:842:11: ( 'savepoint' )
            // src/org/plsql/PLSQL2.g:842:13: 'savepoint'
            {
            match("savepoint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SAVEPOINT"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:843:8: ( 'select' )
            // src/org/plsql/PLSQL2.g:843:10: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:844:5: ( 'set' )
            // src/org/plsql/PLSQL2.g:844:7: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "SQL"
    public final void mSQL() throws RecognitionException {
        try {
            int _type = SQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:845:5: ( 'sql' )
            // src/org/plsql/PLSQL2.g:845:7: 'sql'
            {
            match("sql"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQL"

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            int _type = TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:846:7: ( 'table' )
            // src/org/plsql/PLSQL2.g:846:9: 'table'
            {
            match("table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TABLE"

    // $ANTLR start "TRANSACTION"
    public final void mTRANSACTION() throws RecognitionException {
        try {
            int _type = TRANSACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:847:13: ( 'transaction' )
            // src/org/plsql/PLSQL2.g:847:15: 'transaction'
            {
            match("transaction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRANSACTION"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:848:6: ( 'true' )
            // src/org/plsql/PLSQL2.g:848:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:849:6: ( 'then' )
            // src/org/plsql/PLSQL2.g:849:8: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:850:8: ( 'update' )
            // src/org/plsql/PLSQL2.g:850:10: 'update'
            {
            match("update"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:851:7: ( 'while' )
            // src/org/plsql/PLSQL2.g:851:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "INSERTING"
    public final void mINSERTING() throws RecognitionException {
        try {
            int _type = INSERTING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:853:2: ( 'inserting' )
            // src/org/plsql/PLSQL2.g:853:4: 'inserting'
            {
            match("inserting"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSERTING"

    // $ANTLR start "UPDATING"
    public final void mUPDATING() throws RecognitionException {
        try {
            int _type = UPDATING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:854:9: ( 'updating' )
            // src/org/plsql/PLSQL2.g:854:11: 'updating'
            {
            match("updating"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPDATING"

    // $ANTLR start "DELETING"
    public final void mDELETING() throws RecognitionException {
        try {
            int _type = DELETING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:855:9: ( 'deleting' )
            // src/org/plsql/PLSQL2.g:855:11: 'deleting'
            {
            match("deleting"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETING"

    // $ANTLR start "ISOPEN"
    public final void mISOPEN() throws RecognitionException {
        try {
            int _type = ISOPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:856:8: ( 'isopen' )
            // src/org/plsql/PLSQL2.g:856:10: 'isopen'
            {
            match("isopen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISOPEN"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:857:8: ( 'exists' )
            // src/org/plsql/PLSQL2.g:857:10: 'exists'
            {
            match("exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:859:7: ( 'begin' )
            // src/org/plsql/PLSQL2.g:859:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "CLOSE"
    public final void mCLOSE() throws RecognitionException {
        try {
            int _type = CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:860:7: ( 'close' )
            // src/org/plsql/PLSQL2.g:860:9: 'close'
            {
            match("close"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE"

    // $ANTLR start "CONSTANT"
    public final void mCONSTANT() throws RecognitionException {
        try {
            int _type = CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:861:10: ( 'constant' )
            // src/org/plsql/PLSQL2.g:861:12: 'constant'
            {
            match("constant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTANT"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:862:9: ( 'continue' )
            // src/org/plsql/PLSQL2.g:862:11: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "CURSOR"
    public final void mCURSOR() throws RecognitionException {
        try {
            int _type = CURSOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:863:8: ( 'cursor' )
            // src/org/plsql/PLSQL2.g:863:10: 'cursor'
            {
            match("cursor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURSOR"

    // $ANTLR start "DECLARE"
    public final void mDECLARE() throws RecognitionException {
        try {
            int _type = DECLARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:864:9: ( 'declare' )
            // src/org/plsql/PLSQL2.g:864:11: 'declare'
            {
            match("declare"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECLARE"

    // $ANTLR start "DETERMINISTIC"
    public final void mDETERMINISTIC() throws RecognitionException {
        try {
            int _type = DETERMINISTIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:865:15: ( 'deterministic' )
            // src/org/plsql/PLSQL2.g:865:17: 'deterministic'
            {
            match("deterministic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DETERMINISTIC"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:866:5: ( 'end' )
            // src/org/plsql/PLSQL2.g:866:7: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "EXCEPTION"
    public final void mEXCEPTION() throws RecognitionException {
        try {
            int _type = EXCEPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:867:11: ( 'exception' )
            // src/org/plsql/PLSQL2.g:867:13: 'exception'
            {
            match("exception"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCEPTION"

    // $ANTLR start "EXECUTE"
    public final void mEXECUTE() throws RecognitionException {
        try {
            int _type = EXECUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:868:9: ( 'execute' )
            // src/org/plsql/PLSQL2.g:868:11: 'execute'
            {
            match("execute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXECUTE"

    // $ANTLR start "EXIT"
    public final void mEXIT() throws RecognitionException {
        try {
            int _type = EXIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:869:6: ( 'exit' )
            // src/org/plsql/PLSQL2.g:869:8: 'exit'
            {
            match("exit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXIT"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:870:10: ( 'function' )
            // src/org/plsql/PLSQL2.g:870:12: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "IMMEDIATE"
    public final void mIMMEDIATE() throws RecognitionException {
        try {
            int _type = IMMEDIATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:871:11: ( 'immediate' )
            // src/org/plsql/PLSQL2.g:871:13: 'immediate'
            {
            match("immediate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMMEDIATE"

    // $ANTLR start "LOOP"
    public final void mLOOP() throws RecognitionException {
        try {
            int _type = LOOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:872:6: ( 'loop' )
            // src/org/plsql/PLSQL2.g:872:8: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOOP"

    // $ANTLR start "NOCOPY"
    public final void mNOCOPY() throws RecognitionException {
        try {
            int _type = NOCOPY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:873:8: ( 'nocopy' )
            // src/org/plsql/PLSQL2.g:873:10: 'nocopy'
            {
            match("nocopy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOCOPY"

    // $ANTLR start "OBJECT"
    public final void mOBJECT() throws RecognitionException {
        try {
            int _type = OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:874:9: ( 'object' )
            // src/org/plsql/PLSQL2.g:874:13: 'object'
            {
            match("object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBJECT"

    // $ANTLR start "OTHERS"
    public final void mOTHERS() throws RecognitionException {
        try {
            int _type = OTHERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:875:8: ( 'others' )
            // src/org/plsql/PLSQL2.g:875:10: 'others'
            {
            match("others"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OTHERS"

    // $ANTLR start "OUT"
    public final void mOUT() throws RecognitionException {
        try {
            int _type = OUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:876:5: ( 'out' )
            // src/org/plsql/PLSQL2.g:876:7: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OUT"

    // $ANTLR start "PARALLEL_ENABLE"
    public final void mPARALLEL_ENABLE() throws RecognitionException {
        try {
            int _type = PARALLEL_ENABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:877:17: ( 'parallel_enable' )
            // src/org/plsql/PLSQL2.g:877:19: 'parallel_enable'
            {
            match("parallel_enable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARALLEL_ENABLE"

    // $ANTLR start "PIPELINED"
    public final void mPIPELINED() throws RecognitionException {
        try {
            int _type = PIPELINED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:878:11: ( 'pipelined' )
            // src/org/plsql/PLSQL2.g:878:13: 'pipelined'
            {
            match("pipelined"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PIPELINED"

    // $ANTLR start "PRAGMA"
    public final void mPRAGMA() throws RecognitionException {
        try {
            int _type = PRAGMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:879:8: ( 'pragma' )
            // src/org/plsql/PLSQL2.g:879:10: 'pragma'
            {
            match("pragma"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRAGMA"

    // $ANTLR start "PROCEDURE"
    public final void mPROCEDURE() throws RecognitionException {
        try {
            int _type = PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:880:11: ( 'procedure' )
            // src/org/plsql/PLSQL2.g:880:13: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROCEDURE"

    // $ANTLR start "RECORD"
    public final void mRECORD() throws RecognitionException {
        try {
            int _type = RECORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:881:8: ( 'record' )
            // src/org/plsql/PLSQL2.g:881:10: 'record'
            {
            match("record"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RECORD"

    // $ANTLR start "REF"
    public final void mREF() throws RecognitionException {
        try {
            int _type = REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:882:5: ( 'ref' )
            // src/org/plsql/PLSQL2.g:882:7: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REF"

    // $ANTLR start "RESULT_CACHE"
    public final void mRESULT_CACHE() throws RecognitionException {
        try {
            int _type = RESULT_CACHE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:883:14: ( 'result_cache' )
            // src/org/plsql/PLSQL2.g:883:16: 'result_cache'
            {
            match("result_cache"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RESULT_CACHE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:884:8: ( 'return' )
            // src/org/plsql/PLSQL2.g:884:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "RETURNING"
    public final void mRETURNING() throws RecognitionException {
        try {
            int _type = RETURNING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:885:11: ( 'returning' )
            // src/org/plsql/PLSQL2.g:885:13: 'returning'
            {
            match("returning"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURNING"

    // $ANTLR start "ROWTYPE"
    public final void mROWTYPE() throws RecognitionException {
        try {
            int _type = ROWTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:886:9: ( 'rowtype' )
            // src/org/plsql/PLSQL2.g:886:11: 'rowtype'
            {
            match("rowtype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROWTYPE"

    // $ANTLR start "SUBTYPE"
    public final void mSUBTYPE() throws RecognitionException {
        try {
            int _type = SUBTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:887:9: ( 'subtype' )
            // src/org/plsql/PLSQL2.g:887:11: 'subtype'
            {
            match("subtype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUBTYPE"

    // $ANTLR start "USING"
    public final void mUSING() throws RecognitionException {
        try {
            int _type = USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:888:6: ( 'using' )
            // src/org/plsql/PLSQL2.g:888:8: 'using'
            {
            match("using"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USING"

    // $ANTLR start "VARRAY"
    public final void mVARRAY() throws RecognitionException {
        try {
            int _type = VARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:889:8: ( 'varray' )
            // src/org/plsql/PLSQL2.g:889:10: 'varray'
            {
            match("varray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARRAY"

    // $ANTLR start "VARYING"
    public final void mVARYING() throws RecognitionException {
        try {
            int _type = VARYING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:890:9: ( 'varying' )
            // src/org/plsql/PLSQL2.g:890:11: 'varying'
            {
            match("varying"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARYING"

    // $ANTLR start "WHEN"
    public final void mWHEN() throws RecognitionException {
        try {
            int _type = WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:891:6: ( 'when' )
            // src/org/plsql/PLSQL2.g:891:8: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHEN"

    // $ANTLR start "QUOTED_STRING"
    public final void mQUOTED_STRING() throws RecognitionException {
        try {
            int _type = QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:894:2: ( ( 'n' )? '\\'' ( '\\'\\'' | ~ ( '\\'' ) )* '\\'' )
            // src/org/plsql/PLSQL2.g:894:4: ( 'n' )? '\\'' ( '\\'\\'' | ~ ( '\\'' ) )* '\\''
            {
            // src/org/plsql/PLSQL2.g:894:4: ( 'n' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='n') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:894:6: 'n'
                    {
                    match('n'); 

                    }
                    break;

            }

            match('\''); 
            // src/org/plsql/PLSQL2.g:894:18: ( '\\'\\'' | ~ ( '\\'' ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\'') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='\'') ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:894:20: '\\'\\''
            	    {
            	    match("''"); 


            	    }
            	    break;
            	case 2 :
            	    // src/org/plsql/PLSQL2.g:894:29: ~ ( '\\'' )
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

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTED_STRING"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:898:2: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )* | DOUBLEQUOTED_STRING )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='a' && LA4_0<='z')) ) {
                alt4=1;
            }
            else if ( (LA4_0=='\"') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:898:4: ( 'a' .. 'z' ) ( 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )*
                    {
                    // src/org/plsql/PLSQL2.g:898:4: ( 'a' .. 'z' )
                    // src/org/plsql/PLSQL2.g:898:6: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }

                    // src/org/plsql/PLSQL2.g:899:3: ( 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='#' && LA3_0<='$')||(LA3_0>='0' && LA3_0<='9')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // src/org/plsql/PLSQL2.g:
                    	    {
                    	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:900:4: DOUBLEQUOTED_STRING
                    {
                    mDOUBLEQUOTED_STRING(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:903:2: ( ';' )
            // src/org/plsql/PLSQL2.g:903:4: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:906:2: ( ':' )
            // src/org/plsql/PLSQL2.g:906:4: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "DOUBLEDOT"
    public final void mDOUBLEDOT() throws RecognitionException {
        try {
            int _type = DOUBLEDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:909:2: ( POINT POINT )
            // src/org/plsql/PLSQL2.g:909:4: POINT POINT
            {
            mPOINT(); 
            mPOINT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLEDOT"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:912:2: ( POINT )
            // src/org/plsql/PLSQL2.g:912:4: POINT
            {
            mPOINT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            // src/org/plsql/PLSQL2.g:916:2: ( '.' )
            // src/org/plsql/PLSQL2.g:916:4: '.'
            {
            match('.'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "POINT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:919:2: ( ',' )
            // src/org/plsql/PLSQL2.g:919:4: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            int _type = EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:922:2: ( '**' )
            // src/org/plsql/PLSQL2.g:922:4: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:925:2: ( '*' )
            // src/org/plsql/PLSQL2.g:925:4: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "AT_SIGN"
    public final void mAT_SIGN() throws RecognitionException {
        try {
            int _type = AT_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:928:2: ( '@' )
            // src/org/plsql/PLSQL2.g:928:4: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT_SIGN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:931:2: ( ')' )
            // src/org/plsql/PLSQL2.g:931:4: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:934:2: ( '(' )
            // src/org/plsql/PLSQL2.g:934:4: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:937:2: ( ']' )
            // src/org/plsql/PLSQL2.g:937:4: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:940:2: ( '[' )
            // src/org/plsql/PLSQL2.g:940:4: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:943:2: ( '+' )
            // src/org/plsql/PLSQL2.g:943:4: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:946:2: ( '-' )
            // src/org/plsql/PLSQL2.g:946:4: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:949:2: ( '/' )
            // src/org/plsql/PLSQL2.g:949:4: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:952:2: ( '=' )
            // src/org/plsql/PLSQL2.g:952:4: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:955:2: ( '%' )
            // src/org/plsql/PLSQL2.g:955:4: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "LLABEL"
    public final void mLLABEL() throws RecognitionException {
        try {
            int _type = LLABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:958:2: ( '<<' )
            // src/org/plsql/PLSQL2.g:958:4: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LLABEL"

    // $ANTLR start "RLABEL"
    public final void mRLABEL() throws RecognitionException {
        try {
            int _type = RLABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:961:2: ( '>>' )
            // src/org/plsql/PLSQL2.g:961:4: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RLABEL"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:964:2: ( ':=' )
            // src/org/plsql/PLSQL2.g:964:4: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:967:2: ( '=>' )
            // src/org/plsql/PLSQL2.g:967:4: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "VERTBAR"
    public final void mVERTBAR() throws RecognitionException {
        try {
            int _type = VERTBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:970:2: ( '|' )
            // src/org/plsql/PLSQL2.g:970:4: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VERTBAR"

    // $ANTLR start "DOUBLEVERTBAR"
    public final void mDOUBLEVERTBAR() throws RecognitionException {
        try {
            int _type = DOUBLEVERTBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:973:2: ( '||' )
            // src/org/plsql/PLSQL2.g:973:4: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLEVERTBAR"

    // $ANTLR start "NOT_EQ"
    public final void mNOT_EQ() throws RecognitionException {
        try {
            int _type = NOT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:976:2: ( '<>' | '!=' | '~=' | '^=' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case '<':
                {
                alt5=1;
                }
                break;
            case '!':
                {
                alt5=2;
                }
                break;
            case '~':
                {
                alt5=3;
                }
                break;
            case '^':
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:976:4: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:976:11: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // src/org/plsql/PLSQL2.g:976:18: '~='
                    {
                    match("~="); 


                    }
                    break;
                case 4 :
                    // src/org/plsql/PLSQL2.g:976:24: '^='
                    {
                    match("^="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQ"

    // $ANTLR start "LTH"
    public final void mLTH() throws RecognitionException {
        try {
            int _type = LTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:979:2: ( '<' )
            // src/org/plsql/PLSQL2.g:979:4: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTH"

    // $ANTLR start "LEQ"
    public final void mLEQ() throws RecognitionException {
        try {
            int _type = LEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:982:2: ( '<=' )
            // src/org/plsql/PLSQL2.g:982:4: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEQ"

    // $ANTLR start "GTH"
    public final void mGTH() throws RecognitionException {
        try {
            int _type = GTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:985:2: ( '>' )
            // src/org/plsql/PLSQL2.g:985:4: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTH"

    // $ANTLR start "GEQ"
    public final void mGEQ() throws RecognitionException {
        try {
            int _type = GEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:988:2: ( '>=' )
            // src/org/plsql/PLSQL2.g:988:4: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GEQ"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:991:5: ( N )
            // src/org/plsql/PLSQL2.g:991:9: N
            {
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "REAL_NUMBER"
    public final void mREAL_NUMBER() throws RecognitionException {
        try {
            int _type = REAL_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:994:2: ( NUMBER_VALUE ( 'e' ( PLUS | MINUS )? N )? )
            // src/org/plsql/PLSQL2.g:994:4: NUMBER_VALUE ( 'e' ( PLUS | MINUS )? N )?
            {
            mNUMBER_VALUE(); 
            // src/org/plsql/PLSQL2.g:994:17: ( 'e' ( PLUS | MINUS )? N )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='e') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:994:19: 'e' ( PLUS | MINUS )? N
                    {
                    match('e'); 
                    // src/org/plsql/PLSQL2.g:994:23: ( PLUS | MINUS )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mN(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REAL_NUMBER"

    // $ANTLR start "NUMBER_VALUE"
    public final void mNUMBER_VALUE() throws RecognitionException {
        try {
            // src/org/plsql/PLSQL2.g:998:2: ({...}? => N POINT ( N )? | POINT N | N )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:998:4: {...}? => N POINT ( N )?
                    {
                    if ( !((numberDotValid())) ) {
                        throw new FailedPredicateException(input, "NUMBER_VALUE", "numberDotValid()");
                    }
                    mN(); 
                    mPOINT(); 
                    // src/org/plsql/PLSQL2.g:998:34: ( N )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:998:34: N
                            {
                            mN(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:999:4: POINT N
                    {
                    mPOINT(); 
                    mN(); 

                    }
                    break;
                case 3 :
                    // src/org/plsql/PLSQL2.g:1000:4: N
                    {
                    mN(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER_VALUE"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // src/org/plsql/PLSQL2.g:1004:2: ( '0' .. '9' ( '0' .. '9' )* )
            // src/org/plsql/PLSQL2.g:1004:4: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // src/org/plsql/PLSQL2.g:1004:15: ( '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:1004:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "DOUBLEQUOTED_STRING"
    public final void mDOUBLEQUOTED_STRING() throws RecognitionException {
        try {
            // src/org/plsql/PLSQL2.g:1008:2: ( '\"' (~ ( '\"' ) )* '\"' )
            // src/org/plsql/PLSQL2.g:1008:4: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // src/org/plsql/PLSQL2.g:1008:8: (~ ( '\"' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:1008:10: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DOUBLEQUOTED_STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:1010:4: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // src/org/plsql/PLSQL2.g:1010:6: ( ' ' | '\\r' | '\\t' | '\\n' )
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

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:1013:2: ( '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // src/org/plsql/PLSQL2.g:1013:4: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("--"); 

            // src/org/plsql/PLSQL2.g:1013:9: (~ ( '\\n' | '\\r' ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:1013:9: ~ ( '\\n' | '\\r' )
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
            	    break loop12;
                }
            } while (true);

            // src/org/plsql/PLSQL2.g:1013:23: ( '\\r' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:1013:23: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/org/plsql/PLSQL2.g:1016:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // src/org/plsql/PLSQL2.g:1016:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // src/org/plsql/PLSQL2.g:1016:9: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:1016:37: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    public void mTokens() throws RecognitionException {
        // src/org/plsql/PLSQL2.g:1:8: ( AND | ARRAY | AS | AUTHID | BETWEEN | BODY | BULK | BULK_ROWCOUNT | BY | CASE | CREATE | COLLECT | COMMIT | CURRENT_USER | DEFAULT | DEFINER | DELETE | ELSE | ELSIF | EXTERNAL | FALSE | FETCH | FOR | FORALL | GOTO | IF | IN | INDEX | INSERT | INTO | IS | LANGUAGE | LIKE | LIMIT | LOCK | NOT | NOTFOUND | NULL | OPEN | OR | PACKAGE | RAISE | ROLLBACK | SAVEPOINT | SELECT | SET | SQL | TABLE | TRANSACTION | TRUE | THEN | UPDATE | WHILE | INSERTING | UPDATING | DELETING | ISOPEN | EXISTS | BEGIN | CLOSE | CONSTANT | CONTINUE | CURSOR | DECLARE | DETERMINISTIC | END | EXCEPTION | EXECUTE | EXIT | FUNCTION | IMMEDIATE | LOOP | NOCOPY | OBJECT | OTHERS | OUT | PARALLEL_ENABLE | PIPELINED | PRAGMA | PROCEDURE | RECORD | REF | RESULT_CACHE | RETURN | RETURNING | ROWTYPE | SUBTYPE | USING | VARRAY | VARYING | WHEN | QUOTED_STRING | ID | SEMI | COLON | DOUBLEDOT | DOT | COMMA | EXPONENT | ASTERISK | AT_SIGN | RPAREN | LPAREN | RBRACK | LBRACK | PLUS | MINUS | DIVIDE | EQ | PERCENT | LLABEL | RLABEL | ASSIGN | ARROW | VERTBAR | DOUBLEVERTBAR | NOT_EQ | LTH | LEQ | GTH | GEQ | INTEGER | REAL_NUMBER | WS | SL_COMMENT | ML_COMMENT )
        int alt15=126;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // src/org/plsql/PLSQL2.g:1:10: AND
                {
                mAND(); 

                }
                break;
            case 2 :
                // src/org/plsql/PLSQL2.g:1:14: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 3 :
                // src/org/plsql/PLSQL2.g:1:20: AS
                {
                mAS(); 

                }
                break;
            case 4 :
                // src/org/plsql/PLSQL2.g:1:23: AUTHID
                {
                mAUTHID(); 

                }
                break;
            case 5 :
                // src/org/plsql/PLSQL2.g:1:30: BETWEEN
                {
                mBETWEEN(); 

                }
                break;
            case 6 :
                // src/org/plsql/PLSQL2.g:1:38: BODY
                {
                mBODY(); 

                }
                break;
            case 7 :
                // src/org/plsql/PLSQL2.g:1:43: BULK
                {
                mBULK(); 

                }
                break;
            case 8 :
                // src/org/plsql/PLSQL2.g:1:48: BULK_ROWCOUNT
                {
                mBULK_ROWCOUNT(); 

                }
                break;
            case 9 :
                // src/org/plsql/PLSQL2.g:1:62: BY
                {
                mBY(); 

                }
                break;
            case 10 :
                // src/org/plsql/PLSQL2.g:1:65: CASE
                {
                mCASE(); 

                }
                break;
            case 11 :
                // src/org/plsql/PLSQL2.g:1:70: CREATE
                {
                mCREATE(); 

                }
                break;
            case 12 :
                // src/org/plsql/PLSQL2.g:1:77: COLLECT
                {
                mCOLLECT(); 

                }
                break;
            case 13 :
                // src/org/plsql/PLSQL2.g:1:85: COMMIT
                {
                mCOMMIT(); 

                }
                break;
            case 14 :
                // src/org/plsql/PLSQL2.g:1:92: CURRENT_USER
                {
                mCURRENT_USER(); 

                }
                break;
            case 15 :
                // src/org/plsql/PLSQL2.g:1:105: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 16 :
                // src/org/plsql/PLSQL2.g:1:113: DEFINER
                {
                mDEFINER(); 

                }
                break;
            case 17 :
                // src/org/plsql/PLSQL2.g:1:121: DELETE
                {
                mDELETE(); 

                }
                break;
            case 18 :
                // src/org/plsql/PLSQL2.g:1:128: ELSE
                {
                mELSE(); 

                }
                break;
            case 19 :
                // src/org/plsql/PLSQL2.g:1:133: ELSIF
                {
                mELSIF(); 

                }
                break;
            case 20 :
                // src/org/plsql/PLSQL2.g:1:139: EXTERNAL
                {
                mEXTERNAL(); 

                }
                break;
            case 21 :
                // src/org/plsql/PLSQL2.g:1:148: FALSE
                {
                mFALSE(); 

                }
                break;
            case 22 :
                // src/org/plsql/PLSQL2.g:1:154: FETCH
                {
                mFETCH(); 

                }
                break;
            case 23 :
                // src/org/plsql/PLSQL2.g:1:160: FOR
                {
                mFOR(); 

                }
                break;
            case 24 :
                // src/org/plsql/PLSQL2.g:1:164: FORALL
                {
                mFORALL(); 

                }
                break;
            case 25 :
                // src/org/plsql/PLSQL2.g:1:171: GOTO
                {
                mGOTO(); 

                }
                break;
            case 26 :
                // src/org/plsql/PLSQL2.g:1:176: IF
                {
                mIF(); 

                }
                break;
            case 27 :
                // src/org/plsql/PLSQL2.g:1:179: IN
                {
                mIN(); 

                }
                break;
            case 28 :
                // src/org/plsql/PLSQL2.g:1:182: INDEX
                {
                mINDEX(); 

                }
                break;
            case 29 :
                // src/org/plsql/PLSQL2.g:1:188: INSERT
                {
                mINSERT(); 

                }
                break;
            case 30 :
                // src/org/plsql/PLSQL2.g:1:195: INTO
                {
                mINTO(); 

                }
                break;
            case 31 :
                // src/org/plsql/PLSQL2.g:1:200: IS
                {
                mIS(); 

                }
                break;
            case 32 :
                // src/org/plsql/PLSQL2.g:1:203: LANGUAGE
                {
                mLANGUAGE(); 

                }
                break;
            case 33 :
                // src/org/plsql/PLSQL2.g:1:212: LIKE
                {
                mLIKE(); 

                }
                break;
            case 34 :
                // src/org/plsql/PLSQL2.g:1:217: LIMIT
                {
                mLIMIT(); 

                }
                break;
            case 35 :
                // src/org/plsql/PLSQL2.g:1:223: LOCK
                {
                mLOCK(); 

                }
                break;
            case 36 :
                // src/org/plsql/PLSQL2.g:1:228: NOT
                {
                mNOT(); 

                }
                break;
            case 37 :
                // src/org/plsql/PLSQL2.g:1:232: NOTFOUND
                {
                mNOTFOUND(); 

                }
                break;
            case 38 :
                // src/org/plsql/PLSQL2.g:1:241: NULL
                {
                mNULL(); 

                }
                break;
            case 39 :
                // src/org/plsql/PLSQL2.g:1:246: OPEN
                {
                mOPEN(); 

                }
                break;
            case 40 :
                // src/org/plsql/PLSQL2.g:1:251: OR
                {
                mOR(); 

                }
                break;
            case 41 :
                // src/org/plsql/PLSQL2.g:1:254: PACKAGE
                {
                mPACKAGE(); 

                }
                break;
            case 42 :
                // src/org/plsql/PLSQL2.g:1:262: RAISE
                {
                mRAISE(); 

                }
                break;
            case 43 :
                // src/org/plsql/PLSQL2.g:1:268: ROLLBACK
                {
                mROLLBACK(); 

                }
                break;
            case 44 :
                // src/org/plsql/PLSQL2.g:1:277: SAVEPOINT
                {
                mSAVEPOINT(); 

                }
                break;
            case 45 :
                // src/org/plsql/PLSQL2.g:1:287: SELECT
                {
                mSELECT(); 

                }
                break;
            case 46 :
                // src/org/plsql/PLSQL2.g:1:294: SET
                {
                mSET(); 

                }
                break;
            case 47 :
                // src/org/plsql/PLSQL2.g:1:298: SQL
                {
                mSQL(); 

                }
                break;
            case 48 :
                // src/org/plsql/PLSQL2.g:1:302: TABLE
                {
                mTABLE(); 

                }
                break;
            case 49 :
                // src/org/plsql/PLSQL2.g:1:308: TRANSACTION
                {
                mTRANSACTION(); 

                }
                break;
            case 50 :
                // src/org/plsql/PLSQL2.g:1:320: TRUE
                {
                mTRUE(); 

                }
                break;
            case 51 :
                // src/org/plsql/PLSQL2.g:1:325: THEN
                {
                mTHEN(); 

                }
                break;
            case 52 :
                // src/org/plsql/PLSQL2.g:1:330: UPDATE
                {
                mUPDATE(); 

                }
                break;
            case 53 :
                // src/org/plsql/PLSQL2.g:1:337: WHILE
                {
                mWHILE(); 

                }
                break;
            case 54 :
                // src/org/plsql/PLSQL2.g:1:343: INSERTING
                {
                mINSERTING(); 

                }
                break;
            case 55 :
                // src/org/plsql/PLSQL2.g:1:353: UPDATING
                {
                mUPDATING(); 

                }
                break;
            case 56 :
                // src/org/plsql/PLSQL2.g:1:362: DELETING
                {
                mDELETING(); 

                }
                break;
            case 57 :
                // src/org/plsql/PLSQL2.g:1:371: ISOPEN
                {
                mISOPEN(); 

                }
                break;
            case 58 :
                // src/org/plsql/PLSQL2.g:1:378: EXISTS
                {
                mEXISTS(); 

                }
                break;
            case 59 :
                // src/org/plsql/PLSQL2.g:1:385: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 60 :
                // src/org/plsql/PLSQL2.g:1:391: CLOSE
                {
                mCLOSE(); 

                }
                break;
            case 61 :
                // src/org/plsql/PLSQL2.g:1:397: CONSTANT
                {
                mCONSTANT(); 

                }
                break;
            case 62 :
                // src/org/plsql/PLSQL2.g:1:406: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 63 :
                // src/org/plsql/PLSQL2.g:1:415: CURSOR
                {
                mCURSOR(); 

                }
                break;
            case 64 :
                // src/org/plsql/PLSQL2.g:1:422: DECLARE
                {
                mDECLARE(); 

                }
                break;
            case 65 :
                // src/org/plsql/PLSQL2.g:1:430: DETERMINISTIC
                {
                mDETERMINISTIC(); 

                }
                break;
            case 66 :
                // src/org/plsql/PLSQL2.g:1:444: END
                {
                mEND(); 

                }
                break;
            case 67 :
                // src/org/plsql/PLSQL2.g:1:448: EXCEPTION
                {
                mEXCEPTION(); 

                }
                break;
            case 68 :
                // src/org/plsql/PLSQL2.g:1:458: EXECUTE
                {
                mEXECUTE(); 

                }
                break;
            case 69 :
                // src/org/plsql/PLSQL2.g:1:466: EXIT
                {
                mEXIT(); 

                }
                break;
            case 70 :
                // src/org/plsql/PLSQL2.g:1:471: FUNCTION
                {
                mFUNCTION(); 

                }
                break;
            case 71 :
                // src/org/plsql/PLSQL2.g:1:480: IMMEDIATE
                {
                mIMMEDIATE(); 

                }
                break;
            case 72 :
                // src/org/plsql/PLSQL2.g:1:490: LOOP
                {
                mLOOP(); 

                }
                break;
            case 73 :
                // src/org/plsql/PLSQL2.g:1:495: NOCOPY
                {
                mNOCOPY(); 

                }
                break;
            case 74 :
                // src/org/plsql/PLSQL2.g:1:502: OBJECT
                {
                mOBJECT(); 

                }
                break;
            case 75 :
                // src/org/plsql/PLSQL2.g:1:509: OTHERS
                {
                mOTHERS(); 

                }
                break;
            case 76 :
                // src/org/plsql/PLSQL2.g:1:516: OUT
                {
                mOUT(); 

                }
                break;
            case 77 :
                // src/org/plsql/PLSQL2.g:1:520: PARALLEL_ENABLE
                {
                mPARALLEL_ENABLE(); 

                }
                break;
            case 78 :
                // src/org/plsql/PLSQL2.g:1:536: PIPELINED
                {
                mPIPELINED(); 

                }
                break;
            case 79 :
                // src/org/plsql/PLSQL2.g:1:546: PRAGMA
                {
                mPRAGMA(); 

                }
                break;
            case 80 :
                // src/org/plsql/PLSQL2.g:1:553: PROCEDURE
                {
                mPROCEDURE(); 

                }
                break;
            case 81 :
                // src/org/plsql/PLSQL2.g:1:563: RECORD
                {
                mRECORD(); 

                }
                break;
            case 82 :
                // src/org/plsql/PLSQL2.g:1:570: REF
                {
                mREF(); 

                }
                break;
            case 83 :
                // src/org/plsql/PLSQL2.g:1:574: RESULT_CACHE
                {
                mRESULT_CACHE(); 

                }
                break;
            case 84 :
                // src/org/plsql/PLSQL2.g:1:587: RETURN
                {
                mRETURN(); 

                }
                break;
            case 85 :
                // src/org/plsql/PLSQL2.g:1:594: RETURNING
                {
                mRETURNING(); 

                }
                break;
            case 86 :
                // src/org/plsql/PLSQL2.g:1:604: ROWTYPE
                {
                mROWTYPE(); 

                }
                break;
            case 87 :
                // src/org/plsql/PLSQL2.g:1:612: SUBTYPE
                {
                mSUBTYPE(); 

                }
                break;
            case 88 :
                // src/org/plsql/PLSQL2.g:1:620: USING
                {
                mUSING(); 

                }
                break;
            case 89 :
                // src/org/plsql/PLSQL2.g:1:626: VARRAY
                {
                mVARRAY(); 

                }
                break;
            case 90 :
                // src/org/plsql/PLSQL2.g:1:633: VARYING
                {
                mVARYING(); 

                }
                break;
            case 91 :
                // src/org/plsql/PLSQL2.g:1:641: WHEN
                {
                mWHEN(); 

                }
                break;
            case 92 :
                // src/org/plsql/PLSQL2.g:1:646: QUOTED_STRING
                {
                mQUOTED_STRING(); 

                }
                break;
            case 93 :
                // src/org/plsql/PLSQL2.g:1:660: ID
                {
                mID(); 

                }
                break;
            case 94 :
                // src/org/plsql/PLSQL2.g:1:663: SEMI
                {
                mSEMI(); 

                }
                break;
            case 95 :
                // src/org/plsql/PLSQL2.g:1:668: COLON
                {
                mCOLON(); 

                }
                break;
            case 96 :
                // src/org/plsql/PLSQL2.g:1:674: DOUBLEDOT
                {
                mDOUBLEDOT(); 

                }
                break;
            case 97 :
                // src/org/plsql/PLSQL2.g:1:684: DOT
                {
                mDOT(); 

                }
                break;
            case 98 :
                // src/org/plsql/PLSQL2.g:1:688: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 99 :
                // src/org/plsql/PLSQL2.g:1:694: EXPONENT
                {
                mEXPONENT(); 

                }
                break;
            case 100 :
                // src/org/plsql/PLSQL2.g:1:703: ASTERISK
                {
                mASTERISK(); 

                }
                break;
            case 101 :
                // src/org/plsql/PLSQL2.g:1:712: AT_SIGN
                {
                mAT_SIGN(); 

                }
                break;
            case 102 :
                // src/org/plsql/PLSQL2.g:1:720: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 103 :
                // src/org/plsql/PLSQL2.g:1:727: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 104 :
                // src/org/plsql/PLSQL2.g:1:734: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 105 :
                // src/org/plsql/PLSQL2.g:1:741: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 106 :
                // src/org/plsql/PLSQL2.g:1:748: PLUS
                {
                mPLUS(); 

                }
                break;
            case 107 :
                // src/org/plsql/PLSQL2.g:1:753: MINUS
                {
                mMINUS(); 

                }
                break;
            case 108 :
                // src/org/plsql/PLSQL2.g:1:759: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 109 :
                // src/org/plsql/PLSQL2.g:1:766: EQ
                {
                mEQ(); 

                }
                break;
            case 110 :
                // src/org/plsql/PLSQL2.g:1:769: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 111 :
                // src/org/plsql/PLSQL2.g:1:777: LLABEL
                {
                mLLABEL(); 

                }
                break;
            case 112 :
                // src/org/plsql/PLSQL2.g:1:784: RLABEL
                {
                mRLABEL(); 

                }
                break;
            case 113 :
                // src/org/plsql/PLSQL2.g:1:791: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 114 :
                // src/org/plsql/PLSQL2.g:1:798: ARROW
                {
                mARROW(); 

                }
                break;
            case 115 :
                // src/org/plsql/PLSQL2.g:1:804: VERTBAR
                {
                mVERTBAR(); 

                }
                break;
            case 116 :
                // src/org/plsql/PLSQL2.g:1:812: DOUBLEVERTBAR
                {
                mDOUBLEVERTBAR(); 

                }
                break;
            case 117 :
                // src/org/plsql/PLSQL2.g:1:826: NOT_EQ
                {
                mNOT_EQ(); 

                }
                break;
            case 118 :
                // src/org/plsql/PLSQL2.g:1:833: LTH
                {
                mLTH(); 

                }
                break;
            case 119 :
                // src/org/plsql/PLSQL2.g:1:837: LEQ
                {
                mLEQ(); 

                }
                break;
            case 120 :
                // src/org/plsql/PLSQL2.g:1:841: GTH
                {
                mGTH(); 

                }
                break;
            case 121 :
                // src/org/plsql/PLSQL2.g:1:845: GEQ
                {
                mGEQ(); 

                }
                break;
            case 122 :
                // src/org/plsql/PLSQL2.g:1:849: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 123 :
                // src/org/plsql/PLSQL2.g:1:857: REAL_NUMBER
                {
                mREAL_NUMBER(); 

                }
                break;
            case 124 :
                // src/org/plsql/PLSQL2.g:1:869: WS
                {
                mWS(); 

                }
                break;
            case 125 :
                // src/org/plsql/PLSQL2.g:1:872: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 126 :
                // src/org/plsql/PLSQL2.g:1:883: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA9_eotS =
        "\1\uffff\1\4\1\uffff\1\4\2\uffff";
    static final String DFA9_eofS =
        "\6\uffff";
    static final String DFA9_minS =
        "\2\56\1\uffff\1\56\2\uffff";
    static final String DFA9_maxS =
        "\2\71\1\uffff\1\71\2\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\uffff\1\3\1\1";
    static final String DFA9_specialS =
        "\1\uffff\1\0\1\uffff\1\1\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\5\1\uffff\12\3",
            "",
            "\1\5\1\uffff\12\3",
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
            return "996:1: fragment NUMBER_VALUE : ({...}? => N POINT ( N )? | POINT N | N );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA9_1>='0' && LA9_1<='9')) ) {s = 3;}

                        else if ( (LA9_1=='.') && ((numberDotValid()))) {s = 5;}

                        else s = 4;

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_3=='.') && ((numberDotValid()))) {s = 5;}

                        else if ( ((LA9_3>='0' && LA9_3<='9')) ) {s = 3;}

                        else s = 4;

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\1\uffff\22\24\3\uffff\1\140\1\141\1\uffff\1\145\6\uffff\1\147"+
        "\1\151\1\153\1\uffff\1\156\1\161\1\163\1\uffff\1\165\1\uffff\2\24"+
        "\1\172\4\24\1\u0080\16\24\1\u0097\1\u009b\1\u009d\7\24\1\u00a8\24"+
        "\24\25\uffff\1\165\3\uffff\1\u00c6\1\24\1\uffff\5\24\1\uffff\20"+
        "\24\1\u00e2\2\24\1\u00e6\2\24\1\uffff\3\24\1\uffff\1\24\1\uffff"+
        "\6\24\1\u00f4\3\24\1\uffff\2\24\1\u00fa\11\24\1\u0104\4\24\1\u0109"+
        "\1\u010a\12\24\1\uffff\4\24\1\u011a\1\u011c\1\u011d\15\24\1\u012b"+
        "\3\24\1\u012f\2\24\1\uffff\3\24\1\uffff\1\24\1\u0136\2\24\1\u0139"+
        "\3\24\1\u013d\1\24\1\u013f\1\u0140\1\24\1\uffff\1\24\1\u0143\1\u0144"+
        "\2\24\1\uffff\11\24\1\uffff\4\24\2\uffff\3\24\1\u0157\1\u0158\3"+
        "\24\1\u015c\2\24\1\u015f\2\24\1\u0162\1\uffff\1\24\2\uffff\7\24"+
        "\1\u016b\5\24\1\uffff\1\u0172\2\24\1\uffff\2\24\1\u0177\1\u0178"+
        "\2\24\1\uffff\1\u017b\1\24\1\uffff\3\24\1\uffff\1\u0180\2\uffff"+
        "\2\24\2\uffff\7\24\1\u018a\10\24\1\u0193\1\24\2\uffff\1\24\1\u0197"+
        "\1\u0198\1\uffff\2\24\1\uffff\1\u019b\1\24\1\uffff\1\24\1\u019e"+
        "\1\24\1\u01a0\3\24\1\u01a4\1\uffff\2\24\1\u01a7\3\24\1\uffff\1\24"+
        "\1\u01ac\2\24\2\uffff\1\u01af\1\24\1\uffff\1\u01b2\1\u01b3\2\24"+
        "\1\uffff\1\24\1\u01b7\1\u01b8\1\u01b9\3\24\1\u01bd\1\24\1\uffff"+
        "\2\24\1\u01c1\1\24\1\u01c4\1\24\1\u01c6\1\24\1\uffff\1\24\1\u01c9"+
        "\1\24\2\uffff\1\u01cb\1\24\1\uffff\1\u01cd\1\24\1\uffff\1\u01cf"+
        "\1\uffff\3\24\1\uffff\1\u01d3\1\u01d4\1\uffff\1\24\1\u01d6\2\24"+
        "\1\uffff\1\24\1\u01da\1\uffff\2\24\2\uffff\3\24\3\uffff\1\u01e0"+
        "\2\24\1\uffff\2\24\1\u01e5\1\uffff\2\24\1\uffff\1\24\1\uffff\1\u01e9"+
        "\1\24\1\uffff\1\24\1\uffff\1\u01ec\1\uffff\1\24\1\uffff\1\u01ee"+
        "\1\u01ef\1\24\2\uffff\1\u01f1\1\uffff\1\24\1\u01f3\1\24\1\uffff"+
        "\1\u01f5\2\24\1\u01f8\1\u01f9\1\uffff\3\24\1\u01fd\1\uffff\3\24"+
        "\1\uffff\1\24\1\u0202\1\uffff\1\24\2\uffff\1\24\1\uffff\1\24\1\uffff"+
        "\1\u0206\1\uffff\1\u0207\1\u0208\2\uffff\1\24\1\u020a\1\u020b\1"+
        "\uffff\1\24\1\u020d\1\u020e\1\24\1\uffff\3\24\3\uffff\1\24\2\uffff"+
        "\1\24\2\uffff\6\24\1\u021b\1\24\1\u021d\2\24\1\u0220\1\uffff\1\u0221"+
        "\1\uffff\1\u0222\1\24\3\uffff\1\24\1\u0225\1\uffff";
    static final String DFA15_eofS =
        "\u0226\uffff";
    static final String DFA15_minS =
        "\1\11\1\156\1\145\1\141\1\145\1\154\1\141\1\157\1\146\1\141\1\47"+
        "\1\142\4\141\1\160\1\150\1\141\3\uffff\1\75\1\56\1\uffff\1\52\6"+
        "\uffff\1\55\1\52\1\76\1\uffff\1\74\1\75\1\174\1\uffff\1\56\1\uffff"+
        "\1\144\1\162\1\43\1\164\1\147\1\144\1\154\1\43\1\163\1\145\1\154"+
        "\1\162\1\157\1\143\1\163\1\143\1\144\1\154\1\164\1\162\1\156\1\164"+
        "\3\43\1\155\1\156\1\153\2\143\1\154\1\145\1\43\1\152\1\150\1\164"+
        "\1\143\1\160\1\141\1\151\1\154\1\143\1\166\2\154\2\142\1\141\1\145"+
        "\1\144\1\151\1\145\1\162\25\uffff\1\56\3\uffff\1\43\1\141\1\uffff"+
        "\1\150\1\167\1\151\1\171\1\153\1\uffff\1\145\1\141\1\154\1\155\1"+
        "\163\1\162\1\163\1\141\1\145\1\154\3\145\1\163\1\145\1\143\1\43"+
        "\1\163\1\143\1\43\1\143\1\157\1\uffff\2\145\1\157\1\uffff\1\160"+
        "\1\uffff\1\145\1\147\1\145\1\151\1\153\1\160\1\43\1\157\1\154\1"+
        "\156\1\uffff\2\145\1\43\1\153\1\141\1\145\1\147\1\143\1\163\1\154"+
        "\1\164\1\157\1\43\2\165\2\145\2\43\1\164\1\154\1\156\1\145\1\156"+
        "\1\141\1\156\1\154\1\156\1\162\1\uffff\1\171\1\151\1\145\1\156\3"+
        "\43\1\164\1\145\1\151\1\164\1\151\1\145\1\157\1\145\1\165\1\156"+
        "\1\164\1\141\1\162\1\43\1\146\1\162\1\164\1\43\1\160\1\165\1\uffff"+
        "\1\145\1\150\1\154\1\uffff\1\164\1\43\1\170\1\162\1\43\1\145\1\144"+
        "\1\165\1\43\1\164\2\43\1\157\1\uffff\1\160\2\43\1\143\1\162\1\uffff"+
        "\1\141\2\154\1\155\2\145\1\142\1\171\1\162\1\uffff\1\154\1\162\1"+
        "\160\1\143\2\uffff\1\171\1\145\1\163\2\43\1\164\1\147\1\145\1\43"+
        "\1\141\1\151\1\43\1\144\1\145\1\43\1\uffff\1\162\2\uffff\1\145\1"+
        "\143\1\164\1\141\2\156\1\162\1\43\1\154\2\145\1\162\1\155\1\uffff"+
        "\1\43\1\156\1\163\1\uffff\2\164\2\43\1\154\1\151\1\uffff\1\43\1"+
        "\164\1\uffff\1\156\1\151\1\141\1\uffff\1\43\2\uffff\1\165\1\171"+
        "\2\uffff\1\164\1\163\1\147\1\154\1\151\1\141\1\144\1\43\1\141\1"+
        "\160\1\144\1\164\1\156\1\157\1\164\1\160\1\43\1\141\2\uffff\1\145"+
        "\2\43\1\uffff\1\171\1\156\1\uffff\1\43\1\156\1\uffff\1\157\1\43"+
        "\1\164\1\43\1\156\1\165\1\164\1\43\1\uffff\1\164\1\162\1\43\1\156"+
        "\1\145\1\151\1\uffff\1\141\1\43\1\151\1\145\2\uffff\1\43\1\157\1"+
        "\uffff\2\43\1\141\1\147\1\uffff\1\156\3\43\2\145\1\156\1\43\1\165"+
        "\1\uffff\1\143\1\145\1\43\1\137\1\43\1\151\1\43\1\145\1\uffff\1"+
        "\143\1\43\1\156\2\uffff\1\43\1\147\1\uffff\1\43\1\167\1\uffff\1"+
        "\43\1\uffff\1\164\1\145\1\137\1\uffff\2\43\1\uffff\1\147\1\43\1"+
        "\156\1\154\1\uffff\1\157\1\43\1\uffff\2\156\2\uffff\1\164\1\145"+
        "\1\144\3\uffff\1\43\1\154\1\145\1\uffff\1\162\1\153\1\43\1\uffff"+
        "\1\143\1\156\1\uffff\1\156\1\uffff\1\43\1\164\1\uffff\1\147\1\uffff"+
        "\1\43\1\uffff\1\143\1\uffff\2\43\1\165\2\uffff\1\43\1\uffff\1\151"+
        "\1\43\1\156\1\uffff\1\43\1\147\1\145\2\43\1\uffff\1\137\1\144\1"+
        "\145\1\43\1\uffff\1\141\1\147\1\164\1\uffff\1\151\1\43\1\uffff\1"+
        "\157\2\uffff\1\163\1\uffff\1\163\1\uffff\1\43\1\uffff\2\43\2\uffff"+
        "\1\145\2\43\1\uffff\1\143\2\43\1\157\1\uffff\1\165\1\145\1\164\3"+
        "\uffff\1\156\2\uffff\1\150\2\uffff\2\156\1\162\1\151\1\141\1\145"+
        "\1\43\1\164\1\43\1\143\1\142\1\43\1\uffff\1\43\1\uffff\1\43\1\154"+
        "\3\uffff\1\145\1\43\1\uffff";
    static final String DFA15_maxS =
        "\1\176\1\165\1\171\1\165\1\145\1\170\1\165\1\157\1\163\1\157\2"+
        "\165\1\162\1\157\1\165\1\162\1\163\1\150\1\141\3\uffff\1\75\1\71"+
        "\1\uffff\1\52\6\uffff\1\55\1\52\1\76\1\uffff\2\76\1\174\1\uffff"+
        "\1\145\1\uffff\1\144\1\162\1\172\2\164\1\144\1\154\1\172\1\163\1"+
        "\145\1\156\1\162\1\157\1\164\1\163\1\164\1\144\1\154\1\164\1\162"+
        "\1\156\1\164\3\172\1\155\1\156\1\155\1\157\1\164\1\154\1\145\1\172"+
        "\1\152\1\150\1\164\1\162\1\160\1\157\1\151\1\167\1\164\1\166\1\164"+
        "\1\154\2\142\1\165\1\145\1\144\2\151\1\162\25\uffff\1\145\3\uffff"+
        "\1\172\1\141\1\uffff\1\150\1\167\1\151\1\171\1\153\1\uffff\1\145"+
        "\1\141\1\154\1\155\1\164\2\163\1\151\1\145\1\154\1\145\1\151\1\145"+
        "\1\164\1\145\1\143\1\172\1\163\1\143\1\172\1\143\1\157\1\uffff\2"+
        "\145\1\157\1\uffff\1\160\1\uffff\1\145\1\147\1\145\1\151\1\153\1"+
        "\160\1\172\1\157\1\154\1\156\1\uffff\2\145\1\172\1\153\1\141\1\145"+
        "\1\147\1\143\1\163\1\154\1\164\1\157\1\172\2\165\2\145\2\172\1\164"+
        "\1\154\1\156\1\145\1\156\1\141\1\156\1\154\1\156\1\171\1\uffff\1"+
        "\171\1\151\1\145\1\156\3\172\1\164\1\145\1\151\1\164\1\151\1\145"+
        "\1\157\1\145\1\165\1\156\1\164\1\141\1\162\1\172\1\146\1\162\1\164"+
        "\1\172\1\160\1\165\1\uffff\1\145\1\150\1\154\1\uffff\1\164\1\172"+
        "\1\170\1\162\1\172\1\145\1\144\1\165\1\172\1\164\2\172\1\157\1\uffff"+
        "\1\160\2\172\1\143\1\162\1\uffff\1\141\2\154\1\155\2\145\1\142\1"+
        "\171\1\162\1\uffff\1\154\1\162\1\160\1\143\2\uffff\1\171\1\145\1"+
        "\163\2\172\1\164\1\147\1\145\1\172\1\141\1\151\1\172\1\144\1\145"+
        "\1\172\1\uffff\1\162\2\uffff\1\145\1\143\1\164\1\141\2\156\1\162"+
        "\1\172\1\154\1\145\1\151\1\162\1\155\1\uffff\1\172\1\156\1\163\1"+
        "\uffff\2\164\2\172\1\154\1\151\1\uffff\1\172\1\164\1\uffff\1\156"+
        "\1\151\1\141\1\uffff\1\172\2\uffff\1\165\1\171\2\uffff\1\164\1\163"+
        "\1\147\1\154\1\151\1\141\1\144\1\172\1\141\1\160\1\144\1\164\1\156"+
        "\1\157\1\164\1\160\1\172\1\141\2\uffff\1\151\2\172\1\uffff\1\171"+
        "\1\156\1\uffff\1\172\1\156\1\uffff\1\157\1\172\1\164\1\172\1\156"+
        "\1\165\1\164\1\172\1\uffff\1\164\1\162\1\172\1\156\1\145\1\151\1"+
        "\uffff\1\141\1\172\1\151\1\145\2\uffff\1\172\1\157\1\uffff\2\172"+
        "\1\141\1\147\1\uffff\1\156\3\172\2\145\1\156\1\172\1\165\1\uffff"+
        "\1\143\1\145\1\172\1\137\1\172\1\151\1\172\1\145\1\uffff\1\143\1"+
        "\172\1\156\2\uffff\1\172\1\147\1\uffff\1\172\1\167\1\uffff\1\172"+
        "\1\uffff\1\164\1\145\1\137\1\uffff\2\172\1\uffff\1\147\1\172\1\156"+
        "\1\154\1\uffff\1\157\1\172\1\uffff\2\156\2\uffff\1\164\1\145\1\144"+
        "\3\uffff\1\172\1\154\1\145\1\uffff\1\162\1\153\1\172\1\uffff\1\143"+
        "\1\156\1\uffff\1\156\1\uffff\1\172\1\164\1\uffff\1\147\1\uffff\1"+
        "\172\1\uffff\1\143\1\uffff\2\172\1\165\2\uffff\1\172\1\uffff\1\151"+
        "\1\172\1\156\1\uffff\1\172\1\147\1\145\2\172\1\uffff\1\137\1\144"+
        "\1\145\1\172\1\uffff\1\141\1\147\1\164\1\uffff\1\151\1\172\1\uffff"+
        "\1\157\2\uffff\1\163\1\uffff\1\163\1\uffff\1\172\1\uffff\2\172\2"+
        "\uffff\1\145\2\172\1\uffff\1\143\2\172\1\157\1\uffff\1\165\1\145"+
        "\1\164\3\uffff\1\156\2\uffff\1\150\2\uffff\2\156\1\162\1\151\1\141"+
        "\1\145\1\172\1\164\1\172\1\143\1\142\1\172\1\uffff\1\172\1\uffff"+
        "\1\172\1\154\3\uffff\1\145\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\23\uffff\1\134\1\135\1\136\2\uffff\1\142\1\uffff\1\145\1\146\1"+
        "\147\1\150\1\151\1\152\3\uffff\1\156\3\uffff\1\165\1\uffff\1\174"+
        "\65\uffff\1\161\1\137\1\141\1\140\1\173\1\143\1\144\1\175\1\153"+
        "\1\176\1\154\1\162\1\155\1\157\1\167\1\166\1\160\1\171\1\170\1\164"+
        "\1\163\1\uffff\1\172\2\173\2\uffff\1\3\5\uffff\1\11\26\uffff\1\32"+
        "\3\uffff\1\33\1\uffff\1\37\12\uffff\1\50\35\uffff\1\1\33\uffff\1"+
        "\102\3\uffff\1\27\15\uffff\1\44\5\uffff\1\114\11\uffff\1\122\4\uffff"+
        "\1\56\1\57\17\uffff\1\6\1\uffff\1\7\1\12\15\uffff\1\22\3\uffff\1"+
        "\105\6\uffff\1\31\2\uffff\1\36\3\uffff\1\41\1\uffff\1\43\1\110\2"+
        "\uffff\1\46\1\47\22\uffff\1\62\1\63\3\uffff\1\133\2\uffff\1\2\2"+
        "\uffff\1\73\10\uffff\1\74\6\uffff\1\23\4\uffff\1\25\1\26\2\uffff"+
        "\1\34\4\uffff\1\42\11\uffff\1\52\10\uffff\1\60\3\uffff\1\130\1\65"+
        "\2\uffff\1\4\2\uffff\1\13\1\uffff\1\15\3\uffff\1\77\2\uffff\1\21"+
        "\4\uffff\1\72\2\uffff\1\30\2\uffff\1\35\1\71\3\uffff\1\111\1\112"+
        "\1\113\3\uffff\1\117\3\uffff\1\121\2\uffff\1\124\1\uffff\1\55\2"+
        "\uffff\1\64\1\uffff\1\131\1\uffff\1\5\1\uffff\1\14\3\uffff\1\17"+
        "\1\20\1\uffff\1\100\3\uffff\1\104\5\uffff\1\51\4\uffff\1\126\3\uffff"+
        "\1\127\2\uffff\1\132\1\uffff\1\75\1\76\1\uffff\1\70\1\uffff\1\24"+
        "\1\uffff\1\106\2\uffff\1\40\1\45\3\uffff\1\53\4\uffff\1\67\3\uffff"+
        "\1\103\1\66\1\107\1\uffff\1\116\1\120\1\uffff\1\125\1\54\14\uffff"+
        "\1\61\1\uffff\1\16\2\uffff\1\123\1\10\1\101\2\uffff\1\115";
    static final String DFA15_specialS =
        "\50\uffff\1\1\113\uffff\1\0\u01b1\uffff}>";
    static final String[] DFA15_transitionS = {
            "\2\51\2\uffff\1\51\22\uffff\1\51\1\47\1\24\2\uffff\1\43\1\uffff"+
            "\1\23\1\34\1\33\1\31\1\37\1\30\1\40\1\27\1\41\12\50\1\26\1\25"+
            "\1\44\1\42\1\45\1\uffff\1\32\32\uffff\1\36\1\uffff\1\35\1\47"+
            "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\24\1\10\2\24\1\11\1\24"+
            "\1\12\1\13\1\14\1\24\1\15\1\16\1\17\1\20\1\22\1\21\3\24\1\uffff"+
            "\1\46\1\uffff\1\47",
            "\1\52\3\uffff\1\53\1\54\1\uffff\1\55",
            "\1\56\11\uffff\1\57\5\uffff\1\60\3\uffff\1\61",
            "\1\62\12\uffff\1\66\2\uffff\1\64\2\uffff\1\63\2\uffff\1\65",
            "\1\67",
            "\1\70\1\uffff\1\72\11\uffff\1\71",
            "\1\73\3\uffff\1\74\11\uffff\1\75\5\uffff\1\76",
            "\1\77",
            "\1\100\6\uffff\1\103\1\101\4\uffff\1\102",
            "\1\104\7\uffff\1\105\5\uffff\1\106",
            "\1\23\107\uffff\1\107\5\uffff\1\110",
            "\1\113\15\uffff\1\111\1\uffff\1\112\1\uffff\1\114\1\115",
            "\1\116\7\uffff\1\117\10\uffff\1\120",
            "\1\121\3\uffff\1\123\11\uffff\1\122",
            "\1\124\3\uffff\1\125\13\uffff\1\126\3\uffff\1\127",
            "\1\130\6\uffff\1\132\11\uffff\1\131",
            "\1\133\2\uffff\1\134",
            "\1\135",
            "\1\136",
            "",
            "",
            "",
            "\1\137",
            "\1\142\1\uffff\12\143",
            "",
            "\1\144",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\146",
            "\1\150",
            "\1\152",
            "",
            "\1\154\1\155\1\47",
            "\1\160\1\157",
            "\1\162",
            "",
            "\1\166\1\uffff\12\164\53\uffff\1\167",
            "",
            "\1\170",
            "\1\171",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\173",
            "\1\175\14\uffff\1\174",
            "\1\176",
            "\1\177",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083\1\u0084\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u008a\2\uffff\1\u0088\5\uffff\1\u0089\7\uffff\1\u008b",
            "\1\u008c",
            "\1\u008f\1\uffff\1\u0090\3\uffff\1\u008e\12\uffff\1\u008d",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\3\24\1\u0098\16"+
            "\24\1\u0099\1\u009a\6\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\16\24\1\u009c\13"+
            "\24",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0\1\uffff\1\u00a1",
            "\1\u00a2\13\uffff\1\u00a3",
            "\1\u00a5\20\uffff\1\u00a4",
            "\1\u00a6",
            "\1\u00a7",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac\16\uffff\1\u00ad",
            "\1\u00ae",
            "\1\u00af\15\uffff\1\u00b0",
            "\1\u00b1",
            "\1\u00b2\12\uffff\1\u00b3",
            "\1\u00b4\2\uffff\1\u00b5\14\uffff\1\u00b6\1\u00b7",
            "\1\u00b8",
            "\1\u00b9\7\uffff\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be\23\uffff\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c4\3\uffff\1\u00c3",
            "\1\u00c5",
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
            "",
            "",
            "\1\166\1\uffff\12\164\53\uffff\1\167",
            "",
            "",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1\1\u00d2",
            "\1\u00d3\1\u00d4",
            "\1\u00d5",
            "\1\u00d6\7\uffff\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db\3\uffff\1\u00dc",
            "\1\u00dd",
            "\1\u00de\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u00e3",
            "\1\u00e4",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\1\u00e5\31\24",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\5\24\1\u00f3\24"+
            "\24",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114\6\uffff\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\2\24\13\uffff\12\24\45\uffff\1\u011b\1\uffff\32\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u0130",
            "\1\u0131",
            "",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "",
            "\1\u0135",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u0137",
            "\1\u0138",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u013e",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u0141",
            "",
            "\1\u0142",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u0145",
            "\1\u0146",
            "",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "",
            "",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u015d",
            "\1\u015e",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u0160",
            "\1\u0161",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "\1\u0163",
            "",
            "",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e\3\uffff\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u0173",
            "\1\u0174",
            "",
            "\1\u0175",
            "\1\u0176",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u0179",
            "\1\u017a",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u017c",
            "",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\1\u0181",
            "\1\u0182",
            "",
            "",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u0194",
            "",
            "",
            "\1\u0195\3\uffff\1\u0196",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "\1\u0199",
            "\1\u019a",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u019c",
            "",
            "\1\u019d",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u019f",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "\1\u01a5",
            "\1\u01a6",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "",
            "\1\u01ab",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01ad",
            "\1\u01ae",
            "",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01b0",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\10\24\1\u01b1\21"+
            "\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01b4",
            "\1\u01b5",
            "",
            "\1\u01b6",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01be",
            "",
            "\1\u01bf",
            "\1\u01c0",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01c2",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\10\24\1\u01c3\21"+
            "\24",
            "\1\u01c5",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01c7",
            "",
            "\1\u01c8",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01ca",
            "",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01cc",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01ce",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "\1\u01d5",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01d7",
            "\1\u01d8",
            "",
            "\1\u01d9",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "\1\u01db",
            "\1\u01dc",
            "",
            "",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "",
            "",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01e1",
            "\1\u01e2",
            "",
            "\1\u01e3",
            "\1\u01e4",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "\1\u01e6",
            "\1\u01e7",
            "",
            "\1\u01e8",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01ea",
            "",
            "\1\u01eb",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "\1\u01ed",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01f0",
            "",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "\1\u01f2",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01f4",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u01f6",
            "\1\u01f7",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "",
            "\1\u0201",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "\1\u0203",
            "",
            "",
            "\1\u0204",
            "",
            "\1\u0205",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\1\u0209",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "\1\u020c",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u020f",
            "",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "",
            "",
            "",
            "\1\u0213",
            "",
            "",
            "\1\u0214",
            "",
            "",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u021c",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u021e",
            "\1\u021f",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            "\1\u0223",
            "",
            "",
            "",
            "\1\u0224",
            "\2\24\13\uffff\12\24\45\uffff\1\24\1\uffff\32\24",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AND | ARRAY | AS | AUTHID | BETWEEN | BODY | BULK | BULK_ROWCOUNT | BY | CASE | CREATE | COLLECT | COMMIT | CURRENT_USER | DEFAULT | DEFINER | DELETE | ELSE | ELSIF | EXTERNAL | FALSE | FETCH | FOR | FORALL | GOTO | IF | IN | INDEX | INSERT | INTO | IS | LANGUAGE | LIKE | LIMIT | LOCK | NOT | NOTFOUND | NULL | OPEN | OR | PACKAGE | RAISE | ROLLBACK | SAVEPOINT | SELECT | SET | SQL | TABLE | TRANSACTION | TRUE | THEN | UPDATE | WHILE | INSERTING | UPDATING | DELETING | ISOPEN | EXISTS | BEGIN | CLOSE | CONSTANT | CONTINUE | CURSOR | DECLARE | DETERMINISTIC | END | EXCEPTION | EXECUTE | EXIT | FUNCTION | IMMEDIATE | LOOP | NOCOPY | OBJECT | OTHERS | OUT | PARALLEL_ENABLE | PIPELINED | PRAGMA | PROCEDURE | RECORD | REF | RESULT_CACHE | RETURN | RETURNING | ROWTYPE | SUBTYPE | USING | VARRAY | VARYING | WHEN | QUOTED_STRING | ID | SEMI | COLON | DOUBLEDOT | DOT | COMMA | EXPONENT | ASTERISK | AT_SIGN | RPAREN | LPAREN | RBRACK | LBRACK | PLUS | MINUS | DIVIDE | EQ | PERCENT | LLABEL | RLABEL | ASSIGN | ARROW | VERTBAR | DOUBLEVERTBAR | NOT_EQ | LTH | LEQ | GTH | GEQ | INTEGER | REAL_NUMBER | WS | SL_COMMENT | ML_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_116 = input.LA(1);

                         
                        int index15_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_116=='.') && ((numberDotValid()))) {s = 118;}

                        else if ( ((LA15_116>='0' && LA15_116<='9')) ) {s = 116;}

                        else if ( (LA15_116=='e') ) {s = 119;}

                        else s = 117;

                         
                        input.seek(index15_116);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_40 = input.LA(1);

                         
                        int index15_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_40>='0' && LA15_40<='9')) ) {s = 116;}

                        else if ( (LA15_40=='.') && ((numberDotValid()))) {s = 118;}

                        else if ( (LA15_40=='e') ) {s = 119;}

                        else s = 117;

                         
                        input.seek(index15_40);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}