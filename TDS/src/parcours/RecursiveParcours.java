package parcours;

import java.util.ArrayList;

import org.antlr.runtime.tree.*;
import java.lang.*;
import decs.*;
import excepts.*;

public class RecursiveParcours {

    int nb;

    String ID;
    PileRegionOuvert stack;
    int deplacement;
    int deplacement_relatif;
    Function fct;
    Type typefct;
    Type typeInteger;
    Type typeBoolean;
    Type typeString;
    Type typeDouble;
    ArrayList<Attribute> temporaire;
    ArrayList<Tree> treetemporaire;
    controlesSemantic cr;
    Type typetemp;
    boolean errormessage;
    boolean errorSemantic = true;
    int numalias;

    public RecursiveParcours() {

        // Initialisation :

        this.stack = new PileRegionOuvert();
        this.deplacement = 0;

        // Declaration des types primitifs :

        this.typefct = new TypeFunction();
        this.typeInteger = new TypePrimitiv("int", 2);
        this.typeBoolean = new TypePrimitiv("boolean", 2);
        this.typeString = new TypePrimitiv("String", 2);
        // this.typeDouble = new TypePrimitiv("double", 1);

        // Ajout des types primitifs à la TDS :

        stack.newTDS(this.deplacement, null);
        stack.current().addTableType(typefct);
        stack.current().addTableType(typeBoolean);
        stack.current().addTableType(typeInteger);
        stack.current().addTableType(typeString);
        // stack.current().addTableType( typeDouble );

        // Initialisation des attributs utiles à la création des fonctions de la
        // librairie standard :

        Attribute s = new Attribute("s", typeString);
        Attribute i = new Attribute("i", typeInteger);
        Attribute f = new Attribute("f", typeInteger);
        Attribute n = new Attribute("n", typeInteger);
        Attribute s1 = new Attribute("s1", typeString);
        Attribute s2 = new Attribute("s2", typeString);

        // Listes de paramètres :

        ArrayList<Attribute> print = new ArrayList<>();
        print.add(s);

        ArrayList<Attribute> printi = new ArrayList<>();
        printi.add(i);

        ArrayList<Attribute> flush = new ArrayList<>();

        ArrayList<Attribute> getchar = new ArrayList<>();

        ArrayList<Attribute> ord = new ArrayList<>();
        ord.add(s);

        ArrayList<Attribute> chr = new ArrayList<>();
        chr.add(i);

        ArrayList<Attribute> size = new ArrayList<>();
        size.add(s);

        ArrayList<Attribute> substring = new ArrayList<>();
        substring.add(s);
        substring.add(f);
        substring.add(n);

        ArrayList<Attribute> concat = new ArrayList<>();
        concat.add(s1);
        concat.add(s2);

        ArrayList<Attribute> not = new ArrayList<>();
        not.add(i);

        ArrayList<Attribute> exit = new ArrayList<>();
        exit.add(i);

        // Ajout des fonctions de la librairie standard à la TDS :

        stack.current().addTableTDS(new Function("print", "print_", typefct, print));
        stack.current().addTableTDS(new Function("printi", "printi_", typefct, printi));
        stack.current().addTableTDS(new Function("flush", "flush_", typefct, flush));
        stack.current().addTableTDS(new Function("getchar", typeString, "getchar_", typefct, getchar));
        stack.current().addTableTDS(new Function("ord", typeInteger, "ord_", typefct, ord));
        stack.current().addTableTDS(new Function("chr", typeString, "chr_", typefct, chr));
        stack.current().addTableTDS(new Function("size", typeInteger, "size_", typefct, size));
        stack.current().addTableTDS(new Function("substring", typeString, "substring_", typefct, substring));
        stack.current().addTableTDS(new Function("concat", typeString, "concat_", typefct, concat));
        stack.current().addTableTDS(new Function("not", typeInteger, "not_", typefct, not));
        stack.current().addTableTDS(new Function("exit", "exit_", typefct, exit));

        // Dernière initialistation pour le constructeur :

        this.cr = new controlesSemantic(stack);
        this.temporaire = new ArrayList<>();
        this.treetemporaire = new ArrayList<>();

        // Test d'initialisation :

        // stack.PrintAllTable();

    }

    public PileRegionOuvert getTDS() {
        return this.stack;
    }

    public Type passageRecursif(Tree tree) {

        String sttype;
        String DataType;
        String returnd;
        Type typeint;
        Type type;
        int size_array;
        String valeur;
        ArrayList<Tree> children = new ArrayList<Tree>(tree.getChildCount());

        type = null;

        // System.out.println("Node is : "+ tree.getText());

        switch (tree.getText()) {

        case "ROOT":
            for (int i = 0; i < tree.getChildCount(); i++) {

                passageRecursif(tree.getChild(i));

            }

            break;

        case "LET":

            for (int i = 0; i < tree.getChildCount(); i++) {

                if (tree.getChild(i).getText().equals("TYPEDEC")) {

                    this.errormessage = false;
                    // && passageRecursif( tree.getChild(i+1))==null && passageRecursif(
                    // tree.getChild(i+2))==null
                    /*
                     * if(passageRecursif( tree.getChild(i))==null && i+1<tree.getChildCount() &&
                     * tree.getChild(i+1).getText().equals("TYPEDEC")&& passageRecursif(
                     * tree.getChild(i+1))==null){ if(passageRecursif( tree.getChild(i+1))==null &&
                     * i+2<tree.getChildCount() && tree.getChild(i+2).getText().equals("TYPEDEC")&&
                     * passageRecursif( tree.getChild(i+2))==null ){ passageRecursif(
                     * tree.getChild(i+1)) ; i++; } else if(passageRecursif(
                     * tree.getChild(i+1))==null && i+2<tree.getChildCount() &&
                     * tree.getChild(i+2).getText().equals("TYPEDEC")&& passageRecursif(
                     * tree.getChild(i+2))==null ){ passageRecursif( tree.getChild(i)) ; i++; }
                     * passageRecursif( tree.getChild(i-1)) ; i++;
                     * 
                     * System.out.println("Haaaaa  haaaaa haaaa"); }; this.errormessage = true;
                     */
                    Type typo = passageRecursif(tree.getChild(i));

                    if (typo == null && i + 1 < tree.getChildCount()
                            && tree.getChild(i + 1).getText().equals("TYPEDEC")) {
                        this.treetemporaire.add(tree.getChild(i));
                        // System.out.println("ajout " + tree.getChild(i).getChild(0).getText());

                    } else if (typo != null) {
                        Tree temp = null;
                        for (Tree var : this.treetemporaire) {

                            if (passageRecursif(var) != null) {
                                temp = var;

                            }
                        }

                        this.treetemporaire.remove(temp);
                        // System.out.println("je repassssseeeeee ");
                    }

                    this.errormessage = true;
                } else {
                    passageRecursif(tree.getChild(i));
                }

            }

            break;

        case "END":

            break;

        case "IN":

            for (int i = 0; i < tree.getChildCount(); i++) {

                passageRecursif(tree.getChild(i));
            }

            break;

        case "VARDEC":
            this.ID = tree.getChild(0).getText();
            this.typetemp = null;
            if (tree.getChildCount() == 3) {

                // System.out.println(tree.getChild(2).getText());
                if (stack.searchType(tree.getChild(1).getText())) {
                    type = stack.recupType(tree.getChild(1).getText());
                    this.typetemp = type;

                    passageRecursif(tree.getChild(2));

                } else {
                    System.out.println("ligne : " + tree.getLine() + " --> " + "InvalidTYPEfindException :  "
                            + " for variable " + ID + " , the type " + tree.getChild(1).getText() + " not found ");
                    errorSemantic = false;
                }

            } else {
                // System.out.println(tree.getChild(1).getText());
                type = passageRecursif(tree.getChild(1));
            }

            break;

        case "VARARRAYDEC":
            sttype = tree.getChild(0).getText(); // on recupére l'object type en fct du nom
                                                 // à améliorer avec une creuse sur le renommage après la soutenance

            if (stack.searchType(sttype) == true) {
                type = stack.recupType(sttype); // tester le type
                // String valeur = child.getChild(2).getText();
                VarArray table;
                try {
                    // if(passageRecursif(tree.getChild(1)))
                    // size_array = 10;

                    size_array = Integer.parseInt(tree.getChild(1).getText());

                    table = new VarArray(ID, type, size_array, deplacement_relatif - type.getSize());

                } catch (NumberFormatException a) {
                    table = new VarArray(ID, type, 1, deplacement_relatif - type.getSize()); // je mets une taille
                                                                                             // standart de 1
                }
                stack.current().addTableTDS(table);

                deplacement_relatif = deplacement_relatif - table.getSize();

            } else {
                System.out.println("ligne : " + tree.getLine() + " --> " + "InvalidARRAYtypefindException :  " + "type "
                        + sttype + " not found or is not compatible with the constructer");
                errorSemantic = false;

            }

            break;

        case "VARRECORD":
            sttype = tree.getChild(0).getText();
            // à améliorer avec une creuse sur le renommage après la soutenance
            if (stack.searchType(sttype) == true /* sttype.equals(tree.getParent().getChild(1).getText() */) {

                this.typetemp = stack.recupType(sttype);

                if (this.typetemp instanceof TypeRecord) {

                    for (int i = 1; i < tree.getChildCount(); i++) {

                        passageRecursif(tree.getChild(i));

                    }

                }

              //  System.out.println("bbbbbbbbb" + this.typetemp.getSize() + "et ensuite" + deplacement_relatif);
                VarRecord vr = new VarRecord(ID, this.typetemp, this.temporaire,
                        deplacement_relatif - this.typetemp.getSize()); // - this.typetemp.getSize())
                // System.out.println("allo");
                deplacement_relatif = deplacement_relatif - vr.getSize();
                this.temporaire.clear();
                stack.current().addTableTDS(vr);

                type = vr.getType();

            } else {
                System.out.println("ligne : " + tree.getLine() + " --> " + "InvalidRECORDtypefindException :  "
                        + "error this type of record " + sttype + " does not exist ");
                errorSemantic = false;

            }
            break;

        case "AFFECTATT":
            if (tree.getChild(0).getText().equals("VARRECORD")) {
                type = passageRecursif(tree.getChild(0));

            } else {

                if (((TypeRecord) this.typetemp).searchAtt(tree.getChild(0).getText())) {
                    Attribute p = ((TypeRecord) this.typetemp).recupAtt(tree.getChild(0).getText());
                    // System.out.println("allo");

                    this.temporaire.add(p);
                    type = p.getType();
                    // System.out.println("aaaaaaaaaaaaaaaaa"+p.getName());
                } else {
                    System.out.println("ligne : " + tree.getLine() + " --> " + "InvalidRECORDattributException :  "
                            + "VARRECORD : error ATTRIBUT " + tree.getChild(0).getText() + " does not exist in RECORD "
                            + ID);
                    errorSemantic = false;

                }

            }

            break;

        case "VARSIMPLE":

            if (this.typetemp == null) { // cas d'inférence

                type = passageRecursif(tree.getChild(0));
                // System.out.println(type.toString());
            } else { // cas de déclaration dy type explicite
                     // controle sémantique entre type et passageRecursif(tree.getChild(0)) (mais on
                     // laissera la variable déclaré du type explicite )
                try {
                    cr.compareType(this.typetemp, passageRecursif(tree.getChild(0)));
                    type = this.typetemp;
                } catch (CompareTypeException e) {
                    System.out.println("ligne : " + tree.getLine() + " --> " + "CompareTypeException :  INITIALISATION "
                            + e.getMessage());
                    type = this.typetemp;
                    errorSemantic = false;

                }
            }

            // System.out.println(this.typetemp.toString());

            VarSimple v = new VarSimple(ID, type, deplacement_relatif - type.getSize());
            stack.current().addTableTDS(v);

            deplacement_relatif = deplacement_relatif - v.getSize();

            type = v.getType();

            break;

        default:
            // System.out.print("default \n");
            if ((tree.getText()).charAt(0) == '\"') {
                type = typeString;

            } else {
                try {
                    Integer.parseInt(tree.getText());

                    type = typeInteger;
                } catch (NumberFormatException a) {
                    if (stack.searchType(tree.getText())) {
                        type = stack.recupType(tree.getText());
                    } else if (stack.searchVar(tree.getText())) {
                        type = stack.recupVar(tree.getText()).getType();
                    } else {
                        System.out.println("ligne : " + tree.getLine() + " --> " + "InvalidTYPEVARfindException :  "
                                + " error type or var does not exist " + tree.getText());
                        errorSemantic = false;

                    }
                    // recup variable avant ou type rename ??
                    // System.out.println( a.getMessage());

                }

            }

            break;

        case "TYPEDEC":

            this.ID = tree.getChild(0).getText();

            try {
                // System.out.println("l'ID est"+ this.ID);
                cr.sameNameTypes(this.ID);
                type = passageRecursif(tree.getChild(1));
            } catch (SameNameException e) {
                System.out.println("ligne : " + tree.getLine() + " --> " + "SameNameException : TYPE = " + this.ID + " "
                        + e.getMessage());
                errorSemantic = false;

            }

            break;

        case "TYPEARRAYDEC":

            String typetxt = tree.getChild(0).getText();
            // System.out.println("babarrrrr" + typetxt);
            if (stack.searchType(ID) == false) {
                if (stack.searchType(typetxt) == true) {
                    Type type_int = stack.recupType(typetxt);
                    type = new TypeArray(ID, type_int);
                    stack.current().addTableType(new TypeArray(ID, type_int));
                    // System.out.println("ARRAY type ajoute");
                } else {
                    if (this.errormessage) {
                        System.out.println("ligne : " + tree.getLine() + " --> " + "InvalidARRAYtypeException :  "
                                + " Interne type does not exist"); // le nom du type existe déjà
                        errorSemantic = false;
                    }
                }
            }

            break;

        case "ATTRIBUT":
            for (int i = 0; i < tree.getChildCount(); i++) {
                passageRecursif(tree.getChild(i));
            }

            TypeRecord tr = new TypeRecord(this.ID, temporaire);

            temporaire.clear();
            stack.current().addTableType(tr);
            type = tr;
            break;

        case "ARGDEC":
            sttype = tree.getChild(1).getText();
            if (stack.searchType(sttype) == true) {
                type = stack.recupType(sttype);

                Attribute p = new Attribute(tree.getChild(0).getText(), type);

                temporaire.add(p);
                // System.out.println("aa"+p.getName());

            } else {
                if (this.errormessage) {
                    System.out.println("ligne : " + tree.getLine() + " --> " + "InvalidTYPEargdecException :  "
                            + "This type " + sttype + " does not exist ");
                    errorSemantic = false;

                }
            }

            break;

        case "TYPERENAME":
            sttype = tree.getChild(0).getText();
            if (stack.searchType(sttype) == true) {
                type = stack.recupType(sttype);
                type = new TypeRename(ID, type);
                stack.current().addTableType(type);
            } else {
                if (this.errormessage) {
                    System.out.println("ligne : " + tree.getLine() + " --> " + "InvalidTYPErenameException :  "
                            + "This type " + sttype + " does not exist ");
                    errorSemantic = false;
                }
            }
            break;

        case "FUNCDEC":
            this.numalias++;
            ID = tree.getChild(0).getText();

            int deplacmentsauv = this.deplacement_relatif;

            this.deplacement_relatif = 0;

            if (tree.getChildCount() == 4) {

                for (int i = 0; i < tree.getChild(1).getChildCount(); i++) {

                    this.deplacement += passageRecursif(tree.getChild(1).getChild(i)).getSize();
                    /*
                     * type = stack.recupType(child.getChild(1).getChild(i).getChild(1).getText());
                     * System.out.println(type.getName()); Attribute p =new
                     * Attribute(child.getChild(1).getChild(i).getChild(0).getText(), type);
                     * temporaire.add(p); this.deplacement += p.getType().getSize();
                     */
                }

                // J'ai choisi de faire en sorte que la fonction soit créée même si le return
                // n'est pas bon. Votre avis ?

                returnd = tree.getChild(3).getChild(0).getText();
                System.out.println("test");
                if (stack.searchType(returnd) == true) {
                    type = stack.recupType(returnd);
                    fct = new Function(ID, type, ID + "_" + this.numalias, typefct, temporaire);
                } else {
                    fct = new Function(ID, ID + "_" + this.numalias, typefct, temporaire);
                    System.out.println("ligne : " + tree.getLine() + " --> " + "InvalidFUNCTIONTYPEreturnException :  "
                            + "Return type " + returnd + "at function" + ID + " does not exist ");
                    errorSemantic = false;

                }

                temporaire.clear();
                // System.out.println(fct.getName());
                type = fct.getType();
            } else if (tree.getChildCount() == 3) {

                for (int i = 0; i < tree.getChild(1).getChildCount(); i++) {
                    this.deplacement += passageRecursif(tree.getChild(1).getChild(i)).getSize();
                    /*
                     * type = stack.recupType(tree.getChild(1).getChild(i).getChild(1).getText());
                     * ///////////////////////////////////////////////////
                     * System.out.println(type.getName()); Attribute p =new
                     * Attribute(tree.getChild(1).getChild(i).getChild(0).getText(), type);
                     * 
                     * temporaire.add(p); this.deplacement += p.getType().getSize();
                     */
                }

                fct = new Function(ID, ID + "_" + this.numalias, typefct, temporaire);
                temporaire.clear();
                type = fct.getType();

            }

            // System.out.println(fct.getName());
            stack.current().addTableTDS(fct);

            stack.newTDS(this.deplacement, stack.current());

            // Ajout des paramètres de la fonction au nouvel environnement.

            ArrayList<Var> tmp = fct.getVar();

            for (Var i : tmp) {

                stack.current().addTableTDS(i);

            }

            passageRecursif(tree.getChild(2));

            this.deplacement_relatif = deplacmentsauv;
            stack.depileTDS();
            break;

        case "DO":
        case "THEN":
        case "ELSE":
        case "BLOCK":
            for (int i = 0; i < tree.getChildCount(); i++) {
                type = passageRecursif(tree.getChild(i));
            }

            break;

        case ":=":
            //System.out.println("la ligne est " + tree.getLine() + " sur le noeud" + tree.getText());
            try {
                Type type1 = passageRecursif(tree.getChild(0));// stack.recupVar(tree.getChild(0).getText());
                // System.out.println("type 1 "+type1.getName());
                type = passageRecursif(tree.getChild(1));
                // System.out.println("type 2 "+type.getName());

                if (type == null || type1 == null) {

                    break;
                }
                cr.compareType(type1, type);
                // type = typeInteger;
                // passageRecursif(tree.getChild(1));

            } catch (CompareTypeException e) {
                System.out.println(
                        "ligne : " + tree.getLine() + " --> " + "CompareTypeException : AFFECTATION " + e.getMessage());
                errorSemantic = false;

            }

            break;

        case "/":
            try {
                cr.checkZero(tree.getChild(1).getText());
            } catch (ZeroException e) {
                System.out.println(e.getMessage());
                errorSemantic = false;

            } finally {
                passageRecursif(tree.getChild(0));
            }
            try {
                Type tp1 = passageRecursif(tree.getChild(0));
                Type tp2 = passageRecursif(tree.getChild(1));
                if (tp1 == null || tp2 == null) {
                    break;
                }
                cr.checkExpression(tp1, tp2);
                type = typeInteger;
            } catch (InvalidOperationException e) {
                System.out.println(e.getMessage());
                errorSemantic = false;

            }
            break;

        case "*":
        case "+":
        case "-":
        case "<=":
        case ">=":
        case ">":
        case "<":
        case "=":
        case "<>":
        case "&":
        case "|":
            try {

                Type tp1 = passageRecursif(tree.getChild(0));
                Type tp2 = passageRecursif(tree.getChild(1));
                if (tp1 == null || tp2 == null) {
                    break;
                }
                cr.checkExpression(tp1, tp2);
                type = typeInteger;
            } catch (InvalidOperationException e) {
                System.out.println(
                        "ligne : " + tree.getLine() + " --> " + "InvalidOperationException :  " + e.getMessage());
                errorSemantic = false;

            }

            break;

        case "WHILE":
            // condition //controle sémantique sur le type (qui doit être int 1 ou 0)
            try {
                cr.compareType(typeInteger, passageRecursif(tree.getChild(0)));
            } catch (CompareTypeException e) {
                System.out.println("ligne : " + tree.getLine() + " --> "
                        + "InvalidWHILEstructureException :  La condition doit être 0 ou 1");
                errorSemantic = false;

            }

            // block
            type = passageRecursif(tree.getChild(1));
            break;

        case "IF":
            // condition //controle sémantique sur le type (qui doit être int 1 ou 0)
            try {
                cr.compareType(typeInteger, passageRecursif(tree.getChild(0)));
            } catch (CompareTypeException e) {
                System.out.println("ligne : " + tree.getLine() + " --> "
                        + "InvalidIFstructureException :  La condition doit être 0 ou 1");
                errorSemantic = false;

            }

            // block=then
            Type tp12 = passageRecursif(tree.getChild(1));

            // block=else
            if (tree.getChildCount() == 3) {
                try {
                    cr.compareType(tp12, passageRecursif(tree.getChild(2)));
                } catch (CompareTypeException e) {
                    System.out.println("ligne : " + tree.getLine() + " --> "
                            + "InvalidIFELSEstructure :  types de then et else differ");
                    errorSemantic = false;

                }
            }
            break;

        case "COND":

            type = passageRecursif(tree.getChild(0));

            break;

        case "FOR":
            passageRecursif(tree.getChild(0));
            type = passageRecursif(tree.getChild(1));
            break;

        case "ITERATION":
            int borneinf = 0;
            int bornesup = 0;
            try {
                cr.compareType(typeInteger, passageRecursif(tree.getChild(0)));
            } catch (CompareTypeException e) {
                System.out.println("ligne : " + tree.getLine() + " --> "
                        + "InvalidFORstructureException :  le compteure n'est pas un int");
            }
            try {
                cr.compareType(typeInteger, passageRecursif(tree.getChild(1)));
                borneinf = 1;
            } catch (CompareTypeException e) {
                System.out.println("ligne : " + tree.getLine() + " --> "
                        + "InvalidFORstructureException :  La borne inférieure de la boucle n'est pas un int");
                errorSemantic = false;

            }
            try {
                cr.compareType(typeInteger, passageRecursif(tree.getChild(2)));
                bornesup = 1;

            } catch (CompareTypeException e) {
                System.out.println("ligne : " + tree.getLine() + " --> "
                        + "InvalidFORstructureException :  la borne supérieur de la boucle n'est pas un int");
                errorSemantic = false;

            }
            if (borneinf == 1 && bornesup == 1) {
                if (Integer.parseInt(tree.getChild(2).getText()) < Integer.parseInt(tree.getChild(1).getText())) {
                    System.out.println("ligne : " + tree.getLine() + " --> "
                            + "InvalidFORbornesException :  la borne supérieur < borne inférieur");
                    errorSemantic = false;

                }
            }

            break;

        case "CALLFUN":
            this.typetemp = passageRecursif(tree.getChild(0)); // verifier si bien un type si bien un type fonction

            if (this.typetemp instanceof TypeFunction) {
                Function fct = (Function) stack.recupVar(tree.getChild(0).getText()); // on est deja sur que la var
                                                                                      // existe car retrouvée par la fct
                                                                                      // récurvive 2 lignes au dessus
                type = fct.getTypeReturn();
                fct.addShift(this.deplacement_relatif);
                // Vérifier qu'il y a autant d'argument que la fct le demande
                if (fct.getParams().size() == tree.getChild(1).getChildCount()) {
                    for (int i = 0; i < tree.getChild(1).getChildCount(); i++) {

                        try {
                            cr.compareType(passageRecursif(tree.getChild(1).getChild(i)),
                                    fct.getParams().get(i).getType());

                        } catch (CompareTypeException e) {
                            System.out.println("ligne : " + tree.getLine() + " --> "
                                    + "InvalidFUNCTIONargumentsException :  le type des arguments n'est pas compatible avec la définition de la fonction");
                        }
                    }
                } else {
                    System.out.println("ligne  : " + tree.getLine() + " --> " + "InvalidFunctionargumentsException :  "
                            + "The call of the function  " + tree.getChild(0).getText()
                            + " does not containt enough arguments or take a lot of them ");

                    errorSemantic = false;
                }

            } else {
                System.out.println("ligne  : " + tree.getLine() + " --> " + "InvalidFunctiondeclarationException :  "
                        + "The call of the function  " + tree.getChild(0).getText()
                        + " does not exist or is not implemented  ");
                errorSemantic = false;

            }

            break;

        case "ARG":
            type = passageRecursif(tree.getChild(0));
            break;

        case "CALLCROCHET":
             // type est celui du tableau
             type = passageRecursif(tree.getChild(0));

            if (type instanceof TypeArray) {
                VarArray tab = (VarArray) stack.recupVar(tree.getChild(0).getText());

                if (stack.recupVar(tree.getChild(1).getText()) == null) {

                    try {
                        int number_array = Integer.parseInt(tree.getChild(1).getText());

                        if ((tab.getNumberElement() <= number_array)) {
                            System.out.println("ligne  : " + tree.getLine() + " --> "
                                    + "InvalidARRAYlengthException :  out of range dans l'array");
                            errorSemantic = false;

                        } // en gros fct sémantique qui vérife que c'est bien inférieur

                    } catch (NumberFormatException a) {

                        System.out.println("ligne  : " + tree.getLine() + " --> "
                                + "InvalidARRAYlengthException :  L'indice doit être un nombre");
                        errorSemantic = false;

                    }
                } else {
                    if (stack.recupVar(tree.getChild(1).getText()).getType().getName().equals("int")) {
                        // l'érror
                    }
                }
            } else {
                System.out.println("ligne  : " + tree.getLine() + " --> " + "InvalidARRAYCallException :" + this.ID
                        + "  does not a array");
                errorSemantic = false;

            }
            //type = 
            passageRecursif(tree.getChild(1));
            type = ((TypeArray)type).getTypeIntern();

            break;

        case "ATTRIBUTAFFECT":

            type = passageRecursif(tree.getChild(0));
            if (type instanceof TypeRecord) {

                if (((TypeRecord) type).searchAtt(tree.getChild(1).getText())) {
                    type = ((TypeRecord) type).recupAtt(tree.getChild(1).getText()).getType();
                } else {
                    System.out
                            .println("ligne  : " + tree.getLine() + " --> " + "l'argument" + tree.getChild(1).getText()
                                    + " du record " + tree.getChild(0).getText() + " n'existe pas !");
                    errorSemantic = false;

                }
            } else {
                System.out.println("ligne  : " + tree.getLine() + " --> " + " Le record " + tree.getChild(0).getText()
                        + " n'existe pas !");
                errorSemantic = false;

            }

            break;

        case "MOINS_UNAIRE":

            try {
                cr.compareType(typeInteger, passageRecursif(tree.getChild(0)));
                type = typeInteger;
            } catch (CompareTypeException a) {
                System.out.println("ligne  : " + tree.getLine() + " --> " + "InvalidMOINS_UNAIRE :" + this.ID
                        + "  does not a int");
            }

            break;

        }

        return type;

    }

    public boolean getErrorSemantic() {
        return this.errorSemantic;
    }

    public PileRegionOuvert printTDS() {

        stack.PrintAllTable();
       // System.out.println("taille towrite coucou" + stack.alltable.size());
        return this.stack;

    }

}