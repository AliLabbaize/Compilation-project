
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;
//import parcours.Parcours;
import parcours.PileRegionOuvert;
import parcours.RecursiveParcours;
import parcours.ParcoursII;
import parserlexer.*;
import writefile.*;
import writefile.Writer;

import java.io.*;
import java.nio.charset.StandardCharsets;
//import org.antlr.v4.runtime.*

public class Test_TDS {

    public static void main(String[] args) throws Exception {
        // String test = "let in end";

        try {

            String ligne = "";
            String ligne2 = "";
            InputStream flux = new FileInputStream(args[0]);
            InputStreamReader lecture = new InputStreamReader(flux);
            BufferedReader buff = new BufferedReader(lecture);

            while ((ligne2 = buff.readLine()) != null) {
                // System.out.println(ligne);
                ligne = ligne + ' ' + ligne2;
            }
            buff.close();

            InputStream stream = new ByteArrayInputStream(ligne.getBytes(StandardCharsets.UTF_8));
            ANTLRInputStream input = new ANTLRInputStream(stream);

            // ANTLRInputStream input = (ANTLRInputStream) "C'est la vie";
            ExprLexer lexer = new ExprLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            ExprParser parser = new ExprParser(tokens);

            ExprParser.program_return res = parser.program();
            Tree arbre = (Tree) res.getTree();
            System.out.println(arbre.toStringTree());
            // ParcoursRecursif parcours = new ParcoursRecursif();
            RecursiveParcours parcours = new RecursiveParcours();
            // System.out.println(parcours.nbChild());

            // System.out.println("parcours crée");
            parcours.passageRecursif(arbre);
            parcours.printTDS();
            // System.out.println("taille towrite coucou" +
            // parcours.printTDS().alltable.size());

            // parcours.getTDS().recupVar("b");
            // System.out.println("taille towrite zfzfezfa" +
            // parcours.printTDS().recupVar("b", 1).getSize());

            ParcoursII parcoursg = new ParcoursII(parcours.getTDS());

            if (parcours.getErrorSemantic()) {
                parcoursg.passageRecursif_gene(arbre);

                parcoursg.generate();
            }

            /*
             * Writer wr = new Writer("../test_ASS.src"); wr.initialiseWriter();
             * wr.newEnvironment(); wr.declareString("Hello World","S1");
             * wr.print(0,-2,"r1"); wr.end(); wr.functionBlock(); wr.primitivFuntion();
             * wr.generate();
             */
        }

        catch (Exception e) {
            System.out.println(e.toString());
        }

    }

}
