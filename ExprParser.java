// $ANTLR null /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g 2019-02-24 02:40:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ExprParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFFECT", "AFFECTATT", "ARG", 
		"ARGDEC", "ARRAY", "ATTRIBUT", "BLOCK", "CALL", "CALLCROCHET", "CALLEXP", 
		"CALLFUN", "COMMENT", "COND", "DIV", "DO", "EGAL", "ELSE", "ELSEIF", "END", 
		"FINBLOCK", "FOR", "FUNCDEC", "ID", "IF", "IN", "INFIXCOMP", "INFIXMULTDIV", 
		"INTLIT", "ITERATION", "LET", "MOINS", "MOINS_UNAIRE", "MULT", "OF", "PARAM", 
		"PLUS", "RETURN", "ROOT", "STRINGLIT", "THEN", "TYPEARRAYDEC", "TYPEDEC", 
		"TYPERENAME", "VARARRAYDEC", "VARDEC", "VARRECORD", "VARSIMPLE", "WHILE", 
		"WS", "'&'", "'('", "')'", "'+'", "','", "'-'", "'.'", "':'", "':='", 
		"';'", "'='", "'['", "']'", "'array'", "'break'", "'do'", "'else'", "'end'", 
		"'for'", "'function'", "'if'", "'in'", "'let'", "'nil'", "'of'", "'then'", 
		"'to'", "'type'", "'var'", "'while'", "'{'", "'|'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int AFFECT=4;
	public static final int AFFECTATT=5;
	public static final int ARG=6;
	public static final int ARGDEC=7;
	public static final int ARRAY=8;
	public static final int ATTRIBUT=9;
	public static final int BLOCK=10;
	public static final int CALL=11;
	public static final int CALLCROCHET=12;
	public static final int CALLEXP=13;
	public static final int CALLFUN=14;
	public static final int COMMENT=15;
	public static final int COND=16;
	public static final int DIV=17;
	public static final int DO=18;
	public static final int EGAL=19;
	public static final int ELSE=20;
	public static final int ELSEIF=21;
	public static final int END=22;
	public static final int FINBLOCK=23;
	public static final int FOR=24;
	public static final int FUNCDEC=25;
	public static final int ID=26;
	public static final int IF=27;
	public static final int IN=28;
	public static final int INFIXCOMP=29;
	public static final int INFIXMULTDIV=30;
	public static final int INTLIT=31;
	public static final int ITERATION=32;
	public static final int LET=33;
	public static final int MOINS=34;
	public static final int MOINS_UNAIRE=35;
	public static final int MULT=36;
	public static final int OF=37;
	public static final int PARAM=38;
	public static final int PLUS=39;
	public static final int RETURN=40;
	public static final int ROOT=41;
	public static final int STRINGLIT=42;
	public static final int THEN=43;
	public static final int TYPEARRAYDEC=44;
	public static final int TYPEDEC=45;
	public static final int TYPERENAME=46;
	public static final int VARARRAYDEC=47;
	public static final int VARDEC=48;
	public static final int VARRECORD=49;
	public static final int VARSIMPLE=50;
	public static final int WHILE=51;
	public static final int WS=52;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "reccreate", "lvalue", "seqexp", "base", "decexp", "infixassign", 
		"fieldcreate", "mult", "tydec", "arrty", "callexp", "ifthenelse", "dec", 
		"whileexp", "infixand", "negation", "assignment", "deccomp", "program", 
		"decinfixand", "letexp", "comp", "forexp", "exp", "ty", "fundec", "arrcreate", 
		"recty", "vardec", "callcrochet", "add", "decinfixassign", "fielddec", 
		"ifelse", "exp2", "decinfixor", "vardec1", "decmult", "decbase", "decadd", 
		"infixor"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public ExprParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public ExprParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public ExprParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return ExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:14:1: program : exp -> ^( ROOT exp ) ;
	public final ExprParser.program_return program() throws RecognitionException {
		ExprParser.program_return retval = new ExprParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exp1 =null;

		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(14, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:14:11: ( exp -> ^( ROOT exp ) )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:14:13: exp
			{
			dbg.location(14,13);
			pushFollow(FOLLOW_exp_in_program144);
			exp1=exp();
			state._fsp--;

			stream_exp.add(exp1.getTree());
			// AST REWRITE
			// elements: exp
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 14:17: -> ^( ROOT exp )
			{
				dbg.location(14,19);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:14:19: ^( ROOT exp )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(14,21);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROOT, "ROOT"), root_1);
				dbg.location(14,26);
				adaptor.addChild(root_1, stream_exp.nextTree());
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
			// do for sure before leaving
		}
		dbg.location(15, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "program"


	public static class dec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dec"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:18:1: dec : ( tydec | vardec | fundec );
	public final ExprParser.dec_return dec() throws RecognitionException {
		ExprParser.dec_return retval = new ExprParser.dec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope tydec2 =null;
		ParserRuleReturnScope vardec3 =null;
		ParserRuleReturnScope fundec4 =null;


		try { dbg.enterRule(getGrammarFileName(), "dec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(18, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:18:7: ( tydec | vardec | fundec )
			int alt1=3;
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			switch ( input.LA(1) ) {
			case 80:
				{
				alt1=1;
				}
				break;
			case 81:
				{
				alt1=2;
				}
				break;
			case 72:
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:18:9: tydec
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(18,9);
					pushFollow(FOLLOW_tydec_in_dec166);
					tydec2=tydec();
					state._fsp--;

					adaptor.addChild(root_0, tydec2.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:19:6: vardec
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(19,6);
					pushFollow(FOLLOW_vardec_in_dec173);
					vardec3=vardec();
					state._fsp--;

					adaptor.addChild(root_0, vardec3.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:20:6: fundec
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(20,6);
					pushFollow(FOLLOW_fundec_in_dec180);
					fundec4=fundec();
					state._fsp--;

					adaptor.addChild(root_0, fundec4.getTree());

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
			// do for sure before leaving
		}
		dbg.location(21, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "dec"


	public static class tydec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tydec"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:23:1: tydec : 'type' ID '=' ty -> ^( TYPEDEC ID ty ) ;
	public final ExprParser.tydec_return tydec() throws RecognitionException {
		ExprParser.tydec_return retval = new ExprParser.tydec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal5=null;
		Token ID6=null;
		Token char_literal7=null;
		ParserRuleReturnScope ty8 =null;

		Object string_literal5_tree=null;
		Object ID6_tree=null;
		Object char_literal7_tree=null;
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_ty=new RewriteRuleSubtreeStream(adaptor,"rule ty");

		try { dbg.enterRule(getGrammarFileName(), "tydec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(23, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:23:13: ( 'type' ID '=' ty -> ^( TYPEDEC ID ty ) )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:23:15: 'type' ID '=' ty
			{
			dbg.location(23,15);
			string_literal5=(Token)match(input,80,FOLLOW_80_in_tydec198);  
			stream_80.add(string_literal5);
			dbg.location(23,22);
			ID6=(Token)match(input,ID,FOLLOW_ID_in_tydec200);  
			stream_ID.add(ID6);
			dbg.location(23,25);
			char_literal7=(Token)match(input,63,FOLLOW_63_in_tydec202);  
			stream_63.add(char_literal7);
			dbg.location(23,29);
			pushFollow(FOLLOW_ty_in_tydec204);
			ty8=ty();
			state._fsp--;

			stream_ty.add(ty8.getTree());
			// AST REWRITE
			// elements: ty, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 23:32: -> ^( TYPEDEC ID ty )
			{
				dbg.location(23,34);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:23:34: ^( TYPEDEC ID ty )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(23,36);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPEDEC, "TYPEDEC"), root_1);
				dbg.location(23,44);
				adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(23,48);
				adaptor.addChild(root_1, stream_ty.nextTree());
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
			// do for sure before leaving
		}
		dbg.location(24, 6);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "tydec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "tydec"


	public static class ty_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ty"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:26:1: ty : ( ID -> ^( TYPERENAME ID ) | arrty -> ^( TYPEARRAYDEC arrty ) | recty -> ^( ATTRIBUT recty ) );
	public final ExprParser.ty_return ty() throws RecognitionException {
		ExprParser.ty_return retval = new ExprParser.ty_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID9=null;
		ParserRuleReturnScope arrty10 =null;
		ParserRuleReturnScope recty11 =null;

		Object ID9_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_recty=new RewriteRuleSubtreeStream(adaptor,"rule recty");
		RewriteRuleSubtreeStream stream_arrty=new RewriteRuleSubtreeStream(adaptor,"rule arrty");

		try { dbg.enterRule(getGrammarFileName(), "ty");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(26, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:26:7: ( ID -> ^( TYPERENAME ID ) | arrty -> ^( TYPEARRAYDEC arrty ) | recty -> ^( ATTRIBUT recty ) )
			int alt2=3;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case ID:
				{
				alt2=1;
				}
				break;
			case 66:
				{
				alt2=2;
				}
				break;
			case 83:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:26:9: ID
					{
					dbg.location(26,9);
					ID9=(Token)match(input,ID,FOLLOW_ID_in_ty232);  
					stream_ID.add(ID9);

					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 26:12: -> ^( TYPERENAME ID )
					{
						dbg.location(26,15);
						// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:26:15: ^( TYPERENAME ID )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(26,17);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPERENAME, "TYPERENAME"), root_1);
						dbg.location(26,28);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:27:6: arrty
					{
					dbg.location(27,6);
					pushFollow(FOLLOW_arrty_in_ty247);
					arrty10=arrty();
					state._fsp--;

					stream_arrty.add(arrty10.getTree());
					// AST REWRITE
					// elements: arrty
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 27:12: -> ^( TYPEARRAYDEC arrty )
					{
						dbg.location(27,15);
						// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:27:15: ^( TYPEARRAYDEC arrty )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(27,17);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPEARRAYDEC, "TYPEARRAYDEC"), root_1);
						dbg.location(27,30);
						adaptor.addChild(root_1, stream_arrty.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:28:6: recty
					{
					dbg.location(28,6);
					pushFollow(FOLLOW_recty_in_ty262);
					recty11=recty();
					state._fsp--;

					stream_recty.add(recty11.getTree());
					// AST REWRITE
					// elements: recty
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 28:12: -> ^( ATTRIBUT recty )
					{
						dbg.location(28,15);
						// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:28:15: ^( ATTRIBUT recty )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(28,17);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBUT, "ATTRIBUT"), root_1);
						dbg.location(28,26);
						adaptor.addChild(root_1, stream_recty.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

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
			// do for sure before leaving
		}
		dbg.location(29, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ty");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "ty"


	public static class arrty_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrty"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:31:1: arrty : 'array' 'of' ID -> ID ;
	public final ExprParser.arrty_return arrty() throws RecognitionException {
		ExprParser.arrty_return retval = new ExprParser.arrty_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal12=null;
		Token string_literal13=null;
		Token ID14=null;

		Object string_literal12_tree=null;
		Object string_literal13_tree=null;
		Object ID14_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try { dbg.enterRule(getGrammarFileName(), "arrty");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:31:9: ( 'array' 'of' ID -> ID )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:31:11: 'array' 'of' ID
			{
			dbg.location(31,11);
			string_literal12=(Token)match(input,66,FOLLOW_66_in_arrty284);  
			stream_66.add(string_literal12);
			dbg.location(31,19);
			string_literal13=(Token)match(input,77,FOLLOW_77_in_arrty286);  
			stream_77.add(string_literal13);
			dbg.location(31,24);
			ID14=(Token)match(input,ID,FOLLOW_ID_in_arrty288);  
			stream_ID.add(ID14);

			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 31:28: -> ID
			{
				dbg.location(31,31);
				adaptor.addChild(root_0, stream_ID.nextNode());
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
			// do for sure before leaving
		}
		dbg.location(32, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arrty");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "arrty"


	public static class recty_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "recty"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:34:1: recty : '{' ( fielddec ( ',' fielddec )* )? '}' -> ( ( fielddec )+ )? ;
	public final ExprParser.recty_return recty() throws RecognitionException {
		ExprParser.recty_return retval = new ExprParser.recty_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal15=null;
		Token char_literal17=null;
		Token char_literal19=null;
		ParserRuleReturnScope fielddec16 =null;
		ParserRuleReturnScope fielddec18 =null;

		Object char_literal15_tree=null;
		Object char_literal17_tree=null;
		Object char_literal19_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_fielddec=new RewriteRuleSubtreeStream(adaptor,"rule fielddec");

		try { dbg.enterRule(getGrammarFileName(), "recty");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:34:9: ( '{' ( fielddec ( ',' fielddec )* )? '}' -> ( ( fielddec )+ )? )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:34:11: '{' ( fielddec ( ',' fielddec )* )? '}'
			{
			dbg.location(34,11);
			char_literal15=(Token)match(input,83,FOLLOW_83_in_recty307);  
			stream_83.add(char_literal15);
			dbg.location(34,15);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:34:15: ( fielddec ( ',' fielddec )* )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==ID) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:34:16: fielddec ( ',' fielddec )*
					{
					dbg.location(34,16);
					pushFollow(FOLLOW_fielddec_in_recty310);
					fielddec16=fielddec();
					state._fsp--;

					stream_fielddec.add(fielddec16.getTree());dbg.location(34,25);
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:34:25: ( ',' fielddec )*
					try { dbg.enterSubRule(3);

					loop3:
					while (true) {
						int alt3=2;
						try { dbg.enterDecision(3, decisionCanBacktrack[3]);

						int LA3_0 = input.LA(1);
						if ( (LA3_0==57) ) {
							alt3=1;
						}

						} finally {dbg.exitDecision(3);}

						switch (alt3) {
						case 1 :
							dbg.enterAlt(1);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:34:26: ',' fielddec
							{
							dbg.location(34,26);
							char_literal17=(Token)match(input,57,FOLLOW_57_in_recty313);  
							stream_57.add(char_literal17);
							dbg.location(34,29);
							pushFollow(FOLLOW_fielddec_in_recty314);
							fielddec18=fielddec();
							state._fsp--;

							stream_fielddec.add(fielddec18.getTree());
							}
							break;

						default :
							break loop3;
						}
					}
					} finally {dbg.exitSubRule(3);}

					}
					break;

			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(34,43);
			char_literal19=(Token)match(input,85,FOLLOW_85_in_recty321);  
			stream_85.add(char_literal19);

			// AST REWRITE
			// elements: fielddec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 34:47: -> ( ( fielddec )+ )?
			{
				dbg.location(34,51);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:34:51: ( ( fielddec )+ )?
				if ( stream_fielddec.hasNext() ) {
					dbg.location(34,52);
					if ( !(stream_fielddec.hasNext()) ) {
						throw new RewriteEarlyExitException();
					}
					while ( stream_fielddec.hasNext() ) {
						dbg.location(34,52);
						adaptor.addChild(root_0, stream_fielddec.nextTree());
					}
					stream_fielddec.reset();

				}
				stream_fielddec.reset();

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
			// do for sure before leaving
		}
		dbg.location(35, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "recty");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "recty"


	public static class fielddec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fielddec"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:37:1: fielddec : ID ':' ID -> ^( ARGDEC ID ID ) ;
	public final ExprParser.fielddec_return fielddec() throws RecognitionException {
		ExprParser.fielddec_return retval = new ExprParser.fielddec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID20=null;
		Token char_literal21=null;
		Token ID22=null;

		Object ID20_tree=null;
		Object char_literal21_tree=null;
		Object ID22_tree=null;
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try { dbg.enterRule(getGrammarFileName(), "fielddec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:37:11: ( ID ':' ID -> ^( ARGDEC ID ID ) )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:37:13: ID ':' ID
			{
			dbg.location(37,13);
			ID20=(Token)match(input,ID,FOLLOW_ID_in_fielddec358);  
			stream_ID.add(ID20);
			dbg.location(37,16);
			char_literal21=(Token)match(input,60,FOLLOW_60_in_fielddec360);  
			stream_60.add(char_literal21);
			dbg.location(37,20);
			ID22=(Token)match(input,ID,FOLLOW_ID_in_fielddec362);  
			stream_ID.add(ID22);

			// AST REWRITE
			// elements: ID, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 37:23: -> ^( ARGDEC ID ID )
			{
				dbg.location(37,25);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:37:25: ^( ARGDEC ID ID )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(37,27);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGDEC, "ARGDEC"), root_1);
				dbg.location(37,34);
				adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(37,37);
				adaptor.addChild(root_1, stream_ID.nextNode());
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
			// do for sure before leaving
		}
		dbg.location(38, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fielddec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "fielddec"


	public static class fundec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fundec"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:40:1: fundec : 'function' ID '(' ( fielddec ( ',' fielddec )* )? ')' ( ':' ID )? '=' exp -> ^( FUNCDEC ID ^( PARAM ( fielddec )* ) ^( BLOCK exp ) ( ^( RETURN ID ) )? ) ;
	public final ExprParser.fundec_return fundec() throws RecognitionException {
		ExprParser.fundec_return retval = new ExprParser.fundec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal23=null;
		Token ID24=null;
		Token char_literal25=null;
		Token char_literal27=null;
		Token char_literal29=null;
		Token char_literal30=null;
		Token ID31=null;
		Token char_literal32=null;
		ParserRuleReturnScope fielddec26 =null;
		ParserRuleReturnScope fielddec28 =null;
		ParserRuleReturnScope exp33 =null;

		Object string_literal23_tree=null;
		Object ID24_tree=null;
		Object char_literal25_tree=null;
		Object char_literal27_tree=null;
		Object char_literal29_tree=null;
		Object char_literal30_tree=null;
		Object ID31_tree=null;
		Object char_literal32_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_fielddec=new RewriteRuleSubtreeStream(adaptor,"rule fielddec");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try { dbg.enterRule(getGrammarFileName(), "fundec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(40, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:40:10: ( 'function' ID '(' ( fielddec ( ',' fielddec )* )? ')' ( ':' ID )? '=' exp -> ^( FUNCDEC ID ^( PARAM ( fielddec )* ) ^( BLOCK exp ) ( ^( RETURN ID ) )? ) )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:40:12: 'function' ID '(' ( fielddec ( ',' fielddec )* )? ')' ( ':' ID )? '=' exp
			{
			dbg.location(40,12);
			string_literal23=(Token)match(input,72,FOLLOW_72_in_fundec385);  
			stream_72.add(string_literal23);
			dbg.location(40,23);
			ID24=(Token)match(input,ID,FOLLOW_ID_in_fundec387);  
			stream_ID.add(ID24);
			dbg.location(40,26);
			char_literal25=(Token)match(input,54,FOLLOW_54_in_fundec389);  
			stream_54.add(char_literal25);
			dbg.location(40,30);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:40:30: ( fielddec ( ',' fielddec )* )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:40:31: fielddec ( ',' fielddec )*
					{
					dbg.location(40,31);
					pushFollow(FOLLOW_fielddec_in_fundec392);
					fielddec26=fielddec();
					state._fsp--;

					stream_fielddec.add(fielddec26.getTree());dbg.location(40,39);
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:40:39: ( ',' fielddec )*
					try { dbg.enterSubRule(5);

					loop5:
					while (true) {
						int alt5=2;
						try { dbg.enterDecision(5, decisionCanBacktrack[5]);

						int LA5_0 = input.LA(1);
						if ( (LA5_0==57) ) {
							alt5=1;
						}

						} finally {dbg.exitDecision(5);}

						switch (alt5) {
						case 1 :
							dbg.enterAlt(1);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:40:40: ',' fielddec
							{
							dbg.location(40,40);
							char_literal27=(Token)match(input,57,FOLLOW_57_in_fundec394);  
							stream_57.add(char_literal27);
							dbg.location(40,43);
							pushFollow(FOLLOW_fielddec_in_fundec395);
							fielddec28=fielddec();
							state._fsp--;

							stream_fielddec.add(fielddec28.getTree());
							}
							break;

						default :
							break loop5;
						}
					}
					} finally {dbg.exitSubRule(5);}

					}
					break;

			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(40,56);
			char_literal29=(Token)match(input,55,FOLLOW_55_in_fundec401);  
			stream_55.add(char_literal29);
			dbg.location(40,60);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:40:60: ( ':' ID )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==60) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:40:61: ':' ID
					{
					dbg.location(40,61);
					char_literal30=(Token)match(input,60,FOLLOW_60_in_fundec404);  
					stream_60.add(char_literal30);
					dbg.location(40,65);
					ID31=(Token)match(input,ID,FOLLOW_ID_in_fundec406);  
					stream_ID.add(ID31);

					}
					break;

			}
			} finally {dbg.exitSubRule(7);}
			dbg.location(40,70);
			char_literal32=(Token)match(input,63,FOLLOW_63_in_fundec410);  
			stream_63.add(char_literal32);
			dbg.location(40,74);
			pushFollow(FOLLOW_exp_in_fundec412);
			exp33=exp();
			state._fsp--;

			stream_exp.add(exp33.getTree());
			// AST REWRITE
			// elements: ID, exp, fielddec, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 40:78: -> ^( FUNCDEC ID ^( PARAM ( fielddec )* ) ^( BLOCK exp ) ( ^( RETURN ID ) )? )
			{
				dbg.location(40,80);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:40:80: ^( FUNCDEC ID ^( PARAM ( fielddec )* ) ^( BLOCK exp ) ( ^( RETURN ID ) )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(40,82);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCDEC, "FUNCDEC"), root_1);
				dbg.location(40,90);
				adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(40,93);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:40:93: ^( PARAM ( fielddec )* )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(40,95);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_2);
				dbg.location(40,102);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:40:102: ( fielddec )*
				while ( stream_fielddec.hasNext() ) {
					dbg.location(40,102);
					adaptor.addChild(root_2, stream_fielddec.nextTree());
				}
				stream_fielddec.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(40,113);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:40:113: ^( BLOCK exp )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(40,115);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
				dbg.location(40,121);
				adaptor.addChild(root_2, stream_exp.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(40,126);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:40:126: ( ^( RETURN ID ) )?
				if ( stream_ID.hasNext() ) {
					dbg.location(40,126);
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:40:126: ^( RETURN ID )
					{
					Object root_2 = (Object)adaptor.nil();
					dbg.location(40,128);
					root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);
					dbg.location(40,135);
					adaptor.addChild(root_2, stream_ID.nextNode());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_ID.reset();

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
			// do for sure before leaving
		}
		dbg.location(41, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fundec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "fundec"


	public static class vardec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vardec"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:43:1: vardec : 'var' ID vardec1 -> ^( VARDEC ID vardec1 ) ;
	public final ExprParser.vardec_return vardec() throws RecognitionException {
		ExprParser.vardec_return retval = new ExprParser.vardec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal34=null;
		Token ID35=null;
		ParserRuleReturnScope vardec136 =null;

		Object string_literal34_tree=null;
		Object ID35_tree=null;
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_vardec1=new RewriteRuleSubtreeStream(adaptor,"rule vardec1");

		try { dbg.enterRule(getGrammarFileName(), "vardec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:43:10: ( 'var' ID vardec1 -> ^( VARDEC ID vardec1 ) )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:43:12: 'var' ID vardec1
			{
			dbg.location(43,12);
			string_literal34=(Token)match(input,81,FOLLOW_81_in_vardec455);  
			stream_81.add(string_literal34);
			dbg.location(43,18);
			ID35=(Token)match(input,ID,FOLLOW_ID_in_vardec457);  
			stream_ID.add(ID35);
			dbg.location(43,21);
			pushFollow(FOLLOW_vardec1_in_vardec459);
			vardec136=vardec1();
			state._fsp--;

			stream_vardec1.add(vardec136.getTree());
			// AST REWRITE
			// elements: vardec1, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 43:29: -> ^( VARDEC ID vardec1 )
			{
				dbg.location(43,32);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:43:32: ^( VARDEC ID vardec1 )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(43,34);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEC, "VARDEC"), root_1);
				dbg.location(43,41);
				adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(43,44);
				adaptor.addChild(root_1, stream_vardec1.nextTree());
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
			// do for sure before leaving
		}
		dbg.location(44, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vardec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "vardec"


	public static class vardec1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vardec1"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:45:1: vardec1 : ( ':=' decexp -> decexp | ':' ID ':=' decexp -> ID decexp );
	public final ExprParser.vardec1_return vardec1() throws RecognitionException {
		ExprParser.vardec1_return retval = new ExprParser.vardec1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal37=null;
		Token char_literal39=null;
		Token ID40=null;
		Token string_literal41=null;
		ParserRuleReturnScope decexp38 =null;
		ParserRuleReturnScope decexp42 =null;

		Object string_literal37_tree=null;
		Object char_literal39_tree=null;
		Object ID40_tree=null;
		Object string_literal41_tree=null;
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_decexp=new RewriteRuleSubtreeStream(adaptor,"rule decexp");

		try { dbg.enterRule(getGrammarFileName(), "vardec1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:45:11: ( ':=' decexp -> decexp | ':' ID ':=' decexp -> ID decexp )
			int alt8=2;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==61) ) {
				alt8=1;
			}
			else if ( (LA8_0==60) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:45:13: ':=' decexp
					{
					dbg.location(45,13);
					string_literal37=(Token)match(input,61,FOLLOW_61_in_vardec1482);  
					stream_61.add(string_literal37);
					dbg.location(45,18);
					pushFollow(FOLLOW_decexp_in_vardec1484);
					decexp38=decexp();
					state._fsp--;

					stream_decexp.add(decexp38.getTree());
					// AST REWRITE
					// elements: decexp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 45:25: -> decexp
					{
						dbg.location(45,28);
						adaptor.addChild(root_0, stream_decexp.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:46:6: ':' ID ':=' decexp
					{
					dbg.location(46,6);
					char_literal39=(Token)match(input,60,FOLLOW_60_in_vardec1495);  
					stream_60.add(char_literal39);
					dbg.location(46,10);
					ID40=(Token)match(input,ID,FOLLOW_ID_in_vardec1497);  
					stream_ID.add(ID40);
					dbg.location(46,13);
					string_literal41=(Token)match(input,61,FOLLOW_61_in_vardec1499);  
					stream_61.add(string_literal41);
					dbg.location(46,18);
					pushFollow(FOLLOW_decexp_in_vardec1501);
					decexp42=decexp();
					state._fsp--;

					stream_decexp.add(decexp42.getTree());
					// AST REWRITE
					// elements: decexp, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 46:25: -> ID decexp
					{
						dbg.location(46,28);
						adaptor.addChild(root_0, stream_ID.nextNode());dbg.location(46,31);
						adaptor.addChild(root_0, stream_decexp.nextTree());
					}


					retval.tree = root_0;

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
			// do for sure before leaving
		}
		dbg.location(47, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vardec1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "vardec1"


	public static class decexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decexp"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:52:1: decexp : (| decinfixassign | ifthenelse | whileexp | forexp );
	public final ExprParser.decexp_return decexp() throws RecognitionException {
		ExprParser.decexp_return retval = new ExprParser.decexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope decinfixassign43 =null;
		ParserRuleReturnScope ifthenelse44 =null;
		ParserRuleReturnScope whileexp45 =null;
		ParserRuleReturnScope forexp46 =null;


		try { dbg.enterRule(getGrammarFileName(), "decexp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:52:10: (| decinfixassign | ifthenelse | whileexp | forexp )
			int alt9=5;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			switch ( input.LA(1) ) {
			case 70:
			case 72:
			case 74:
			case 80:
			case 81:
				{
				alt9=1;
				}
				break;
			case ID:
			case INTLIT:
			case STRINGLIT:
			case 54:
			case 58:
			case 67:
			case 75:
			case 76:
				{
				alt9=2;
				}
				break;
			case 73:
				{
				alt9=3;
				}
				break;
			case 82:
				{
				alt9=4;
				}
				break;
			case 71:
				{
				alt9=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:53:4: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:53:6: decinfixassign
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(53,6);
					pushFollow(FOLLOW_decinfixassign_in_decexp541);
					decinfixassign43=decinfixassign();
					state._fsp--;

					adaptor.addChild(root_0, decinfixassign43.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:54:6: ifthenelse
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(54,6);
					pushFollow(FOLLOW_ifthenelse_in_decexp549);
					ifthenelse44=ifthenelse();
					state._fsp--;

					adaptor.addChild(root_0, ifthenelse44.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:56:6: whileexp
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(56,6);
					pushFollow(FOLLOW_whileexp_in_decexp560);
					whileexp45=whileexp();
					state._fsp--;

					adaptor.addChild(root_0, whileexp45.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:57:6: forexp
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(57,6);
					pushFollow(FOLLOW_forexp_in_decexp567);
					forexp46=forexp();
					state._fsp--;

					adaptor.addChild(root_0, forexp46.getTree());

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
			// do for sure before leaving
		}
		dbg.location(59, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decexp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "decexp"


	public static class decinfixassign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decinfixassign"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:63:1: decinfixassign : decinfixor ( ':=' ^ decinfixor )? ;
	public final ExprParser.decinfixassign_return decinfixassign() throws RecognitionException {
		ExprParser.decinfixassign_return retval = new ExprParser.decinfixassign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal48=null;
		ParserRuleReturnScope decinfixor47 =null;
		ParserRuleReturnScope decinfixor49 =null;

		Object string_literal48_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "decinfixassign");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(63, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:63:17: ( decinfixor ( ':=' ^ decinfixor )? )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:63:20: decinfixor ( ':=' ^ decinfixor )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(63,20);
			pushFollow(FOLLOW_decinfixor_in_decinfixassign590);
			decinfixor47=decinfixor();
			state._fsp--;

			adaptor.addChild(root_0, decinfixor47.getTree());
			dbg.location(63,31);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:63:31: ( ':=' ^ decinfixor )?
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==61) ) {
				alt10=1;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:63:32: ':=' ^ decinfixor
					{
					dbg.location(63,36);
					string_literal48=(Token)match(input,61,FOLLOW_61_in_decinfixassign593); 
					string_literal48_tree = (Object)adaptor.create(string_literal48);
					root_0 = (Object)adaptor.becomeRoot(string_literal48_tree, root_0);
					dbg.location(63,38);
					pushFollow(FOLLOW_decinfixor_in_decinfixassign596);
					decinfixor49=decinfixor();
					state._fsp--;

					adaptor.addChild(root_0, decinfixor49.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(10);}

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
			// do for sure before leaving
		}
		dbg.location(66, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decinfixassign");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "decinfixassign"


	public static class decinfixor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decinfixor"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:68:1: decinfixor : decinfixand ( '|' ^ decinfixand )* ;
	public final ExprParser.decinfixor_return decinfixor() throws RecognitionException {
		ExprParser.decinfixor_return retval = new ExprParser.decinfixor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal51=null;
		ParserRuleReturnScope decinfixand50 =null;
		ParserRuleReturnScope decinfixand52 =null;

		Object char_literal51_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "decinfixor");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(68, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:68:12: ( decinfixand ( '|' ^ decinfixand )* )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:68:14: decinfixand ( '|' ^ decinfixand )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(68,14);
			pushFollow(FOLLOW_decinfixand_in_decinfixor613);
			decinfixand50=decinfixand();
			state._fsp--;

			adaptor.addChild(root_0, decinfixand50.getTree());
			dbg.location(68,26);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:68:26: ( '|' ^ decinfixand )*
			try { dbg.enterSubRule(11);

			loop11:
			while (true) {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				int LA11_0 = input.LA(1);
				if ( (LA11_0==84) ) {
					alt11=1;
				}

				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:68:27: '|' ^ decinfixand
					{
					dbg.location(68,30);
					char_literal51=(Token)match(input,84,FOLLOW_84_in_decinfixor616); 
					char_literal51_tree = (Object)adaptor.create(char_literal51);
					root_0 = (Object)adaptor.becomeRoot(char_literal51_tree, root_0);
					dbg.location(68,32);
					pushFollow(FOLLOW_decinfixand_in_decinfixor619);
					decinfixand52=decinfixand();
					state._fsp--;

					adaptor.addChild(root_0, decinfixand52.getTree());

					}
					break;

				default :
					break loop11;
				}
			}
			} finally {dbg.exitSubRule(11);}

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
			// do for sure before leaving
		}
		dbg.location(69, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decinfixor");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "decinfixor"


	public static class decinfixand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decinfixand"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:71:1: decinfixand : deccomp ( '&' ^ deccomp )* ;
	public final ExprParser.decinfixand_return decinfixand() throws RecognitionException {
		ExprParser.decinfixand_return retval = new ExprParser.decinfixand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal54=null;
		ParserRuleReturnScope deccomp53 =null;
		ParserRuleReturnScope deccomp55 =null;

		Object char_literal54_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "decinfixand");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:71:13: ( deccomp ( '&' ^ deccomp )* )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:71:15: deccomp ( '&' ^ deccomp )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(71,15);
			pushFollow(FOLLOW_deccomp_in_decinfixand631);
			deccomp53=deccomp();
			state._fsp--;

			adaptor.addChild(root_0, deccomp53.getTree());
			dbg.location(71,23);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:71:23: ( '&' ^ deccomp )*
			try { dbg.enterSubRule(12);

			loop12:
			while (true) {
				int alt12=2;
				try { dbg.enterDecision(12, decisionCanBacktrack[12]);

				int LA12_0 = input.LA(1);
				if ( (LA12_0==53) ) {
					alt12=1;
				}

				} finally {dbg.exitDecision(12);}

				switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:71:24: '&' ^ deccomp
					{
					dbg.location(71,28);
					char_literal54=(Token)match(input,53,FOLLOW_53_in_decinfixand634); 
					char_literal54_tree = (Object)adaptor.create(char_literal54);
					root_0 = (Object)adaptor.becomeRoot(char_literal54_tree, root_0);
					dbg.location(71,29);
					pushFollow(FOLLOW_deccomp_in_decinfixand637);
					deccomp55=deccomp();
					state._fsp--;

					adaptor.addChild(root_0, deccomp55.getTree());

					}
					break;

				default :
					break loop12;
				}
			}
			} finally {dbg.exitSubRule(12);}

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
			// do for sure before leaving
		}
		dbg.location(72, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decinfixand");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "decinfixand"


	public static class deccomp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "deccomp"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:74:1: deccomp : decadd ( ( INFIXCOMP ^| '=' ^) decadd )* ;
	public final ExprParser.deccomp_return deccomp() throws RecognitionException {
		ExprParser.deccomp_return retval = new ExprParser.deccomp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INFIXCOMP57=null;
		Token char_literal58=null;
		ParserRuleReturnScope decadd56 =null;
		ParserRuleReturnScope decadd59 =null;

		Object INFIXCOMP57_tree=null;
		Object char_literal58_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "deccomp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:74:9: ( decadd ( ( INFIXCOMP ^| '=' ^) decadd )* )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:74:11: decadd ( ( INFIXCOMP ^| '=' ^) decadd )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(74,11);
			pushFollow(FOLLOW_decadd_in_deccomp649);
			decadd56=decadd();
			state._fsp--;

			adaptor.addChild(root_0, decadd56.getTree());
			dbg.location(74,18);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:74:18: ( ( INFIXCOMP ^| '=' ^) decadd )*
			try { dbg.enterSubRule(14);

			loop14:
			while (true) {
				int alt14=2;
				try { dbg.enterDecision(14, decisionCanBacktrack[14]);

				int LA14_0 = input.LA(1);
				if ( (LA14_0==INFIXCOMP||LA14_0==63) ) {
					alt14=1;
				}

				} finally {dbg.exitDecision(14);}

				switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:74:19: ( INFIXCOMP ^| '=' ^) decadd
					{
					dbg.location(74,19);
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:74:19: ( INFIXCOMP ^| '=' ^)
					int alt13=2;
					try { dbg.enterSubRule(13);
					try { dbg.enterDecision(13, decisionCanBacktrack[13]);

					int LA13_0 = input.LA(1);
					if ( (LA13_0==INFIXCOMP) ) {
						alt13=1;
					}
					else if ( (LA13_0==63) ) {
						alt13=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(13);}

					switch (alt13) {
						case 1 :
							dbg.enterAlt(1);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:74:20: INFIXCOMP ^
							{
							dbg.location(74,30);
							INFIXCOMP57=(Token)match(input,INFIXCOMP,FOLLOW_INFIXCOMP_in_deccomp653); 
							INFIXCOMP57_tree = (Object)adaptor.create(INFIXCOMP57);
							root_0 = (Object)adaptor.becomeRoot(INFIXCOMP57_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:74:33: '=' ^
							{
							dbg.location(74,37);
							char_literal58=(Token)match(input,63,FOLLOW_63_in_deccomp658); 
							char_literal58_tree = (Object)adaptor.create(char_literal58);
							root_0 = (Object)adaptor.becomeRoot(char_literal58_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(74,41);
					pushFollow(FOLLOW_decadd_in_deccomp664);
					decadd59=decadd();
					state._fsp--;

					adaptor.addChild(root_0, decadd59.getTree());

					}
					break;

				default :
					break loop14;
				}
			}
			} finally {dbg.exitSubRule(14);}

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
			// do for sure before leaving
		}
		dbg.location(75, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "deccomp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "deccomp"


	public static class decadd_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decadd"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:77:1: decadd : decmult ( ( '-' | '+' ) ^ decmult )* ;
	public final ExprParser.decadd_return decadd() throws RecognitionException {
		ExprParser.decadd_return retval = new ExprParser.decadd_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set61=null;
		ParserRuleReturnScope decmult60 =null;
		ParserRuleReturnScope decmult62 =null;

		Object set61_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "decadd");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(77, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:77:7: ( decmult ( ( '-' | '+' ) ^ decmult )* )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:77:10: decmult ( ( '-' | '+' ) ^ decmult )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(77,10);
			pushFollow(FOLLOW_decmult_in_decadd677);
			decmult60=decmult();
			state._fsp--;

			adaptor.addChild(root_0, decmult60.getTree());
			dbg.location(77,17);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:77:17: ( ( '-' | '+' ) ^ decmult )*
			try { dbg.enterSubRule(15);

			loop15:
			while (true) {
				int alt15=2;
				try { dbg.enterDecision(15, decisionCanBacktrack[15]);

				int LA15_0 = input.LA(1);
				if ( (LA15_0==56||LA15_0==58) ) {
					alt15=1;
				}

				} finally {dbg.exitDecision(15);}

				switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:77:18: ( '-' | '+' ) ^ decmult
					{
					dbg.location(77,27);
					set61=input.LT(1);
					set61=input.LT(1);
					if ( input.LA(1)==56||input.LA(1)==58 ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set61), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(77,28);
					pushFollow(FOLLOW_decmult_in_decadd685);
					decmult62=decmult();
					state._fsp--;

					adaptor.addChild(root_0, decmult62.getTree());

					}
					break;

				default :
					break loop15;
				}
			}
			} finally {dbg.exitSubRule(15);}

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
			// do for sure before leaving
		}
		dbg.location(78, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decadd");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "decadd"


	public static class decmult_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decmult"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:80:1: decmult : decbase ( INFIXMULTDIV ^ decbase )* ;
	public final ExprParser.decmult_return decmult() throws RecognitionException {
		ExprParser.decmult_return retval = new ExprParser.decmult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INFIXMULTDIV64=null;
		ParserRuleReturnScope decbase63 =null;
		ParserRuleReturnScope decbase65 =null;

		Object INFIXMULTDIV64_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "decmult");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(80, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:80:9: ( decbase ( INFIXMULTDIV ^ decbase )* )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:80:11: decbase ( INFIXMULTDIV ^ decbase )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(80,11);
			pushFollow(FOLLOW_decbase_in_decmult698);
			decbase63=decbase();
			state._fsp--;

			adaptor.addChild(root_0, decbase63.getTree());
			dbg.location(80,18);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:80:18: ( INFIXMULTDIV ^ decbase )*
			try { dbg.enterSubRule(16);

			loop16:
			while (true) {
				int alt16=2;
				try { dbg.enterDecision(16, decisionCanBacktrack[16]);

				int LA16_0 = input.LA(1);
				if ( (LA16_0==INFIXMULTDIV) ) {
					alt16=1;
				}

				} finally {dbg.exitDecision(16);}

				switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:80:19: INFIXMULTDIV ^ decbase
					{
					dbg.location(80,32);
					INFIXMULTDIV64=(Token)match(input,INFIXMULTDIV,FOLLOW_INFIXMULTDIV_in_decmult700); 
					INFIXMULTDIV64_tree = (Object)adaptor.create(INFIXMULTDIV64);
					root_0 = (Object)adaptor.becomeRoot(INFIXMULTDIV64_tree, root_0);
					dbg.location(80,34);
					pushFollow(FOLLOW_decbase_in_decmult704);
					decbase65=decbase();
					state._fsp--;

					adaptor.addChild(root_0, decbase65.getTree());

					}
					break;

				default :
					break loop16;
				}
			}
			} finally {dbg.exitSubRule(16);}

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
			// do for sure before leaving
		}
		dbg.location(81, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decmult");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "decmult"


	public static class decbase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decbase"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:84:1: decbase : ( INTLIT -> ^( VARSIMPLE INTLIT ) | '-' decbase -> ^( MOINS_UNAIRE decbase ) | ID ( '.' att= ID ( exp2 |) -> ^( ATTRIBUT ID $att ( exp2 )? ) | callcrochet -> ^( VARARRAYDEC ID callcrochet ) | callexp -> ^( CALLFUN ID callexp ) | reccreate -> ^( VARRECORD ID reccreate ) | -> ^( ID ) ) | seqexp | 'nil' | STRINGLIT -> ^( VARSIMPLE STRINGLIT ) | letexp | 'break' );
	public final ExprParser.decbase_return decbase() throws RecognitionException {
		ExprParser.decbase_return retval = new ExprParser.decbase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token att=null;
		Token INTLIT66=null;
		Token char_literal67=null;
		Token ID69=null;
		Token char_literal70=null;
		Token string_literal76=null;
		Token STRINGLIT77=null;
		Token string_literal79=null;
		ParserRuleReturnScope decbase68 =null;
		ParserRuleReturnScope exp271 =null;
		ParserRuleReturnScope callcrochet72 =null;
		ParserRuleReturnScope callexp73 =null;
		ParserRuleReturnScope reccreate74 =null;
		ParserRuleReturnScope seqexp75 =null;
		ParserRuleReturnScope letexp78 =null;

		Object att_tree=null;
		Object INTLIT66_tree=null;
		Object char_literal67_tree=null;
		Object ID69_tree=null;
		Object char_literal70_tree=null;
		Object string_literal76_tree=null;
		Object STRINGLIT77_tree=null;
		Object string_literal79_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_STRINGLIT=new RewriteRuleTokenStream(adaptor,"token STRINGLIT");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_INTLIT=new RewriteRuleTokenStream(adaptor,"token INTLIT");
		RewriteRuleSubtreeStream stream_reccreate=new RewriteRuleSubtreeStream(adaptor,"rule reccreate");
		RewriteRuleSubtreeStream stream_callcrochet=new RewriteRuleSubtreeStream(adaptor,"rule callcrochet");
		RewriteRuleSubtreeStream stream_decbase=new RewriteRuleSubtreeStream(adaptor,"rule decbase");
		RewriteRuleSubtreeStream stream_exp2=new RewriteRuleSubtreeStream(adaptor,"rule exp2");
		RewriteRuleSubtreeStream stream_callexp=new RewriteRuleSubtreeStream(adaptor,"rule callexp");

		try { dbg.enterRule(getGrammarFileName(), "decbase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(84, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:84:9: ( INTLIT -> ^( VARSIMPLE INTLIT ) | '-' decbase -> ^( MOINS_UNAIRE decbase ) | ID ( '.' att= ID ( exp2 |) -> ^( ATTRIBUT ID $att ( exp2 )? ) | callcrochet -> ^( VARARRAYDEC ID callcrochet ) | callexp -> ^( CALLFUN ID callexp ) | reccreate -> ^( VARRECORD ID reccreate ) | -> ^( ID ) ) | seqexp | 'nil' | STRINGLIT -> ^( VARSIMPLE STRINGLIT ) | letexp | 'break' )
			int alt19=8;
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			switch ( input.LA(1) ) {
			case INTLIT:
				{
				alt19=1;
				}
				break;
			case 58:
				{
				alt19=2;
				}
				break;
			case ID:
				{
				alt19=3;
				}
				break;
			case 54:
				{
				alt19=4;
				}
				break;
			case 76:
				{
				alt19=5;
				}
				break;
			case STRINGLIT:
				{
				alt19=6;
				}
				break;
			case 75:
				{
				alt19=7;
				}
				break;
			case 67:
				{
				alt19=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:84:11: INTLIT
					{
					dbg.location(84,11);
					INTLIT66=(Token)match(input,INTLIT,FOLLOW_INTLIT_in_decbase717);  
					stream_INTLIT.add(INTLIT66);

					// AST REWRITE
					// elements: INTLIT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 84:18: -> ^( VARSIMPLE INTLIT )
					{
						dbg.location(84,21);
						// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:84:21: ^( VARSIMPLE INTLIT )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(84,23);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARSIMPLE, "VARSIMPLE"), root_1);
						dbg.location(84,34);
						adaptor.addChild(root_1, stream_INTLIT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:85:10: '-' decbase
					{
					dbg.location(85,10);
					char_literal67=(Token)match(input,58,FOLLOW_58_in_decbase737);  
					stream_58.add(char_literal67);
					dbg.location(85,15);
					pushFollow(FOLLOW_decbase_in_decbase740);
					decbase68=decbase();
					state._fsp--;

					stream_decbase.add(decbase68.getTree());
					// AST REWRITE
					// elements: decbase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 85:24: -> ^( MOINS_UNAIRE decbase )
					{
						dbg.location(85,27);
						// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:85:27: ^( MOINS_UNAIRE decbase )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(85,29);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MOINS_UNAIRE, "MOINS_UNAIRE"), root_1);
						dbg.location(85,43);
						adaptor.addChild(root_1, stream_decbase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:86:11: ID ( '.' att= ID ( exp2 |) -> ^( ATTRIBUT ID $att ( exp2 )? ) | callcrochet -> ^( VARARRAYDEC ID callcrochet ) | callexp -> ^( CALLFUN ID callexp ) | reccreate -> ^( VARRECORD ID reccreate ) | -> ^( ID ) )
					{
					dbg.location(86,11);
					ID69=(Token)match(input,ID,FOLLOW_ID_in_decbase762);  
					stream_ID.add(ID69);
					dbg.location(86,14);
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:86:14: ( '.' att= ID ( exp2 |) -> ^( ATTRIBUT ID $att ( exp2 )? ) | callcrochet -> ^( VARARRAYDEC ID callcrochet ) | callexp -> ^( CALLFUN ID callexp ) | reccreate -> ^( VARRECORD ID reccreate ) | -> ^( ID ) )
					int alt18=5;
					try { dbg.enterSubRule(18);
					try { dbg.enterDecision(18, decisionCanBacktrack[18]);

					switch ( input.LA(1) ) {
					case 59:
						{
						alt18=1;
						}
						break;
					case 64:
						{
						alt18=2;
						}
						break;
					case 54:
						{
						alt18=3;
						}
						break;
					case 83:
						{
						alt18=4;
						}
						break;
					case INFIXCOMP:
					case INFIXMULTDIV:
					case 53:
					case 56:
					case 58:
					case 61:
					case 63:
					case 70:
					case 72:
					case 74:
					case 80:
					case 81:
					case 84:
						{
						alt18=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(18);}

					switch (alt18) {
						case 1 :
							dbg.enterAlt(1);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:86:16: '.' att= ID ( exp2 |)
							{
							dbg.location(86,16);
							char_literal70=(Token)match(input,59,FOLLOW_59_in_decbase766);  
							stream_59.add(char_literal70);
							dbg.location(86,23);
							att=(Token)match(input,ID,FOLLOW_ID_in_decbase770);  
							stream_ID.add(att);
							dbg.location(86,26);
							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:86:26: ( exp2 |)
							int alt17=2;
							try { dbg.enterSubRule(17);
							try { dbg.enterDecision(17, decisionCanBacktrack[17]);

							int LA17_0 = input.LA(1);
							if ( (LA17_0==59||LA17_0==77) ) {
								alt17=1;
							}
							else if ( ((LA17_0 >= INFIXCOMP && LA17_0 <= INFIXMULTDIV)||LA17_0==53||LA17_0==56||LA17_0==58||LA17_0==61||LA17_0==63||LA17_0==70||LA17_0==72||LA17_0==74||(LA17_0 >= 80 && LA17_0 <= 81)||LA17_0==84) ) {
								alt17=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 17, 0, input);
								dbg.recognitionException(nvae);
								throw nvae;
							}

							} finally {dbg.exitDecision(17);}

							switch (alt17) {
								case 1 :
									dbg.enterAlt(1);

									// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:86:28: exp2
									{
									dbg.location(86,28);
									pushFollow(FOLLOW_exp2_in_decbase773);
									exp271=exp2();
									state._fsp--;

									stream_exp2.add(exp271.getTree());
									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:86:33: 
									{
									}
									break;

							}
							} finally {dbg.exitSubRule(17);}

							// AST REWRITE
							// elements: att, exp2, ID
							// token labels: att
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleTokenStream stream_att=new RewriteRuleTokenStream(adaptor,"token att",att);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 86:35: -> ^( ATTRIBUT ID $att ( exp2 )? )
							{
								dbg.location(86,38);
								// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:86:38: ^( ATTRIBUT ID $att ( exp2 )? )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(86,40);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBUT, "ATTRIBUT"), root_1);
								dbg.location(86,49);
								adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(86,53);
								adaptor.addChild(root_1, stream_att.nextNode());dbg.location(86,57);
								// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:86:57: ( exp2 )?
								if ( stream_exp2.hasNext() ) {
									dbg.location(86,58);
									adaptor.addChild(root_1, stream_exp2.nextTree());
								}
								stream_exp2.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:86:66: callcrochet
							{
							dbg.location(86,66);
							pushFollow(FOLLOW_callcrochet_in_decbase793);
							callcrochet72=callcrochet();
							state._fsp--;

							stream_callcrochet.add(callcrochet72.getTree());
							// AST REWRITE
							// elements: callcrochet, ID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 86:78: -> ^( VARARRAYDEC ID callcrochet )
							{
								dbg.location(86,80);
								// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:86:80: ^( VARARRAYDEC ID callcrochet )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(86,82);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARARRAYDEC, "VARARRAYDEC"), root_1);
								dbg.location(86,95);
								adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(86,98);
								adaptor.addChild(root_1, stream_callcrochet.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:86:112: callexp
							{
							dbg.location(86,112);
							pushFollow(FOLLOW_callexp_in_decbase806);
							callexp73=callexp();
							state._fsp--;

							stream_callexp.add(callexp73.getTree());
							// AST REWRITE
							// elements: callexp, ID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 86:120: -> ^( CALLFUN ID callexp )
							{
								dbg.location(86,123);
								// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:86:123: ^( CALLFUN ID callexp )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(86,125);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALLFUN, "CALLFUN"), root_1);
								dbg.location(86,133);
								adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(86,137);
								adaptor.addChild(root_1, stream_callexp.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:86:148: reccreate
							{
							dbg.location(86,148);
							pushFollow(FOLLOW_reccreate_in_decbase821);
							reccreate74=reccreate();
							state._fsp--;

							stream_reccreate.add(reccreate74.getTree());
							// AST REWRITE
							// elements: reccreate, ID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 86:158: -> ^( VARRECORD ID reccreate )
							{
								dbg.location(86,161);
								// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:86:161: ^( VARRECORD ID reccreate )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(86,164);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARRECORD, "VARRECORD"), root_1);
								dbg.location(86,174);
								adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(86,177);
								adaptor.addChild(root_1, stream_reccreate.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 5 :
							dbg.enterAlt(5);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:86:189: 
							{
							// AST REWRITE
							// elements: ID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 86:189: -> ^( ID )
							{
								dbg.location(86,192);
								// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:86:192: ^( ID )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(86,195);
								root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(18);}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:87:11: seqexp
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(87,11);
					pushFollow(FOLLOW_seqexp_in_decbase858);
					seqexp75=seqexp();
					state._fsp--;

					adaptor.addChild(root_0, seqexp75.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:88:11: 'nil'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(88,11);
					string_literal76=(Token)match(input,76,FOLLOW_76_in_decbase870); 
					string_literal76_tree = (Object)adaptor.create(string_literal76);
					adaptor.addChild(root_0, string_literal76_tree);

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:90:11: STRINGLIT
					{
					dbg.location(90,11);
					STRINGLIT77=(Token)match(input,STRINGLIT,FOLLOW_STRINGLIT_in_decbase891);  
					stream_STRINGLIT.add(STRINGLIT77);

					// AST REWRITE
					// elements: STRINGLIT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 90:21: -> ^( VARSIMPLE STRINGLIT )
					{
						dbg.location(90,24);
						// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:90:24: ^( VARSIMPLE STRINGLIT )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(90,26);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARSIMPLE, "VARSIMPLE"), root_1);
						dbg.location(90,37);
						adaptor.addChild(root_1, stream_STRINGLIT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:91:11: letexp
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(91,11);
					pushFollow(FOLLOW_letexp_in_decbase912);
					letexp78=letexp();
					state._fsp--;

					adaptor.addChild(root_0, letexp78.getTree());

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:92:11: 'break'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(92,11);
					string_literal79=(Token)match(input,67,FOLLOW_67_in_decbase924); 
					string_literal79_tree = (Object)adaptor.create(string_literal79);
					adaptor.addChild(root_0, string_literal79_tree);

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
			// do for sure before leaving
		}
		dbg.location(93, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decbase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "decbase"


	public static class lvalue_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lvalue"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:95:1: lvalue : ID exp2 ;
	public final ExprParser.lvalue_return lvalue() throws RecognitionException {
		ExprParser.lvalue_return retval = new ExprParser.lvalue_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID80=null;
		ParserRuleReturnScope exp281 =null;

		Object ID80_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "lvalue");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(95, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:95:15: ( ID exp2 )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:95:17: ID exp2
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(95,17);
			ID80=(Token)match(input,ID,FOLLOW_ID_in_lvalue942); 
			ID80_tree = (Object)adaptor.create(ID80);
			adaptor.addChild(root_0, ID80_tree);
			dbg.location(95,20);
			pushFollow(FOLLOW_exp2_in_lvalue944);
			exp281=exp2();
			state._fsp--;

			adaptor.addChild(root_0, exp281.getTree());

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
			// do for sure before leaving
		}
		dbg.location(96, 13);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lvalue");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "lvalue"


	public static class seqexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "seqexp"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:100:1: seqexp : '(' exp ( ';' exp )* ')' -> ( exp )* ;
	public final ExprParser.seqexp_return seqexp() throws RecognitionException {
		ExprParser.seqexp_return retval = new ExprParser.seqexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal82=null;
		Token char_literal84=null;
		Token char_literal86=null;
		ParserRuleReturnScope exp83 =null;
		ParserRuleReturnScope exp85 =null;

		Object char_literal82_tree=null;
		Object char_literal84_tree=null;
		Object char_literal86_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try { dbg.enterRule(getGrammarFileName(), "seqexp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(100, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:100:14: ( '(' exp ( ';' exp )* ')' -> ( exp )* )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:100:16: '(' exp ( ';' exp )* ')'
			{
			dbg.location(100,16);
			char_literal82=(Token)match(input,54,FOLLOW_54_in_seqexp974);  
			stream_54.add(char_literal82);
			dbg.location(100,20);
			pushFollow(FOLLOW_exp_in_seqexp976);
			exp83=exp();
			state._fsp--;

			stream_exp.add(exp83.getTree());dbg.location(100,24);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:100:24: ( ';' exp )*
			try { dbg.enterSubRule(20);

			loop20:
			while (true) {
				int alt20=2;
				try { dbg.enterDecision(20, decisionCanBacktrack[20]);

				int LA20_0 = input.LA(1);
				if ( (LA20_0==62) ) {
					alt20=1;
				}

				} finally {dbg.exitDecision(20);}

				switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:100:25: ';' exp
					{
					dbg.location(100,25);
					char_literal84=(Token)match(input,62,FOLLOW_62_in_seqexp979);  
					stream_62.add(char_literal84);
					dbg.location(100,29);
					pushFollow(FOLLOW_exp_in_seqexp981);
					exp85=exp();
					state._fsp--;

					stream_exp.add(exp85.getTree());
					}
					break;

				default :
					break loop20;
				}
			}
			} finally {dbg.exitSubRule(20);}
			dbg.location(100,34);
			char_literal86=(Token)match(input,55,FOLLOW_55_in_seqexp984);  
			stream_55.add(char_literal86);

			// AST REWRITE
			// elements: exp
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 100:38: -> ( exp )*
			{
				dbg.location(100,41);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:100:41: ( exp )*
				while ( stream_exp.hasNext() ) {
					dbg.location(100,41);
					adaptor.addChild(root_0, stream_exp.nextTree());
				}
				stream_exp.reset();

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
			// do for sure before leaving
		}
		dbg.location(101, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "seqexp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "seqexp"


	public static class callexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "callexp"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:105:1: callexp : '(' exp ( ',' exp )* ')' -> ^( ARG ( exp )* ) ;
	public final ExprParser.callexp_return callexp() throws RecognitionException {
		ExprParser.callexp_return retval = new ExprParser.callexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal87=null;
		Token char_literal89=null;
		Token char_literal91=null;
		ParserRuleReturnScope exp88 =null;
		ParserRuleReturnScope exp90 =null;

		Object char_literal87_tree=null;
		Object char_literal89_tree=null;
		Object char_literal91_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try { dbg.enterRule(getGrammarFileName(), "callexp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(105, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:105:11: ( '(' exp ( ',' exp )* ')' -> ^( ARG ( exp )* ) )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:105:12: '(' exp ( ',' exp )* ')'
			{
			dbg.location(105,12);
			char_literal87=(Token)match(input,54,FOLLOW_54_in_callexp1007);  
			stream_54.add(char_literal87);
			dbg.location(105,16);
			pushFollow(FOLLOW_exp_in_callexp1009);
			exp88=exp();
			state._fsp--;

			stream_exp.add(exp88.getTree());dbg.location(105,20);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:105:20: ( ',' exp )*
			try { dbg.enterSubRule(21);

			loop21:
			while (true) {
				int alt21=2;
				try { dbg.enterDecision(21, decisionCanBacktrack[21]);

				int LA21_0 = input.LA(1);
				if ( (LA21_0==57) ) {
					alt21=1;
				}

				} finally {dbg.exitDecision(21);}

				switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:105:21: ',' exp
					{
					dbg.location(105,21);
					char_literal89=(Token)match(input,57,FOLLOW_57_in_callexp1012);  
					stream_57.add(char_literal89);
					dbg.location(105,25);
					pushFollow(FOLLOW_exp_in_callexp1014);
					exp90=exp();
					state._fsp--;

					stream_exp.add(exp90.getTree());
					}
					break;

				default :
					break loop21;
				}
			}
			} finally {dbg.exitSubRule(21);}
			dbg.location(105,31);
			char_literal91=(Token)match(input,55,FOLLOW_55_in_callexp1018);  
			stream_55.add(char_literal91);

			// AST REWRITE
			// elements: exp
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 105:35: -> ^( ARG ( exp )* )
			{
				dbg.location(105,38);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:105:38: ^( ARG ( exp )* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(105,40);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG, "ARG"), root_1);
				dbg.location(105,44);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:105:44: ( exp )*
				while ( stream_exp.hasNext() ) {
					dbg.location(105,44);
					adaptor.addChild(root_1, stream_exp.nextTree());
				}
				stream_exp.reset();

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
			// do for sure before leaving
		}
		dbg.location(106, 5);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "callexp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "callexp"


	public static class exp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exp"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:108:1: exp : (| infixassign | ifthenelse | whileexp | forexp );
	public final ExprParser.exp_return exp() throws RecognitionException {
		ExprParser.exp_return retval = new ExprParser.exp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope infixassign92 =null;
		ParserRuleReturnScope ifthenelse93 =null;
		ParserRuleReturnScope whileexp94 =null;
		ParserRuleReturnScope forexp95 =null;


		try { dbg.enterRule(getGrammarFileName(), "exp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(108, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:108:7: (| infixassign | ifthenelse | whileexp | forexp )
			int alt22=5;
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			switch ( input.LA(1) ) {
			case EOF:
			case 55:
			case 57:
			case 62:
			case 65:
			case 68:
			case 69:
			case 70:
			case 72:
			case 74:
			case 78:
			case 79:
			case 80:
			case 81:
			case 85:
				{
				alt22=1;
				}
				break;
			case ID:
			case INTLIT:
			case STRINGLIT:
			case 54:
			case 58:
			case 67:
			case 75:
			case 76:
				{
				alt22=2;
				}
				break;
			case 73:
				{
				alt22=3;
				}
				break;
			case 82:
				{
				alt22=4;
				}
				break;
			case 71:
				{
				alt22=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:109:4: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:109:6: infixassign
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(109,6);
					pushFollow(FOLLOW_infixassign_in_exp1048);
					infixassign92=infixassign();
					state._fsp--;

					adaptor.addChild(root_0, infixassign92.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:110:6: ifthenelse
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(110,6);
					pushFollow(FOLLOW_ifthenelse_in_exp1056);
					ifthenelse93=ifthenelse();
					state._fsp--;

					adaptor.addChild(root_0, ifthenelse93.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:111:6: whileexp
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(111,6);
					pushFollow(FOLLOW_whileexp_in_exp1063);
					whileexp94=whileexp();
					state._fsp--;

					adaptor.addChild(root_0, whileexp94.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:112:6: forexp
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(112,6);
					pushFollow(FOLLOW_forexp_in_exp1070);
					forexp95=forexp();
					state._fsp--;

					adaptor.addChild(root_0, forexp95.getTree());

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
			// do for sure before leaving
		}
		dbg.location(114, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exp"


	public static class exp2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exp2"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:117:1: exp2 : ( 'of' base -> ^( OF base ) | '.' ID ( exp2 |) -> ^( ATTRIBUT ID ( exp2 )? ) );
	public final ExprParser.exp2_return exp2() throws RecognitionException {
		ExprParser.exp2_return retval = new ExprParser.exp2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal96=null;
		Token char_literal98=null;
		Token ID99=null;
		ParserRuleReturnScope base97 =null;
		ParserRuleReturnScope exp2100 =null;

		Object string_literal96_tree=null;
		Object char_literal98_tree=null;
		Object ID99_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_exp2=new RewriteRuleSubtreeStream(adaptor,"rule exp2");
		RewriteRuleSubtreeStream stream_base=new RewriteRuleSubtreeStream(adaptor,"rule base");

		try { dbg.enterRule(getGrammarFileName(), "exp2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(117, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:117:7: ( 'of' base -> ^( OF base ) | '.' ID ( exp2 |) -> ^( ATTRIBUT ID ( exp2 )? ) )
			int alt24=2;
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			int LA24_0 = input.LA(1);
			if ( (LA24_0==77) ) {
				alt24=1;
			}
			else if ( (LA24_0==59) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:117:9: 'of' base
					{
					dbg.location(117,9);
					string_literal96=(Token)match(input,77,FOLLOW_77_in_exp21087);  
					stream_77.add(string_literal96);
					dbg.location(117,14);
					pushFollow(FOLLOW_base_in_exp21089);
					base97=base();
					state._fsp--;

					stream_base.add(base97.getTree());
					// AST REWRITE
					// elements: base
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 117:22: -> ^( OF base )
					{
						dbg.location(117,25);
						// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:117:25: ^( OF base )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(117,27);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OF, "OF"), root_1);
						dbg.location(117,30);
						adaptor.addChild(root_1, stream_base.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:118:3: '.' ID ( exp2 |)
					{
					dbg.location(118,3);
					char_literal98=(Token)match(input,59,FOLLOW_59_in_exp21104);  
					stream_59.add(char_literal98);
					dbg.location(118,7);
					ID99=(Token)match(input,ID,FOLLOW_ID_in_exp21106);  
					stream_ID.add(ID99);
					dbg.location(118,9);
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:118:9: ( exp2 |)
					int alt23=2;
					try { dbg.enterSubRule(23);
					try { dbg.enterDecision(23, decisionCanBacktrack[23]);

					int LA23_0 = input.LA(1);
					if ( (LA23_0==59||LA23_0==77) ) {
						alt23=1;
					}
					else if ( (LA23_0==EOF||(LA23_0 >= INFIXCOMP && LA23_0 <= INFIXMULTDIV)||LA23_0==53||(LA23_0 >= 55 && LA23_0 <= 58)||(LA23_0 >= 61 && LA23_0 <= 63)||LA23_0==65||(LA23_0 >= 68 && LA23_0 <= 70)||LA23_0==72||LA23_0==74||(LA23_0 >= 78 && LA23_0 <= 81)||(LA23_0 >= 84 && LA23_0 <= 85)) ) {
						alt23=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(23);}

					switch (alt23) {
						case 1 :
							dbg.enterAlt(1);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:118:11: exp2
							{
							dbg.location(118,11);
							pushFollow(FOLLOW_exp2_in_exp21109);
							exp2100=exp2();
							state._fsp--;

							stream_exp2.add(exp2100.getTree());
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:118:16: 
							{
							}
							break;

					}
					} finally {dbg.exitSubRule(23);}

					// AST REWRITE
					// elements: exp2, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 118:18: -> ^( ATTRIBUT ID ( exp2 )? )
					{
						dbg.location(118,21);
						// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:118:21: ^( ATTRIBUT ID ( exp2 )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(118,23);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBUT, "ATTRIBUT"), root_1);
						dbg.location(118,32);
						adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(118,35);
						// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:118:35: ( exp2 )?
						if ( stream_exp2.hasNext() ) {
							dbg.location(118,36);
							adaptor.addChild(root_1, stream_exp2.nextTree());
						}
						stream_exp2.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

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
			// do for sure before leaving
		}
		dbg.location(120, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exp2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exp2"


	public static class callcrochet_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "callcrochet"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:121:1: callcrochet : ( '[' exp ']' )+ ( exp2 )? -> ( exp )+ ( exp2 )? ;
	public final ExprParser.callcrochet_return callcrochet() throws RecognitionException {
		ExprParser.callcrochet_return retval = new ExprParser.callcrochet_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal101=null;
		Token char_literal103=null;
		ParserRuleReturnScope exp102 =null;
		ParserRuleReturnScope exp2104 =null;

		Object char_literal101_tree=null;
		Object char_literal103_tree=null;
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_exp2=new RewriteRuleSubtreeStream(adaptor,"rule exp2");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try { dbg.enterRule(getGrammarFileName(), "callcrochet");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(121, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:121:15: ( ( '[' exp ']' )+ ( exp2 )? -> ( exp )+ ( exp2 )? )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:121:17: ( '[' exp ']' )+ ( exp2 )?
			{
			dbg.location(121,17);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:121:17: ( '[' exp ']' )+
			int cnt25=0;
			try { dbg.enterSubRule(25);

			loop25:
			while (true) {
				int alt25=2;
				try { dbg.enterDecision(25, decisionCanBacktrack[25]);

				int LA25_0 = input.LA(1);
				if ( (LA25_0==64) ) {
					alt25=1;
				}

				} finally {dbg.exitDecision(25);}

				switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:121:18: '[' exp ']'
					{
					dbg.location(121,18);
					char_literal101=(Token)match(input,64,FOLLOW_64_in_callcrochet1139);  
					stream_64.add(char_literal101);
					dbg.location(121,22);
					pushFollow(FOLLOW_exp_in_callcrochet1141);
					exp102=exp();
					state._fsp--;

					stream_exp.add(exp102.getTree());dbg.location(121,26);
					char_literal103=(Token)match(input,65,FOLLOW_65_in_callcrochet1143);  
					stream_65.add(char_literal103);

					}
					break;

				default :
					if ( cnt25 >= 1 ) break loop25;
					EarlyExitException eee = new EarlyExitException(25, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt25++;
			}
			} finally {dbg.exitSubRule(25);}
			dbg.location(121,32);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:121:32: ( exp2 )?
			int alt26=2;
			try { dbg.enterSubRule(26);
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			int LA26_0 = input.LA(1);
			if ( (LA26_0==59||LA26_0==77) ) {
				alt26=1;
			}
			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:121:33: exp2
					{
					dbg.location(121,33);
					pushFollow(FOLLOW_exp2_in_callcrochet1148);
					exp2104=exp2();
					state._fsp--;

					stream_exp2.add(exp2104.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(26);}

			// AST REWRITE
			// elements: exp, exp2
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 121:41: -> ( exp )+ ( exp2 )?
			{
				dbg.location(121,44);
				if ( !(stream_exp.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_exp.hasNext() ) {
					dbg.location(121,44);
					adaptor.addChild(root_0, stream_exp.nextTree());
				}
				stream_exp.reset();
				dbg.location(121,50);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:121:50: ( exp2 )?
				if ( stream_exp2.hasNext() ) {
					dbg.location(121,51);
					adaptor.addChild(root_0, stream_exp2.nextTree());
				}
				stream_exp2.reset();

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
			// do for sure before leaving
		}
		dbg.location(122, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "callcrochet");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "callcrochet"


	public static class infixassign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "infixassign"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:126:1: infixassign : infixor ( ':=' ^ infixor )? ;
	public final ExprParser.infixassign_return infixassign() throws RecognitionException {
		ExprParser.infixassign_return retval = new ExprParser.infixassign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal106=null;
		ParserRuleReturnScope infixor105 =null;
		ParserRuleReturnScope infixor107 =null;

		Object string_literal106_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "infixassign");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(126, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:126:14: ( infixor ( ':=' ^ infixor )? )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:126:17: infixor ( ':=' ^ infixor )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(126,17);
			pushFollow(FOLLOW_infixor_in_infixassign1176);
			infixor105=infixor();
			state._fsp--;

			adaptor.addChild(root_0, infixor105.getTree());
			dbg.location(126,25);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:126:25: ( ':=' ^ infixor )?
			int alt27=2;
			try { dbg.enterSubRule(27);
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			int LA27_0 = input.LA(1);
			if ( (LA27_0==61) ) {
				alt27=1;
			}
			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:126:26: ':=' ^ infixor
					{
					dbg.location(126,30);
					string_literal106=(Token)match(input,61,FOLLOW_61_in_infixassign1179); 
					string_literal106_tree = (Object)adaptor.create(string_literal106);
					root_0 = (Object)adaptor.becomeRoot(string_literal106_tree, root_0);
					dbg.location(126,32);
					pushFollow(FOLLOW_infixor_in_infixassign1182);
					infixor107=infixor();
					state._fsp--;

					adaptor.addChild(root_0, infixor107.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(27);}

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
			// do for sure before leaving
		}
		dbg.location(129, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "infixassign");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "infixassign"


	public static class infixor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "infixor"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:131:1: infixor : infixand ( '|' ^ infixand )* ;
	public final ExprParser.infixor_return infixor() throws RecognitionException {
		ExprParser.infixor_return retval = new ExprParser.infixor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal109=null;
		ParserRuleReturnScope infixand108 =null;
		ParserRuleReturnScope infixand110 =null;

		Object char_literal109_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "infixor");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(131, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:131:9: ( infixand ( '|' ^ infixand )* )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:131:11: infixand ( '|' ^ infixand )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(131,11);
			pushFollow(FOLLOW_infixand_in_infixor1199);
			infixand108=infixand();
			state._fsp--;

			adaptor.addChild(root_0, infixand108.getTree());
			dbg.location(131,20);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:131:20: ( '|' ^ infixand )*
			try { dbg.enterSubRule(28);

			loop28:
			while (true) {
				int alt28=2;
				try { dbg.enterDecision(28, decisionCanBacktrack[28]);

				int LA28_0 = input.LA(1);
				if ( (LA28_0==84) ) {
					alt28=1;
				}

				} finally {dbg.exitDecision(28);}

				switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:131:21: '|' ^ infixand
					{
					dbg.location(131,24);
					char_literal109=(Token)match(input,84,FOLLOW_84_in_infixor1202); 
					char_literal109_tree = (Object)adaptor.create(char_literal109);
					root_0 = (Object)adaptor.becomeRoot(char_literal109_tree, root_0);
					dbg.location(131,26);
					pushFollow(FOLLOW_infixand_in_infixor1205);
					infixand110=infixand();
					state._fsp--;

					adaptor.addChild(root_0, infixand110.getTree());

					}
					break;

				default :
					break loop28;
				}
			}
			} finally {dbg.exitSubRule(28);}

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
			// do for sure before leaving
		}
		dbg.location(132, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "infixor");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "infixor"


	public static class infixand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "infixand"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:134:1: infixand : comp ( '&' ^ comp )* ;
	public final ExprParser.infixand_return infixand() throws RecognitionException {
		ExprParser.infixand_return retval = new ExprParser.infixand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal112=null;
		ParserRuleReturnScope comp111 =null;
		ParserRuleReturnScope comp113 =null;

		Object char_literal112_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "infixand");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(134, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:134:10: ( comp ( '&' ^ comp )* )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:134:12: comp ( '&' ^ comp )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(134,12);
			pushFollow(FOLLOW_comp_in_infixand1217);
			comp111=comp();
			state._fsp--;

			adaptor.addChild(root_0, comp111.getTree());
			dbg.location(134,17);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:134:17: ( '&' ^ comp )*
			try { dbg.enterSubRule(29);

			loop29:
			while (true) {
				int alt29=2;
				try { dbg.enterDecision(29, decisionCanBacktrack[29]);

				int LA29_0 = input.LA(1);
				if ( (LA29_0==53) ) {
					alt29=1;
				}

				} finally {dbg.exitDecision(29);}

				switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:134:18: '&' ^ comp
					{
					dbg.location(134,22);
					char_literal112=(Token)match(input,53,FOLLOW_53_in_infixand1220); 
					char_literal112_tree = (Object)adaptor.create(char_literal112);
					root_0 = (Object)adaptor.becomeRoot(char_literal112_tree, root_0);
					dbg.location(134,23);
					pushFollow(FOLLOW_comp_in_infixand1223);
					comp113=comp();
					state._fsp--;

					adaptor.addChild(root_0, comp113.getTree());

					}
					break;

				default :
					break loop29;
				}
			}
			} finally {dbg.exitSubRule(29);}

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
			// do for sure before leaving
		}
		dbg.location(135, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "infixand");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "infixand"


	public static class comp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comp"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:137:1: comp : add ( ( INFIXCOMP ^| '=' ^) add )* ;
	public final ExprParser.comp_return comp() throws RecognitionException {
		ExprParser.comp_return retval = new ExprParser.comp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INFIXCOMP115=null;
		Token char_literal116=null;
		ParserRuleReturnScope add114 =null;
		ParserRuleReturnScope add117 =null;

		Object INFIXCOMP115_tree=null;
		Object char_literal116_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "comp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(137, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:137:6: ( add ( ( INFIXCOMP ^| '=' ^) add )* )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:137:8: add ( ( INFIXCOMP ^| '=' ^) add )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(137,8);
			pushFollow(FOLLOW_add_in_comp1235);
			add114=add();
			state._fsp--;

			adaptor.addChild(root_0, add114.getTree());
			dbg.location(137,12);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:137:12: ( ( INFIXCOMP ^| '=' ^) add )*
			try { dbg.enterSubRule(31);

			loop31:
			while (true) {
				int alt31=2;
				try { dbg.enterDecision(31, decisionCanBacktrack[31]);

				int LA31_0 = input.LA(1);
				if ( (LA31_0==INFIXCOMP||LA31_0==63) ) {
					alt31=1;
				}

				} finally {dbg.exitDecision(31);}

				switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:137:13: ( INFIXCOMP ^| '=' ^) add
					{
					dbg.location(137,13);
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:137:13: ( INFIXCOMP ^| '=' ^)
					int alt30=2;
					try { dbg.enterSubRule(30);
					try { dbg.enterDecision(30, decisionCanBacktrack[30]);

					int LA30_0 = input.LA(1);
					if ( (LA30_0==INFIXCOMP) ) {
						alt30=1;
					}
					else if ( (LA30_0==63) ) {
						alt30=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(30);}

					switch (alt30) {
						case 1 :
							dbg.enterAlt(1);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:137:14: INFIXCOMP ^
							{
							dbg.location(137,24);
							INFIXCOMP115=(Token)match(input,INFIXCOMP,FOLLOW_INFIXCOMP_in_comp1239); 
							INFIXCOMP115_tree = (Object)adaptor.create(INFIXCOMP115);
							root_0 = (Object)adaptor.becomeRoot(INFIXCOMP115_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:137:27: '=' ^
							{
							dbg.location(137,31);
							char_literal116=(Token)match(input,63,FOLLOW_63_in_comp1244); 
							char_literal116_tree = (Object)adaptor.create(char_literal116);
							root_0 = (Object)adaptor.becomeRoot(char_literal116_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(30);}
					dbg.location(137,35);
					pushFollow(FOLLOW_add_in_comp1250);
					add117=add();
					state._fsp--;

					adaptor.addChild(root_0, add117.getTree());

					}
					break;

				default :
					break loop31;
				}
			}
			} finally {dbg.exitSubRule(31);}

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
			// do for sure before leaving
		}
		dbg.location(138, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "comp"


	public static class add_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "add"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:140:1: add : mult ( ( '-' | '+' ) ^ mult )* ;
	public final ExprParser.add_return add() throws RecognitionException {
		ExprParser.add_return retval = new ExprParser.add_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set119=null;
		ParserRuleReturnScope mult118 =null;
		ParserRuleReturnScope mult120 =null;

		Object set119_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "add");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(140, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:140:4: ( mult ( ( '-' | '+' ) ^ mult )* )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:140:7: mult ( ( '-' | '+' ) ^ mult )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(140,7);
			pushFollow(FOLLOW_mult_in_add1263);
			mult118=mult();
			state._fsp--;

			adaptor.addChild(root_0, mult118.getTree());
			dbg.location(140,11);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:140:11: ( ( '-' | '+' ) ^ mult )*
			try { dbg.enterSubRule(32);

			loop32:
			while (true) {
				int alt32=2;
				try { dbg.enterDecision(32, decisionCanBacktrack[32]);

				int LA32_0 = input.LA(1);
				if ( (LA32_0==56||LA32_0==58) ) {
					alt32=1;
				}

				} finally {dbg.exitDecision(32);}

				switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:140:12: ( '-' | '+' ) ^ mult
					{
					dbg.location(140,21);
					set119=input.LT(1);
					set119=input.LT(1);
					if ( input.LA(1)==56||input.LA(1)==58 ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set119), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(140,22);
					pushFollow(FOLLOW_mult_in_add1271);
					mult120=mult();
					state._fsp--;

					adaptor.addChild(root_0, mult120.getTree());

					}
					break;

				default :
					break loop32;
				}
			}
			} finally {dbg.exitSubRule(32);}

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
			// do for sure before leaving
		}
		dbg.location(141, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "add");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "add"


	public static class mult_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mult"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:143:1: mult : base ( INFIXMULTDIV ^ base )* ;
	public final ExprParser.mult_return mult() throws RecognitionException {
		ExprParser.mult_return retval = new ExprParser.mult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INFIXMULTDIV122=null;
		ParserRuleReturnScope base121 =null;
		ParserRuleReturnScope base123 =null;

		Object INFIXMULTDIV122_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "mult");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(143, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:143:6: ( base ( INFIXMULTDIV ^ base )* )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:143:8: base ( INFIXMULTDIV ^ base )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(143,8);
			pushFollow(FOLLOW_base_in_mult1284);
			base121=base();
			state._fsp--;

			adaptor.addChild(root_0, base121.getTree());
			dbg.location(143,12);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:143:12: ( INFIXMULTDIV ^ base )*
			try { dbg.enterSubRule(33);

			loop33:
			while (true) {
				int alt33=2;
				try { dbg.enterDecision(33, decisionCanBacktrack[33]);

				int LA33_0 = input.LA(1);
				if ( (LA33_0==INFIXMULTDIV) ) {
					alt33=1;
				}

				} finally {dbg.exitDecision(33);}

				switch (alt33) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:143:13: INFIXMULTDIV ^ base
					{
					dbg.location(143,26);
					INFIXMULTDIV122=(Token)match(input,INFIXMULTDIV,FOLLOW_INFIXMULTDIV_in_mult1286); 
					INFIXMULTDIV122_tree = (Object)adaptor.create(INFIXMULTDIV122);
					root_0 = (Object)adaptor.becomeRoot(INFIXMULTDIV122_tree, root_0);
					dbg.location(143,28);
					pushFollow(FOLLOW_base_in_mult1290);
					base123=base();
					state._fsp--;

					adaptor.addChild(root_0, base123.getTree());

					}
					break;

				default :
					break loop33;
				}
			}
			} finally {dbg.exitSubRule(33);}

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
			// do for sure before leaving
		}
		dbg.location(144, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mult");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "mult"


	public static class base_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "base"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:147:1: base : ( INTLIT | '-' base -> ^( MOINS_UNAIRE base ) | ID ( '.' att= ID ( exp2 )? -> ^( ATTRIBUT ID $att ( exp2 )? ) | callcrochet -> ^( CALLCROCHET ID callcrochet ) | callexp -> ^( CALLFUN ID callexp ) | reccreate -> ^( VARRECORD ID reccreate ) | -> ^( ID ) ) | seqexp | 'nil' | STRINGLIT | letexp | 'break' );
	public final ExprParser.base_return base() throws RecognitionException {
		ExprParser.base_return retval = new ExprParser.base_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token att=null;
		Token INTLIT124=null;
		Token char_literal125=null;
		Token ID127=null;
		Token char_literal128=null;
		Token string_literal134=null;
		Token STRINGLIT135=null;
		Token string_literal137=null;
		ParserRuleReturnScope base126 =null;
		ParserRuleReturnScope exp2129 =null;
		ParserRuleReturnScope callcrochet130 =null;
		ParserRuleReturnScope callexp131 =null;
		ParserRuleReturnScope reccreate132 =null;
		ParserRuleReturnScope seqexp133 =null;
		ParserRuleReturnScope letexp136 =null;

		Object att_tree=null;
		Object INTLIT124_tree=null;
		Object char_literal125_tree=null;
		Object ID127_tree=null;
		Object char_literal128_tree=null;
		Object string_literal134_tree=null;
		Object STRINGLIT135_tree=null;
		Object string_literal137_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_reccreate=new RewriteRuleSubtreeStream(adaptor,"rule reccreate");
		RewriteRuleSubtreeStream stream_callcrochet=new RewriteRuleSubtreeStream(adaptor,"rule callcrochet");
		RewriteRuleSubtreeStream stream_exp2=new RewriteRuleSubtreeStream(adaptor,"rule exp2");
		RewriteRuleSubtreeStream stream_callexp=new RewriteRuleSubtreeStream(adaptor,"rule callexp");
		RewriteRuleSubtreeStream stream_base=new RewriteRuleSubtreeStream(adaptor,"rule base");

		try { dbg.enterRule(getGrammarFileName(), "base");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(147, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:147:6: ( INTLIT | '-' base -> ^( MOINS_UNAIRE base ) | ID ( '.' att= ID ( exp2 )? -> ^( ATTRIBUT ID $att ( exp2 )? ) | callcrochet -> ^( CALLCROCHET ID callcrochet ) | callexp -> ^( CALLFUN ID callexp ) | reccreate -> ^( VARRECORD ID reccreate ) | -> ^( ID ) ) | seqexp | 'nil' | STRINGLIT | letexp | 'break' )
			int alt36=8;
			try { dbg.enterDecision(36, decisionCanBacktrack[36]);

			switch ( input.LA(1) ) {
			case INTLIT:
				{
				alt36=1;
				}
				break;
			case 58:
				{
				alt36=2;
				}
				break;
			case ID:
				{
				alt36=3;
				}
				break;
			case 54:
				{
				alt36=4;
				}
				break;
			case 76:
				{
				alt36=5;
				}
				break;
			case STRINGLIT:
				{
				alt36=6;
				}
				break;
			case 75:
				{
				alt36=7;
				}
				break;
			case 67:
				{
				alt36=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(36);}

			switch (alt36) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:147:8: INTLIT
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(147,8);
					INTLIT124=(Token)match(input,INTLIT,FOLLOW_INTLIT_in_base1303); 
					INTLIT124_tree = (Object)adaptor.create(INTLIT124);
					adaptor.addChild(root_0, INTLIT124_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:148:10: '-' base
					{
					dbg.location(148,10);
					char_literal125=(Token)match(input,58,FOLLOW_58_in_base1314);  
					stream_58.add(char_literal125);
					dbg.location(148,15);
					pushFollow(FOLLOW_base_in_base1317);
					base126=base();
					state._fsp--;

					stream_base.add(base126.getTree());
					// AST REWRITE
					// elements: base
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 148:21: -> ^( MOINS_UNAIRE base )
					{
						dbg.location(148,24);
						// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:148:24: ^( MOINS_UNAIRE base )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(148,26);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MOINS_UNAIRE, "MOINS_UNAIRE"), root_1);
						dbg.location(148,39);
						adaptor.addChild(root_1, stream_base.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:149:11: ID ( '.' att= ID ( exp2 )? -> ^( ATTRIBUT ID $att ( exp2 )? ) | callcrochet -> ^( CALLCROCHET ID callcrochet ) | callexp -> ^( CALLFUN ID callexp ) | reccreate -> ^( VARRECORD ID reccreate ) | -> ^( ID ) )
					{
					dbg.location(149,11);
					ID127=(Token)match(input,ID,FOLLOW_ID_in_base1338);  
					stream_ID.add(ID127);
					dbg.location(149,14);
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:149:14: ( '.' att= ID ( exp2 )? -> ^( ATTRIBUT ID $att ( exp2 )? ) | callcrochet -> ^( CALLCROCHET ID callcrochet ) | callexp -> ^( CALLFUN ID callexp ) | reccreate -> ^( VARRECORD ID reccreate ) | -> ^( ID ) )
					int alt35=5;
					try { dbg.enterSubRule(35);
					try { dbg.enterDecision(35, decisionCanBacktrack[35]);

					switch ( input.LA(1) ) {
					case 59:
						{
						alt35=1;
						}
						break;
					case 64:
						{
						alt35=2;
						}
						break;
					case 54:
						{
						alt35=3;
						}
						break;
					case 83:
						{
						alt35=4;
						}
						break;
					case EOF:
					case INFIXCOMP:
					case INFIXMULTDIV:
					case 53:
					case 55:
					case 56:
					case 57:
					case 58:
					case 61:
					case 62:
					case 63:
					case 65:
					case 68:
					case 69:
					case 70:
					case 72:
					case 74:
					case 78:
					case 79:
					case 80:
					case 81:
					case 84:
					case 85:
						{
						alt35=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 35, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(35);}

					switch (alt35) {
						case 1 :
							dbg.enterAlt(1);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:149:16: '.' att= ID ( exp2 )?
							{
							dbg.location(149,16);
							char_literal128=(Token)match(input,59,FOLLOW_59_in_base1342);  
							stream_59.add(char_literal128);
							dbg.location(149,23);
							att=(Token)match(input,ID,FOLLOW_ID_in_base1346);  
							stream_ID.add(att);
							dbg.location(149,26);
							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:149:26: ( exp2 )?
							int alt34=2;
							try { dbg.enterSubRule(34);
							try { dbg.enterDecision(34, decisionCanBacktrack[34]);

							int LA34_0 = input.LA(1);
							if ( (LA34_0==59||LA34_0==77) ) {
								alt34=1;
							}
							} finally {dbg.exitDecision(34);}

							switch (alt34) {
								case 1 :
									dbg.enterAlt(1);

									// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:149:28: exp2
									{
									dbg.location(149,28);
									pushFollow(FOLLOW_exp2_in_base1349);
									exp2129=exp2();
									state._fsp--;

									stream_exp2.add(exp2129.getTree());
									}
									break;

							}
							} finally {dbg.exitSubRule(34);}

							// AST REWRITE
							// elements: ID, exp2, att
							// token labels: att
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleTokenStream stream_att=new RewriteRuleTokenStream(adaptor,"token att",att);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 149:35: -> ^( ATTRIBUT ID $att ( exp2 )? )
							{
								dbg.location(149,38);
								// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:149:38: ^( ATTRIBUT ID $att ( exp2 )? )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(149,40);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBUT, "ATTRIBUT"), root_1);
								dbg.location(149,49);
								adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(149,53);
								adaptor.addChild(root_1, stream_att.nextNode());dbg.location(149,57);
								// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:149:57: ( exp2 )?
								if ( stream_exp2.hasNext() ) {
									dbg.location(149,58);
									adaptor.addChild(root_1, stream_exp2.nextTree());
								}
								stream_exp2.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:150:11: callcrochet
							{
							dbg.location(150,11);
							pushFollow(FOLLOW_callcrochet_in_base1379);
							callcrochet130=callcrochet();
							state._fsp--;

							stream_callcrochet.add(callcrochet130.getTree());
							// AST REWRITE
							// elements: callcrochet, ID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 150:23: -> ^( CALLCROCHET ID callcrochet )
							{
								dbg.location(150,25);
								// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:150:25: ^( CALLCROCHET ID callcrochet )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(150,27);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALLCROCHET, "CALLCROCHET"), root_1);
								dbg.location(150,39);
								adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(150,42);
								adaptor.addChild(root_1, stream_callcrochet.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:151:12: callexp
							{
							dbg.location(151,12);
							pushFollow(FOLLOW_callexp_in_base1401);
							callexp131=callexp();
							state._fsp--;

							stream_callexp.add(callexp131.getTree());
							// AST REWRITE
							// elements: callexp, ID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 151:20: -> ^( CALLFUN ID callexp )
							{
								dbg.location(151,23);
								// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:151:23: ^( CALLFUN ID callexp )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(151,25);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALLFUN, "CALLFUN"), root_1);
								dbg.location(151,33);
								adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(151,37);
								adaptor.addChild(root_1, stream_callexp.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:152:12: reccreate
							{
							dbg.location(152,12);
							pushFollow(FOLLOW_reccreate_in_base1426);
							reccreate132=reccreate();
							state._fsp--;

							stream_reccreate.add(reccreate132.getTree());
							// AST REWRITE
							// elements: reccreate, ID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 152:22: -> ^( VARRECORD ID reccreate )
							{
								dbg.location(152,25);
								// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:152:25: ^( VARRECORD ID reccreate )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(152,28);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARRECORD, "VARRECORD"), root_1);
								dbg.location(152,38);
								adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(152,41);
								adaptor.addChild(root_1, stream_reccreate.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 5 :
							dbg.enterAlt(5);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:153:11: 
							{
							// AST REWRITE
							// elements: ID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 153:11: -> ^( ID )
							{
								dbg.location(153,13);
								// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:153:13: ^( ID )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(153,16);
								root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(35);}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:155:11: seqexp
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(155,11);
					pushFollow(FOLLOW_seqexp_in_base1485);
					seqexp133=seqexp();
					state._fsp--;

					adaptor.addChild(root_0, seqexp133.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:156:11: 'nil'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(156,11);
					string_literal134=(Token)match(input,76,FOLLOW_76_in_base1497); 
					string_literal134_tree = (Object)adaptor.create(string_literal134);
					adaptor.addChild(root_0, string_literal134_tree);

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:157:11: STRINGLIT
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(157,11);
					STRINGLIT135=(Token)match(input,STRINGLIT,FOLLOW_STRINGLIT_in_base1509); 
					STRINGLIT135_tree = (Object)adaptor.create(STRINGLIT135);
					adaptor.addChild(root_0, STRINGLIT135_tree);

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:158:11: letexp
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(158,11);
					pushFollow(FOLLOW_letexp_in_base1521);
					letexp136=letexp();
					state._fsp--;

					adaptor.addChild(root_0, letexp136.getTree());

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:159:11: 'break'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(159,11);
					string_literal137=(Token)match(input,67,FOLLOW_67_in_base1533); 
					string_literal137_tree = (Object)adaptor.create(string_literal137);
					adaptor.addChild(root_0, string_literal137_tree);

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
			// do for sure before leaving
		}
		dbg.location(160, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "base");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "base"


	public static class letexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "letexp"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:165:1: letexp : 'let' ( dec )* ( 'in' exp ( ';' exp )* )? 'end' -> ^( LET ( dec )* ) ( ^( IN ( exp )* ) )? ^( END ) ;
	public final ExprParser.letexp_return letexp() throws RecognitionException {
		ExprParser.letexp_return retval = new ExprParser.letexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal138=null;
		Token string_literal140=null;
		Token char_literal142=null;
		Token string_literal144=null;
		ParserRuleReturnScope dec139 =null;
		ParserRuleReturnScope exp141 =null;
		ParserRuleReturnScope exp143 =null;

		Object string_literal138_tree=null;
		Object string_literal140_tree=null;
		Object char_literal142_tree=null;
		Object string_literal144_tree=null;
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleSubtreeStream stream_dec=new RewriteRuleSubtreeStream(adaptor,"rule dec");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try { dbg.enterRule(getGrammarFileName(), "letexp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(165, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:165:12: ( 'let' ( dec )* ( 'in' exp ( ';' exp )* )? 'end' -> ^( LET ( dec )* ) ( ^( IN ( exp )* ) )? ^( END ) )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:165:14: 'let' ( dec )* ( 'in' exp ( ';' exp )* )? 'end'
			{
			dbg.location(165,14);
			string_literal138=(Token)match(input,75,FOLLOW_75_in_letexp1559);  
			stream_75.add(string_literal138);
			dbg.location(165,20);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:165:20: ( dec )*
			try { dbg.enterSubRule(37);

			loop37:
			while (true) {
				int alt37=2;
				try { dbg.enterDecision(37, decisionCanBacktrack[37]);

				int LA37_0 = input.LA(1);
				if ( (LA37_0==72||(LA37_0 >= 80 && LA37_0 <= 81)) ) {
					alt37=1;
				}

				} finally {dbg.exitDecision(37);}

				switch (alt37) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:165:20: dec
					{
					dbg.location(165,20);
					pushFollow(FOLLOW_dec_in_letexp1561);
					dec139=dec();
					state._fsp--;

					stream_dec.add(dec139.getTree());
					}
					break;

				default :
					break loop37;
				}
			}
			} finally {dbg.exitSubRule(37);}
			dbg.location(165,25);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:165:25: ( 'in' exp ( ';' exp )* )?
			int alt39=2;
			try { dbg.enterSubRule(39);
			try { dbg.enterDecision(39, decisionCanBacktrack[39]);

			int LA39_0 = input.LA(1);
			if ( (LA39_0==74) ) {
				alt39=1;
			}
			} finally {dbg.exitDecision(39);}

			switch (alt39) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:165:26: 'in' exp ( ';' exp )*
					{
					dbg.location(165,26);
					string_literal140=(Token)match(input,74,FOLLOW_74_in_letexp1565);  
					stream_74.add(string_literal140);
					dbg.location(165,31);
					pushFollow(FOLLOW_exp_in_letexp1567);
					exp141=exp();
					state._fsp--;

					stream_exp.add(exp141.getTree());dbg.location(165,35);
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:165:35: ( ';' exp )*
					try { dbg.enterSubRule(38);

					loop38:
					while (true) {
						int alt38=2;
						try { dbg.enterDecision(38, decisionCanBacktrack[38]);

						int LA38_0 = input.LA(1);
						if ( (LA38_0==62) ) {
							alt38=1;
						}

						} finally {dbg.exitDecision(38);}

						switch (alt38) {
						case 1 :
							dbg.enterAlt(1);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:165:36: ';' exp
							{
							dbg.location(165,36);
							char_literal142=(Token)match(input,62,FOLLOW_62_in_letexp1570);  
							stream_62.add(char_literal142);
							dbg.location(165,40);
							pushFollow(FOLLOW_exp_in_letexp1572);
							exp143=exp();
							state._fsp--;

							stream_exp.add(exp143.getTree());
							}
							break;

						default :
							break loop38;
						}
					}
					} finally {dbg.exitSubRule(38);}

					}
					break;

			}
			} finally {dbg.exitSubRule(39);}
			dbg.location(165,48);
			string_literal144=(Token)match(input,70,FOLLOW_70_in_letexp1578);  
			stream_70.add(string_literal144);

			// AST REWRITE
			// elements: dec, exp
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 165:54: -> ^( LET ( dec )* ) ( ^( IN ( exp )* ) )? ^( END )
			{
				dbg.location(165,58);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:165:58: ^( LET ( dec )* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(165,61);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LET, "LET"), root_1);
				dbg.location(165,65);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:165:65: ( dec )*
				while ( stream_dec.hasNext() ) {
					dbg.location(165,65);
					adaptor.addChild(root_1, stream_dec.nextTree());
				}
				stream_dec.reset();

				adaptor.addChild(root_0, root_1);
				}
				dbg.location(165,72);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:165:72: ( ^( IN ( exp )* ) )?
				if ( stream_exp.hasNext() ) {
					dbg.location(165,72);
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:165:72: ^( IN ( exp )* )
					{
					Object root_1 = (Object)adaptor.nil();
					dbg.location(165,74);
					root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_1);
					dbg.location(165,77);
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:165:77: ( exp )*
					while ( stream_exp.hasNext() ) {
						dbg.location(165,77);
						adaptor.addChild(root_1, stream_exp.nextTree());
					}
					stream_exp.reset();

					adaptor.addChild(root_0, root_1);
					}

				}
				stream_exp.reset();
				dbg.location(165,84);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:165:84: ^( END )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(165,86);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(END, "END"), root_1);
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
			// do for sure before leaving
		}
		dbg.location(166, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "letexp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "letexp"


	public static class negation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "negation"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:168:1: negation : '-' exp ;
	public final ExprParser.negation_return negation() throws RecognitionException {
		ExprParser.negation_return retval = new ExprParser.negation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal145=null;
		ParserRuleReturnScope exp146 =null;

		Object char_literal145_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "negation");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(168, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:168:12: ( '-' exp )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:168:14: '-' exp
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(168,14);
			char_literal145=(Token)match(input,58,FOLLOW_58_in_negation1619); 
			char_literal145_tree = (Object)adaptor.create(char_literal145);
			adaptor.addChild(root_0, char_literal145_tree);
			dbg.location(168,18);
			pushFollow(FOLLOW_exp_in_negation1621);
			exp146=exp();
			state._fsp--;

			adaptor.addChild(root_0, exp146.getTree());

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
			// do for sure before leaving
		}
		dbg.location(169, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "negation");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "negation"


	public static class arrcreate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrcreate"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:171:1: arrcreate : '[' exp ']' 'of' exp ;
	public final ExprParser.arrcreate_return arrcreate() throws RecognitionException {
		ExprParser.arrcreate_return retval = new ExprParser.arrcreate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal147=null;
		Token char_literal149=null;
		Token string_literal150=null;
		ParserRuleReturnScope exp148 =null;
		ParserRuleReturnScope exp151 =null;

		Object char_literal147_tree=null;
		Object char_literal149_tree=null;
		Object string_literal150_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "arrcreate");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(171, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:171:13: ( '[' exp ']' 'of' exp )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:171:15: '[' exp ']' 'of' exp
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(171,15);
			char_literal147=(Token)match(input,64,FOLLOW_64_in_arrcreate1635); 
			char_literal147_tree = (Object)adaptor.create(char_literal147);
			adaptor.addChild(root_0, char_literal147_tree);
			dbg.location(171,19);
			pushFollow(FOLLOW_exp_in_arrcreate1637);
			exp148=exp();
			state._fsp--;

			adaptor.addChild(root_0, exp148.getTree());
			dbg.location(171,23);
			char_literal149=(Token)match(input,65,FOLLOW_65_in_arrcreate1639); 
			char_literal149_tree = (Object)adaptor.create(char_literal149);
			adaptor.addChild(root_0, char_literal149_tree);
			dbg.location(171,27);
			string_literal150=(Token)match(input,77,FOLLOW_77_in_arrcreate1641); 
			string_literal150_tree = (Object)adaptor.create(string_literal150);
			adaptor.addChild(root_0, string_literal150_tree);
			dbg.location(171,32);
			pushFollow(FOLLOW_exp_in_arrcreate1643);
			exp151=exp();
			state._fsp--;

			adaptor.addChild(root_0, exp151.getTree());

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
			// do for sure before leaving
		}
		dbg.location(172, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arrcreate");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "arrcreate"


	public static class reccreate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "reccreate"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:174:1: reccreate : '{' (one= fieldcreate ( ',' two= fieldcreate )* )? '}' -> ( $one)? ( $two)* ;
	public final ExprParser.reccreate_return reccreate() throws RecognitionException {
		ExprParser.reccreate_return retval = new ExprParser.reccreate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal152=null;
		Token char_literal153=null;
		Token char_literal154=null;
		ParserRuleReturnScope one =null;
		ParserRuleReturnScope two =null;

		Object char_literal152_tree=null;
		Object char_literal153_tree=null;
		Object char_literal154_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_fieldcreate=new RewriteRuleSubtreeStream(adaptor,"rule fieldcreate");

		try { dbg.enterRule(getGrammarFileName(), "reccreate");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(174, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:174:13: ( '{' (one= fieldcreate ( ',' two= fieldcreate )* )? '}' -> ( $one)? ( $two)* )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:174:15: '{' (one= fieldcreate ( ',' two= fieldcreate )* )? '}'
			{
			dbg.location(174,15);
			char_literal152=(Token)match(input,83,FOLLOW_83_in_reccreate1657);  
			stream_83.add(char_literal152);
			dbg.location(174,19);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:174:19: (one= fieldcreate ( ',' two= fieldcreate )* )?
			int alt41=2;
			try { dbg.enterSubRule(41);
			try { dbg.enterDecision(41, decisionCanBacktrack[41]);

			int LA41_0 = input.LA(1);
			if ( (LA41_0==ID) ) {
				alt41=1;
			}
			} finally {dbg.exitDecision(41);}

			switch (alt41) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:174:20: one= fieldcreate ( ',' two= fieldcreate )*
					{
					dbg.location(174,23);
					pushFollow(FOLLOW_fieldcreate_in_reccreate1662);
					one=fieldcreate();
					state._fsp--;

					stream_fieldcreate.add(one.getTree());dbg.location(174,36);
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:174:36: ( ',' two= fieldcreate )*
					try { dbg.enterSubRule(40);

					loop40:
					while (true) {
						int alt40=2;
						try { dbg.enterDecision(40, decisionCanBacktrack[40]);

						int LA40_0 = input.LA(1);
						if ( (LA40_0==57) ) {
							alt40=1;
						}

						} finally {dbg.exitDecision(40);}

						switch (alt40) {
						case 1 :
							dbg.enterAlt(1);

							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:174:37: ',' two= fieldcreate
							{
							dbg.location(174,37);
							char_literal153=(Token)match(input,57,FOLLOW_57_in_reccreate1665);  
							stream_57.add(char_literal153);
							dbg.location(174,43);
							pushFollow(FOLLOW_fieldcreate_in_reccreate1668);
							two=fieldcreate();
							state._fsp--;

							stream_fieldcreate.add(two.getTree());
							}
							break;

						default :
							break loop40;
						}
					}
					} finally {dbg.exitSubRule(40);}

					}
					break;

			}
			} finally {dbg.exitSubRule(41);}
			dbg.location(174,60);
			char_literal154=(Token)match(input,85,FOLLOW_85_in_reccreate1674);  
			stream_85.add(char_literal154);

			// AST REWRITE
			// elements: two, one
			// token labels: 
			// rule labels: one, two, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_one=new RewriteRuleSubtreeStream(adaptor,"rule one",one!=null?one.getTree():null);
			RewriteRuleSubtreeStream stream_two=new RewriteRuleSubtreeStream(adaptor,"rule two",two!=null?two.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 174:64: -> ( $one)? ( $two)*
			{
				dbg.location(174,67);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:174:67: ( $one)?
				if ( stream_one.hasNext() ) {
					dbg.location(174,67);
					adaptor.addChild(root_0, stream_one.nextTree());
				}
				stream_one.reset();
				dbg.location(174,73);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:174:73: ( $two)*
				while ( stream_two.hasNext() ) {
					dbg.location(174,73);
					adaptor.addChild(root_0, stream_two.nextTree());
				}
				stream_two.reset();

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
			// do for sure before leaving
		}
		dbg.location(175, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "reccreate");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "reccreate"


	public static class fieldcreate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fieldcreate"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:177:1: fieldcreate : ID '=' exp -> ^( AFFECTATT ID exp ) ;
	public final ExprParser.fieldcreate_return fieldcreate() throws RecognitionException {
		ExprParser.fieldcreate_return retval = new ExprParser.fieldcreate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID155=null;
		Token char_literal156=null;
		ParserRuleReturnScope exp157 =null;

		Object ID155_tree=null;
		Object char_literal156_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try { dbg.enterRule(getGrammarFileName(), "fieldcreate");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(177, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:177:15: ( ID '=' exp -> ^( AFFECTATT ID exp ) )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:177:17: ID '=' exp
			{
			dbg.location(177,17);
			ID155=(Token)match(input,ID,FOLLOW_ID_in_fieldcreate1699);  
			stream_ID.add(ID155);
			dbg.location(177,20);
			char_literal156=(Token)match(input,63,FOLLOW_63_in_fieldcreate1701);  
			stream_63.add(char_literal156);
			dbg.location(177,24);
			pushFollow(FOLLOW_exp_in_fieldcreate1703);
			exp157=exp();
			state._fsp--;

			stream_exp.add(exp157.getTree());
			// AST REWRITE
			// elements: exp, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 177:28: -> ^( AFFECTATT ID exp )
			{
				dbg.location(177,31);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:177:31: ^( AFFECTATT ID exp )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(177,33);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECTATT, "AFFECTATT"), root_1);
				dbg.location(177,44);
				adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(177,47);
				adaptor.addChild(root_1, stream_exp.nextTree());
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
			// do for sure before leaving
		}
		dbg.location(178, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fieldcreate");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "fieldcreate"


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:180:1: assignment : base ':=' exp ;
	public final ExprParser.assignment_return assignment() throws RecognitionException {
		ExprParser.assignment_return retval = new ExprParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal159=null;
		ParserRuleReturnScope base158 =null;
		ParserRuleReturnScope exp160 =null;

		Object string_literal159_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "assignment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(180, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:180:14: ( base ':=' exp )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:180:16: base ':=' exp
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(180,16);
			pushFollow(FOLLOW_base_in_assignment1728);
			base158=base();
			state._fsp--;

			adaptor.addChild(root_0, base158.getTree());
			dbg.location(180,21);
			string_literal159=(Token)match(input,61,FOLLOW_61_in_assignment1730); 
			string_literal159_tree = (Object)adaptor.create(string_literal159);
			adaptor.addChild(root_0, string_literal159_tree);
			dbg.location(180,26);
			pushFollow(FOLLOW_exp_in_assignment1732);
			exp160=exp();
			state._fsp--;

			adaptor.addChild(root_0, exp160.getTree());

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
			// do for sure before leaving
		}
		dbg.location(181, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assignment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "assignment"


	public static class ifthenelse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifthenelse"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:183:1: ifthenelse : 'if' cond= exp 'then' alors= exp ( options {greedy=true; } : 'else' sinon= exp )? -> ^( IF ^( COND $cond) ^( THEN $alors) ( ^( ELSE $sinon) )? ) ;
	public final ExprParser.ifthenelse_return ifthenelse() throws RecognitionException {
		ExprParser.ifthenelse_return retval = new ExprParser.ifthenelse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal161=null;
		Token string_literal162=null;
		Token string_literal163=null;
		ParserRuleReturnScope cond =null;
		ParserRuleReturnScope alors =null;
		ParserRuleReturnScope sinon =null;

		Object string_literal161_tree=null;
		Object string_literal162_tree=null;
		Object string_literal163_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try { dbg.enterRule(getGrammarFileName(), "ifthenelse");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(183, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:183:14: ( 'if' cond= exp 'then' alors= exp ( options {greedy=true; } : 'else' sinon= exp )? -> ^( IF ^( COND $cond) ^( THEN $alors) ( ^( ELSE $sinon) )? ) )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:183:16: 'if' cond= exp 'then' alors= exp ( options {greedy=true; } : 'else' sinon= exp )?
			{
			dbg.location(183,16);
			string_literal161=(Token)match(input,73,FOLLOW_73_in_ifthenelse1746);  
			stream_73.add(string_literal161);
			dbg.location(183,25);
			pushFollow(FOLLOW_exp_in_ifthenelse1750);
			cond=exp();
			state._fsp--;

			stream_exp.add(cond.getTree());dbg.location(183,30);
			string_literal162=(Token)match(input,78,FOLLOW_78_in_ifthenelse1752);  
			stream_78.add(string_literal162);
			dbg.location(183,43);
			pushFollow(FOLLOW_exp_in_ifthenelse1757);
			alors=exp();
			state._fsp--;

			stream_exp.add(alors.getTree());dbg.location(183,48);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:183:48: ( options {greedy=true; } : 'else' sinon= exp )?
			int alt42=2;
			try { dbg.enterSubRule(42);
			try { dbg.enterDecision(42, decisionCanBacktrack[42]);

			int LA42_0 = input.LA(1);
			if ( (LA42_0==69) ) {
				alt42=1;
			}
			} finally {dbg.exitDecision(42);}

			switch (alt42) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:183:75: 'else' sinon= exp
					{
					dbg.location(183,75);
					string_literal163=(Token)match(input,69,FOLLOW_69_in_ifthenelse1770);  
					stream_69.add(string_literal163);
					dbg.location(183,87);
					pushFollow(FOLLOW_exp_in_ifthenelse1774);
					sinon=exp();
					state._fsp--;

					stream_exp.add(sinon.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(42);}

			// AST REWRITE
			// elements: sinon, cond, alors
			// token labels: 
			// rule labels: sinon, cond, alors, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_sinon=new RewriteRuleSubtreeStream(adaptor,"rule sinon",sinon!=null?sinon.getTree():null);
			RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond",cond!=null?cond.getTree():null);
			RewriteRuleSubtreeStream stream_alors=new RewriteRuleSubtreeStream(adaptor,"rule alors",alors!=null?alors.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 183:94: -> ^( IF ^( COND $cond) ^( THEN $alors) ( ^( ELSE $sinon) )? )
			{
				dbg.location(183,96);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:183:96: ^( IF ^( COND $cond) ^( THEN $alors) ( ^( ELSE $sinon) )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(183,98);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				dbg.location(183,101);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:183:101: ^( COND $cond)
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(183,103);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
				dbg.location(183,109);
				adaptor.addChild(root_2, stream_cond.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(183,115);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:183:115: ^( THEN $alors)
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(183,117);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);
				dbg.location(183,123);
				adaptor.addChild(root_2, stream_alors.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(183,130);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:183:130: ( ^( ELSE $sinon) )?
				if ( stream_sinon.hasNext() ) {
					dbg.location(183,131);
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:183:131: ^( ELSE $sinon)
					{
					Object root_2 = (Object)adaptor.nil();
					dbg.location(183,133);
					root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);
					dbg.location(183,139);
					adaptor.addChild(root_2, stream_sinon.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_sinon.reset();

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
			// do for sure before leaving
		}
		dbg.location(184, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifthenelse");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "ifthenelse"


	public static class ifelse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifelse"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:186:1: ifelse : ( options {greedy=true; } : 'else' exp )? ;
	public final ExprParser.ifelse_return ifelse() throws RecognitionException {
		ExprParser.ifelse_return retval = new ExprParser.ifelse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal164=null;
		ParserRuleReturnScope exp165 =null;

		Object string_literal164_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "ifelse");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(186, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:186:9: ( ( options {greedy=true; } : 'else' exp )? )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:186:11: ( options {greedy=true; } : 'else' exp )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(186,11);
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:186:11: ( options {greedy=true; } : 'else' exp )?
			int alt43=2;
			try { dbg.enterSubRule(43);
			try { dbg.enterDecision(43, decisionCanBacktrack[43]);

			int LA43_0 = input.LA(1);
			if ( (LA43_0==69) ) {
				alt43=1;
			}
			} finally {dbg.exitDecision(43);}

			switch (alt43) {
				case 1 :
					dbg.enterAlt(1);

					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:186:38: 'else' exp
					{
					dbg.location(186,38);
					string_literal164=(Token)match(input,69,FOLLOW_69_in_ifelse1833); 
					string_literal164_tree = (Object)adaptor.create(string_literal164);
					adaptor.addChild(root_0, string_literal164_tree);
					dbg.location(186,45);
					pushFollow(FOLLOW_exp_in_ifelse1835);
					exp165=exp();
					state._fsp--;

					adaptor.addChild(root_0, exp165.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(43);}

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
			// do for sure before leaving
		}
		dbg.location(187, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifelse");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "ifelse"


	public static class whileexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileexp"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:192:1: whileexp : 'while' exp 'do' exp -> ^( WHILE ^( COND exp ) ^( BLOCK exp ) ) ;
	public final ExprParser.whileexp_return whileexp() throws RecognitionException {
		ExprParser.whileexp_return retval = new ExprParser.whileexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal166=null;
		Token string_literal168=null;
		ParserRuleReturnScope exp167 =null;
		ParserRuleReturnScope exp169 =null;

		Object string_literal166_tree=null;
		Object string_literal168_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try { dbg.enterRule(getGrammarFileName(), "whileexp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(192, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:192:12: ( 'while' exp 'do' exp -> ^( WHILE ^( COND exp ) ^( BLOCK exp ) ) )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:192:14: 'while' exp 'do' exp
			{
			dbg.location(192,14);
			string_literal166=(Token)match(input,82,FOLLOW_82_in_whileexp1856);  
			stream_82.add(string_literal166);
			dbg.location(192,22);
			pushFollow(FOLLOW_exp_in_whileexp1858);
			exp167=exp();
			state._fsp--;

			stream_exp.add(exp167.getTree());dbg.location(192,26);
			string_literal168=(Token)match(input,68,FOLLOW_68_in_whileexp1860);  
			stream_68.add(string_literal168);
			dbg.location(192,31);
			pushFollow(FOLLOW_exp_in_whileexp1862);
			exp169=exp();
			state._fsp--;

			stream_exp.add(exp169.getTree());
			// AST REWRITE
			// elements: exp, exp
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 192:35: -> ^( WHILE ^( COND exp ) ^( BLOCK exp ) )
			{
				dbg.location(192,38);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:192:38: ^( WHILE ^( COND exp ) ^( BLOCK exp ) )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(192,40);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				dbg.location(192,46);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:192:46: ^( COND exp )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(192,48);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
				dbg.location(192,53);
				adaptor.addChild(root_2, stream_exp.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(192,58);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:192:58: ^( BLOCK exp )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(192,60);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
				dbg.location(192,66);
				adaptor.addChild(root_2, stream_exp.nextTree());
				adaptor.addChild(root_1, root_2);
				}

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
			// do for sure before leaving
		}
		dbg.location(193, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "whileexp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "whileexp"


	public static class forexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forexp"
	// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:195:1: forexp : 'for' ID ':=' ini= exp 'to' f= exp 'do' instru= exp -> ^( FOR ^( ITERATION ID $ini $f) ^( DO $instru) ) ;
	public final ExprParser.forexp_return forexp() throws RecognitionException {
		ExprParser.forexp_return retval = new ExprParser.forexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal170=null;
		Token ID171=null;
		Token string_literal172=null;
		Token string_literal173=null;
		Token string_literal174=null;
		ParserRuleReturnScope ini =null;
		ParserRuleReturnScope f =null;
		ParserRuleReturnScope instru =null;

		Object string_literal170_tree=null;
		Object ID171_tree=null;
		Object string_literal172_tree=null;
		Object string_literal173_tree=null;
		Object string_literal174_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try { dbg.enterRule(getGrammarFileName(), "forexp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(195, 0);

		try {
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:195:10: ( 'for' ID ':=' ini= exp 'to' f= exp 'do' instru= exp -> ^( FOR ^( ITERATION ID $ini $f) ^( DO $instru) ) )
			dbg.enterAlt(1);

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:195:12: 'for' ID ':=' ini= exp 'to' f= exp 'do' instru= exp
			{
			dbg.location(195,12);
			string_literal170=(Token)match(input,71,FOLLOW_71_in_forexp1894);  
			stream_71.add(string_literal170);
			dbg.location(195,18);
			ID171=(Token)match(input,ID,FOLLOW_ID_in_forexp1896);  
			stream_ID.add(ID171);
			dbg.location(195,21);
			string_literal172=(Token)match(input,61,FOLLOW_61_in_forexp1898);  
			stream_61.add(string_literal172);
			dbg.location(195,29);
			pushFollow(FOLLOW_exp_in_forexp1902);
			ini=exp();
			state._fsp--;

			stream_exp.add(ini.getTree());dbg.location(195,34);
			string_literal173=(Token)match(input,79,FOLLOW_79_in_forexp1904);  
			stream_79.add(string_literal173);
			dbg.location(195,40);
			pushFollow(FOLLOW_exp_in_forexp1908);
			f=exp();
			state._fsp--;

			stream_exp.add(f.getTree());dbg.location(195,45);
			string_literal174=(Token)match(input,68,FOLLOW_68_in_forexp1910);  
			stream_68.add(string_literal174);
			dbg.location(195,56);
			pushFollow(FOLLOW_exp_in_forexp1914);
			instru=exp();
			state._fsp--;

			stream_exp.add(instru.getTree());
			// AST REWRITE
			// elements: f, ini, instru, ID
			// token labels: 
			// rule labels: ini, f, instru, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_ini=new RewriteRuleSubtreeStream(adaptor,"rule ini",ini!=null?ini.getTree():null);
			RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f",f!=null?f.getTree():null);
			RewriteRuleSubtreeStream stream_instru=new RewriteRuleSubtreeStream(adaptor,"rule instru",instru!=null?instru.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 195:63: -> ^( FOR ^( ITERATION ID $ini $f) ^( DO $instru) )
			{
				dbg.location(195,66);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:195:66: ^( FOR ^( ITERATION ID $ini $f) ^( DO $instru) )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(195,68);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
				dbg.location(195,72);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:195:72: ^( ITERATION ID $ini $f)
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(195,74);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ITERATION, "ITERATION"), root_2);
				dbg.location(195,84);
				adaptor.addChild(root_2, stream_ID.nextNode());dbg.location(195,88);
				adaptor.addChild(root_2, stream_ini.nextTree());dbg.location(195,93);
				adaptor.addChild(root_2, stream_f.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(195,96);
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:195:96: ^( DO $instru)
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(195,98);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_2);
				dbg.location(195,102);
				adaptor.addChild(root_2, stream_instru.nextTree());
				adaptor.addChild(root_1, root_2);
				}

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
			// do for sure before leaving
		}
		dbg.location(196, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "forexp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "forexp"

	// Delegated rules



	public static final BitSet FOLLOW_exp_in_program144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tydec_in_dec166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vardec_in_dec173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fundec_in_dec180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_tydec198 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_tydec200 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_tydec202 = new BitSet(new long[]{0x0000000004000000L,0x0000000000080004L});
	public static final BitSet FOLLOW_ty_in_tydec204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ty232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrty_in_ty247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recty_in_ty262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_arrty284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_arrty286 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_arrty288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_recty307 = new BitSet(new long[]{0x0000000004000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_fielddec_in_recty310 = new BitSet(new long[]{0x0200000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_57_in_recty313 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_fielddec_in_recty314 = new BitSet(new long[]{0x0200000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_recty321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fielddec358 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_fielddec360 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_fielddec362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_fundec385 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_fundec387 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_fundec389 = new BitSet(new long[]{0x0080000004000000L});
	public static final BitSet FOLLOW_fielddec_in_fundec392 = new BitSet(new long[]{0x0280000000000000L});
	public static final BitSet FOLLOW_57_in_fundec394 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_fielddec_in_fundec395 = new BitSet(new long[]{0x0280000000000000L});
	public static final BitSet FOLLOW_55_in_fundec401 = new BitSet(new long[]{0x9000000000000000L});
	public static final BitSet FOLLOW_60_in_fundec404 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_fundec406 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_fundec410 = new BitSet(new long[]{0x0440040084000000L,0x0000000000041A88L});
	public static final BitSet FOLLOW_exp_in_fundec412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_vardec455 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_vardec457 = new BitSet(new long[]{0x3000000000000000L});
	public static final BitSet FOLLOW_vardec1_in_vardec459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_vardec1482 = new BitSet(new long[]{0x0440040084000000L,0x0000000000041A88L});
	public static final BitSet FOLLOW_decexp_in_vardec1484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_vardec1495 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_vardec1497 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_vardec1499 = new BitSet(new long[]{0x0440040084000000L,0x0000000000041A88L});
	public static final BitSet FOLLOW_decexp_in_vardec1501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decinfixassign_in_decexp541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifthenelse_in_decexp549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileexp_in_decexp560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forexp_in_decexp567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decinfixor_in_decinfixassign590 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_61_in_decinfixassign593 = new BitSet(new long[]{0x0440040084000000L,0x0000000000001808L});
	public static final BitSet FOLLOW_decinfixor_in_decinfixassign596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decinfixand_in_decinfixor613 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_decinfixor616 = new BitSet(new long[]{0x0440040084000000L,0x0000000000001808L});
	public static final BitSet FOLLOW_decinfixand_in_decinfixor619 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_deccomp_in_decinfixand631 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_53_in_decinfixand634 = new BitSet(new long[]{0x0440040084000000L,0x0000000000001808L});
	public static final BitSet FOLLOW_deccomp_in_decinfixand637 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_decadd_in_deccomp649 = new BitSet(new long[]{0x8000000020000002L});
	public static final BitSet FOLLOW_INFIXCOMP_in_deccomp653 = new BitSet(new long[]{0x0440040084000000L,0x0000000000001808L});
	public static final BitSet FOLLOW_63_in_deccomp658 = new BitSet(new long[]{0x0440040084000000L,0x0000000000001808L});
	public static final BitSet FOLLOW_decadd_in_deccomp664 = new BitSet(new long[]{0x8000000020000002L});
	public static final BitSet FOLLOW_decmult_in_decadd677 = new BitSet(new long[]{0x0500000000000002L});
	public static final BitSet FOLLOW_set_in_decadd679 = new BitSet(new long[]{0x0440040084000000L,0x0000000000001808L});
	public static final BitSet FOLLOW_decmult_in_decadd685 = new BitSet(new long[]{0x0500000000000002L});
	public static final BitSet FOLLOW_decbase_in_decmult698 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_INFIXMULTDIV_in_decmult700 = new BitSet(new long[]{0x0440040084000000L,0x0000000000001808L});
	public static final BitSet FOLLOW_decbase_in_decmult704 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_INTLIT_in_decbase717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_decbase737 = new BitSet(new long[]{0x0440040084000000L,0x0000000000001808L});
	public static final BitSet FOLLOW_decbase_in_decbase740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_decbase762 = new BitSet(new long[]{0x0840000000000002L,0x0000000000080001L});
	public static final BitSet FOLLOW_59_in_decbase766 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_decbase770 = new BitSet(new long[]{0x0800000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_exp2_in_decbase773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callcrochet_in_decbase793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callexp_in_decbase806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reccreate_in_decbase821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_seqexp_in_decbase858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_decbase870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGLIT_in_decbase891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_letexp_in_decbase912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_decbase924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lvalue942 = new BitSet(new long[]{0x0800000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_exp2_in_lvalue944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_seqexp974 = new BitSet(new long[]{0x44C0040084000000L,0x0000000000041A88L});
	public static final BitSet FOLLOW_exp_in_seqexp976 = new BitSet(new long[]{0x4080000000000000L});
	public static final BitSet FOLLOW_62_in_seqexp979 = new BitSet(new long[]{0x44C0040084000000L,0x0000000000041A88L});
	public static final BitSet FOLLOW_exp_in_seqexp981 = new BitSet(new long[]{0x4080000000000000L});
	public static final BitSet FOLLOW_55_in_seqexp984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_callexp1007 = new BitSet(new long[]{0x06C0040084000000L,0x0000000000041A88L});
	public static final BitSet FOLLOW_exp_in_callexp1009 = new BitSet(new long[]{0x0280000000000000L});
	public static final BitSet FOLLOW_57_in_callexp1012 = new BitSet(new long[]{0x06C0040084000000L,0x0000000000041A88L});
	public static final BitSet FOLLOW_exp_in_callexp1014 = new BitSet(new long[]{0x0280000000000000L});
	public static final BitSet FOLLOW_55_in_callexp1018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_infixassign_in_exp1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifthenelse_in_exp1056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileexp_in_exp1063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forexp_in_exp1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_exp21087 = new BitSet(new long[]{0x0440040084000000L,0x0000000000001808L});
	public static final BitSet FOLLOW_base_in_exp21089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_exp21104 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_exp21106 = new BitSet(new long[]{0x0800000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_exp2_in_exp21109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_callcrochet1139 = new BitSet(new long[]{0x0440040084000000L,0x0000000000041A8AL});
	public static final BitSet FOLLOW_exp_in_callcrochet1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_callcrochet1143 = new BitSet(new long[]{0x0800000000000002L,0x0000000000002001L});
	public static final BitSet FOLLOW_exp2_in_callcrochet1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_infixor_in_infixassign1176 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_61_in_infixassign1179 = new BitSet(new long[]{0x0440040084000000L,0x0000000000001808L});
	public static final BitSet FOLLOW_infixor_in_infixassign1182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_infixand_in_infixor1199 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_infixor1202 = new BitSet(new long[]{0x0440040084000000L,0x0000000000001808L});
	public static final BitSet FOLLOW_infixand_in_infixor1205 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_comp_in_infixand1217 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_53_in_infixand1220 = new BitSet(new long[]{0x0440040084000000L,0x0000000000001808L});
	public static final BitSet FOLLOW_comp_in_infixand1223 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_add_in_comp1235 = new BitSet(new long[]{0x8000000020000002L});
	public static final BitSet FOLLOW_INFIXCOMP_in_comp1239 = new BitSet(new long[]{0x0440040084000000L,0x0000000000001808L});
	public static final BitSet FOLLOW_63_in_comp1244 = new BitSet(new long[]{0x0440040084000000L,0x0000000000001808L});
	public static final BitSet FOLLOW_add_in_comp1250 = new BitSet(new long[]{0x8000000020000002L});
	public static final BitSet FOLLOW_mult_in_add1263 = new BitSet(new long[]{0x0500000000000002L});
	public static final BitSet FOLLOW_set_in_add1265 = new BitSet(new long[]{0x0440040084000000L,0x0000000000001808L});
	public static final BitSet FOLLOW_mult_in_add1271 = new BitSet(new long[]{0x0500000000000002L});
	public static final BitSet FOLLOW_base_in_mult1284 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_INFIXMULTDIV_in_mult1286 = new BitSet(new long[]{0x0440040084000000L,0x0000000000001808L});
	public static final BitSet FOLLOW_base_in_mult1290 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_INTLIT_in_base1303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_base1314 = new BitSet(new long[]{0x0440040084000000L,0x0000000000001808L});
	public static final BitSet FOLLOW_base_in_base1317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_base1338 = new BitSet(new long[]{0x0840000000000002L,0x0000000000080001L});
	public static final BitSet FOLLOW_59_in_base1342 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_base1346 = new BitSet(new long[]{0x0800000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_exp2_in_base1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callcrochet_in_base1379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callexp_in_base1401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reccreate_in_base1426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_seqexp_in_base1485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_base1497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGLIT_in_base1509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_letexp_in_base1521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_base1533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_letexp1559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030540L});
	public static final BitSet FOLLOW_dec_in_letexp1561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030540L});
	public static final BitSet FOLLOW_74_in_letexp1565 = new BitSet(new long[]{0x4440040084000000L,0x0000000000041AC8L});
	public static final BitSet FOLLOW_exp_in_letexp1567 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_62_in_letexp1570 = new BitSet(new long[]{0x4440040084000000L,0x0000000000041AC8L});
	public static final BitSet FOLLOW_exp_in_letexp1572 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_letexp1578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_negation1619 = new BitSet(new long[]{0x0440040084000000L,0x0000000000041A88L});
	public static final BitSet FOLLOW_exp_in_negation1621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_arrcreate1635 = new BitSet(new long[]{0x0440040084000000L,0x0000000000041A8AL});
	public static final BitSet FOLLOW_exp_in_arrcreate1637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_arrcreate1639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_arrcreate1641 = new BitSet(new long[]{0x0440040084000000L,0x0000000000041A88L});
	public static final BitSet FOLLOW_exp_in_arrcreate1643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_reccreate1657 = new BitSet(new long[]{0x0000000004000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_fieldcreate_in_reccreate1662 = new BitSet(new long[]{0x0200000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_57_in_reccreate1665 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_fieldcreate_in_reccreate1668 = new BitSet(new long[]{0x0200000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_reccreate1674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fieldcreate1699 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_fieldcreate1701 = new BitSet(new long[]{0x0440040084000000L,0x0000000000041A88L});
	public static final BitSet FOLLOW_exp_in_fieldcreate1703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_in_assignment1728 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_assignment1730 = new BitSet(new long[]{0x0440040084000000L,0x0000000000041A88L});
	public static final BitSet FOLLOW_exp_in_assignment1732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_ifthenelse1746 = new BitSet(new long[]{0x0440040084000000L,0x0000000000045A88L});
	public static final BitSet FOLLOW_exp_in_ifthenelse1750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_ifthenelse1752 = new BitSet(new long[]{0x0440040084000000L,0x0000000000041AA8L});
	public static final BitSet FOLLOW_exp_in_ifthenelse1757 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_ifthenelse1770 = new BitSet(new long[]{0x0440040084000000L,0x0000000000041A88L});
	public static final BitSet FOLLOW_exp_in_ifthenelse1774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_ifelse1833 = new BitSet(new long[]{0x0440040084000000L,0x0000000000041A88L});
	public static final BitSet FOLLOW_exp_in_ifelse1835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_whileexp1856 = new BitSet(new long[]{0x0440040084000000L,0x0000000000041A98L});
	public static final BitSet FOLLOW_exp_in_whileexp1858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_whileexp1860 = new BitSet(new long[]{0x0440040084000000L,0x0000000000041A88L});
	public static final BitSet FOLLOW_exp_in_whileexp1862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_forexp1894 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_forexp1896 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_forexp1898 = new BitSet(new long[]{0x0440040084000000L,0x0000000000049A88L});
	public static final BitSet FOLLOW_exp_in_forexp1902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_forexp1904 = new BitSet(new long[]{0x0440040084000000L,0x0000000000041A98L});
	public static final BitSet FOLLOW_exp_in_forexp1908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_forexp1910 = new BitSet(new long[]{0x0440040084000000L,0x0000000000041A88L});
	public static final BitSet FOLLOW_exp_in_forexp1914 = new BitSet(new long[]{0x0000000000000002L});
}
