// $ANTLR 3.2 Sep 23, 2009 12:02:23 src/org/plsql/PLSQL2.g 2011-02-11 20:49:40

package com.picc.generator.provider.db.procedure;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class PLSQL2Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIVIDE", "SEMI", "PROCEDURE", "ID", "FUNCTION", "RETURN", "LPAREN", "COMMA", "RPAREN", "ASSIGN", "DEFAULT", "IN", "OUT", "NOCOPY", "CURSOR", "IS", "NOT", "NULL", "CONSTANT", "EXCEPTION", "AS", "SUBTYPE", "RECORD", "OBJECT", "VARYING", "ARRAY", "VARRAY", "TABLE", "INDEX", "BY", "REF", "DOT", "PERCENT", "ROWTYPE", "DETERMINISTIC", "PIPELINED", "PARALLEL_ENABLE", "RESULT_CACHE", "BEGIN", "END", "WHEN", "OR", "OTHERS", "THEN", "COLON", "DELETE", "LOOP", "CASE", "ELSE", "CLOSE", "CONTINUE", "EXECUTE", "IMMEDIATE", "EXIT", "FETCH", "LIMIT", "INTO", "BULK", "COLLECT", "USING", "RETURNING", "FOR", "FORALL", "DOUBLEDOT", "BETWEEN", "AND", "GOTO", "IF", "ELSIF", "OPEN", "PRAGMA", "RAISE", "DECLARE", "LLABEL", "RLABEL", "COMMIT", "INSERT", "LOCK", "ROLLBACK", "SAVEPOINT", "SELECT", "SET", "TRANSACTION", "UPDATE", "WHILE", "EQ", "NOT_EQ", "LTH", "LEQ", "GTH", "GEQ", "LIKE", "MINUS", "PLUS", "DOUBLEVERTBAR", "ASTERISK", "EXPONENT", "SQL", "BULK_ROWCOUNT", "ISOPEN", "NOTFOUND", "INTEGER", "REAL_NUMBER", "TRUE", "FALSE", "QUOTED_STRING", "EXISTS", "INSERTING", "UPDATING", "DELETING", "ARROW", "CREATE", "PACKAGE", "BODY", "EXTERNAL", "AUTHID", "CURRENT_USER", "DEFINER", "LANGUAGE", "DOUBLEQUOTED_STRING", "POINT", "AT_SIGN", "RBRACK", "LBRACK", "VERTBAR", "N", "NUMBER_VALUE", "WS", "SL_COMMENT", "ML_COMMENT"
    };
    public static final int PACKAGE=116;
    public static final int FUNCTION=8;
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
    public static final int BEGIN=42;
    public static final int LOOP=50;
    public static final int SAVEPOINT=83;
    public static final int RETURN=9;
    public static final int BODY=117;
    public static final int RAISE=75;
    public static final int GEQ=94;
    public static final int GOTO=70;
    public static final int EQ=89;
    public static final int SELECT=84;
    public static final int ISOPEN=103;
    public static final int INTO=60;
    public static final int ARRAY=29;
    public static final int DIVIDE=4;
    public static final int EXCEPTION=23;
    public static final int RBRACK=126;
    public static final int EXIT=57;
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
    public static final int IN=15;
    public static final int THEN=47;
    public static final int OBJECT=27;
    public static final int CONTINUE=54;
    public static final int COMMA=11;
    public static final int IS=19;
    public static final int QUOTED_STRING=109;
    public static final int PLUS=97;
    public static final int EXISTS=110;
    public static final int DOT=35;
    public static final int LIKE=95;
    public static final int INTEGER=105;
    public static final int BY=33;
    public static final int VARRAY=30;
    public static final int PARALLEL_ENABLE=40;
    public static final int PERCENT=36;
    public static final int DOUBLEQUOTED_STRING=123;
    public static final int DEFAULT=14;
    public static final int FORALL=66;
    public static final int SET=85;
    public static final int MINUS=96;
    public static final int TRUE=107;
    public static final int SEMI=5;
    public static final int PROCEDURE=6;
    public static final int NOT_EQ=90;
    public static final int REF=34;
    public static final int VERTBAR=128;
    public static final int COLON=48;
    public static final int OPEN=73;
    public static final int LTH=91;
    public static final int BULK_ROWCOUNT=102;
    public static final int COMMIT=79;
    public static final int CLOSE=53;
    public static final int WHEN=44;
    public static final int ASSIGN=13;
    public static final int NUMBER_VALUE=130;
    public static final int IMMEDIATE=56;
    public static final int ARROW=114;
    public static final int DECLARE=76;
    public static final int DELETING=113;
    public static final int BULK=61;
    public static final int BETWEEN=68;
    public static final int LEQ=92;

    // delegates
    // delegators


        public PLSQL2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PLSQL2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return PLSQL2Parser.tokenNames; }
   // public String getGrammarFileName() { return "com/picc/plsql/PLSQL2.g"; }
    public String getGrammarFileName() { return "generator/src/com/picc/generator/provider/db/procedure/PLSQL2.g"; }


    	private List m_procedureList = new ArrayList();
    	public List getProcedureList(){
    		return m_procedureList;
    	}
    	private List m_functionList = new ArrayList();
    	public List getFunctionList(){
    		return m_functionList;
    	}
    	private List m_typeList = new ArrayList();
    	public List getTypeList(){
    		return m_typeList;
    	}
    public String getErrorHeader(RecognitionException e) {
        return getSourceName()+":"+e.line+":"+(e.charPositionInLine+1)+":";
    }

    public String getErrorMessage(RecognitionException e, String[] tokenNames) {
        List stack = getRuleInvocationStack(e, this.getClass().getName());
        String msg = null;
        if (e instanceof NoViableAltException) {
            NoViableAltException nvae = (NoViableAltException) e;
            msg = " no viable alt; token="+e.token+
                  " (decision="+nvae.decisionNumber+
                  " state "+nvae.stateNumber+")"+
                  " decision=<<"+nvae.grammarDecisionDescription+">>";
        }
        else {
            msg = super.getErrorMessage(e, tokenNames);
        }
        return stack+" "+msg;
    }
        
    public String getTokenErrorDisplay(Token t) {
        return t.toString();
    }



    public static class sqlplus_file_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqlplus_file"
    // src/org/plsql/PLSQL2.g:92:1: sqlplus_file : ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF ;
    public final PLSQL2Parser.sqlplus_file_return sqlplus_file() throws RecognitionException {
        PLSQL2Parser.sqlplus_file_return retval = new PLSQL2Parser.sqlplus_file_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DIVIDE2=null;
        Token DIVIDE4=null;
        Token EOF5=null;
        PLSQL2Parser.create_object_return create_object1 = null;

        PLSQL2Parser.show_errors_return show_errors3 = null;


        Object DIVIDE2_tree=null;
        Object DIVIDE4_tree=null;
        Object EOF5_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:93:5: ( ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF )
            // src/org/plsql/PLSQL2.g:93:7: ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+ EOF
            {
            root_0 = (Object)adaptor.nil();

            // src/org/plsql/PLSQL2.g:93:7: ( create_object ( DIVIDE show_errors )? ( DIVIDE )? )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==CREATE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:93:9: create_object ( DIVIDE show_errors )? ( DIVIDE )?
            	    {
            	    pushFollow(FOLLOW_create_object_in_sqlplus_file62);
            	    create_object1=create_object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, create_object1.getTree());
            	    // src/org/plsql/PLSQL2.g:93:23: ( DIVIDE show_errors )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==DIVIDE) ) {
            	        int LA1_1 = input.LA(2);

            	        if ( (LA1_1==ID) ) {
            	            alt1=1;
            	        }
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // src/org/plsql/PLSQL2.g:93:25: DIVIDE show_errors
            	            {
            	            DIVIDE2=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_sqlplus_file66); 
            	            DIVIDE2_tree = (Object)adaptor.create(DIVIDE2);
            	            adaptor.addChild(root_0, DIVIDE2_tree);

            	            pushFollow(FOLLOW_show_errors_in_sqlplus_file68);
            	            show_errors3=show_errors();

            	            state._fsp--;

            	            adaptor.addChild(root_0, show_errors3.getTree());

            	            }
            	            break;

            	    }

            	    // src/org/plsql/PLSQL2.g:93:47: ( DIVIDE )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==DIVIDE) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // src/org/plsql/PLSQL2.g:93:47: DIVIDE
            	            {
            	            DIVIDE4=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_sqlplus_file73); 
            	            DIVIDE4_tree = (Object)adaptor.create(DIVIDE4);
            	            adaptor.addChild(root_0, DIVIDE4_tree);


            	            }
            	            break;

            	    }


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

            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_sqlplus_file79); 
            EOF5_tree = (Object)adaptor.create(EOF5);
            adaptor.addChild(root_0, EOF5_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sqlplus_file"

    public static class show_errors_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "show_errors"
    // src/org/plsql/PLSQL2.g:96:1: show_errors : kSHOW kERRORS ( SEMI )? ;
    public final PLSQL2Parser.show_errors_return show_errors() throws RecognitionException {
        PLSQL2Parser.show_errors_return retval = new PLSQL2Parser.show_errors_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI8=null;
        PLSQL2Parser.kSHOW_return kSHOW6 = null;

        PLSQL2Parser.kERRORS_return kERRORS7 = null;


        Object SEMI8_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:97:5: ( kSHOW kERRORS ( SEMI )? )
            // src/org/plsql/PLSQL2.g:97:7: kSHOW kERRORS ( SEMI )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_kSHOW_in_show_errors100);
            kSHOW6=kSHOW();

            state._fsp--;

            adaptor.addChild(root_0, kSHOW6.getTree());
            pushFollow(FOLLOW_kERRORS_in_show_errors102);
            kERRORS7=kERRORS();

            state._fsp--;

            adaptor.addChild(root_0, kERRORS7.getTree());
            // src/org/plsql/PLSQL2.g:97:21: ( SEMI )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SEMI) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:97:21: SEMI
                    {
                    SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_show_errors104); 
                    SEMI8_tree = (Object)adaptor.create(SEMI8);
                    adaptor.addChild(root_0, SEMI8_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "show_errors"

    public static class create_object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_object"
    // src/org/plsql/PLSQL2.g:100:1: create_object : ( create_package | create_package_body | create_function | create_procedure | create_type );
    public final PLSQL2Parser.create_object_return create_object() throws RecognitionException {
        PLSQL2Parser.create_object_return retval = new PLSQL2Parser.create_object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQL2Parser.create_package_return create_package9 = null;

        PLSQL2Parser.create_package_body_return create_package_body10 = null;

        PLSQL2Parser.create_function_return create_function11 = null;

        PLSQL2Parser.create_procedure_return create_procedure12 = null;

        PLSQL2Parser.create_type_return create_type13 = null;



        try {
            // src/org/plsql/PLSQL2.g:101:5: ( create_package | create_package_body | create_function | create_procedure | create_type )
            int alt5=5;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:101:7: create_package
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_package_in_create_object122);
                    create_package9=create_package();

                    state._fsp--;

                    adaptor.addChild(root_0, create_package9.getTree());

                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:102:7: create_package_body
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_package_body_in_create_object130);
                    create_package_body10=create_package_body();

                    state._fsp--;

                    adaptor.addChild(root_0, create_package_body10.getTree());

                    }
                    break;
                case 3 :
                    // src/org/plsql/PLSQL2.g:103:7: create_function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_function_in_create_object138);
                    create_function11=create_function();

                    state._fsp--;

                    adaptor.addChild(root_0, create_function11.getTree());

                    }
                    break;
                case 4 :
                    // src/org/plsql/PLSQL2.g:104:7: create_procedure
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_procedure_in_create_object146);
                    create_procedure12=create_procedure();

                    state._fsp--;

                    adaptor.addChild(root_0, create_procedure12.getTree());

                    }
                    break;
                case 5 :
                    // src/org/plsql/PLSQL2.g:105:7: create_type
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_type_in_create_object154);
                    create_type13=create_type();

                    state._fsp--;

                    adaptor.addChild(root_0, create_type13.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_object"

    public static class procedure_heading_return extends ParserRuleReturnScope {
        public HashMap r_procedureDef;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_heading"
    // src/org/plsql/PLSQL2.g:108:1: procedure_heading returns [HashMap r_procedureDef] : PROCEDURE ID (temp3= parameter_declarations )? -> ^( PROCEDURE ID ( parameter_declarations )? ) ;
    public final PLSQL2Parser.procedure_heading_return procedure_heading() throws RecognitionException {
        PLSQL2Parser.procedure_heading_return retval = new PLSQL2Parser.procedure_heading_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PROCEDURE14=null;
        Token ID15=null;
        PLSQL2Parser.parameter_declarations_return temp3 = null;


        Object PROCEDURE14_tree=null;
        Object ID15_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_parameter_declarations=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declarations");
        try {
            // src/org/plsql/PLSQL2.g:108:52: ( PROCEDURE ID (temp3= parameter_declarations )? -> ^( PROCEDURE ID ( parameter_declarations )? ) )
            // src/org/plsql/PLSQL2.g:109:2: PROCEDURE ID (temp3= parameter_declarations )?
            {

            		retval.r_procedureDef = new HashMap();
            	
            PROCEDURE14=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedure_heading182);  
            stream_PROCEDURE.add(PROCEDURE14);

            ID15=(Token)match(input,ID,FOLLOW_ID_in_procedure_heading184);  
            stream_ID.add(ID15);


                    	retval.r_procedureDef.put("id",(ID15!=null?ID15.getText():null));
                    
            // src/org/plsql/PLSQL2.g:116:14: (temp3= parameter_declarations )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LPAREN) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:116:14: temp3= parameter_declarations
                    {
                    pushFollow(FOLLOW_parameter_declarations_in_procedure_heading207);
                    temp3=parameter_declarations();

                    state._fsp--;

                    stream_parameter_declarations.add(temp3.getTree());

                    }
                    break;

            }

            	
                    	retval.r_procedureDef.put("paramList",(temp3!=null?temp3.r_parameter_list:null));
                    

                    	m_procedureList.add(retval.r_procedureDef);
                    


            // AST REWRITE
            // elements: ID, PROCEDURE, parameter_declarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 123:9: -> ^( PROCEDURE ID ( parameter_declarations )? )
            {
                // src/org/plsql/PLSQL2.g:123:12: ^( PROCEDURE ID ( parameter_declarations )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PROCEDURE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // src/org/plsql/PLSQL2.g:123:28: ( parameter_declarations )?
                if ( stream_parameter_declarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_declarations.nextTree());

                }
                stream_parameter_declarations.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedure_heading"

    public static class function_heading_return extends ParserRuleReturnScope {
        public HashMap r_functionDef;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_heading"
    // src/org/plsql/PLSQL2.g:126:1: function_heading returns [HashMap r_functionDef] : FUNCTION ID (temp4= parameter_declarations )? RETURN datatype -> ^( FUNCTION ID ( parameter_declarations )? datatype ) ;
    public final PLSQL2Parser.function_heading_return function_heading() throws RecognitionException {
        PLSQL2Parser.function_heading_return retval = new PLSQL2Parser.function_heading_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION16=null;
        Token ID17=null;
        Token RETURN18=null;
        PLSQL2Parser.parameter_declarations_return temp4 = null;

        PLSQL2Parser.datatype_return datatype19 = null;


        Object FUNCTION16_tree=null;
        Object ID17_tree=null;
        Object RETURN18_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_parameter_declarations=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declarations");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // src/org/plsql/PLSQL2.g:126:50: ( FUNCTION ID (temp4= parameter_declarations )? RETURN datatype -> ^( FUNCTION ID ( parameter_declarations )? datatype ) )
            // src/org/plsql/PLSQL2.g:127:2: FUNCTION ID (temp4= parameter_declarations )? RETURN datatype
            {

            		retval.r_functionDef = new HashMap();
            	
            FUNCTION16=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_heading282);  
            stream_FUNCTION.add(FUNCTION16);

            ID17=(Token)match(input,ID,FOLLOW_ID_in_function_heading284);  
            stream_ID.add(ID17);


                    	retval.r_functionDef.put("id",(ID17!=null?ID17.getText():null));
                    
            // src/org/plsql/PLSQL2.g:134:14: (temp4= parameter_declarations )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LPAREN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:134:14: temp4= parameter_declarations
                    {
                    pushFollow(FOLLOW_parameter_declarations_in_function_heading306);
                    temp4=parameter_declarations();

                    state._fsp--;

                    stream_parameter_declarations.add(temp4.getTree());

                    }
                    break;

            }


                    	retval.r_functionDef.put("paramList",(temp4!=null?temp4.r_parameter_list:null));
                    
            RETURN18=(Token)match(input,RETURN,FOLLOW_RETURN_in_function_heading327);  
            stream_RETURN.add(RETURN18);

            pushFollow(FOLLOW_datatype_in_function_heading329);
            datatype19=datatype();

            state._fsp--;

            stream_datatype.add(datatype19.getTree());

                    	retval.r_functionDef.put("returnType",(datatype19!=null?input.toString(datatype19.start,datatype19.stop):null));
                    

                    	m_functionList.add(retval.r_functionDef);
                    


            // AST REWRITE
            // elements: parameter_declarations, ID, datatype, FUNCTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 145:12: -> ^( FUNCTION ID ( parameter_declarations )? datatype )
            {
                // src/org/plsql/PLSQL2.g:145:15: ^( FUNCTION ID ( parameter_declarations )? datatype )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // src/org/plsql/PLSQL2.g:145:29: ( parameter_declarations )?
                if ( stream_parameter_declarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_declarations.nextTree());

                }
                stream_parameter_declarations.reset();
                adaptor.addChild(root_1, stream_datatype.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_heading"

    public static class parameter_declarations_return extends ParserRuleReturnScope {
        public ArrayList r_parameter_list;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_declarations"
    // src/org/plsql/PLSQL2.g:148:1: parameter_declarations returns [ ArrayList r_parameter_list ] : ( LPAREN temp1= parameter_declaration ( COMMA temp2= parameter_declaration )* RPAREN ) -> ^( parameter_declaration ( parameter_declaration )* ) ;
    public final PLSQL2Parser.parameter_declarations_return parameter_declarations() throws RecognitionException {
        PLSQL2Parser.parameter_declarations_return retval = new PLSQL2Parser.parameter_declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN20=null;
        Token COMMA21=null;
        Token RPAREN22=null;
        PLSQL2Parser.parameter_declaration_return temp1 = null;

        PLSQL2Parser.parameter_declaration_return temp2 = null;


        Object LPAREN20_tree=null;
        Object COMMA21_tree=null;
        Object RPAREN22_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_parameter_declaration=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration");
        try {
            // src/org/plsql/PLSQL2.g:148:62: ( ( LPAREN temp1= parameter_declaration ( COMMA temp2= parameter_declaration )* RPAREN ) -> ^( parameter_declaration ( parameter_declaration )* ) )
            // src/org/plsql/PLSQL2.g:149:3: ( LPAREN temp1= parameter_declaration ( COMMA temp2= parameter_declaration )* RPAREN )
            {

            			retval.r_parameter_list = new ArrayList();
            		
            // src/org/plsql/PLSQL2.g:152:9: ( LPAREN temp1= parameter_declaration ( COMMA temp2= parameter_declaration )* RPAREN )
            // src/org/plsql/PLSQL2.g:152:13: LPAREN temp1= parameter_declaration ( COMMA temp2= parameter_declaration )* RPAREN
            {
            LPAREN20=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parameter_declarations405);  
            stream_LPAREN.add(LPAREN20);

            pushFollow(FOLLOW_parameter_declaration_in_parameter_declarations410);
            temp1=parameter_declaration();

            state._fsp--;

            stream_parameter_declaration.add(temp1.getTree());

                    		retval.r_parameter_list.add((temp1!=null?temp1.r_parameter:null));
                    	
            // src/org/plsql/PLSQL2.g:156:10: ( COMMA temp2= parameter_declaration )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:156:12: COMMA temp2= parameter_declaration
            	    {
            	    COMMA21=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_declarations434);  
            	    stream_COMMA.add(COMMA21);

            	    pushFollow(FOLLOW_parameter_declaration_in_parameter_declarations439);
            	    temp2=parameter_declaration();

            	    state._fsp--;

            	    stream_parameter_declaration.add(temp2.getTree());

            	            		retval.r_parameter_list.add((temp2!=null?temp2.r_parameter:null));
            	            	

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            RPAREN22=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parameter_declarations466);  
            stream_RPAREN.add(RPAREN22);


            }



            // AST REWRITE
            // elements: parameter_declaration, parameter_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 160:22: -> ^( parameter_declaration ( parameter_declaration )* )
            {
                // src/org/plsql/PLSQL2.g:160:25: ^( parameter_declaration ( parameter_declaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_parameter_declaration.nextNode(), root_1);

                // src/org/plsql/PLSQL2.g:160:51: ( parameter_declaration )*
                while ( stream_parameter_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_declaration.nextTree());

                }
                stream_parameter_declaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter_declarations"

    public static class parameter_declaration_return extends ParserRuleReturnScope {
        public HashMap r_parameter;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_declaration"
    // src/org/plsql/PLSQL2.g:166:1: parameter_declaration returns [HashMap r_parameter] : ID ( param_type )? datatype ( ( ASSIGN | DEFAULT ) expression )? -> ^( ID ( param_type )? datatype ) ;
    public final PLSQL2Parser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        PLSQL2Parser.parameter_declaration_return retval = new PLSQL2Parser.parameter_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID23=null;
        Token ASSIGN26=null;
        Token DEFAULT27=null;
        PLSQL2Parser.param_type_return param_type24 = null;

        PLSQL2Parser.datatype_return datatype25 = null;

        PLSQL2Parser.expression_return expression28 = null;


        Object ID23_tree=null;
        Object ASSIGN26_tree=null;
        Object DEFAULT27_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_param_type=new RewriteRuleSubtreeStream(adaptor,"rule param_type");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // src/org/plsql/PLSQL2.g:166:52: ( ID ( param_type )? datatype ( ( ASSIGN | DEFAULT ) expression )? -> ^( ID ( param_type )? datatype ) )
            // src/org/plsql/PLSQL2.g:167:3: ID ( param_type )? datatype ( ( ASSIGN | DEFAULT ) expression )?
            {

            			retval.r_parameter = new HashMap();
            		
            ID23=(Token)match(input,ID,FOLLOW_ID_in_parameter_declaration522);  
            stream_ID.add(ID23);

            // src/org/plsql/PLSQL2.g:170:12: ( param_type )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=IN && LA9_0<=OUT)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:170:12: param_type
                    {
                    pushFollow(FOLLOW_param_type_in_parameter_declaration524);
                    param_type24=param_type();

                    state._fsp--;

                    stream_param_type.add(param_type24.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_datatype_in_parameter_declaration527);
            datatype25=datatype();

            state._fsp--;

            stream_datatype.add(datatype25.getTree());
            // src/org/plsql/PLSQL2.g:171:9: ( ( ASSIGN | DEFAULT ) expression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=ASSIGN && LA11_0<=DEFAULT)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:171:11: ( ASSIGN | DEFAULT ) expression
                    {
                    // src/org/plsql/PLSQL2.g:171:11: ( ASSIGN | DEFAULT )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ASSIGN) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==DEFAULT) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:171:13: ASSIGN
                            {
                            ASSIGN26=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_parameter_declaration542);  
                            stream_ASSIGN.add(ASSIGN26);


                            }
                            break;
                        case 2 :
                            // src/org/plsql/PLSQL2.g:171:22: DEFAULT
                            {
                            DEFAULT27=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_parameter_declaration546);  
                            stream_DEFAULT.add(DEFAULT27);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_parameter_declaration550);
                    expression28=expression();

                    state._fsp--;

                    stream_expression.add(expression28.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: param_type, ID, datatype
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 171:47: -> ^( ID ( param_type )? datatype )
            {
                // src/org/plsql/PLSQL2.g:171:52: ^( ID ( param_type )? datatype )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);

                adaptor.addChild(root_1, 
                        		retval.r_parameter.put("id",(ID23!=null?ID23.getText():null))
                       		 );
                // src/org/plsql/PLSQL2.g:175:10: ( param_type )?
                if ( stream_param_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_param_type.nextTree());
                    adaptor.addChild(root_1, 
                            		retval.r_parameter.put("paramType",(param_type24!=null?input.toString(param_type24.start,param_type24.stop):null))
                            	);

                }
                stream_param_type.reset();
                adaptor.addChild(root_1, stream_datatype.nextTree());
                adaptor.addChild(root_1, 
                        		retval.r_parameter.put("dataType",(datatype25!=null?input.toString(datatype25.start,datatype25.stop):null))
                        );

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter_declaration"

    public static class param_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param_type"
    // src/org/plsql/PLSQL2.g:186:1: param_type : ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) ) ;
    public final PLSQL2Parser.param_type_return param_type() throws RecognitionException {
        PLSQL2Parser.param_type_return retval = new PLSQL2Parser.param_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN29=null;
        Token OUT30=null;
        Token IN31=null;
        Token OUT32=null;
        Token NOCOPY33=null;

        Object IN29_tree=null;
        Object OUT30_tree=null;
        Object IN31_tree=null;
        Object OUT32_tree=null;
        Object NOCOPY33_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:186:11: ( ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) ) )
            // src/org/plsql/PLSQL2.g:187:5: ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )
            {
            root_0 = (Object)adaptor.nil();

            // src/org/plsql/PLSQL2.g:187:5: ( IN | ( ( OUT | IN OUT ) ( NOCOPY )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IN) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==OUT) ) {
                    alt14=2;
                }
                else if ( (LA14_1==ID||LA14_1==REF) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0==OUT) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:187:7: IN
                    {
                    IN29=(Token)match(input,IN,FOLLOW_IN_in_param_type681); 
                    IN29_tree = (Object)adaptor.create(IN29);
                    adaptor.addChild(root_0, IN29_tree);


                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:187:12: ( ( OUT | IN OUT ) ( NOCOPY )? )
                    {
                    // src/org/plsql/PLSQL2.g:187:12: ( ( OUT | IN OUT ) ( NOCOPY )? )
                    // src/org/plsql/PLSQL2.g:187:14: ( OUT | IN OUT ) ( NOCOPY )?
                    {
                    // src/org/plsql/PLSQL2.g:187:14: ( OUT | IN OUT )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==OUT) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==IN) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:187:16: OUT
                            {
                            OUT30=(Token)match(input,OUT,FOLLOW_OUT_in_param_type689); 
                            OUT30_tree = (Object)adaptor.create(OUT30);
                            adaptor.addChild(root_0, OUT30_tree);


                            }
                            break;
                        case 2 :
                            // src/org/plsql/PLSQL2.g:187:22: IN OUT
                            {
                            IN31=(Token)match(input,IN,FOLLOW_IN_in_param_type693); 
                            IN31_tree = (Object)adaptor.create(IN31);
                            adaptor.addChild(root_0, IN31_tree);

                            OUT32=(Token)match(input,OUT,FOLLOW_OUT_in_param_type695); 
                            OUT32_tree = (Object)adaptor.create(OUT32);
                            adaptor.addChild(root_0, OUT32_tree);


                            }
                            break;

                    }

                    // src/org/plsql/PLSQL2.g:187:31: ( NOCOPY )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==NOCOPY) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:187:31: NOCOPY
                            {
                            NOCOPY33=(Token)match(input,NOCOPY,FOLLOW_NOCOPY_in_param_type699); 
                            NOCOPY33_tree = (Object)adaptor.create(NOCOPY33);
                            adaptor.addChild(root_0, NOCOPY33_tree);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "param_type"

    public static class declare_section_return extends ParserRuleReturnScope {
        public String construct;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declare_section"
    // src/org/plsql/PLSQL2.g:190:1: declare_section returns [ String construct ] : ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI )+ ;
    public final PLSQL2Parser.declare_section_return declare_section() throws RecognitionException {
        PLSQL2Parser.declare_section_return retval = new PLSQL2Parser.declare_section_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI35=null;
        Token SEMI37=null;
        Token SEMI39=null;
        Token SEMI41=null;
        Token SEMI43=null;
        Token SEMI45=null;
        Token SEMI47=null;
        PLSQL2Parser.type_definition_return type_definition34 = null;

        PLSQL2Parser.subtype_definition_return subtype_definition36 = null;

        PLSQL2Parser.cursor_definition_return cursor_definition38 = null;

        PLSQL2Parser.item_declaration_return item_declaration40 = null;

        PLSQL2Parser.function_declaration_or_definition_return function_declaration_or_definition42 = null;

        PLSQL2Parser.procedure_declaration_or_definition_return procedure_declaration_or_definition44 = null;

        PLSQL2Parser.pragma_return pragma46 = null;


        Object SEMI35_tree=null;
        Object SEMI37_tree=null;
        Object SEMI39_tree=null;
        Object SEMI41_tree=null;
        Object SEMI43_tree=null;
        Object SEMI45_tree=null;
        Object SEMI47_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:190:46: ( ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI )+ )
            // src/org/plsql/PLSQL2.g:191:5: ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI )+
            {
            root_0 = (Object)adaptor.nil();

            // src/org/plsql/PLSQL2.g:191:5: ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI )+
            int cnt15=0;
            loop15:
            do {
                int alt15=8;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:191:7: type_definition SEMI
            	    {
            	    pushFollow(FOLLOW_type_definition_in_declare_section729);
            	    type_definition34=type_definition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, type_definition34.getTree());
            	    SEMI35=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section731); 
            	    retval.construct = (type_definition34!=null?input.toString(type_definition34.start,type_definition34.stop):null);

            	    }
            	    break;
            	case 2 :
            	    // src/org/plsql/PLSQL2.g:192:7: subtype_definition SEMI
            	    {
            	    pushFollow(FOLLOW_subtype_definition_in_declare_section743);
            	    subtype_definition36=subtype_definition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, subtype_definition36.getTree());
            	    SEMI37=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section745); 

            	    }
            	    break;
            	case 3 :
            	    // src/org/plsql/PLSQL2.g:193:7: cursor_definition SEMI
            	    {
            	    pushFollow(FOLLOW_cursor_definition_in_declare_section754);
            	    cursor_definition38=cursor_definition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cursor_definition38.getTree());
            	    SEMI39=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section756); 

            	    }
            	    break;
            	case 4 :
            	    // src/org/plsql/PLSQL2.g:194:7: item_declaration SEMI
            	    {
            	    pushFollow(FOLLOW_item_declaration_in_declare_section765);
            	    item_declaration40=item_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, item_declaration40.getTree());
            	    SEMI41=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section767); 

            	    }
            	    break;
            	case 5 :
            	    // src/org/plsql/PLSQL2.g:195:7: function_declaration_or_definition SEMI
            	    {
            	    pushFollow(FOLLOW_function_declaration_or_definition_in_declare_section776);
            	    function_declaration_or_definition42=function_declaration_or_definition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function_declaration_or_definition42.getTree());
            	    SEMI43=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section778); 
            	    retval.construct = (function_declaration_or_definition42!=null?function_declaration_or_definition42.construct:null);

            	    }
            	    break;
            	case 6 :
            	    // src/org/plsql/PLSQL2.g:196:7: procedure_declaration_or_definition SEMI
            	    {
            	    pushFollow(FOLLOW_procedure_declaration_or_definition_in_declare_section789);
            	    procedure_declaration_or_definition44=procedure_declaration_or_definition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, procedure_declaration_or_definition44.getTree());
            	    SEMI45=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section791); 
            	    retval.construct = (procedure_declaration_or_definition44!=null?procedure_declaration_or_definition44.construct:null);
            	                                                     System.out.println(retval.construct);

            	    }
            	    break;
            	case 7 :
            	    // src/org/plsql/PLSQL2.g:198:7: pragma SEMI
            	    {
            	    pushFollow(FOLLOW_pragma_in_declare_section802);
            	    pragma46=pragma();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pragma46.getTree());
            	    SEMI47=(Token)match(input,SEMI,FOLLOW_SEMI_in_declare_section804); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declare_section"

    public static class cursor_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cursor_definition"
    // src/org/plsql/PLSQL2.g:202:1: cursor_definition : CURSOR ID ( parameter_declarations )? IS select_statement ;
    public final PLSQL2Parser.cursor_definition_return cursor_definition() throws RecognitionException {
        PLSQL2Parser.cursor_definition_return retval = new PLSQL2Parser.cursor_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CURSOR48=null;
        Token ID49=null;
        Token IS51=null;
        PLSQL2Parser.parameter_declarations_return parameter_declarations50 = null;

        PLSQL2Parser.select_statement_return select_statement52 = null;


        Object CURSOR48_tree=null;
        Object ID49_tree=null;
        Object IS51_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:202:19: ( CURSOR ID ( parameter_declarations )? IS select_statement )
            // src/org/plsql/PLSQL2.g:203:9: CURSOR ID ( parameter_declarations )? IS select_statement
            {
            root_0 = (Object)adaptor.nil();

            CURSOR48=(Token)match(input,CURSOR,FOLLOW_CURSOR_in_cursor_definition833); 
            CURSOR48_tree = (Object)adaptor.create(CURSOR48);
            adaptor.addChild(root_0, CURSOR48_tree);

            ID49=(Token)match(input,ID,FOLLOW_ID_in_cursor_definition835); 
            ID49_tree = (Object)adaptor.create(ID49);
            adaptor.addChild(root_0, ID49_tree);

            // src/org/plsql/PLSQL2.g:203:19: ( parameter_declarations )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LPAREN) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:203:19: parameter_declarations
                    {
                    pushFollow(FOLLOW_parameter_declarations_in_cursor_definition837);
                    parameter_declarations50=parameter_declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_declarations50.getTree());

                    }
                    break;

            }

            IS51=(Token)match(input,IS,FOLLOW_IS_in_cursor_definition840); 
            IS51_tree = (Object)adaptor.create(IS51);
            adaptor.addChild(root_0, IS51_tree);

            pushFollow(FOLLOW_select_statement_in_cursor_definition842);
            select_statement52=select_statement();

            state._fsp--;

            adaptor.addChild(root_0, select_statement52.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cursor_definition"

    public static class item_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "item_declaration"
    // src/org/plsql/PLSQL2.g:206:1: item_declaration : ( variable_declaration | constant_declaration | exception_declaration );
    public final PLSQL2Parser.item_declaration_return item_declaration() throws RecognitionException {
        PLSQL2Parser.item_declaration_return retval = new PLSQL2Parser.item_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQL2Parser.variable_declaration_return variable_declaration53 = null;

        PLSQL2Parser.constant_declaration_return constant_declaration54 = null;

        PLSQL2Parser.exception_declaration_return exception_declaration55 = null;



        try {
            // src/org/plsql/PLSQL2.g:207:5: ( variable_declaration | constant_declaration | exception_declaration )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID) ) {
                switch ( input.LA(2) ) {
                case CONSTANT:
                    {
                    alt17=2;
                    }
                    break;
                case EXCEPTION:
                    {
                    alt17=3;
                    }
                    break;
                case ID:
                case REF:
                    {
                    alt17=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:207:7: variable_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_declaration_in_item_declaration859);
                    variable_declaration53=variable_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, variable_declaration53.getTree());

                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:208:7: constant_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constant_declaration_in_item_declaration867);
                    constant_declaration54=constant_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, constant_declaration54.getTree());

                    }
                    break;
                case 3 :
                    // src/org/plsql/PLSQL2.g:209:7: exception_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exception_declaration_in_item_declaration875);
                    exception_declaration55=exception_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, exception_declaration55.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "item_declaration"

    public static class variable_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_declaration"
    // src/org/plsql/PLSQL2.g:212:1: variable_declaration : ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? ;
    public final PLSQL2Parser.variable_declaration_return variable_declaration() throws RecognitionException {
        PLSQL2Parser.variable_declaration_return retval = new PLSQL2Parser.variable_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID56=null;
        Token NOT58=null;
        Token NULL59=null;
        Token set60=null;
        PLSQL2Parser.datatype_return datatype57 = null;

        PLSQL2Parser.expression_return expression61 = null;


        Object ID56_tree=null;
        Object NOT58_tree=null;
        Object NULL59_tree=null;
        Object set60_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:212:22: ( ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? )
            // src/org/plsql/PLSQL2.g:213:9: ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            {
            root_0 = (Object)adaptor.nil();

            ID56=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration896); 
            ID56_tree = (Object)adaptor.create(ID56);
            adaptor.addChild(root_0, ID56_tree);

            pushFollow(FOLLOW_datatype_in_variable_declaration898);
            datatype57=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype57.getTree());
            // src/org/plsql/PLSQL2.g:213:21: ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=ASSIGN && LA19_0<=DEFAULT)||LA19_0==NOT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:213:24: ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
                    {
                    // src/org/plsql/PLSQL2.g:213:24: ( NOT NULL )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NOT) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:213:27: NOT NULL
                            {
                            NOT58=(Token)match(input,NOT,FOLLOW_NOT_in_variable_declaration906); 
                            NOT58_tree = (Object)adaptor.create(NOT58);
                            adaptor.addChild(root_0, NOT58_tree);

                            NULL59=(Token)match(input,NULL,FOLLOW_NULL_in_variable_declaration908); 
                            NULL59_tree = (Object)adaptor.create(NULL59);
                            adaptor.addChild(root_0, NULL59_tree);


                            }
                            break;

                    }

                    set60=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set60));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expression_in_variable_declaration925);
                    expression61=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression61.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable_declaration"

    public static class constant_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant_declaration"
    // src/org/plsql/PLSQL2.g:216:1: constant_declaration : ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression ;
    public final PLSQL2Parser.constant_declaration_return constant_declaration() throws RecognitionException {
        PLSQL2Parser.constant_declaration_return retval = new PLSQL2Parser.constant_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID62=null;
        Token CONSTANT63=null;
        Token NOT65=null;
        Token NULL66=null;
        Token set67=null;
        PLSQL2Parser.datatype_return datatype64 = null;

        PLSQL2Parser.expression_return expression68 = null;


        Object ID62_tree=null;
        Object CONSTANT63_tree=null;
        Object NOT65_tree=null;
        Object NULL66_tree=null;
        Object set67_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:216:22: ( ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )
            // src/org/plsql/PLSQL2.g:217:9: ID CONSTANT datatype ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
            {
            root_0 = (Object)adaptor.nil();

            ID62=(Token)match(input,ID,FOLLOW_ID_in_constant_declaration950); 
            ID62_tree = (Object)adaptor.create(ID62);
            adaptor.addChild(root_0, ID62_tree);

            CONSTANT63=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_constant_declaration952); 
            CONSTANT63_tree = (Object)adaptor.create(CONSTANT63);
            adaptor.addChild(root_0, CONSTANT63_tree);

            pushFollow(FOLLOW_datatype_in_constant_declaration954);
            datatype64=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype64.getTree());
            // src/org/plsql/PLSQL2.g:217:30: ( NOT NULL )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==NOT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:217:32: NOT NULL
                    {
                    NOT65=(Token)match(input,NOT,FOLLOW_NOT_in_constant_declaration958); 
                    NOT65_tree = (Object)adaptor.create(NOT65);
                    adaptor.addChild(root_0, NOT65_tree);

                    NULL66=(Token)match(input,NULL,FOLLOW_NULL_in_constant_declaration960); 
                    NULL66_tree = (Object)adaptor.create(NULL66);
                    adaptor.addChild(root_0, NULL66_tree);


                    }
                    break;

            }

            set67=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set67));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_expression_in_constant_declaration979);
            expression68=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression68.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constant_declaration"

    public static class exception_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exception_declaration"
    // src/org/plsql/PLSQL2.g:220:1: exception_declaration : ID EXCEPTION ;
    public final PLSQL2Parser.exception_declaration_return exception_declaration() throws RecognitionException {
        PLSQL2Parser.exception_declaration_return retval = new PLSQL2Parser.exception_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID69=null;
        Token EXCEPTION70=null;

        Object ID69_tree=null;
        Object EXCEPTION70_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:220:23: ( ID EXCEPTION )
            // src/org/plsql/PLSQL2.g:221:9: ID EXCEPTION
            {
            root_0 = (Object)adaptor.nil();

            ID69=(Token)match(input,ID,FOLLOW_ID_in_exception_declaration1000); 
            ID69_tree = (Object)adaptor.create(ID69);
            adaptor.addChild(root_0, ID69_tree);

            EXCEPTION70=(Token)match(input,EXCEPTION,FOLLOW_EXCEPTION_in_exception_declaration1002); 
            EXCEPTION70_tree = (Object)adaptor.create(EXCEPTION70);
            adaptor.addChild(root_0, EXCEPTION70_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exception_declaration"

    public static class type_definition_return extends ParserRuleReturnScope {
        public HashMap r_typeDef;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_definition"
    // src/org/plsql/PLSQL2.g:224:1: type_definition returns [HashMap r_typeDef] : kTYPE ID ( IS | AS ) ( record_type_definition | collection_type_definition | ref_cursor_type_definition | ( object_type_definition ) ) ;
    public final PLSQL2Parser.type_definition_return type_definition() throws RecognitionException {
        PLSQL2Parser.type_definition_return retval = new PLSQL2Parser.type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID72=null;
        Token set73=null;
        PLSQL2Parser.kTYPE_return kTYPE71 = null;

        PLSQL2Parser.record_type_definition_return record_type_definition74 = null;

        PLSQL2Parser.collection_type_definition_return collection_type_definition75 = null;

        PLSQL2Parser.ref_cursor_type_definition_return ref_cursor_type_definition76 = null;

        PLSQL2Parser.object_type_definition_return object_type_definition77 = null;


        Object ID72_tree=null;
        Object set73_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:224:44: ( kTYPE ID ( IS | AS ) ( record_type_definition | collection_type_definition | ref_cursor_type_definition | ( object_type_definition ) ) )
            // src/org/plsql/PLSQL2.g:225:2: kTYPE ID ( IS | AS ) ( record_type_definition | collection_type_definition | ref_cursor_type_definition | ( object_type_definition ) )
            {
            root_0 = (Object)adaptor.nil();


            		retval.r_typeDef = new HashMap();
            	
            pushFollow(FOLLOW_kTYPE_in_type_definition1029);
            kTYPE71=kTYPE();

            state._fsp--;

            adaptor.addChild(root_0, kTYPE71.getTree());
            ID72=(Token)match(input,ID,FOLLOW_ID_in_type_definition1031); 
            ID72_tree = (Object)adaptor.create(ID72);
            adaptor.addChild(root_0, ID72_tree);


                        retval.r_typeDef.put("id",(ID72!=null?ID72.getText():null));
                    
            set73=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set73));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // src/org/plsql/PLSQL2.g:232:19: ( record_type_definition | collection_type_definition | ref_cursor_type_definition | ( object_type_definition ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case RECORD:
                {
                alt21=1;
                }
                break;
            case VARYING:
            case VARRAY:
            case TABLE:
                {
                alt21=2;
                }
                break;
            case REF:
                {
                alt21=3;
                }
                break;
            case OBJECT:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:232:21: record_type_definition
                    {
                    pushFollow(FOLLOW_record_type_definition_in_type_definition1062);
                    record_type_definition74=record_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, record_type_definition74.getTree());

                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:232:46: collection_type_definition
                    {
                    pushFollow(FOLLOW_collection_type_definition_in_type_definition1066);
                    collection_type_definition75=collection_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, collection_type_definition75.getTree());

                                    retval.r_typeDef.put("type","collection");
                            		retval.r_typeDef.put("collectionType",(collection_type_definition75!=null?collection_type_definition75.r_collectionType:null));
                            		m_typeList.add(retval.r_typeDef);
                            	

                    }
                    break;
                case 3 :
                    // src/org/plsql/PLSQL2.g:239:13: ref_cursor_type_definition
                    {
                    pushFollow(FOLLOW_ref_cursor_type_definition_in_type_definition1104);
                    ref_cursor_type_definition76=ref_cursor_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, ref_cursor_type_definition76.getTree());

                    }
                    break;
                case 4 :
                    // src/org/plsql/PLSQL2.g:240:12: ( object_type_definition )
                    {
                    // src/org/plsql/PLSQL2.g:240:12: ( object_type_definition )
                    // src/org/plsql/PLSQL2.g:240:13: object_type_definition
                    {
                    pushFollow(FOLLOW_object_type_definition_in_type_definition1119);
                    object_type_definition77=object_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, object_type_definition77.getTree());

                                    retval.r_typeDef.put("type","object");
                            		retval.r_typeDef.put("fieldList",(object_type_definition77!=null?object_type_definition77.r_field_list:null));
                            		m_typeList.add(retval.r_typeDef);
                            	

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_definition"

    public static class subtype_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subtype_definition"
    // src/org/plsql/PLSQL2.g:250:1: subtype_definition : SUBTYPE ID IS datatype ( NOT NULL )? ;
    public final PLSQL2Parser.subtype_definition_return subtype_definition() throws RecognitionException {
        PLSQL2Parser.subtype_definition_return retval = new PLSQL2Parser.subtype_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SUBTYPE78=null;
        Token ID79=null;
        Token IS80=null;
        Token NOT82=null;
        Token NULL83=null;
        PLSQL2Parser.datatype_return datatype81 = null;


        Object SUBTYPE78_tree=null;
        Object ID79_tree=null;
        Object IS80_tree=null;
        Object NOT82_tree=null;
        Object NULL83_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:250:20: ( SUBTYPE ID IS datatype ( NOT NULL )? )
            // src/org/plsql/PLSQL2.g:251:9: SUBTYPE ID IS datatype ( NOT NULL )?
            {
            root_0 = (Object)adaptor.nil();

            SUBTYPE78=(Token)match(input,SUBTYPE,FOLLOW_SUBTYPE_in_subtype_definition1178); 
            SUBTYPE78_tree = (Object)adaptor.create(SUBTYPE78);
            adaptor.addChild(root_0, SUBTYPE78_tree);

            ID79=(Token)match(input,ID,FOLLOW_ID_in_subtype_definition1180); 
            ID79_tree = (Object)adaptor.create(ID79);
            adaptor.addChild(root_0, ID79_tree);

            IS80=(Token)match(input,IS,FOLLOW_IS_in_subtype_definition1182); 
            IS80_tree = (Object)adaptor.create(IS80);
            adaptor.addChild(root_0, IS80_tree);

            pushFollow(FOLLOW_datatype_in_subtype_definition1184);
            datatype81=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype81.getTree());
            // src/org/plsql/PLSQL2.g:251:32: ( NOT NULL )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==NOT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:251:34: NOT NULL
                    {
                    NOT82=(Token)match(input,NOT,FOLLOW_NOT_in_subtype_definition1188); 
                    NOT82_tree = (Object)adaptor.create(NOT82);
                    adaptor.addChild(root_0, NOT82_tree);

                    NULL83=(Token)match(input,NULL,FOLLOW_NULL_in_subtype_definition1190); 
                    NULL83_tree = (Object)adaptor.create(NULL83);
                    adaptor.addChild(root_0, NULL83_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "subtype_definition"

    public static class record_type_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "record_type_definition"
    // src/org/plsql/PLSQL2.g:254:1: record_type_definition : RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN ;
    public final PLSQL2Parser.record_type_definition_return record_type_definition() throws RecognitionException {
        PLSQL2Parser.record_type_definition_return retval = new PLSQL2Parser.record_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RECORD84=null;
        Token LPAREN85=null;
        Token COMMA87=null;
        Token RPAREN89=null;
        PLSQL2Parser.record_field_declaration_return record_field_declaration86 = null;

        PLSQL2Parser.record_field_declaration_return record_field_declaration88 = null;


        Object RECORD84_tree=null;
        Object LPAREN85_tree=null;
        Object COMMA87_tree=null;
        Object RPAREN89_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:254:24: ( RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN )
            // src/org/plsql/PLSQL2.g:255:2: RECORD LPAREN record_field_declaration ( COMMA record_field_declaration )* RPAREN
            {
            root_0 = (Object)adaptor.nil();

            RECORD84=(Token)match(input,RECORD,FOLLOW_RECORD_in_record_type_definition1211); 
            RECORD84_tree = (Object)adaptor.create(RECORD84);
            adaptor.addChild(root_0, RECORD84_tree);

            LPAREN85=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_record_type_definition1213); 
            LPAREN85_tree = (Object)adaptor.create(LPAREN85);
            adaptor.addChild(root_0, LPAREN85_tree);

            pushFollow(FOLLOW_record_field_declaration_in_record_type_definition1215);
            record_field_declaration86=record_field_declaration();

            state._fsp--;

            adaptor.addChild(root_0, record_field_declaration86.getTree());
            // src/org/plsql/PLSQL2.g:255:41: ( COMMA record_field_declaration )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:255:43: COMMA record_field_declaration
            	    {
            	    COMMA87=(Token)match(input,COMMA,FOLLOW_COMMA_in_record_type_definition1219); 
            	    COMMA87_tree = (Object)adaptor.create(COMMA87);
            	    adaptor.addChild(root_0, COMMA87_tree);

            	    pushFollow(FOLLOW_record_field_declaration_in_record_type_definition1221);
            	    record_field_declaration88=record_field_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, record_field_declaration88.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            RPAREN89=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_record_type_definition1226); 
            RPAREN89_tree = (Object)adaptor.create(RPAREN89);
            adaptor.addChild(root_0, RPAREN89_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "record_type_definition"

    public static class record_field_declaration_return extends ParserRuleReturnScope {
        public HashMap r_field;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "record_field_declaration"
    // src/org/plsql/PLSQL2.g:259:1: record_field_declaration returns [HashMap r_field] : ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? ;
    public final PLSQL2Parser.record_field_declaration_return record_field_declaration() throws RecognitionException {
        PLSQL2Parser.record_field_declaration_return retval = new PLSQL2Parser.record_field_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID90=null;
        Token NOT92=null;
        Token NULL93=null;
        Token set94=null;
        PLSQL2Parser.datatype_return datatype91 = null;

        PLSQL2Parser.expression_return expression95 = null;


        Object ID90_tree=null;
        Object NOT92_tree=null;
        Object NULL93_tree=null;
        Object set94_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:259:52: ( ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )? )
            // src/org/plsql/PLSQL2.g:260:2: ID datatype ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            {
            root_0 = (Object)adaptor.nil();


            		retval.r_field = new HashMap();
            	
            ID90=(Token)match(input,ID,FOLLOW_ID_in_record_field_declaration1250); 
            ID90_tree = (Object)adaptor.create(ID90);
            adaptor.addChild(root_0, ID90_tree);


                    retval.r_field.put("id",(ID90!=null?ID90.getText():null));
                
            pushFollow(FOLLOW_datatype_in_record_field_declaration1257);
            datatype91=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype91.getTree());

                    retval.r_field.put("dataType",(datatype91!=null?input.toString(datatype91.start,datatype91.stop):null));
                
            // src/org/plsql/PLSQL2.g:271:2: ( ( NOT NULL )? ( ASSIGN | DEFAULT ) expression )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=ASSIGN && LA25_0<=DEFAULT)||LA25_0==NOT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:271:4: ( NOT NULL )? ( ASSIGN | DEFAULT ) expression
                    {
                    // src/org/plsql/PLSQL2.g:271:4: ( NOT NULL )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==NOT) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:271:6: NOT NULL
                            {
                            NOT92=(Token)match(input,NOT,FOLLOW_NOT_in_record_field_declaration1268); 
                            NOT92_tree = (Object)adaptor.create(NOT92);
                            adaptor.addChild(root_0, NOT92_tree);

                            NULL93=(Token)match(input,NULL,FOLLOW_NULL_in_record_field_declaration1270); 
                            NULL93_tree = (Object)adaptor.create(NULL93);
                            adaptor.addChild(root_0, NULL93_tree);


                            }
                            break;

                    }

                    set94=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set94));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expression_in_record_field_declaration1285);
                    expression95=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression95.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "record_field_declaration"

    public static class object_type_definition_return extends ParserRuleReturnScope {
        public ArrayList r_field_list;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "object_type_definition"
    // src/org/plsql/PLSQL2.g:274:1: object_type_definition returns [ ArrayList r_field_list ] : OBJECT LPAREN orecord1= record_field_declaration ( COMMA orecord2= record_field_declaration )* RPAREN ;
    public final PLSQL2Parser.object_type_definition_return object_type_definition() throws RecognitionException {
        PLSQL2Parser.object_type_definition_return retval = new PLSQL2Parser.object_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OBJECT96=null;
        Token LPAREN97=null;
        Token COMMA98=null;
        Token RPAREN99=null;
        PLSQL2Parser.record_field_declaration_return orecord1 = null;

        PLSQL2Parser.record_field_declaration_return orecord2 = null;


        Object OBJECT96_tree=null;
        Object LPAREN97_tree=null;
        Object COMMA98_tree=null;
        Object RPAREN99_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:274:58: ( OBJECT LPAREN orecord1= record_field_declaration ( COMMA orecord2= record_field_declaration )* RPAREN )
            // src/org/plsql/PLSQL2.g:275:2: OBJECT LPAREN orecord1= record_field_declaration ( COMMA orecord2= record_field_declaration )* RPAREN
            {
            root_0 = (Object)adaptor.nil();


            		retval.r_field_list = new ArrayList();
            	
            OBJECT96=(Token)match(input,OBJECT,FOLLOW_OBJECT_in_object_type_definition1315); 
            OBJECT96_tree = (Object)adaptor.create(OBJECT96);
            adaptor.addChild(root_0, OBJECT96_tree);

            LPAREN97=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_object_type_definition1317); 
            LPAREN97_tree = (Object)adaptor.create(LPAREN97);
            adaptor.addChild(root_0, LPAREN97_tree);

            pushFollow(FOLLOW_record_field_declaration_in_object_type_definition1321);
            orecord1=record_field_declaration();

            state._fsp--;

            adaptor.addChild(root_0, orecord1.getTree());

                    retval.r_field_list.add((orecord1!=null?orecord1.r_field:null));
                
            // src/org/plsql/PLSQL2.g:282:5: ( COMMA orecord2= record_field_declaration )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:282:7: COMMA orecord2= record_field_declaration
            	    {
            	    COMMA98=(Token)match(input,COMMA,FOLLOW_COMMA_in_object_type_definition1336); 
            	    COMMA98_tree = (Object)adaptor.create(COMMA98);
            	    adaptor.addChild(root_0, COMMA98_tree);

            	    pushFollow(FOLLOW_record_field_declaration_in_object_type_definition1340);
            	    orecord2=record_field_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, orecord2.getTree());

            	            	retval.r_field_list.add((orecord2!=null?orecord2.r_field:null));
            	        	

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            RPAREN99=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_object_type_definition1360); 
            RPAREN99_tree = (Object)adaptor.create(RPAREN99);
            adaptor.addChild(root_0, RPAREN99_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "object_type_definition"

    public static class collection_type_definition_return extends ParserRuleReturnScope {
        public HashMap r_collectionType;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collection_type_definition"
    // src/org/plsql/PLSQL2.g:289:1: collection_type_definition returns [HashMap r_collectionType] : ( varray_type_definition | ( nested_table_type_definition ) ) ;
    public final PLSQL2Parser.collection_type_definition_return collection_type_definition() throws RecognitionException {
        PLSQL2Parser.collection_type_definition_return retval = new PLSQL2Parser.collection_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQL2Parser.varray_type_definition_return varray_type_definition100 = null;

        PLSQL2Parser.nested_table_type_definition_return nested_table_type_definition101 = null;



        try {
            // src/org/plsql/PLSQL2.g:289:62: ( ( varray_type_definition | ( nested_table_type_definition ) ) )
            // src/org/plsql/PLSQL2.g:290:2: ( varray_type_definition | ( nested_table_type_definition ) )
            {
            root_0 = (Object)adaptor.nil();


            		retval.r_collectionType = new HashMap();
            	
            // src/org/plsql/PLSQL2.g:292:3: ( varray_type_definition | ( nested_table_type_definition ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==VARYING||LA27_0==VARRAY) ) {
                alt27=1;
            }
            else if ( (LA27_0==TABLE) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:293:2: varray_type_definition
                    {
                    pushFollow(FOLLOW_varray_type_definition_in_collection_type_definition1388);
                    varray_type_definition100=varray_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, varray_type_definition100.getTree());

                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:294:4: ( nested_table_type_definition )
                    {
                    // src/org/plsql/PLSQL2.g:294:4: ( nested_table_type_definition )
                    // src/org/plsql/PLSQL2.g:294:5: nested_table_type_definition
                    {
                    pushFollow(FOLLOW_nested_table_type_definition_in_collection_type_definition1394);
                    nested_table_type_definition101=nested_table_type_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, nested_table_type_definition101.getTree());

                    		
                    		retval.r_collectionType.putAll((nested_table_type_definition101!=null?nested_table_type_definition101.table_data_type:null));
                    	

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "collection_type_definition"

    public static class varray_type_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varray_type_definition"
    // src/org/plsql/PLSQL2.g:301:1: varray_type_definition : ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )? ;
    public final PLSQL2Parser.varray_type_definition_return varray_type_definition() throws RecognitionException {
        PLSQL2Parser.varray_type_definition_return retval = new PLSQL2Parser.varray_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VARYING102=null;
        Token ARRAY103=null;
        Token VARRAY104=null;
        Token LPAREN105=null;
        Token RPAREN107=null;
        Token NOT110=null;
        Token NULL111=null;
        PLSQL2Parser.numeric_literal_return numeric_literal106 = null;

        PLSQL2Parser.kOF_return kOF108 = null;

        PLSQL2Parser.datatype_return datatype109 = null;


        Object VARYING102_tree=null;
        Object ARRAY103_tree=null;
        Object VARRAY104_tree=null;
        Object LPAREN105_tree=null;
        Object RPAREN107_tree=null;
        Object NOT110_tree=null;
        Object NULL111_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:302:2: ( ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )? )
            // src/org/plsql/PLSQL2.g:302:4: ( VARYING ( ARRAY )? | VARRAY ) LPAREN numeric_literal RPAREN kOF datatype ( NOT NULL )?
            {
            root_0 = (Object)adaptor.nil();

            // src/org/plsql/PLSQL2.g:302:4: ( VARYING ( ARRAY )? | VARRAY )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==VARYING) ) {
                alt29=1;
            }
            else if ( (LA29_0==VARRAY) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:302:6: VARYING ( ARRAY )?
                    {
                    VARYING102=(Token)match(input,VARYING,FOLLOW_VARYING_in_varray_type_definition1412); 
                    VARYING102_tree = (Object)adaptor.create(VARYING102);
                    adaptor.addChild(root_0, VARYING102_tree);

                    // src/org/plsql/PLSQL2.g:302:14: ( ARRAY )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==ARRAY) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:302:14: ARRAY
                            {
                            ARRAY103=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_varray_type_definition1414); 
                            ARRAY103_tree = (Object)adaptor.create(ARRAY103);
                            adaptor.addChild(root_0, ARRAY103_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:302:23: VARRAY
                    {
                    VARRAY104=(Token)match(input,VARRAY,FOLLOW_VARRAY_in_varray_type_definition1419); 
                    VARRAY104_tree = (Object)adaptor.create(VARRAY104);
                    adaptor.addChild(root_0, VARRAY104_tree);


                    }
                    break;

            }

            LPAREN105=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_varray_type_definition1423); 
            LPAREN105_tree = (Object)adaptor.create(LPAREN105);
            adaptor.addChild(root_0, LPAREN105_tree);

            pushFollow(FOLLOW_numeric_literal_in_varray_type_definition1425);
            numeric_literal106=numeric_literal();

            state._fsp--;

            adaptor.addChild(root_0, numeric_literal106.getTree());
            RPAREN107=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_varray_type_definition1427); 
            RPAREN107_tree = (Object)adaptor.create(RPAREN107);
            adaptor.addChild(root_0, RPAREN107_tree);

            pushFollow(FOLLOW_kOF_in_varray_type_definition1429);
            kOF108=kOF();

            state._fsp--;

            adaptor.addChild(root_0, kOF108.getTree());
            pushFollow(FOLLOW_datatype_in_varray_type_definition1431);
            datatype109=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype109.getTree());
            // src/org/plsql/PLSQL2.g:302:75: ( NOT NULL )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==NOT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:302:77: NOT NULL
                    {
                    NOT110=(Token)match(input,NOT,FOLLOW_NOT_in_varray_type_definition1435); 
                    NOT110_tree = (Object)adaptor.create(NOT110);
                    adaptor.addChild(root_0, NOT110_tree);

                    NULL111=(Token)match(input,NULL,FOLLOW_NULL_in_varray_type_definition1437); 
                    NULL111_tree = (Object)adaptor.create(NULL111);
                    adaptor.addChild(root_0, NULL111_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varray_type_definition"

    public static class nested_table_type_definition_return extends ParserRuleReturnScope {
        public HashMap table_data_type;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nested_table_type_definition"
    // src/org/plsql/PLSQL2.g:305:1: nested_table_type_definition returns [HashMap table_data_type] : TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )? ;
    public final PLSQL2Parser.nested_table_type_definition_return nested_table_type_definition() throws RecognitionException {
        PLSQL2Parser.nested_table_type_definition_return retval = new PLSQL2Parser.nested_table_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TABLE112=null;
        Token NOT115=null;
        Token NULL116=null;
        Token INDEX117=null;
        Token BY118=null;
        PLSQL2Parser.kOF_return kOF113 = null;

        PLSQL2Parser.datatype_return datatype114 = null;

        PLSQL2Parser.associative_index_type_return associative_index_type119 = null;


        Object TABLE112_tree=null;
        Object NOT115_tree=null;
        Object NULL116_tree=null;
        Object INDEX117_tree=null;
        Object BY118_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:305:63: ( TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )? )
            // src/org/plsql/PLSQL2.g:306:5: TABLE kOF datatype ( NOT NULL )? ( INDEX BY associative_index_type )?
            {
            root_0 = (Object)adaptor.nil();


                 retval.table_data_type = new HashMap();
                
            TABLE112=(Token)match(input,TABLE,FOLLOW_TABLE_in_nested_table_type_definition1461); 
            TABLE112_tree = (Object)adaptor.create(TABLE112);
            adaptor.addChild(root_0, TABLE112_tree);

            pushFollow(FOLLOW_kOF_in_nested_table_type_definition1463);
            kOF113=kOF();

            state._fsp--;

            adaptor.addChild(root_0, kOF113.getTree());
            pushFollow(FOLLOW_datatype_in_nested_table_type_definition1465);
            datatype114=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype114.getTree());

            		retval.table_data_type.put("dataType",(datatype114!=null?input.toString(datatype114.start,datatype114.stop):null));
            	
            // src/org/plsql/PLSQL2.g:313:3: ( NOT NULL )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==NOT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:313:5: NOT NULL
                    {
                    NOT115=(Token)match(input,NOT,FOLLOW_NOT_in_nested_table_type_definition1474); 
                    NOT115_tree = (Object)adaptor.create(NOT115);
                    adaptor.addChild(root_0, NOT115_tree);

                    NULL116=(Token)match(input,NULL,FOLLOW_NULL_in_nested_table_type_definition1476); 
                    NULL116_tree = (Object)adaptor.create(NULL116);
                    adaptor.addChild(root_0, NULL116_tree);


                    }
                    break;

            }

            // src/org/plsql/PLSQL2.g:313:17: ( INDEX BY associative_index_type )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==INDEX) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:313:19: INDEX BY associative_index_type
                    {
                    INDEX117=(Token)match(input,INDEX,FOLLOW_INDEX_in_nested_table_type_definition1483); 
                    INDEX117_tree = (Object)adaptor.create(INDEX117);
                    adaptor.addChild(root_0, INDEX117_tree);

                    BY118=(Token)match(input,BY,FOLLOW_BY_in_nested_table_type_definition1485); 
                    BY118_tree = (Object)adaptor.create(BY118);
                    adaptor.addChild(root_0, BY118_tree);

                    pushFollow(FOLLOW_associative_index_type_in_nested_table_type_definition1487);
                    associative_index_type119=associative_index_type();

                    state._fsp--;

                    adaptor.addChild(root_0, associative_index_type119.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nested_table_type_definition"

    public static class associative_index_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "associative_index_type"
    // src/org/plsql/PLSQL2.g:316:1: associative_index_type : datatype ;
    public final PLSQL2Parser.associative_index_type_return associative_index_type() throws RecognitionException {
        PLSQL2Parser.associative_index_type_return retval = new PLSQL2Parser.associative_index_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQL2Parser.datatype_return datatype120 = null;



        try {
            // src/org/plsql/PLSQL2.g:317:2: ( datatype )
            // src/org/plsql/PLSQL2.g:317:4: datatype
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_datatype_in_associative_index_type1501);
            datatype120=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype120.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "associative_index_type"

    public static class ref_cursor_type_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ref_cursor_type_definition"
    // src/org/plsql/PLSQL2.g:320:1: ref_cursor_type_definition : REF CURSOR ( RETURN datatype )? ;
    public final PLSQL2Parser.ref_cursor_type_definition_return ref_cursor_type_definition() throws RecognitionException {
        PLSQL2Parser.ref_cursor_type_definition_return retval = new PLSQL2Parser.ref_cursor_type_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REF121=null;
        Token CURSOR122=null;
        Token RETURN123=null;
        PLSQL2Parser.datatype_return datatype124 = null;


        Object REF121_tree=null;
        Object CURSOR122_tree=null;
        Object RETURN123_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:321:2: ( REF CURSOR ( RETURN datatype )? )
            // src/org/plsql/PLSQL2.g:321:4: REF CURSOR ( RETURN datatype )?
            {
            root_0 = (Object)adaptor.nil();

            REF121=(Token)match(input,REF,FOLLOW_REF_in_ref_cursor_type_definition1512); 
            REF121_tree = (Object)adaptor.create(REF121);
            adaptor.addChild(root_0, REF121_tree);

            CURSOR122=(Token)match(input,CURSOR,FOLLOW_CURSOR_in_ref_cursor_type_definition1514); 
            CURSOR122_tree = (Object)adaptor.create(CURSOR122);
            adaptor.addChild(root_0, CURSOR122_tree);

            // src/org/plsql/PLSQL2.g:321:15: ( RETURN datatype )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RETURN) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:321:17: RETURN datatype
                    {
                    RETURN123=(Token)match(input,RETURN,FOLLOW_RETURN_in_ref_cursor_type_definition1518); 
                    RETURN123_tree = (Object)adaptor.create(RETURN123);
                    adaptor.addChild(root_0, RETURN123_tree);

                    pushFollow(FOLLOW_datatype_in_ref_cursor_type_definition1520);
                    datatype124=datatype();

                    state._fsp--;

                    adaptor.addChild(root_0, datatype124.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ref_cursor_type_definition"

    public static class datatype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datatype"
    // src/org/plsql/PLSQL2.g:324:1: datatype : ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )? ;
    public final PLSQL2Parser.datatype_return datatype() throws RecognitionException {
        PLSQL2Parser.datatype_return retval = new PLSQL2Parser.datatype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REF125=null;
        Token ID126=null;
        Token DOT127=null;
        Token ID128=null;
        Token LPAREN129=null;
        Token COMMA131=null;
        Token RPAREN133=null;
        Token PERCENT134=null;
        Token ROWTYPE136=null;
        PLSQL2Parser.numeric_literal_return numeric_literal130 = null;

        PLSQL2Parser.numeric_literal_return numeric_literal132 = null;

        PLSQL2Parser.kTYPE_return kTYPE135 = null;


        Object REF125_tree=null;
        Object ID126_tree=null;
        Object DOT127_tree=null;
        Object ID128_tree=null;
        Object LPAREN129_tree=null;
        Object COMMA131_tree=null;
        Object RPAREN133_tree=null;
        Object PERCENT134_tree=null;
        Object ROWTYPE136_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:325:5: ( ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )? )
            // src/org/plsql/PLSQL2.g:325:7: ( REF )? ID ( DOT ID )? ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )?
            {
            root_0 = (Object)adaptor.nil();

            // src/org/plsql/PLSQL2.g:325:7: ( REF )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==REF) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:325:9: REF
                    {
                    REF125=(Token)match(input,REF,FOLLOW_REF_in_datatype1539); 
                    REF125_tree = (Object)adaptor.create(REF125);
                    adaptor.addChild(root_0, REF125_tree);


                    }
                    break;

            }

            ID126=(Token)match(input,ID,FOLLOW_ID_in_datatype1544); 
            ID126_tree = (Object)adaptor.create(ID126);
            adaptor.addChild(root_0, ID126_tree);

            // src/org/plsql/PLSQL2.g:325:19: ( DOT ID )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==DOT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:325:21: DOT ID
                    {
                    DOT127=(Token)match(input,DOT,FOLLOW_DOT_in_datatype1548); 
                    DOT127_tree = (Object)adaptor.create(DOT127);
                    adaptor.addChild(root_0, DOT127_tree);

                    ID128=(Token)match(input,ID,FOLLOW_ID_in_datatype1550); 
                    ID128_tree = (Object)adaptor.create(ID128);
                    adaptor.addChild(root_0, ID128_tree);


                    }
                    break;

            }

            // src/org/plsql/PLSQL2.g:325:31: ( LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN | PERCENT ( kTYPE | ROWTYPE ) )?
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==LPAREN) ) {
                alt38=1;
            }
            else if ( (LA38_0==PERCENT) ) {
                alt38=2;
            }
            switch (alt38) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:325:33: LPAREN numeric_literal ( COMMA numeric_literal )* RPAREN
                    {
                    LPAREN129=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_datatype1557); 
                    LPAREN129_tree = (Object)adaptor.create(LPAREN129);
                    adaptor.addChild(root_0, LPAREN129_tree);

                    pushFollow(FOLLOW_numeric_literal_in_datatype1559);
                    numeric_literal130=numeric_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_literal130.getTree());
                    // src/org/plsql/PLSQL2.g:325:56: ( COMMA numeric_literal )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==COMMA) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // src/org/plsql/PLSQL2.g:325:58: COMMA numeric_literal
                    	    {
                    	    COMMA131=(Token)match(input,COMMA,FOLLOW_COMMA_in_datatype1563); 
                    	    COMMA131_tree = (Object)adaptor.create(COMMA131);
                    	    adaptor.addChild(root_0, COMMA131_tree);

                    	    pushFollow(FOLLOW_numeric_literal_in_datatype1565);
                    	    numeric_literal132=numeric_literal();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, numeric_literal132.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    RPAREN133=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_datatype1570); 
                    RPAREN133_tree = (Object)adaptor.create(RPAREN133);
                    adaptor.addChild(root_0, RPAREN133_tree);


                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:325:92: PERCENT ( kTYPE | ROWTYPE )
                    {
                    PERCENT134=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_datatype1574); 
                    PERCENT134_tree = (Object)adaptor.create(PERCENT134);
                    adaptor.addChild(root_0, PERCENT134_tree);

                    // src/org/plsql/PLSQL2.g:325:100: ( kTYPE | ROWTYPE )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==ID) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==ROWTYPE) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:325:102: kTYPE
                            {
                            pushFollow(FOLLOW_kTYPE_in_datatype1578);
                            kTYPE135=kTYPE();

                            state._fsp--;

                            adaptor.addChild(root_0, kTYPE135.getTree());

                            }
                            break;
                        case 2 :
                            // src/org/plsql/PLSQL2.g:325:110: ROWTYPE
                            {
                            ROWTYPE136=(Token)match(input,ROWTYPE,FOLLOW_ROWTYPE_in_datatype1582); 
                            ROWTYPE136_tree = (Object)adaptor.create(ROWTYPE136);
                            adaptor.addChild(root_0, ROWTYPE136_tree);


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "datatype"

    public static class function_declaration_or_definition_return extends ParserRuleReturnScope {
        public String construct;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_declaration_or_definition"
    // src/org/plsql/PLSQL2.g:328:1: function_declaration_or_definition returns [String construct] : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( ( IS | AS ) ( declare_section )? body )? ;
    public final PLSQL2Parser.function_declaration_or_definition_return function_declaration_or_definition() throws RecognitionException {
        PLSQL2Parser.function_declaration_or_definition_return retval = new PLSQL2Parser.function_declaration_or_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set138=null;
        Token set139=null;
        PLSQL2Parser.function_heading_return function_heading137 = null;

        PLSQL2Parser.declare_section_return declare_section140 = null;

        PLSQL2Parser.body_return body141 = null;


        Object set138_tree=null;
        Object set139_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:328:63: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( ( IS | AS ) ( declare_section )? body )? )
            // src/org/plsql/PLSQL2.g:329:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( ( IS | AS ) ( declare_section )? body )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_function_heading_in_function_declaration_or_definition1612);
            function_heading137=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading137.getTree());
            // src/org/plsql/PLSQL2.g:330:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=DETERMINISTIC && LA39_0<=RESULT_CACHE)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:
            	    {
            	    set138=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DETERMINISTIC && input.LA(1)<=RESULT_CACHE) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set138));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // src/org/plsql/PLSQL2.g:331:9: ( ( IS | AS ) ( declare_section )? body )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==IS||LA41_0==AS) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:331:11: ( IS | AS ) ( declare_section )? body
                    {
                    set139=(Token)input.LT(1);
                    if ( input.LA(1)==IS||input.LA(1)==AS ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set139));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // src/org/plsql/PLSQL2.g:331:23: ( declare_section )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=PROCEDURE && LA40_0<=FUNCTION)||LA40_0==CURSOR||LA40_0==SUBTYPE||LA40_0==PRAGMA) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:331:23: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_function_declaration_or_definition1661);
                            declare_section140=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section140.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_function_declaration_or_definition1664);
                    body141=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body141.getTree());

                    }
                    break;

            }

            retval.construct = (declare_section140!=null?declare_section140.construct:null);

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_declaration_or_definition"

    public static class function_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_declaration"
    // src/org/plsql/PLSQL2.g:334:1: function_declaration : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ;
    public final PLSQL2Parser.function_declaration_return function_declaration() throws RecognitionException {
        PLSQL2Parser.function_declaration_return retval = new PLSQL2Parser.function_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set143=null;
        PLSQL2Parser.function_heading_return function_heading142 = null;


        Object set143_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:334:22: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* )
            // src/org/plsql/PLSQL2.g:335:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_function_heading_in_function_declaration1687);
            function_heading142=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading142.getTree());
            // src/org/plsql/PLSQL2.g:336:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=DETERMINISTIC && LA42_0<=RESULT_CACHE)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:
            	    {
            	    set143=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DETERMINISTIC && input.LA(1)<=RESULT_CACHE) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set143));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_declaration"

    public static class function_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_definition"
    // src/org/plsql/PLSQL2.g:339:1: function_definition : function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( IS | AS ) ( declare_section )? body ;
    public final PLSQL2Parser.function_definition_return function_definition() throws RecognitionException {
        PLSQL2Parser.function_definition_return retval = new PLSQL2Parser.function_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set145=null;
        Token set146=null;
        PLSQL2Parser.function_heading_return function_heading144 = null;

        PLSQL2Parser.declare_section_return declare_section147 = null;

        PLSQL2Parser.body_return body148 = null;


        Object set145_tree=null;
        Object set146_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:339:21: ( function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( IS | AS ) ( declare_section )? body )
            // src/org/plsql/PLSQL2.g:340:9: function_heading ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )* ( IS | AS ) ( declare_section )? body
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_function_heading_in_function_definition1735);
            function_heading144=function_heading();

            state._fsp--;

            adaptor.addChild(root_0, function_heading144.getTree());
            // src/org/plsql/PLSQL2.g:341:9: ( DETERMINISTIC | PIPELINED | PARALLEL_ENABLE | RESULT_CACHE )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=DETERMINISTIC && LA43_0<=RESULT_CACHE)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:
            	    {
            	    set145=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DETERMINISTIC && input.LA(1)<=RESULT_CACHE) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set145));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            set146=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set146));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // src/org/plsql/PLSQL2.g:342:21: ( declare_section )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=PROCEDURE && LA44_0<=FUNCTION)||LA44_0==CURSOR||LA44_0==SUBTYPE||LA44_0==PRAGMA) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:342:21: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_function_definition1782);
                    declare_section147=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section147.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_function_definition1785);
            body148=body();

            state._fsp--;

            adaptor.addChild(root_0, body148.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_definition"

    public static class procedure_declaration_or_definition_return extends ParserRuleReturnScope {
        public String construct;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_declaration_or_definition"
    // src/org/plsql/PLSQL2.g:345:1: procedure_declaration_or_definition returns [String construct ] : procedure_heading ( ( IS | AS ) ( declare_section )? body )? ;
    public final PLSQL2Parser.procedure_declaration_or_definition_return procedure_declaration_or_definition() throws RecognitionException {
        PLSQL2Parser.procedure_declaration_or_definition_return retval = new PLSQL2Parser.procedure_declaration_or_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set150=null;
        PLSQL2Parser.procedure_heading_return procedure_heading149 = null;

        PLSQL2Parser.declare_section_return declare_section151 = null;

        PLSQL2Parser.body_return body152 = null;


        Object set150_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:345:65: ( procedure_heading ( ( IS | AS ) ( declare_section )? body )? )
            // src/org/plsql/PLSQL2.g:346:9: procedure_heading ( ( IS | AS ) ( declare_section )? body )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_procedure_heading_in_procedure_declaration_or_definition1807);
            procedure_heading149=procedure_heading();

            state._fsp--;

            adaptor.addChild(root_0, procedure_heading149.getTree());
            // src/org/plsql/PLSQL2.g:347:9: ( ( IS | AS ) ( declare_section )? body )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==IS||LA46_0==AS) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:347:11: ( IS | AS ) ( declare_section )? body
                    {
                    set150=(Token)input.LT(1);
                    if ( input.LA(1)==IS||input.LA(1)==AS ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set150));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // src/org/plsql/PLSQL2.g:347:23: ( declare_section )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>=PROCEDURE && LA45_0<=FUNCTION)||LA45_0==CURSOR||LA45_0==SUBTYPE||LA45_0==PRAGMA) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:347:23: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_procedure_declaration_or_definition1829);
                            declare_section151=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section151.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_procedure_declaration_or_definition1832);
                    body152=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body152.getTree());

                    }
                    break;

            }

            retval.construct ="from  definition";System.out.println(retval.construct);

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedure_declaration_or_definition"

    public static class procedure_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_declaration"
    // src/org/plsql/PLSQL2.g:350:1: procedure_declaration : procedure_heading ;
    public final PLSQL2Parser.procedure_declaration_return procedure_declaration() throws RecognitionException {
        PLSQL2Parser.procedure_declaration_return retval = new PLSQL2Parser.procedure_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQL2Parser.procedure_heading_return procedure_heading153 = null;



        try {
            // src/org/plsql/PLSQL2.g:350:23: ( procedure_heading )
            // src/org/plsql/PLSQL2.g:351:2: procedure_heading
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_procedure_heading_in_procedure_declaration1852);
            procedure_heading153=procedure_heading();

            state._fsp--;

            adaptor.addChild(root_0, procedure_heading153.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedure_declaration"

    public static class procedure_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure_definition"
    // src/org/plsql/PLSQL2.g:354:1: procedure_definition : procedure_heading ( IS | AS ) ( declare_section )? body ;
    public final PLSQL2Parser.procedure_definition_return procedure_definition() throws RecognitionException {
        PLSQL2Parser.procedure_definition_return retval = new PLSQL2Parser.procedure_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set155=null;
        PLSQL2Parser.procedure_heading_return procedure_heading154 = null;

        PLSQL2Parser.declare_section_return declare_section156 = null;

        PLSQL2Parser.body_return body157 = null;


        Object set155_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:354:22: ( procedure_heading ( IS | AS ) ( declare_section )? body )
            // src/org/plsql/PLSQL2.g:355:2: procedure_heading ( IS | AS ) ( declare_section )? body
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_procedure_heading_in_procedure_definition1863);
            procedure_heading154=procedure_heading();

            state._fsp--;

            adaptor.addChild(root_0, procedure_heading154.getTree());
            set155=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set155));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // src/org/plsql/PLSQL2.g:356:14: ( declare_section )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=PROCEDURE && LA47_0<=FUNCTION)||LA47_0==CURSOR||LA47_0==SUBTYPE||LA47_0==PRAGMA) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:356:14: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_procedure_definition1876);
                    declare_section156=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section156.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_procedure_definition1879);
            body157=body();

            state._fsp--;

            adaptor.addChild(root_0, body157.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedure_definition"

    public static class body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "body"
    // src/org/plsql/PLSQL2.g:359:1: body : BEGIN statement SEMI ( statement SEMI | pragma SEMI )* ( EXCEPTION ( exception_handler )+ )? END ( ID )? ;
    public final PLSQL2Parser.body_return body() throws RecognitionException {
        PLSQL2Parser.body_return retval = new PLSQL2Parser.body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN158=null;
        Token SEMI160=null;
        Token SEMI162=null;
        Token SEMI164=null;
        Token EXCEPTION165=null;
        Token END167=null;
        Token ID168=null;
        PLSQL2Parser.statement_return statement159 = null;

        PLSQL2Parser.statement_return statement161 = null;

        PLSQL2Parser.pragma_return pragma163 = null;

        PLSQL2Parser.exception_handler_return exception_handler166 = null;


        Object BEGIN158_tree=null;
        Object SEMI160_tree=null;
        Object SEMI162_tree=null;
        Object SEMI164_tree=null;
        Object EXCEPTION165_tree=null;
        Object END167_tree=null;
        Object ID168_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:359:7: ( BEGIN statement SEMI ( statement SEMI | pragma SEMI )* ( EXCEPTION ( exception_handler )+ )? END ( ID )? )
            // src/org/plsql/PLSQL2.g:360:2: BEGIN statement SEMI ( statement SEMI | pragma SEMI )* ( EXCEPTION ( exception_handler )+ )? END ( ID )?
            {
            root_0 = (Object)adaptor.nil();

            BEGIN158=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_body1893); 
            BEGIN158_tree = (Object)adaptor.create(BEGIN158);
            adaptor.addChild(root_0, BEGIN158_tree);

            pushFollow(FOLLOW_statement_in_body1895);
            statement159=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement159.getTree());
            SEMI160=(Token)match(input,SEMI,FOLLOW_SEMI_in_body1897); 
            SEMI160_tree = (Object)adaptor.create(SEMI160);
            adaptor.addChild(root_0, SEMI160_tree);

            // src/org/plsql/PLSQL2.g:360:23: ( statement SEMI | pragma SEMI )*
            loop48:
            do {
                int alt48=3;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==ID||LA48_0==RETURN||LA48_0==NULL||LA48_0==BEGIN||(LA48_0>=COLON && LA48_0<=CASE)||(LA48_0>=CLOSE && LA48_0<=EXECUTE)||(LA48_0>=EXIT && LA48_0<=FETCH)||(LA48_0>=FOR && LA48_0<=FORALL)||(LA48_0>=GOTO && LA48_0<=IF)||LA48_0==OPEN||(LA48_0>=RAISE && LA48_0<=LLABEL)||(LA48_0>=COMMIT && LA48_0<=SET)||(LA48_0>=UPDATE && LA48_0<=WHILE)) ) {
                    alt48=1;
                }
                else if ( (LA48_0==PRAGMA) ) {
                    alt48=2;
                }


                switch (alt48) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:360:25: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_body1901);
            	    statement161=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement161.getTree());
            	    SEMI162=(Token)match(input,SEMI,FOLLOW_SEMI_in_body1903); 
            	    SEMI162_tree = (Object)adaptor.create(SEMI162);
            	    adaptor.addChild(root_0, SEMI162_tree);


            	    }
            	    break;
            	case 2 :
            	    // src/org/plsql/PLSQL2.g:360:42: pragma SEMI
            	    {
            	    pushFollow(FOLLOW_pragma_in_body1907);
            	    pragma163=pragma();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pragma163.getTree());
            	    SEMI164=(Token)match(input,SEMI,FOLLOW_SEMI_in_body1909); 
            	    SEMI164_tree = (Object)adaptor.create(SEMI164);
            	    adaptor.addChild(root_0, SEMI164_tree);


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // src/org/plsql/PLSQL2.g:361:2: ( EXCEPTION ( exception_handler )+ )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==EXCEPTION) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:361:4: EXCEPTION ( exception_handler )+
                    {
                    EXCEPTION165=(Token)match(input,EXCEPTION,FOLLOW_EXCEPTION_in_body1917); 
                    EXCEPTION165_tree = (Object)adaptor.create(EXCEPTION165);
                    adaptor.addChild(root_0, EXCEPTION165_tree);

                    // src/org/plsql/PLSQL2.g:361:14: ( exception_handler )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==WHEN) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // src/org/plsql/PLSQL2.g:361:14: exception_handler
                    	    {
                    	    pushFollow(FOLLOW_exception_handler_in_body1919);
                    	    exception_handler166=exception_handler();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, exception_handler166.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);


                    }
                    break;

            }

            END167=(Token)match(input,END,FOLLOW_END_in_body1925); 
            END167_tree = (Object)adaptor.create(END167);
            adaptor.addChild(root_0, END167_tree);

            // src/org/plsql/PLSQL2.g:361:40: ( ID )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:361:40: ID
                    {
                    ID168=(Token)match(input,ID,FOLLOW_ID_in_body1927); 
                    ID168_tree = (Object)adaptor.create(ID168);
                    adaptor.addChild(root_0, ID168_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "body"

    public static class exception_handler_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exception_handler"
    // src/org/plsql/PLSQL2.g:364:1: exception_handler : WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+ ;
    public final PLSQL2Parser.exception_handler_return exception_handler() throws RecognitionException {
        PLSQL2Parser.exception_handler_return retval = new PLSQL2Parser.exception_handler_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHEN169=null;
        Token OR171=null;
        Token OTHERS173=null;
        Token THEN174=null;
        Token SEMI176=null;
        PLSQL2Parser.qual_id_return qual_id170 = null;

        PLSQL2Parser.qual_id_return qual_id172 = null;

        PLSQL2Parser.statement_return statement175 = null;


        Object WHEN169_tree=null;
        Object OR171_tree=null;
        Object OTHERS173_tree=null;
        Object THEN174_tree=null;
        Object SEMI176_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:365:2: ( WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+ )
            // src/org/plsql/PLSQL2.g:365:4: WHEN ( qual_id ( OR qual_id )* | OTHERS ) THEN ( statement SEMI )+
            {
            root_0 = (Object)adaptor.nil();

            WHEN169=(Token)match(input,WHEN,FOLLOW_WHEN_in_exception_handler1939); 
            WHEN169_tree = (Object)adaptor.create(WHEN169);
            adaptor.addChild(root_0, WHEN169_tree);

            // src/org/plsql/PLSQL2.g:365:9: ( qual_id ( OR qual_id )* | OTHERS )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ID||LA53_0==COLON) ) {
                alt53=1;
            }
            else if ( (LA53_0==OTHERS) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:365:11: qual_id ( OR qual_id )*
                    {
                    pushFollow(FOLLOW_qual_id_in_exception_handler1943);
                    qual_id170=qual_id();

                    state._fsp--;

                    adaptor.addChild(root_0, qual_id170.getTree());
                    // src/org/plsql/PLSQL2.g:365:19: ( OR qual_id )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==OR) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // src/org/plsql/PLSQL2.g:365:21: OR qual_id
                    	    {
                    	    OR171=(Token)match(input,OR,FOLLOW_OR_in_exception_handler1947); 
                    	    OR171_tree = (Object)adaptor.create(OR171);
                    	    adaptor.addChild(root_0, OR171_tree);

                    	    pushFollow(FOLLOW_qual_id_in_exception_handler1949);
                    	    qual_id172=qual_id();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, qual_id172.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:365:37: OTHERS
                    {
                    OTHERS173=(Token)match(input,OTHERS,FOLLOW_OTHERS_in_exception_handler1956); 
                    OTHERS173_tree = (Object)adaptor.create(OTHERS173);
                    adaptor.addChild(root_0, OTHERS173_tree);


                    }
                    break;

            }

            THEN174=(Token)match(input,THEN,FOLLOW_THEN_in_exception_handler1962); 
            THEN174_tree = (Object)adaptor.create(THEN174);
            adaptor.addChild(root_0, THEN174_tree);

            // src/org/plsql/PLSQL2.g:366:8: ( statement SEMI )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==ID||LA54_0==RETURN||LA54_0==NULL||LA54_0==BEGIN||(LA54_0>=COLON && LA54_0<=CASE)||(LA54_0>=CLOSE && LA54_0<=EXECUTE)||(LA54_0>=EXIT && LA54_0<=FETCH)||(LA54_0>=FOR && LA54_0<=FORALL)||(LA54_0>=GOTO && LA54_0<=IF)||LA54_0==OPEN||(LA54_0>=RAISE && LA54_0<=LLABEL)||(LA54_0>=COMMIT && LA54_0<=SET)||(LA54_0>=UPDATE && LA54_0<=WHILE)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:366:10: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_exception_handler1966);
            	    statement175=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement175.getTree());
            	    SEMI176=(Token)match(input,SEMI,FOLLOW_SEMI_in_exception_handler1968); 
            	    SEMI176_tree = (Object)adaptor.create(SEMI176);
            	    adaptor.addChild(root_0, SEMI176_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exception_handler"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // src/org/plsql/PLSQL2.g:369:1: statement : ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement ) ;
    public final PLSQL2Parser.statement_return statement() throws RecognitionException {
        PLSQL2Parser.statement_return retval = new PLSQL2Parser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQL2Parser.label_return label177 = null;

        PLSQL2Parser.assign_or_call_statement_return assign_or_call_statement178 = null;

        PLSQL2Parser.case_statement_return case_statement179 = null;

        PLSQL2Parser.close_statement_return close_statement180 = null;

        PLSQL2Parser.continue_statement_return continue_statement181 = null;

        PLSQL2Parser.basic_loop_statement_return basic_loop_statement182 = null;

        PLSQL2Parser.execute_immediate_statement_return execute_immediate_statement183 = null;

        PLSQL2Parser.exit_statement_return exit_statement184 = null;

        PLSQL2Parser.fetch_statement_return fetch_statement185 = null;

        PLSQL2Parser.for_loop_statement_return for_loop_statement186 = null;

        PLSQL2Parser.forall_statement_return forall_statement187 = null;

        PLSQL2Parser.goto_statement_return goto_statement188 = null;

        PLSQL2Parser.if_statement_return if_statement189 = null;

        PLSQL2Parser.null_statement_return null_statement190 = null;

        PLSQL2Parser.open_statement_return open_statement191 = null;

        PLSQL2Parser.plsql_block_return plsql_block192 = null;

        PLSQL2Parser.raise_statement_return raise_statement193 = null;

        PLSQL2Parser.return_statement_return return_statement194 = null;

        PLSQL2Parser.sql_statement_return sql_statement195 = null;

        PLSQL2Parser.while_loop_statement_return while_loop_statement196 = null;



        try {
            // src/org/plsql/PLSQL2.g:369:11: ( ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement ) )
            // src/org/plsql/PLSQL2.g:370:5: ( label )* ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement )
            {
            root_0 = (Object)adaptor.nil();

            // src/org/plsql/PLSQL2.g:370:5: ( label )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==LLABEL) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:370:5: label
            	    {
            	    pushFollow(FOLLOW_label_in_statement1986);
            	    label177=label();

            	    state._fsp--;

            	    adaptor.addChild(root_0, label177.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // src/org/plsql/PLSQL2.g:371:5: ( assign_or_call_statement | case_statement | close_statement | continue_statement | basic_loop_statement | execute_immediate_statement | exit_statement | fetch_statement | for_loop_statement | forall_statement | goto_statement | if_statement | null_statement | open_statement | plsql_block | raise_statement | return_statement | sql_statement | while_loop_statement )
            int alt56=19;
            switch ( input.LA(1) ) {
            case ID:
            case COLON:
                {
                alt56=1;
                }
                break;
            case CASE:
                {
                alt56=2;
                }
                break;
            case CLOSE:
                {
                alt56=3;
                }
                break;
            case CONTINUE:
                {
                alt56=4;
                }
                break;
            case LOOP:
                {
                alt56=5;
                }
                break;
            case EXECUTE:
                {
                alt56=6;
                }
                break;
            case EXIT:
                {
                alt56=7;
                }
                break;
            case FETCH:
                {
                alt56=8;
                }
                break;
            case FOR:
                {
                alt56=9;
                }
                break;
            case FORALL:
                {
                alt56=10;
                }
                break;
            case GOTO:
                {
                alt56=11;
                }
                break;
            case IF:
                {
                alt56=12;
                }
                break;
            case NULL:
                {
                alt56=13;
                }
                break;
            case OPEN:
                {
                alt56=14;
                }
                break;
            case BEGIN:
            case DECLARE:
                {
                alt56=15;
                }
                break;
            case RAISE:
                {
                alt56=16;
                }
                break;
            case RETURN:
                {
                alt56=17;
                }
                break;
            case DELETE:
            case COMMIT:
            case INSERT:
            case LOCK:
            case ROLLBACK:
            case SAVEPOINT:
            case SELECT:
            case SET:
            case UPDATE:
                {
                alt56=18;
                }
                break;
            case WHILE:
                {
                alt56=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:371:7: assign_or_call_statement
                    {
                    pushFollow(FOLLOW_assign_or_call_statement_in_statement1995);
                    assign_or_call_statement178=assign_or_call_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, assign_or_call_statement178.getTree());

                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:372:7: case_statement
                    {
                    pushFollow(FOLLOW_case_statement_in_statement2003);
                    case_statement179=case_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, case_statement179.getTree());

                    }
                    break;
                case 3 :
                    // src/org/plsql/PLSQL2.g:373:7: close_statement
                    {
                    pushFollow(FOLLOW_close_statement_in_statement2011);
                    close_statement180=close_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, close_statement180.getTree());

                    }
                    break;
                case 4 :
                    // src/org/plsql/PLSQL2.g:374:7: continue_statement
                    {
                    pushFollow(FOLLOW_continue_statement_in_statement2019);
                    continue_statement181=continue_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, continue_statement181.getTree());

                    }
                    break;
                case 5 :
                    // src/org/plsql/PLSQL2.g:375:7: basic_loop_statement
                    {
                    pushFollow(FOLLOW_basic_loop_statement_in_statement2027);
                    basic_loop_statement182=basic_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, basic_loop_statement182.getTree());

                    }
                    break;
                case 6 :
                    // src/org/plsql/PLSQL2.g:376:7: execute_immediate_statement
                    {
                    pushFollow(FOLLOW_execute_immediate_statement_in_statement2035);
                    execute_immediate_statement183=execute_immediate_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, execute_immediate_statement183.getTree());

                    }
                    break;
                case 7 :
                    // src/org/plsql/PLSQL2.g:377:7: exit_statement
                    {
                    pushFollow(FOLLOW_exit_statement_in_statement2043);
                    exit_statement184=exit_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, exit_statement184.getTree());

                    }
                    break;
                case 8 :
                    // src/org/plsql/PLSQL2.g:378:7: fetch_statement
                    {
                    pushFollow(FOLLOW_fetch_statement_in_statement2051);
                    fetch_statement185=fetch_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, fetch_statement185.getTree());

                    }
                    break;
                case 9 :
                    // src/org/plsql/PLSQL2.g:379:7: for_loop_statement
                    {
                    pushFollow(FOLLOW_for_loop_statement_in_statement2059);
                    for_loop_statement186=for_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, for_loop_statement186.getTree());

                    }
                    break;
                case 10 :
                    // src/org/plsql/PLSQL2.g:380:7: forall_statement
                    {
                    pushFollow(FOLLOW_forall_statement_in_statement2067);
                    forall_statement187=forall_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, forall_statement187.getTree());

                    }
                    break;
                case 11 :
                    // src/org/plsql/PLSQL2.g:381:7: goto_statement
                    {
                    pushFollow(FOLLOW_goto_statement_in_statement2075);
                    goto_statement188=goto_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, goto_statement188.getTree());

                    }
                    break;
                case 12 :
                    // src/org/plsql/PLSQL2.g:382:7: if_statement
                    {
                    pushFollow(FOLLOW_if_statement_in_statement2083);
                    if_statement189=if_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, if_statement189.getTree());

                    }
                    break;
                case 13 :
                    // src/org/plsql/PLSQL2.g:383:7: null_statement
                    {
                    pushFollow(FOLLOW_null_statement_in_statement2091);
                    null_statement190=null_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, null_statement190.getTree());

                    }
                    break;
                case 14 :
                    // src/org/plsql/PLSQL2.g:384:7: open_statement
                    {
                    pushFollow(FOLLOW_open_statement_in_statement2099);
                    open_statement191=open_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, open_statement191.getTree());

                    }
                    break;
                case 15 :
                    // src/org/plsql/PLSQL2.g:385:7: plsql_block
                    {
                    pushFollow(FOLLOW_plsql_block_in_statement2107);
                    plsql_block192=plsql_block();

                    state._fsp--;

                    adaptor.addChild(root_0, plsql_block192.getTree());

                    }
                    break;
                case 16 :
                    // src/org/plsql/PLSQL2.g:386:7: raise_statement
                    {
                    pushFollow(FOLLOW_raise_statement_in_statement2115);
                    raise_statement193=raise_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, raise_statement193.getTree());

                    }
                    break;
                case 17 :
                    // src/org/plsql/PLSQL2.g:387:7: return_statement
                    {
                    pushFollow(FOLLOW_return_statement_in_statement2123);
                    return_statement194=return_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, return_statement194.getTree());

                    }
                    break;
                case 18 :
                    // src/org/plsql/PLSQL2.g:388:7: sql_statement
                    {
                    pushFollow(FOLLOW_sql_statement_in_statement2131);
                    sql_statement195=sql_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, sql_statement195.getTree());

                    }
                    break;
                case 19 :
                    // src/org/plsql/PLSQL2.g:389:7: while_loop_statement
                    {
                    pushFollow(FOLLOW_while_loop_statement_in_statement2139);
                    while_loop_statement196=while_loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, while_loop_statement196.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class lvalue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lvalue"
    // src/org/plsql/PLSQL2.g:393:1: lvalue : call ( DOT call )* ;
    public final PLSQL2Parser.lvalue_return lvalue() throws RecognitionException {
        PLSQL2Parser.lvalue_return retval = new PLSQL2Parser.lvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT198=null;
        PLSQL2Parser.call_return call197 = null;

        PLSQL2Parser.call_return call199 = null;


        Object DOT198_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:394:5: ( call ( DOT call )* )
            // src/org/plsql/PLSQL2.g:394:7: call ( DOT call )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_call_in_lvalue2162);
            call197=call();

            state._fsp--;

            adaptor.addChild(root_0, call197.getTree());
            // src/org/plsql/PLSQL2.g:394:12: ( DOT call )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==DOT) ) {
                    int LA57_1 = input.LA(2);

                    if ( (LA57_1==ID||LA57_1==COLON) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:394:14: DOT call
            	    {
            	    DOT198=(Token)match(input,DOT,FOLLOW_DOT_in_lvalue2166); 
            	    DOT198_tree = (Object)adaptor.create(DOT198);
            	    adaptor.addChild(root_0, DOT198_tree);

            	    pushFollow(FOLLOW_call_in_lvalue2168);
            	    call199=call();

            	    state._fsp--;

            	    adaptor.addChild(root_0, call199.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lvalue"

    public static class assign_or_call_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assign_or_call_statement"
    // src/org/plsql/PLSQL2.g:397:1: assign_or_call_statement : lvalue ( DOT delete_call | ASSIGN expression )? ;
    public final PLSQL2Parser.assign_or_call_statement_return assign_or_call_statement() throws RecognitionException {
        PLSQL2Parser.assign_or_call_statement_return retval = new PLSQL2Parser.assign_or_call_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT201=null;
        Token ASSIGN203=null;
        PLSQL2Parser.lvalue_return lvalue200 = null;

        PLSQL2Parser.delete_call_return delete_call202 = null;

        PLSQL2Parser.expression_return expression204 = null;


        Object DOT201_tree=null;
        Object ASSIGN203_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:398:5: ( lvalue ( DOT delete_call | ASSIGN expression )? )
            // src/org/plsql/PLSQL2.g:398:7: lvalue ( DOT delete_call | ASSIGN expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lvalue_in_assign_or_call_statement2188);
            lvalue200=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue200.getTree());
            // src/org/plsql/PLSQL2.g:398:14: ( DOT delete_call | ASSIGN expression )?
            int alt58=3;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==DOT) ) {
                alt58=1;
            }
            else if ( (LA58_0==ASSIGN) ) {
                alt58=2;
            }
            switch (alt58) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:398:16: DOT delete_call
                    {
                    DOT201=(Token)match(input,DOT,FOLLOW_DOT_in_assign_or_call_statement2192); 
                    DOT201_tree = (Object)adaptor.create(DOT201);
                    adaptor.addChild(root_0, DOT201_tree);

                    pushFollow(FOLLOW_delete_call_in_assign_or_call_statement2194);
                    delete_call202=delete_call();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_call202.getTree());

                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:398:34: ASSIGN expression
                    {
                    ASSIGN203=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign_or_call_statement2198); 
                    ASSIGN203_tree = (Object)adaptor.create(ASSIGN203);
                    adaptor.addChild(root_0, ASSIGN203_tree);

                    pushFollow(FOLLOW_expression_in_assign_or_call_statement2200);
                    expression204=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression204.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assign_or_call_statement"

    public static class call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // src/org/plsql/PLSQL2.g:401:1: call : ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )? ;
    public final PLSQL2Parser.call_return call() throws RecognitionException {
        PLSQL2Parser.call_return retval = new PLSQL2Parser.call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON205=null;
        Token ID206=null;
        Token LPAREN207=null;
        Token COMMA209=null;
        Token RPAREN211=null;
        PLSQL2Parser.parameter_return parameter208 = null;

        PLSQL2Parser.parameter_return parameter210 = null;


        Object COLON205_tree=null;
        Object ID206_tree=null;
        Object LPAREN207_tree=null;
        Object COMMA209_tree=null;
        Object RPAREN211_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:402:5: ( ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )? )
            // src/org/plsql/PLSQL2.g:402:7: ( COLON )? ID ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            // src/org/plsql/PLSQL2.g:402:7: ( COLON )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==COLON) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:402:7: COLON
                    {
                    COLON205=(Token)match(input,COLON,FOLLOW_COLON_in_call2220); 
                    COLON205_tree = (Object)adaptor.create(COLON205);
                    adaptor.addChild(root_0, COLON205_tree);


                    }
                    break;

            }

            ID206=(Token)match(input,ID,FOLLOW_ID_in_call2223); 
            ID206_tree = (Object)adaptor.create(ID206);
            adaptor.addChild(root_0, ID206_tree);

            // src/org/plsql/PLSQL2.g:402:17: ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==LPAREN) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:402:19: LPAREN ( parameter ( COMMA parameter )* )? RPAREN
                    {
                    LPAREN207=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_call2227); 
                    LPAREN207_tree = (Object)adaptor.create(LPAREN207);
                    adaptor.addChild(root_0, LPAREN207_tree);

                    // src/org/plsql/PLSQL2.g:402:26: ( parameter ( COMMA parameter )* )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==ID||LA61_0==LPAREN||(LA61_0>=NOT && LA61_0<=NULL)||LA61_0==COLON||(LA61_0>=MINUS && LA61_0<=PLUS)||LA61_0==SQL||(LA61_0>=INTEGER && LA61_0<=QUOTED_STRING)||(LA61_0>=INSERTING && LA61_0<=DELETING)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:402:28: parameter ( COMMA parameter )*
                            {
                            pushFollow(FOLLOW_parameter_in_call2231);
                            parameter208=parameter();

                            state._fsp--;

                            adaptor.addChild(root_0, parameter208.getTree());
                            // src/org/plsql/PLSQL2.g:402:38: ( COMMA parameter )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==COMMA) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // src/org/plsql/PLSQL2.g:402:40: COMMA parameter
                            	    {
                            	    COMMA209=(Token)match(input,COMMA,FOLLOW_COMMA_in_call2235); 
                            	    COMMA209_tree = (Object)adaptor.create(COMMA209);
                            	    adaptor.addChild(root_0, COMMA209_tree);

                            	    pushFollow(FOLLOW_parameter_in_call2237);
                            	    parameter210=parameter();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, parameter210.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop60;
                                }
                            } while (true);


                            }
                            break;

                    }

                    RPAREN211=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_call2245); 
                    RPAREN211_tree = (Object)adaptor.create(RPAREN211);
                    adaptor.addChild(root_0, RPAREN211_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class delete_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete_call"
    // src/org/plsql/PLSQL2.g:405:1: delete_call : DELETE ( LPAREN ( parameter )? RPAREN )? ;
    public final PLSQL2Parser.delete_call_return delete_call() throws RecognitionException {
        PLSQL2Parser.delete_call_return retval = new PLSQL2Parser.delete_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE212=null;
        Token LPAREN213=null;
        Token RPAREN215=null;
        PLSQL2Parser.parameter_return parameter214 = null;


        Object DELETE212_tree=null;
        Object LPAREN213_tree=null;
        Object RPAREN215_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:406:5: ( DELETE ( LPAREN ( parameter )? RPAREN )? )
            // src/org/plsql/PLSQL2.g:406:7: DELETE ( LPAREN ( parameter )? RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            DELETE212=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_call2265); 
            DELETE212_tree = (Object)adaptor.create(DELETE212);
            adaptor.addChild(root_0, DELETE212_tree);

            // src/org/plsql/PLSQL2.g:406:14: ( LPAREN ( parameter )? RPAREN )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==LPAREN) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:406:16: LPAREN ( parameter )? RPAREN
                    {
                    LPAREN213=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_delete_call2269); 
                    LPAREN213_tree = (Object)adaptor.create(LPAREN213);
                    adaptor.addChild(root_0, LPAREN213_tree);

                    // src/org/plsql/PLSQL2.g:406:23: ( parameter )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==ID||LA63_0==LPAREN||(LA63_0>=NOT && LA63_0<=NULL)||LA63_0==COLON||(LA63_0>=MINUS && LA63_0<=PLUS)||LA63_0==SQL||(LA63_0>=INTEGER && LA63_0<=QUOTED_STRING)||(LA63_0>=INSERTING && LA63_0<=DELETING)) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:406:23: parameter
                            {
                            pushFollow(FOLLOW_parameter_in_delete_call2271);
                            parameter214=parameter();

                            state._fsp--;

                            adaptor.addChild(root_0, parameter214.getTree());

                            }
                            break;

                    }

                    RPAREN215=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_delete_call2274); 
                    RPAREN215_tree = (Object)adaptor.create(RPAREN215);
                    adaptor.addChild(root_0, RPAREN215_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delete_call"

    public static class basic_loop_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "basic_loop_statement"
    // src/org/plsql/PLSQL2.g:409:1: basic_loop_statement : LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQL2Parser.basic_loop_statement_return basic_loop_statement() throws RecognitionException {
        PLSQL2Parser.basic_loop_statement_return retval = new PLSQL2Parser.basic_loop_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOOP216=null;
        Token SEMI218=null;
        Token END219=null;
        Token LOOP220=null;
        PLSQL2Parser.statement_return statement217 = null;

        PLSQL2Parser.label_name_return label_name221 = null;


        Object LOOP216_tree=null;
        Object SEMI218_tree=null;
        Object END219_tree=null;
        Object LOOP220_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:409:22: ( LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            // src/org/plsql/PLSQL2.g:410:9: LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            LOOP216=(Token)match(input,LOOP,FOLLOW_LOOP_in_basic_loop_statement2298); 
            LOOP216_tree = (Object)adaptor.create(LOOP216);
            adaptor.addChild(root_0, LOOP216_tree);

            // src/org/plsql/PLSQL2.g:410:14: ( statement SEMI )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==ID||LA65_0==RETURN||LA65_0==NULL||LA65_0==BEGIN||(LA65_0>=COLON && LA65_0<=CASE)||(LA65_0>=CLOSE && LA65_0<=EXECUTE)||(LA65_0>=EXIT && LA65_0<=FETCH)||(LA65_0>=FOR && LA65_0<=FORALL)||(LA65_0>=GOTO && LA65_0<=IF)||LA65_0==OPEN||(LA65_0>=RAISE && LA65_0<=LLABEL)||(LA65_0>=COMMIT && LA65_0<=SET)||(LA65_0>=UPDATE && LA65_0<=WHILE)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:410:16: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_basic_loop_statement2302);
            	    statement217=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement217.getTree());
            	    SEMI218=(Token)match(input,SEMI,FOLLOW_SEMI_in_basic_loop_statement2304); 
            	    SEMI218_tree = (Object)adaptor.create(SEMI218);
            	    adaptor.addChild(root_0, SEMI218_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
            } while (true);

            END219=(Token)match(input,END,FOLLOW_END_in_basic_loop_statement2309); 
            END219_tree = (Object)adaptor.create(END219);
            adaptor.addChild(root_0, END219_tree);

            LOOP220=(Token)match(input,LOOP,FOLLOW_LOOP_in_basic_loop_statement2311); 
            LOOP220_tree = (Object)adaptor.create(LOOP220);
            adaptor.addChild(root_0, LOOP220_tree);

            // src/org/plsql/PLSQL2.g:410:43: ( label_name )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==ID) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:410:43: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_basic_loop_statement2313);
                    label_name221=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name221.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "basic_loop_statement"

    public static class case_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "case_statement"
    // src/org/plsql/PLSQL2.g:413:1: case_statement : CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )? ;
    public final PLSQL2Parser.case_statement_return case_statement() throws RecognitionException {
        PLSQL2Parser.case_statement_return retval = new PLSQL2Parser.case_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CASE222=null;
        Token WHEN224=null;
        Token THEN226=null;
        Token SEMI228=null;
        Token ELSE229=null;
        Token SEMI231=null;
        Token END232=null;
        Token CASE233=null;
        PLSQL2Parser.expression_return expression223 = null;

        PLSQL2Parser.expression_return expression225 = null;

        PLSQL2Parser.statement_return statement227 = null;

        PLSQL2Parser.statement_return statement230 = null;

        PLSQL2Parser.label_name_return label_name234 = null;


        Object CASE222_tree=null;
        Object WHEN224_tree=null;
        Object THEN226_tree=null;
        Object SEMI228_tree=null;
        Object ELSE229_tree=null;
        Object SEMI231_tree=null;
        Object END232_tree=null;
        Object CASE233_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:413:16: ( CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )? )
            // src/org/plsql/PLSQL2.g:414:9: CASE ( expression )? ( WHEN expression THEN ( statement SEMI )+ )+ ( ELSE statement SEMI )? END CASE ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            CASE222=(Token)match(input,CASE,FOLLOW_CASE_in_case_statement2335); 
            CASE222_tree = (Object)adaptor.create(CASE222);
            adaptor.addChild(root_0, CASE222_tree);

            // src/org/plsql/PLSQL2.g:414:14: ( expression )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==ID||LA67_0==LPAREN||(LA67_0>=NOT && LA67_0<=NULL)||LA67_0==COLON||(LA67_0>=MINUS && LA67_0<=PLUS)||LA67_0==SQL||(LA67_0>=INTEGER && LA67_0<=QUOTED_STRING)||(LA67_0>=INSERTING && LA67_0<=DELETING)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:414:14: expression
                    {
                    pushFollow(FOLLOW_expression_in_case_statement2337);
                    expression223=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression223.getTree());

                    }
                    break;

            }

            // src/org/plsql/PLSQL2.g:415:9: ( WHEN expression THEN ( statement SEMI )+ )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==WHEN) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:415:11: WHEN expression THEN ( statement SEMI )+
            	    {
            	    WHEN224=(Token)match(input,WHEN,FOLLOW_WHEN_in_case_statement2350); 
            	    WHEN224_tree = (Object)adaptor.create(WHEN224);
            	    adaptor.addChild(root_0, WHEN224_tree);

            	    pushFollow(FOLLOW_expression_in_case_statement2352);
            	    expression225=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression225.getTree());
            	    THEN226=(Token)match(input,THEN,FOLLOW_THEN_in_case_statement2354); 
            	    THEN226_tree = (Object)adaptor.create(THEN226);
            	    adaptor.addChild(root_0, THEN226_tree);

            	    // src/org/plsql/PLSQL2.g:415:32: ( statement SEMI )+
            	    int cnt68=0;
            	    loop68:
            	    do {
            	        int alt68=2;
            	        int LA68_0 = input.LA(1);

            	        if ( (LA68_0==ID||LA68_0==RETURN||LA68_0==NULL||LA68_0==BEGIN||(LA68_0>=COLON && LA68_0<=CASE)||(LA68_0>=CLOSE && LA68_0<=EXECUTE)||(LA68_0>=EXIT && LA68_0<=FETCH)||(LA68_0>=FOR && LA68_0<=FORALL)||(LA68_0>=GOTO && LA68_0<=IF)||LA68_0==OPEN||(LA68_0>=RAISE && LA68_0<=LLABEL)||(LA68_0>=COMMIT && LA68_0<=SET)||(LA68_0>=UPDATE && LA68_0<=WHILE)) ) {
            	            alt68=1;
            	        }


            	        switch (alt68) {
            	    	case 1 :
            	    	    // src/org/plsql/PLSQL2.g:415:34: statement SEMI
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_case_statement2358);
            	    	    statement227=statement();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement227.getTree());
            	    	    SEMI228=(Token)match(input,SEMI,FOLLOW_SEMI_in_case_statement2360); 
            	    	    SEMI228_tree = (Object)adaptor.create(SEMI228);
            	    	    adaptor.addChild(root_0, SEMI228_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt68 >= 1 ) break loop68;
            	                EarlyExitException eee =
            	                    new EarlyExitException(68, input);
            	                throw eee;
            	        }
            	        cnt68++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
            } while (true);

            // src/org/plsql/PLSQL2.g:416:9: ( ELSE statement SEMI )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==ELSE) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:416:11: ELSE statement SEMI
                    {
                    ELSE229=(Token)match(input,ELSE,FOLLOW_ELSE_in_case_statement2378); 
                    ELSE229_tree = (Object)adaptor.create(ELSE229);
                    adaptor.addChild(root_0, ELSE229_tree);

                    pushFollow(FOLLOW_statement_in_case_statement2380);
                    statement230=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement230.getTree());
                    SEMI231=(Token)match(input,SEMI,FOLLOW_SEMI_in_case_statement2382); 
                    SEMI231_tree = (Object)adaptor.create(SEMI231);
                    adaptor.addChild(root_0, SEMI231_tree);


                    }
                    break;

            }

            END232=(Token)match(input,END,FOLLOW_END_in_case_statement2395); 
            END232_tree = (Object)adaptor.create(END232);
            adaptor.addChild(root_0, END232_tree);

            CASE233=(Token)match(input,CASE,FOLLOW_CASE_in_case_statement2397); 
            CASE233_tree = (Object)adaptor.create(CASE233);
            adaptor.addChild(root_0, CASE233_tree);

            // src/org/plsql/PLSQL2.g:417:18: ( label_name )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==ID) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:417:18: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_case_statement2399);
                    label_name234=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name234.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "case_statement"

    public static class close_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "close_statement"
    // src/org/plsql/PLSQL2.g:420:1: close_statement : CLOSE ID ( DOT ID )? ;
    public final PLSQL2Parser.close_statement_return close_statement() throws RecognitionException {
        PLSQL2Parser.close_statement_return retval = new PLSQL2Parser.close_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLOSE235=null;
        Token ID236=null;
        Token DOT237=null;
        Token ID238=null;

        Object CLOSE235_tree=null;
        Object ID236_tree=null;
        Object DOT237_tree=null;
        Object ID238_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:420:17: ( CLOSE ID ( DOT ID )? )
            // src/org/plsql/PLSQL2.g:421:9: CLOSE ID ( DOT ID )?
            {
            root_0 = (Object)adaptor.nil();

            CLOSE235=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_close_statement2421); 
            CLOSE235_tree = (Object)adaptor.create(CLOSE235);
            adaptor.addChild(root_0, CLOSE235_tree);

            ID236=(Token)match(input,ID,FOLLOW_ID_in_close_statement2423); 
            ID236_tree = (Object)adaptor.create(ID236);
            adaptor.addChild(root_0, ID236_tree);

            // src/org/plsql/PLSQL2.g:421:18: ( DOT ID )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==DOT) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:421:20: DOT ID
                    {
                    DOT237=(Token)match(input,DOT,FOLLOW_DOT_in_close_statement2427); 
                    DOT237_tree = (Object)adaptor.create(DOT237);
                    adaptor.addChild(root_0, DOT237_tree);

                    ID238=(Token)match(input,ID,FOLLOW_ID_in_close_statement2429); 
                    ID238_tree = (Object)adaptor.create(ID238);
                    adaptor.addChild(root_0, ID238_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "close_statement"

    public static class continue_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continue_statement"
    // src/org/plsql/PLSQL2.g:424:1: continue_statement : CONTINUE (lbl= ID )? ( WHEN expression )? ;
    public final PLSQL2Parser.continue_statement_return continue_statement() throws RecognitionException {
        PLSQL2Parser.continue_statement_return retval = new PLSQL2Parser.continue_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lbl=null;
        Token CONTINUE239=null;
        Token WHEN240=null;
        PLSQL2Parser.expression_return expression241 = null;


        Object lbl_tree=null;
        Object CONTINUE239_tree=null;
        Object WHEN240_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:424:20: ( CONTINUE (lbl= ID )? ( WHEN expression )? )
            // src/org/plsql/PLSQL2.g:425:9: CONTINUE (lbl= ID )? ( WHEN expression )?
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE239=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continue_statement2453); 
            CONTINUE239_tree = (Object)adaptor.create(CONTINUE239);
            adaptor.addChild(root_0, CONTINUE239_tree);

            // src/org/plsql/PLSQL2.g:425:18: (lbl= ID )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==ID) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:425:20: lbl= ID
                    {
                    lbl=(Token)match(input,ID,FOLLOW_ID_in_continue_statement2459); 
                    lbl_tree = (Object)adaptor.create(lbl);
                    adaptor.addChild(root_0, lbl_tree);


                    }
                    break;

            }

            // src/org/plsql/PLSQL2.g:425:30: ( WHEN expression )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==WHEN) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:425:32: WHEN expression
                    {
                    WHEN240=(Token)match(input,WHEN,FOLLOW_WHEN_in_continue_statement2466); 
                    WHEN240_tree = (Object)adaptor.create(WHEN240);
                    adaptor.addChild(root_0, WHEN240_tree);

                    pushFollow(FOLLOW_expression_in_continue_statement2468);
                    expression241=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression241.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "continue_statement"

    public static class execute_immediate_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "execute_immediate_statement"
    // src/org/plsql/PLSQL2.g:428:1: execute_immediate_statement : EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )? ;
    public final PLSQL2Parser.execute_immediate_statement_return execute_immediate_statement() throws RecognitionException {
        PLSQL2Parser.execute_immediate_statement_return retval = new PLSQL2Parser.execute_immediate_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXECUTE242=null;
        Token IMMEDIATE243=null;
        PLSQL2Parser.expression_return expression244 = null;

        PLSQL2Parser.into_clause_return into_clause245 = null;

        PLSQL2Parser.bulk_collect_into_clause_return bulk_collect_into_clause246 = null;

        PLSQL2Parser.using_clause_return using_clause247 = null;

        PLSQL2Parser.using_clause_return using_clause248 = null;

        PLSQL2Parser.dynamic_returning_clause_return dynamic_returning_clause249 = null;

        PLSQL2Parser.dynamic_returning_clause_return dynamic_returning_clause250 = null;


        Object EXECUTE242_tree=null;
        Object IMMEDIATE243_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:428:29: ( EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )? )
            // src/org/plsql/PLSQL2.g:429:9: EXECUTE IMMEDIATE expression ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )?
            {
            root_0 = (Object)adaptor.nil();

            EXECUTE242=(Token)match(input,EXECUTE,FOLLOW_EXECUTE_in_execute_immediate_statement2492); 
            EXECUTE242_tree = (Object)adaptor.create(EXECUTE242);
            adaptor.addChild(root_0, EXECUTE242_tree);

            IMMEDIATE243=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_execute_immediate_statement2494); 
            IMMEDIATE243_tree = (Object)adaptor.create(IMMEDIATE243);
            adaptor.addChild(root_0, IMMEDIATE243_tree);

            pushFollow(FOLLOW_expression_in_execute_immediate_statement2496);
            expression244=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression244.getTree());
            // src/org/plsql/PLSQL2.g:429:38: ( ( into_clause | bulk_collect_into_clause ) ( using_clause )? | using_clause ( dynamic_returning_clause )? | dynamic_returning_clause )?
            int alt78=4;
            switch ( input.LA(1) ) {
                case INTO:
                case BULK:
                    {
                    alt78=1;
                    }
                    break;
                case USING:
                    {
                    alt78=2;
                    }
                    break;
                case RETURN:
                case RETURNING:
                    {
                    alt78=3;
                    }
                    break;
            }

            switch (alt78) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:430:9: ( into_clause | bulk_collect_into_clause ) ( using_clause )?
                    {
                    // src/org/plsql/PLSQL2.g:430:9: ( into_clause | bulk_collect_into_clause )
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==INTO) ) {
                        alt75=1;
                    }
                    else if ( (LA75_0==BULK) ) {
                        alt75=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 0, input);

                        throw nvae;
                    }
                    switch (alt75) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:430:11: into_clause
                            {
                            pushFollow(FOLLOW_into_clause_in_execute_immediate_statement2510);
                            into_clause245=into_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, into_clause245.getTree());

                            }
                            break;
                        case 2 :
                            // src/org/plsql/PLSQL2.g:430:25: bulk_collect_into_clause
                            {
                            pushFollow(FOLLOW_bulk_collect_into_clause_in_execute_immediate_statement2514);
                            bulk_collect_into_clause246=bulk_collect_into_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, bulk_collect_into_clause246.getTree());

                            }
                            break;

                    }

                    // src/org/plsql/PLSQL2.g:430:51: ( using_clause )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==USING) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:430:51: using_clause
                            {
                            pushFollow(FOLLOW_using_clause_in_execute_immediate_statement2517);
                            using_clause247=using_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, using_clause247.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:431:11: using_clause ( dynamic_returning_clause )?
                    {
                    pushFollow(FOLLOW_using_clause_in_execute_immediate_statement2530);
                    using_clause248=using_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, using_clause248.getTree());
                    // src/org/plsql/PLSQL2.g:431:24: ( dynamic_returning_clause )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==RETURN||LA77_0==RETURNING) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:431:24: dynamic_returning_clause
                            {
                            pushFollow(FOLLOW_dynamic_returning_clause_in_execute_immediate_statement2532);
                            dynamic_returning_clause249=dynamic_returning_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, dynamic_returning_clause249.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // src/org/plsql/PLSQL2.g:432:11: dynamic_returning_clause
                    {
                    pushFollow(FOLLOW_dynamic_returning_clause_in_execute_immediate_statement2545);
                    dynamic_returning_clause250=dynamic_returning_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, dynamic_returning_clause250.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "execute_immediate_statement"

    public static class exit_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exit_statement"
    // src/org/plsql/PLSQL2.g:436:1: exit_statement : EXIT (lbl= ID )? ( WHEN expression )? ;
    public final PLSQL2Parser.exit_statement_return exit_statement() throws RecognitionException {
        PLSQL2Parser.exit_statement_return retval = new PLSQL2Parser.exit_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lbl=null;
        Token EXIT251=null;
        Token WHEN252=null;
        PLSQL2Parser.expression_return expression253 = null;


        Object lbl_tree=null;
        Object EXIT251_tree=null;
        Object WHEN252_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:436:16: ( EXIT (lbl= ID )? ( WHEN expression )? )
            // src/org/plsql/PLSQL2.g:437:9: EXIT (lbl= ID )? ( WHEN expression )?
            {
            root_0 = (Object)adaptor.nil();

            EXIT251=(Token)match(input,EXIT,FOLLOW_EXIT_in_exit_statement2577); 
            EXIT251_tree = (Object)adaptor.create(EXIT251);
            adaptor.addChild(root_0, EXIT251_tree);

            // src/org/plsql/PLSQL2.g:437:14: (lbl= ID )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==ID) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:437:16: lbl= ID
                    {
                    lbl=(Token)match(input,ID,FOLLOW_ID_in_exit_statement2583); 
                    lbl_tree = (Object)adaptor.create(lbl);
                    adaptor.addChild(root_0, lbl_tree);


                    }
                    break;

            }

            // src/org/plsql/PLSQL2.g:437:26: ( WHEN expression )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==WHEN) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:437:28: WHEN expression
                    {
                    WHEN252=(Token)match(input,WHEN,FOLLOW_WHEN_in_exit_statement2590); 
                    WHEN252_tree = (Object)adaptor.create(WHEN252);
                    adaptor.addChild(root_0, WHEN252_tree);

                    pushFollow(FOLLOW_expression_in_exit_statement2592);
                    expression253=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression253.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exit_statement"

    public static class fetch_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fetch_statement"
    // src/org/plsql/PLSQL2.g:440:1: fetch_statement : FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? ) ;
    public final PLSQL2Parser.fetch_statement_return fetch_statement() throws RecognitionException {
        PLSQL2Parser.fetch_statement_return retval = new PLSQL2Parser.fetch_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FETCH254=null;
        Token LIMIT258=null;
        PLSQL2Parser.qual_id_return qual_id255 = null;

        PLSQL2Parser.into_clause_return into_clause256 = null;

        PLSQL2Parser.bulk_collect_into_clause_return bulk_collect_into_clause257 = null;

        PLSQL2Parser.numeric_expression_return numeric_expression259 = null;


        Object FETCH254_tree=null;
        Object LIMIT258_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:440:17: ( FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? ) )
            // src/org/plsql/PLSQL2.g:441:9: FETCH qual_id ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? )
            {
            root_0 = (Object)adaptor.nil();

            FETCH254=(Token)match(input,FETCH,FOLLOW_FETCH_in_fetch_statement2616); 
            FETCH254_tree = (Object)adaptor.create(FETCH254);
            adaptor.addChild(root_0, FETCH254_tree);

            pushFollow(FOLLOW_qual_id_in_fetch_statement2618);
            qual_id255=qual_id();

            state._fsp--;

            adaptor.addChild(root_0, qual_id255.getTree());
            // src/org/plsql/PLSQL2.g:441:23: ( into_clause | bulk_collect_into_clause ( LIMIT numeric_expression )? )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==INTO) ) {
                alt82=1;
            }
            else if ( (LA82_0==BULK) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:441:25: into_clause
                    {
                    pushFollow(FOLLOW_into_clause_in_fetch_statement2622);
                    into_clause256=into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, into_clause256.getTree());

                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:441:39: bulk_collect_into_clause ( LIMIT numeric_expression )?
                    {
                    pushFollow(FOLLOW_bulk_collect_into_clause_in_fetch_statement2626);
                    bulk_collect_into_clause257=bulk_collect_into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, bulk_collect_into_clause257.getTree());
                    // src/org/plsql/PLSQL2.g:441:64: ( LIMIT numeric_expression )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==LIMIT) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:441:66: LIMIT numeric_expression
                            {
                            LIMIT258=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_fetch_statement2630); 
                            LIMIT258_tree = (Object)adaptor.create(LIMIT258);
                            adaptor.addChild(root_0, LIMIT258_tree);

                            pushFollow(FOLLOW_numeric_expression_in_fetch_statement2632);
                            numeric_expression259=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression259.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fetch_statement"

    public static class into_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "into_clause"
    // src/org/plsql/PLSQL2.g:444:1: into_clause : INTO lvalue ( COMMA lvalue )* ;
    public final PLSQL2Parser.into_clause_return into_clause() throws RecognitionException {
        PLSQL2Parser.into_clause_return retval = new PLSQL2Parser.into_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTO260=null;
        Token COMMA262=null;
        PLSQL2Parser.lvalue_return lvalue261 = null;

        PLSQL2Parser.lvalue_return lvalue263 = null;


        Object INTO260_tree=null;
        Object COMMA262_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:444:13: ( INTO lvalue ( COMMA lvalue )* )
            // src/org/plsql/PLSQL2.g:445:9: INTO lvalue ( COMMA lvalue )*
            {
            root_0 = (Object)adaptor.nil();

            INTO260=(Token)match(input,INTO,FOLLOW_INTO_in_into_clause2662); 
            INTO260_tree = (Object)adaptor.create(INTO260);
            adaptor.addChild(root_0, INTO260_tree);

            pushFollow(FOLLOW_lvalue_in_into_clause2664);
            lvalue261=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue261.getTree());
            // src/org/plsql/PLSQL2.g:445:21: ( COMMA lvalue )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==COMMA) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:445:23: COMMA lvalue
            	    {
            	    COMMA262=(Token)match(input,COMMA,FOLLOW_COMMA_in_into_clause2668); 
            	    COMMA262_tree = (Object)adaptor.create(COMMA262);
            	    adaptor.addChild(root_0, COMMA262_tree);

            	    pushFollow(FOLLOW_lvalue_in_into_clause2670);
            	    lvalue263=lvalue();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lvalue263.getTree());

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "into_clause"

    public static class bulk_collect_into_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bulk_collect_into_clause"
    // src/org/plsql/PLSQL2.g:448:1: bulk_collect_into_clause : BULK COLLECT INTO lvalue ( COMMA lvalue )* ;
    public final PLSQL2Parser.bulk_collect_into_clause_return bulk_collect_into_clause() throws RecognitionException {
        PLSQL2Parser.bulk_collect_into_clause_return retval = new PLSQL2Parser.bulk_collect_into_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BULK264=null;
        Token COLLECT265=null;
        Token INTO266=null;
        Token COMMA268=null;
        PLSQL2Parser.lvalue_return lvalue267 = null;

        PLSQL2Parser.lvalue_return lvalue269 = null;


        Object BULK264_tree=null;
        Object COLLECT265_tree=null;
        Object INTO266_tree=null;
        Object COMMA268_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:448:26: ( BULK COLLECT INTO lvalue ( COMMA lvalue )* )
            // src/org/plsql/PLSQL2.g:449:9: BULK COLLECT INTO lvalue ( COMMA lvalue )*
            {
            root_0 = (Object)adaptor.nil();

            BULK264=(Token)match(input,BULK,FOLLOW_BULK_in_bulk_collect_into_clause2698); 
            BULK264_tree = (Object)adaptor.create(BULK264);
            adaptor.addChild(root_0, BULK264_tree);

            COLLECT265=(Token)match(input,COLLECT,FOLLOW_COLLECT_in_bulk_collect_into_clause2700); 
            COLLECT265_tree = (Object)adaptor.create(COLLECT265);
            adaptor.addChild(root_0, COLLECT265_tree);

            INTO266=(Token)match(input,INTO,FOLLOW_INTO_in_bulk_collect_into_clause2702); 
            INTO266_tree = (Object)adaptor.create(INTO266);
            adaptor.addChild(root_0, INTO266_tree);

            pushFollow(FOLLOW_lvalue_in_bulk_collect_into_clause2704);
            lvalue267=lvalue();

            state._fsp--;

            adaptor.addChild(root_0, lvalue267.getTree());
            // src/org/plsql/PLSQL2.g:449:34: ( COMMA lvalue )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==COMMA) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:449:36: COMMA lvalue
            	    {
            	    COMMA268=(Token)match(input,COMMA,FOLLOW_COMMA_in_bulk_collect_into_clause2708); 
            	    COMMA268_tree = (Object)adaptor.create(COMMA268);
            	    adaptor.addChild(root_0, COMMA268_tree);

            	    pushFollow(FOLLOW_lvalue_in_bulk_collect_into_clause2710);
            	    lvalue269=lvalue();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lvalue269.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bulk_collect_into_clause"

    public static class using_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "using_clause"
    // src/org/plsql/PLSQL2.g:452:1: using_clause : USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )* ;
    public final PLSQL2Parser.using_clause_return using_clause() throws RecognitionException {
        PLSQL2Parser.using_clause_return retval = new PLSQL2Parser.using_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token USING270=null;
        Token COMMA273=null;
        PLSQL2Parser.param_modifiers_return param_modifiers271 = null;

        PLSQL2Parser.expression_return expression272 = null;

        PLSQL2Parser.param_modifiers_return param_modifiers274 = null;

        PLSQL2Parser.expression_return expression275 = null;


        Object USING270_tree=null;
        Object COMMA273_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:452:14: ( USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )* )
            // src/org/plsql/PLSQL2.g:453:9: USING ( param_modifiers )? expression ( COMMA ( param_modifiers )? expression )*
            {
            root_0 = (Object)adaptor.nil();

            USING270=(Token)match(input,USING,FOLLOW_USING_in_using_clause2734); 
            USING270_tree = (Object)adaptor.create(USING270);
            adaptor.addChild(root_0, USING270_tree);

            // src/org/plsql/PLSQL2.g:453:15: ( param_modifiers )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=IN && LA85_0<=OUT)) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:453:15: param_modifiers
                    {
                    pushFollow(FOLLOW_param_modifiers_in_using_clause2736);
                    param_modifiers271=param_modifiers();

                    state._fsp--;

                    adaptor.addChild(root_0, param_modifiers271.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_using_clause2739);
            expression272=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression272.getTree());
            // src/org/plsql/PLSQL2.g:453:43: ( COMMA ( param_modifiers )? expression )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==COMMA) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:453:45: COMMA ( param_modifiers )? expression
            	    {
            	    COMMA273=(Token)match(input,COMMA,FOLLOW_COMMA_in_using_clause2743); 
            	    COMMA273_tree = (Object)adaptor.create(COMMA273);
            	    adaptor.addChild(root_0, COMMA273_tree);

            	    // src/org/plsql/PLSQL2.g:453:51: ( param_modifiers )?
            	    int alt86=2;
            	    int LA86_0 = input.LA(1);

            	    if ( ((LA86_0>=IN && LA86_0<=OUT)) ) {
            	        alt86=1;
            	    }
            	    switch (alt86) {
            	        case 1 :
            	            // src/org/plsql/PLSQL2.g:453:51: param_modifiers
            	            {
            	            pushFollow(FOLLOW_param_modifiers_in_using_clause2745);
            	            param_modifiers274=param_modifiers();

            	            state._fsp--;

            	            adaptor.addChild(root_0, param_modifiers274.getTree());

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_expression_in_using_clause2748);
            	    expression275=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression275.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "using_clause"

    public static class param_modifiers_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param_modifiers"
    // src/org/plsql/PLSQL2.g:456:1: param_modifiers : ( IN ( OUT )? | OUT );
    public final PLSQL2Parser.param_modifiers_return param_modifiers() throws RecognitionException {
        PLSQL2Parser.param_modifiers_return retval = new PLSQL2Parser.param_modifiers_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN276=null;
        Token OUT277=null;
        Token OUT278=null;

        Object IN276_tree=null;
        Object OUT277_tree=null;
        Object OUT278_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:457:2: ( IN ( OUT )? | OUT )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==IN) ) {
                alt89=1;
            }
            else if ( (LA89_0==OUT) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:457:4: IN ( OUT )?
                    {
                    root_0 = (Object)adaptor.nil();

                    IN276=(Token)match(input,IN,FOLLOW_IN_in_param_modifiers2765); 
                    IN276_tree = (Object)adaptor.create(IN276);
                    adaptor.addChild(root_0, IN276_tree);

                    // src/org/plsql/PLSQL2.g:457:7: ( OUT )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==OUT) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:457:7: OUT
                            {
                            OUT277=(Token)match(input,OUT,FOLLOW_OUT_in_param_modifiers2767); 
                            OUT277_tree = (Object)adaptor.create(OUT277);
                            adaptor.addChild(root_0, OUT277_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:457:14: OUT
                    {
                    root_0 = (Object)adaptor.nil();

                    OUT278=(Token)match(input,OUT,FOLLOW_OUT_in_param_modifiers2772); 
                    OUT278_tree = (Object)adaptor.create(OUT278);
                    adaptor.addChild(root_0, OUT278_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "param_modifiers"

    public static class dynamic_returning_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dynamic_returning_clause"
    // src/org/plsql/PLSQL2.g:460:1: dynamic_returning_clause : ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause ) ;
    public final PLSQL2Parser.dynamic_returning_clause_return dynamic_returning_clause() throws RecognitionException {
        PLSQL2Parser.dynamic_returning_clause_return retval = new PLSQL2Parser.dynamic_returning_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set279=null;
        PLSQL2Parser.into_clause_return into_clause280 = null;

        PLSQL2Parser.bulk_collect_into_clause_return bulk_collect_into_clause281 = null;


        Object set279_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:460:26: ( ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause ) )
            // src/org/plsql/PLSQL2.g:461:9: ( RETURNING | RETURN ) ( into_clause | bulk_collect_into_clause )
            {
            root_0 = (Object)adaptor.nil();

            set279=(Token)input.LT(1);
            if ( input.LA(1)==RETURN||input.LA(1)==RETURNING ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set279));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // src/org/plsql/PLSQL2.g:461:32: ( into_clause | bulk_collect_into_clause )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==INTO) ) {
                alt90=1;
            }
            else if ( (LA90_0==BULK) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:461:34: into_clause
                    {
                    pushFollow(FOLLOW_into_clause_in_dynamic_returning_clause2802);
                    into_clause280=into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, into_clause280.getTree());

                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:461:48: bulk_collect_into_clause
                    {
                    pushFollow(FOLLOW_bulk_collect_into_clause_in_dynamic_returning_clause2806);
                    bulk_collect_into_clause281=bulk_collect_into_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, bulk_collect_into_clause281.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dynamic_returning_clause"

    public static class for_loop_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_loop_statement"
    // src/org/plsql/PLSQL2.g:464:1: for_loop_statement : FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQL2Parser.for_loop_statement_return for_loop_statement() throws RecognitionException {
        PLSQL2Parser.for_loop_statement_return retval = new PLSQL2Parser.for_loop_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR282=null;
        Token ID283=null;
        Token IN284=null;
        Token set285=null;
        Token LOOP286=null;
        Token SEMI288=null;
        Token END289=null;
        Token LOOP290=null;
        PLSQL2Parser.statement_return statement287 = null;

        PLSQL2Parser.label_name_return label_name291 = null;


        Object FOR282_tree=null;
        Object ID283_tree=null;
        Object IN284_tree=null;
        Object set285_tree=null;
        Object LOOP286_tree=null;
        Object SEMI288_tree=null;
        Object END289_tree=null;
        Object LOOP290_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:464:20: ( FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            // src/org/plsql/PLSQL2.g:465:9: FOR ID IN (~ ( LOOP ) )+ LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            FOR282=(Token)match(input,FOR,FOLLOW_FOR_in_for_loop_statement2829); 
            FOR282_tree = (Object)adaptor.create(FOR282);
            adaptor.addChild(root_0, FOR282_tree);

            ID283=(Token)match(input,ID,FOLLOW_ID_in_for_loop_statement2831); 
            ID283_tree = (Object)adaptor.create(ID283);
            adaptor.addChild(root_0, ID283_tree);

            IN284=(Token)match(input,IN,FOLLOW_IN_in_for_loop_statement2833); 
            IN284_tree = (Object)adaptor.create(IN284);
            adaptor.addChild(root_0, IN284_tree);

            // src/org/plsql/PLSQL2.g:465:19: (~ ( LOOP ) )+
            int cnt91=0;
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( ((LA91_0>=DIVIDE && LA91_0<=DELETE)||(LA91_0>=CASE && LA91_0<=ML_COMMENT)) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:465:21: ~ ( LOOP )
            	    {
            	    set285=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DIVIDE && input.LA(1)<=DELETE)||(input.LA(1)>=CASE && input.LA(1)<=ML_COMMENT) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set285));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt91 >= 1 ) break loop91;
                        EarlyExitException eee =
                            new EarlyExitException(91, input);
                        throw eee;
                }
                cnt91++;
            } while (true);

            LOOP286=(Token)match(input,LOOP,FOLLOW_LOOP_in_for_loop_statement2845); 
            LOOP286_tree = (Object)adaptor.create(LOOP286);
            adaptor.addChild(root_0, LOOP286_tree);

            // src/org/plsql/PLSQL2.g:465:37: ( statement SEMI )+
            int cnt92=0;
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==ID||LA92_0==RETURN||LA92_0==NULL||LA92_0==BEGIN||(LA92_0>=COLON && LA92_0<=CASE)||(LA92_0>=CLOSE && LA92_0<=EXECUTE)||(LA92_0>=EXIT && LA92_0<=FETCH)||(LA92_0>=FOR && LA92_0<=FORALL)||(LA92_0>=GOTO && LA92_0<=IF)||LA92_0==OPEN||(LA92_0>=RAISE && LA92_0<=LLABEL)||(LA92_0>=COMMIT && LA92_0<=SET)||(LA92_0>=UPDATE && LA92_0<=WHILE)) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:465:39: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_for_loop_statement2849);
            	    statement287=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement287.getTree());
            	    SEMI288=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_loop_statement2851); 
            	    SEMI288_tree = (Object)adaptor.create(SEMI288);
            	    adaptor.addChild(root_0, SEMI288_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt92 >= 1 ) break loop92;
                        EarlyExitException eee =
                            new EarlyExitException(92, input);
                        throw eee;
                }
                cnt92++;
            } while (true);

            END289=(Token)match(input,END,FOLLOW_END_in_for_loop_statement2856); 
            END289_tree = (Object)adaptor.create(END289);
            adaptor.addChild(root_0, END289_tree);

            LOOP290=(Token)match(input,LOOP,FOLLOW_LOOP_in_for_loop_statement2858); 
            LOOP290_tree = (Object)adaptor.create(LOOP290);
            adaptor.addChild(root_0, LOOP290_tree);

            // src/org/plsql/PLSQL2.g:465:66: ( label_name )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==ID) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:465:66: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_for_loop_statement2860);
                    label_name291=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name291.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "for_loop_statement"

    public static class forall_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forall_statement"
    // src/org/plsql/PLSQL2.g:468:1: forall_statement : FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )? ;
    public final PLSQL2Parser.forall_statement_return forall_statement() throws RecognitionException {
        PLSQL2Parser.forall_statement_return retval = new PLSQL2Parser.forall_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FORALL292=null;
        Token ID293=null;
        Token IN294=null;
        PLSQL2Parser.bounds_clause_return bounds_clause295 = null;

        PLSQL2Parser.sql_statement_return sql_statement296 = null;

        PLSQL2Parser.kSAVE_return kSAVE297 = null;

        PLSQL2Parser.kEXCEPTIONS_return kEXCEPTIONS298 = null;


        Object FORALL292_tree=null;
        Object ID293_tree=null;
        Object IN294_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:468:18: ( FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )? )
            // src/org/plsql/PLSQL2.g:469:9: FORALL ID IN bounds_clause sql_statement ( kSAVE kEXCEPTIONS )?
            {
            root_0 = (Object)adaptor.nil();

            FORALL292=(Token)match(input,FORALL,FOLLOW_FORALL_in_forall_statement2882); 
            FORALL292_tree = (Object)adaptor.create(FORALL292);
            adaptor.addChild(root_0, FORALL292_tree);

            ID293=(Token)match(input,ID,FOLLOW_ID_in_forall_statement2884); 
            ID293_tree = (Object)adaptor.create(ID293);
            adaptor.addChild(root_0, ID293_tree);

            IN294=(Token)match(input,IN,FOLLOW_IN_in_forall_statement2886); 
            IN294_tree = (Object)adaptor.create(IN294);
            adaptor.addChild(root_0, IN294_tree);

            pushFollow(FOLLOW_bounds_clause_in_forall_statement2888);
            bounds_clause295=bounds_clause();

            state._fsp--;

            adaptor.addChild(root_0, bounds_clause295.getTree());
            pushFollow(FOLLOW_sql_statement_in_forall_statement2890);
            sql_statement296=sql_statement();

            state._fsp--;

            adaptor.addChild(root_0, sql_statement296.getTree());
            // src/org/plsql/PLSQL2.g:469:50: ( kSAVE kEXCEPTIONS )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==ID) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:469:52: kSAVE kEXCEPTIONS
                    {
                    pushFollow(FOLLOW_kSAVE_in_forall_statement2894);
                    kSAVE297=kSAVE();

                    state._fsp--;

                    adaptor.addChild(root_0, kSAVE297.getTree());
                    pushFollow(FOLLOW_kEXCEPTIONS_in_forall_statement2896);
                    kEXCEPTIONS298=kEXCEPTIONS();

                    state._fsp--;

                    adaptor.addChild(root_0, kEXCEPTIONS298.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forall_statement"

    public static class bounds_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bounds_clause"
    // src/org/plsql/PLSQL2.g:472:1: bounds_clause : ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom );
    public final PLSQL2Parser.bounds_clause_return bounds_clause() throws RecognitionException {
        PLSQL2Parser.bounds_clause_return retval = new PLSQL2Parser.bounds_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLEDOT300=null;
        Token BETWEEN305=null;
        Token AND307=null;
        PLSQL2Parser.numeric_expression_return numeric_expression299 = null;

        PLSQL2Parser.numeric_expression_return numeric_expression301 = null;

        PLSQL2Parser.kINDICES_return kINDICES302 = null;

        PLSQL2Parser.kOF_return kOF303 = null;

        PLSQL2Parser.atom_return atom304 = null;

        PLSQL2Parser.numeric_expression_return numeric_expression306 = null;

        PLSQL2Parser.numeric_expression_return numeric_expression308 = null;

        PLSQL2Parser.kVALUES_return kVALUES309 = null;

        PLSQL2Parser.kOF_return kOF310 = null;

        PLSQL2Parser.atom_return atom311 = null;


        Object DOUBLEDOT300_tree=null;
        Object BETWEEN305_tree=null;
        Object AND307_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:473:5: ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom )
            int alt96=3;
            alt96 = dfa96.predict(input);
            switch (alt96) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:473:7: numeric_expression DOUBLEDOT numeric_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numeric_expression_in_bounds_clause2918);
                    numeric_expression299=numeric_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_expression299.getTree());
                    DOUBLEDOT300=(Token)match(input,DOUBLEDOT,FOLLOW_DOUBLEDOT_in_bounds_clause2920); 
                    DOUBLEDOT300_tree = (Object)adaptor.create(DOUBLEDOT300);
                    adaptor.addChild(root_0, DOUBLEDOT300_tree);

                    pushFollow(FOLLOW_numeric_expression_in_bounds_clause2922);
                    numeric_expression301=numeric_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_expression301.getTree());

                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:474:7: kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_kINDICES_in_bounds_clause2930);
                    kINDICES302=kINDICES();

                    state._fsp--;

                    adaptor.addChild(root_0, kINDICES302.getTree());
                    pushFollow(FOLLOW_kOF_in_bounds_clause2932);
                    kOF303=kOF();

                    state._fsp--;

                    adaptor.addChild(root_0, kOF303.getTree());
                    pushFollow(FOLLOW_atom_in_bounds_clause2934);
                    atom304=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom304.getTree());
                    // src/org/plsql/PLSQL2.g:474:25: ( BETWEEN numeric_expression AND numeric_expression )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==BETWEEN) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:474:27: BETWEEN numeric_expression AND numeric_expression
                            {
                            BETWEEN305=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_bounds_clause2938); 
                            BETWEEN305_tree = (Object)adaptor.create(BETWEEN305);
                            adaptor.addChild(root_0, BETWEEN305_tree);

                            pushFollow(FOLLOW_numeric_expression_in_bounds_clause2940);
                            numeric_expression306=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression306.getTree());
                            AND307=(Token)match(input,AND,FOLLOW_AND_in_bounds_clause2942); 
                            AND307_tree = (Object)adaptor.create(AND307);
                            adaptor.addChild(root_0, AND307_tree);

                            pushFollow(FOLLOW_numeric_expression_in_bounds_clause2944);
                            numeric_expression308=numeric_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, numeric_expression308.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // src/org/plsql/PLSQL2.g:475:7: kVALUES kOF atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_kVALUES_in_bounds_clause2955);
                    kVALUES309=kVALUES();

                    state._fsp--;

                    adaptor.addChild(root_0, kVALUES309.getTree());
                    pushFollow(FOLLOW_kOF_in_bounds_clause2957);
                    kOF310=kOF();

                    state._fsp--;

                    adaptor.addChild(root_0, kOF310.getTree());
                    pushFollow(FOLLOW_atom_in_bounds_clause2959);
                    atom311=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom311.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bounds_clause"

    public static class goto_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "goto_statement"
    // src/org/plsql/PLSQL2.g:478:1: goto_statement : GOTO label_name ;
    public final PLSQL2Parser.goto_statement_return goto_statement() throws RecognitionException {
        PLSQL2Parser.goto_statement_return retval = new PLSQL2Parser.goto_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token GOTO312=null;
        PLSQL2Parser.label_name_return label_name313 = null;


        Object GOTO312_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:478:16: ( GOTO label_name )
            // src/org/plsql/PLSQL2.g:479:9: GOTO label_name
            {
            root_0 = (Object)adaptor.nil();

            GOTO312=(Token)match(input,GOTO,FOLLOW_GOTO_in_goto_statement2980); 
            GOTO312_tree = (Object)adaptor.create(GOTO312);
            adaptor.addChild(root_0, GOTO312_tree);

            pushFollow(FOLLOW_label_name_in_goto_statement2982);
            label_name313=label_name();

            state._fsp--;

            adaptor.addChild(root_0, label_name313.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "goto_statement"

    public static class if_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_statement"
    // src/org/plsql/PLSQL2.g:482:1: if_statement : IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF ;
    public final PLSQL2Parser.if_statement_return if_statement() throws RecognitionException {
        PLSQL2Parser.if_statement_return retval = new PLSQL2Parser.if_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF314=null;
        Token THEN316=null;
        Token SEMI318=null;
        Token ELSIF319=null;
        Token THEN321=null;
        Token SEMI323=null;
        Token ELSE324=null;
        Token SEMI326=null;
        Token END327=null;
        Token IF328=null;
        PLSQL2Parser.expression_return expression315 = null;

        PLSQL2Parser.statement_return statement317 = null;

        PLSQL2Parser.expression_return expression320 = null;

        PLSQL2Parser.statement_return statement322 = null;

        PLSQL2Parser.statement_return statement325 = null;


        Object IF314_tree=null;
        Object THEN316_tree=null;
        Object SEMI318_tree=null;
        Object ELSIF319_tree=null;
        Object THEN321_tree=null;
        Object SEMI323_tree=null;
        Object ELSE324_tree=null;
        Object SEMI326_tree=null;
        Object END327_tree=null;
        Object IF328_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:482:14: ( IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF )
            // src/org/plsql/PLSQL2.g:483:9: IF expression THEN ( statement SEMI )+ ( ELSIF expression THEN ( statement SEMI )+ )* ( ELSE ( statement SEMI )+ )? END IF
            {
            root_0 = (Object)adaptor.nil();

            IF314=(Token)match(input,IF,FOLLOW_IF_in_if_statement3003); 
            IF314_tree = (Object)adaptor.create(IF314);
            adaptor.addChild(root_0, IF314_tree);

            pushFollow(FOLLOW_expression_in_if_statement3005);
            expression315=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression315.getTree());
            THEN316=(Token)match(input,THEN,FOLLOW_THEN_in_if_statement3007); 
            THEN316_tree = (Object)adaptor.create(THEN316);
            adaptor.addChild(root_0, THEN316_tree);

            // src/org/plsql/PLSQL2.g:483:28: ( statement SEMI )+
            int cnt97=0;
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==ID||LA97_0==RETURN||LA97_0==NULL||LA97_0==BEGIN||(LA97_0>=COLON && LA97_0<=CASE)||(LA97_0>=CLOSE && LA97_0<=EXECUTE)||(LA97_0>=EXIT && LA97_0<=FETCH)||(LA97_0>=FOR && LA97_0<=FORALL)||(LA97_0>=GOTO && LA97_0<=IF)||LA97_0==OPEN||(LA97_0>=RAISE && LA97_0<=LLABEL)||(LA97_0>=COMMIT && LA97_0<=SET)||(LA97_0>=UPDATE && LA97_0<=WHILE)) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:483:30: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_if_statement3011);
            	    statement317=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement317.getTree());
            	    SEMI318=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement3013); 
            	    SEMI318_tree = (Object)adaptor.create(SEMI318);
            	    adaptor.addChild(root_0, SEMI318_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt97 >= 1 ) break loop97;
                        EarlyExitException eee =
                            new EarlyExitException(97, input);
                        throw eee;
                }
                cnt97++;
            } while (true);

            // src/org/plsql/PLSQL2.g:484:9: ( ELSIF expression THEN ( statement SEMI )+ )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==ELSIF) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:484:11: ELSIF expression THEN ( statement SEMI )+
            	    {
            	    ELSIF319=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement3028); 
            	    ELSIF319_tree = (Object)adaptor.create(ELSIF319);
            	    adaptor.addChild(root_0, ELSIF319_tree);

            	    pushFollow(FOLLOW_expression_in_if_statement3030);
            	    expression320=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression320.getTree());
            	    THEN321=(Token)match(input,THEN,FOLLOW_THEN_in_if_statement3032); 
            	    THEN321_tree = (Object)adaptor.create(THEN321);
            	    adaptor.addChild(root_0, THEN321_tree);

            	    // src/org/plsql/PLSQL2.g:484:33: ( statement SEMI )+
            	    int cnt98=0;
            	    loop98:
            	    do {
            	        int alt98=2;
            	        int LA98_0 = input.LA(1);

            	        if ( (LA98_0==ID||LA98_0==RETURN||LA98_0==NULL||LA98_0==BEGIN||(LA98_0>=COLON && LA98_0<=CASE)||(LA98_0>=CLOSE && LA98_0<=EXECUTE)||(LA98_0>=EXIT && LA98_0<=FETCH)||(LA98_0>=FOR && LA98_0<=FORALL)||(LA98_0>=GOTO && LA98_0<=IF)||LA98_0==OPEN||(LA98_0>=RAISE && LA98_0<=LLABEL)||(LA98_0>=COMMIT && LA98_0<=SET)||(LA98_0>=UPDATE && LA98_0<=WHILE)) ) {
            	            alt98=1;
            	        }


            	        switch (alt98) {
            	    	case 1 :
            	    	    // src/org/plsql/PLSQL2.g:484:35: statement SEMI
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_if_statement3036);
            	    	    statement322=statement();

            	    	    state._fsp--;

            	    	    adaptor.addChild(root_0, statement322.getTree());
            	    	    SEMI323=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement3038); 
            	    	    SEMI323_tree = (Object)adaptor.create(SEMI323);
            	    	    adaptor.addChild(root_0, SEMI323_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt98 >= 1 ) break loop98;
            	                EarlyExitException eee =
            	                    new EarlyExitException(98, input);
            	                throw eee;
            	        }
            	        cnt98++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            // src/org/plsql/PLSQL2.g:485:9: ( ELSE ( statement SEMI )+ )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==ELSE) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:485:11: ELSE ( statement SEMI )+
                    {
                    ELSE324=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement3056); 
                    ELSE324_tree = (Object)adaptor.create(ELSE324);
                    adaptor.addChild(root_0, ELSE324_tree);

                    // src/org/plsql/PLSQL2.g:485:16: ( statement SEMI )+
                    int cnt100=0;
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==ID||LA100_0==RETURN||LA100_0==NULL||LA100_0==BEGIN||(LA100_0>=COLON && LA100_0<=CASE)||(LA100_0>=CLOSE && LA100_0<=EXECUTE)||(LA100_0>=EXIT && LA100_0<=FETCH)||(LA100_0>=FOR && LA100_0<=FORALL)||(LA100_0>=GOTO && LA100_0<=IF)||LA100_0==OPEN||(LA100_0>=RAISE && LA100_0<=LLABEL)||(LA100_0>=COMMIT && LA100_0<=SET)||(LA100_0>=UPDATE && LA100_0<=WHILE)) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // src/org/plsql/PLSQL2.g:485:18: statement SEMI
                    	    {
                    	    pushFollow(FOLLOW_statement_in_if_statement3060);
                    	    statement325=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement325.getTree());
                    	    SEMI326=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_statement3062); 
                    	    SEMI326_tree = (Object)adaptor.create(SEMI326);
                    	    adaptor.addChild(root_0, SEMI326_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt100 >= 1 ) break loop100;
                                EarlyExitException eee =
                                    new EarlyExitException(100, input);
                                throw eee;
                        }
                        cnt100++;
                    } while (true);


                    }
                    break;

            }

            END327=(Token)match(input,END,FOLLOW_END_in_if_statement3078); 
            END327_tree = (Object)adaptor.create(END327);
            adaptor.addChild(root_0, END327_tree);

            IF328=(Token)match(input,IF,FOLLOW_IF_in_if_statement3080); 
            IF328_tree = (Object)adaptor.create(IF328);
            adaptor.addChild(root_0, IF328_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_statement"

    public static class null_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "null_statement"
    // src/org/plsql/PLSQL2.g:489:1: null_statement : NULL ;
    public final PLSQL2Parser.null_statement_return null_statement() throws RecognitionException {
        PLSQL2Parser.null_statement_return retval = new PLSQL2Parser.null_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL329=null;

        Object NULL329_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:489:16: ( NULL )
            // src/org/plsql/PLSQL2.g:490:9: NULL
            {
            root_0 = (Object)adaptor.nil();

            NULL329=(Token)match(input,NULL,FOLLOW_NULL_in_null_statement3101); 
            NULL329_tree = (Object)adaptor.create(NULL329);
            adaptor.addChild(root_0, NULL329_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "null_statement"

    public static class open_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "open_statement"
    // src/org/plsql/PLSQL2.g:493:1: open_statement : OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )? ;
    public final PLSQL2Parser.open_statement_return open_statement() throws RecognitionException {
        PLSQL2Parser.open_statement_return retval = new PLSQL2Parser.open_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN330=null;
        Token ID331=null;
        Token DOT332=null;
        Token ID333=null;
        Token FOR335=null;
        PLSQL2Parser.call_args_return call_args334 = null;

        PLSQL2Parser.select_statement_return select_statement336 = null;


        Object OPEN330_tree=null;
        Object ID331_tree=null;
        Object DOT332_tree=null;
        Object ID333_tree=null;
        Object FOR335_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:493:16: ( OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )? )
            // src/org/plsql/PLSQL2.g:494:9: OPEN ID ( DOT ID )* ( call_args )? ( FOR select_statement )?
            {
            root_0 = (Object)adaptor.nil();

            OPEN330=(Token)match(input,OPEN,FOLLOW_OPEN_in_open_statement3122); 
            OPEN330_tree = (Object)adaptor.create(OPEN330);
            adaptor.addChild(root_0, OPEN330_tree);

            ID331=(Token)match(input,ID,FOLLOW_ID_in_open_statement3124); 
            ID331_tree = (Object)adaptor.create(ID331);
            adaptor.addChild(root_0, ID331_tree);

            // src/org/plsql/PLSQL2.g:494:17: ( DOT ID )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==DOT) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:494:19: DOT ID
            	    {
            	    DOT332=(Token)match(input,DOT,FOLLOW_DOT_in_open_statement3128); 
            	    DOT332_tree = (Object)adaptor.create(DOT332);
            	    adaptor.addChild(root_0, DOT332_tree);

            	    ID333=(Token)match(input,ID,FOLLOW_ID_in_open_statement3130); 
            	    ID333_tree = (Object)adaptor.create(ID333);
            	    adaptor.addChild(root_0, ID333_tree);


            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);

            // src/org/plsql/PLSQL2.g:494:29: ( call_args )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==LPAREN) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:494:29: call_args
                    {
                    pushFollow(FOLLOW_call_args_in_open_statement3135);
                    call_args334=call_args();

                    state._fsp--;

                    adaptor.addChild(root_0, call_args334.getTree());

                    }
                    break;

            }

            // src/org/plsql/PLSQL2.g:494:40: ( FOR select_statement )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==FOR) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:494:42: FOR select_statement
                    {
                    FOR335=(Token)match(input,FOR,FOLLOW_FOR_in_open_statement3140); 
                    FOR335_tree = (Object)adaptor.create(FOR335);
                    adaptor.addChild(root_0, FOR335_tree);

                    pushFollow(FOLLOW_select_statement_in_open_statement3142);
                    select_statement336=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement336.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "open_statement"

    public static class pragma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pragma"
    // src/org/plsql/PLSQL2.g:497:1: pragma : PRAGMA swallow_to_semi ;
    public final PLSQL2Parser.pragma_return pragma() throws RecognitionException {
        PLSQL2Parser.pragma_return retval = new PLSQL2Parser.pragma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRAGMA337=null;
        PLSQL2Parser.swallow_to_semi_return swallow_to_semi338 = null;


        Object PRAGMA337_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:497:8: ( PRAGMA swallow_to_semi )
            // src/org/plsql/PLSQL2.g:498:9: PRAGMA swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            PRAGMA337=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma3166); 
            PRAGMA337_tree = (Object)adaptor.create(PRAGMA337);
            adaptor.addChild(root_0, PRAGMA337_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_pragma3168);
            swallow_to_semi338=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi338.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pragma"

    public static class raise_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raise_statement"
    // src/org/plsql/PLSQL2.g:501:1: raise_statement : RAISE ( ID ( DOT ID )* )? ;
    public final PLSQL2Parser.raise_statement_return raise_statement() throws RecognitionException {
        PLSQL2Parser.raise_statement_return retval = new PLSQL2Parser.raise_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RAISE339=null;
        Token ID340=null;
        Token DOT341=null;
        Token ID342=null;

        Object RAISE339_tree=null;
        Object ID340_tree=null;
        Object DOT341_tree=null;
        Object ID342_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:501:17: ( RAISE ( ID ( DOT ID )* )? )
            // src/org/plsql/PLSQL2.g:502:9: RAISE ( ID ( DOT ID )* )?
            {
            root_0 = (Object)adaptor.nil();

            RAISE339=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_statement3189); 
            RAISE339_tree = (Object)adaptor.create(RAISE339);
            adaptor.addChild(root_0, RAISE339_tree);

            // src/org/plsql/PLSQL2.g:502:15: ( ID ( DOT ID )* )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==ID) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:502:17: ID ( DOT ID )*
                    {
                    ID340=(Token)match(input,ID,FOLLOW_ID_in_raise_statement3193); 
                    ID340_tree = (Object)adaptor.create(ID340);
                    adaptor.addChild(root_0, ID340_tree);

                    // src/org/plsql/PLSQL2.g:502:20: ( DOT ID )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==DOT) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // src/org/plsql/PLSQL2.g:502:22: DOT ID
                    	    {
                    	    DOT341=(Token)match(input,DOT,FOLLOW_DOT_in_raise_statement3197); 
                    	    DOT341_tree = (Object)adaptor.create(DOT341);
                    	    adaptor.addChild(root_0, DOT341_tree);

                    	    ID342=(Token)match(input,ID,FOLLOW_ID_in_raise_statement3199); 
                    	    ID342_tree = (Object)adaptor.create(ID342);
                    	    adaptor.addChild(root_0, ID342_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "raise_statement"

    public static class return_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "return_statement"
    // src/org/plsql/PLSQL2.g:505:1: return_statement : RETURN ( expression )? ;
    public final PLSQL2Parser.return_statement_return return_statement() throws RecognitionException {
        PLSQL2Parser.return_statement_return retval = new PLSQL2Parser.return_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN343=null;
        PLSQL2Parser.expression_return expression344 = null;


        Object RETURN343_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:505:18: ( RETURN ( expression )? )
            // src/org/plsql/PLSQL2.g:506:9: RETURN ( expression )?
            {
            root_0 = (Object)adaptor.nil();

            RETURN343=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_statement3226); 
            RETURN343_tree = (Object)adaptor.create(RETURN343);
            adaptor.addChild(root_0, RETURN343_tree);

            // src/org/plsql/PLSQL2.g:506:16: ( expression )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==ID||LA107_0==LPAREN||(LA107_0>=NOT && LA107_0<=NULL)||LA107_0==COLON||(LA107_0>=MINUS && LA107_0<=PLUS)||LA107_0==SQL||(LA107_0>=INTEGER && LA107_0<=QUOTED_STRING)||(LA107_0>=INSERTING && LA107_0<=DELETING)) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:506:16: expression
                    {
                    pushFollow(FOLLOW_expression_in_return_statement3228);
                    expression344=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression344.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "return_statement"

    public static class plsql_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "plsql_block"
    // src/org/plsql/PLSQL2.g:509:1: plsql_block : ( DECLARE declare_section )? body ;
    public final PLSQL2Parser.plsql_block_return plsql_block() throws RecognitionException {
        PLSQL2Parser.plsql_block_return retval = new PLSQL2Parser.plsql_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DECLARE345=null;
        PLSQL2Parser.declare_section_return declare_section346 = null;

        PLSQL2Parser.body_return body347 = null;


        Object DECLARE345_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:509:13: ( ( DECLARE declare_section )? body )
            // src/org/plsql/PLSQL2.g:510:9: ( DECLARE declare_section )? body
            {
            root_0 = (Object)adaptor.nil();

            // src/org/plsql/PLSQL2.g:510:9: ( DECLARE declare_section )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==DECLARE) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:510:11: DECLARE declare_section
                    {
                    DECLARE345=(Token)match(input,DECLARE,FOLLOW_DECLARE_in_plsql_block3252); 
                    DECLARE345_tree = (Object)adaptor.create(DECLARE345);
                    adaptor.addChild(root_0, DECLARE345_tree);

                    pushFollow(FOLLOW_declare_section_in_plsql_block3254);
                    declare_section346=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section346.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_plsql_block3259);
            body347=body();

            state._fsp--;

            adaptor.addChild(root_0, body347.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "plsql_block"

    public static class label_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "label"
    // src/org/plsql/PLSQL2.g:513:1: label : LLABEL label RLABEL ;
    public final PLSQL2Parser.label_return label() throws RecognitionException {
        PLSQL2Parser.label_return retval = new PLSQL2Parser.label_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LLABEL348=null;
        Token RLABEL350=null;
        PLSQL2Parser.label_return label349 = null;


        Object LLABEL348_tree=null;
        Object RLABEL350_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:513:7: ( LLABEL label RLABEL )
            // src/org/plsql/PLSQL2.g:514:9: LLABEL label RLABEL
            {
            root_0 = (Object)adaptor.nil();

            LLABEL348=(Token)match(input,LLABEL,FOLLOW_LLABEL_in_label3280); 
            LLABEL348_tree = (Object)adaptor.create(LLABEL348);
            adaptor.addChild(root_0, LLABEL348_tree);

            pushFollow(FOLLOW_label_in_label3282);
            label349=label();

            state._fsp--;

            adaptor.addChild(root_0, label349.getTree());
            RLABEL350=(Token)match(input,RLABEL,FOLLOW_RLABEL_in_label3284); 
            RLABEL350_tree = (Object)adaptor.create(RLABEL350);
            adaptor.addChild(root_0, RLABEL350_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "label"

    public static class qual_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qual_id"
    // src/org/plsql/PLSQL2.g:517:1: qual_id : ( COLON )? ID ( DOT ( COLON )? ID )* ;
    public final PLSQL2Parser.qual_id_return qual_id() throws RecognitionException {
        PLSQL2Parser.qual_id_return retval = new PLSQL2Parser.qual_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON351=null;
        Token ID352=null;
        Token DOT353=null;
        Token COLON354=null;
        Token ID355=null;

        Object COLON351_tree=null;
        Object ID352_tree=null;
        Object DOT353_tree=null;
        Object COLON354_tree=null;
        Object ID355_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:517:9: ( ( COLON )? ID ( DOT ( COLON )? ID )* )
            // src/org/plsql/PLSQL2.g:518:2: ( COLON )? ID ( DOT ( COLON )? ID )*
            {
            root_0 = (Object)adaptor.nil();

            // src/org/plsql/PLSQL2.g:518:2: ( COLON )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==COLON) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:518:2: COLON
                    {
                    COLON351=(Token)match(input,COLON,FOLLOW_COLON_in_qual_id3298); 
                    COLON351_tree = (Object)adaptor.create(COLON351);
                    adaptor.addChild(root_0, COLON351_tree);


                    }
                    break;

            }

            ID352=(Token)match(input,ID,FOLLOW_ID_in_qual_id3301); 
            ID352_tree = (Object)adaptor.create(ID352);
            adaptor.addChild(root_0, ID352_tree);

            // src/org/plsql/PLSQL2.g:518:12: ( DOT ( COLON )? ID )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==DOT) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:518:14: DOT ( COLON )? ID
            	    {
            	    DOT353=(Token)match(input,DOT,FOLLOW_DOT_in_qual_id3305); 
            	    DOT353_tree = (Object)adaptor.create(DOT353);
            	    adaptor.addChild(root_0, DOT353_tree);

            	    // src/org/plsql/PLSQL2.g:518:18: ( COLON )?
            	    int alt110=2;
            	    int LA110_0 = input.LA(1);

            	    if ( (LA110_0==COLON) ) {
            	        alt110=1;
            	    }
            	    switch (alt110) {
            	        case 1 :
            	            // src/org/plsql/PLSQL2.g:518:18: COLON
            	            {
            	            COLON354=(Token)match(input,COLON,FOLLOW_COLON_in_qual_id3307); 
            	            COLON354_tree = (Object)adaptor.create(COLON354);
            	            adaptor.addChild(root_0, COLON354_tree);


            	            }
            	            break;

            	    }

            	    ID355=(Token)match(input,ID,FOLLOW_ID_in_qual_id3310); 
            	    ID355_tree = (Object)adaptor.create(ID355);
            	    adaptor.addChild(root_0, ID355_tree);


            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "qual_id"

    public static class sql_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sql_statement"
    // src/org/plsql/PLSQL2.g:521:1: sql_statement : ( commit_statement | delete_statement | insert_statement | lock_table_statement | rollback_statement | savepoint_statement | select_statement | set_transaction_statement | update_statement );
    public final PLSQL2Parser.sql_statement_return sql_statement() throws RecognitionException {
        PLSQL2Parser.sql_statement_return retval = new PLSQL2Parser.sql_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQL2Parser.commit_statement_return commit_statement356 = null;

        PLSQL2Parser.delete_statement_return delete_statement357 = null;

        PLSQL2Parser.insert_statement_return insert_statement358 = null;

        PLSQL2Parser.lock_table_statement_return lock_table_statement359 = null;

        PLSQL2Parser.rollback_statement_return rollback_statement360 = null;

        PLSQL2Parser.savepoint_statement_return savepoint_statement361 = null;

        PLSQL2Parser.select_statement_return select_statement362 = null;

        PLSQL2Parser.set_transaction_statement_return set_transaction_statement363 = null;

        PLSQL2Parser.update_statement_return update_statement364 = null;



        try {
            // src/org/plsql/PLSQL2.g:522:5: ( commit_statement | delete_statement | insert_statement | lock_table_statement | rollback_statement | savepoint_statement | select_statement | set_transaction_statement | update_statement )
            int alt112=9;
            switch ( input.LA(1) ) {
            case COMMIT:
                {
                alt112=1;
                }
                break;
            case DELETE:
                {
                alt112=2;
                }
                break;
            case INSERT:
                {
                alt112=3;
                }
                break;
            case LOCK:
                {
                alt112=4;
                }
                break;
            case ROLLBACK:
                {
                alt112=5;
                }
                break;
            case SAVEPOINT:
                {
                alt112=6;
                }
                break;
            case SELECT:
                {
                alt112=7;
                }
                break;
            case SET:
                {
                alt112=8;
                }
                break;
            case UPDATE:
                {
                alt112=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:522:7: commit_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commit_statement_in_sql_statement3330);
                    commit_statement356=commit_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_statement356.getTree());

                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:523:7: delete_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_delete_statement_in_sql_statement3338);
                    delete_statement357=delete_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_statement357.getTree());

                    }
                    break;
                case 3 :
                    // src/org/plsql/PLSQL2.g:524:7: insert_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_insert_statement_in_sql_statement3346);
                    insert_statement358=insert_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_statement358.getTree());

                    }
                    break;
                case 4 :
                    // src/org/plsql/PLSQL2.g:525:7: lock_table_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lock_table_statement_in_sql_statement3354);
                    lock_table_statement359=lock_table_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, lock_table_statement359.getTree());

                    }
                    break;
                case 5 :
                    // src/org/plsql/PLSQL2.g:526:7: rollback_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rollback_statement_in_sql_statement3362);
                    rollback_statement360=rollback_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_statement360.getTree());

                    }
                    break;
                case 6 :
                    // src/org/plsql/PLSQL2.g:527:7: savepoint_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_savepoint_statement_in_sql_statement3370);
                    savepoint_statement361=savepoint_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_statement361.getTree());

                    }
                    break;
                case 7 :
                    // src/org/plsql/PLSQL2.g:528:7: select_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_statement_in_sql_statement3378);
                    select_statement362=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement362.getTree());

                    }
                    break;
                case 8 :
                    // src/org/plsql/PLSQL2.g:529:7: set_transaction_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_set_transaction_statement_in_sql_statement3386);
                    set_transaction_statement363=set_transaction_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, set_transaction_statement363.getTree());

                    }
                    break;
                case 9 :
                    // src/org/plsql/PLSQL2.g:530:7: update_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_update_statement_in_sql_statement3394);
                    update_statement364=update_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, update_statement364.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sql_statement"

    public static class commit_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commit_statement"
    // src/org/plsql/PLSQL2.g:533:1: commit_statement : COMMIT ( swallow_to_semi )? ;
    public final PLSQL2Parser.commit_statement_return commit_statement() throws RecognitionException {
        PLSQL2Parser.commit_statement_return retval = new PLSQL2Parser.commit_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMIT365=null;
        PLSQL2Parser.swallow_to_semi_return swallow_to_semi366 = null;


        Object COMMIT365_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:533:18: ( COMMIT ( swallow_to_semi )? )
            // src/org/plsql/PLSQL2.g:534:9: COMMIT ( swallow_to_semi )?
            {
            root_0 = (Object)adaptor.nil();

            COMMIT365=(Token)match(input,COMMIT,FOLLOW_COMMIT_in_commit_statement3415); 
            COMMIT365_tree = (Object)adaptor.create(COMMIT365);
            adaptor.addChild(root_0, COMMIT365_tree);

            // src/org/plsql/PLSQL2.g:534:16: ( swallow_to_semi )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==ID) ) {
                int LA113_1 = input.LA(2);

                if ( ((LA113_1>=DIVIDE && LA113_1<=PROCEDURE)||(LA113_1>=FUNCTION && LA113_1<=ML_COMMENT)) ) {
                    alt113=1;
                }
                else if ( (LA113_1==ID) ) {
                    int LA113_4 = input.LA(3);

                    if ( (!(((input.LT(1).getText().equalsIgnoreCase("save"))))) ) {
                        alt113=1;
                    }
                }
            }
            else if ( (LA113_0==DIVIDE||LA113_0==PROCEDURE||(LA113_0>=FUNCTION && LA113_0<=ML_COMMENT)) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:534:16: swallow_to_semi
                    {
                    pushFollow(FOLLOW_swallow_to_semi_in_commit_statement3417);
                    swallow_to_semi366=swallow_to_semi();

                    state._fsp--;

                    adaptor.addChild(root_0, swallow_to_semi366.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "commit_statement"

    public static class delete_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete_statement"
    // src/org/plsql/PLSQL2.g:537:1: delete_statement : DELETE swallow_to_semi ;
    public final PLSQL2Parser.delete_statement_return delete_statement() throws RecognitionException {
        PLSQL2Parser.delete_statement_return retval = new PLSQL2Parser.delete_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE367=null;
        PLSQL2Parser.swallow_to_semi_return swallow_to_semi368 = null;


        Object DELETE367_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:537:18: ( DELETE swallow_to_semi )
            // src/org/plsql/PLSQL2.g:538:9: DELETE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            DELETE367=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_statement3439); 
            DELETE367_tree = (Object)adaptor.create(DELETE367);
            adaptor.addChild(root_0, DELETE367_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_delete_statement3441);
            swallow_to_semi368=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi368.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delete_statement"

    public static class insert_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "insert_statement"
    // src/org/plsql/PLSQL2.g:541:1: insert_statement : INSERT swallow_to_semi ;
    public final PLSQL2Parser.insert_statement_return insert_statement() throws RecognitionException {
        PLSQL2Parser.insert_statement_return retval = new PLSQL2Parser.insert_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERT369=null;
        PLSQL2Parser.swallow_to_semi_return swallow_to_semi370 = null;


        Object INSERT369_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:541:18: ( INSERT swallow_to_semi )
            // src/org/plsql/PLSQL2.g:542:9: INSERT swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            INSERT369=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_statement3462); 
            INSERT369_tree = (Object)adaptor.create(INSERT369);
            adaptor.addChild(root_0, INSERT369_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_insert_statement3464);
            swallow_to_semi370=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi370.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "insert_statement"

    public static class lock_table_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lock_table_statement"
    // src/org/plsql/PLSQL2.g:545:1: lock_table_statement : LOCK TABLE swallow_to_semi ;
    public final PLSQL2Parser.lock_table_statement_return lock_table_statement() throws RecognitionException {
        PLSQL2Parser.lock_table_statement_return retval = new PLSQL2Parser.lock_table_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOCK371=null;
        Token TABLE372=null;
        PLSQL2Parser.swallow_to_semi_return swallow_to_semi373 = null;


        Object LOCK371_tree=null;
        Object TABLE372_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:545:22: ( LOCK TABLE swallow_to_semi )
            // src/org/plsql/PLSQL2.g:546:9: LOCK TABLE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            LOCK371=(Token)match(input,LOCK,FOLLOW_LOCK_in_lock_table_statement3485); 
            LOCK371_tree = (Object)adaptor.create(LOCK371);
            adaptor.addChild(root_0, LOCK371_tree);

            TABLE372=(Token)match(input,TABLE,FOLLOW_TABLE_in_lock_table_statement3487); 
            TABLE372_tree = (Object)adaptor.create(TABLE372);
            adaptor.addChild(root_0, TABLE372_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_lock_table_statement3489);
            swallow_to_semi373=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi373.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lock_table_statement"

    public static class rollback_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rollback_statement"
    // src/org/plsql/PLSQL2.g:549:1: rollback_statement : ROLLBACK ( swallow_to_semi )? ;
    public final PLSQL2Parser.rollback_statement_return rollback_statement() throws RecognitionException {
        PLSQL2Parser.rollback_statement_return retval = new PLSQL2Parser.rollback_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ROLLBACK374=null;
        PLSQL2Parser.swallow_to_semi_return swallow_to_semi375 = null;


        Object ROLLBACK374_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:549:20: ( ROLLBACK ( swallow_to_semi )? )
            // src/org/plsql/PLSQL2.g:550:9: ROLLBACK ( swallow_to_semi )?
            {
            root_0 = (Object)adaptor.nil();

            ROLLBACK374=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_statement3510); 
            ROLLBACK374_tree = (Object)adaptor.create(ROLLBACK374);
            adaptor.addChild(root_0, ROLLBACK374_tree);

            // src/org/plsql/PLSQL2.g:550:18: ( swallow_to_semi )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==ID) ) {
                int LA114_1 = input.LA(2);

                if ( ((LA114_1>=DIVIDE && LA114_1<=PROCEDURE)||(LA114_1>=FUNCTION && LA114_1<=ML_COMMENT)) ) {
                    alt114=1;
                }
                else if ( (LA114_1==ID) ) {
                    int LA114_4 = input.LA(3);

                    if ( (!(((input.LT(1).getText().equalsIgnoreCase("save"))))) ) {
                        alt114=1;
                    }
                }
            }
            else if ( (LA114_0==DIVIDE||LA114_0==PROCEDURE||(LA114_0>=FUNCTION && LA114_0<=ML_COMMENT)) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:550:18: swallow_to_semi
                    {
                    pushFollow(FOLLOW_swallow_to_semi_in_rollback_statement3512);
                    swallow_to_semi375=swallow_to_semi();

                    state._fsp--;

                    adaptor.addChild(root_0, swallow_to_semi375.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rollback_statement"

    public static class savepoint_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "savepoint_statement"
    // src/org/plsql/PLSQL2.g:553:1: savepoint_statement : SAVEPOINT ID ;
    public final PLSQL2Parser.savepoint_statement_return savepoint_statement() throws RecognitionException {
        PLSQL2Parser.savepoint_statement_return retval = new PLSQL2Parser.savepoint_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SAVEPOINT376=null;
        Token ID377=null;

        Object SAVEPOINT376_tree=null;
        Object ID377_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:553:21: ( SAVEPOINT ID )
            // src/org/plsql/PLSQL2.g:554:9: SAVEPOINT ID
            {
            root_0 = (Object)adaptor.nil();

            SAVEPOINT376=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_statement3534); 
            SAVEPOINT376_tree = (Object)adaptor.create(SAVEPOINT376);
            adaptor.addChild(root_0, SAVEPOINT376_tree);

            ID377=(Token)match(input,ID,FOLLOW_ID_in_savepoint_statement3536); 
            ID377_tree = (Object)adaptor.create(ID377);
            adaptor.addChild(root_0, ID377_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "savepoint_statement"

    public static class select_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_statement"
    // src/org/plsql/PLSQL2.g:557:1: select_statement : SELECT swallow_to_semi ;
    public final PLSQL2Parser.select_statement_return select_statement() throws RecognitionException {
        PLSQL2Parser.select_statement_return retval = new PLSQL2Parser.select_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SELECT378=null;
        PLSQL2Parser.swallow_to_semi_return swallow_to_semi379 = null;


        Object SELECT378_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:557:18: ( SELECT swallow_to_semi )
            // src/org/plsql/PLSQL2.g:558:9: SELECT swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            SELECT378=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_statement3557); 
            SELECT378_tree = (Object)adaptor.create(SELECT378);
            adaptor.addChild(root_0, SELECT378_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_select_statement3559);
            swallow_to_semi379=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi379.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "select_statement"

    public static class set_transaction_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "set_transaction_statement"
    // src/org/plsql/PLSQL2.g:561:1: set_transaction_statement : SET TRANSACTION swallow_to_semi ;
    public final PLSQL2Parser.set_transaction_statement_return set_transaction_statement() throws RecognitionException {
        PLSQL2Parser.set_transaction_statement_return retval = new PLSQL2Parser.set_transaction_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SET380=null;
        Token TRANSACTION381=null;
        PLSQL2Parser.swallow_to_semi_return swallow_to_semi382 = null;


        Object SET380_tree=null;
        Object TRANSACTION381_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:561:27: ( SET TRANSACTION swallow_to_semi )
            // src/org/plsql/PLSQL2.g:562:9: SET TRANSACTION swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            SET380=(Token)match(input,SET,FOLLOW_SET_in_set_transaction_statement3580); 
            SET380_tree = (Object)adaptor.create(SET380);
            adaptor.addChild(root_0, SET380_tree);

            TRANSACTION381=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_set_transaction_statement3582); 
            TRANSACTION381_tree = (Object)adaptor.create(TRANSACTION381);
            adaptor.addChild(root_0, TRANSACTION381_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_set_transaction_statement3584);
            swallow_to_semi382=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi382.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "set_transaction_statement"

    public static class update_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "update_statement"
    // src/org/plsql/PLSQL2.g:565:1: update_statement : UPDATE swallow_to_semi ;
    public final PLSQL2Parser.update_statement_return update_statement() throws RecognitionException {
        PLSQL2Parser.update_statement_return retval = new PLSQL2Parser.update_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UPDATE383=null;
        PLSQL2Parser.swallow_to_semi_return swallow_to_semi384 = null;


        Object UPDATE383_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:565:18: ( UPDATE swallow_to_semi )
            // src/org/plsql/PLSQL2.g:566:9: UPDATE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            UPDATE383=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_statement3605); 
            UPDATE383_tree = (Object)adaptor.create(UPDATE383);
            adaptor.addChild(root_0, UPDATE383_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_update_statement3607);
            swallow_to_semi384=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi384.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "update_statement"

    public static class swallow_to_semi_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "swallow_to_semi"
    // src/org/plsql/PLSQL2.g:569:1: swallow_to_semi : (~ ( SEMI ) )+ ;
    public final PLSQL2Parser.swallow_to_semi_return swallow_to_semi() throws RecognitionException {
        PLSQL2Parser.swallow_to_semi_return retval = new PLSQL2Parser.swallow_to_semi_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set385=null;

        Object set385_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:569:17: ( (~ ( SEMI ) )+ )
            // src/org/plsql/PLSQL2.g:570:9: (~ ( SEMI ) )+
            {
            root_0 = (Object)adaptor.nil();

            // src/org/plsql/PLSQL2.g:570:9: (~ ( SEMI ) )+
            int cnt115=0;
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==ID) ) {
                    int LA115_2 = input.LA(2);

                    if ( ((LA115_2>=DIVIDE && LA115_2<=PROCEDURE)||(LA115_2>=FUNCTION && LA115_2<=ML_COMMENT)) ) {
                        alt115=1;
                    }
                    else if ( (LA115_2==ID) ) {
                        int LA115_4 = input.LA(3);

                        if ( (!(((input.LT(1).getText().equalsIgnoreCase("save"))))) ) {
                            alt115=1;
                        }


                    }


                }
                else if ( (LA115_0==DIVIDE||LA115_0==PROCEDURE||(LA115_0>=FUNCTION && LA115_0<=ML_COMMENT)) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:570:9: ~ ( SEMI )
            	    {
            	    set385=(Token)input.LT(1);
            	    if ( input.LA(1)==DIVIDE||(input.LA(1)>=PROCEDURE && input.LA(1)<=ML_COMMENT) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set385));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt115 >= 1 ) break loop115;
                        EarlyExitException eee =
                            new EarlyExitException(115, input);
                        throw eee;
                }
                cnt115++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "swallow_to_semi"

    public static class while_loop_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_loop_statement"
    // src/org/plsql/PLSQL2.g:573:1: while_loop_statement : WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )? ;
    public final PLSQL2Parser.while_loop_statement_return while_loop_statement() throws RecognitionException {
        PLSQL2Parser.while_loop_statement_return retval = new PLSQL2Parser.while_loop_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE386=null;
        Token LOOP388=null;
        Token SEMI390=null;
        Token END391=null;
        Token LOOP392=null;
        PLSQL2Parser.expression_return expression387 = null;

        PLSQL2Parser.statement_return statement389 = null;

        PLSQL2Parser.label_name_return label_name393 = null;


        Object WHILE386_tree=null;
        Object LOOP388_tree=null;
        Object SEMI390_tree=null;
        Object END391_tree=null;
        Object LOOP392_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:573:22: ( WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )? )
            // src/org/plsql/PLSQL2.g:574:9: WHILE expression LOOP ( statement SEMI )+ END LOOP ( label_name )?
            {
            root_0 = (Object)adaptor.nil();

            WHILE386=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_loop_statement3655); 
            WHILE386_tree = (Object)adaptor.create(WHILE386);
            adaptor.addChild(root_0, WHILE386_tree);

            pushFollow(FOLLOW_expression_in_while_loop_statement3657);
            expression387=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression387.getTree());
            LOOP388=(Token)match(input,LOOP,FOLLOW_LOOP_in_while_loop_statement3659); 
            LOOP388_tree = (Object)adaptor.create(LOOP388);
            adaptor.addChild(root_0, LOOP388_tree);

            // src/org/plsql/PLSQL2.g:574:31: ( statement SEMI )+
            int cnt116=0;
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==ID||LA116_0==RETURN||LA116_0==NULL||LA116_0==BEGIN||(LA116_0>=COLON && LA116_0<=CASE)||(LA116_0>=CLOSE && LA116_0<=EXECUTE)||(LA116_0>=EXIT && LA116_0<=FETCH)||(LA116_0>=FOR && LA116_0<=FORALL)||(LA116_0>=GOTO && LA116_0<=IF)||LA116_0==OPEN||(LA116_0>=RAISE && LA116_0<=LLABEL)||(LA116_0>=COMMIT && LA116_0<=SET)||(LA116_0>=UPDATE && LA116_0<=WHILE)) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:574:33: statement SEMI
            	    {
            	    pushFollow(FOLLOW_statement_in_while_loop_statement3663);
            	    statement389=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement389.getTree());
            	    SEMI390=(Token)match(input,SEMI,FOLLOW_SEMI_in_while_loop_statement3665); 
            	    SEMI390_tree = (Object)adaptor.create(SEMI390);
            	    adaptor.addChild(root_0, SEMI390_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt116 >= 1 ) break loop116;
                        EarlyExitException eee =
                            new EarlyExitException(116, input);
                        throw eee;
                }
                cnt116++;
            } while (true);

            END391=(Token)match(input,END,FOLLOW_END_in_while_loop_statement3670); 
            END391_tree = (Object)adaptor.create(END391);
            adaptor.addChild(root_0, END391_tree);

            LOOP392=(Token)match(input,LOOP,FOLLOW_LOOP_in_while_loop_statement3672); 
            LOOP392_tree = (Object)adaptor.create(LOOP392);
            adaptor.addChild(root_0, LOOP392_tree);

            // src/org/plsql/PLSQL2.g:574:60: ( label_name )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==ID) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:574:60: label_name
                    {
                    pushFollow(FOLLOW_label_name_in_while_loop_statement3674);
                    label_name393=label_name();

                    state._fsp--;

                    adaptor.addChild(root_0, label_name393.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "while_loop_statement"

    public static class match_parens_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "match_parens"
    // src/org/plsql/PLSQL2.g:577:1: match_parens : ( ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )* | RPAREN match_parens LPAREN );
    public final PLSQL2Parser.match_parens_return match_parens() throws RecognitionException {
        PLSQL2Parser.match_parens_return retval = new PLSQL2Parser.match_parens_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set394=null;
        Token RPAREN395=null;
        Token LPAREN397=null;
        PLSQL2Parser.match_parens_return match_parens396 = null;


        Object set394_tree=null;
        Object RPAREN395_tree=null;
        Object LPAREN397_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:578:5: ( ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )* | RPAREN match_parens LPAREN )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==DIVIDE||(LA119_0>=PROCEDURE && LA119_0<=COMMA)||(LA119_0>=ASSIGN && LA119_0<=DEFAULT)||(LA119_0>=NOCOPY && LA119_0<=CURSOR)||(LA119_0>=NOT && LA119_0<=EXCEPTION)||(LA119_0>=SUBTYPE && LA119_0<=ML_COMMENT)) ) {
                alt119=1;
            }
            else if ( (LA119_0==RPAREN) ) {
                alt119=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }
            switch (alt119) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:578:7: ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/org/plsql/PLSQL2.g:578:7: ( options {greedy=false; } : ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT ) )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==DIVIDE||(LA118_0>=PROCEDURE && LA118_0<=RETURN)||LA118_0==COMMA||(LA118_0>=ASSIGN && LA118_0<=DEFAULT)||(LA118_0>=NOCOPY && LA118_0<=CURSOR)||(LA118_0>=NOT && LA118_0<=EXCEPTION)||(LA118_0>=SUBTYPE && LA118_0<=ML_COMMENT)) ) {
                            alt118=1;
                        }
                        else if ( (LA118_0==LPAREN) ) {
                            alt118=2;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // src/org/plsql/PLSQL2.g:578:35: ~ ( RPAREN | LPAREN | SEMI | AS | IS | IN | OUT )
                    	    {
                    	    set394=(Token)input.LT(1);
                    	    if ( input.LA(1)==DIVIDE||(input.LA(1)>=PROCEDURE && input.LA(1)<=RETURN)||input.LA(1)==COMMA||(input.LA(1)>=ASSIGN && input.LA(1)<=DEFAULT)||(input.LA(1)>=NOCOPY && input.LA(1)<=CURSOR)||(input.LA(1)>=NOT && input.LA(1)<=EXCEPTION)||(input.LA(1)>=SUBTYPE && input.LA(1)<=ML_COMMENT) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, (Object)adaptor.create(set394));
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:579:7: RPAREN match_parens LPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    RPAREN395=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_match_parens3743); 
                    RPAREN395_tree = (Object)adaptor.create(RPAREN395);
                    adaptor.addChild(root_0, RPAREN395_tree);

                    pushFollow(FOLLOW_match_parens_in_match_parens3745);
                    match_parens396=match_parens();

                    state._fsp--;

                    adaptor.addChild(root_0, match_parens396.getTree());
                    LPAREN397=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_match_parens3747); 
                    LPAREN397_tree = (Object)adaptor.create(LPAREN397);
                    adaptor.addChild(root_0, LPAREN397_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "match_parens"

    public static class label_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "label_name"
    // src/org/plsql/PLSQL2.g:582:1: label_name : ID ;
    public final PLSQL2Parser.label_name_return label_name() throws RecognitionException {
        PLSQL2Parser.label_name_return retval = new PLSQL2Parser.label_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID398=null;

        Object ID398_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:582:11: ( ID )
            // src/org/plsql/PLSQL2.g:582:13: ID
            {
            root_0 = (Object)adaptor.nil();

            ID398=(Token)match(input,ID,FOLLOW_ID_in_label_name3759); 
            ID398_tree = (Object)adaptor.create(ID398);
            adaptor.addChild(root_0, ID398_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "label_name"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // src/org/plsql/PLSQL2.g:584:1: expression : or_expr ;
    public final PLSQL2Parser.expression_return expression() throws RecognitionException {
        PLSQL2Parser.expression_return retval = new PLSQL2Parser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQL2Parser.or_expr_return or_expr399 = null;



        try {
            // src/org/plsql/PLSQL2.g:585:5: ( or_expr )
            // src/org/plsql/PLSQL2.g:585:7: or_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_expr_in_expression3771);
            or_expr399=or_expr();

            state._fsp--;

            adaptor.addChild(root_0, or_expr399.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class or_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "or_expr"
    // src/org/plsql/PLSQL2.g:588:1: or_expr : and_expr ( OR and_expr )* ;
    public final PLSQL2Parser.or_expr_return or_expr() throws RecognitionException {
        PLSQL2Parser.or_expr_return retval = new PLSQL2Parser.or_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR401=null;
        PLSQL2Parser.and_expr_return and_expr400 = null;

        PLSQL2Parser.and_expr_return and_expr402 = null;


        Object OR401_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:589:5: ( and_expr ( OR and_expr )* )
            // src/org/plsql/PLSQL2.g:589:7: and_expr ( OR and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_expr_in_or_expr3788);
            and_expr400=and_expr();

            state._fsp--;

            adaptor.addChild(root_0, and_expr400.getTree());
            // src/org/plsql/PLSQL2.g:589:16: ( OR and_expr )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==OR) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:589:18: OR and_expr
            	    {
            	    OR401=(Token)match(input,OR,FOLLOW_OR_in_or_expr3792); 
            	    OR401_tree = (Object)adaptor.create(OR401);
            	    adaptor.addChild(root_0, OR401_tree);

            	    pushFollow(FOLLOW_and_expr_in_or_expr3794);
            	    and_expr402=and_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_expr402.getTree());

            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "or_expr"

    public static class and_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_expr"
    // src/org/plsql/PLSQL2.g:592:1: and_expr : not_expr ( AND not_expr )* ;
    public final PLSQL2Parser.and_expr_return and_expr() throws RecognitionException {
        PLSQL2Parser.and_expr_return retval = new PLSQL2Parser.and_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND404=null;
        PLSQL2Parser.not_expr_return not_expr403 = null;

        PLSQL2Parser.not_expr_return not_expr405 = null;


        Object AND404_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:593:5: ( not_expr ( AND not_expr )* )
            // src/org/plsql/PLSQL2.g:593:7: not_expr ( AND not_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_not_expr_in_and_expr3814);
            not_expr403=not_expr();

            state._fsp--;

            adaptor.addChild(root_0, not_expr403.getTree());
            // src/org/plsql/PLSQL2.g:593:16: ( AND not_expr )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==AND) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:593:18: AND not_expr
            	    {
            	    AND404=(Token)match(input,AND,FOLLOW_AND_in_and_expr3818); 
            	    AND404_tree = (Object)adaptor.create(AND404);
            	    adaptor.addChild(root_0, AND404_tree);

            	    pushFollow(FOLLOW_not_expr_in_and_expr3820);
            	    not_expr405=not_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, not_expr405.getTree());

            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "and_expr"

    public static class not_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "not_expr"
    // src/org/plsql/PLSQL2.g:596:1: not_expr : ( NOT )? compare_expr ;
    public final PLSQL2Parser.not_expr_return not_expr() throws RecognitionException {
        PLSQL2Parser.not_expr_return retval = new PLSQL2Parser.not_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT406=null;
        PLSQL2Parser.compare_expr_return compare_expr407 = null;


        Object NOT406_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:597:5: ( ( NOT )? compare_expr )
            // src/org/plsql/PLSQL2.g:597:7: ( NOT )? compare_expr
            {
            root_0 = (Object)adaptor.nil();

            // src/org/plsql/PLSQL2.g:597:7: ( NOT )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==NOT) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:597:7: NOT
                    {
                    NOT406=(Token)match(input,NOT,FOLLOW_NOT_in_not_expr3840); 
                    NOT406_tree = (Object)adaptor.create(NOT406);
                    adaptor.addChild(root_0, NOT406_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_compare_expr_in_not_expr3843);
            compare_expr407=compare_expr();

            state._fsp--;

            adaptor.addChild(root_0, compare_expr407.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "not_expr"

    public static class compare_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compare_expr"
    // src/org/plsql/PLSQL2.g:600:1: compare_expr : is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )? ;
    public final PLSQL2Parser.compare_expr_return compare_expr() throws RecognitionException {
        PLSQL2Parser.compare_expr_return retval = new PLSQL2Parser.compare_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set409=null;
        PLSQL2Parser.is_null_expr_return is_null_expr408 = null;

        PLSQL2Parser.is_null_expr_return is_null_expr410 = null;


        Object set409_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:601:5: ( is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )? )
            // src/org/plsql/PLSQL2.g:601:7: is_null_expr ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_is_null_expr_in_compare_expr3860);
            is_null_expr408=is_null_expr();

            state._fsp--;

            adaptor.addChild(root_0, is_null_expr408.getTree());
            // src/org/plsql/PLSQL2.g:601:20: ( ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( ((LA123_0>=EQ && LA123_0<=GEQ)) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:601:22: ( EQ | NOT_EQ | LTH | LEQ | GTH | GEQ ) is_null_expr
                    {
                    set409=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQ && input.LA(1)<=GEQ) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set409));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_is_null_expr_in_compare_expr3890);
                    is_null_expr410=is_null_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, is_null_expr410.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compare_expr"

    public static class is_null_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "is_null_expr"
    // src/org/plsql/PLSQL2.g:604:1: is_null_expr : like_expr ( IS ( NOT )? NULL )? ;
    public final PLSQL2Parser.is_null_expr_return is_null_expr() throws RecognitionException {
        PLSQL2Parser.is_null_expr_return retval = new PLSQL2Parser.is_null_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IS412=null;
        Token NOT413=null;
        Token NULL414=null;
        PLSQL2Parser.like_expr_return like_expr411 = null;


        Object IS412_tree=null;
        Object NOT413_tree=null;
        Object NULL414_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:605:5: ( like_expr ( IS ( NOT )? NULL )? )
            // src/org/plsql/PLSQL2.g:605:7: like_expr ( IS ( NOT )? NULL )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_like_expr_in_is_null_expr3910);
            like_expr411=like_expr();

            state._fsp--;

            adaptor.addChild(root_0, like_expr411.getTree());
            // src/org/plsql/PLSQL2.g:605:17: ( IS ( NOT )? NULL )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==IS) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:605:19: IS ( NOT )? NULL
                    {
                    IS412=(Token)match(input,IS,FOLLOW_IS_in_is_null_expr3914); 
                    IS412_tree = (Object)adaptor.create(IS412);
                    adaptor.addChild(root_0, IS412_tree);

                    // src/org/plsql/PLSQL2.g:605:22: ( NOT )?
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==NOT) ) {
                        alt124=1;
                    }
                    switch (alt124) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:605:22: NOT
                            {
                            NOT413=(Token)match(input,NOT,FOLLOW_NOT_in_is_null_expr3916); 
                            NOT413_tree = (Object)adaptor.create(NOT413);
                            adaptor.addChild(root_0, NOT413_tree);


                            }
                            break;

                    }

                    NULL414=(Token)match(input,NULL,FOLLOW_NULL_in_is_null_expr3919); 
                    NULL414_tree = (Object)adaptor.create(NULL414);
                    adaptor.addChild(root_0, NULL414_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "is_null_expr"

    public static class like_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "like_expr"
    // src/org/plsql/PLSQL2.g:608:1: like_expr : between_expr ( ( NOT )? LIKE between_expr )? ;
    public final PLSQL2Parser.like_expr_return like_expr() throws RecognitionException {
        PLSQL2Parser.like_expr_return retval = new PLSQL2Parser.like_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT416=null;
        Token LIKE417=null;
        PLSQL2Parser.between_expr_return between_expr415 = null;

        PLSQL2Parser.between_expr_return between_expr418 = null;


        Object NOT416_tree=null;
        Object LIKE417_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:609:5: ( between_expr ( ( NOT )? LIKE between_expr )? )
            // src/org/plsql/PLSQL2.g:609:7: between_expr ( ( NOT )? LIKE between_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_between_expr_in_like_expr3938);
            between_expr415=between_expr();

            state._fsp--;

            adaptor.addChild(root_0, between_expr415.getTree());
            // src/org/plsql/PLSQL2.g:609:20: ( ( NOT )? LIKE between_expr )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==NOT||LA127_0==LIKE) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:609:22: ( NOT )? LIKE between_expr
                    {
                    // src/org/plsql/PLSQL2.g:609:22: ( NOT )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==NOT) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:609:22: NOT
                            {
                            NOT416=(Token)match(input,NOT,FOLLOW_NOT_in_like_expr3942); 
                            NOT416_tree = (Object)adaptor.create(NOT416);
                            adaptor.addChild(root_0, NOT416_tree);


                            }
                            break;

                    }

                    LIKE417=(Token)match(input,LIKE,FOLLOW_LIKE_in_like_expr3945); 
                    LIKE417_tree = (Object)adaptor.create(LIKE417);
                    adaptor.addChild(root_0, LIKE417_tree);

                    pushFollow(FOLLOW_between_expr_in_like_expr3947);
                    between_expr418=between_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, between_expr418.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "like_expr"

    public static class between_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "between_expr"
    // src/org/plsql/PLSQL2.g:612:1: between_expr : in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )? ;
    public final PLSQL2Parser.between_expr_return between_expr() throws RecognitionException {
        PLSQL2Parser.between_expr_return retval = new PLSQL2Parser.between_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT420=null;
        Token BETWEEN421=null;
        Token AND423=null;
        PLSQL2Parser.in_expr_return in_expr419 = null;

        PLSQL2Parser.in_expr_return in_expr422 = null;

        PLSQL2Parser.in_expr_return in_expr424 = null;


        Object NOT420_tree=null;
        Object BETWEEN421_tree=null;
        Object AND423_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:613:5: ( in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )? )
            // src/org/plsql/PLSQL2.g:613:7: in_expr ( ( NOT )? BETWEEN in_expr AND in_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_in_expr_in_between_expr3967);
            in_expr419=in_expr();

            state._fsp--;

            adaptor.addChild(root_0, in_expr419.getTree());
            // src/org/plsql/PLSQL2.g:613:15: ( ( NOT )? BETWEEN in_expr AND in_expr )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==NOT) ) {
                int LA129_1 = input.LA(2);

                if ( (LA129_1==BETWEEN) ) {
                    alt129=1;
                }
            }
            else if ( (LA129_0==BETWEEN) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:613:17: ( NOT )? BETWEEN in_expr AND in_expr
                    {
                    // src/org/plsql/PLSQL2.g:613:17: ( NOT )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==NOT) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:613:17: NOT
                            {
                            NOT420=(Token)match(input,NOT,FOLLOW_NOT_in_between_expr3971); 
                            NOT420_tree = (Object)adaptor.create(NOT420);
                            adaptor.addChild(root_0, NOT420_tree);


                            }
                            break;

                    }

                    BETWEEN421=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_between_expr3974); 
                    BETWEEN421_tree = (Object)adaptor.create(BETWEEN421);
                    adaptor.addChild(root_0, BETWEEN421_tree);

                    pushFollow(FOLLOW_in_expr_in_between_expr3976);
                    in_expr422=in_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, in_expr422.getTree());
                    AND423=(Token)match(input,AND,FOLLOW_AND_in_between_expr3978); 
                    AND423_tree = (Object)adaptor.create(AND423);
                    adaptor.addChild(root_0, AND423_tree);

                    pushFollow(FOLLOW_in_expr_in_between_expr3980);
                    in_expr424=in_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, in_expr424.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "between_expr"

    public static class in_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "in_expr"
    // src/org/plsql/PLSQL2.g:616:1: in_expr : add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )? ;
    public final PLSQL2Parser.in_expr_return in_expr() throws RecognitionException {
        PLSQL2Parser.in_expr_return retval = new PLSQL2Parser.in_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT426=null;
        Token IN427=null;
        Token LPAREN428=null;
        Token COMMA430=null;
        Token RPAREN432=null;
        PLSQL2Parser.add_expr_return add_expr425 = null;

        PLSQL2Parser.add_expr_return add_expr429 = null;

        PLSQL2Parser.add_expr_return add_expr431 = null;


        Object NOT426_tree=null;
        Object IN427_tree=null;
        Object LPAREN428_tree=null;
        Object COMMA430_tree=null;
        Object RPAREN432_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:617:5: ( add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )? )
            // src/org/plsql/PLSQL2.g:617:7: add_expr ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_in_expr4000);
            add_expr425=add_expr();

            state._fsp--;

            adaptor.addChild(root_0, add_expr425.getTree());
            // src/org/plsql/PLSQL2.g:617:16: ( ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==NOT) ) {
                int LA132_1 = input.LA(2);

                if ( (LA132_1==IN) ) {
                    alt132=1;
                }
            }
            else if ( (LA132_0==IN) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:617:18: ( NOT )? IN LPAREN add_expr ( COMMA add_expr )* RPAREN
                    {
                    // src/org/plsql/PLSQL2.g:617:18: ( NOT )?
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==NOT) ) {
                        alt130=1;
                    }
                    switch (alt130) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:617:18: NOT
                            {
                            NOT426=(Token)match(input,NOT,FOLLOW_NOT_in_in_expr4004); 
                            NOT426_tree = (Object)adaptor.create(NOT426);
                            adaptor.addChild(root_0, NOT426_tree);


                            }
                            break;

                    }

                    IN427=(Token)match(input,IN,FOLLOW_IN_in_in_expr4007); 
                    IN427_tree = (Object)adaptor.create(IN427);
                    adaptor.addChild(root_0, IN427_tree);

                    LPAREN428=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_in_expr4009); 
                    LPAREN428_tree = (Object)adaptor.create(LPAREN428);
                    adaptor.addChild(root_0, LPAREN428_tree);

                    pushFollow(FOLLOW_add_expr_in_in_expr4011);
                    add_expr429=add_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, add_expr429.getTree());
                    // src/org/plsql/PLSQL2.g:617:42: ( COMMA add_expr )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==COMMA) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // src/org/plsql/PLSQL2.g:617:44: COMMA add_expr
                    	    {
                    	    COMMA430=(Token)match(input,COMMA,FOLLOW_COMMA_in_in_expr4015); 
                    	    COMMA430_tree = (Object)adaptor.create(COMMA430);
                    	    adaptor.addChild(root_0, COMMA430_tree);

                    	    pushFollow(FOLLOW_add_expr_in_in_expr4017);
                    	    add_expr431=add_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, add_expr431.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop131;
                        }
                    } while (true);

                    RPAREN432=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_in_expr4022); 
                    RPAREN432_tree = (Object)adaptor.create(RPAREN432);
                    adaptor.addChild(root_0, RPAREN432_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "in_expr"

    public static class numeric_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_expression"
    // src/org/plsql/PLSQL2.g:620:1: numeric_expression : add_expr ;
    public final PLSQL2Parser.numeric_expression_return numeric_expression() throws RecognitionException {
        PLSQL2Parser.numeric_expression_return retval = new PLSQL2Parser.numeric_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQL2Parser.add_expr_return add_expr433 = null;



        try {
            // src/org/plsql/PLSQL2.g:621:5: ( add_expr )
            // src/org/plsql/PLSQL2.g:621:7: add_expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_numeric_expression4042);
            add_expr433=add_expr();

            state._fsp--;

            adaptor.addChild(root_0, add_expr433.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numeric_expression"

    public static class add_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_expr"
    // src/org/plsql/PLSQL2.g:624:1: add_expr : mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )* ;
    public final PLSQL2Parser.add_expr_return add_expr() throws RecognitionException {
        PLSQL2Parser.add_expr_return retval = new PLSQL2Parser.add_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set435=null;
        PLSQL2Parser.mul_expr_return mul_expr434 = null;

        PLSQL2Parser.mul_expr_return mul_expr436 = null;


        Object set435_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:625:5: ( mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )* )
            // src/org/plsql/PLSQL2.g:625:7: mul_expr ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mul_expr_in_add_expr4059);
            mul_expr434=mul_expr();

            state._fsp--;

            adaptor.addChild(root_0, mul_expr434.getTree());
            // src/org/plsql/PLSQL2.g:625:16: ( ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( ((LA133_0>=MINUS && LA133_0<=DOUBLEVERTBAR)) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:625:18: ( MINUS | PLUS | DOUBLEVERTBAR ) mul_expr
            	    {
            	    set435=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MINUS && input.LA(1)<=DOUBLEVERTBAR) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set435));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mul_expr_in_add_expr4077);
            	    mul_expr436=mul_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul_expr436.getTree());

            	    }
            	    break;

            	default :
            	    break loop133;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "add_expr"

    public static class mul_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mul_expr"
    // src/org/plsql/PLSQL2.g:628:1: mul_expr : unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )* ;
    public final PLSQL2Parser.mul_expr_return mul_expr() throws RecognitionException {
        PLSQL2Parser.mul_expr_return retval = new PLSQL2Parser.mul_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASTERISK438=null;
        Token DIVIDE439=null;
        PLSQL2Parser.unary_sign_expr_return unary_sign_expr437 = null;

        PLSQL2Parser.kMOD_return kMOD440 = null;

        PLSQL2Parser.unary_sign_expr_return unary_sign_expr441 = null;


        Object ASTERISK438_tree=null;
        Object DIVIDE439_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:629:5: ( unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )* )
            // src/org/plsql/PLSQL2.g:629:7: unary_sign_expr ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unary_sign_expr_in_mul_expr4097);
            unary_sign_expr437=unary_sign_expr();

            state._fsp--;

            adaptor.addChild(root_0, unary_sign_expr437.getTree());
            // src/org/plsql/PLSQL2.g:629:23: ( ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==DIVIDE||LA135_0==ID||LA135_0==ASTERISK) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:629:25: ( ASTERISK | DIVIDE | kMOD ) unary_sign_expr
            	    {
            	    // src/org/plsql/PLSQL2.g:629:25: ( ASTERISK | DIVIDE | kMOD )
            	    int alt134=3;
            	    switch ( input.LA(1) ) {
            	    case ASTERISK:
            	        {
            	        alt134=1;
            	        }
            	        break;
            	    case DIVIDE:
            	        {
            	        alt134=2;
            	        }
            	        break;
            	    case ID:
            	        {
            	        alt134=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 134, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt134) {
            	        case 1 :
            	            // src/org/plsql/PLSQL2.g:629:27: ASTERISK
            	            {
            	            ASTERISK438=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_mul_expr4103); 
            	            ASTERISK438_tree = (Object)adaptor.create(ASTERISK438);
            	            adaptor.addChild(root_0, ASTERISK438_tree);


            	            }
            	            break;
            	        case 2 :
            	            // src/org/plsql/PLSQL2.g:629:38: DIVIDE
            	            {
            	            DIVIDE439=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_mul_expr4107); 
            	            DIVIDE439_tree = (Object)adaptor.create(DIVIDE439);
            	            adaptor.addChild(root_0, DIVIDE439_tree);


            	            }
            	            break;
            	        case 3 :
            	            // src/org/plsql/PLSQL2.g:629:47: kMOD
            	            {
            	            pushFollow(FOLLOW_kMOD_in_mul_expr4111);
            	            kMOD440=kMOD();

            	            state._fsp--;

            	            adaptor.addChild(root_0, kMOD440.getTree());

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_sign_expr_in_mul_expr4115);
            	    unary_sign_expr441=unary_sign_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_sign_expr441.getTree());

            	    }
            	    break;

            	default :
            	    break loop135;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mul_expr"

    public static class unary_sign_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_sign_expr"
    // src/org/plsql/PLSQL2.g:632:1: unary_sign_expr : ( MINUS | PLUS )? exponent_expr ;
    public final PLSQL2Parser.unary_sign_expr_return unary_sign_expr() throws RecognitionException {
        PLSQL2Parser.unary_sign_expr_return retval = new PLSQL2Parser.unary_sign_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set442=null;
        PLSQL2Parser.exponent_expr_return exponent_expr443 = null;


        Object set442_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:633:5: ( ( MINUS | PLUS )? exponent_expr )
            // src/org/plsql/PLSQL2.g:633:7: ( MINUS | PLUS )? exponent_expr
            {
            root_0 = (Object)adaptor.nil();

            // src/org/plsql/PLSQL2.g:633:7: ( MINUS | PLUS )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( ((LA136_0>=MINUS && LA136_0<=PLUS)) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:
                    {
                    set442=(Token)input.LT(1);
                    if ( (input.LA(1)>=MINUS && input.LA(1)<=PLUS) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set442));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_exponent_expr_in_unary_sign_expr4146);
            exponent_expr443=exponent_expr();

            state._fsp--;

            adaptor.addChild(root_0, exponent_expr443.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary_sign_expr"

    public static class exponent_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exponent_expr"
    // src/org/plsql/PLSQL2.g:636:1: exponent_expr : atom ( EXPONENT atom )? ;
    public final PLSQL2Parser.exponent_expr_return exponent_expr() throws RecognitionException {
        PLSQL2Parser.exponent_expr_return retval = new PLSQL2Parser.exponent_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXPONENT445=null;
        PLSQL2Parser.atom_return atom444 = null;

        PLSQL2Parser.atom_return atom446 = null;


        Object EXPONENT445_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:637:5: ( atom ( EXPONENT atom )? )
            // src/org/plsql/PLSQL2.g:637:7: atom ( EXPONENT atom )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_in_exponent_expr4163);
            atom444=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom444.getTree());
            // src/org/plsql/PLSQL2.g:637:12: ( EXPONENT atom )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==EXPONENT) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:637:14: EXPONENT atom
                    {
                    EXPONENT445=(Token)match(input,EXPONENT,FOLLOW_EXPONENT_in_exponent_expr4167); 
                    EXPONENT445_tree = (Object)adaptor.create(EXPONENT445);
                    adaptor.addChild(root_0, EXPONENT445_tree);

                    pushFollow(FOLLOW_atom_in_exponent_expr4169);
                    atom446=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom446.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exponent_expr"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // src/org/plsql/PLSQL2.g:640:1: atom : ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN );
    public final PLSQL2Parser.atom_return atom() throws RecognitionException {
        PLSQL2Parser.atom_return retval = new PLSQL2Parser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PERCENT448=null;
        Token SQL450=null;
        Token PERCENT451=null;
        Token NULL456=null;
        Token LPAREN457=null;
        Token RPAREN459=null;
        PLSQL2Parser.variable_or_function_call_return variable_or_function_call447 = null;

        PLSQL2Parser.attribute_return attribute449 = null;

        PLSQL2Parser.attribute_return attribute452 = null;

        PLSQL2Parser.string_literal_return string_literal453 = null;

        PLSQL2Parser.numeric_atom_return numeric_atom454 = null;

        PLSQL2Parser.boolean_atom_return boolean_atom455 = null;

        PLSQL2Parser.expression_return expression458 = null;


        Object PERCENT448_tree=null;
        Object SQL450_tree=null;
        Object PERCENT451_tree=null;
        Object NULL456_tree=null;
        Object LPAREN457_tree=null;
        Object RPAREN459_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:641:5: ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN )
            int alt139=7;
            alt139 = dfa139.predict(input);
            switch (alt139) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:641:7: variable_or_function_call ( PERCENT attribute )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_or_function_call_in_atom4189);
                    variable_or_function_call447=variable_or_function_call();

                    state._fsp--;

                    adaptor.addChild(root_0, variable_or_function_call447.getTree());
                    // src/org/plsql/PLSQL2.g:641:33: ( PERCENT attribute )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==PERCENT) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:641:35: PERCENT attribute
                            {
                            PERCENT448=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom4193); 
                            PERCENT448_tree = (Object)adaptor.create(PERCENT448);
                            adaptor.addChild(root_0, PERCENT448_tree);

                            pushFollow(FOLLOW_attribute_in_atom4195);
                            attribute449=attribute();

                            state._fsp--;

                            adaptor.addChild(root_0, attribute449.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:642:7: SQL PERCENT attribute
                    {
                    root_0 = (Object)adaptor.nil();

                    SQL450=(Token)match(input,SQL,FOLLOW_SQL_in_atom4206); 
                    SQL450_tree = (Object)adaptor.create(SQL450);
                    adaptor.addChild(root_0, SQL450_tree);

                    PERCENT451=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom4208); 
                    PERCENT451_tree = (Object)adaptor.create(PERCENT451);
                    adaptor.addChild(root_0, PERCENT451_tree);

                    pushFollow(FOLLOW_attribute_in_atom4210);
                    attribute452=attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute452.getTree());

                    }
                    break;
                case 3 :
                    // src/org/plsql/PLSQL2.g:643:7: string_literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_literal_in_atom4218);
                    string_literal453=string_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, string_literal453.getTree());

                    }
                    break;
                case 4 :
                    // src/org/plsql/PLSQL2.g:644:7: numeric_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numeric_atom_in_atom4226);
                    numeric_atom454=numeric_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_atom454.getTree());

                    }
                    break;
                case 5 :
                    // src/org/plsql/PLSQL2.g:645:7: boolean_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_atom_in_atom4234);
                    boolean_atom455=boolean_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_atom455.getTree());

                    }
                    break;
                case 6 :
                    // src/org/plsql/PLSQL2.g:646:7: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL456=(Token)match(input,NULL,FOLLOW_NULL_in_atom4242); 
                    NULL456_tree = (Object)adaptor.create(NULL456);
                    adaptor.addChild(root_0, NULL456_tree);


                    }
                    break;
                case 7 :
                    // src/org/plsql/PLSQL2.g:647:7: LPAREN expression RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN457=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom4250); 
                    LPAREN457_tree = (Object)adaptor.create(LPAREN457);
                    adaptor.addChild(root_0, LPAREN457_tree);

                    pushFollow(FOLLOW_expression_in_atom4252);
                    expression458=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression458.getTree());
                    RPAREN459=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom4254); 
                    RPAREN459_tree = (Object)adaptor.create(RPAREN459);
                    adaptor.addChild(root_0, RPAREN459_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class variable_or_function_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_or_function_call"
    // src/org/plsql/PLSQL2.g:650:1: variable_or_function_call : call ( DOT call )* ( DOT delete_call )? ;
    public final PLSQL2Parser.variable_or_function_call_return variable_or_function_call() throws RecognitionException {
        PLSQL2Parser.variable_or_function_call_return retval = new PLSQL2Parser.variable_or_function_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT461=null;
        Token DOT463=null;
        PLSQL2Parser.call_return call460 = null;

        PLSQL2Parser.call_return call462 = null;

        PLSQL2Parser.delete_call_return delete_call464 = null;


        Object DOT461_tree=null;
        Object DOT463_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:651:5: ( call ( DOT call )* ( DOT delete_call )? )
            // src/org/plsql/PLSQL2.g:651:7: call ( DOT call )* ( DOT delete_call )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_call_in_variable_or_function_call4275);
            call460=call();

            state._fsp--;

            adaptor.addChild(root_0, call460.getTree());
            // src/org/plsql/PLSQL2.g:651:12: ( DOT call )*
            loop140:
            do {
                int alt140=2;
                int LA140_0 = input.LA(1);

                if ( (LA140_0==DOT) ) {
                    int LA140_1 = input.LA(2);

                    if ( (LA140_1==ID||LA140_1==COLON) ) {
                        alt140=1;
                    }


                }


                switch (alt140) {
            	case 1 :
            	    // src/org/plsql/PLSQL2.g:651:14: DOT call
            	    {
            	    DOT461=(Token)match(input,DOT,FOLLOW_DOT_in_variable_or_function_call4279); 
            	    DOT461_tree = (Object)adaptor.create(DOT461);
            	    adaptor.addChild(root_0, DOT461_tree);

            	    pushFollow(FOLLOW_call_in_variable_or_function_call4281);
            	    call462=call();

            	    state._fsp--;

            	    adaptor.addChild(root_0, call462.getTree());

            	    }
            	    break;

            	default :
            	    break loop140;
                }
            } while (true);

            // src/org/plsql/PLSQL2.g:651:26: ( DOT delete_call )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==DOT) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:651:28: DOT delete_call
                    {
                    DOT463=(Token)match(input,DOT,FOLLOW_DOT_in_variable_or_function_call4288); 
                    DOT463_tree = (Object)adaptor.create(DOT463);
                    adaptor.addChild(root_0, DOT463_tree);

                    pushFollow(FOLLOW_delete_call_in_variable_or_function_call4290);
                    delete_call464=delete_call();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_call464.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable_or_function_call"

    public static class attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute"
    // src/org/plsql/PLSQL2.g:654:1: attribute : ( BULK_ROWCOUNT LPAREN expression RPAREN | kFOUND | ISOPEN | NOTFOUND | kROWCOUNT );
    public final PLSQL2Parser.attribute_return attribute() throws RecognitionException {
        PLSQL2Parser.attribute_return retval = new PLSQL2Parser.attribute_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BULK_ROWCOUNT465=null;
        Token LPAREN466=null;
        Token RPAREN468=null;
        Token ISOPEN470=null;
        Token NOTFOUND471=null;
        PLSQL2Parser.expression_return expression467 = null;

        PLSQL2Parser.kFOUND_return kFOUND469 = null;

        PLSQL2Parser.kROWCOUNT_return kROWCOUNT472 = null;


        Object BULK_ROWCOUNT465_tree=null;
        Object LPAREN466_tree=null;
        Object RPAREN468_tree=null;
        Object ISOPEN470_tree=null;
        Object NOTFOUND471_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:655:5: ( BULK_ROWCOUNT LPAREN expression RPAREN | kFOUND | ISOPEN | NOTFOUND | kROWCOUNT )
            int alt142=5;
            switch ( input.LA(1) ) {
            case BULK_ROWCOUNT:
                {
                alt142=1;
                }
                break;
            case ID:
                {
                int LA142_2 = input.LA(2);

                if ( ((input.LT(1).getText().equalsIgnoreCase("found"))) ) {
                    alt142=2;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("rowcount"))) ) {
                    alt142=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 142, 2, input);

                    throw nvae;
                }
                }
                break;
            case ISOPEN:
                {
                alt142=3;
                }
                break;
            case NOTFOUND:
                {
                alt142=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }

            switch (alt142) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:655:7: BULK_ROWCOUNT LPAREN expression RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    BULK_ROWCOUNT465=(Token)match(input,BULK_ROWCOUNT,FOLLOW_BULK_ROWCOUNT_in_attribute4310); 
                    BULK_ROWCOUNT465_tree = (Object)adaptor.create(BULK_ROWCOUNT465);
                    adaptor.addChild(root_0, BULK_ROWCOUNT465_tree);

                    LPAREN466=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_attribute4312); 
                    LPAREN466_tree = (Object)adaptor.create(LPAREN466);
                    adaptor.addChild(root_0, LPAREN466_tree);

                    pushFollow(FOLLOW_expression_in_attribute4314);
                    expression467=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression467.getTree());
                    RPAREN468=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_attribute4316); 
                    RPAREN468_tree = (Object)adaptor.create(RPAREN468);
                    adaptor.addChild(root_0, RPAREN468_tree);


                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:656:7: kFOUND
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_kFOUND_in_attribute4324);
                    kFOUND469=kFOUND();

                    state._fsp--;

                    adaptor.addChild(root_0, kFOUND469.getTree());

                    }
                    break;
                case 3 :
                    // src/org/plsql/PLSQL2.g:657:7: ISOPEN
                    {
                    root_0 = (Object)adaptor.nil();

                    ISOPEN470=(Token)match(input,ISOPEN,FOLLOW_ISOPEN_in_attribute4332); 
                    ISOPEN470_tree = (Object)adaptor.create(ISOPEN470);
                    adaptor.addChild(root_0, ISOPEN470_tree);


                    }
                    break;
                case 4 :
                    // src/org/plsql/PLSQL2.g:658:7: NOTFOUND
                    {
                    root_0 = (Object)adaptor.nil();

                    NOTFOUND471=(Token)match(input,NOTFOUND,FOLLOW_NOTFOUND_in_attribute4340); 
                    NOTFOUND471_tree = (Object)adaptor.create(NOTFOUND471);
                    adaptor.addChild(root_0, NOTFOUND471_tree);


                    }
                    break;
                case 5 :
                    // src/org/plsql/PLSQL2.g:659:7: kROWCOUNT
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_kROWCOUNT_in_attribute4348);
                    kROWCOUNT472=kROWCOUNT();

                    state._fsp--;

                    adaptor.addChild(root_0, kROWCOUNT472.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attribute"

    public static class call_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call_args"
    // src/org/plsql/PLSQL2.g:662:1: call_args : LPAREN ( parameter ( COMMA parameter )* )? RPAREN ;
    public final PLSQL2Parser.call_args_return call_args() throws RecognitionException {
        PLSQL2Parser.call_args_return retval = new PLSQL2Parser.call_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN473=null;
        Token COMMA475=null;
        Token RPAREN477=null;
        PLSQL2Parser.parameter_return parameter474 = null;

        PLSQL2Parser.parameter_return parameter476 = null;


        Object LPAREN473_tree=null;
        Object COMMA475_tree=null;
        Object RPAREN477_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:663:5: ( LPAREN ( parameter ( COMMA parameter )* )? RPAREN )
            // src/org/plsql/PLSQL2.g:663:7: LPAREN ( parameter ( COMMA parameter )* )? RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN473=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_call_args4365); 
            LPAREN473_tree = (Object)adaptor.create(LPAREN473);
            adaptor.addChild(root_0, LPAREN473_tree);

            // src/org/plsql/PLSQL2.g:663:14: ( parameter ( COMMA parameter )* )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==ID||LA144_0==LPAREN||(LA144_0>=NOT && LA144_0<=NULL)||LA144_0==COLON||(LA144_0>=MINUS && LA144_0<=PLUS)||LA144_0==SQL||(LA144_0>=INTEGER && LA144_0<=QUOTED_STRING)||(LA144_0>=INSERTING && LA144_0<=DELETING)) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:663:16: parameter ( COMMA parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_call_args4369);
                    parameter474=parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter474.getTree());
                    // src/org/plsql/PLSQL2.g:663:26: ( COMMA parameter )*
                    loop143:
                    do {
                        int alt143=2;
                        int LA143_0 = input.LA(1);

                        if ( (LA143_0==COMMA) ) {
                            alt143=1;
                        }


                        switch (alt143) {
                    	case 1 :
                    	    // src/org/plsql/PLSQL2.g:663:28: COMMA parameter
                    	    {
                    	    COMMA475=(Token)match(input,COMMA,FOLLOW_COMMA_in_call_args4373); 
                    	    COMMA475_tree = (Object)adaptor.create(COMMA475);
                    	    adaptor.addChild(root_0, COMMA475_tree);

                    	    pushFollow(FOLLOW_parameter_in_call_args4375);
                    	    parameter476=parameter();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, parameter476.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop143;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN477=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_call_args4383); 
            RPAREN477_tree = (Object)adaptor.create(RPAREN477);
            adaptor.addChild(root_0, RPAREN477_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "call_args"

    public static class boolean_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_atom"
    // src/org/plsql/PLSQL2.g:666:1: boolean_atom : ( boolean_literal | collection_exists | conditional_predicate );
    public final PLSQL2Parser.boolean_atom_return boolean_atom() throws RecognitionException {
        PLSQL2Parser.boolean_atom_return retval = new PLSQL2Parser.boolean_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQL2Parser.boolean_literal_return boolean_literal478 = null;

        PLSQL2Parser.collection_exists_return collection_exists479 = null;

        PLSQL2Parser.conditional_predicate_return conditional_predicate480 = null;



        try {
            // src/org/plsql/PLSQL2.g:667:5: ( boolean_literal | collection_exists | conditional_predicate )
            int alt145=3;
            switch ( input.LA(1) ) {
            case TRUE:
            case FALSE:
                {
                alt145=1;
                }
                break;
            case ID:
                {
                alt145=2;
                }
                break;
            case INSERTING:
            case UPDATING:
            case DELETING:
                {
                alt145=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }

            switch (alt145) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:667:7: boolean_literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_literal_in_boolean_atom4400);
                    boolean_literal478=boolean_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_literal478.getTree());

                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:668:7: collection_exists
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collection_exists_in_boolean_atom4408);
                    collection_exists479=collection_exists();

                    state._fsp--;

                    adaptor.addChild(root_0, collection_exists479.getTree());

                    }
                    break;
                case 3 :
                    // src/org/plsql/PLSQL2.g:669:7: conditional_predicate
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_conditional_predicate_in_boolean_atom4416);
                    conditional_predicate480=conditional_predicate();

                    state._fsp--;

                    adaptor.addChild(root_0, conditional_predicate480.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "boolean_atom"

    public static class numeric_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_atom"
    // src/org/plsql/PLSQL2.g:672:1: numeric_atom : numeric_literal ;
    public final PLSQL2Parser.numeric_atom_return numeric_atom() throws RecognitionException {
        PLSQL2Parser.numeric_atom_return retval = new PLSQL2Parser.numeric_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQL2Parser.numeric_literal_return numeric_literal481 = null;



        try {
            // src/org/plsql/PLSQL2.g:673:5: ( numeric_literal )
            // src/org/plsql/PLSQL2.g:673:7: numeric_literal
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_numeric_literal_in_numeric_atom4433);
            numeric_literal481=numeric_literal();

            state._fsp--;

            adaptor.addChild(root_0, numeric_literal481.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numeric_atom"

    public static class numeric_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_literal"
    // src/org/plsql/PLSQL2.g:676:1: numeric_literal : ( INTEGER | REAL_NUMBER );
    public final PLSQL2Parser.numeric_literal_return numeric_literal() throws RecognitionException {
        PLSQL2Parser.numeric_literal_return retval = new PLSQL2Parser.numeric_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set482=null;

        Object set482_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:677:5: ( INTEGER | REAL_NUMBER )
            // src/org/plsql/PLSQL2.g:
            {
            root_0 = (Object)adaptor.nil();

            set482=(Token)input.LT(1);
            if ( (input.LA(1)>=INTEGER && input.LA(1)<=REAL_NUMBER) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set482));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numeric_literal"

    public static class boolean_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_literal"
    // src/org/plsql/PLSQL2.g:681:1: boolean_literal : ( TRUE | FALSE );
    public final PLSQL2Parser.boolean_literal_return boolean_literal() throws RecognitionException {
        PLSQL2Parser.boolean_literal_return retval = new PLSQL2Parser.boolean_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set483=null;

        Object set483_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:682:5: ( TRUE | FALSE )
            // src/org/plsql/PLSQL2.g:
            {
            root_0 = (Object)adaptor.nil();

            set483=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set483));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "boolean_literal"

    public static class string_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string_literal"
    // src/org/plsql/PLSQL2.g:686:1: string_literal : QUOTED_STRING ;
    public final PLSQL2Parser.string_literal_return string_literal() throws RecognitionException {
        PLSQL2Parser.string_literal_return retval = new PLSQL2Parser.string_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUOTED_STRING484=null;

        Object QUOTED_STRING484_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:687:5: ( QUOTED_STRING )
            // src/org/plsql/PLSQL2.g:687:7: QUOTED_STRING
            {
            root_0 = (Object)adaptor.nil();

            QUOTED_STRING484=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_string_literal4500); 
            QUOTED_STRING484_tree = (Object)adaptor.create(QUOTED_STRING484);
            adaptor.addChild(root_0, QUOTED_STRING484_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "string_literal"

    public static class collection_exists_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collection_exists"
    // src/org/plsql/PLSQL2.g:690:1: collection_exists : ID DOT EXISTS LPAREN expression RPAREN ;
    public final PLSQL2Parser.collection_exists_return collection_exists() throws RecognitionException {
        PLSQL2Parser.collection_exists_return retval = new PLSQL2Parser.collection_exists_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID485=null;
        Token DOT486=null;
        Token EXISTS487=null;
        Token LPAREN488=null;
        Token RPAREN490=null;
        PLSQL2Parser.expression_return expression489 = null;


        Object ID485_tree=null;
        Object DOT486_tree=null;
        Object EXISTS487_tree=null;
        Object LPAREN488_tree=null;
        Object RPAREN490_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:691:5: ( ID DOT EXISTS LPAREN expression RPAREN )
            // src/org/plsql/PLSQL2.g:691:7: ID DOT EXISTS LPAREN expression RPAREN
            {
            root_0 = (Object)adaptor.nil();

            ID485=(Token)match(input,ID,FOLLOW_ID_in_collection_exists4517); 
            ID485_tree = (Object)adaptor.create(ID485);
            adaptor.addChild(root_0, ID485_tree);

            DOT486=(Token)match(input,DOT,FOLLOW_DOT_in_collection_exists4519); 
            DOT486_tree = (Object)adaptor.create(DOT486);
            adaptor.addChild(root_0, DOT486_tree);

            EXISTS487=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_collection_exists4521); 
            EXISTS487_tree = (Object)adaptor.create(EXISTS487);
            adaptor.addChild(root_0, EXISTS487_tree);

            LPAREN488=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_collection_exists4523); 
            LPAREN488_tree = (Object)adaptor.create(LPAREN488);
            adaptor.addChild(root_0, LPAREN488_tree);

            pushFollow(FOLLOW_expression_in_collection_exists4525);
            expression489=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression489.getTree());
            RPAREN490=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_collection_exists4527); 
            RPAREN490_tree = (Object)adaptor.create(RPAREN490);
            adaptor.addChild(root_0, RPAREN490_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "collection_exists"

    public static class conditional_predicate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional_predicate"
    // src/org/plsql/PLSQL2.g:694:1: conditional_predicate : ( INSERTING | UPDATING ( LPAREN QUOTED_STRING RPAREN )? | DELETING );
    public final PLSQL2Parser.conditional_predicate_return conditional_predicate() throws RecognitionException {
        PLSQL2Parser.conditional_predicate_return retval = new PLSQL2Parser.conditional_predicate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERTING491=null;
        Token UPDATING492=null;
        Token LPAREN493=null;
        Token QUOTED_STRING494=null;
        Token RPAREN495=null;
        Token DELETING496=null;

        Object INSERTING491_tree=null;
        Object UPDATING492_tree=null;
        Object LPAREN493_tree=null;
        Object QUOTED_STRING494_tree=null;
        Object RPAREN495_tree=null;
        Object DELETING496_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:695:5: ( INSERTING | UPDATING ( LPAREN QUOTED_STRING RPAREN )? | DELETING )
            int alt147=3;
            switch ( input.LA(1) ) {
            case INSERTING:
                {
                alt147=1;
                }
                break;
            case UPDATING:
                {
                alt147=2;
                }
                break;
            case DELETING:
                {
                alt147=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }

            switch (alt147) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:695:7: INSERTING
                    {
                    root_0 = (Object)adaptor.nil();

                    INSERTING491=(Token)match(input,INSERTING,FOLLOW_INSERTING_in_conditional_predicate4544); 
                    INSERTING491_tree = (Object)adaptor.create(INSERTING491);
                    adaptor.addChild(root_0, INSERTING491_tree);


                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:696:7: UPDATING ( LPAREN QUOTED_STRING RPAREN )?
                    {
                    root_0 = (Object)adaptor.nil();

                    UPDATING492=(Token)match(input,UPDATING,FOLLOW_UPDATING_in_conditional_predicate4552); 
                    UPDATING492_tree = (Object)adaptor.create(UPDATING492);
                    adaptor.addChild(root_0, UPDATING492_tree);

                    // src/org/plsql/PLSQL2.g:696:16: ( LPAREN QUOTED_STRING RPAREN )?
                    int alt146=2;
                    int LA146_0 = input.LA(1);

                    if ( (LA146_0==LPAREN) ) {
                        alt146=1;
                    }
                    switch (alt146) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:696:18: LPAREN QUOTED_STRING RPAREN
                            {
                            LPAREN493=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditional_predicate4556); 
                            LPAREN493_tree = (Object)adaptor.create(LPAREN493);
                            adaptor.addChild(root_0, LPAREN493_tree);

                            QUOTED_STRING494=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_conditional_predicate4558); 
                            QUOTED_STRING494_tree = (Object)adaptor.create(QUOTED_STRING494);
                            adaptor.addChild(root_0, QUOTED_STRING494_tree);

                            RPAREN495=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_conditional_predicate4560); 
                            RPAREN495_tree = (Object)adaptor.create(RPAREN495);
                            adaptor.addChild(root_0, RPAREN495_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // src/org/plsql/PLSQL2.g:697:7: DELETING
                    {
                    root_0 = (Object)adaptor.nil();

                    DELETING496=(Token)match(input,DELETING,FOLLOW_DELETING_in_conditional_predicate4571); 
                    DELETING496_tree = (Object)adaptor.create(DELETING496);
                    adaptor.addChild(root_0, DELETING496_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditional_predicate"

    public static class parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // src/org/plsql/PLSQL2.g:700:1: parameter : ( ID ARROW )? expression ;
    public final PLSQL2Parser.parameter_return parameter() throws RecognitionException {
        PLSQL2Parser.parameter_return retval = new PLSQL2Parser.parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID497=null;
        Token ARROW498=null;
        PLSQL2Parser.expression_return expression499 = null;


        Object ID497_tree=null;
        Object ARROW498_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:701:5: ( ( ID ARROW )? expression )
            // src/org/plsql/PLSQL2.g:701:7: ( ID ARROW )? expression
            {
            root_0 = (Object)adaptor.nil();

            // src/org/plsql/PLSQL2.g:701:7: ( ID ARROW )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==ID) ) {
                int LA148_1 = input.LA(2);

                if ( (LA148_1==ARROW) ) {
                    alt148=1;
                }
            }
            switch (alt148) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:701:9: ID ARROW
                    {
                    ID497=(Token)match(input,ID,FOLLOW_ID_in_parameter4590); 
                    ID497_tree = (Object)adaptor.create(ID497);
                    adaptor.addChild(root_0, ID497_tree);

                    ARROW498=(Token)match(input,ARROW,FOLLOW_ARROW_in_parameter4592); 
                    ARROW498_tree = (Object)adaptor.create(ARROW498);
                    adaptor.addChild(root_0, ARROW498_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_parameter4597);
            expression499=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression499.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter"

    public static class index_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "index"
    // src/org/plsql/PLSQL2.g:704:1: index : expression ;
    public final PLSQL2Parser.index_return index() throws RecognitionException {
        PLSQL2Parser.index_return retval = new PLSQL2Parser.index_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PLSQL2Parser.expression_return expression500 = null;



        try {
            // src/org/plsql/PLSQL2.g:705:5: ( expression )
            // src/org/plsql/PLSQL2.g:705:7: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_index4614);
            expression500=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression500.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "index"

    public static class create_package_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_package"
    // src/org/plsql/PLSQL2.g:708:1: create_package : CREATE ( OR kREPLACE )? PACKAGE package_full_name ( invoker_rights_clause )? ( IS | AS ) ( declare_section )? END ( ID )? SEMI -> ^( PACKAGE package_full_name ( declare_section )? ) ;
    public final PLSQL2Parser.create_package_return create_package() throws RecognitionException {
        PLSQL2Parser.create_package_return retval = new PLSQL2Parser.create_package_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE501=null;
        Token OR502=null;
        Token PACKAGE504=null;
        Token IS507=null;
        Token AS508=null;
        Token END510=null;
        Token ID511=null;
        Token SEMI512=null;
        PLSQL2Parser.kREPLACE_return kREPLACE503 = null;

        PLSQL2Parser.package_full_name_return package_full_name505 = null;

        PLSQL2Parser.invoker_rights_clause_return invoker_rights_clause506 = null;

        PLSQL2Parser.declare_section_return declare_section509 = null;


        Object CREATE501_tree=null;
        Object OR502_tree=null;
        Object PACKAGE504_tree=null;
        Object IS507_tree=null;
        Object AS508_tree=null;
        Object END510_tree=null;
        Object ID511_tree=null;
        Object SEMI512_tree=null;
        RewriteRuleTokenStream stream_PACKAGE=new RewriteRuleTokenStream(adaptor,"token PACKAGE");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_package_full_name=new RewriteRuleSubtreeStream(adaptor,"rule package_full_name");
        RewriteRuleSubtreeStream stream_invoker_rights_clause=new RewriteRuleSubtreeStream(adaptor,"rule invoker_rights_clause");
        RewriteRuleSubtreeStream stream_declare_section=new RewriteRuleSubtreeStream(adaptor,"rule declare_section");
        RewriteRuleSubtreeStream stream_kREPLACE=new RewriteRuleSubtreeStream(adaptor,"rule kREPLACE");
        try {
            // src/org/plsql/PLSQL2.g:708:16: ( CREATE ( OR kREPLACE )? PACKAGE package_full_name ( invoker_rights_clause )? ( IS | AS ) ( declare_section )? END ( ID )? SEMI -> ^( PACKAGE package_full_name ( declare_section )? ) )
            // src/org/plsql/PLSQL2.g:709:9: CREATE ( OR kREPLACE )? PACKAGE package_full_name ( invoker_rights_clause )? ( IS | AS ) ( declare_section )? END ( ID )? SEMI
            {
            CREATE501=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_package4635);  
            stream_CREATE.add(CREATE501);

            // src/org/plsql/PLSQL2.g:709:16: ( OR kREPLACE )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==OR) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:709:18: OR kREPLACE
                    {
                    OR502=(Token)match(input,OR,FOLLOW_OR_in_create_package4639);  
                    stream_OR.add(OR502);

                    pushFollow(FOLLOW_kREPLACE_in_create_package4641);
                    kREPLACE503=kREPLACE();

                    state._fsp--;

                    stream_kREPLACE.add(kREPLACE503.getTree());

                    }
                    break;

            }

            PACKAGE504=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_create_package4646);  
            stream_PACKAGE.add(PACKAGE504);

            pushFollow(FOLLOW_package_full_name_in_create_package4648);
            package_full_name505=package_full_name();

            state._fsp--;

            stream_package_full_name.add(package_full_name505.getTree());
            // src/org/plsql/PLSQL2.g:710:9: ( invoker_rights_clause )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==AUTHID) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:710:11: invoker_rights_clause
                    {
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_package4660);
                    invoker_rights_clause506=invoker_rights_clause();

                    state._fsp--;

                    stream_invoker_rights_clause.add(invoker_rights_clause506.getTree());

                    }
                    break;

            }

            // src/org/plsql/PLSQL2.g:711:9: ( IS | AS )
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==IS) ) {
                alt151=1;
            }
            else if ( (LA151_0==AS) ) {
                alt151=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;
            }
            switch (alt151) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:711:11: IS
                    {
                    IS507=(Token)match(input,IS,FOLLOW_IS_in_create_package4675);  
                    stream_IS.add(IS507);


                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:711:16: AS
                    {
                    AS508=(Token)match(input,AS,FOLLOW_AS_in_create_package4679);  
                    stream_AS.add(AS508);


                    }
                    break;

            }

            // src/org/plsql/PLSQL2.g:711:21: ( declare_section )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( ((LA152_0>=PROCEDURE && LA152_0<=FUNCTION)||LA152_0==CURSOR||LA152_0==SUBTYPE||LA152_0==PRAGMA) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:711:23: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_create_package4685);
                    declare_section509=declare_section();

                    state._fsp--;

                    stream_declare_section.add(declare_section509.getTree());

                    }
                    break;

            }

            END510=(Token)match(input,END,FOLLOW_END_in_create_package4690);  
            stream_END.add(END510);

            // src/org/plsql/PLSQL2.g:711:46: ( ID )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==ID) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:711:48: ID
                    {
                    ID511=(Token)match(input,ID,FOLLOW_ID_in_create_package4694);  
                    stream_ID.add(ID511);


                    }
                    break;

            }

            SEMI512=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_package4699);  
            stream_SEMI.add(SEMI512);



            // AST REWRITE
            // elements: declare_section, package_full_name, PACKAGE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 711:59: -> ^( PACKAGE package_full_name ( declare_section )? )
            {
                // src/org/plsql/PLSQL2.g:711:62: ^( PACKAGE package_full_name ( declare_section )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PACKAGE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_package_full_name.nextTree());
                // src/org/plsql/PLSQL2.g:711:91: ( declare_section )?
                if ( stream_declare_section.hasNext() ) {
                    adaptor.addChild(root_1, stream_declare_section.nextTree());

                }
                stream_declare_section.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_package"

    public static class package_full_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "package_full_name"
    // src/org/plsql/PLSQL2.g:713:1: package_full_name : (schema_name= ID DOT )? package_name= ID ;
    public final PLSQL2Parser.package_full_name_return package_full_name() throws RecognitionException {
        PLSQL2Parser.package_full_name_return retval = new PLSQL2Parser.package_full_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token package_name=null;
        Token DOT513=null;

        Object schema_name_tree=null;
        Object package_name_tree=null;
        Object DOT513_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:713:18: ( (schema_name= ID DOT )? package_name= ID )
            // src/org/plsql/PLSQL2.g:714:5: (schema_name= ID DOT )? package_name= ID
            {
            root_0 = (Object)adaptor.nil();

            // src/org/plsql/PLSQL2.g:714:5: (schema_name= ID DOT )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==ID) ) {
                int LA154_1 = input.LA(2);

                if ( (LA154_1==DOT) ) {
                    alt154=1;
                }
            }
            switch (alt154) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:714:7: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_package_full_name4733); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT513=(Token)match(input,DOT,FOLLOW_DOT_in_package_full_name4735); 
                    DOT513_tree = (Object)adaptor.create(DOT513);
                    adaptor.addChild(root_0, DOT513_tree);


                    }
                    break;

            }

            package_name=(Token)match(input,ID,FOLLOW_ID_in_package_full_name4742); 
            package_name_tree = (Object)adaptor.create(package_name);
            adaptor.addChild(root_0, package_name_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "package_full_name"

    public static class create_package_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_package_body"
    // src/org/plsql/PLSQL2.g:717:1: create_package_body : CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID ( IS | AS ) ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI ;
    public final PLSQL2Parser.create_package_body_return create_package_body() throws RecognitionException {
        PLSQL2Parser.create_package_body_return retval = new PLSQL2Parser.create_package_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token package_name=null;
        Token package_name2=null;
        Token CREATE514=null;
        Token OR515=null;
        Token PACKAGE517=null;
        Token BODY518=null;
        Token DOT519=null;
        Token set520=null;
        Token END522=null;
        Token SEMI523=null;
        PLSQL2Parser.body_return initialize_section = null;

        PLSQL2Parser.kREPLACE_return kREPLACE516 = null;

        PLSQL2Parser.declare_section_return declare_section521 = null;


        Object schema_name_tree=null;
        Object package_name_tree=null;
        Object package_name2_tree=null;
        Object CREATE514_tree=null;
        Object OR515_tree=null;
        Object PACKAGE517_tree=null;
        Object BODY518_tree=null;
        Object DOT519_tree=null;
        Object set520_tree=null;
        Object END522_tree=null;
        Object SEMI523_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:717:21: ( CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID ( IS | AS ) ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI )
            // src/org/plsql/PLSQL2.g:718:9: CREATE ( OR kREPLACE )? PACKAGE BODY (schema_name= ID DOT )? package_name= ID ( IS | AS ) ( declare_section )? (initialize_section= body | END (package_name2= ID )? ) SEMI
            {
            root_0 = (Object)adaptor.nil();

            CREATE514=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_package_body4767); 
            CREATE514_tree = (Object)adaptor.create(CREATE514);
            adaptor.addChild(root_0, CREATE514_tree);

            // src/org/plsql/PLSQL2.g:718:16: ( OR kREPLACE )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==OR) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:718:18: OR kREPLACE
                    {
                    OR515=(Token)match(input,OR,FOLLOW_OR_in_create_package_body4771); 
                    OR515_tree = (Object)adaptor.create(OR515);
                    adaptor.addChild(root_0, OR515_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_package_body4773);
                    kREPLACE516=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE516.getTree());

                    }
                    break;

            }

            PACKAGE517=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_create_package_body4778); 
            PACKAGE517_tree = (Object)adaptor.create(PACKAGE517);
            adaptor.addChild(root_0, PACKAGE517_tree);

            BODY518=(Token)match(input,BODY,FOLLOW_BODY_in_create_package_body4780); 
            BODY518_tree = (Object)adaptor.create(BODY518);
            adaptor.addChild(root_0, BODY518_tree);

            // src/org/plsql/PLSQL2.g:718:46: (schema_name= ID DOT )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==ID) ) {
                int LA156_1 = input.LA(2);

                if ( (LA156_1==DOT) ) {
                    alt156=1;
                }
            }
            switch (alt156) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:718:48: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4786); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT519=(Token)match(input,DOT,FOLLOW_DOT_in_create_package_body4788); 
                    DOT519_tree = (Object)adaptor.create(DOT519);
                    adaptor.addChild(root_0, DOT519_tree);


                    }
                    break;

            }

            package_name=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4795); 
            package_name_tree = (Object)adaptor.create(package_name);
            adaptor.addChild(root_0, package_name_tree);

            set520=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set520));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // src/org/plsql/PLSQL2.g:719:21: ( declare_section )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( ((LA157_0>=PROCEDURE && LA157_0<=FUNCTION)||LA157_0==CURSOR||LA157_0==SUBTYPE||LA157_0==PRAGMA) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:719:23: declare_section
                    {
                    pushFollow(FOLLOW_declare_section_in_create_package_body4817);
                    declare_section521=declare_section();

                    state._fsp--;

                    adaptor.addChild(root_0, declare_section521.getTree());

                    }
                    break;

            }

            // src/org/plsql/PLSQL2.g:720:9: (initialize_section= body | END (package_name2= ID )? )
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==BEGIN) ) {
                alt159=1;
            }
            else if ( (LA159_0==END) ) {
                alt159=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;
            }
            switch (alt159) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:720:11: initialize_section= body
                    {
                    pushFollow(FOLLOW_body_in_create_package_body4834);
                    initialize_section=body();

                    state._fsp--;

                    adaptor.addChild(root_0, initialize_section.getTree());

                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:720:37: END (package_name2= ID )?
                    {
                    END522=(Token)match(input,END,FOLLOW_END_in_create_package_body4838); 
                    END522_tree = (Object)adaptor.create(END522);
                    adaptor.addChild(root_0, END522_tree);

                    // src/org/plsql/PLSQL2.g:720:41: (package_name2= ID )?
                    int alt158=2;
                    int LA158_0 = input.LA(1);

                    if ( (LA158_0==ID) ) {
                        alt158=1;
                    }
                    switch (alt158) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:720:43: package_name2= ID
                            {
                            package_name2=(Token)match(input,ID,FOLLOW_ID_in_create_package_body4844); 
                            package_name2_tree = (Object)adaptor.create(package_name2);
                            adaptor.addChild(root_0, package_name2_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            SEMI523=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_package_body4859); 
            SEMI523_tree = (Object)adaptor.create(SEMI523);
            adaptor.addChild(root_0, SEMI523_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_package_body"

    public static class create_procedure_return extends ParserRuleReturnScope {
        public HashMap r_procedureDef;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_procedure"
    // src/org/plsql/PLSQL2.g:724:1: create_procedure returns [HashMap r_procedureDef] : CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( parameter_declarations )? ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI -> ^( ID parameter_declarations ) ;
    public final PLSQL2Parser.create_procedure_return create_procedure() throws RecognitionException {
        PLSQL2Parser.create_procedure_return retval = new PLSQL2Parser.create_procedure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token procedure_name=null;
        Token CREATE524=null;
        Token OR525=null;
        Token PROCEDURE527=null;
        Token DOT528=null;
        Token IS531=null;
        Token AS532=null;
        Token EXTERNAL536=null;
        Token SEMI537=null;
        PLSQL2Parser.kREPLACE_return kREPLACE526 = null;

        PLSQL2Parser.parameter_declarations_return parameter_declarations529 = null;

        PLSQL2Parser.invoker_rights_clause_return invoker_rights_clause530 = null;

        PLSQL2Parser.declare_section_return declare_section533 = null;

        PLSQL2Parser.body_return body534 = null;

        PLSQL2Parser.call_spec_return call_spec535 = null;


        Object schema_name_tree=null;
        Object procedure_name_tree=null;
        Object CREATE524_tree=null;
        Object OR525_tree=null;
        Object PROCEDURE527_tree=null;
        Object DOT528_tree=null;
        Object IS531_tree=null;
        Object AS532_tree=null;
        Object EXTERNAL536_tree=null;
        Object SEMI537_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_EXTERNAL=new RewriteRuleTokenStream(adaptor,"token EXTERNAL");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_invoker_rights_clause=new RewriteRuleSubtreeStream(adaptor,"rule invoker_rights_clause");
        RewriteRuleSubtreeStream stream_call_spec=new RewriteRuleSubtreeStream(adaptor,"rule call_spec");
        RewriteRuleSubtreeStream stream_parameter_declarations=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declarations");
        RewriteRuleSubtreeStream stream_declare_section=new RewriteRuleSubtreeStream(adaptor,"rule declare_section");
        RewriteRuleSubtreeStream stream_kREPLACE=new RewriteRuleSubtreeStream(adaptor,"rule kREPLACE");
        try {
            // src/org/plsql/PLSQL2.g:724:50: ( CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( parameter_declarations )? ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI -> ^( ID parameter_declarations ) )
            // src/org/plsql/PLSQL2.g:725:1: CREATE ( OR kREPLACE )? PROCEDURE (schema_name= ID DOT )? procedure_name= ID ( parameter_declarations )? ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI
            {

            		retval.r_procedureDef = new HashMap();

            CREATE524=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_procedure4885);  
            stream_CREATE.add(CREATE524);

            // src/org/plsql/PLSQL2.g:728:16: ( OR kREPLACE )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==OR) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:728:18: OR kREPLACE
                    {
                    OR525=(Token)match(input,OR,FOLLOW_OR_in_create_procedure4889);  
                    stream_OR.add(OR525);

                    pushFollow(FOLLOW_kREPLACE_in_create_procedure4891);
                    kREPLACE526=kREPLACE();

                    state._fsp--;

                    stream_kREPLACE.add(kREPLACE526.getTree());

                    }
                    break;

            }

            PROCEDURE527=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_create_procedure4896);  
            stream_PROCEDURE.add(PROCEDURE527);

            // src/org/plsql/PLSQL2.g:728:43: (schema_name= ID DOT )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==ID) ) {
                int LA161_1 = input.LA(2);

                if ( (LA161_1==DOT) ) {
                    alt161=1;
                }
            }
            switch (alt161) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:728:45: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_procedure4902);  
                    stream_ID.add(schema_name);

                    DOT528=(Token)match(input,DOT,FOLLOW_DOT_in_create_procedure4904);  
                    stream_DOT.add(DOT528);


                    }
                    break;

            }

            procedure_name=(Token)match(input,ID,FOLLOW_ID_in_create_procedure4911);  
            stream_ID.add(procedure_name);


                        retval.r_procedureDef.put("id",(procedure_name!=null?procedure_name.getText():null));
                    
            // src/org/plsql/PLSQL2.g:732:9: ( parameter_declarations )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==LPAREN) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:732:9: parameter_declarations
                    {
                    pushFollow(FOLLOW_parameter_declarations_in_create_procedure4931);
                    parameter_declarations529=parameter_declarations();

                    state._fsp--;

                    stream_parameter_declarations.add(parameter_declarations529.getTree());

                    }
                    break;

            }


                    	retval.r_procedureDef.put("paramList",(parameter_declarations529!=null?parameter_declarations529.r_parameter_list:null));
                    

                    	m_procedureList.add(retval.r_procedureDef);
                    
            // src/org/plsql/PLSQL2.g:739:9: ( invoker_rights_clause )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==AUTHID) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:739:9: invoker_rights_clause
                    {
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_procedure4963);
                    invoker_rights_clause530=invoker_rights_clause();

                    state._fsp--;

                    stream_invoker_rights_clause.add(invoker_rights_clause530.getTree());

                    }
                    break;

            }

            // src/org/plsql/PLSQL2.g:740:9: ( IS | AS )
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==IS) ) {
                alt164=1;
            }
            else if ( (LA164_0==AS) ) {
                alt164=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 164, 0, input);

                throw nvae;
            }
            switch (alt164) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:740:11: IS
                    {
                    IS531=(Token)match(input,IS,FOLLOW_IS_in_create_procedure4976);  
                    stream_IS.add(IS531);


                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:740:16: AS
                    {
                    AS532=(Token)match(input,AS,FOLLOW_AS_in_create_procedure4980);  
                    stream_AS.add(AS532);


                    }
                    break;

            }

            // src/org/plsql/PLSQL2.g:741:9: ( ( declare_section )? body | call_spec | EXTERNAL )
            int alt166=3;
            switch ( input.LA(1) ) {
            case PROCEDURE:
            case ID:
            case FUNCTION:
            case CURSOR:
            case SUBTYPE:
            case BEGIN:
            case PRAGMA:
                {
                alt166=1;
                }
                break;
            case LANGUAGE:
                {
                alt166=2;
                }
                break;
            case EXTERNAL:
                {
                alt166=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;
            }

            switch (alt166) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:741:11: ( declare_section )? body
                    {
                    // src/org/plsql/PLSQL2.g:741:11: ( declare_section )?
                    int alt165=2;
                    int LA165_0 = input.LA(1);

                    if ( ((LA165_0>=PROCEDURE && LA165_0<=FUNCTION)||LA165_0==CURSOR||LA165_0==SUBTYPE||LA165_0==PRAGMA) ) {
                        alt165=1;
                    }
                    switch (alt165) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:741:11: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_create_procedure4994);
                            declare_section533=declare_section();

                            state._fsp--;

                            stream_declare_section.add(declare_section533.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_create_procedure4997);
                    body534=body();

                    state._fsp--;

                    stream_body.add(body534.getTree());

                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:742:11: call_spec
                    {
                    pushFollow(FOLLOW_call_spec_in_create_procedure5011);
                    call_spec535=call_spec();

                    state._fsp--;

                    stream_call_spec.add(call_spec535.getTree());

                    }
                    break;
                case 3 :
                    // src/org/plsql/PLSQL2.g:743:11: EXTERNAL
                    {
                    EXTERNAL536=(Token)match(input,EXTERNAL,FOLLOW_EXTERNAL_in_create_procedure5038);  
                    stream_EXTERNAL.add(EXTERNAL536);


                    }
                    break;

            }

            SEMI537=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_procedure5067);  
            stream_SEMI.add(SEMI537);



            // AST REWRITE
            // elements: ID, parameter_declarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 744:18: -> ^( ID parameter_declarations )
            {
                // src/org/plsql/PLSQL2.g:744:21: ^( ID parameter_declarations )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);

                adaptor.addChild(root_1, stream_parameter_declarations.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_procedure"

    public static class create_function_return extends ParserRuleReturnScope {
        public HashMap r_functionDef;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_function"
    // src/org/plsql/PLSQL2.g:747:1: create_function returns [HashMap r_functionDef] : CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID (temp9= parameter_declarations )? RETURN datatype ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI ;
    public final PLSQL2Parser.create_function_return create_function() throws RecognitionException {
        PLSQL2Parser.create_function_return retval = new PLSQL2Parser.create_function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token schema_name=null;
        Token function_name=null;
        Token CREATE538=null;
        Token OR539=null;
        Token FUNCTION541=null;
        Token DOT542=null;
        Token RETURN543=null;
        Token set546=null;
        Token EXTERNAL550=null;
        Token SEMI551=null;
        PLSQL2Parser.parameter_declarations_return temp9 = null;

        PLSQL2Parser.kREPLACE_return kREPLACE540 = null;

        PLSQL2Parser.datatype_return datatype544 = null;

        PLSQL2Parser.invoker_rights_clause_return invoker_rights_clause545 = null;

        PLSQL2Parser.declare_section_return declare_section547 = null;

        PLSQL2Parser.body_return body548 = null;

        PLSQL2Parser.call_spec_return call_spec549 = null;


        Object schema_name_tree=null;
        Object function_name_tree=null;
        Object CREATE538_tree=null;
        Object OR539_tree=null;
        Object FUNCTION541_tree=null;
        Object DOT542_tree=null;
        Object RETURN543_tree=null;
        Object set546_tree=null;
        Object EXTERNAL550_tree=null;
        Object SEMI551_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:747:49: ( CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID (temp9= parameter_declarations )? RETURN datatype ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI )
            // src/org/plsql/PLSQL2.g:748:3: CREATE ( OR kREPLACE )? FUNCTION (schema_name= ID DOT )? function_name= ID (temp9= parameter_declarations )? RETURN datatype ( invoker_rights_clause )? ( IS | AS ) ( ( declare_section )? body | call_spec | EXTERNAL ) SEMI
            {
            root_0 = (Object)adaptor.nil();


            			retval.r_functionDef = new HashMap();
            		
            CREATE538=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_function5109); 
            CREATE538_tree = (Object)adaptor.create(CREATE538);
            adaptor.addChild(root_0, CREATE538_tree);

            // src/org/plsql/PLSQL2.g:751:16: ( OR kREPLACE )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==OR) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:751:18: OR kREPLACE
                    {
                    OR539=(Token)match(input,OR,FOLLOW_OR_in_create_function5113); 
                    OR539_tree = (Object)adaptor.create(OR539);
                    adaptor.addChild(root_0, OR539_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_function5115);
                    kREPLACE540=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE540.getTree());

                    }
                    break;

            }

            FUNCTION541=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_create_function5120); 
            FUNCTION541_tree = (Object)adaptor.create(FUNCTION541);
            adaptor.addChild(root_0, FUNCTION541_tree);

            // src/org/plsql/PLSQL2.g:751:42: (schema_name= ID DOT )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==ID) ) {
                int LA168_1 = input.LA(2);

                if ( (LA168_1==DOT) ) {
                    alt168=1;
                }
            }
            switch (alt168) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:751:44: schema_name= ID DOT
                    {
                    schema_name=(Token)match(input,ID,FOLLOW_ID_in_create_function5126); 
                    schema_name_tree = (Object)adaptor.create(schema_name);
                    adaptor.addChild(root_0, schema_name_tree);

                    DOT542=(Token)match(input,DOT,FOLLOW_DOT_in_create_function5128); 
                    DOT542_tree = (Object)adaptor.create(DOT542);
                    adaptor.addChild(root_0, DOT542_tree);


                    }
                    break;

            }

            function_name=(Token)match(input,ID,FOLLOW_ID_in_create_function5135); 
            function_name_tree = (Object)adaptor.create(function_name);
            adaptor.addChild(root_0, function_name_tree);


                    	retval.r_functionDef.put("id",(function_name!=null?function_name.getText():null));
                    
            // src/org/plsql/PLSQL2.g:756:4: (temp9= parameter_declarations )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==LPAREN) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:756:5: temp9= parameter_declarations
                    {
                    pushFollow(FOLLOW_parameter_declarations_in_create_function5155);
                    temp9=parameter_declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, temp9.getTree());

                    }
                    break;

            }


                    	retval.r_functionDef.put("paramList",(temp9!=null?temp9.r_parameter_list:null));
                    
            RETURN543=(Token)match(input,RETURN,FOLLOW_RETURN_in_create_function5175); 
            RETURN543_tree = (Object)adaptor.create(RETURN543);
            adaptor.addChild(root_0, RETURN543_tree);

            pushFollow(FOLLOW_datatype_in_create_function5177);
            datatype544=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype544.getTree());

                    	retval.r_functionDef.put("returnType",(datatype544!=null?input.toString(datatype544.start,datatype544.stop):null));
                    
            // src/org/plsql/PLSQL2.g:764:9: ( invoker_rights_clause )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==AUTHID) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:764:9: invoker_rights_clause
                    {
                    pushFollow(FOLLOW_invoker_rights_clause_in_create_function5197);
                    invoker_rights_clause545=invoker_rights_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, invoker_rights_clause545.getTree());

                    }
                    break;

            }

            set546=(Token)input.LT(1);
            if ( input.LA(1)==IS||input.LA(1)==AS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set546));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // src/org/plsql/PLSQL2.g:766:9: ( ( declare_section )? body | call_spec | EXTERNAL )
            int alt172=3;
            switch ( input.LA(1) ) {
            case PROCEDURE:
            case ID:
            case FUNCTION:
            case CURSOR:
            case SUBTYPE:
            case BEGIN:
            case PRAGMA:
                {
                alt172=1;
                }
                break;
            case LANGUAGE:
                {
                alt172=2;
                }
                break;
            case EXTERNAL:
                {
                alt172=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 172, 0, input);

                throw nvae;
            }

            switch (alt172) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:766:11: ( declare_section )? body
                    {
                    // src/org/plsql/PLSQL2.g:766:11: ( declare_section )?
                    int alt171=2;
                    int LA171_0 = input.LA(1);

                    if ( ((LA171_0>=PROCEDURE && LA171_0<=FUNCTION)||LA171_0==CURSOR||LA171_0==SUBTYPE||LA171_0==PRAGMA) ) {
                        alt171=1;
                    }
                    switch (alt171) {
                        case 1 :
                            // src/org/plsql/PLSQL2.g:766:11: declare_section
                            {
                            pushFollow(FOLLOW_declare_section_in_create_function5228);
                            declare_section547=declare_section();

                            state._fsp--;

                            adaptor.addChild(root_0, declare_section547.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_create_function5231);
                    body548=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body548.getTree());

                    }
                    break;
                case 2 :
                    // src/org/plsql/PLSQL2.g:767:11: call_spec
                    {
                    pushFollow(FOLLOW_call_spec_in_create_function5243);
                    call_spec549=call_spec();

                    state._fsp--;

                    adaptor.addChild(root_0, call_spec549.getTree());

                    }
                    break;
                case 3 :
                    // src/org/plsql/PLSQL2.g:768:11: EXTERNAL
                    {
                    EXTERNAL550=(Token)match(input,EXTERNAL,FOLLOW_EXTERNAL_in_create_function5255); 
                    EXTERNAL550_tree = (Object)adaptor.create(EXTERNAL550);
                    adaptor.addChild(root_0, EXTERNAL550_tree);


                    }
                    break;

            }

            SEMI551=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_function5267); 
            SEMI551_tree = (Object)adaptor.create(SEMI551);
            adaptor.addChild(root_0, SEMI551_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_function"

    public static class invoker_rights_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "invoker_rights_clause"
    // src/org/plsql/PLSQL2.g:772:1: invoker_rights_clause : AUTHID ( CURRENT_USER | DEFINER ) ;
    public final PLSQL2Parser.invoker_rights_clause_return invoker_rights_clause() throws RecognitionException {
        PLSQL2Parser.invoker_rights_clause_return retval = new PLSQL2Parser.invoker_rights_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AUTHID552=null;
        Token set553=null;

        Object AUTHID552_tree=null;
        Object set553_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:772:23: ( AUTHID ( CURRENT_USER | DEFINER ) )
            // src/org/plsql/PLSQL2.g:773:9: AUTHID ( CURRENT_USER | DEFINER )
            {
            root_0 = (Object)adaptor.nil();

            AUTHID552=(Token)match(input,AUTHID,FOLLOW_AUTHID_in_invoker_rights_clause5288); 
            AUTHID552_tree = (Object)adaptor.create(AUTHID552);
            adaptor.addChild(root_0, AUTHID552_tree);

            set553=(Token)input.LT(1);
            if ( (input.LA(1)>=CURRENT_USER && input.LA(1)<=DEFINER) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set553));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "invoker_rights_clause"

    public static class call_spec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call_spec"
    // src/org/plsql/PLSQL2.g:776:1: call_spec : LANGUAGE swallow_to_semi ;
    public final PLSQL2Parser.call_spec_return call_spec() throws RecognitionException {
        PLSQL2Parser.call_spec_return retval = new PLSQL2Parser.call_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LANGUAGE554=null;
        PLSQL2Parser.swallow_to_semi_return swallow_to_semi555 = null;


        Object LANGUAGE554_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:777:5: ( LANGUAGE swallow_to_semi )
            // src/org/plsql/PLSQL2.g:777:7: LANGUAGE swallow_to_semi
            {
            root_0 = (Object)adaptor.nil();

            LANGUAGE554=(Token)match(input,LANGUAGE,FOLLOW_LANGUAGE_in_call_spec5315); 
            LANGUAGE554_tree = (Object)adaptor.create(LANGUAGE554);
            adaptor.addChild(root_0, LANGUAGE554_tree);

            pushFollow(FOLLOW_swallow_to_semi_in_call_spec5317);
            swallow_to_semi555=swallow_to_semi();

            state._fsp--;

            adaptor.addChild(root_0, swallow_to_semi555.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "call_spec"

    public static class create_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create_type"
    // src/org/plsql/PLSQL2.g:780:1: create_type : CREATE ( OR kREPLACE )? type_definition ;
    public final PLSQL2Parser.create_type_return create_type() throws RecognitionException {
        PLSQL2Parser.create_type_return retval = new PLSQL2Parser.create_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE556=null;
        Token OR557=null;
        PLSQL2Parser.kREPLACE_return kREPLACE558 = null;

        PLSQL2Parser.type_definition_return type_definition559 = null;


        Object CREATE556_tree=null;
        Object OR557_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:780:13: ( CREATE ( OR kREPLACE )? type_definition )
            // src/org/plsql/PLSQL2.g:781:5: CREATE ( OR kREPLACE )? type_definition
            {
            root_0 = (Object)adaptor.nil();

            CREATE556=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_type5334); 
            CREATE556_tree = (Object)adaptor.create(CREATE556);
            adaptor.addChild(root_0, CREATE556_tree);

            // src/org/plsql/PLSQL2.g:781:12: ( OR kREPLACE )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==OR) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // src/org/plsql/PLSQL2.g:781:14: OR kREPLACE
                    {
                    OR557=(Token)match(input,OR,FOLLOW_OR_in_create_type5338); 
                    OR557_tree = (Object)adaptor.create(OR557);
                    adaptor.addChild(root_0, OR557_tree);

                    pushFollow(FOLLOW_kREPLACE_in_create_type5340);
                    kREPLACE558=kREPLACE();

                    state._fsp--;

                    adaptor.addChild(root_0, kREPLACE558.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_type_definition_in_create_type5345);
            type_definition559=type_definition();

            state._fsp--;

            adaptor.addChild(root_0, type_definition559.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create_type"

    public static class kERRORS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kERRORS"
    // src/org/plsql/PLSQL2.g:784:1: kERRORS : {...}? ID ;
    public final PLSQL2Parser.kERRORS_return kERRORS() throws RecognitionException {
        PLSQL2Parser.kERRORS_return retval = new PLSQL2Parser.kERRORS_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID560=null;

        Object ID560_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:784:9: ({...}? ID )
            // src/org/plsql/PLSQL2.g:784:11: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().length() >= 3 && "errors".startsWith(input.LT(1).getText().toLowerCase()))) ) {
                throw new FailedPredicateException(input, "kERRORS", "input.LT(1).getText().length() >= 3 && \"errors\".startsWith(input.LT(1).getText().toLowerCase())");
            }
            ID560=(Token)match(input,ID,FOLLOW_ID_in_kERRORS5356); 
            ID560_tree = (Object)adaptor.create(ID560);
            adaptor.addChild(root_0, ID560_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kERRORS"

    public static class kEXCEPTIONS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kEXCEPTIONS"
    // src/org/plsql/PLSQL2.g:785:1: kEXCEPTIONS : {...}? ID ;
    public final PLSQL2Parser.kEXCEPTIONS_return kEXCEPTIONS() throws RecognitionException {
        PLSQL2Parser.kEXCEPTIONS_return retval = new PLSQL2Parser.kEXCEPTIONS_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID561=null;

        Object ID561_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:785:13: ({...}? ID )
            // src/org/plsql/PLSQL2.g:785:15: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("exceptions"))) ) {
                throw new FailedPredicateException(input, "kEXCEPTIONS", "input.LT(1).getText().equalsIgnoreCase(\"exceptions\")");
            }
            ID561=(Token)match(input,ID,FOLLOW_ID_in_kEXCEPTIONS5365); 
            ID561_tree = (Object)adaptor.create(ID561);
            adaptor.addChild(root_0, ID561_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kEXCEPTIONS"

    public static class kFOUND_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kFOUND"
    // src/org/plsql/PLSQL2.g:786:1: kFOUND : {...}? ID ;
    public final PLSQL2Parser.kFOUND_return kFOUND() throws RecognitionException {
        PLSQL2Parser.kFOUND_return retval = new PLSQL2Parser.kFOUND_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID562=null;

        Object ID562_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:786:8: ({...}? ID )
            // src/org/plsql/PLSQL2.g:786:10: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("found"))) ) {
                throw new FailedPredicateException(input, "kFOUND", "input.LT(1).getText().equalsIgnoreCase(\"found\")");
            }
            ID562=(Token)match(input,ID,FOLLOW_ID_in_kFOUND5374); 
            ID562_tree = (Object)adaptor.create(ID562);
            adaptor.addChild(root_0, ID562_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kFOUND"

    public static class kINDICES_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kINDICES"
    // src/org/plsql/PLSQL2.g:787:1: kINDICES : {...}? ID ;
    public final PLSQL2Parser.kINDICES_return kINDICES() throws RecognitionException {
        PLSQL2Parser.kINDICES_return retval = new PLSQL2Parser.kINDICES_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID563=null;

        Object ID563_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:787:10: ({...}? ID )
            // src/org/plsql/PLSQL2.g:787:12: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("indices"))) ) {
                throw new FailedPredicateException(input, "kINDICES", "input.LT(1).getText().equalsIgnoreCase(\"indices\")");
            }
            ID563=(Token)match(input,ID,FOLLOW_ID_in_kINDICES5383); 
            ID563_tree = (Object)adaptor.create(ID563);
            adaptor.addChild(root_0, ID563_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kINDICES"

    public static class kMOD_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kMOD"
    // src/org/plsql/PLSQL2.g:788:1: kMOD : {...}? ID ;
    public final PLSQL2Parser.kMOD_return kMOD() throws RecognitionException {
        PLSQL2Parser.kMOD_return retval = new PLSQL2Parser.kMOD_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID564=null;

        Object ID564_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:788:6: ({...}? ID )
            // src/org/plsql/PLSQL2.g:788:8: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("mod"))) ) {
                throw new FailedPredicateException(input, "kMOD", "input.LT(1).getText().equalsIgnoreCase(\"mod\")");
            }
            ID564=(Token)match(input,ID,FOLLOW_ID_in_kMOD5392); 
            ID564_tree = (Object)adaptor.create(ID564);
            adaptor.addChild(root_0, ID564_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kMOD"

    public static class kNAME_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kNAME"
    // src/org/plsql/PLSQL2.g:789:1: kNAME : {...}? ID ;
    public final PLSQL2Parser.kNAME_return kNAME() throws RecognitionException {
        PLSQL2Parser.kNAME_return retval = new PLSQL2Parser.kNAME_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID565=null;

        Object ID565_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:789:7: ({...}? ID )
            // src/org/plsql/PLSQL2.g:789:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("name"))) ) {
                throw new FailedPredicateException(input, "kNAME", "input.LT(1).getText().equalsIgnoreCase(\"name\")");
            }
            ID565=(Token)match(input,ID,FOLLOW_ID_in_kNAME5401); 
            ID565_tree = (Object)adaptor.create(ID565);
            adaptor.addChild(root_0, ID565_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kNAME"

    public static class kOF_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kOF"
    // src/org/plsql/PLSQL2.g:790:1: kOF : {...}? ID ;
    public final PLSQL2Parser.kOF_return kOF() throws RecognitionException {
        PLSQL2Parser.kOF_return retval = new PLSQL2Parser.kOF_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID566=null;

        Object ID566_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:790:5: ({...}? ID )
            // src/org/plsql/PLSQL2.g:790:7: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("of"))) ) {
                throw new FailedPredicateException(input, "kOF", "input.LT(1).getText().equalsIgnoreCase(\"of\")");
            }
            ID566=(Token)match(input,ID,FOLLOW_ID_in_kOF5410); 
            ID566_tree = (Object)adaptor.create(ID566);
            adaptor.addChild(root_0, ID566_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kOF"

    public static class kREPLACE_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kREPLACE"
    // src/org/plsql/PLSQL2.g:791:1: kREPLACE : {...}? ID ;
    public final PLSQL2Parser.kREPLACE_return kREPLACE() throws RecognitionException {
        PLSQL2Parser.kREPLACE_return retval = new PLSQL2Parser.kREPLACE_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID567=null;

        Object ID567_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:791:10: ({...}? ID )
            // src/org/plsql/PLSQL2.g:791:12: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("replace"))) ) {
                throw new FailedPredicateException(input, "kREPLACE", "input.LT(1).getText().equalsIgnoreCase(\"replace\")");
            }
            ID567=(Token)match(input,ID,FOLLOW_ID_in_kREPLACE5419); 
            ID567_tree = (Object)adaptor.create(ID567);
            adaptor.addChild(root_0, ID567_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kREPLACE"

    public static class kROWCOUNT_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kROWCOUNT"
    // src/org/plsql/PLSQL2.g:792:1: kROWCOUNT : {...}? ID ;
    public final PLSQL2Parser.kROWCOUNT_return kROWCOUNT() throws RecognitionException {
        PLSQL2Parser.kROWCOUNT_return retval = new PLSQL2Parser.kROWCOUNT_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID568=null;

        Object ID568_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:792:11: ({...}? ID )
            // src/org/plsql/PLSQL2.g:792:13: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("rowcount"))) ) {
                throw new FailedPredicateException(input, "kROWCOUNT", "input.LT(1).getText().equalsIgnoreCase(\"rowcount\")");
            }
            ID568=(Token)match(input,ID,FOLLOW_ID_in_kROWCOUNT5428); 
            ID568_tree = (Object)adaptor.create(ID568);
            adaptor.addChild(root_0, ID568_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kROWCOUNT"

    public static class kSAVE_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kSAVE"
    // src/org/plsql/PLSQL2.g:793:1: kSAVE : {...}? ID ;
    public final PLSQL2Parser.kSAVE_return kSAVE() throws RecognitionException {
        PLSQL2Parser.kSAVE_return retval = new PLSQL2Parser.kSAVE_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID569=null;

        Object ID569_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:793:7: ({...}? ID )
            // src/org/plsql/PLSQL2.g:793:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("save"))) ) {
                throw new FailedPredicateException(input, "kSAVE", "input.LT(1).getText().equalsIgnoreCase(\"save\")");
            }
            ID569=(Token)match(input,ID,FOLLOW_ID_in_kSAVE5437); 
            ID569_tree = (Object)adaptor.create(ID569);
            adaptor.addChild(root_0, ID569_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kSAVE"

    public static class kSHOW_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kSHOW"
    // src/org/plsql/PLSQL2.g:794:1: kSHOW : {...}? ID ;
    public final PLSQL2Parser.kSHOW_return kSHOW() throws RecognitionException {
        PLSQL2Parser.kSHOW_return retval = new PLSQL2Parser.kSHOW_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID570=null;

        Object ID570_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:794:7: ({...}? ID )
            // src/org/plsql/PLSQL2.g:794:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("show"))) ) {
                throw new FailedPredicateException(input, "kSHOW", "input.LT(1).getText().equalsIgnoreCase(\"show\")");
            }
            ID570=(Token)match(input,ID,FOLLOW_ID_in_kSHOW5446); 
            ID570_tree = (Object)adaptor.create(ID570);
            adaptor.addChild(root_0, ID570_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kSHOW"

    public static class kTYPE_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kTYPE"
    // src/org/plsql/PLSQL2.g:795:1: kTYPE : {...}? ID ;
    public final PLSQL2Parser.kTYPE_return kTYPE() throws RecognitionException {
        PLSQL2Parser.kTYPE_return retval = new PLSQL2Parser.kTYPE_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID571=null;

        Object ID571_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:795:7: ({...}? ID )
            // src/org/plsql/PLSQL2.g:795:9: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("type"))) ) {
                throw new FailedPredicateException(input, "kTYPE", "input.LT(1).getText().equalsIgnoreCase(\"type\")");
            }
            ID571=(Token)match(input,ID,FOLLOW_ID_in_kTYPE5455); 
            ID571_tree = (Object)adaptor.create(ID571);
            adaptor.addChild(root_0, ID571_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kTYPE"

    public static class kVALUES_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kVALUES"
    // src/org/plsql/PLSQL2.g:796:1: kVALUES : {...}? ID ;
    public final PLSQL2Parser.kVALUES_return kVALUES() throws RecognitionException {
        PLSQL2Parser.kVALUES_return retval = new PLSQL2Parser.kVALUES_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID572=null;

        Object ID572_tree=null;

        try {
            // src/org/plsql/PLSQL2.g:796:9: ({...}? ID )
            // src/org/plsql/PLSQL2.g:796:11: {...}? ID
            {
            root_0 = (Object)adaptor.nil();

            if ( !((input.LT(1).getText().equalsIgnoreCase("values"))) ) {
                throw new FailedPredicateException(input, "kVALUES", "input.LT(1).getText().equalsIgnoreCase(\"values\")");
            }
            ID572=(Token)match(input,ID,FOLLOW_ID_in_kVALUES5464); 
            ID572_tree = (Object)adaptor.create(ID572);
            adaptor.addChild(root_0, ID572_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kVALUES"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA96 dfa96 = new DFA96(this);
    protected DFA139 dfa139 = new DFA139(this);
    static final String DFA5_eotS =
        "\12\uffff";
    static final String DFA5_eofS =
        "\12\uffff";
    static final String DFA5_minS =
        "\1\163\1\6\1\7\1\uffff\1\7\2\uffff\1\6\2\uffff";
    static final String DFA5_maxS =
        "\1\163\1\164\1\7\1\uffff\1\165\2\uffff\1\164\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\1\4\1\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\12\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\6\1\5\1\3\44\uffff\1\2\106\uffff\1\4",
            "\1\7",
            "",
            "\1\11\155\uffff\1\10",
            "",
            "",
            "\1\6\1\5\1\3\153\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "100:1: create_object : ( create_package | create_package_body | create_function | create_procedure | create_type );";
        }
    }
    static final String DFA15_eotS =
        "\13\uffff";
    static final String DFA15_eofS =
        "\13\uffff";
    static final String DFA15_minS =
        "\1\6\1\uffff\1\7\6\uffff\1\5\1\uffff";
    static final String DFA15_maxS =
        "\1\112\1\uffff\1\42\6\uffff\1\44\1\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\10\1\uffff\1\2\1\3\1\5\1\6\1\7\1\4\1\uffff\1\1";
    static final String DFA15_specialS =
        "\13\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\6\1\2\1\5\11\uffff\1\4\6\uffff\1\3\20\uffff\2\1\36\uffff"+
            "\1\7",
            "",
            "\1\11\16\uffff\2\10\12\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10\4\uffff\1\10\2\uffff\2\10\4\uffff\1\12\1\10\3\uffff"+
            "\1\12\12\uffff\2\10",
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
            return "()+ loopback of 191:5: ( type_definition SEMI | subtype_definition SEMI | cursor_definition SEMI | item_declaration SEMI | function_declaration_or_definition SEMI | procedure_declaration_or_definition SEMI | pragma SEMI )+";
        }
    }
    static final String DFA96_eotS =
        "\17\uffff";
    static final String DFA96_eofS =
        "\17\uffff";
    static final String DFA96_minS =
        "\1\7\2\uffff\1\0\13\uffff";
    static final String DFA96_maxS =
        "\1\161\2\uffff\1\0\13\uffff";
    static final String DFA96_acceptS =
        "\1\uffff\1\1\13\uffff\1\2\1\3";
    static final String DFA96_specialS =
        "\3\uffff\1\0\13\uffff}>";
    static final String[] DFA96_transitionS = {
            "\1\3\2\uffff\1\1\12\uffff\1\1\32\uffff\1\1\57\uffff\2\1\3\uffff"+
            "\1\1\3\uffff\5\1\1\uffff\3\1",
            "",
            "",
            "\1\uffff",
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

    static final short[] DFA96_eot = DFA.unpackEncodedString(DFA96_eotS);
    static final short[] DFA96_eof = DFA.unpackEncodedString(DFA96_eofS);
    static final char[] DFA96_min = DFA.unpackEncodedStringToUnsignedChars(DFA96_minS);
    static final char[] DFA96_max = DFA.unpackEncodedStringToUnsignedChars(DFA96_maxS);
    static final short[] DFA96_accept = DFA.unpackEncodedString(DFA96_acceptS);
    static final short[] DFA96_special = DFA.unpackEncodedString(DFA96_specialS);
    static final short[][] DFA96_transition;

    static {
        int numStates = DFA96_transitionS.length;
        DFA96_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA96_transition[i] = DFA.unpackEncodedString(DFA96_transitionS[i]);
        }
    }

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = DFA96_eot;
            this.eof = DFA96_eof;
            this.min = DFA96_min;
            this.max = DFA96_max;
            this.accept = DFA96_accept;
            this.special = DFA96_special;
            this.transition = DFA96_transition;
        }
        public String getDescription() {
            return "472:1: bounds_clause : ( numeric_expression DOUBLEDOT numeric_expression | kINDICES kOF atom ( BETWEEN numeric_expression AND numeric_expression )? | kVALUES kOF atom );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA96_3 = input.LA(1);

                         
                        int index96_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((((input.LT(1).getText().equalsIgnoreCase("indices"))||(input.LT(1).getText().equalsIgnoreCase("values")))))) ) {s = 1;}

                        else if ( ((input.LT(1).getText().equalsIgnoreCase("indices"))) ) {s = 13;}

                        else if ( ((input.LT(1).getText().equalsIgnoreCase("values"))) ) {s = 14;}

                         
                        input.seek(index96_3);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 96, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA139_eotS =
        "\12\uffff";
    static final String DFA139_eofS =
        "\2\uffff\1\1\7\uffff";
    static final String DFA139_minS =
        "\1\7\1\uffff\1\4\6\uffff\1\7";
    static final String DFA139_maxS =
        "\1\161\1\uffff\1\144\6\uffff\1\156";
    static final String DFA139_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff";
    static final String DFA139_specialS =
        "\12\uffff}>";
    static final String[] DFA139_transitionS = {
            "\1\2\2\uffff\1\10\12\uffff\1\7\32\uffff\1\1\64\uffff\1\3\3"+
            "\uffff\2\5\2\6\1\4\1\uffff\3\6",
            "",
            "\2\1\1\uffff\1\1\1\uffff\4\1\2\uffff\1\1\3\uffff\2\1\16\uffff"+
            "\1\11\1\1\7\uffff\2\1\1\uffff\1\1\1\uffff\2\1\11\uffff\2\1\1"+
            "\uffff\2\1\2\uffff\3\1\11\uffff\7\1\1\uffff\1\1\1\uffff\14\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\50\uffff\2\1\74\uffff\1\6"
    };

    static final short[] DFA139_eot = DFA.unpackEncodedString(DFA139_eotS);
    static final short[] DFA139_eof = DFA.unpackEncodedString(DFA139_eofS);
    static final char[] DFA139_min = DFA.unpackEncodedStringToUnsignedChars(DFA139_minS);
    static final char[] DFA139_max = DFA.unpackEncodedStringToUnsignedChars(DFA139_maxS);
    static final short[] DFA139_accept = DFA.unpackEncodedString(DFA139_acceptS);
    static final short[] DFA139_special = DFA.unpackEncodedString(DFA139_specialS);
    static final short[][] DFA139_transition;

    static {
        int numStates = DFA139_transitionS.length;
        DFA139_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA139_transition[i] = DFA.unpackEncodedString(DFA139_transitionS[i]);
        }
    }

    class DFA139 extends DFA {

        public DFA139(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 139;
            this.eot = DFA139_eot;
            this.eof = DFA139_eof;
            this.min = DFA139_min;
            this.max = DFA139_max;
            this.accept = DFA139_accept;
            this.special = DFA139_special;
            this.transition = DFA139_transition;
        }
        public String getDescription() {
            return "640:1: atom : ( variable_or_function_call ( PERCENT attribute )? | SQL PERCENT attribute | string_literal | numeric_atom | boolean_atom | NULL | LPAREN expression RPAREN );";
        }
    }
 

    public static final BitSet FOLLOW_create_object_in_sqlplus_file62 = new BitSet(new long[]{0x0000000000000010L,0x0008000000000000L});
    public static final BitSet FOLLOW_DIVIDE_in_sqlplus_file66 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_show_errors_in_sqlplus_file68 = new BitSet(new long[]{0x0000000000000010L,0x0008000000000000L});
    public static final BitSet FOLLOW_DIVIDE_in_sqlplus_file73 = new BitSet(new long[]{0x0000000000000010L,0x0008000000000000L});
    public static final BitSet FOLLOW_EOF_in_sqlplus_file79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kSHOW_in_show_errors100 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kERRORS_in_show_errors102 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_SEMI_in_show_errors104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_package_in_create_object122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_package_body_in_create_object130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_function_in_create_object138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_procedure_in_create_object146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_type_in_create_object154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedure_heading182 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_procedure_heading184 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_parameter_declarations_in_procedure_heading207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_function_heading282 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_function_heading284 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_parameter_declarations_in_function_heading306 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RETURN_in_function_heading327 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_datatype_in_function_heading329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parameter_declarations405 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_declarations410 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_parameter_declarations434 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_declarations439 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_RPAREN_in_parameter_declarations466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parameter_declaration522 = new BitSet(new long[]{0x0000000400018080L});
    public static final BitSet FOLLOW_param_type_in_parameter_declaration524 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_datatype_in_parameter_declaration527 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ASSIGN_in_parameter_declaration542 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_DEFAULT_in_parameter_declaration546 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_parameter_declaration550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_param_type681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OUT_in_param_type689 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_IN_in_param_type693 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_OUT_in_param_type695 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_NOCOPY_in_param_type699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_definition_in_declare_section729 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_declare_section731 = new BitSet(new long[]{0x00000000020401C2L,0x0000000000000400L});
    public static final BitSet FOLLOW_subtype_definition_in_declare_section743 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_declare_section745 = new BitSet(new long[]{0x00000000020401E2L,0x0000000000000400L});
    public static final BitSet FOLLOW_cursor_definition_in_declare_section754 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_declare_section756 = new BitSet(new long[]{0x00000000020401E2L,0x0000000000000400L});
    public static final BitSet FOLLOW_item_declaration_in_declare_section765 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_declare_section767 = new BitSet(new long[]{0x00000000020401E2L,0x0000000000000400L});
    public static final BitSet FOLLOW_function_declaration_or_definition_in_declare_section776 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_declare_section778 = new BitSet(new long[]{0x00000000020401E2L,0x0000000000000400L});
    public static final BitSet FOLLOW_procedure_declaration_or_definition_in_declare_section789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_declare_section791 = new BitSet(new long[]{0x00000000020401E2L,0x0000000000000400L});
    public static final BitSet FOLLOW_pragma_in_declare_section802 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_declare_section804 = new BitSet(new long[]{0x00000000020401E2L,0x0000000000000400L});
    public static final BitSet FOLLOW_CURSOR_in_cursor_definition833 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_cursor_definition835 = new BitSet(new long[]{0x0000000000080400L});
    public static final BitSet FOLLOW_parameter_declarations_in_cursor_definition837 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IS_in_cursor_definition840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_select_statement_in_cursor_definition842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_item_declaration859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_declaration_in_item_declaration867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exception_declaration_in_item_declaration875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable_declaration896 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_datatype_in_variable_declaration898 = new BitSet(new long[]{0x0000000000106002L});
    public static final BitSet FOLLOW_NOT_in_variable_declaration906 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NULL_in_variable_declaration908 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_set_in_variable_declaration913 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_variable_declaration925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_constant_declaration950 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CONSTANT_in_constant_declaration952 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_datatype_in_constant_declaration954 = new BitSet(new long[]{0x0000000000106000L});
    public static final BitSet FOLLOW_NOT_in_constant_declaration958 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NULL_in_constant_declaration960 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_set_in_constant_declaration965 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_constant_declaration979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_exception_declaration1000 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_EXCEPTION_in_exception_declaration1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kTYPE_in_type_definition1029 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_type_definition1031 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_set_in_type_definition1052 = new BitSet(new long[]{0x00000004DC000000L});
    public static final BitSet FOLLOW_record_type_definition_in_type_definition1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_type_definition_in_type_definition1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ref_cursor_type_definition_in_type_definition1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_type_definition_in_type_definition1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBTYPE_in_subtype_definition1178 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_subtype_definition1180 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IS_in_subtype_definition1182 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_datatype_in_subtype_definition1184 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_NOT_in_subtype_definition1188 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NULL_in_subtype_definition1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_record_type_definition1211 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPAREN_in_record_type_definition1213 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_record_field_declaration_in_record_type_definition1215 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_record_type_definition1219 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_record_field_declaration_in_record_type_definition1221 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_RPAREN_in_record_type_definition1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_record_field_declaration1250 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_datatype_in_record_field_declaration1257 = new BitSet(new long[]{0x0000000000106002L});
    public static final BitSet FOLLOW_NOT_in_record_field_declaration1268 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NULL_in_record_field_declaration1270 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_set_in_record_field_declaration1275 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_record_field_declaration1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_in_object_type_definition1315 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPAREN_in_object_type_definition1317 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_record_field_declaration_in_object_type_definition1321 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_object_type_definition1336 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_record_field_declaration_in_object_type_definition1340 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_RPAREN_in_object_type_definition1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varray_type_definition_in_collection_type_definition1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nested_table_type_definition_in_collection_type_definition1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARYING_in_varray_type_definition1412 = new BitSet(new long[]{0x0000000020000400L});
    public static final BitSet FOLLOW_ARRAY_in_varray_type_definition1414 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_VARRAY_in_varray_type_definition1419 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPAREN_in_varray_type_definition1423 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_varray_type_definition1425 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_varray_type_definition1427 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kOF_in_varray_type_definition1429 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_datatype_in_varray_type_definition1431 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_NOT_in_varray_type_definition1435 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NULL_in_varray_type_definition1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLE_in_nested_table_type_definition1461 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kOF_in_nested_table_type_definition1463 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_datatype_in_nested_table_type_definition1465 = new BitSet(new long[]{0x0000000100100002L});
    public static final BitSet FOLLOW_NOT_in_nested_table_type_definition1474 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NULL_in_nested_table_type_definition1476 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_INDEX_in_nested_table_type_definition1483 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_BY_in_nested_table_type_definition1485 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_associative_index_type_in_nested_table_type_definition1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_associative_index_type1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_in_ref_cursor_type_definition1512 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CURSOR_in_ref_cursor_type_definition1514 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RETURN_in_ref_cursor_type_definition1518 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_datatype_in_ref_cursor_type_definition1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_in_datatype1539 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_datatype1544 = new BitSet(new long[]{0x0000001800000402L});
    public static final BitSet FOLLOW_DOT_in_datatype1548 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_datatype1550 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_LPAREN_in_datatype1557 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_datatype1559 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_datatype1563 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_numeric_literal_in_datatype1565 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_RPAREN_in_datatype1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_datatype1574 = new BitSet(new long[]{0x0000002000000080L});
    public static final BitSet FOLLOW_kTYPE_in_datatype1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROWTYPE_in_datatype1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_declaration_or_definition1612 = new BitSet(new long[]{0x000003C001080002L});
    public static final BitSet FOLLOW_set_in_function_declaration_or_definition1622 = new BitSet(new long[]{0x000003C001080002L});
    public static final BitSet FOLLOW_set_in_function_declaration_or_definition1651 = new BitSet(new long[]{0x00000400020401E0L,0x0000000000000400L});
    public static final BitSet FOLLOW_declare_section_in_function_declaration_or_definition1661 = new BitSet(new long[]{0x00000400020401E0L,0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_function_declaration_or_definition1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_declaration1687 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_set_in_function_declaration1697 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_function_heading_in_function_definition1735 = new BitSet(new long[]{0x000003C001080000L});
    public static final BitSet FOLLOW_set_in_function_definition1745 = new BitSet(new long[]{0x000003C001080000L});
    public static final BitSet FOLLOW_set_in_function_definition1772 = new BitSet(new long[]{0x00000400020401E0L,0x0000000000000400L});
    public static final BitSet FOLLOW_declare_section_in_function_definition1782 = new BitSet(new long[]{0x00000400020401E0L,0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_function_definition1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_declaration_or_definition1807 = new BitSet(new long[]{0x0000000001080002L});
    public static final BitSet FOLLOW_set_in_procedure_declaration_or_definition1819 = new BitSet(new long[]{0x00000400020401E0L,0x0000000000000400L});
    public static final BitSet FOLLOW_declare_section_in_procedure_declaration_or_definition1829 = new BitSet(new long[]{0x00000400020401E0L,0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_procedure_declaration_or_definition1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_declaration1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_heading_in_procedure_definition1863 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_set_in_procedure_definition1866 = new BitSet(new long[]{0x00000400020401E0L,0x0000000000000400L});
    public static final BitSet FOLLOW_declare_section_in_procedure_definition1876 = new BitSet(new long[]{0x00000400020401E0L,0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_procedure_definition1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_body1893 = new BitSet(new long[]{0x06EF0400022403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_body1895 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_body1897 = new BitSet(new long[]{0x06EF0C0002A403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_body1901 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_body1903 = new BitSet(new long[]{0x06EF0C0002A403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_pragma_in_body1907 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_body1909 = new BitSet(new long[]{0x06EF0C0002A403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_EXCEPTION_in_body1917 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_exception_handler_in_body1919 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_END_in_body1925 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_body1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_exception_handler1939 = new BitSet(new long[]{0x0001400000000080L});
    public static final BitSet FOLLOW_qual_id_in_exception_handler1943 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_OR_in_exception_handler1947 = new BitSet(new long[]{0x0001000000000080L});
    public static final BitSet FOLLOW_qual_id_in_exception_handler1949 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_OTHERS_in_exception_handler1956 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_THEN_in_exception_handler1962 = new BitSet(new long[]{0x06EF0400022403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_exception_handler1966 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_exception_handler1968 = new BitSet(new long[]{0x06EF0400022403E2L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_label_in_statement1986 = new BitSet(new long[]{0x06EF0400022403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_assign_or_call_statement_in_statement1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_statement_in_statement2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_close_statement_in_statement2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continue_statement_in_statement2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_loop_statement_in_statement2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_execute_immediate_statement_in_statement2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exit_statement_in_statement2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fetch_statement_in_statement2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_loop_statement_in_statement2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forall_statement_in_statement2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_goto_statement_in_statement2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_null_statement_in_statement2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_open_statement_in_statement2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plsql_block_in_statement2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_statement_in_statement2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_statement_in_statement2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_statement_in_statement2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_loop_statement_in_statement2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_lvalue2162 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_DOT_in_lvalue2166 = new BitSet(new long[]{0x0001000000000080L});
    public static final BitSet FOLLOW_call_in_lvalue2168 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_lvalue_in_assign_or_call_statement2188 = new BitSet(new long[]{0x0000000800002002L});
    public static final BitSet FOLLOW_DOT_in_assign_or_call_statement2192 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_delete_call_in_assign_or_call_statement2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assign_or_call_statement2198 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_assign_or_call_statement2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_call2220 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_call2223 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_LPAREN_in_call2227 = new BitSet(new long[]{0x0001000000301480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_parameter_in_call2231 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_call2235 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_parameter_in_call2237 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_RPAREN_in_call2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_call2265 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_LPAREN_in_delete_call2269 = new BitSet(new long[]{0x0001000000301480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_parameter_in_delete_call2271 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_delete_call2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_basic_loop_statement2298 = new BitSet(new long[]{0x06EF0400022403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_basic_loop_statement2302 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_basic_loop_statement2304 = new BitSet(new long[]{0x06EF0C00022403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_END_in_basic_loop_statement2309 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LOOP_in_basic_loop_statement2311 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_label_name_in_basic_loop_statement2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_case_statement2335 = new BitSet(new long[]{0x0001100000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_case_statement2337 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_WHEN_in_case_statement2350 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_case_statement2352 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_THEN_in_case_statement2354 = new BitSet(new long[]{0x06EF0400022403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_case_statement2358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_case_statement2360 = new BitSet(new long[]{0x06FF1C00022403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_ELSE_in_case_statement2378 = new BitSet(new long[]{0x06EF0400022403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_case_statement2380 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_case_statement2382 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_END_in_case_statement2395 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_CASE_in_case_statement2397 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_label_name_in_case_statement2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLOSE_in_close_statement2421 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_close_statement2423 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_DOT_in_close_statement2427 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_close_statement2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continue_statement2453 = new BitSet(new long[]{0x0000100000000082L});
    public static final BitSet FOLLOW_ID_in_continue_statement2459 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_WHEN_in_continue_statement2466 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_continue_statement2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXECUTE_in_execute_immediate_statement2492 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_IMMEDIATE_in_execute_immediate_statement2494 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_execute_immediate_statement2496 = new BitSet(new long[]{0xB000000000000202L,0x0000000000000001L});
    public static final BitSet FOLLOW_into_clause_in_execute_immediate_statement2510 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_execute_immediate_statement2514 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_using_clause_in_execute_immediate_statement2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_using_clause_in_execute_immediate_statement2530 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000001L});
    public static final BitSet FOLLOW_dynamic_returning_clause_in_execute_immediate_statement2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynamic_returning_clause_in_execute_immediate_statement2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_exit_statement2577 = new BitSet(new long[]{0x0000100000000082L});
    public static final BitSet FOLLOW_ID_in_exit_statement2583 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_WHEN_in_exit_statement2590 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_exit_statement2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FETCH_in_fetch_statement2616 = new BitSet(new long[]{0x0001000000000080L});
    public static final BitSet FOLLOW_qual_id_in_fetch_statement2618 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_into_clause_in_fetch_statement2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_fetch_statement2626 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_fetch_statement2630 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_numeric_expression_in_fetch_statement2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTO_in_into_clause2662 = new BitSet(new long[]{0x0001000000000080L});
    public static final BitSet FOLLOW_lvalue_in_into_clause2664 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_into_clause2668 = new BitSet(new long[]{0x0001000000000080L});
    public static final BitSet FOLLOW_lvalue_in_into_clause2670 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_BULK_in_bulk_collect_into_clause2698 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_COLLECT_in_bulk_collect_into_clause2700 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_INTO_in_bulk_collect_into_clause2702 = new BitSet(new long[]{0x0001000000000080L});
    public static final BitSet FOLLOW_lvalue_in_bulk_collect_into_clause2704 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_bulk_collect_into_clause2708 = new BitSet(new long[]{0x0001000000000080L});
    public static final BitSet FOLLOW_lvalue_in_bulk_collect_into_clause2710 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_USING_in_using_clause2734 = new BitSet(new long[]{0x0001000000318480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_param_modifiers_in_using_clause2736 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_using_clause2739 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_using_clause2743 = new BitSet(new long[]{0x0001000000318480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_param_modifiers_in_using_clause2745 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_using_clause2748 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_IN_in_param_modifiers2765 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_OUT_in_param_modifiers2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OUT_in_param_modifiers2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_dynamic_returning_clause2790 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_into_clause_in_dynamic_returning_clause2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bulk_collect_into_clause_in_dynamic_returning_clause2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_loop_statement2829 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_for_loop_statement2831 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IN_in_for_loop_statement2833 = new BitSet(new long[]{0xFFFBFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_set_in_for_loop_statement2837 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_LOOP_in_for_loop_statement2845 = new BitSet(new long[]{0x06EF0400022403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_for_loop_statement2849 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_for_loop_statement2851 = new BitSet(new long[]{0x06EF0C00022403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_END_in_for_loop_statement2856 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LOOP_in_for_loop_statement2858 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_label_name_in_for_loop_statement2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORALL_in_forall_statement2882 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_forall_statement2884 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IN_in_forall_statement2886 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_bounds_clause_in_forall_statement2888 = new BitSet(new long[]{0x0002000000000000L,0x0000000000BF8000L});
    public static final BitSet FOLLOW_sql_statement_in_forall_statement2890 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_kSAVE_in_forall_statement2894 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kEXCEPTIONS_in_forall_statement2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLEDOT_in_bounds_clause2920 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kINDICES_in_bounds_clause2930 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kOF_in_bounds_clause2932 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_atom_in_bounds_clause2934 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_BETWEEN_in_bounds_clause2938 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_AND_in_bounds_clause2942 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_numeric_expression_in_bounds_clause2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kVALUES_in_bounds_clause2955 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kOF_in_bounds_clause2957 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_atom_in_bounds_clause2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_goto_statement2980 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_label_name_in_goto_statement2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement3003 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_if_statement3005 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_THEN_in_if_statement3007 = new BitSet(new long[]{0x06EF0400022403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_if_statement3011 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_if_statement3013 = new BitSet(new long[]{0x06FF0C00022403E0L,0x0000000001BFBFC6L});
    public static final BitSet FOLLOW_ELSIF_in_if_statement3028 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_if_statement3030 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_THEN_in_if_statement3032 = new BitSet(new long[]{0x06EF0400022403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_if_statement3036 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_if_statement3038 = new BitSet(new long[]{0x06FF0C00022403E0L,0x0000000001BFBFC6L});
    public static final BitSet FOLLOW_ELSE_in_if_statement3056 = new BitSet(new long[]{0x06EF0400022403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_if_statement3060 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_if_statement3062 = new BitSet(new long[]{0x06EF0C00022403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_END_in_if_statement3078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_IF_in_if_statement3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_null_statement3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_in_open_statement3122 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_open_statement3124 = new BitSet(new long[]{0x0000000800000402L,0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_open_statement3128 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_open_statement3130 = new BitSet(new long[]{0x0000000800000402L,0x0000000000000002L});
    public static final BitSet FOLLOW_call_args_in_open_statement3135 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_open_statement3140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_select_statement_in_open_statement3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma3166 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_pragma3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_statement3189 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_raise_statement3193 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_DOT_in_raise_statement3197 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_raise_statement3199 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_RETURN_in_return_statement3226 = new BitSet(new long[]{0x0001000000300482L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_return_statement3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_plsql_block3252 = new BitSet(new long[]{0x00000000020401E0L,0x0000000000000400L});
    public static final BitSet FOLLOW_declare_section_in_plsql_block3254 = new BitSet(new long[]{0x00000400020401E0L,0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_plsql_block3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LLABEL_in_label3280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_label_in_label3282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_RLABEL_in_label3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_qual_id3298 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_qual_id3301 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_DOT_in_qual_id3305 = new BitSet(new long[]{0x0001000000000080L});
    public static final BitSet FOLLOW_COLON_in_qual_id3307 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_qual_id3310 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_commit_statement_in_sql_statement3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_sql_statement3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_sql_statement3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lock_table_statement_in_sql_statement3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_statement_in_sql_statement3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_statement_in_sql_statement3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_statement_in_sql_statement3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_transaction_statement_in_sql_statement3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_sql_statement3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMIT_in_commit_statement3415 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD2L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_commit_statement3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_statement3439 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_delete_statement3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_statement3462 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_insert_statement3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCK_in_lock_table_statement3485 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_TABLE_in_lock_table_statement3487 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_lock_table_statement3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_statement3510 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD2L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_rollback_statement3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_statement3534 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_savepoint_statement3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_statement3557 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_select_statement3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_set_transaction_statement3580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_TRANSACTION_in_set_transaction_statement3582 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_set_transaction_statement3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_statement3605 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_update_statement3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_swallow_to_semi3628 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD2L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_WHILE_in_while_loop_statement3655 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_while_loop_statement3657 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LOOP_in_while_loop_statement3659 = new BitSet(new long[]{0x06EF0400022403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_statement_in_while_loop_statement3663 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_while_loop_statement3665 = new BitSet(new long[]{0x06EF0C00022403E0L,0x0000000001BFBEC6L});
    public static final BitSet FOLLOW_END_in_while_loop_statement3670 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LOOP_in_while_loop_statement3672 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_label_name_in_while_loop_statement3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_match_parens3703 = new BitSet(new long[]{0xFFFFFFFFFEF66BD2L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_RPAREN_in_match_parens3743 = new BitSet(new long[]{0xFFFFFFFFFEF67FD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_match_parens_in_match_parens3745 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPAREN_in_match_parens3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label_name3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_expression3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expr_in_or_expr3788 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_OR_in_or_expr3792 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_and_expr_in_or_expr3794 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_not_expr_in_and_expr3814 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_AND_in_and_expr3818 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_not_expr_in_and_expr3820 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_NOT_in_not_expr3840 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_compare_expr_in_not_expr3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_is_null_expr_in_compare_expr3860 = new BitSet(new long[]{0x0000000000000002L,0x000000007E000000L});
    public static final BitSet FOLLOW_set_in_compare_expr3864 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_is_null_expr_in_compare_expr3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_like_expr_in_is_null_expr3910 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_IS_in_is_null_expr3914 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_NOT_in_is_null_expr3916 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NULL_in_is_null_expr3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_between_expr_in_like_expr3938 = new BitSet(new long[]{0x0000000000100002L,0x0000000080000000L});
    public static final BitSet FOLLOW_NOT_in_like_expr3942 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_LIKE_in_like_expr3945 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_between_expr_in_like_expr3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3967 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_between_expr3971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_BETWEEN_in_between_expr3974 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_AND_in_between_expr3978 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_in_expr_in_between_expr3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expr_in_in_expr4000 = new BitSet(new long[]{0x0000000000108002L});
    public static final BitSet FOLLOW_NOT_in_in_expr4004 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IN_in_in_expr4007 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPAREN_in_in_expr4009 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_add_expr_in_in_expr4011 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_in_expr4015 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_add_expr_in_in_expr4017 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_RPAREN_in_in_expr4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expr_in_numeric_expression4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mul_expr_in_add_expr4059 = new BitSet(new long[]{0x0000000000000002L,0x0000000700000000L});
    public static final BitSet FOLLOW_set_in_add_expr4063 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_mul_expr_in_add_expr4077 = new BitSet(new long[]{0x0000000000000002L,0x0000000700000000L});
    public static final BitSet FOLLOW_unary_sign_expr_in_mul_expr4097 = new BitSet(new long[]{0x0000000000000092L,0x0000000800000000L});
    public static final BitSet FOLLOW_ASTERISK_in_mul_expr4103 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_DIVIDE_in_mul_expr4107 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_kMOD_in_mul_expr4111 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_unary_sign_expr_in_mul_expr4115 = new BitSet(new long[]{0x0000000000000092L,0x0000000800000000L});
    public static final BitSet FOLLOW_set_in_unary_sign_expr4135 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_exponent_expr_in_unary_sign_expr4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_exponent_expr4163 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_EXPONENT_in_exponent_expr4167 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_atom_in_exponent_expr4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_or_function_call_in_atom4189 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_PERCENT_in_atom4193 = new BitSet(new long[]{0x0000000000000080L,0x000001C000000000L});
    public static final BitSet FOLLOW_attribute_in_atom4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQL_in_atom4206 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_PERCENT_in_atom4208 = new BitSet(new long[]{0x0000000000000080L,0x000001C000000000L});
    public static final BitSet FOLLOW_attribute_in_atom4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_atom4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_atom_in_atom4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_atom_in_atom4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom4250 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_atom4252 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_atom4254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_variable_or_function_call4275 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_DOT_in_variable_or_function_call4279 = new BitSet(new long[]{0x0001000000000080L});
    public static final BitSet FOLLOW_call_in_variable_or_function_call4281 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_DOT_in_variable_or_function_call4288 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_delete_call_in_variable_or_function_call4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BULK_ROWCOUNT_in_attribute4310 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPAREN_in_attribute4312 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_attribute4314 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_attribute4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kFOUND_in_attribute4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISOPEN_in_attribute4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTFOUND_in_attribute4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kROWCOUNT_in_attribute4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_call_args4365 = new BitSet(new long[]{0x0001000000301480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_parameter_in_call_args4369 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_call_args4373 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_parameter_in_call_args4375 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_RPAREN_in_call_args4383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_boolean_atom4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_exists_in_boolean_atom4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_predicate_in_boolean_atom4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_literal_in_numeric_atom4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numeric_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolean_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_string_literal4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_collection_exists4517 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_collection_exists4519 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_EXISTS_in_collection_exists4521 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPAREN_in_collection_exists4523 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_collection_exists4525 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_collection_exists4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERTING_in_conditional_predicate4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATING_in_conditional_predicate4552 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_LPAREN_in_conditional_predicate4556 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_conditional_predicate4558 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_conditional_predicate4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETING_in_conditional_predicate4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parameter4590 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_ARROW_in_parameter4592 = new BitSet(new long[]{0x0001000000300480L,0x0003BE2300000000L});
    public static final BitSet FOLLOW_expression_in_parameter4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_index4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_package4635 = new BitSet(new long[]{0x0000200000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_OR_in_create_package4639 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kREPLACE_in_create_package4641 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_PACKAGE_in_create_package4646 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_package_full_name_in_create_package4648 = new BitSet(new long[]{0x0000000001080000L,0x0080000000000000L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_package4660 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_IS_in_create_package4675 = new BitSet(new long[]{0x00000800020401E0L,0x0000000000000400L});
    public static final BitSet FOLLOW_AS_in_create_package4679 = new BitSet(new long[]{0x00000800020401E0L,0x0000000000000400L});
    public static final BitSet FOLLOW_declare_section_in_create_package4685 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_END_in_create_package4690 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_ID_in_create_package4694 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_create_package4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_package_full_name4733 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_package_full_name4735 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_package_full_name4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_package_body4767 = new BitSet(new long[]{0x0000200000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_OR_in_create_package_body4771 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kREPLACE_in_create_package_body4773 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_PACKAGE_in_create_package_body4778 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_BODY_in_create_package_body4780 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_create_package_body4786 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_create_package_body4788 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_create_package_body4795 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_set_in_create_package_body4805 = new BitSet(new long[]{0x00000C00020401E0L,0x0000000000000400L});
    public static final BitSet FOLLOW_declare_section_in_create_package_body4817 = new BitSet(new long[]{0x00000C00020401E0L,0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_create_package_body4834 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_END_in_create_package_body4838 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_ID_in_create_package_body4844 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_create_package_body4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_procedure4885 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_OR_in_create_procedure4889 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kREPLACE_in_create_procedure4891 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_PROCEDURE_in_create_procedure4896 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_create_procedure4902 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_create_procedure4904 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_create_procedure4911 = new BitSet(new long[]{0x0000000001080400L,0x0080000000000000L});
    public static final BitSet FOLLOW_parameter_declarations_in_create_procedure4931 = new BitSet(new long[]{0x0000000001080000L,0x0080000000000000L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_procedure4963 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_IS_in_create_procedure4976 = new BitSet(new long[]{0x00000400020401E0L,0x0440000000000400L});
    public static final BitSet FOLLOW_AS_in_create_procedure4980 = new BitSet(new long[]{0x00000400020401E0L,0x0440000000000400L});
    public static final BitSet FOLLOW_declare_section_in_create_procedure4994 = new BitSet(new long[]{0x00000400020401E0L,0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_create_procedure4997 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_call_spec_in_create_procedure5011 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EXTERNAL_in_create_procedure5038 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_create_procedure5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_function5109 = new BitSet(new long[]{0x0000200000000100L});
    public static final BitSet FOLLOW_OR_in_create_function5113 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kREPLACE_in_create_function5115 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_FUNCTION_in_create_function5120 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_create_function5126 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_create_function5128 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_create_function5135 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_parameter_declarations_in_create_function5155 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RETURN_in_create_function5175 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_datatype_in_create_function5177 = new BitSet(new long[]{0x0000000001080000L,0x0080000000000000L});
    public static final BitSet FOLLOW_invoker_rights_clause_in_create_function5197 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_set_in_create_function5208 = new BitSet(new long[]{0x00000400020401E0L,0x0440000000000400L});
    public static final BitSet FOLLOW_declare_section_in_create_function5228 = new BitSet(new long[]{0x00000400020401E0L,0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_create_function5231 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_call_spec_in_create_function5243 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EXTERNAL_in_create_function5255 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SEMI_in_create_function5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTHID_in_invoker_rights_clause5288 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_set_in_invoker_rights_clause5290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGUAGE_in_call_spec5315 = new BitSet(new long[]{0xFFFFFFFFFFFFFFD0L,0xFFFFFFFFFFFFFFFFL,0x000000000000003FL});
    public static final BitSet FOLLOW_swallow_to_semi_in_call_spec5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_type5334 = new BitSet(new long[]{0x0000200000000080L});
    public static final BitSet FOLLOW_OR_in_create_type5338 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_kREPLACE_in_create_type5340 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_type_definition_in_create_type5345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kERRORS5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kEXCEPTIONS5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kFOUND5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kINDICES5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kMOD5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kNAME5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kOF5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kREPLACE5419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kROWCOUNT5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kSAVE5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kSHOW5446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kTYPE5455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kVALUES5464 = new BitSet(new long[]{0x0000000000000002L});

}