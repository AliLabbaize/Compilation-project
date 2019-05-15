//import tds.*;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;
import parserlexer.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
//import org.antlr.v4.runtime.*


public class Test_compil {

    public static void main(String[] args) throws Exception {
        //String test = "let in end";
        
        try{

            String ligne = "";
            String ligne2 = "";
            InputStream flux=new FileInputStream(args[0]); 
            InputStreamReader lecture=new InputStreamReader(flux);
            BufferedReader buff=new BufferedReader(lecture);
            
            while ((ligne2=buff.readLine())!=null){
                //System.out.println(ligne);
                ligne = ligne + ' ' + ligne2;
            }
            buff.close(); 

            InputStream stream = new ByteArrayInputStream(ligne.getBytes(StandardCharsets.UTF_8));
            ANTLRInputStream input = new ANTLRInputStream(stream);
    
            //ANTLRInputStream input = (ANTLRInputStream) "C'est la vie";
            ExprLexer lexer = new ExprLexer(input);
    
    
            CommonTokenStream tokens = new CommonTokenStream(lexer);
    
            ExprParser parser = new ExprParser(tokens);
    
            

            ExprParser.program_return  res = parser.program();
            Tree arbre = (Tree) res.getTree();
            System.out.println(arbre.toStringTree());
        }		
        catch (Exception e){
        System.out.println(e.toString());
        }


        

}

}