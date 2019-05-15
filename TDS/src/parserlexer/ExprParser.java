// $ANTLR 3.5.2 .\\Expr.g 2019-04-22 20:28:13
package parserlexer;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ExprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFFECT", "AFFECTATT", "ARG", 
		"ARGDEC", "ARRAY", "ATTRIBUT", "ATTRIBUTAFFECT", "BLOCK", "CALL", "CALLCROCHET", 
		"CALLEXP", "CALLFUN", "COND", "DIV", "DO", "EGAL", "ELSE", "ELSEIF", "END", 
		"FINBLOCK", "FOR", "FUNCDEC", "ID", "IF", "IN", "INFIXCOMP", "INFIXMULTDIV", 
		"INTLIT", "ITERATION", "LET", "MLCOMMENT", "MOINS", "MOINS_UNAIRE", "MULT", 
		"OF", "PARAM", "PLUS", "RETURN", "ROOT", "STRINGLIT", "THEN", "TYPEARRAYDEC", 
		"TYPEDEC", "TYPERENAME", "VARARRAYDEC", "VARDEC", "VARRECORD", "VARSIMPLE", 
		"WHILE", "WHITESPACE", "'&'", "'('", "')'", "'+'", "','", "'-'", "'.'", 
		"':'", "':='", "';'", "'='", "'['", "']'", "'array'", "'break'", "'do'", 
		"'else'", "'end'", "'for'", "'function'", "'if'", "'in'", "'let'", "'nil'", 
		"'of'", "'then'", "'to'", "'type'", "'var'", "'while'", "'{'", "'|'", 
		"'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__86=86;
	public static final int AFFECT=4;
	public static final int AFFECTATT=5;
	public static final int ARG=6;
	public static final int ARGDEC=7;
	public static final int ARRAY=8;
	public static final int ATTRIBUT=9;
	public static final int ATTRIBUTAFFECT=10;
	public static final int BLOCK=11;
	public static final int CALL=12;
	public static final int CALLCROCHET=13;
	public static final int CALLEXP=14;
	public static final int CALLFUN=15;
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
	public static final int MLCOMMENT=34;
	public static final int MOINS=35;
	public static final int MOINS_UNAIRE=36;
	public static final int MULT=37;
	public static final int OF=38;
	public static final int PARAM=39;
	public static final int PLUS=40;
	public static final int RETURN=41;
	public static final int ROOT=42;
	public static final int STRINGLIT=43;
	public static final int THEN=44;
	public static final int TYPEARRAYDEC=45;
	public static final int TYPEDEC=46;
	public static final int TYPERENAME=47;
	public static final int VARARRAYDEC=48;
	public static final int VARDEC=49;
	public static final int VARRECORD=50;
	public static final int VARSIMPLE=51;
	public static final int WHILE=52;
	public static final int WHITESPACE=53;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ExprParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return ".\\Expr.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// .\\Expr.g:14:1: program : exp -> ^( ROOT exp ) ;
	public final ExprParser.program_return program() throws RecognitionException {
		ExprParser.program_return retval = new ExprParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exp1 =null;

		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// .\\Expr.g:14:11: ( exp -> ^( ROOT exp ) )
			// .\\Expr.g:14:13: exp
			{
			pushFollow(FOLLOW_exp_in_program166);
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
				// .\\Expr.g:14:19: ^( ROOT exp )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROOT, "ROOT"), root_1);
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
		return retval;
	}
	// $ANTLR end "program"


	public static class dec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dec"
	// .\\Expr.g:18:1: dec : ( tydec | vardec | fundec );
	public final ExprParser.dec_return dec() throws RecognitionException {
		ExprParser.dec_return retval = new ExprParser.dec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope tydec2 =null;
		ParserRuleReturnScope vardec3 =null;
		ParserRuleReturnScope fundec4 =null;


		try {
			// .\\Expr.g:18:7: ( tydec | vardec | fundec )
			int alt1=3;
			switch ( input.LA(1) ) {
			case 81:
				{
				alt1=1;
				}
				break;
			case 82:
				{
				alt1=2;
				}
				break;
			case 73:
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// .\\Expr.g:18:9: tydec
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_tydec_in_dec188);
					tydec2=tydec();
					state._fsp--;

					adaptor.addChild(root_0, tydec2.getTree());

					}
					break;
				case 2 :
					// .\\Expr.g:19:6: vardec
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_vardec_in_dec195);
					vardec3=vardec();
					state._fsp--;

					adaptor.addChild(root_0, vardec3.getTree());

					}
					break;
				case 3 :
					// .\\Expr.g:20:6: fundec
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fundec_in_dec202);
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
		return retval;
	}
	// $ANTLR end "dec"


	public static class tydec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tydec"
	// .\\Expr.g:23:1: tydec : 'type' ID '=' ty -> ^( TYPEDEC ID ty ) ;
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
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_ty=new RewriteRuleSubtreeStream(adaptor,"rule ty");

		try {
			// .\\Expr.g:23:13: ( 'type' ID '=' ty -> ^( TYPEDEC ID ty ) )
			// .\\Expr.g:23:15: 'type' ID '=' ty
			{
			string_literal5=(Token)match(input,81,FOLLOW_81_in_tydec220);  
			stream_81.add(string_literal5);

			ID6=(Token)match(input,ID,FOLLOW_ID_in_tydec222);  
			stream_ID.add(ID6);

			char_literal7=(Token)match(input,64,FOLLOW_64_in_tydec224);  
			stream_64.add(char_literal7);

			pushFollow(FOLLOW_ty_in_tydec226);
			ty8=ty();
			state._fsp--;

			stream_ty.add(ty8.getTree());
			// AST REWRITE
			// elements: ID, ty
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
				// .\\Expr.g:23:34: ^( TYPEDEC ID ty )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPEDEC, "TYPEDEC"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
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
		return retval;
	}
	// $ANTLR end "tydec"


	public static class ty_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ty"
	// .\\Expr.g:26:1: ty : ( ID -> ^( TYPERENAME ID ) | arrty -> ^( TYPEARRAYDEC arrty ) | recty -> ^( ATTRIBUT recty ) );
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

		try {
			// .\\Expr.g:26:7: ( ID -> ^( TYPERENAME ID ) | arrty -> ^( TYPEARRAYDEC arrty ) | recty -> ^( ATTRIBUT recty ) )
			int alt2=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt2=1;
				}
				break;
			case 67:
				{
				alt2=2;
				}
				break;
			case 84:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// .\\Expr.g:26:9: ID
					{
					ID9=(Token)match(input,ID,FOLLOW_ID_in_ty254);  
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
						// .\\Expr.g:26:15: ^( TYPERENAME ID )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPERENAME, "TYPERENAME"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// .\\Expr.g:27:6: arrty
					{
					pushFollow(FOLLOW_arrty_in_ty269);
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
						// .\\Expr.g:27:15: ^( TYPEARRAYDEC arrty )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPEARRAYDEC, "TYPEARRAYDEC"), root_1);
						adaptor.addChild(root_1, stream_arrty.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// .\\Expr.g:28:6: recty
					{
					pushFollow(FOLLOW_recty_in_ty284);
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
						// .\\Expr.g:28:15: ^( ATTRIBUT recty )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBUT, "ATTRIBUT"), root_1);
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
		return retval;
	}
	// $ANTLR end "ty"


	public static class arrty_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrty"
	// .\\Expr.g:31:1: arrty : 'array' 'of' ID -> ID ;
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
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// .\\Expr.g:31:9: ( 'array' 'of' ID -> ID )
			// .\\Expr.g:31:11: 'array' 'of' ID
			{
			string_literal12=(Token)match(input,67,FOLLOW_67_in_arrty306);  
			stream_67.add(string_literal12);

			string_literal13=(Token)match(input,78,FOLLOW_78_in_arrty308);  
			stream_78.add(string_literal13);

			ID14=(Token)match(input,ID,FOLLOW_ID_in_arrty310);  
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
		return retval;
	}
	// $ANTLR end "arrty"


	public static class recty_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "recty"
	// .\\Expr.g:34:1: recty : '{' ( fielddec ( ',' fielddec )* )? '}' -> ( ( fielddec )+ )? ;
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
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_fielddec=new RewriteRuleSubtreeStream(adaptor,"rule fielddec");

		try {
			// .\\Expr.g:34:9: ( '{' ( fielddec ( ',' fielddec )* )? '}' -> ( ( fielddec )+ )? )
			// .\\Expr.g:34:11: '{' ( fielddec ( ',' fielddec )* )? '}'
			{
			char_literal15=(Token)match(input,84,FOLLOW_84_in_recty329);  
			stream_84.add(char_literal15);

			// .\\Expr.g:34:15: ( fielddec ( ',' fielddec )* )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==ID) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// .\\Expr.g:34:16: fielddec ( ',' fielddec )*
					{
					pushFollow(FOLLOW_fielddec_in_recty332);
					fielddec16=fielddec();
					state._fsp--;

					stream_fielddec.add(fielddec16.getTree());
					// .\\Expr.g:34:25: ( ',' fielddec )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==58) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// .\\Expr.g:34:26: ',' fielddec
							{
							char_literal17=(Token)match(input,58,FOLLOW_58_in_recty335);  
							stream_58.add(char_literal17);

							pushFollow(FOLLOW_fielddec_in_recty336);
							fielddec18=fielddec();
							state._fsp--;

							stream_fielddec.add(fielddec18.getTree());
							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;

			}

			char_literal19=(Token)match(input,86,FOLLOW_86_in_recty343);  
			stream_86.add(char_literal19);

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
				// .\\Expr.g:34:51: ( ( fielddec )+ )?
				if ( stream_fielddec.hasNext() ) {
					if ( !(stream_fielddec.hasNext()) ) {
						throw new RewriteEarlyExitException();
					}
					while ( stream_fielddec.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "recty"


	public static class fielddec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fielddec"
	// .\\Expr.g:37:1: fielddec : ID ':' ID -> ^( ARGDEC ID ID ) ;
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
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// .\\Expr.g:37:11: ( ID ':' ID -> ^( ARGDEC ID ID ) )
			// .\\Expr.g:37:13: ID ':' ID
			{
			ID20=(Token)match(input,ID,FOLLOW_ID_in_fielddec380);  
			stream_ID.add(ID20);

			char_literal21=(Token)match(input,61,FOLLOW_61_in_fielddec382);  
			stream_61.add(char_literal21);

			ID22=(Token)match(input,ID,FOLLOW_ID_in_fielddec384);  
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
				// .\\Expr.g:37:25: ^( ARGDEC ID ID )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGDEC, "ARGDEC"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
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
		return retval;
	}
	// $ANTLR end "fielddec"


	public static class fundec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fundec"
	// .\\Expr.g:40:1: fundec : 'function' ID '(' ( fielddec ( ',' fielddec )* )? ')' ( ':' ID )? '=' exp -> ^( FUNCDEC ID ^( PARAM ( fielddec )* ) ^( BLOCK exp ) ( ^( RETURN ID ) )? ) ;
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
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_fielddec=new RewriteRuleSubtreeStream(adaptor,"rule fielddec");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// .\\Expr.g:40:10: ( 'function' ID '(' ( fielddec ( ',' fielddec )* )? ')' ( ':' ID )? '=' exp -> ^( FUNCDEC ID ^( PARAM ( fielddec )* ) ^( BLOCK exp ) ( ^( RETURN ID ) )? ) )
			// .\\Expr.g:40:12: 'function' ID '(' ( fielddec ( ',' fielddec )* )? ')' ( ':' ID )? '=' exp
			{
			string_literal23=(Token)match(input,73,FOLLOW_73_in_fundec407);  
			stream_73.add(string_literal23);

			ID24=(Token)match(input,ID,FOLLOW_ID_in_fundec409);  
			stream_ID.add(ID24);

			char_literal25=(Token)match(input,55,FOLLOW_55_in_fundec411);  
			stream_55.add(char_literal25);

			// .\\Expr.g:40:30: ( fielddec ( ',' fielddec )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// .\\Expr.g:40:31: fielddec ( ',' fielddec )*
					{
					pushFollow(FOLLOW_fielddec_in_fundec414);
					fielddec26=fielddec();
					state._fsp--;

					stream_fielddec.add(fielddec26.getTree());
					// .\\Expr.g:40:39: ( ',' fielddec )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==58) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// .\\Expr.g:40:40: ',' fielddec
							{
							char_literal27=(Token)match(input,58,FOLLOW_58_in_fundec416);  
							stream_58.add(char_literal27);

							pushFollow(FOLLOW_fielddec_in_fundec417);
							fielddec28=fielddec();
							state._fsp--;

							stream_fielddec.add(fielddec28.getTree());
							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;

			}

			char_literal29=(Token)match(input,56,FOLLOW_56_in_fundec423);  
			stream_56.add(char_literal29);

			// .\\Expr.g:40:60: ( ':' ID )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==61) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// .\\Expr.g:40:61: ':' ID
					{
					char_literal30=(Token)match(input,61,FOLLOW_61_in_fundec426);  
					stream_61.add(char_literal30);

					ID31=(Token)match(input,ID,FOLLOW_ID_in_fundec428);  
					stream_ID.add(ID31);

					}
					break;

			}

			char_literal32=(Token)match(input,64,FOLLOW_64_in_fundec432);  
			stream_64.add(char_literal32);

			pushFollow(FOLLOW_exp_in_fundec434);
			exp33=exp();
			state._fsp--;

			stream_exp.add(exp33.getTree());
			// AST REWRITE
			// elements: ID, ID, fielddec, exp
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
				// .\\Expr.g:40:80: ^( FUNCDEC ID ^( PARAM ( fielddec )* ) ^( BLOCK exp ) ( ^( RETURN ID ) )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCDEC, "FUNCDEC"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// .\\Expr.g:40:93: ^( PARAM ( fielddec )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_2);
				// .\\Expr.g:40:102: ( fielddec )*
				while ( stream_fielddec.hasNext() ) {
					adaptor.addChild(root_2, stream_fielddec.nextTree());
				}
				stream_fielddec.reset();

				adaptor.addChild(root_1, root_2);
				}

				// .\\Expr.g:40:113: ^( BLOCK exp )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
				adaptor.addChild(root_2, stream_exp.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// .\\Expr.g:40:126: ( ^( RETURN ID ) )?
				if ( stream_ID.hasNext() ) {
					// .\\Expr.g:40:126: ^( RETURN ID )
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);
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
		return retval;
	}
	// $ANTLR end "fundec"


	public static class vardec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vardec"
	// .\\Expr.g:43:1: vardec : 'var' ID vardec1 -> ^( VARDEC ID vardec1 ) ;
	public final ExprParser.vardec_return vardec() throws RecognitionException {
		ExprParser.vardec_return retval = new ExprParser.vardec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal34=null;
		Token ID35=null;
		ParserRuleReturnScope vardec136 =null;

		Object string_literal34_tree=null;
		Object ID35_tree=null;
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_vardec1=new RewriteRuleSubtreeStream(adaptor,"rule vardec1");

		try {
			// .\\Expr.g:43:10: ( 'var' ID vardec1 -> ^( VARDEC ID vardec1 ) )
			// .\\Expr.g:43:12: 'var' ID vardec1
			{
			string_literal34=(Token)match(input,82,FOLLOW_82_in_vardec477);  
			stream_82.add(string_literal34);

			ID35=(Token)match(input,ID,FOLLOW_ID_in_vardec479);  
			stream_ID.add(ID35);

			pushFollow(FOLLOW_vardec1_in_vardec481);
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
				// .\\Expr.g:43:32: ^( VARDEC ID vardec1 )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEC, "VARDEC"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
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
		return retval;
	}
	// $ANTLR end "vardec"


	public static class vardec1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vardec1"
	// .\\Expr.g:45:1: vardec1 : ( ':=' decexp -> decexp | ':' ID ':=' decexp -> ID decexp );
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
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_decexp=new RewriteRuleSubtreeStream(adaptor,"rule decexp");

		try {
			// .\\Expr.g:45:11: ( ':=' decexp -> decexp | ':' ID ':=' decexp -> ID decexp )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==62) ) {
				alt8=1;
			}
			else if ( (LA8_0==61) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// .\\Expr.g:45:13: ':=' decexp
					{
					string_literal37=(Token)match(input,62,FOLLOW_62_in_vardec1504);  
					stream_62.add(string_literal37);

					pushFollow(FOLLOW_decexp_in_vardec1506);
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
						adaptor.addChild(root_0, stream_decexp.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// .\\Expr.g:46:6: ':' ID ':=' decexp
					{
					char_literal39=(Token)match(input,61,FOLLOW_61_in_vardec1517);  
					stream_61.add(char_literal39);

					ID40=(Token)match(input,ID,FOLLOW_ID_in_vardec1519);  
					stream_ID.add(ID40);

					string_literal41=(Token)match(input,62,FOLLOW_62_in_vardec1521);  
					stream_62.add(string_literal41);

					pushFollow(FOLLOW_decexp_in_vardec1523);
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
						adaptor.addChild(root_0, stream_ID.nextNode());
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
		return retval;
	}
	// $ANTLR end "vardec1"


	public static class decexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decexp"
	// .\\Expr.g:52:1: decexp : (| decinfixassign | ifthenelse | whileexp | forexp );
	public final ExprParser.decexp_return decexp() throws RecognitionException {
		ExprParser.decexp_return retval = new ExprParser.decexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope decinfixassign43 =null;
		ParserRuleReturnScope ifthenelse44 =null;
		ParserRuleReturnScope whileexp45 =null;
		ParserRuleReturnScope forexp46 =null;


		try {
			// .\\Expr.g:52:10: (| decinfixassign | ifthenelse | whileexp | forexp )
			int alt9=5;
			switch ( input.LA(1) ) {
			case 71:
			case 73:
			case 75:
			case 81:
			case 82:
				{
				alt9=1;
				}
				break;
			case ID:
			case INTLIT:
			case STRINGLIT:
			case 55:
			case 59:
			case 68:
			case 76:
			case 77:
				{
				alt9=2;
				}
				break;
			case 74:
				{
				alt9=3;
				}
				break;
			case 83:
				{
				alt9=4;
				}
				break;
			case 72:
				{
				alt9=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// .\\Expr.g:53:4: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;
				case 2 :
					// .\\Expr.g:53:6: decinfixassign
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_decinfixassign_in_decexp563);
					decinfixassign43=decinfixassign();
					state._fsp--;

					adaptor.addChild(root_0, decinfixassign43.getTree());

					}
					break;
				case 3 :
					// .\\Expr.g:54:6: ifthenelse
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifthenelse_in_decexp571);
					ifthenelse44=ifthenelse();
					state._fsp--;

					adaptor.addChild(root_0, ifthenelse44.getTree());

					}
					break;
				case 4 :
					// .\\Expr.g:56:6: whileexp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileexp_in_decexp582);
					whileexp45=whileexp();
					state._fsp--;

					adaptor.addChild(root_0, whileexp45.getTree());

					}
					break;
				case 5 :
					// .\\Expr.g:57:6: forexp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forexp_in_decexp589);
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
		return retval;
	}
	// $ANTLR end "decexp"


	public static class decinfixassign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decinfixassign"
	// .\\Expr.g:63:1: decinfixassign : decinfixor ( ':=' ^ decinfixor )? ;
	public final ExprParser.decinfixassign_return decinfixassign() throws RecognitionException {
		ExprParser.decinfixassign_return retval = new ExprParser.decinfixassign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal48=null;
		ParserRuleReturnScope decinfixor47 =null;
		ParserRuleReturnScope decinfixor49 =null;

		Object string_literal48_tree=null;

		try {
			// .\\Expr.g:63:17: ( decinfixor ( ':=' ^ decinfixor )? )
			// .\\Expr.g:63:20: decinfixor ( ':=' ^ decinfixor )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_decinfixor_in_decinfixassign612);
			decinfixor47=decinfixor();
			state._fsp--;

			adaptor.addChild(root_0, decinfixor47.getTree());

			// .\\Expr.g:63:31: ( ':=' ^ decinfixor )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==62) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// .\\Expr.g:63:32: ':=' ^ decinfixor
					{
					string_literal48=(Token)match(input,62,FOLLOW_62_in_decinfixassign615); 
					string_literal48_tree = (Object)adaptor.create(string_literal48);
					root_0 = (Object)adaptor.becomeRoot(string_literal48_tree, root_0);

					pushFollow(FOLLOW_decinfixor_in_decinfixassign618);
					decinfixor49=decinfixor();
					state._fsp--;

					adaptor.addChild(root_0, decinfixor49.getTree());

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
			// do for sure before leaving
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
	// .\\Expr.g:68:1: decinfixor : decinfixand ( '|' ^ decinfixand )* ;
	public final ExprParser.decinfixor_return decinfixor() throws RecognitionException {
		ExprParser.decinfixor_return retval = new ExprParser.decinfixor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal51=null;
		ParserRuleReturnScope decinfixand50 =null;
		ParserRuleReturnScope decinfixand52 =null;

		Object char_literal51_tree=null;

		try {
			// .\\Expr.g:68:12: ( decinfixand ( '|' ^ decinfixand )* )
			// .\\Expr.g:68:14: decinfixand ( '|' ^ decinfixand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_decinfixand_in_decinfixor635);
			decinfixand50=decinfixand();
			state._fsp--;

			adaptor.addChild(root_0, decinfixand50.getTree());

			// .\\Expr.g:68:26: ( '|' ^ decinfixand )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==85) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// .\\Expr.g:68:27: '|' ^ decinfixand
					{
					char_literal51=(Token)match(input,85,FOLLOW_85_in_decinfixor638); 
					char_literal51_tree = (Object)adaptor.create(char_literal51);
					root_0 = (Object)adaptor.becomeRoot(char_literal51_tree, root_0);

					pushFollow(FOLLOW_decinfixand_in_decinfixor641);
					decinfixand52=decinfixand();
					state._fsp--;

					adaptor.addChild(root_0, decinfixand52.getTree());

					}
					break;

				default :
					break loop11;
				}
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
			// do for sure before leaving
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
	// .\\Expr.g:71:1: decinfixand : deccomp ( '&' ^ deccomp )* ;
	public final ExprParser.decinfixand_return decinfixand() throws RecognitionException {
		ExprParser.decinfixand_return retval = new ExprParser.decinfixand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal54=null;
		ParserRuleReturnScope deccomp53 =null;
		ParserRuleReturnScope deccomp55 =null;

		Object char_literal54_tree=null;

		try {
			// .\\Expr.g:71:13: ( deccomp ( '&' ^ deccomp )* )
			// .\\Expr.g:71:15: deccomp ( '&' ^ deccomp )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_deccomp_in_decinfixand653);
			deccomp53=deccomp();
			state._fsp--;

			adaptor.addChild(root_0, deccomp53.getTree());

			// .\\Expr.g:71:23: ( '&' ^ deccomp )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==54) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// .\\Expr.g:71:24: '&' ^ deccomp
					{
					char_literal54=(Token)match(input,54,FOLLOW_54_in_decinfixand656); 
					char_literal54_tree = (Object)adaptor.create(char_literal54);
					root_0 = (Object)adaptor.becomeRoot(char_literal54_tree, root_0);

					pushFollow(FOLLOW_deccomp_in_decinfixand659);
					deccomp55=deccomp();
					state._fsp--;

					adaptor.addChild(root_0, deccomp55.getTree());

					}
					break;

				default :
					break loop12;
				}
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
			// do for sure before leaving
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
	// .\\Expr.g:74:1: deccomp : decadd ( ( INFIXCOMP ^| '=' ^) decadd )* ;
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

		try {
			// .\\Expr.g:74:9: ( decadd ( ( INFIXCOMP ^| '=' ^) decadd )* )
			// .\\Expr.g:74:11: decadd ( ( INFIXCOMP ^| '=' ^) decadd )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_decadd_in_deccomp671);
			decadd56=decadd();
			state._fsp--;

			adaptor.addChild(root_0, decadd56.getTree());

			// .\\Expr.g:74:18: ( ( INFIXCOMP ^| '=' ^) decadd )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==INFIXCOMP||LA14_0==64) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// .\\Expr.g:74:19: ( INFIXCOMP ^| '=' ^) decadd
					{
					// .\\Expr.g:74:19: ( INFIXCOMP ^| '=' ^)
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==INFIXCOMP) ) {
						alt13=1;
					}
					else if ( (LA13_0==64) ) {
						alt13=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// .\\Expr.g:74:20: INFIXCOMP ^
							{
							INFIXCOMP57=(Token)match(input,INFIXCOMP,FOLLOW_INFIXCOMP_in_deccomp675); 
							INFIXCOMP57_tree = (Object)adaptor.create(INFIXCOMP57);
							root_0 = (Object)adaptor.becomeRoot(INFIXCOMP57_tree, root_0);

							}
							break;
						case 2 :
							// .\\Expr.g:74:33: '=' ^
							{
							char_literal58=(Token)match(input,64,FOLLOW_64_in_deccomp680); 
							char_literal58_tree = (Object)adaptor.create(char_literal58);
							root_0 = (Object)adaptor.becomeRoot(char_literal58_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_decadd_in_deccomp686);
					decadd59=decadd();
					state._fsp--;

					adaptor.addChild(root_0, decadd59.getTree());

					}
					break;

				default :
					break loop14;
				}
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
			// do for sure before leaving
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
	// .\\Expr.g:77:1: decadd : decmult ( ( '-' | '+' ) ^ decmult )* ;
	public final ExprParser.decadd_return decadd() throws RecognitionException {
		ExprParser.decadd_return retval = new ExprParser.decadd_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set61=null;
		ParserRuleReturnScope decmult60 =null;
		ParserRuleReturnScope decmult62 =null;

		Object set61_tree=null;

		try {
			// .\\Expr.g:77:7: ( decmult ( ( '-' | '+' ) ^ decmult )* )
			// .\\Expr.g:77:10: decmult ( ( '-' | '+' ) ^ decmult )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_decmult_in_decadd699);
			decmult60=decmult();
			state._fsp--;

			adaptor.addChild(root_0, decmult60.getTree());

			// .\\Expr.g:77:17: ( ( '-' | '+' ) ^ decmult )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==57||LA15_0==59) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// .\\Expr.g:77:18: ( '-' | '+' ) ^ decmult
					{
					set61=input.LT(1);
					set61=input.LT(1);
					if ( input.LA(1)==57||input.LA(1)==59 ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set61), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_decmult_in_decadd707);
					decmult62=decmult();
					state._fsp--;

					adaptor.addChild(root_0, decmult62.getTree());

					}
					break;

				default :
					break loop15;
				}
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
			// do for sure before leaving
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
	// .\\Expr.g:80:1: decmult : decbase ( INFIXMULTDIV ^ decbase )* ;
	public final ExprParser.decmult_return decmult() throws RecognitionException {
		ExprParser.decmult_return retval = new ExprParser.decmult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INFIXMULTDIV64=null;
		ParserRuleReturnScope decbase63 =null;
		ParserRuleReturnScope decbase65 =null;

		Object INFIXMULTDIV64_tree=null;

		try {
			// .\\Expr.g:80:9: ( decbase ( INFIXMULTDIV ^ decbase )* )
			// .\\Expr.g:80:11: decbase ( INFIXMULTDIV ^ decbase )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_decbase_in_decmult720);
			decbase63=decbase();
			state._fsp--;

			adaptor.addChild(root_0, decbase63.getTree());

			// .\\Expr.g:80:18: ( INFIXMULTDIV ^ decbase )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==INFIXMULTDIV) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// .\\Expr.g:80:19: INFIXMULTDIV ^ decbase
					{
					INFIXMULTDIV64=(Token)match(input,INFIXMULTDIV,FOLLOW_INFIXMULTDIV_in_decmult722); 
					INFIXMULTDIV64_tree = (Object)adaptor.create(INFIXMULTDIV64);
					root_0 = (Object)adaptor.becomeRoot(INFIXMULTDIV64_tree, root_0);

					pushFollow(FOLLOW_decbase_in_decmult726);
					decbase65=decbase();
					state._fsp--;

					adaptor.addChild(root_0, decbase65.getTree());

					}
					break;

				default :
					break loop16;
				}
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
			// do for sure before leaving
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
	// .\\Expr.g:84:1: decbase : ( INTLIT -> ^( VARSIMPLE INTLIT ) | '-' decbase -> ^( MOINS_UNAIRE decbase ) | ID ( '.' att= ID ( exp2 |) -> ^( ATTRIBUTAFFECT ID $att ( exp2 )? ) | callcrochet -> ^( VARARRAYDEC ID callcrochet ) | callexp -> ^( CALLFUN ID callexp ) | reccreate -> ^( VARRECORD ID reccreate ) | -> ^( ID ) ) | seqexp | 'nil' | STRINGLIT -> ^( VARSIMPLE STRINGLIT ) | letexp | 'break' );
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
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_STRINGLIT=new RewriteRuleTokenStream(adaptor,"token STRINGLIT");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_INTLIT=new RewriteRuleTokenStream(adaptor,"token INTLIT");
		RewriteRuleSubtreeStream stream_reccreate=new RewriteRuleSubtreeStream(adaptor,"rule reccreate");
		RewriteRuleSubtreeStream stream_callcrochet=new RewriteRuleSubtreeStream(adaptor,"rule callcrochet");
		RewriteRuleSubtreeStream stream_decbase=new RewriteRuleSubtreeStream(adaptor,"rule decbase");
		RewriteRuleSubtreeStream stream_exp2=new RewriteRuleSubtreeStream(adaptor,"rule exp2");
		RewriteRuleSubtreeStream stream_callexp=new RewriteRuleSubtreeStream(adaptor,"rule callexp");

		try {
			// .\\Expr.g:84:9: ( INTLIT -> ^( VARSIMPLE INTLIT ) | '-' decbase -> ^( MOINS_UNAIRE decbase ) | ID ( '.' att= ID ( exp2 |) -> ^( ATTRIBUTAFFECT ID $att ( exp2 )? ) | callcrochet -> ^( VARARRAYDEC ID callcrochet ) | callexp -> ^( CALLFUN ID callexp ) | reccreate -> ^( VARRECORD ID reccreate ) | -> ^( ID ) ) | seqexp | 'nil' | STRINGLIT -> ^( VARSIMPLE STRINGLIT ) | letexp | 'break' )
			int alt19=8;
			switch ( input.LA(1) ) {
			case INTLIT:
				{
				alt19=1;
				}
				break;
			case 59:
				{
				alt19=2;
				}
				break;
			case ID:
				{
				alt19=3;
				}
				break;
			case 55:
				{
				alt19=4;
				}
				break;
			case 77:
				{
				alt19=5;
				}
				break;
			case STRINGLIT:
				{
				alt19=6;
				}
				break;
			case 76:
				{
				alt19=7;
				}
				break;
			case 68:
				{
				alt19=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// .\\Expr.g:84:11: INTLIT
					{
					INTLIT66=(Token)match(input,INTLIT,FOLLOW_INTLIT_in_decbase739);  
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
						// .\\Expr.g:84:21: ^( VARSIMPLE INTLIT )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARSIMPLE, "VARSIMPLE"), root_1);
						adaptor.addChild(root_1, stream_INTLIT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// .\\Expr.g:85:10: '-' decbase
					{
					char_literal67=(Token)match(input,59,FOLLOW_59_in_decbase759);  
					stream_59.add(char_literal67);

					pushFollow(FOLLOW_decbase_in_decbase762);
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
						// .\\Expr.g:85:27: ^( MOINS_UNAIRE decbase )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MOINS_UNAIRE, "MOINS_UNAIRE"), root_1);
						adaptor.addChild(root_1, stream_decbase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// .\\Expr.g:86:11: ID ( '.' att= ID ( exp2 |) -> ^( ATTRIBUTAFFECT ID $att ( exp2 )? ) | callcrochet -> ^( VARARRAYDEC ID callcrochet ) | callexp -> ^( CALLFUN ID callexp ) | reccreate -> ^( VARRECORD ID reccreate ) | -> ^( ID ) )
					{
					ID69=(Token)match(input,ID,FOLLOW_ID_in_decbase784);  
					stream_ID.add(ID69);

					// .\\Expr.g:86:14: ( '.' att= ID ( exp2 |) -> ^( ATTRIBUTAFFECT ID $att ( exp2 )? ) | callcrochet -> ^( VARARRAYDEC ID callcrochet ) | callexp -> ^( CALLFUN ID callexp ) | reccreate -> ^( VARRECORD ID reccreate ) | -> ^( ID ) )
					int alt18=5;
					switch ( input.LA(1) ) {
					case 60:
						{
						alt18=1;
						}
						break;
					case 65:
						{
						alt18=2;
						}
						break;
					case 55:
						{
						alt18=3;
						}
						break;
					case 84:
						{
						alt18=4;
						}
						break;
					case INFIXCOMP:
					case INFIXMULTDIV:
					case 54:
					case 57:
					case 59:
					case 62:
					case 64:
					case 71:
					case 73:
					case 75:
					case 81:
					case 82:
					case 85:
						{
						alt18=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);
						throw nvae;
					}
					switch (alt18) {
						case 1 :
							// .\\Expr.g:86:16: '.' att= ID ( exp2 |)
							{
							char_literal70=(Token)match(input,60,FOLLOW_60_in_decbase788);  
							stream_60.add(char_literal70);

							att=(Token)match(input,ID,FOLLOW_ID_in_decbase792);  
							stream_ID.add(att);

							// .\\Expr.g:86:26: ( exp2 |)
							int alt17=2;
							int LA17_0 = input.LA(1);
							if ( (LA17_0==60||LA17_0==78) ) {
								alt17=1;
							}
							else if ( ((LA17_0 >= INFIXCOMP && LA17_0 <= INFIXMULTDIV)||LA17_0==54||LA17_0==57||LA17_0==59||LA17_0==62||LA17_0==64||LA17_0==71||LA17_0==73||LA17_0==75||(LA17_0 >= 81 && LA17_0 <= 82)||LA17_0==85) ) {
								alt17=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 17, 0, input);
								throw nvae;
							}

							switch (alt17) {
								case 1 :
									// .\\Expr.g:86:28: exp2
									{
									pushFollow(FOLLOW_exp2_in_decbase795);
									exp271=exp2();
									state._fsp--;

									stream_exp2.add(exp271.getTree());
									}
									break;
								case 2 :
									// .\\Expr.g:86:33: 
									{
									}
									break;

							}

							// AST REWRITE
							// elements: ID, att, exp2
							// token labels: att
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleTokenStream stream_att=new RewriteRuleTokenStream(adaptor,"token att",att);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 86:35: -> ^( ATTRIBUTAFFECT ID $att ( exp2 )? )
							{
								// .\\Expr.g:86:38: ^( ATTRIBUTAFFECT ID $att ( exp2 )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBUTAFFECT, "ATTRIBUTAFFECT"), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								adaptor.addChild(root_1, stream_att.nextNode());
								// .\\Expr.g:86:63: ( exp2 )?
								if ( stream_exp2.hasNext() ) {
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
							// .\\Expr.g:86:72: callcrochet
							{
							pushFollow(FOLLOW_callcrochet_in_decbase815);
							callcrochet72=callcrochet();
							state._fsp--;

							stream_callcrochet.add(callcrochet72.getTree());
							// AST REWRITE
							// elements: ID, callcrochet
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 86:84: -> ^( VARARRAYDEC ID callcrochet )
							{
								// .\\Expr.g:86:86: ^( VARARRAYDEC ID callcrochet )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARARRAYDEC, "VARARRAYDEC"), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								adaptor.addChild(root_1, stream_callcrochet.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 3 :
							// .\\Expr.g:86:118: callexp
							{
							pushFollow(FOLLOW_callexp_in_decbase828);
							callexp73=callexp();
							state._fsp--;

							stream_callexp.add(callexp73.getTree());
							// AST REWRITE
							// elements: ID, callexp
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 86:126: -> ^( CALLFUN ID callexp )
							{
								// .\\Expr.g:86:129: ^( CALLFUN ID callexp )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALLFUN, "CALLFUN"), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								adaptor.addChild(root_1, stream_callexp.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 4 :
							// .\\Expr.g:86:154: reccreate
							{
							pushFollow(FOLLOW_reccreate_in_decbase843);
							reccreate74=reccreate();
							state._fsp--;

							stream_reccreate.add(reccreate74.getTree());
							// AST REWRITE
							// elements: ID, reccreate
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 86:164: -> ^( VARRECORD ID reccreate )
							{
								// .\\Expr.g:86:167: ^( VARRECORD ID reccreate )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARRECORD, "VARRECORD"), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								adaptor.addChild(root_1, stream_reccreate.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 5 :
							// .\\Expr.g:86:195: 
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
							// 86:195: -> ^( ID )
							{
								// .\\Expr.g:86:198: ^( ID )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 4 :
					// .\\Expr.g:87:11: seqexp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_seqexp_in_decbase880);
					seqexp75=seqexp();
					state._fsp--;

					adaptor.addChild(root_0, seqexp75.getTree());

					}
					break;
				case 5 :
					// .\\Expr.g:88:11: 'nil'
					{
					root_0 = (Object)adaptor.nil();


					string_literal76=(Token)match(input,77,FOLLOW_77_in_decbase892); 
					string_literal76_tree = (Object)adaptor.create(string_literal76);
					adaptor.addChild(root_0, string_literal76_tree);

					}
					break;
				case 6 :
					// .\\Expr.g:90:11: STRINGLIT
					{
					STRINGLIT77=(Token)match(input,STRINGLIT,FOLLOW_STRINGLIT_in_decbase913);  
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
						// .\\Expr.g:90:24: ^( VARSIMPLE STRINGLIT )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARSIMPLE, "VARSIMPLE"), root_1);
						adaptor.addChild(root_1, stream_STRINGLIT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// .\\Expr.g:91:11: letexp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_letexp_in_decbase934);
					letexp78=letexp();
					state._fsp--;

					adaptor.addChild(root_0, letexp78.getTree());

					}
					break;
				case 8 :
					// .\\Expr.g:92:11: 'break'
					{
					root_0 = (Object)adaptor.nil();


					string_literal79=(Token)match(input,68,FOLLOW_68_in_decbase946); 
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
		return retval;
	}
	// $ANTLR end "decbase"


	public static class lvalue_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lvalue"
	// .\\Expr.g:95:1: lvalue : ID exp2 ;
	public final ExprParser.lvalue_return lvalue() throws RecognitionException {
		ExprParser.lvalue_return retval = new ExprParser.lvalue_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID80=null;
		ParserRuleReturnScope exp281 =null;

		Object ID80_tree=null;

		try {
			// .\\Expr.g:95:15: ( ID exp2 )
			// .\\Expr.g:95:17: ID exp2
			{
			root_0 = (Object)adaptor.nil();


			ID80=(Token)match(input,ID,FOLLOW_ID_in_lvalue964); 
			ID80_tree = (Object)adaptor.create(ID80);
			adaptor.addChild(root_0, ID80_tree);

			pushFollow(FOLLOW_exp2_in_lvalue966);
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
		return retval;
	}
	// $ANTLR end "lvalue"


	public static class seqexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "seqexp"
	// .\\Expr.g:100:1: seqexp : '(' exp ( ';' exp )* ')' -> ( exp )* ;
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
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// .\\Expr.g:100:14: ( '(' exp ( ';' exp )* ')' -> ( exp )* )
			// .\\Expr.g:100:16: '(' exp ( ';' exp )* ')'
			{
			char_literal82=(Token)match(input,55,FOLLOW_55_in_seqexp996);  
			stream_55.add(char_literal82);

			pushFollow(FOLLOW_exp_in_seqexp998);
			exp83=exp();
			state._fsp--;

			stream_exp.add(exp83.getTree());
			// .\\Expr.g:100:24: ( ';' exp )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==63) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// .\\Expr.g:100:25: ';' exp
					{
					char_literal84=(Token)match(input,63,FOLLOW_63_in_seqexp1001);  
					stream_63.add(char_literal84);

					pushFollow(FOLLOW_exp_in_seqexp1003);
					exp85=exp();
					state._fsp--;

					stream_exp.add(exp85.getTree());
					}
					break;

				default :
					break loop20;
				}
			}

			char_literal86=(Token)match(input,56,FOLLOW_56_in_seqexp1006);  
			stream_56.add(char_literal86);

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
				// .\\Expr.g:100:41: ( exp )*
				while ( stream_exp.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "seqexp"


	public static class callexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "callexp"
	// .\\Expr.g:105:1: callexp : '(' exp ( ',' exp )* ')' -> ^( ARG ( exp )* ) ;
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
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// .\\Expr.g:105:11: ( '(' exp ( ',' exp )* ')' -> ^( ARG ( exp )* ) )
			// .\\Expr.g:105:12: '(' exp ( ',' exp )* ')'
			{
			char_literal87=(Token)match(input,55,FOLLOW_55_in_callexp1029);  
			stream_55.add(char_literal87);

			pushFollow(FOLLOW_exp_in_callexp1031);
			exp88=exp();
			state._fsp--;

			stream_exp.add(exp88.getTree());
			// .\\Expr.g:105:20: ( ',' exp )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==58) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// .\\Expr.g:105:21: ',' exp
					{
					char_literal89=(Token)match(input,58,FOLLOW_58_in_callexp1034);  
					stream_58.add(char_literal89);

					pushFollow(FOLLOW_exp_in_callexp1036);
					exp90=exp();
					state._fsp--;

					stream_exp.add(exp90.getTree());
					}
					break;

				default :
					break loop21;
				}
			}

			char_literal91=(Token)match(input,56,FOLLOW_56_in_callexp1040);  
			stream_56.add(char_literal91);

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
				// .\\Expr.g:105:38: ^( ARG ( exp )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG, "ARG"), root_1);
				// .\\Expr.g:105:44: ( exp )*
				while ( stream_exp.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "callexp"


	public static class exp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exp"
	// .\\Expr.g:108:1: exp : (| infixassign | ifthenelse | whileexp | forexp );
	public final ExprParser.exp_return exp() throws RecognitionException {
		ExprParser.exp_return retval = new ExprParser.exp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope infixassign92 =null;
		ParserRuleReturnScope ifthenelse93 =null;
		ParserRuleReturnScope whileexp94 =null;
		ParserRuleReturnScope forexp95 =null;


		try {
			// .\\Expr.g:108:7: (| infixassign | ifthenelse | whileexp | forexp )
			int alt22=5;
			switch ( input.LA(1) ) {
			case EOF:
			case 56:
			case 58:
			case 63:
			case 66:
			case 69:
			case 70:
			case 71:
			case 73:
			case 75:
			case 79:
			case 80:
			case 81:
			case 82:
			case 86:
				{
				alt22=1;
				}
				break;
			case ID:
			case INTLIT:
			case STRINGLIT:
			case 55:
			case 59:
			case 68:
			case 76:
			case 77:
				{
				alt22=2;
				}
				break;
			case 74:
				{
				alt22=3;
				}
				break;
			case 83:
				{
				alt22=4;
				}
				break;
			case 72:
				{
				alt22=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// .\\Expr.g:109:4: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;
				case 2 :
					// .\\Expr.g:109:6: infixassign
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_infixassign_in_exp1070);
					infixassign92=infixassign();
					state._fsp--;

					adaptor.addChild(root_0, infixassign92.getTree());

					}
					break;
				case 3 :
					// .\\Expr.g:110:6: ifthenelse
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifthenelse_in_exp1078);
					ifthenelse93=ifthenelse();
					state._fsp--;

					adaptor.addChild(root_0, ifthenelse93.getTree());

					}
					break;
				case 4 :
					// .\\Expr.g:111:6: whileexp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileexp_in_exp1085);
					whileexp94=whileexp();
					state._fsp--;

					adaptor.addChild(root_0, whileexp94.getTree());

					}
					break;
				case 5 :
					// .\\Expr.g:112:6: forexp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forexp_in_exp1092);
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
		return retval;
	}
	// $ANTLR end "exp"


	public static class exp2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exp2"
	// .\\Expr.g:117:1: exp2 : ( 'of' base -> ^( OF base ) | '.' ID ( exp2 |) -> ^( ATTRIBUT ID ( exp2 )? ) );
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
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_exp2=new RewriteRuleSubtreeStream(adaptor,"rule exp2");
		RewriteRuleSubtreeStream stream_base=new RewriteRuleSubtreeStream(adaptor,"rule base");

		try {
			// .\\Expr.g:117:7: ( 'of' base -> ^( OF base ) | '.' ID ( exp2 |) -> ^( ATTRIBUT ID ( exp2 )? ) )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==78) ) {
				alt24=1;
			}
			else if ( (LA24_0==60) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// .\\Expr.g:117:9: 'of' base
					{
					string_literal96=(Token)match(input,78,FOLLOW_78_in_exp21109);  
					stream_78.add(string_literal96);

					pushFollow(FOLLOW_base_in_exp21111);
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
						// .\\Expr.g:117:25: ^( OF base )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OF, "OF"), root_1);
						adaptor.addChild(root_1, stream_base.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// .\\Expr.g:118:3: '.' ID ( exp2 |)
					{
					char_literal98=(Token)match(input,60,FOLLOW_60_in_exp21126);  
					stream_60.add(char_literal98);

					ID99=(Token)match(input,ID,FOLLOW_ID_in_exp21128);  
					stream_ID.add(ID99);

					// .\\Expr.g:118:9: ( exp2 |)
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==60||LA23_0==78) ) {
						alt23=1;
					}
					else if ( (LA23_0==EOF||(LA23_0 >= INFIXCOMP && LA23_0 <= INFIXMULTDIV)||LA23_0==54||(LA23_0 >= 56 && LA23_0 <= 59)||(LA23_0 >= 62 && LA23_0 <= 64)||LA23_0==66||(LA23_0 >= 69 && LA23_0 <= 71)||LA23_0==73||LA23_0==75||(LA23_0 >= 79 && LA23_0 <= 82)||(LA23_0 >= 85 && LA23_0 <= 86)) ) {
						alt23=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}

					switch (alt23) {
						case 1 :
							// .\\Expr.g:118:11: exp2
							{
							pushFollow(FOLLOW_exp2_in_exp21131);
							exp2100=exp2();
							state._fsp--;

							stream_exp2.add(exp2100.getTree());
							}
							break;
						case 2 :
							// .\\Expr.g:118:16: 
							{
							}
							break;

					}

					// AST REWRITE
					// elements: ID, exp2
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
						// .\\Expr.g:118:21: ^( ATTRIBUT ID ( exp2 )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBUT, "ATTRIBUT"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						// .\\Expr.g:118:35: ( exp2 )?
						if ( stream_exp2.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "exp2"


	public static class callcrochet_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "callcrochet"
	// .\\Expr.g:121:1: callcrochet : ( '[' exp ']' )+ ( exp2 )? -> ( exp )+ ( exp2 )? ;
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
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_exp2=new RewriteRuleSubtreeStream(adaptor,"rule exp2");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// .\\Expr.g:121:15: ( ( '[' exp ']' )+ ( exp2 )? -> ( exp )+ ( exp2 )? )
			// .\\Expr.g:121:17: ( '[' exp ']' )+ ( exp2 )?
			{
			// .\\Expr.g:121:17: ( '[' exp ']' )+
			int cnt25=0;
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==65) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// .\\Expr.g:121:18: '[' exp ']'
					{
					char_literal101=(Token)match(input,65,FOLLOW_65_in_callcrochet1161);  
					stream_65.add(char_literal101);

					pushFollow(FOLLOW_exp_in_callcrochet1163);
					exp102=exp();
					state._fsp--;

					stream_exp.add(exp102.getTree());
					char_literal103=(Token)match(input,66,FOLLOW_66_in_callcrochet1165);  
					stream_66.add(char_literal103);

					}
					break;

				default :
					if ( cnt25 >= 1 ) break loop25;
					EarlyExitException eee = new EarlyExitException(25, input);
					throw eee;
				}
				cnt25++;
			}

			// .\\Expr.g:121:32: ( exp2 )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==60||LA26_0==78) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// .\\Expr.g:121:33: exp2
					{
					pushFollow(FOLLOW_exp2_in_callcrochet1170);
					exp2104=exp2();
					state._fsp--;

					stream_exp2.add(exp2104.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: exp2, exp
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
				if ( !(stream_exp.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_exp.hasNext() ) {
					adaptor.addChild(root_0, stream_exp.nextTree());
				}
				stream_exp.reset();

				// .\\Expr.g:121:50: ( exp2 )?
				if ( stream_exp2.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "callcrochet"


	public static class infixassign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "infixassign"
	// .\\Expr.g:126:1: infixassign : infixor ( ':=' ^ infixor )? ;
	public final ExprParser.infixassign_return infixassign() throws RecognitionException {
		ExprParser.infixassign_return retval = new ExprParser.infixassign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal106=null;
		ParserRuleReturnScope infixor105 =null;
		ParserRuleReturnScope infixor107 =null;

		Object string_literal106_tree=null;

		try {
			// .\\Expr.g:126:14: ( infixor ( ':=' ^ infixor )? )
			// .\\Expr.g:126:17: infixor ( ':=' ^ infixor )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_infixor_in_infixassign1198);
			infixor105=infixor();
			state._fsp--;

			adaptor.addChild(root_0, infixor105.getTree());

			// .\\Expr.g:126:25: ( ':=' ^ infixor )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==62) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// .\\Expr.g:126:26: ':=' ^ infixor
					{
					string_literal106=(Token)match(input,62,FOLLOW_62_in_infixassign1201); 
					string_literal106_tree = (Object)adaptor.create(string_literal106);
					root_0 = (Object)adaptor.becomeRoot(string_literal106_tree, root_0);

					pushFollow(FOLLOW_infixor_in_infixassign1204);
					infixor107=infixor();
					state._fsp--;

					adaptor.addChild(root_0, infixor107.getTree());

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
			// do for sure before leaving
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
	// .\\Expr.g:131:1: infixor : infixand ( '|' ^ infixand )* ;
	public final ExprParser.infixor_return infixor() throws RecognitionException {
		ExprParser.infixor_return retval = new ExprParser.infixor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal109=null;
		ParserRuleReturnScope infixand108 =null;
		ParserRuleReturnScope infixand110 =null;

		Object char_literal109_tree=null;

		try {
			// .\\Expr.g:131:9: ( infixand ( '|' ^ infixand )* )
			// .\\Expr.g:131:11: infixand ( '|' ^ infixand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_infixand_in_infixor1221);
			infixand108=infixand();
			state._fsp--;

			adaptor.addChild(root_0, infixand108.getTree());

			// .\\Expr.g:131:20: ( '|' ^ infixand )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==85) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// .\\Expr.g:131:21: '|' ^ infixand
					{
					char_literal109=(Token)match(input,85,FOLLOW_85_in_infixor1224); 
					char_literal109_tree = (Object)adaptor.create(char_literal109);
					root_0 = (Object)adaptor.becomeRoot(char_literal109_tree, root_0);

					pushFollow(FOLLOW_infixand_in_infixor1227);
					infixand110=infixand();
					state._fsp--;

					adaptor.addChild(root_0, infixand110.getTree());

					}
					break;

				default :
					break loop28;
				}
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
			// do for sure before leaving
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
	// .\\Expr.g:134:1: infixand : comp ( '&' ^ comp )* ;
	public final ExprParser.infixand_return infixand() throws RecognitionException {
		ExprParser.infixand_return retval = new ExprParser.infixand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal112=null;
		ParserRuleReturnScope comp111 =null;
		ParserRuleReturnScope comp113 =null;

		Object char_literal112_tree=null;

		try {
			// .\\Expr.g:134:10: ( comp ( '&' ^ comp )* )
			// .\\Expr.g:134:12: comp ( '&' ^ comp )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_comp_in_infixand1239);
			comp111=comp();
			state._fsp--;

			adaptor.addChild(root_0, comp111.getTree());

			// .\\Expr.g:134:17: ( '&' ^ comp )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==54) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// .\\Expr.g:134:18: '&' ^ comp
					{
					char_literal112=(Token)match(input,54,FOLLOW_54_in_infixand1242); 
					char_literal112_tree = (Object)adaptor.create(char_literal112);
					root_0 = (Object)adaptor.becomeRoot(char_literal112_tree, root_0);

					pushFollow(FOLLOW_comp_in_infixand1245);
					comp113=comp();
					state._fsp--;

					adaptor.addChild(root_0, comp113.getTree());

					}
					break;

				default :
					break loop29;
				}
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
			// do for sure before leaving
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
	// .\\Expr.g:137:1: comp : add ( ( INFIXCOMP ^| '=' ^) add )* ;
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

		try {
			// .\\Expr.g:137:6: ( add ( ( INFIXCOMP ^| '=' ^) add )* )
			// .\\Expr.g:137:8: add ( ( INFIXCOMP ^| '=' ^) add )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_add_in_comp1257);
			add114=add();
			state._fsp--;

			adaptor.addChild(root_0, add114.getTree());

			// .\\Expr.g:137:12: ( ( INFIXCOMP ^| '=' ^) add )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==INFIXCOMP||LA31_0==64) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// .\\Expr.g:137:13: ( INFIXCOMP ^| '=' ^) add
					{
					// .\\Expr.g:137:13: ( INFIXCOMP ^| '=' ^)
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==INFIXCOMP) ) {
						alt30=1;
					}
					else if ( (LA30_0==64) ) {
						alt30=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						throw nvae;
					}

					switch (alt30) {
						case 1 :
							// .\\Expr.g:137:14: INFIXCOMP ^
							{
							INFIXCOMP115=(Token)match(input,INFIXCOMP,FOLLOW_INFIXCOMP_in_comp1261); 
							INFIXCOMP115_tree = (Object)adaptor.create(INFIXCOMP115);
							root_0 = (Object)adaptor.becomeRoot(INFIXCOMP115_tree, root_0);

							}
							break;
						case 2 :
							// .\\Expr.g:137:27: '=' ^
							{
							char_literal116=(Token)match(input,64,FOLLOW_64_in_comp1266); 
							char_literal116_tree = (Object)adaptor.create(char_literal116);
							root_0 = (Object)adaptor.becomeRoot(char_literal116_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_add_in_comp1272);
					add117=add();
					state._fsp--;

					adaptor.addChild(root_0, add117.getTree());

					}
					break;

				default :
					break loop31;
				}
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
			// do for sure before leaving
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
	// .\\Expr.g:140:1: add : mult ( ( '-' | '+' ) ^ mult )* ;
	public final ExprParser.add_return add() throws RecognitionException {
		ExprParser.add_return retval = new ExprParser.add_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set119=null;
		ParserRuleReturnScope mult118 =null;
		ParserRuleReturnScope mult120 =null;

		Object set119_tree=null;

		try {
			// .\\Expr.g:140:4: ( mult ( ( '-' | '+' ) ^ mult )* )
			// .\\Expr.g:140:7: mult ( ( '-' | '+' ) ^ mult )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mult_in_add1285);
			mult118=mult();
			state._fsp--;

			adaptor.addChild(root_0, mult118.getTree());

			// .\\Expr.g:140:11: ( ( '-' | '+' ) ^ mult )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==57||LA32_0==59) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// .\\Expr.g:140:12: ( '-' | '+' ) ^ mult
					{
					set119=input.LT(1);
					set119=input.LT(1);
					if ( input.LA(1)==57||input.LA(1)==59 ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set119), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mult_in_add1293);
					mult120=mult();
					state._fsp--;

					adaptor.addChild(root_0, mult120.getTree());

					}
					break;

				default :
					break loop32;
				}
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
			// do for sure before leaving
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
	// .\\Expr.g:143:1: mult : base ( INFIXMULTDIV ^ base )* ;
	public final ExprParser.mult_return mult() throws RecognitionException {
		ExprParser.mult_return retval = new ExprParser.mult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INFIXMULTDIV122=null;
		ParserRuleReturnScope base121 =null;
		ParserRuleReturnScope base123 =null;

		Object INFIXMULTDIV122_tree=null;

		try {
			// .\\Expr.g:143:6: ( base ( INFIXMULTDIV ^ base )* )
			// .\\Expr.g:143:8: base ( INFIXMULTDIV ^ base )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_base_in_mult1306);
			base121=base();
			state._fsp--;

			adaptor.addChild(root_0, base121.getTree());

			// .\\Expr.g:143:12: ( INFIXMULTDIV ^ base )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==INFIXMULTDIV) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// .\\Expr.g:143:13: INFIXMULTDIV ^ base
					{
					INFIXMULTDIV122=(Token)match(input,INFIXMULTDIV,FOLLOW_INFIXMULTDIV_in_mult1308); 
					INFIXMULTDIV122_tree = (Object)adaptor.create(INFIXMULTDIV122);
					root_0 = (Object)adaptor.becomeRoot(INFIXMULTDIV122_tree, root_0);

					pushFollow(FOLLOW_base_in_mult1312);
					base123=base();
					state._fsp--;

					adaptor.addChild(root_0, base123.getTree());

					}
					break;

				default :
					break loop33;
				}
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
			// do for sure before leaving
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
	// .\\Expr.g:147:1: base : ( INTLIT | '-' base -> ^( MOINS_UNAIRE base ) | ID ( '.' att= ID ( exp2 )? -> ^( ATTRIBUTAFFECT ID $att ( exp2 )? ) | callcrochet -> ^( CALLCROCHET ID callcrochet ) | callexp -> ^( CALLFUN ID callexp ) | reccreate -> ^( VARRECORD ID reccreate ) | -> ^( ID ) ) | seqexp | 'nil' | STRINGLIT | letexp | 'break' );
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
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_reccreate=new RewriteRuleSubtreeStream(adaptor,"rule reccreate");
		RewriteRuleSubtreeStream stream_callcrochet=new RewriteRuleSubtreeStream(adaptor,"rule callcrochet");
		RewriteRuleSubtreeStream stream_exp2=new RewriteRuleSubtreeStream(adaptor,"rule exp2");
		RewriteRuleSubtreeStream stream_callexp=new RewriteRuleSubtreeStream(adaptor,"rule callexp");
		RewriteRuleSubtreeStream stream_base=new RewriteRuleSubtreeStream(adaptor,"rule base");

		try {
			// .\\Expr.g:147:6: ( INTLIT | '-' base -> ^( MOINS_UNAIRE base ) | ID ( '.' att= ID ( exp2 )? -> ^( ATTRIBUTAFFECT ID $att ( exp2 )? ) | callcrochet -> ^( CALLCROCHET ID callcrochet ) | callexp -> ^( CALLFUN ID callexp ) | reccreate -> ^( VARRECORD ID reccreate ) | -> ^( ID ) ) | seqexp | 'nil' | STRINGLIT | letexp | 'break' )
			int alt36=8;
			switch ( input.LA(1) ) {
			case INTLIT:
				{
				alt36=1;
				}
				break;
			case 59:
				{
				alt36=2;
				}
				break;
			case ID:
				{
				alt36=3;
				}
				break;
			case 55:
				{
				alt36=4;
				}
				break;
			case 77:
				{
				alt36=5;
				}
				break;
			case STRINGLIT:
				{
				alt36=6;
				}
				break;
			case 76:
				{
				alt36=7;
				}
				break;
			case 68:
				{
				alt36=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// .\\Expr.g:147:8: INTLIT
					{
					root_0 = (Object)adaptor.nil();


					INTLIT124=(Token)match(input,INTLIT,FOLLOW_INTLIT_in_base1325); 
					INTLIT124_tree = (Object)adaptor.create(INTLIT124);
					adaptor.addChild(root_0, INTLIT124_tree);

					}
					break;
				case 2 :
					// .\\Expr.g:148:10: '-' base
					{
					char_literal125=(Token)match(input,59,FOLLOW_59_in_base1336);  
					stream_59.add(char_literal125);

					pushFollow(FOLLOW_base_in_base1339);
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
						// .\\Expr.g:148:24: ^( MOINS_UNAIRE base )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MOINS_UNAIRE, "MOINS_UNAIRE"), root_1);
						adaptor.addChild(root_1, stream_base.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// .\\Expr.g:149:11: ID ( '.' att= ID ( exp2 )? -> ^( ATTRIBUTAFFECT ID $att ( exp2 )? ) | callcrochet -> ^( CALLCROCHET ID callcrochet ) | callexp -> ^( CALLFUN ID callexp ) | reccreate -> ^( VARRECORD ID reccreate ) | -> ^( ID ) )
					{
					ID127=(Token)match(input,ID,FOLLOW_ID_in_base1360);  
					stream_ID.add(ID127);

					// .\\Expr.g:149:14: ( '.' att= ID ( exp2 )? -> ^( ATTRIBUTAFFECT ID $att ( exp2 )? ) | callcrochet -> ^( CALLCROCHET ID callcrochet ) | callexp -> ^( CALLFUN ID callexp ) | reccreate -> ^( VARRECORD ID reccreate ) | -> ^( ID ) )
					int alt35=5;
					switch ( input.LA(1) ) {
					case 60:
						{
						alt35=1;
						}
						break;
					case 65:
						{
						alt35=2;
						}
						break;
					case 55:
						{
						alt35=3;
						}
						break;
					case 84:
						{
						alt35=4;
						}
						break;
					case EOF:
					case INFIXCOMP:
					case INFIXMULTDIV:
					case 54:
					case 56:
					case 57:
					case 58:
					case 59:
					case 62:
					case 63:
					case 64:
					case 66:
					case 69:
					case 70:
					case 71:
					case 73:
					case 75:
					case 79:
					case 80:
					case 81:
					case 82:
					case 85:
					case 86:
						{
						alt35=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 35, 0, input);
						throw nvae;
					}
					switch (alt35) {
						case 1 :
							// .\\Expr.g:149:16: '.' att= ID ( exp2 )?
							{
							char_literal128=(Token)match(input,60,FOLLOW_60_in_base1364);  
							stream_60.add(char_literal128);

							att=(Token)match(input,ID,FOLLOW_ID_in_base1368);  
							stream_ID.add(att);

							// .\\Expr.g:149:26: ( exp2 )?
							int alt34=2;
							int LA34_0 = input.LA(1);
							if ( (LA34_0==60||LA34_0==78) ) {
								alt34=1;
							}
							switch (alt34) {
								case 1 :
									// .\\Expr.g:149:28: exp2
									{
									pushFollow(FOLLOW_exp2_in_base1371);
									exp2129=exp2();
									state._fsp--;

									stream_exp2.add(exp2129.getTree());
									}
									break;

							}

							// AST REWRITE
							// elements: ID, att, exp2
							// token labels: att
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleTokenStream stream_att=new RewriteRuleTokenStream(adaptor,"token att",att);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 149:35: -> ^( ATTRIBUTAFFECT ID $att ( exp2 )? )
							{
								// .\\Expr.g:149:38: ^( ATTRIBUTAFFECT ID $att ( exp2 )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBUTAFFECT, "ATTRIBUTAFFECT"), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								adaptor.addChild(root_1, stream_att.nextNode());
								// .\\Expr.g:149:63: ( exp2 )?
								if ( stream_exp2.hasNext() ) {
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
							// .\\Expr.g:150:11: callcrochet
							{
							pushFollow(FOLLOW_callcrochet_in_base1401);
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
								// .\\Expr.g:150:25: ^( CALLCROCHET ID callcrochet )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALLCROCHET, "CALLCROCHET"), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								adaptor.addChild(root_1, stream_callcrochet.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 3 :
							// .\\Expr.g:151:12: callexp
							{
							pushFollow(FOLLOW_callexp_in_base1423);
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
								// .\\Expr.g:151:23: ^( CALLFUN ID callexp )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALLFUN, "CALLFUN"), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								adaptor.addChild(root_1, stream_callexp.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 4 :
							// .\\Expr.g:152:12: reccreate
							{
							pushFollow(FOLLOW_reccreate_in_base1448);
							reccreate132=reccreate();
							state._fsp--;

							stream_reccreate.add(reccreate132.getTree());
							// AST REWRITE
							// elements: ID, reccreate
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
								// .\\Expr.g:152:25: ^( VARRECORD ID reccreate )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARRECORD, "VARRECORD"), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								adaptor.addChild(root_1, stream_reccreate.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 5 :
							// .\\Expr.g:153:11: 
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
								// .\\Expr.g:153:13: ^( ID )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 4 :
					// .\\Expr.g:155:11: seqexp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_seqexp_in_base1507);
					seqexp133=seqexp();
					state._fsp--;

					adaptor.addChild(root_0, seqexp133.getTree());

					}
					break;
				case 5 :
					// .\\Expr.g:156:11: 'nil'
					{
					root_0 = (Object)adaptor.nil();


					string_literal134=(Token)match(input,77,FOLLOW_77_in_base1519); 
					string_literal134_tree = (Object)adaptor.create(string_literal134);
					adaptor.addChild(root_0, string_literal134_tree);

					}
					break;
				case 6 :
					// .\\Expr.g:157:11: STRINGLIT
					{
					root_0 = (Object)adaptor.nil();


					STRINGLIT135=(Token)match(input,STRINGLIT,FOLLOW_STRINGLIT_in_base1531); 
					STRINGLIT135_tree = (Object)adaptor.create(STRINGLIT135);
					adaptor.addChild(root_0, STRINGLIT135_tree);

					}
					break;
				case 7 :
					// .\\Expr.g:158:11: letexp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_letexp_in_base1543);
					letexp136=letexp();
					state._fsp--;

					adaptor.addChild(root_0, letexp136.getTree());

					}
					break;
				case 8 :
					// .\\Expr.g:159:11: 'break'
					{
					root_0 = (Object)adaptor.nil();


					string_literal137=(Token)match(input,68,FOLLOW_68_in_base1555); 
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
		return retval;
	}
	// $ANTLR end "base"


	public static class letexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "letexp"
	// .\\Expr.g:165:1: letexp : 'let' ( dec )* ( 'in' exp ( ';' exp )* )? 'end' -> ^( LET ( dec )* ) ( ^( IN ( exp )* ) )? ^( END ) ;
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
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_dec=new RewriteRuleSubtreeStream(adaptor,"rule dec");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// .\\Expr.g:165:12: ( 'let' ( dec )* ( 'in' exp ( ';' exp )* )? 'end' -> ^( LET ( dec )* ) ( ^( IN ( exp )* ) )? ^( END ) )
			// .\\Expr.g:165:14: 'let' ( dec )* ( 'in' exp ( ';' exp )* )? 'end'
			{
			string_literal138=(Token)match(input,76,FOLLOW_76_in_letexp1581);  
			stream_76.add(string_literal138);

			// .\\Expr.g:165:20: ( dec )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==73||(LA37_0 >= 81 && LA37_0 <= 82)) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// .\\Expr.g:165:20: dec
					{
					pushFollow(FOLLOW_dec_in_letexp1583);
					dec139=dec();
					state._fsp--;

					stream_dec.add(dec139.getTree());
					}
					break;

				default :
					break loop37;
				}
			}

			// .\\Expr.g:165:25: ( 'in' exp ( ';' exp )* )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==75) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// .\\Expr.g:165:26: 'in' exp ( ';' exp )*
					{
					string_literal140=(Token)match(input,75,FOLLOW_75_in_letexp1587);  
					stream_75.add(string_literal140);

					pushFollow(FOLLOW_exp_in_letexp1589);
					exp141=exp();
					state._fsp--;

					stream_exp.add(exp141.getTree());
					// .\\Expr.g:165:35: ( ';' exp )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==63) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// .\\Expr.g:165:36: ';' exp
							{
							char_literal142=(Token)match(input,63,FOLLOW_63_in_letexp1592);  
							stream_63.add(char_literal142);

							pushFollow(FOLLOW_exp_in_letexp1594);
							exp143=exp();
							state._fsp--;

							stream_exp.add(exp143.getTree());
							}
							break;

						default :
							break loop38;
						}
					}

					}
					break;

			}

			string_literal144=(Token)match(input,71,FOLLOW_71_in_letexp1600);  
			stream_71.add(string_literal144);

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
				// .\\Expr.g:165:58: ^( LET ( dec )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LET, "LET"), root_1);
				// .\\Expr.g:165:65: ( dec )*
				while ( stream_dec.hasNext() ) {
					adaptor.addChild(root_1, stream_dec.nextTree());
				}
				stream_dec.reset();

				adaptor.addChild(root_0, root_1);
				}

				// .\\Expr.g:165:72: ( ^( IN ( exp )* ) )?
				if ( stream_exp.hasNext() ) {
					// .\\Expr.g:165:72: ^( IN ( exp )* )
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_1);
					// .\\Expr.g:165:77: ( exp )*
					while ( stream_exp.hasNext() ) {
						adaptor.addChild(root_1, stream_exp.nextTree());
					}
					stream_exp.reset();

					adaptor.addChild(root_0, root_1);
					}

				}
				stream_exp.reset();

				// .\\Expr.g:165:84: ^( END )
				{
				Object root_1 = (Object)adaptor.nil();
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
		return retval;
	}
	// $ANTLR end "letexp"


	public static class negation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "negation"
	// .\\Expr.g:168:1: negation : '-' exp ;
	public final ExprParser.negation_return negation() throws RecognitionException {
		ExprParser.negation_return retval = new ExprParser.negation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal145=null;
		ParserRuleReturnScope exp146 =null;

		Object char_literal145_tree=null;

		try {
			// .\\Expr.g:168:12: ( '-' exp )
			// .\\Expr.g:168:14: '-' exp
			{
			root_0 = (Object)adaptor.nil();


			char_literal145=(Token)match(input,59,FOLLOW_59_in_negation1641); 
			char_literal145_tree = (Object)adaptor.create(char_literal145);
			adaptor.addChild(root_0, char_literal145_tree);

			pushFollow(FOLLOW_exp_in_negation1643);
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
		return retval;
	}
	// $ANTLR end "negation"


	public static class arrcreate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrcreate"
	// .\\Expr.g:171:1: arrcreate : '[' exp ']' 'of' exp ;
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

		try {
			// .\\Expr.g:171:13: ( '[' exp ']' 'of' exp )
			// .\\Expr.g:171:15: '[' exp ']' 'of' exp
			{
			root_0 = (Object)adaptor.nil();


			char_literal147=(Token)match(input,65,FOLLOW_65_in_arrcreate1657); 
			char_literal147_tree = (Object)adaptor.create(char_literal147);
			adaptor.addChild(root_0, char_literal147_tree);

			pushFollow(FOLLOW_exp_in_arrcreate1659);
			exp148=exp();
			state._fsp--;

			adaptor.addChild(root_0, exp148.getTree());

			char_literal149=(Token)match(input,66,FOLLOW_66_in_arrcreate1661); 
			char_literal149_tree = (Object)adaptor.create(char_literal149);
			adaptor.addChild(root_0, char_literal149_tree);

			string_literal150=(Token)match(input,78,FOLLOW_78_in_arrcreate1663); 
			string_literal150_tree = (Object)adaptor.create(string_literal150);
			adaptor.addChild(root_0, string_literal150_tree);

			pushFollow(FOLLOW_exp_in_arrcreate1665);
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
		return retval;
	}
	// $ANTLR end "arrcreate"


	public static class reccreate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "reccreate"
	// .\\Expr.g:174:1: reccreate : '{' ( fieldcreate ( ',' fieldcreate )* )? '}' -> ( fieldcreate )* ;
	public final ExprParser.reccreate_return reccreate() throws RecognitionException {
		ExprParser.reccreate_return retval = new ExprParser.reccreate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal152=null;
		Token char_literal154=null;
		Token char_literal156=null;
		ParserRuleReturnScope fieldcreate153 =null;
		ParserRuleReturnScope fieldcreate155 =null;

		Object char_literal152_tree=null;
		Object char_literal154_tree=null;
		Object char_literal156_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_fieldcreate=new RewriteRuleSubtreeStream(adaptor,"rule fieldcreate");

		try {
			// .\\Expr.g:174:13: ( '{' ( fieldcreate ( ',' fieldcreate )* )? '}' -> ( fieldcreate )* )
			// .\\Expr.g:174:15: '{' ( fieldcreate ( ',' fieldcreate )* )? '}'
			{
			char_literal152=(Token)match(input,84,FOLLOW_84_in_reccreate1679);  
			stream_84.add(char_literal152);

			// .\\Expr.g:174:19: ( fieldcreate ( ',' fieldcreate )* )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==ID) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// .\\Expr.g:174:20: fieldcreate ( ',' fieldcreate )*
					{
					pushFollow(FOLLOW_fieldcreate_in_reccreate1682);
					fieldcreate153=fieldcreate();
					state._fsp--;

					stream_fieldcreate.add(fieldcreate153.getTree());
					// .\\Expr.g:174:32: ( ',' fieldcreate )*
					loop40:
					while (true) {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( (LA40_0==58) ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// .\\Expr.g:174:33: ',' fieldcreate
							{
							char_literal154=(Token)match(input,58,FOLLOW_58_in_reccreate1685);  
							stream_58.add(char_literal154);

							pushFollow(FOLLOW_fieldcreate_in_reccreate1686);
							fieldcreate155=fieldcreate();
							state._fsp--;

							stream_fieldcreate.add(fieldcreate155.getTree());
							}
							break;

						default :
							break loop40;
						}
					}

					}
					break;

			}

			char_literal156=(Token)match(input,86,FOLLOW_86_in_reccreate1692);  
			stream_86.add(char_literal156);

			// AST REWRITE
			// elements: fieldcreate
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 174:56: -> ( fieldcreate )*
			{
				// .\\Expr.g:174:58: ( fieldcreate )*
				while ( stream_fieldcreate.hasNext() ) {
					adaptor.addChild(root_0, stream_fieldcreate.nextTree());
				}
				stream_fieldcreate.reset();

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
		return retval;
	}
	// $ANTLR end "reccreate"


	public static class fieldcreate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fieldcreate"
	// .\\Expr.g:177:1: fieldcreate : ID '=' exp -> ^( AFFECTATT ID exp ) ;
	public final ExprParser.fieldcreate_return fieldcreate() throws RecognitionException {
		ExprParser.fieldcreate_return retval = new ExprParser.fieldcreate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID157=null;
		Token char_literal158=null;
		ParserRuleReturnScope exp159 =null;

		Object ID157_tree=null;
		Object char_literal158_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// .\\Expr.g:177:15: ( ID '=' exp -> ^( AFFECTATT ID exp ) )
			// .\\Expr.g:177:17: ID '=' exp
			{
			ID157=(Token)match(input,ID,FOLLOW_ID_in_fieldcreate1712);  
			stream_ID.add(ID157);

			char_literal158=(Token)match(input,64,FOLLOW_64_in_fieldcreate1714);  
			stream_64.add(char_literal158);

			pushFollow(FOLLOW_exp_in_fieldcreate1716);
			exp159=exp();
			state._fsp--;

			stream_exp.add(exp159.getTree());
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
				// .\\Expr.g:177:31: ^( AFFECTATT ID exp )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECTATT, "AFFECTATT"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
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
		return retval;
	}
	// $ANTLR end "fieldcreate"


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// .\\Expr.g:180:1: assignment : base ':=' exp ;
	public final ExprParser.assignment_return assignment() throws RecognitionException {
		ExprParser.assignment_return retval = new ExprParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal161=null;
		ParserRuleReturnScope base160 =null;
		ParserRuleReturnScope exp162 =null;

		Object string_literal161_tree=null;

		try {
			// .\\Expr.g:180:14: ( base ':=' exp )
			// .\\Expr.g:180:16: base ':=' exp
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_base_in_assignment1741);
			base160=base();
			state._fsp--;

			adaptor.addChild(root_0, base160.getTree());

			string_literal161=(Token)match(input,62,FOLLOW_62_in_assignment1743); 
			string_literal161_tree = (Object)adaptor.create(string_literal161);
			adaptor.addChild(root_0, string_literal161_tree);

			pushFollow(FOLLOW_exp_in_assignment1745);
			exp162=exp();
			state._fsp--;

			adaptor.addChild(root_0, exp162.getTree());

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
		return retval;
	}
	// $ANTLR end "assignment"


	public static class ifthenelse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifthenelse"
	// .\\Expr.g:183:1: ifthenelse : 'if' cond= exp 'then' alors= exp ( options {greedy=true; } : 'else' sinon= exp )? -> ^( IF ^( COND $cond) ^( THEN $alors) ( ^( ELSE $sinon) )? ) ;
	public final ExprParser.ifthenelse_return ifthenelse() throws RecognitionException {
		ExprParser.ifthenelse_return retval = new ExprParser.ifthenelse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal163=null;
		Token string_literal164=null;
		Token string_literal165=null;
		ParserRuleReturnScope cond =null;
		ParserRuleReturnScope alors =null;
		ParserRuleReturnScope sinon =null;

		Object string_literal163_tree=null;
		Object string_literal164_tree=null;
		Object string_literal165_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// .\\Expr.g:183:14: ( 'if' cond= exp 'then' alors= exp ( options {greedy=true; } : 'else' sinon= exp )? -> ^( IF ^( COND $cond) ^( THEN $alors) ( ^( ELSE $sinon) )? ) )
			// .\\Expr.g:183:16: 'if' cond= exp 'then' alors= exp ( options {greedy=true; } : 'else' sinon= exp )?
			{
			string_literal163=(Token)match(input,74,FOLLOW_74_in_ifthenelse1759);  
			stream_74.add(string_literal163);

			pushFollow(FOLLOW_exp_in_ifthenelse1763);
			cond=exp();
			state._fsp--;

			stream_exp.add(cond.getTree());
			string_literal164=(Token)match(input,79,FOLLOW_79_in_ifthenelse1765);  
			stream_79.add(string_literal164);

			pushFollow(FOLLOW_exp_in_ifthenelse1770);
			alors=exp();
			state._fsp--;

			stream_exp.add(alors.getTree());
			// .\\Expr.g:183:48: ( options {greedy=true; } : 'else' sinon= exp )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==70) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// .\\Expr.g:183:75: 'else' sinon= exp
					{
					string_literal165=(Token)match(input,70,FOLLOW_70_in_ifthenelse1783);  
					stream_70.add(string_literal165);

					pushFollow(FOLLOW_exp_in_ifthenelse1787);
					sinon=exp();
					state._fsp--;

					stream_exp.add(sinon.getTree());
					}
					break;

			}

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
				// .\\Expr.g:183:96: ^( IF ^( COND $cond) ^( THEN $alors) ( ^( ELSE $sinon) )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				// .\\Expr.g:183:101: ^( COND $cond)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
				adaptor.addChild(root_2, stream_cond.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// .\\Expr.g:183:115: ^( THEN $alors)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);
				adaptor.addChild(root_2, stream_alors.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// .\\Expr.g:183:130: ( ^( ELSE $sinon) )?
				if ( stream_sinon.hasNext() ) {
					// .\\Expr.g:183:131: ^( ELSE $sinon)
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);
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
		return retval;
	}
	// $ANTLR end "ifthenelse"


	public static class ifelse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifelse"
	// .\\Expr.g:186:1: ifelse : ( options {greedy=true; } : 'else' exp )? ;
	public final ExprParser.ifelse_return ifelse() throws RecognitionException {
		ExprParser.ifelse_return retval = new ExprParser.ifelse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal166=null;
		ParserRuleReturnScope exp167 =null;

		Object string_literal166_tree=null;

		try {
			// .\\Expr.g:186:9: ( ( options {greedy=true; } : 'else' exp )? )
			// .\\Expr.g:186:11: ( options {greedy=true; } : 'else' exp )?
			{
			root_0 = (Object)adaptor.nil();


			// .\\Expr.g:186:11: ( options {greedy=true; } : 'else' exp )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==70) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// .\\Expr.g:186:38: 'else' exp
					{
					string_literal166=(Token)match(input,70,FOLLOW_70_in_ifelse1846); 
					string_literal166_tree = (Object)adaptor.create(string_literal166);
					adaptor.addChild(root_0, string_literal166_tree);

					pushFollow(FOLLOW_exp_in_ifelse1848);
					exp167=exp();
					state._fsp--;

					adaptor.addChild(root_0, exp167.getTree());

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
			// do for sure before leaving
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
	// .\\Expr.g:192:1: whileexp : 'while' exp 'do' exp -> ^( WHILE ^( COND exp ) ^( BLOCK exp ) ) ;
	public final ExprParser.whileexp_return whileexp() throws RecognitionException {
		ExprParser.whileexp_return retval = new ExprParser.whileexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal168=null;
		Token string_literal170=null;
		ParserRuleReturnScope exp169 =null;
		ParserRuleReturnScope exp171 =null;

		Object string_literal168_tree=null;
		Object string_literal170_tree=null;
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// .\\Expr.g:192:12: ( 'while' exp 'do' exp -> ^( WHILE ^( COND exp ) ^( BLOCK exp ) ) )
			// .\\Expr.g:192:14: 'while' exp 'do' exp
			{
			string_literal168=(Token)match(input,83,FOLLOW_83_in_whileexp1869);  
			stream_83.add(string_literal168);

			pushFollow(FOLLOW_exp_in_whileexp1871);
			exp169=exp();
			state._fsp--;

			stream_exp.add(exp169.getTree());
			string_literal170=(Token)match(input,69,FOLLOW_69_in_whileexp1873);  
			stream_69.add(string_literal170);

			pushFollow(FOLLOW_exp_in_whileexp1875);
			exp171=exp();
			state._fsp--;

			stream_exp.add(exp171.getTree());
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
				// .\\Expr.g:192:38: ^( WHILE ^( COND exp ) ^( BLOCK exp ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				// .\\Expr.g:192:46: ^( COND exp )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
				adaptor.addChild(root_2, stream_exp.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// .\\Expr.g:192:58: ^( BLOCK exp )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
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
		return retval;
	}
	// $ANTLR end "whileexp"


	public static class forexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forexp"
	// .\\Expr.g:195:1: forexp : 'for' ID ':=' ini= exp 'to' f= exp 'do' instru= exp -> ^( FOR ^( ITERATION ID $ini $f) ^( DO $instru) ) ;
	public final ExprParser.forexp_return forexp() throws RecognitionException {
		ExprParser.forexp_return retval = new ExprParser.forexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal172=null;
		Token ID173=null;
		Token string_literal174=null;
		Token string_literal175=null;
		Token string_literal176=null;
		ParserRuleReturnScope ini =null;
		ParserRuleReturnScope f =null;
		ParserRuleReturnScope instru =null;

		Object string_literal172_tree=null;
		Object ID173_tree=null;
		Object string_literal174_tree=null;
		Object string_literal175_tree=null;
		Object string_literal176_tree=null;
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// .\\Expr.g:195:10: ( 'for' ID ':=' ini= exp 'to' f= exp 'do' instru= exp -> ^( FOR ^( ITERATION ID $ini $f) ^( DO $instru) ) )
			// .\\Expr.g:195:12: 'for' ID ':=' ini= exp 'to' f= exp 'do' instru= exp
			{
			string_literal172=(Token)match(input,72,FOLLOW_72_in_forexp1907);  
			stream_72.add(string_literal172);

			ID173=(Token)match(input,ID,FOLLOW_ID_in_forexp1909);  
			stream_ID.add(ID173);

			string_literal174=(Token)match(input,62,FOLLOW_62_in_forexp1911);  
			stream_62.add(string_literal174);

			pushFollow(FOLLOW_exp_in_forexp1915);
			ini=exp();
			state._fsp--;

			stream_exp.add(ini.getTree());
			string_literal175=(Token)match(input,80,FOLLOW_80_in_forexp1917);  
			stream_80.add(string_literal175);

			pushFollow(FOLLOW_exp_in_forexp1921);
			f=exp();
			state._fsp--;

			stream_exp.add(f.getTree());
			string_literal176=(Token)match(input,69,FOLLOW_69_in_forexp1923);  
			stream_69.add(string_literal176);

			pushFollow(FOLLOW_exp_in_forexp1927);
			instru=exp();
			state._fsp--;

			stream_exp.add(instru.getTree());
			// AST REWRITE
			// elements: instru, ini, ID, f
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
				// .\\Expr.g:195:66: ^( FOR ^( ITERATION ID $ini $f) ^( DO $instru) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
				// .\\Expr.g:195:72: ^( ITERATION ID $ini $f)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ITERATION, "ITERATION"), root_2);
				adaptor.addChild(root_2, stream_ID.nextNode());
				adaptor.addChild(root_2, stream_ini.nextTree());
				adaptor.addChild(root_2, stream_f.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// .\\Expr.g:195:96: ^( DO $instru)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_2);
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
		return retval;
	}
	// $ANTLR end "forexp"

	// Delegated rules



	public static final BitSet FOLLOW_exp_in_program166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tydec_in_dec188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vardec_in_dec195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fundec_in_dec202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_tydec220 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_tydec222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_tydec224 = new BitSet(new long[]{0x0000000004000000L,0x0000000000100008L});
	public static final BitSet FOLLOW_ty_in_tydec226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ty254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrty_in_ty269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recty_in_ty284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_arrty306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_arrty308 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_arrty310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_recty329 = new BitSet(new long[]{0x0000000004000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_fielddec_in_recty332 = new BitSet(new long[]{0x0400000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_58_in_recty335 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_fielddec_in_recty336 = new BitSet(new long[]{0x0400000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_recty343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fielddec380 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_fielddec382 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_fielddec384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_fundec407 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_fundec409 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_fundec411 = new BitSet(new long[]{0x0100000004000000L});
	public static final BitSet FOLLOW_fielddec_in_fundec414 = new BitSet(new long[]{0x0500000000000000L});
	public static final BitSet FOLLOW_58_in_fundec416 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_fielddec_in_fundec417 = new BitSet(new long[]{0x0500000000000000L});
	public static final BitSet FOLLOW_56_in_fundec423 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_61_in_fundec426 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_fundec428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_fundec432 = new BitSet(new long[]{0x0880080084000000L,0x0000000000083510L});
	public static final BitSet FOLLOW_exp_in_fundec434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_vardec477 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_vardec479 = new BitSet(new long[]{0x6000000000000000L});
	public static final BitSet FOLLOW_vardec1_in_vardec481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_vardec1504 = new BitSet(new long[]{0x0880080084000000L,0x0000000000083510L});
	public static final BitSet FOLLOW_decexp_in_vardec1506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_vardec1517 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_vardec1519 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_vardec1521 = new BitSet(new long[]{0x0880080084000000L,0x0000000000083510L});
	public static final BitSet FOLLOW_decexp_in_vardec1523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decinfixassign_in_decexp563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifthenelse_in_decexp571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileexp_in_decexp582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forexp_in_decexp589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decinfixor_in_decinfixassign612 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_62_in_decinfixassign615 = new BitSet(new long[]{0x0880080084000000L,0x0000000000003010L});
	public static final BitSet FOLLOW_decinfixor_in_decinfixassign618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decinfixand_in_decinfixor635 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_decinfixor638 = new BitSet(new long[]{0x0880080084000000L,0x0000000000003010L});
	public static final BitSet FOLLOW_decinfixand_in_decinfixor641 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_deccomp_in_decinfixand653 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_54_in_decinfixand656 = new BitSet(new long[]{0x0880080084000000L,0x0000000000003010L});
	public static final BitSet FOLLOW_deccomp_in_decinfixand659 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_decadd_in_deccomp671 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_INFIXCOMP_in_deccomp675 = new BitSet(new long[]{0x0880080084000000L,0x0000000000003010L});
	public static final BitSet FOLLOW_64_in_deccomp680 = new BitSet(new long[]{0x0880080084000000L,0x0000000000003010L});
	public static final BitSet FOLLOW_decadd_in_deccomp686 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_decmult_in_decadd699 = new BitSet(new long[]{0x0A00000000000002L});
	public static final BitSet FOLLOW_set_in_decadd701 = new BitSet(new long[]{0x0880080084000000L,0x0000000000003010L});
	public static final BitSet FOLLOW_decmult_in_decadd707 = new BitSet(new long[]{0x0A00000000000002L});
	public static final BitSet FOLLOW_decbase_in_decmult720 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_INFIXMULTDIV_in_decmult722 = new BitSet(new long[]{0x0880080084000000L,0x0000000000003010L});
	public static final BitSet FOLLOW_decbase_in_decmult726 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_INTLIT_in_decbase739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_decbase759 = new BitSet(new long[]{0x0880080084000000L,0x0000000000003010L});
	public static final BitSet FOLLOW_decbase_in_decbase762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_decbase784 = new BitSet(new long[]{0x1080000000000002L,0x0000000000100002L});
	public static final BitSet FOLLOW_60_in_decbase788 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_decbase792 = new BitSet(new long[]{0x1000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_exp2_in_decbase795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callcrochet_in_decbase815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callexp_in_decbase828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reccreate_in_decbase843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_seqexp_in_decbase880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_decbase892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGLIT_in_decbase913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_letexp_in_decbase934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_decbase946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lvalue964 = new BitSet(new long[]{0x1000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_exp2_in_lvalue966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_seqexp996 = new BitSet(new long[]{0x8980080084000000L,0x0000000000083510L});
	public static final BitSet FOLLOW_exp_in_seqexp998 = new BitSet(new long[]{0x8100000000000000L});
	public static final BitSet FOLLOW_63_in_seqexp1001 = new BitSet(new long[]{0x8980080084000000L,0x0000000000083510L});
	public static final BitSet FOLLOW_exp_in_seqexp1003 = new BitSet(new long[]{0x8100000000000000L});
	public static final BitSet FOLLOW_56_in_seqexp1006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_callexp1029 = new BitSet(new long[]{0x0D80080084000000L,0x0000000000083510L});
	public static final BitSet FOLLOW_exp_in_callexp1031 = new BitSet(new long[]{0x0500000000000000L});
	public static final BitSet FOLLOW_58_in_callexp1034 = new BitSet(new long[]{0x0D80080084000000L,0x0000000000083510L});
	public static final BitSet FOLLOW_exp_in_callexp1036 = new BitSet(new long[]{0x0500000000000000L});
	public static final BitSet FOLLOW_56_in_callexp1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_infixassign_in_exp1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifthenelse_in_exp1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileexp_in_exp1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forexp_in_exp1092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_exp21109 = new BitSet(new long[]{0x0880080084000000L,0x0000000000003010L});
	public static final BitSet FOLLOW_base_in_exp21111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_exp21126 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_exp21128 = new BitSet(new long[]{0x1000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_exp2_in_exp21131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_callcrochet1161 = new BitSet(new long[]{0x0880080084000000L,0x0000000000083514L});
	public static final BitSet FOLLOW_exp_in_callcrochet1163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_callcrochet1165 = new BitSet(new long[]{0x1000000000000002L,0x0000000000004002L});
	public static final BitSet FOLLOW_exp2_in_callcrochet1170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_infixor_in_infixassign1198 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_62_in_infixassign1201 = new BitSet(new long[]{0x0880080084000000L,0x0000000000003010L});
	public static final BitSet FOLLOW_infixor_in_infixassign1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_infixand_in_infixor1221 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_infixor1224 = new BitSet(new long[]{0x0880080084000000L,0x0000000000003010L});
	public static final BitSet FOLLOW_infixand_in_infixor1227 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_comp_in_infixand1239 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_54_in_infixand1242 = new BitSet(new long[]{0x0880080084000000L,0x0000000000003010L});
	public static final BitSet FOLLOW_comp_in_infixand1245 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_add_in_comp1257 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_INFIXCOMP_in_comp1261 = new BitSet(new long[]{0x0880080084000000L,0x0000000000003010L});
	public static final BitSet FOLLOW_64_in_comp1266 = new BitSet(new long[]{0x0880080084000000L,0x0000000000003010L});
	public static final BitSet FOLLOW_add_in_comp1272 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_mult_in_add1285 = new BitSet(new long[]{0x0A00000000000002L});
	public static final BitSet FOLLOW_set_in_add1287 = new BitSet(new long[]{0x0880080084000000L,0x0000000000003010L});
	public static final BitSet FOLLOW_mult_in_add1293 = new BitSet(new long[]{0x0A00000000000002L});
	public static final BitSet FOLLOW_base_in_mult1306 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_INFIXMULTDIV_in_mult1308 = new BitSet(new long[]{0x0880080084000000L,0x0000000000003010L});
	public static final BitSet FOLLOW_base_in_mult1312 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_INTLIT_in_base1325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_base1336 = new BitSet(new long[]{0x0880080084000000L,0x0000000000003010L});
	public static final BitSet FOLLOW_base_in_base1339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_base1360 = new BitSet(new long[]{0x1080000000000002L,0x0000000000100002L});
	public static final BitSet FOLLOW_60_in_base1364 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_base1368 = new BitSet(new long[]{0x1000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_exp2_in_base1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callcrochet_in_base1401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callexp_in_base1423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reccreate_in_base1448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_seqexp_in_base1507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_base1519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGLIT_in_base1531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_letexp_in_base1543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_base1555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_letexp1581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060A80L});
	public static final BitSet FOLLOW_dec_in_letexp1583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060A80L});
	public static final BitSet FOLLOW_75_in_letexp1587 = new BitSet(new long[]{0x8880080084000000L,0x0000000000083590L});
	public static final BitSet FOLLOW_exp_in_letexp1589 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_63_in_letexp1592 = new BitSet(new long[]{0x8880080084000000L,0x0000000000083590L});
	public static final BitSet FOLLOW_exp_in_letexp1594 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_letexp1600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_negation1641 = new BitSet(new long[]{0x0880080084000000L,0x0000000000083510L});
	public static final BitSet FOLLOW_exp_in_negation1643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_arrcreate1657 = new BitSet(new long[]{0x0880080084000000L,0x0000000000083514L});
	public static final BitSet FOLLOW_exp_in_arrcreate1659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_arrcreate1661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_arrcreate1663 = new BitSet(new long[]{0x0880080084000000L,0x0000000000083510L});
	public static final BitSet FOLLOW_exp_in_arrcreate1665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_reccreate1679 = new BitSet(new long[]{0x0000000004000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_fieldcreate_in_reccreate1682 = new BitSet(new long[]{0x0400000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_58_in_reccreate1685 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_fieldcreate_in_reccreate1686 = new BitSet(new long[]{0x0400000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_reccreate1692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fieldcreate1712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_fieldcreate1714 = new BitSet(new long[]{0x0880080084000000L,0x0000000000083510L});
	public static final BitSet FOLLOW_exp_in_fieldcreate1716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_in_assignment1741 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_assignment1743 = new BitSet(new long[]{0x0880080084000000L,0x0000000000083510L});
	public static final BitSet FOLLOW_exp_in_assignment1745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_ifthenelse1759 = new BitSet(new long[]{0x0880080084000000L,0x000000000008B510L});
	public static final BitSet FOLLOW_exp_in_ifthenelse1763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_ifthenelse1765 = new BitSet(new long[]{0x0880080084000000L,0x0000000000083550L});
	public static final BitSet FOLLOW_exp_in_ifthenelse1770 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_ifthenelse1783 = new BitSet(new long[]{0x0880080084000000L,0x0000000000083510L});
	public static final BitSet FOLLOW_exp_in_ifthenelse1787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_ifelse1846 = new BitSet(new long[]{0x0880080084000000L,0x0000000000083510L});
	public static final BitSet FOLLOW_exp_in_ifelse1848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_whileexp1869 = new BitSet(new long[]{0x0880080084000000L,0x0000000000083530L});
	public static final BitSet FOLLOW_exp_in_whileexp1871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_whileexp1873 = new BitSet(new long[]{0x0880080084000000L,0x0000000000083510L});
	public static final BitSet FOLLOW_exp_in_whileexp1875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_forexp1907 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_forexp1909 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_forexp1911 = new BitSet(new long[]{0x0880080084000000L,0x0000000000093510L});
	public static final BitSet FOLLOW_exp_in_forexp1915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_forexp1917 = new BitSet(new long[]{0x0880080084000000L,0x0000000000083530L});
	public static final BitSet FOLLOW_exp_in_forexp1921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_forexp1923 = new BitSet(new long[]{0x0880080084000000L,0x0000000000083510L});
	public static final BitSet FOLLOW_exp_in_forexp1927 = new BitSet(new long[]{0x0000000000000002L});
}
