package parcours;

import java.util.ArrayList;
import org.antlr.runtime.tree.*;
import java.lang.*;
import decs.*;
import excepts.*;
import writefile.Writer;

public class ParcoursII {
    int nb;
    String ID;
    ArrayList<Attribute> temporaire;
    ArrayList<Tree> treetemporaire;
    Type typetemp;
    PileRegionOuvert stack1;
    Writer wr;

    Type typefct;
    Type typeInteger;
    Type typeBoolean;
    Type typeString;
    Type typeDouble;

    // passage d'information recursif
    Var variabletemp = null;
    String dernierregistre = null;
    StructRetour structempo = null;

    StructRetour temp1 = null;
    StructRetour temp2 = null;

    int numenv = 0;
    int numalias = 0;

    int numTable = 0;

    int numaliasbreak = -1; // marchera pas si while imbriqué

    public ParcoursII(PileRegionOuvert stack) {
        this.stack1 = stack;
        this.wr = new Writer("../../test_ASS.src", stack.getNumberofBlock());
        this.wr.initialiseWriter();

        this.typefct = new TypeFunction();
        this.typeInteger = new TypePrimitiv("int", 2);
        this.typeBoolean = new TypePrimitiv("boolean", 2);
        this.typeString = new TypePrimitiv("String", 2);
    }

    public void generate() {
        this.wr.end();
        this.wr.functionBlock();

        this.wr.primitivFuntion();

        this.wr.generate();

    }

    public StructRetour passageRecursif_gene(Tree tree) {


        StructRetour returnSR = null;
        int numaliastemp = -1;

        switch (tree.getText()) {

        case "ROOT":
            for (int i = 0; i < tree.getChildCount(); i++) {

                passageRecursif_gene(tree.getChild(i));

            }

            break;

        case "LET": ////////////////////// PAS BESOIN

            for (int i = 0; i < tree.getChildCount(); i++) {
                passageRecursif_gene(tree.getChild(i));

            }

            break;

        case "END":

            break;

        case "IN":

            for (int i = 0; i < tree.getChildCount(); i++) {

                returnSR = passageRecursif_gene(tree.getChild(i));
            }

            break;

        default:

            if ((tree.getText()).charAt(0) == '\"') {
                returnSR = new StructRetour(tree.getText(), this.typeString);

            } else {
                try {
                    Integer.parseInt(tree.getText());
                    returnSR = new StructRetour(tree.getText(), this.typeInteger);
                } catch (NumberFormatException a) {

                    // System.out.println("testA");
                    returnSR = new StructRetour(stack1.recupVar(tree.getText(), this.numenv).getShift(),
                            stack1.recupImbric(tree.getText(), this.numenv, 0), this.numTable,
                            stack1.recupVar(tree.getText(), this.numenv),
                            stack1.recupVar(tree.getText(), this.numenv).getType());
                    // System.out.println("testB");

                }

            }

            break;

        case "TYPEDEC":

            break;

        case "VARDEC":

            returnSR = passageRecursif_gene(tree.getChild(0));
            this.structempo = returnSR;
            //System.out.println("num env " + this.structempo.getShift());
            if (tree.getChildCount() == 2)
                passageRecursif_gene(tree.getChild(1));
            else if (tree.getChildCount() == 3)
                passageRecursif_gene(tree.getChild(2));

            this.structempo = null;

            break;

        case "VARSIMPLE":

            returnSR = passageRecursif_gene(tree.getChild(0));
            if (returnSR.getValeur() != null) {

                //System.out.println("C'est pas null");
                if (returnSR.getType().getName().equals("int")) {

                    wr.writeVariableInt(this.structempo.getShift(), returnSR.getValeur(), this.numenv);

                    ;
                } else if (returnSR.getType().getName().equals("String")) {
                    this.numalias++;
                    numaliastemp = this.numalias;
                    wr.writeVariableString(this.structempo.getShift(), numaliastemp, returnSR.getValeur(), this.numenv);
                }
            } else {
                wr.copyAnything(this.structempo.getShift(), this.structempo.getNombreChainage(), returnSR.getShift(),
                        returnSR.getNombreChainage(), returnSR.getType().getSize(), this.numenv);
            }

            break;

        case "VARRECORD":

            int rrec = 0;
            wr.sautSP(this.structempo.getVariable().getSize(), this.numenv);

            for (int i = 1; i < tree.getChildCount(); i++) {

                returnSR = passageRecursif_gene(tree.getChild(i));

                if (returnSR.getValeur() != null) {

                    if (returnSR.getType().getName().equals("int")) {
                        wr.copytoRegistre(0, Integer.parseInt(returnSR.getValeur()), this.numenv);
                        wr.copyfromRegistreArg(0, rrec, this.numenv);
                        rrec += returnSR.getType().getSize();
                        ;
                    } else if (returnSR.getType().getName().equals("String")) {
                        this.numalias++;
                        numaliastemp = this.numalias;
                        wr.writeVariableString(numaliastemp, returnSR.getValeur(), this.numenv);
                        wr.copytoRegistreString(0, numaliastemp, this.numenv);

                        wr.copyfromRegistreArg(0, rrec, this.numenv);
                        rrec += returnSR.getType().getSize();
                    }

                } else if (returnSR.getRegistre() != -1) { // operation
                    //System.out.println("le return de registre est");
                    //System.out.println("le return de registre est" + returnSR.getRegistre());
                    wr.copyfromRegistreArg(returnSR.getRegistre(), rrec, this.numenv);
                    rrec += 2;

                } else if (returnSR.getRegistre_Addr() != -1) { // callcrochet
                    //System.out.println("le return de registre est");
                    //System.out.println("le return de registre est" + returnSR.getRegistre());
                    wr.copyFromRegAddrArg(returnSR.getRegistre_Addr(), rrec, returnSR.getType().getSize(),  this.numenv);
                    rrec += returnSR.getType().getSize();

                }else {
                   // System.out.println("le return de registre est");
                    if (returnSR.getType().getName().equals("function")) {
                        wr.copyFromRegAddrArg(0, rrec, ((Function) returnSR.getVariable()).getTypeReturn().getSize(),
                                this.numenv);
                                rrec += ((Function) returnSR.getVariable()).getTypeReturn().getSize();
                    } else {
                        wr.copyArg(rrec, returnSR.getShift(), returnSR.getNombreChainage(), returnSR.getType().getSize(),
                                this.numenv);
                                rrec += returnSR.getType().getSize();
                    }

                }

            }

            break;

        case "AFFECTATT":

            
            returnSR = passageRecursif_gene(tree.getChild(1));

            
            break;

        case "VARARRAYDEC":

            int arr = 0;
            returnSR = passageRecursif_gene(tree.getChild(2));

            wr.sautSP(this.structempo.getVariable().getSize(), this.numenv);

            for (int i = 0; i < ((VarArray) this.structempo.getVariable()).getNumberElement(); i++) {
                if (returnSR.getValeur() != null) {

                    if (returnSR.getType().getName().equals("int")) {
                        wr.copytoRegistre(0, Integer.parseInt(returnSR.getValeur()), this.numenv);
                        wr.copyfromRegistreArg(0, arr, this.numenv);
                        arr += returnSR.getType().getSize();
                        ;
                    } else if (returnSR.getType().getName().equals("String")) {
                        this.numalias++;
                        numaliastemp = this.numalias;
                        wr.writeVariableString(numaliastemp, returnSR.getValeur(), this.numenv);
                        wr.copytoRegistreString(0, numaliastemp, this.numenv);

                        wr.copyfromRegistreArg(0, arr, this.numenv);
                        arr += returnSR.getType().getSize();
                    }
                } else {
                    //System.out.println("le return est :" + returnSR.getShift());

                    if (returnSR.getType().getName().equals("function")) {
                        wr.copyFromRegAddrArg(0, arr, ((Function) returnSR.getVariable()).getTypeReturn().getSize(),
                                this.numenv);
                        arr += ((Function) returnSR.getVariable()).getTypeReturn().getSize();
                    } else {
                        wr.copyArg(arr, returnSR.getShift(), returnSR.getNombreChainage(), returnSR.getType().getSize(),
                                this.numenv);
                        arr += returnSR.getType().getSize();
                    }

                }
            }

            break;

        case "OF":
            returnSR = passageRecursif_gene(tree.getChild(0));
            break;

        case ":=":

            this.structempo = passageRecursif_gene(tree.getChild(0));
            returnSR = passageRecursif_gene(tree.getChild(1));

            
           if(this.structempo.getRegistre_Addr()!= -1){
            if (returnSR.getValeur() != null) {
                if (returnSR.getType().getName().equals("int")) {
                    
                    wr.copyToRegAddrInt(this.structempo.getRegistre_Addr(), returnSR.getValeur(),  this.numenv );
                } else if (returnSR.getType().getName().equals("String")) {
                    this.numalias++;
                    numaliastemp = this.numalias;
                    wr.copyToRegAddrString(numalias, this.structempo.getRegistre_Addr(), returnSR.getValeur(),  this.numenv );
                    
                }
            } else if (returnSR.getRegistre() != -1) { // operation
                wr.copyToRegAddr(this.structempo.getRegistre_Addr(),
                        returnSR.getRegistre(), this.numenv);
            } else if (returnSR.getRegistre_Addr() != -1) { // callcrochet
                wr.copyToRegAddrFromRegAddr(this.structempo.getRegistre_Addr(),
                returnSR.getRegistre_Addr(), this.structempo.getType().getSize(), this.numenv);
            
            } else if (returnSR.getShift() != -1) { // variable

                if (returnSR.getType().getName().equals("function")) {
                    //System.out.println("a  aaaaaaaaaaaaalllllllllllllooooooooooooooo" + this.structempo.getType().getSize());
                            wr.copyToRegAddrFromRegAddr(0,
                            returnSR.getRegistre_Addr(), this.structempo.getType().getSize(), this.numenv);
                    //System.out.println("a  aaaaaaaaaaaaalllllllllllllooooooooooooooo");
                } else {
                    wr.copytoRegistreAddr(this.structempo.getRegistre_Addr(), returnSR.getShift(), returnSR.getNombreChainage(), this.numenv);
                    
                }

            }
        

           }

            else if(this.structempo.getRegistre_Addr()== -1) {
                if (returnSR.getValeur() != null) {
                    if (returnSR.getType().getName().equals("int")) {
                        wr.writeVariableInt(this.structempo.getShift(), returnSR.getValeur(),
                                this.structempo.getNombreChainage(), this.numenv);
                    } else if (returnSR.getType().getName().equals("String")) {
                        this.numalias++;
                        numaliastemp = this.numalias;
                        wr.writeVariableString(numaliastemp, this.structempo.getShift(), returnSR.getValeur(),
                                this.structempo.getShift(), this.numenv);
                    }
                } else if (returnSR.getRegistre() != -1) { // operation
                    wr.copyfromRegistre(this.structempo.getShift(), this.structempo.getNombreChainage(),
                            returnSR.getRegistre(), this.numenv);
                } else if (returnSR.getRegistre_Addr() != -1) { // callcrochet
                    wr.copyFromRegAddr(returnSR.getRegistre_Addr(), this.structempo.getShift(), this.structempo.getNombreChainage(), this.structempo.getType().getSize(),
                                     this.numenv);
                
                } else if (returnSR.getShift() != -1) { // variable

                    if (returnSR.getType().getName().equals("function")) {
                        //System.out.println("a  aaaaaaaaaaaaalllllllllllllooooooooooooooo" + this.structempo.getType().getSize());
                        wr.copyFromRegAddr(0, this.structempo.getShift(), this.structempo.getNombreChainage(),
                                this.structempo.getType().getSize(), this.numenv);
                        //System.out.println("a  aaaaaaaaaaaaalllllllllllllooooooooooooooo");
                    } else {
                        wr.copyAnything(this.structempo.getShift(), this.structempo.getNombreChainage(),
                                returnSR.getShift(), returnSR.getNombreChainage(), this.structempo.getType().getSize(),
                                this.numenv);
                    }

                }
            }

            this.structempo = null;
            break;

        case "ATTRIBUTAFFECT":

            returnSR = passageRecursif_gene(tree.getChild(0));
            for (Parameter par : ((VarRecord) returnSR.getVariable()).getParameters()) {

                if (par.getName().equals(tree.getChild(1).getText())) {
                    returnSR = new StructRetour(returnSR.getShift() + par.getShift(), returnSR.getNombreChainage(),
                            this.numTable, returnSR.getVariable(), par.getType());
                }

            }

            this.structempo = null;
            break;

        case "CALLCROCHET": // return le type intern

            StructRetour struccall = passageRecursif_gene(tree.getChild(0));
            returnSR = passageRecursif_gene(tree.getChild(1));
            
            if (returnSR.getValeur() != null) { 

                //System.out.println("test sur les desplacments de strctcaal"+struccall.getShift());

                int numberintern = Integer.parseInt(returnSR.getValeur()); 
              returnSR = new StructRetour(
             struccall.getShift() + numberintern * ((TypeArray)
             struccall.getVariable().getType()).getTypeIntern().getSize(),
              struccall.getNombreChainage(), struccall.getNumTable(),
              struccall.getVariable(), ((TypeArray)
                struccall.getVariable().getType()).getTypeIntern());
             
             }
             
             
             else if (returnSR.getRegistre() != -1) { // operation 
            // on met dans le registre l'adresse du déplacement 
            // on renvoie le registre contenant
             //l'adresse
             returnSR = new StructRetour(wr.callCrochetOp(((TypeArray)struccall.getVariable().getType()).getTypeIntern().getSize(), struccall.getShift(), struccall.getNombreChainage(), returnSR.getRegistre(), this.numenv), ((TypeArray)
             struccall.getVariable().getType()).getTypeIntern());
             
             //wr.copyfromRegistre(this.structempo.getShift(),
             //this.structempo.getNombreChainage(), returnSR.getRegistre(), this.numenv); //
             
             } else if (returnSR.getShift() != -1) { // variable
             
                if (returnSR.getType().getName().equals("function")) { returnSR = new
                StructRetour(wr.callCrochetFunct(((TypeArray)struccall.getVariable().getType()).getTypeIntern().getSize(),struccall.getShift(), struccall.getNombreChainage(),0, this.numenv), ((TypeArray)
                struccall.getVariable().getType()).getTypeIntern()); // on renvoie le registre contenant l'adresse
             
            } else { 
            returnSR = new StructRetour(wr.callCrochetVar(((TypeArray)struccall.getVariable().getType()).getTypeIntern().getSize(),struccall.getShift(), struccall.getNombreChainage(), returnSR.getShift(), returnSR.getNombreChainage(), this.numenv), ((TypeArray)
            struccall.getVariable().getType()).getTypeIntern());
                
               
            }
             
            }
             

            break;

        case "+":
            StructRetour a1 = passageRecursif_gene(tree.getChild(0));
            StructRetour a2 = passageRecursif_gene(tree.getChild(1));

            //System.out.println("le return de registre est 3" + a1.getRegistre());
            //System.out.println("le return de registre est 3" + a2.getRegistre());

            // return num registre
            if (a1.getRegistre() == -1 && a2.getRegistre() != -1) { // a1 n'est pas un registre
                if (a1.getValeur() != null) { // a1 valeur

                    returnSR = new StructRetour(wr.addition(a2.getRegistre(), a1.getValeur(), this.numenv));

                } else if (a1.getValeur() == null) {

                    returnSR = new StructRetour(
                            wr.addition(a2.getRegistre(), a1.getShift(), a1.getNombreChainage(), this.numenv));

                }

            } else if (a2.getRegistre() == -1 && a1.getRegistre() != -1) { // a2 n'est pas un registre
                if (a2.getValeur() != null) { // a2 valeur

                    returnSR = new StructRetour(wr.addition(a1.getRegistre(), a2.getValeur(), this.numenv));

                } else if (a2.getValeur() == null) {

                    returnSR = new StructRetour(
                            wr.addition(a1.getRegistre(), a2.getShift(), a2.getNombreChainage(), this.numenv));

                }
            } else if (a1.getRegistre() != -1 && a1.getRegistre() != -1) { // les 2 sont des registres paspossible je
                                                                           // crois
                returnSR = new StructRetour(wr.addition(a1.getRegistre(), a2.getRegistre(), this.numenv));
            } else {
                if (a1.getValeur() != null && a2.getValeur() == null) {

                    returnSR = new StructRetour(
                            wr.addition(a2.getShift(), a2.getNombreChainage(), a1.getValeur(), this.numenv));

                } else if (a2.getValeur() != null && a1.getValeur() == null) {

                    returnSR = new StructRetour(
                            wr.addition(a1.getShift(), a1.getNombreChainage(), a2.getValeur(), this.numenv));

                } else if (a1.getValeur() != null && a2.getValeur() != null) {

                    returnSR = new StructRetour(wr.addition(a1.getValeur(), a2.getValeur(), this.numenv));

                } else {
                    if (a1.getType().getName().equals("function"))
                        returnSR = new StructRetour(wr.additionAddr(0, a2.getShift(),
                            a2.getNombreChainage(),  this.numenv));
                    else if (a2.getType().getName().equals("function"))
                    returnSR = new StructRetour(wr.additionAddr(0, a1.getShift(),
                        a1.getNombreChainage(),  this.numenv));
                    else{
                        returnSR = new StructRetour(wr.addition(a1.getShift(), a1.getNombreChainage(), a2.getShift(),
                            a2.getNombreChainage(),  this.numenv));
                    }
                }
            }

            break;

        case "-":
            StructRetour s1 = passageRecursif_gene(tree.getChild(0));
            StructRetour s2 = passageRecursif_gene(tree.getChild(1));
            // return num registre
            if (s1.getRegistre() == -1 && s2.getRegistre() != -1) { // a1 n'est pas un registre
                if (s1.getValeur() != null) { // a1 valeur

                    returnSR = new StructRetour(
                            wr.soustraction(s2.getRegistre(), s1.getValeur(),this.numenv));

                } else if (s1.getValeur() == null) {

                    returnSR = new StructRetour(wr.soustraction(s2.getRegistre(), s1.getShift(), s1.getNombreChainage(),
                    this.numenv));

                }

            } else if (s2.getRegistre() == -1 && s1.getRegistre() != -1) { // a2 n'est pas un registre
                if (s2.getValeur() != null) { // a2 valeur

                    returnSR = new StructRetour(
                            wr.soustraction(s1.getRegistre(), s2.getValeur(), this.numenv));

                } else if (s2.getValeur() == null) {

                    returnSR = new StructRetour(wr.soustraction(s1.getRegistre(), s2.getShift(), s2.getNombreChainage(),
                    this.numenv));

                }
            } else if (s1.getRegistre() != -1 && s1.getRegistre() != -1) { // les 2 sont des registres paspossible je
                                                                           // crois
                returnSR = new StructRetour(
                        wr.soustraction(s1.getRegistre(), s2.getRegistre(), this.numenv));
            } else {
                if (s1.getValeur() != null && s2.getValeur() == null) {

                    returnSR = new StructRetour(wr.soustraction(s2.getShift(), s2.getNombreChainage(), s1.getValeur(),
                    this.numenv));

                } else if (s2.getValeur() != null && s1.getValeur() == null) {

                    returnSR = new StructRetour(wr.soustraction(s1.getShift(), s1.getNombreChainage(), s2.getValeur(),
                    this.numenv));

                } else if (s1.getValeur() != null && s2.getValeur() != null) {

                    returnSR = new StructRetour(
                            wr.soustraction(s1.getValeur(), s2.getValeur(), this.numenv));

                } else {
                    if (s1.getType().getName().equals("function"))
                        returnSR = new StructRetour(wr.soustractionAddr(0, s2.getShift(),
                            s2.getNombreChainage(),  this.numenv));
                    else if (s2.getType().getName().equals("function"))
                    returnSR = new StructRetour(wr.soustractionAddr(0, s1.getShift(),
                        s1.getNombreChainage(),  this.numenv));
                    else{
                        returnSR = new StructRetour(wr.soustraction(s1.getShift(), s1.getNombreChainage(), s2.getShift(),
                            s2.getNombreChainage(),  this.numenv));
                    }
                }
            }

            break;

        case "*":

            StructRetour m1 = passageRecursif_gene(tree.getChild(0));
            StructRetour m2 = passageRecursif_gene(tree.getChild(1));

            // return num registre
            if (m1.getRegistre() == -1 && m2.getRegistre() != -1) { // a1 n'est pas un registre
                if (m1.getValeur() != null) { // a1 valeur

                    returnSR = new StructRetour(
                            wr.multiplication(m2.getRegistre(), m1.getValeur(), this.numenv));

                } else if (m1.getValeur() == null) {

                    returnSR = new StructRetour(wr.multiplication(m2.getRegistre(), m1.getShift(),
                            m1.getNombreChainage(), this.numenv));

                }

            } else if (m2.getRegistre() == -1 && m1.getRegistre() != -1) { // a2 n'est pas un registre
                if (m2.getValeur() != null) { // a2 valeur

                    returnSR = new StructRetour(
                            wr.multiplication(m1.getRegistre(), m2.getValeur(), this.numenv));

                } else if (m2.getValeur() == null) {

                    returnSR = new StructRetour(wr.multiplication(m1.getRegistre(), m2.getShift(),
                            m2.getNombreChainage(), this.numenv));

                }
            } else if (m1.getRegistre() != -1 && m2.getRegistre() != -1) { // les 2 sont des registres paspossible je
                                                                           // crois
                returnSR = new StructRetour(
                        wr.multiplication(m1.getRegistre(), m2.getRegistre(), this.numenv));
            } else {
                if (m1.getValeur() != null && m2.getValeur() == null) {

                    returnSR = new StructRetour(wr.multiplication(m2.getShift(), m2.getNombreChainage(), m1.getValeur(),
                    this.numenv));

                } else if (m2.getValeur() != null && m1.getValeur() == null) {

                    returnSR = new StructRetour(wr.multiplication(m1.getShift(), m1.getNombreChainage(), m2.getValeur(),
                    this.numenv));

                } else if (m1.getValeur() != null && m2.getValeur() != null) {

                    returnSR = new StructRetour(
                            wr.multiplication(m1.getValeur(), m2.getValeur(), this.numenv));

                } else {
                    if (m1.getType().getName().equals("function"))
                        returnSR = new StructRetour(wr.multiplicationAddr(0, m2.getShift(),
                            m2.getNombreChainage(),  this.numenv));
                    else if (m2.getType().getName().equals("function"))
                    returnSR = new StructRetour(wr.multiplicationAddr(0, m1.getShift(),
                        m1.getNombreChainage(),  this.numenv));
                    else{
                        returnSR = new StructRetour(wr.multiplication(m1.getShift(), m1.getNombreChainage(), m2.getShift(),
                            m2.getNombreChainage(),  this.numenv));
                    }
                }
            }

            break;

        case "/":

            StructRetour d1 = passageRecursif_gene(tree.getChild(0));
            StructRetour d2 = passageRecursif_gene(tree.getChild(1));

            // return num registre
            if (d1.getRegistre() == -1 && d2.getRegistre() != -1) { // a1 n'est pas un registre
                if (d1.getValeur() != null) { // a1 valeur

                    returnSR = new StructRetour(
                            wr.division(d2.getRegistre(), d1.getValeur(), this.numenv));

                } else if (d1.getValeur() == null) {

                    returnSR = new StructRetour(wr.division(d2.getRegistre(), d1.getShift(), d1.getNombreChainage(),
                    this.numenv));

                }

            } else if (d2.getRegistre() == -1 && d1.getRegistre() != -1) { // a2 n'est pas un registre
                if (d2.getValeur() != null) { // a2 valeur

                    returnSR = new StructRetour(
                            wr.division(d1.getRegistre(), d2.getValeur(), this.numenv));

                } else if (d2.getValeur() == null) {

                    returnSR = new StructRetour(wr.division(d1.getRegistre(), d2.getShift(), d2.getNombreChainage(),
                    this.numenv));

                }
            } else if (d1.getRegistre() != -1 && d2.getRegistre() != -1) { // les 2 sont des registres paspossible je
                                                                           // crois
                returnSR = new StructRetour(
                        wr.division(d1.getRegistre(), d2.getRegistre(), this.numenv));
            } else {
                if (d1.getValeur() != null && d2.getValeur() == null) {

                    returnSR = new StructRetour(wr.division(d2.getShift(), d2.getNombreChainage(), d1.getValeur(),
                    this.numenv));

                } else if (d2.getValeur() != null && d1.getValeur() == null) {

                    returnSR = new StructRetour(wr.division(d1.getShift(), d1.getNombreChainage(), d2.getValeur(),
                    this.numenv));

                } else if (d1.getValeur() != null && d2.getValeur() != null) {

                    returnSR = new StructRetour(
                            wr.division(d1.getValeur(), d2.getValeur(), this.numenv));

                } else {

                    if (d1.getType().getName().equals("function"))
                        returnSR = new StructRetour(wr.divisionAddr(0, d2.getShift(),
                            d2.getNombreChainage(),  this.numenv));
                    else if (d2.getType().getName().equals("function"))
                    returnSR = new StructRetour(wr.divisionAddr(0, d1.getShift(),
                        d1.getNombreChainage(),  this.numenv));
                    else{
                        returnSR = new StructRetour(wr.division(d1.getShift(), d1.getNombreChainage(), d2.getShift(),
                            d2.getNombreChainage(),  this.numenv));
                    }
                }
            }
            break;

        case "MOINS_UNAIRE":

            StructRetour u1 = passageRecursif_gene(tree.getChild(0));

            if (u1.getRegistre() == -1) { // pas un registre
                if (u1.getValeur() != null) { // a1 valeur

                    returnSR = new StructRetour(wr.moins_unaire(u1.getValeur(), this.numenv));

                } else if (u1.getValeur() == null) {

                    returnSR = new StructRetour(wr.moins_unaire(u1.getShift(), u1.getNombreChainage(), this.numenv));

                }
            } else {
                returnSR = new StructRetour(wr.moins_unaire(u1.getRegistre(), this.numenv));
            }

            break;

        case "FUNCDEC": // ecrire dans un nouveau writer .
            // ecrive l'alias
            this.numTable++;
            int temp = this.numenv;
            returnSR = passageRecursif_gene(tree.getChild(0));
            // ecrire LINK

            this.numenv = this.numTable; // Le +1 merdait
            wr.newEnvironment(((Function) returnSR.getVariable()).getAlias(), this.numenv);

            // On va dans le block pour écrire les fct
            // on prend le dernier du block , et on le met dans R0

            if (((Function) returnSR.getVariable()).getTypeReturn().getName().equals("void")) {
                passageRecursif_gene(tree.getChild(2));

            } else {
                returnSR = passageRecursif_gene(tree.getChild(2));
                //System.out.println("testttttt");
                //System.out.println("a  aaaaaaaaaaaaalllllllllllllooooooooooooooo" + returnSR.getNombreChainage());
                if (returnSR.getValeur() != null) {
                    if (returnSR.getType().getName().equals("int")) {
                        wr.returnInt(Integer.parseInt(returnSR.getValeur()), this.numenv);
                    } else if (returnSR.getType().getName().equals("String")) {
                        this.numalias++;
                        numaliastemp = this.numalias;
                        wr.returnString(numaliastemp, returnSR.getValeur(), this.numenv);

                    }
                } else if (returnSR.getRegistre() != -1) {

                    wr.copyToRegAddr(0, returnSR.getRegistre(), this.numenv);
                

                } else if (returnSR.getShift() != -1) {

                    wr.copytoRegistreAddr(0, returnSR.getShift(), returnSR.getNombreChainage(), this.numenv);
                }

            }

            wr.endEvironment(this.numenv);

            this.numenv = temp;

            break;

        case "CALLFUN":

            StructRetour structempofunction = passageRecursif_gene(tree.getChild(0));

            // fct apppelé ou fct appelante ??
            wr.sautSP(structempofunction.getShift() - 4, this.numenv);
            passageRecursif_gene(tree.getChild(1));

            // appel de la fonction
            // this.structempo = null;

            wr.callFunction(((Function) (structempofunction.getVariable())).getAlias(),
                    structempofunction.getShift() - 4, this.numenv);

            returnSR = structempofunction;

            //////// LE dernier élément de la fonction va dans R0

            break;

        case "ARG":
            int z = 0;
            for (int i = 0; i < tree.getChildCount(); i++) {

                returnSR = passageRecursif_gene(tree.getChild(i));

                //System.out.println();
                // System.out.println("test" + returnSR.getValeur());

                if (returnSR.getValeur() != null) {

                    if (returnSR.getType().getName().equals("int")) {
                        wr.copytoRegistre(0, Integer.parseInt(returnSR.getValeur()), this.numenv);
                        wr.copyfromRegistreArg(0, z, this.numenv);
                        z += returnSR.getType().getSize();
                        ;
                    } else if (returnSR.getType().getName().equals("String")) {
                        this.numalias++;
                        numaliastemp = this.numalias;
                        wr.writeVariableString(numaliastemp, returnSR.getValeur(), this.numenv);
                        wr.copytoRegistreString(0, numaliastemp, this.numenv);

                        wr.copyfromRegistreArg(0, z, this.numenv);
                        z += returnSR.getType().getSize();
                    }

                } else if (returnSR.getRegistre() != -1) { // operation
                  //  System.out.println("le return de registre est");
                   // System.out.println("le return de registre est" + returnSR.getRegistre());
                    wr.copyfromRegistreArg(returnSR.getRegistre(), z, this.numenv);
                    z += 2;

                } else if (returnSR.getRegistre_Addr() != -1) { // callcrochet
                   // System.out.println("le return de registre est");
                   // System.out.println("le return de registre est" + returnSR.getRegistre());
                    wr.copyFromRegAddrArg(returnSR.getRegistre_Addr(), z, returnSR.getType().getSize(),  this.numenv);
                    z += returnSR.getType().getSize();

                }else {
                   // System.out.println("le return de registre est");
                    if (returnSR.getType().getName().equals("function")) {
                        wr.copyFromRegAddrArg(0, z, ((Function) returnSR.getVariable()).getTypeReturn().getSize(),
                                this.numenv);
                        z += ((Function) returnSR.getVariable()).getTypeReturn().getSize();
                    } else {
                        wr.copyArg(z, returnSR.getShift(), returnSR.getNombreChainage(), returnSR.getType().getSize(),
                                this.numenv);
                        z += returnSR.getType().getSize();
                    }

                }

            }

            break;

        case "IF":
            this.numalias++;
            numaliastemp = this.numalias;
            returnSR = passageRecursif_gene(tree.getChild(0));
            if (returnSR.getValeur() != null){
                
                wr.copytoRegistre(0, Integer.parseInt(returnSR.getValeur()) , this.numenv);
                returnSR = new StructRetour(0);
                
            }
            else if (returnSR.getShift() != -1){
                
                wr.copytoRegistre(0, returnSR.getShift(), returnSR.getNombreChainage() , this.numenv);
                returnSR = new StructRetour(0);
                
            }

            if (tree.getChildCount() == 2) {
                wr.if_end_vrai(returnSR.getRegistre(), numaliastemp, this.numenv);
                wr.if_(numaliastemp, this.numenv);
                passageRecursif_gene(tree.getChild(1));

            } else if (tree.getChildCount() == 3) {
                wr.if_else_vrai(returnSR.getRegistre(), numaliastemp, this.numenv);
                wr.if_(numaliastemp, this.numenv);

                passageRecursif_gene(tree.getChild(1));
                wr.if_end(numaliastemp, this.numenv);
                wr.else_(numaliastemp, this.numenv);

                passageRecursif_gene(tree.getChild(2));
            }

            wr.end_(numaliastemp, this.numenv);

            break;

        case "COND":
            returnSR = passageRecursif_gene(tree.getChild(0));
            break;

        case "THEN":

            for (int i = 0; i < tree.getChildCount(); i++) {

                passageRecursif_gene(tree.getChild(i));

            }
            break;

        case "ELSE":
            for (int i = 0; i < tree.getChildCount(); i++) {

                passageRecursif_gene(tree.getChild(i));

            }
            break;

        case "=":
            this.temp1 = passageRecursif_gene(tree.getChild(0));
            this.temp2 = passageRecursif_gene(tree.getChild(1));

            if (this.temp1.getRegistre() == -1 && this.temp2.getRegistre() != -1) { // a1 n'est pas un registre
                if (this.temp1.getValeur() != null) { // a1 valeur

                    wr.compare(this.temp2.getRegistre(), this.temp1.getValeur(), this.numenv);

                } else if (this.temp1.getValeur() == null) {

                    wr.compare(this.temp2.getRegistre(), this.temp1.getShift(), this.temp1.getNombreChainage(),
                            this.numenv);

                }

            } else if (this.temp2.getRegistre() == -1 && this.temp1.getRegistre() != -1) { // a2 n'est pas un registre
                if (this.temp2.getValeur() != null) { // a2 valeur

                    wr.compare(this.temp1.getRegistre(), this.temp2.getValeur(), this.numenv);

                } else if (this.temp2.getValeur() == null) {

                    wr.compare(this.temp1.getRegistre(), this.temp2.getShift(), this.temp2.getNombreChainage(),
                            this.numenv);

                }
            } else if (this.temp1.getRegistre() != -1 && this.temp2.getRegistre() != -1) { // les 2 sont des registres
                                                                                           // paspossible je crois
                wr.compare(this.temp1.getRegistre(), this.temp2.getRegistre(), this.numenv);
            } else {
                if (this.temp1.getValeur() != null && this.temp2.getValeur() == null) {

                    wr.compare(this.temp2.getShift(), this.temp2.getNombreChainage(), this.temp1.getValeur(),
                            this.numenv);

                } else if (this.temp2.getValeur() != null && this.temp1.getValeur() == null) {

                    wr.compare(this.temp1.getShift(), this.temp1.getNombreChainage(), this.temp2.getValeur(),
                            this.numenv);

                } else if (this.temp1.getValeur() != null && this.temp2.getValeur() != null) {

                    wr.compare(this.temp1.getValeur(), this.temp2.getValeur(), this.numenv);

                } else {
                    wr.compare(this.temp1.getShift(), this.temp1.getNombreChainage(), this.temp2.getShift(),
                            this.temp2.getNombreChainage(), this.numenv);
                }

            }

            returnSR = new StructRetour(wr.equal(this.numenv));

            this.temp1 = null;
            this.temp2 = null;

            break;

        case ">=":
            this.temp1 = passageRecursif_gene(tree.getChild(0));
            this.temp2 = passageRecursif_gene(tree.getChild(1));

            if (this.temp1.getRegistre() == -1 && this.temp2.getRegistre() != -1) { // a1 n'est pas un registre
                if (this.temp1.getValeur() != null) { // a1 valeur

                    wr.compare(this.temp2.getRegistre(), this.temp1.getValeur(), this.numenv);

                } else if (this.temp1.getValeur() == null) {

                    wr.compare(this.temp2.getRegistre(), this.temp1.getShift(), this.temp1.getNombreChainage(),
                            this.numenv);

                }

            } else if (this.temp2.getRegistre() == -1 && this.temp1.getRegistre() != -1) { // a2 n'est pas un registre
                if (this.temp2.getValeur() != null) { // a2 valeur

                    wr.compare(this.temp1.getRegistre(), this.temp2.getValeur(), this.numenv);

                } else if (this.temp2.getValeur() == null) {

                    wr.compare(this.temp1.getRegistre(), this.temp2.getShift(), this.temp2.getNombreChainage(),
                            this.numenv);

                }
            } else if (this.temp1.getRegistre() != -1 && this.temp2.getRegistre() != -1) { // les 2 sont des registres
                                                                                           // paspossible je crois
                wr.compare(this.temp1.getRegistre(), this.temp2.getRegistre(), this.numenv);
            } else {
                if (this.temp1.getValeur() != null && this.temp2.getValeur() == null) {

                    wr.compare(this.temp2.getShift(), this.temp2.getNombreChainage(), this.temp1.getValeur(),
                            this.numenv);

                } else if (this.temp2.getValeur() != null && this.temp1.getValeur() == null) {

                    wr.compare(this.temp1.getShift(), this.temp1.getNombreChainage(), this.temp2.getValeur(),
                            this.numenv);

                } else if (this.temp1.getValeur() != null && this.temp2.getValeur() != null) {

                    wr.compare(this.temp1.getValeur(), this.temp2.getValeur(), this.numenv);

                } else {
                    wr.compare(this.temp1.getShift(), this.temp1.getNombreChainage(), this.temp2.getShift(),
                            this.temp2.getNombreChainage(), this.numenv);
                }
            }

            returnSR = new StructRetour(wr.sup_equal(this.numenv));
            this.temp1 = null;
            this.temp2 = null;

            break;

        case "<=":
            this.temp1 = passageRecursif_gene(tree.getChild(0));
            this.temp2 = passageRecursif_gene(tree.getChild(1));

            if (this.temp1.getRegistre() == -1 && this.temp2.getRegistre() != -1) { // a1 n'est pas un registre
                if (this.temp1.getValeur() != null) { // a1 valeur

                    wr.compare(this.temp2.getRegistre(), this.temp1.getValeur(), this.numenv);

                } else if (this.temp1.getValeur() == null) {

                    wr.compare(this.temp2.getRegistre(), this.temp1.getShift(), this.temp1.getNombreChainage(),
                            this.numenv);

                }

            } else if (this.temp2.getRegistre() == -1 && this.temp1.getRegistre() != -1) { // a2 n'est pas un registre
                if (this.temp2.getValeur() != null) { // a2 valeur

                    wr.compare(this.temp1.getRegistre(), this.temp2.getValeur(), this.numenv);

                } else if (this.temp2.getValeur() == null) {

                    wr.compare(this.temp1.getRegistre(), this.temp2.getShift(), this.temp2.getNombreChainage(),
                            this.numenv);

                }
            } else if (this.temp1.getRegistre() != -1 && this.temp2.getRegistre() != -1) { // les 2 sont des registres
                                                                                           // paspossible je crois
                wr.compare(this.temp1.getRegistre(), this.temp2.getRegistre(), this.numenv);
            } else {
                if (this.temp1.getValeur() != null && this.temp2.getValeur() == null) {

                    wr.compare(this.temp2.getShift(), this.temp2.getNombreChainage(), this.temp1.getValeur(),
                            this.numenv);

                } else if (this.temp2.getValeur() != null && this.temp1.getValeur() == null) {

                    wr.compare(this.temp1.getShift(), this.temp1.getNombreChainage(), this.temp2.getValeur(),
                            this.numenv);

                } else if (this.temp1.getValeur() != null && this.temp2.getValeur() != null) {

                    wr.compare(this.temp1.getValeur(), this.temp2.getValeur(), this.numenv);

                } else {
                    wr.compare(this.temp1.getShift(), this.temp1.getNombreChainage(), this.temp2.getShift(),
                            this.temp2.getNombreChainage(), this.numenv);
                }
            }

            returnSR = new StructRetour(wr.inf_equal(this.numenv));
            this.temp1 = null;
            this.temp2 = null;

            break;

        case "<":
            this.temp1 = passageRecursif_gene(tree.getChild(0));
            this.temp2 = passageRecursif_gene(tree.getChild(1));

            if (this.temp1.getRegistre() == -1 && this.temp2.getRegistre() != -1) { // a1 n'est pas un registre
                if (this.temp1.getValeur() != null) { // a1 valeur

                    wr.compare(this.temp2.getRegistre(), this.temp1.getValeur(), this.numenv);

                } else if (this.temp1.getValeur() == null) {

                    wr.compare(this.temp2.getRegistre(), this.temp1.getShift(), this.temp1.getNombreChainage(),
                            this.numenv);

                }

            } else if (this.temp2.getRegistre() == -1 && this.temp1.getRegistre() != -1) { // a2 n'est pas un registre
                if (this.temp2.getValeur() != null) { // a2 valeur

                    wr.compare(this.temp1.getRegistre(), this.temp2.getValeur(), this.numenv);

                } else if (this.temp2.getValeur() == null) {

                    wr.compare(this.temp1.getRegistre(), this.temp2.getShift(), this.temp2.getNombreChainage(),
                            this.numenv);

                }
            } else if (this.temp1.getRegistre() != -1 && this.temp2.getRegistre() != -1) { // les 2 sont des registres
                                                                                           // paspossible je crois
                wr.compare(this.temp1.getRegistre(), this.temp2.getRegistre(), this.numenv);
            } else {
                if (this.temp1.getValeur() != null && this.temp2.getValeur() == null) {

                    wr.compare(this.temp2.getShift(), this.temp2.getNombreChainage(), this.temp1.getValeur(),
                            this.numenv);

                } else if (this.temp2.getValeur() != null && this.temp1.getValeur() == null) {

                    wr.compare(this.temp1.getShift(), this.temp1.getNombreChainage(), this.temp2.getValeur(),
                            this.numenv);

                } else if (this.temp1.getValeur() != null && this.temp2.getValeur() != null) {

                    wr.compare(this.temp1.getValeur(), this.temp2.getValeur(), this.numenv);

                } else {
                    wr.compare(this.temp1.getShift(), this.temp1.getNombreChainage(), this.temp2.getShift(),
                            this.temp2.getNombreChainage(), this.numenv);
                }
            }

            returnSR = new StructRetour(wr.inf(this.numenv));
            this.temp1 = null;
            this.temp2 = null;

            break;

        case ">":
            this.temp1 = passageRecursif_gene(tree.getChild(0));
            this.temp2 = passageRecursif_gene(tree.getChild(1));

            if (this.temp1.getRegistre() == -1 && this.temp2.getRegistre() != -1) { // a1 n'est pas un registre
                if (this.temp1.getValeur() != null) { // a1 valeur

                    wr.compare(this.temp2.getRegistre(), this.temp1.getValeur(), this.numenv);

                } else if (this.temp1.getValeur() == null) {

                    wr.compare(this.temp2.getRegistre(), this.temp1.getShift(), this.temp1.getNombreChainage(),
                            this.numenv);

                }

            } else if (this.temp2.getRegistre() == -1 && this.temp1.getRegistre() != -1) { // a2 n'est pas un registre
                if (this.temp2.getValeur() != null) { // a2 valeur

                    wr.compare(this.temp1.getRegistre(), this.temp2.getValeur(), this.numenv);

                } else if (this.temp2.getValeur() == null) {

                    wr.compare(this.temp1.getRegistre(), this.temp2.getShift(), this.temp2.getNombreChainage(),
                            this.numenv);

                }
            } else if (this.temp1.getRegistre() != -1 && this.temp2.getRegistre() != -1) { // les 2 sont des registres
                                                                                           // paspossible je crois
                wr.compare(this.temp1.getRegistre(), this.temp2.getRegistre(), this.numenv);
            } else {
                if (this.temp1.getValeur() != null && this.temp2.getValeur() == null) {

                    wr.compare(this.temp2.getShift(), this.temp2.getNombreChainage(), this.temp1.getValeur(),
                            this.numenv);

                } else if (this.temp2.getValeur() != null && this.temp1.getValeur() == null) {

                    wr.compare(this.temp1.getShift(), this.temp1.getNombreChainage(), this.temp2.getValeur(),
                            this.numenv);

                } else if (this.temp1.getValeur() != null && this.temp2.getValeur() != null) {

                    wr.compare(this.temp1.getValeur(), this.temp2.getValeur(), this.numenv);

                } else {
                    wr.compare(this.temp1.getShift(), this.temp1.getNombreChainage(), this.temp2.getShift(),
                            this.temp2.getNombreChainage(), this.numenv);
                }
            }

            returnSR = new StructRetour(wr.sup(this.numenv));
            this.temp1 = null;
            this.temp2 = null;

            break;

        case "&":

            StructRetour a = passageRecursif_gene(tree.getChild(0));

            StructRetour b = passageRecursif_gene(tree.getChild(1));

            returnSR = new StructRetour(wr.andd(a.getRegistre(), b.getRegistre(), this.numenv));

            break;

        case "|":

            StructRetour c = passageRecursif_gene(tree.getChild(0));

            StructRetour d = passageRecursif_gene(tree.getChild(1));

            returnSR = new StructRetour(wr.orr(c.getRegistre(), d.getRegistre(), this.numenv));

            break;

        case "WHILE":
            this.numalias++;
            numaliastemp = this.numalias;
            this.numaliasbreak = this.numalias; // marchera pas si while imbriqué
            wr.while_(numaliastemp, this.numenv);
            returnSR = passageRecursif_gene(tree.getChild(0));
            wr.while_cond(returnSR.getRegistre(), numaliastemp, this.numenv);
            passageRecursif_gene(tree.getChild(1));
            wr.fin_while(numaliastemp, this.numenv);

            break;

        case "DO":
        case "BLOCK":
            for (int i = 0; i < tree.getChildCount(); i++) {
                if (tree.getChild(i).getText().equals("END")) {

                } else {
                    returnSR = passageRecursif_gene(tree.getChild(i));
                }

            }
           // System.out.println("a  aaaaaaaaaaaaalllllllllllllooooooooooooooo" + returnSR.getNombreChainage());
            break;

        case "break":

            wr.breakk(this.numaliasbreak, this.numenv);
            break;

        case "FOR":

            this.numalias++;
            numaliastemp = this.numalias;

            returnSR = passageRecursif_gene(tree.getChild(0));

            wr.for_(numaliastemp, returnSR.getShift(), returnSR.getNombreChainage(),
                    (passageRecursif_gene(tree.getChild(0).getChild(2))).getValeur(), this.numenv);

            passageRecursif_gene(tree.getChild(1));

            wr.fin_for(returnSR.getShift(), returnSR.getNombreChainage(), numaliastemp, this.numenv);

            break;

        case "ITERATION": // que dans un sens i < val max

            numaliastemp = this.numalias;

            returnSR = passageRecursif_gene(tree.getChild(0));

            // mettre à jour variable i avec valeur fils 1
            wr.writeVariableInt(returnSR.getShift(), passageRecursif_gene(tree.getChild(1)).getValeur(),
                    returnSR.getNumTable(), this.numenv);

            // boucle conditionnelle
            wr.compare(returnSR.getShift(), returnSR.getNumTable(), passageRecursif_gene(tree.getChild(2)).getValeur(),
                    this.numenv);

            StructRetour returnSRtemp = new StructRetour(wr.inf(this.numenv));
            wr.for_cond(returnSRtemp.getRegistre(), numaliastemp, this.numenv);

            break;

        }

        return returnSR;

    }

    private Parameter recherchePar(String name, VarRecord rec){
        Parameter yo = null;
        for (Parameter par : rec.getParameters()){
            if (par.getName().equals(name)){
                yo = par;
            }
        }
        return yo;
    }

}