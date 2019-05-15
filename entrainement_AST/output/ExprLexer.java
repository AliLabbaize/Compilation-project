// $ANTLR null /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g 2018-11-21 16:16:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ExprLexer() {} 
	public ExprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g"; }

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:2:7: ( '(' )
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:2:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:3:7: ( ')' )
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:4:7: ( '*' )
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:4:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:5:7: ( '+' )
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:5:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:6:7: ( '-' )
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:6:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:7:7: ( '/' )
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:7:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:8:7: ( '=' )
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:8:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:37:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:37:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:37:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:38:5: ( ( '0' .. '9' )+ )
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:38:9: ( '0' .. '9' )+
			{
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:38:9: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:39:8: ( ( '\\r' )? '\\n' )
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:39:9: ( '\\r' )? '\\n'
			{
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:39:9: ( '\\r' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\r') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:39:9: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:40:5: ( ( ' ' | '\\t' ) )
			// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:
			{
			if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | ID | INT | NEWLINE | WS )
		int alt4=11;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt4=1;
			}
			break;
		case ')':
			{
			alt4=2;
			}
			break;
		case '*':
			{
			alt4=3;
			}
			break;
		case '+':
			{
			alt4=4;
			}
			break;
		case '-':
			{
			alt4=5;
			}
			break;
		case '/':
			{
			alt4=6;
			}
			break;
		case '=':
			{
			alt4=7;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=8;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=9;
			}
			break;
		case '\n':
		case '\r':
			{
			alt4=10;
			}
			break;
		case '\t':
		case ' ':
			{
			alt4=11;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:1:10: T__11
				{
				mT__11(); 

				}
				break;
			case 2 :
				// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:1:16: T__12
				{
				mT__12(); 

				}
				break;
			case 3 :
				// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:1:22: T__13
				{
				mT__13(); 

				}
				break;
			case 4 :
				// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:1:28: T__14
				{
				mT__14(); 

				}
				break;
			case 5 :
				// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:1:34: T__15
				{
				mT__15(); 

				}
				break;
			case 6 :
				// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:1:40: T__16
				{
				mT__16(); 

				}
				break;
			case 7 :
				// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:1:46: T__17
				{
				mT__17(); 

				}
				break;
			case 8 :
				// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:1:52: ID
				{
				mID(); 

				}
				break;
			case 9 :
				// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:1:55: INT
				{
				mINT(); 

				}
				break;
			case 10 :
				// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:1:59: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 11 :
				// /home/florian/Documents/TN/2A/p_compil/Projet/labbaize1u/entrainement_AST/Expr.g:1:67: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
