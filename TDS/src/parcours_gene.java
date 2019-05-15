
package parcours;

import java.util.ArrayList;

import javax.lang.model.util.ElementScanner6;

import org.antlr.runtime.tree.*;
import java.lang.*;
import decs.*;
import excepts.*;
import writefile.Writer;


public class parcours_gene {

    int nb;
    String ID;
    ArrayList<Attribute> temporaire;
    ArrayList<Tree> treetemporaire;
    Type typetemp;
    boolean errormessage;
    PileRegionOuvert stack1;
    Writer wr;

    //passage d'information entre appel recursif
    String variabletemp = null;
    int deplacementtempo = 0;

    Var variable = null;
    Var fcttemp = null;
    Argumenttemp argfunc = null;

    String dernierregistre = null;
    
   
    public parcours_gene(PileRegionOuvert stack){
        this.stack1 = stack;
        this.wr = new Writer("../../test_ASS.src");
        this.wr.initialiseWriter();
        this.wr.newEnvironment();
    }

    public void generate() {
        this.wr.end();
        this.wr.functionBlock();
        this.wr.primitivFuntion();
        //this.wr.generate();
    }



        public String passageRecursif_gene(Tree tree){

            
            String sttype;
            String DataType;
            String returnd;
            Type typeint;
            Type type;
            int size_array;
            String valeur;
            ArrayList<Tree> children = new ArrayList<Tree>(tree.getChildCount()); 
            String returnString = null;








            //System.out.println("Node is : "+ tree.getText());

            switch (tree.getText()) {

                case "ROOT" :
                    for (int i = 0; i < tree.getChildCount(); i++) {
                        
                        passageRecursif_gene( tree.getChild(i));
                        
                    }

                break;

                case "LET":  
                
                    for (int i = 0; i < tree.getChildCount(); i++) {
                             passageRecursif_gene( tree.getChild(i));

                    }
                    
                break;

                case "END":
                
                break;

                case "IN":                                                   //System.out.println("ajout " + tree.getChild(i).getChild(0).getText());


                   
                    
                break;
                
                case "VARDEC": // on a besoin de recupérer son nom de variable, sa valeur, son déplacement, son chainage
                    this.variabletemp  = passageRecursif_gene(tree)  ;
                    //faire la fonction de recup chainage statique                                                  
                   
                    //On doit trouver la source de la string...
                    //this.wr.declareString("Hello World!","S1");
                    if ( tree.getChildCount() == 3){
                        passageRecursif_gene(tree.getChild(2));        
                    }
                    else if( tree.getChildCount() == 2) {
                        passageRecursif_gene(tree.getChild(1));     
                    }

                break;

                case "VARSIMPLE":

                    variable = stack1.recupVar(this.variabletemp);
                    //int deplacementremp = variable.getShift();
                    int chainage = 0;   ///////////////////////////////////////a faire

                    returnString = passageRecursif_gene(tree.getChild(0));  
                    if (variable.getType() instanceof TypePrimitiv){
                        if(variable.getType().getName().equals("String")){
                            wr.writeVariableString(variable.getShift(), returnString);
                        }
                        else if(variable.getType().getName().equals("int")){
                            wr.writeVariableInt(variable.getShift(), returnString);
                        }
                    }
                    
                    

                break;

                default:

                    if((tree.getText()).charAt(0)=='\"'){
                        returnString = tree.getText();
                        
                    }
                    else{

                        returnString = tree.getText();
                        
                        /*
                        try{
                            Integer.parseInt(tree.getText());

                            returString = ""+ tree.getText();
                        }
                        catch(NumberFormatException a){
                            if(stack1.searchType(tree.getText())){
                                //returnString = null
                            }
                            

                        }
                        */
                    }

                break;
                    
                    
                    
                case "VARARRAYDEC":
                    
                    //

                break;
                    

                case "VARRECORD":

                    variable = stack1.recupVar(this.variabletemp);
                    //int deplacementremp = variable.getShift();
                    //int chainage = 0;   ///////////////////////////////////////a faire

                    for(int i = 1; i< tree.getChildCount(); i++ ){

                        
                        returnString = passageRecursif_gene(tree.getChild(i));
                        if(returnString != null){
                            if (variable instanceof VarRecord){
                                for (Parameter par : ((VarRecord)variable).getParameters()) {
                                    
                                    if (par.getName().equals(tree.getChild(i).getChild(0).getText())){
                                        if (par.getType() instanceof TypePrimitiv){

                                            if(par.getType().getName().equals("String")){
                                                wr.writeVariableString(variable.getShift()+par.getShift(), returnString);
                                            }
                                            else if(par.getType().getName().equals("int")){
                                                wr.writeVariableInt(variable.getShift()+par.getShift(), returnString);
                                            }
                                        }
                                    }
                                }
                            }

                            
                        }  
                        

                                
                    }

                    returnString = null;


                break;
    
                case "AFFECTATT" :
                    
                    if(tree.getChild(0).getText().equals("VARRECORD")){
                        passageRecursif_gene(tree.getChild(0));   
                    }
                    else{
                        returnString = passageRecursif_gene(tree.getChild(2));
                    }

                    
                break;

                case ":=" :  

                        
                        this.variabletemp= passageRecursif_gene(tree.getChild(1));  //peut etre une variable
                        if(tree.getChild(0).equals("ATTRIBUTAFFECT")){
                            passageRecursif_gene(tree.getChild(0));
                        }
                        //////////////////////////////// else if addition soustraction
                        else{
                            variable = stack1.recupVar(passageRecursif_gene(tree.getChild(0)));
                            if (variable.getType() instanceof TypePrimitiv){

                                if(variable.getType().getName().equals("String")){
                                    wr.writeVariableString(variable.getShift(), this.variabletemp );
                                }
                                else if(variable.getType().getName().equals("int")){
                                    wr.writeVariableInt(variable.getShift(), this.variabletemp);
                                }
                            }

                            else if (variable.getType() instanceof TypeRecord){

                            }
                        }

                break;

                case "ATTRIBUTAFFECT" :

                    if(tree.getParent().getText().equals("ARG")){
                        variable = stack1.recupVar(passageRecursif_gene(tree.getChild(0)));
                        chainage = 0; // a calculer
                        if (variable instanceof VarRecord){
                            for (Parameter par : ((VarRecord)variable).getParameters()) {
                                
                                if (par.getName().equals(passageRecursif_gene(tree.getChild(1)))){
                                    if (par.getType() instanceof TypePrimitiv){

                                        wr.copyValue(this.deplacementtempo,0, variable.getShift() + par.getShift(), chainage);

                                        /*
                                        if(par.getType().getName().equals("String")){
                                            //wr.writeVariableString(variable.getShift()+par.getShift(), this.variabletemp, chainage);
                                            //copy de valeur
                                        }
                                        else if(par.getType().getName().equals("int")){
                                            //wr.writeVariableInt(variable.getShift()+par.getShift(), this.variabletemp, chainage);
                                            //copy de valeur
                                        }
                                        */
                                    }
                                }
                            }
                        }
                    }
                    else if(tree.getParent().getText().equals(":=")) {
                        variable = stack1.recupVar(passageRecursif_gene(tree.getChild(0)));
                        chainage = 0; // a calculer
                        if (variable instanceof VarRecord){
                            for (Parameter par : ((VarRecord)variable).getParameters()) {
                                
                                if (par.getName().equals(passageRecursif_gene(tree.getChild(1)))){
                                    if (par.getType() instanceof TypePrimitiv){

                                        if(par.getType().getName().equals("String")){
                                            wr.writeVariableString(variable.getShift()+par.getShift(), this.variabletemp, chainage);
                                        }
                                        else if(par.getType().getName().equals("int")){
                                            wr.writeVariableInt(variable.getShift()+par.getShift(), this.variabletemp, chainage);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    


                break;
    
                    


                case "DO" :
                case "THEN" :
                case "ELSE":
                case "BLOCK" :
                    for(int i = 0; i< tree.getChildCount(); i++ ){
                         passageRecursif_gene(tree.getChild(i));
                    }

                break;


            
                

                case "/" : 

                     
                     passageRecursif_gene(tree.getChild(0));
                     passageRecursif_gene(tree.getChild(1));
                          
                    break;


                case  "*" :
                case "+" :
                case "-" :
                case "<=" :
                case ">=" :
                case ">" : 
                case "<" :
                case "=" : 
                case "<>" : 

                    
                   passageRecursif_gene(tree.getChild(0));
                   passageRecursif_gene(tree.getChild(1));
                    

                break;

                case "WHILE" :

                    passageRecursif_gene(tree.getChild(0));
                   passageRecursif_gene(tree.getChild(1));
                break;

                case "IF" :
                    passageRecursif_gene(tree.getChild(0)); 
                   passageRecursif_gene(tree.getChild(1));

                    if (tree.getChildCount()==3){
                        passageRecursif_gene(tree.getChild(2)); 
                    }
                break;

                case "COND" :  

                     passageRecursif_gene(tree.getChild(0));

                break;

                case "FOR" :
                    passageRecursif_gene(tree.getChild(0));
                    passageRecursif_gene(tree.getChild(1));
                break;

                case "ITERATION" :
                    passageRecursif_gene(tree.getChild(0));
                    passageRecursif_gene(tree.getChild(1));
                    passageRecursif_gene(tree.getChild(2));
                     
                break;

                case "CALLFUN" :

                    this.argfunc = new Argumenttemp();

                    this.variabletemp = tree.getChild(0).getText();
                    this.fcttemp = stack1.recupVar(this.variabletemp);
                    
                    if(tree.getChildCount()>0)
                        passageRecursif_gene(tree.getChild(1));
                    

                    if(tree.getChild(0).getText()=="print"){
                        Var variableaprint  = stack1.recupVar(tree.getChild(1).getChild(0).getText()) ;                                                  
                        int deplacementprint = variableaprint.getShift();
                        int chainageprint = 0;
                        //écrire le code de flo sur le fichier.src
                        this.wr.print(0,deplacementprint,"r1");
                    }

                    else if(tree.getChild(0).getText()=="printi"){
                        //écrire le code de flo sur le fichier.src 
                    }
                    else {  // création d'un environnnment de fonction
                    //les instruction seront appelés dans les noeuds suivants
                    //return de la fonction dans ro

                    }



                    
                    this.variabletemp = null;
                    this.variable =  null;
                    
                break;

                case "ARG" :

                    variable = stack1.recupVar(this.variabletemp);
                    chainage = 0;
                    if(variable instanceof Function){
                        for(int i = 0; i< tree.getChildCount(); i++ ){
                            if(tree.getChild(i).getText().equals("ATTRIBUTAFFECT")){
                                this.deplacementtempo = variable.getShift()+ ((Function)variable).getParams().get(i).getShift();
                                passageRecursif_gene(tree.getChild(i));
                            }
                            else if(tree.getChild(i).getText().equals("CALLFUNCTION")){
                                this.deplacementtempo = variable.getShift()+ ((Function)variable).getParams().get(i).getShift();
                                passageRecursif_gene(tree.getChild(i));
                                wr.copyfromRegistre(this.deplacementtempo, 0, "R0");
                            }
                            else if(tree.getChild(i).getText().equals("CALLCROCHET")){
                                
                            }
                            
                            else{
                                if((tree.getChild(i).getText()).charAt(0)=='\"'){
                                    wr.writeVariableString(variable.getShift()+ ((Function)variable).getParams().get(i).getShift(), passageRecursif_gene(tree.getChild(i)), chainage);
                                 }
                                 
                                 else{                     
                                     
                                     try{
                                         Integer.parseInt(tree.getChild(i).getText());
                                         wr.writeVariableInt(variable.getShift()+ ((Function)variable).getParams().get(i).getShift(), passageRecursif_gene(tree.getChild(i)), chainage);
                                         
                                     }
                                     catch(NumberFormatException a){
                                         Var test = stack1.recupVar(tree.getChild(i).getText());
                                         chainage = 0 ; //à calculer
                                         
                                         wr.copyValue(variable.getShift()+ ((Function)variable).getParams().get(i).getShift(), 0, test.getShift() , chainage);
                                     }
                                     
                                 }
                            }   
                            
    
                        }
                    }

                    variable = null;
                    this.deplacementtempo =0;
                    
                    
                break;

                case "CALLCROCHET" :
                    passageRecursif_gene(tree.getChild(0)); //type est celui du tableau
                     passageRecursif_gene(tree.getChild(1));
                   
                break;

                case "MOINS_UNAIRE" :

                     
                    passageRecursif_gene(tree.getChild(0));
                       
                    
                break;


            }

            
            
            return returnString;
            



        }

        
}

