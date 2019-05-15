// $ANTLR null /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g 2018-11-21 16:16:01

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "EXPR", "ID", "INT", "NEWLINE", 
		"PROG", "STAT", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "'='"
	};
	public static final int EOF=-1;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int EXPR=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int NEWLINE=7;
	public static final int PROG=8;
	public static final int STAT=9;
	public static final int WS=10;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "prog", "atom", "expr", "stat", "multExpr"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false
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
	@Override public String getGrammarFileName() { return "/home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:11:1: prog : ( stat )+ -> ^( PROG ( stat )+ ) ;
	public final ExprParser.prog_return prog() throws RecognitionException {
		ExprParser.prog_return retval = new ExprParser.prog_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stat1 =null;

		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(11, 0);

		try {
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:11:5: ( ( stat )+ -> ^( PROG ( stat )+ ) )
			dbg.enterAlt(1);

			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:11:7: ( stat )+
			{
			dbg.location(11,7);
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:11:7: ( stat )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ID && LA1_0 <= NEWLINE)||LA1_0==11) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:11:7: stat
					{
					dbg.location(11,7);
					pushFollow(FOLLOW_stat_in_prog33);
					stat1=stat();
					state._fsp--;

					stream_stat.add(stat1.getTree());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
			} finally {dbg.exitSubRule(1);}

			// AST REWRITE
			// elements: stat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 11:13: -> ^( PROG ( stat )+ )
			{
				dbg.location(11,16);
				// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:11:16: ^( PROG ( stat )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(11,18);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROG, "PROG"), root_1);
				dbg.location(11,23);
				if ( !(stream_stat.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_stat.hasNext() ) {
					dbg.location(11,23);
					adaptor.addChild(root_1, stream_stat.nextTree());
				}
				stream_stat.reset();

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
		dbg.location(12, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "prog"


	public static class stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:14:1: stat : ( expr NEWLINE -> expr | ID '=' expr NEWLINE -> ^( '=' ID expr ) | NEWLINE );
	public final ExprParser.stat_return stat() throws RecognitionException {
		ExprParser.stat_return retval = new ExprParser.stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NEWLINE3=null;
		Token ID4=null;
		Token char_literal5=null;
		Token NEWLINE7=null;
		Token NEWLINE8=null;
		ParserRuleReturnScope expr2 =null;
		ParserRuleReturnScope expr6 =null;

		Object NEWLINE3_tree=null;
		Object ID4_tree=null;
		Object char_literal5_tree=null;
		Object NEWLINE7_tree=null;
		Object NEWLINE8_tree=null;
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(14, 0);

		try {
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:14:5: ( expr NEWLINE -> expr | ID '=' expr NEWLINE -> ^( '=' ID expr ) | NEWLINE )
			int alt2=3;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case INT:
			case 11:
				{
				alt2=1;
				}
				break;
			case ID:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==17) ) {
					alt2=2;
				}
				else if ( (LA2_2==NEWLINE||(LA2_2 >= 13 && LA2_2 <= 16)) ) {
					alt2=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NEWLINE:
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

					// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:14:9: expr NEWLINE
					{
					dbg.location(14,9);
					pushFollow(FOLLOW_expr_in_stat71);
					expr2=expr();
					state._fsp--;

					stream_expr.add(expr2.getTree());dbg.location(14,14);
					NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat73);  
					stream_NEWLINE.add(NEWLINE3);

					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 14:22: -> expr
					{
						dbg.location(14,25);
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:15:9: ID '=' expr NEWLINE
					{
					dbg.location(15,9);
					ID4=(Token)match(input,ID,FOLLOW_ID_in_stat87);  
					stream_ID.add(ID4);
					dbg.location(15,12);
					char_literal5=(Token)match(input,17,FOLLOW_17_in_stat89);  
					stream_17.add(char_literal5);
					dbg.location(15,16);
					pushFollow(FOLLOW_expr_in_stat91);
					expr6=expr();
					state._fsp--;

					stream_expr.add(expr6.getTree());dbg.location(15,21);
					NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat93);  
					stream_NEWLINE.add(NEWLINE7);

					// AST REWRITE
					// elements: expr, 17, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 15:29: -> ^( '=' ID expr )
					{
						dbg.location(15,32);
						// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:15:32: ^( '=' ID expr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(15,34);
						root_1 = (Object)adaptor.becomeRoot(stream_17.nextNode(), root_1);
						dbg.location(15,38);
						adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(15,41);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:16:9: NEWLINE
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(16,9);
					NEWLINE8=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat113); 
					NEWLINE8_tree = (Object)adaptor.create(NEWLINE8);
					adaptor.addChild(root_0, NEWLINE8_tree);

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
		dbg.location(17, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "stat"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:19:1: expr : multExpr ( '+' ^ multExpr | '-' ^ multExpr )* ;
	public final ExprParser.expr_return expr() throws RecognitionException {
		ExprParser.expr_return retval = new ExprParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal10=null;
		Token char_literal12=null;
		ParserRuleReturnScope multExpr9 =null;
		ParserRuleReturnScope multExpr11 =null;
		ParserRuleReturnScope multExpr13 =null;

		Object char_literal10_tree=null;
		Object char_literal12_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(19, 0);

		try {
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:19:5: ( multExpr ( '+' ^ multExpr | '-' ^ multExpr )* )
			dbg.enterAlt(1);

			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:19:9: multExpr ( '+' ^ multExpr | '-' ^ multExpr )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(19,9);
			pushFollow(FOLLOW_multExpr_in_expr127);
			multExpr9=multExpr();
			state._fsp--;

			adaptor.addChild(root_0, multExpr9.getTree());
			dbg.location(20,9);
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:20:9: ( '+' ^ multExpr | '-' ^ multExpr )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=3;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==14) ) {
					alt3=1;
				}
				else if ( (LA3_0==15) ) {
					alt3=2;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:20:13: '+' ^ multExpr
					{
					dbg.location(20,17);
					char_literal10=(Token)match(input,14,FOLLOW_14_in_expr141); 
					char_literal10_tree = (Object)adaptor.create(char_literal10);
					root_0 = (Object)adaptor.becomeRoot(char_literal10_tree, root_0);
					dbg.location(20,19);
					pushFollow(FOLLOW_multExpr_in_expr145);
					multExpr11=multExpr();
					state._fsp--;

					adaptor.addChild(root_0, multExpr11.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:21:13: '-' ^ multExpr
					{
					dbg.location(21,17);
					char_literal12=(Token)match(input,15,FOLLOW_15_in_expr159); 
					char_literal12_tree = (Object)adaptor.create(char_literal12);
					root_0 = (Object)adaptor.becomeRoot(char_literal12_tree, root_0);
					dbg.location(21,19);
					pushFollow(FOLLOW_multExpr_in_expr163);
					multExpr13=multExpr();
					state._fsp--;

					adaptor.addChild(root_0, multExpr13.getTree());

					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}

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
		dbg.location(23, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expr"


	public static class multExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multExpr"
	// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:25:1: multExpr : atom ( '*' ^ atom | '/' ^ atom )* ;
	public final ExprParser.multExpr_return multExpr() throws RecognitionException {
		ExprParser.multExpr_return retval = new ExprParser.multExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal15=null;
		Token char_literal17=null;
		ParserRuleReturnScope atom14 =null;
		ParserRuleReturnScope atom16 =null;
		ParserRuleReturnScope atom18 =null;

		Object char_literal15_tree=null;
		Object char_literal17_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "multExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(25, 0);

		try {
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:25:10: ( atom ( '*' ^ atom | '/' ^ atom )* )
			dbg.enterAlt(1);

			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:25:14: atom ( '*' ^ atom | '/' ^ atom )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(25,14);
			pushFollow(FOLLOW_atom_in_multExpr189);
			atom14=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom14.getTree());
			dbg.location(26,5);
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:26:5: ( '*' ^ atom | '/' ^ atom )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=3;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==13) ) {
					alt4=1;
				}
				else if ( (LA4_0==16) ) {
					alt4=2;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:26:7: '*' ^ atom
					{
					dbg.location(26,11);
					char_literal15=(Token)match(input,13,FOLLOW_13_in_multExpr197); 
					char_literal15_tree = (Object)adaptor.create(char_literal15);
					root_0 = (Object)adaptor.becomeRoot(char_literal15_tree, root_0);
					dbg.location(26,13);
					pushFollow(FOLLOW_atom_in_multExpr201);
					atom16=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom16.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:27:8: '/' ^ atom
					{
					dbg.location(27,12);
					char_literal17=(Token)match(input,16,FOLLOW_16_in_multExpr210); 
					char_literal17_tree = (Object)adaptor.create(char_literal17);
					root_0 = (Object)adaptor.becomeRoot(char_literal17_tree, root_0);
					dbg.location(27,14);
					pushFollow(FOLLOW_atom_in_multExpr214);
					atom18=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom18.getTree());

					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}

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
		dbg.location(29, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "multExpr"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:31:1: atom : ( INT | ID | '(' expr ')' -> expr );
	public final ExprParser.atom_return atom() throws RecognitionException {
		ExprParser.atom_return retval = new ExprParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT19=null;
		Token ID20=null;
		Token char_literal21=null;
		Token char_literal23=null;
		ParserRuleReturnScope expr22 =null;

		Object INT19_tree=null;
		Object ID20_tree=null;
		Object char_literal21_tree=null;
		Object char_literal23_tree=null;
		RewriteRuleTokenStream stream_11=new RewriteRuleTokenStream(adaptor,"token 11");
		RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:31:5: ( INT | ID | '(' expr ')' -> expr )
			int alt5=3;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			switch ( input.LA(1) ) {
			case INT:
				{
				alt5=1;
				}
				break;
			case ID:
				{
				alt5=2;
				}
				break;
			case 11:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:31:9: INT
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(31,9);
					INT19=(Token)match(input,INT,FOLLOW_INT_in_atom236); 
					INT19_tree = (Object)adaptor.create(INT19);
					adaptor.addChild(root_0, INT19_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:32:9: ID
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(32,9);
					ID20=(Token)match(input,ID,FOLLOW_ID_in_atom246); 
					ID20_tree = (Object)adaptor.create(ID20);
					adaptor.addChild(root_0, ID20_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:33:9: '(' expr ')'
					{
					dbg.location(33,9);
					char_literal21=(Token)match(input,11,FOLLOW_11_in_atom256);  
					stream_11.add(char_literal21);
					dbg.location(33,13);
					pushFollow(FOLLOW_expr_in_atom258);
					expr22=expr();
					state._fsp--;

					stream_expr.add(expr22.getTree());dbg.location(33,18);
					char_literal23=(Token)match(input,12,FOLLOW_12_in_atom260);  
					stream_12.add(char_literal23);

					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 33:22: -> expr
					{
						dbg.location(33,25);
						adaptor.addChild(root_0, stream_expr.nextTree());
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
		dbg.location(34, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog33 = new BitSet(new long[]{0x00000000000008E2L});
	public static final BitSet FOLLOW_expr_in_stat71 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NEWLINE_in_stat73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stat87 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_stat89 = new BitSet(new long[]{0x0000000000000860L});
	public static final BitSet FOLLOW_expr_in_stat91 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NEWLINE_in_stat93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_stat113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr127 = new BitSet(new long[]{0x000000000000C002L});
	public static final BitSet FOLLOW_14_in_expr141 = new BitSet(new long[]{0x0000000000000860L});
	public static final BitSet FOLLOW_multExpr_in_expr145 = new BitSet(new long[]{0x000000000000C002L});
	public static final BitSet FOLLOW_15_in_expr159 = new BitSet(new long[]{0x0000000000000860L});
	public static final BitSet FOLLOW_multExpr_in_expr163 = new BitSet(new long[]{0x000000000000C002L});
	public static final BitSet FOLLOW_atom_in_multExpr189 = new BitSet(new long[]{0x0000000000012002L});
	public static final BitSet FOLLOW_13_in_multExpr197 = new BitSet(new long[]{0x0000000000000860L});
	public static final BitSet FOLLOW_atom_in_multExpr201 = new BitSet(new long[]{0x0000000000012002L});
	public static final BitSet FOLLOW_16_in_multExpr210 = new BitSet(new long[]{0x0000000000000860L});
	public static final BitSet FOLLOW_atom_in_multExpr214 = new BitSet(new long[]{0x0000000000012002L});
	public static final BitSet FOLLOW_INT_in_atom236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_atom256 = new BitSet(new long[]{0x0000000000000860L});
	public static final BitSet FOLLOW_expr_in_atom258 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_atom260 = new BitSet(new long[]{0x0000000000000002L});
}
