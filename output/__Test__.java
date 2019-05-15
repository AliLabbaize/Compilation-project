import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        ExprLexer lex = new ExprLexer(new ANTLRFileStream("/home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/TDS/src/success/draft.tig", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        ExprParser g = new ExprParser(tokens, 49100, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}