package parcours;

import decs.*;
import excepts.*;

import java.util.ArrayList;


public class controlesSemantic {

    PileRegionOuvert stack;


    Type typeInteger  = new TypePrimitiv("int", 1);

    public controlesSemantic(PileRegionOuvert stack) {

        this.stack = stack;

    }

    public void compareType(Type type1, Type type2) throws CompareTypeException  {
        if (type1 == null || type2 ==null){
            throw new CompareTypeException("Le type n'existe pas NULL !!\n");
        }
        Type typepim1 = type1;
        Type typepim2 = type2;
       if( (type2 instanceof TypePrimitiv) && (type1 instanceof TypePrimitiv)){

            if (!type1.getName().equals(type2.getName())) {
                throw new CompareTypeException("Les types ne sont pas les mêmes !!!\n");
            }
       }
       else if (!(type2 instanceof TypePrimitiv) && !(type1 instanceof TypePrimitiv)) {
            if (type2 instanceof TypeRename) {
                typepim2 =type2.getType();
                while(typepim2 instanceof TypeRename){
                    typepim2 = typepim2.getType();
                }
            }
            if (type1 instanceof TypeRename) {
                typepim1 =type1.getType();
                while(typepim1 instanceof TypeRename){
                    typepim1 = typepim1.getType();
                }
            }
            if (!typepim1.getName().equals(typepim2.getName())) {
                throw new CompareTypeException("Les types ne sont pas les mêmes !!!\n");
            }
       }
       else if ((type2 instanceof TypePrimitiv) && !(type1 instanceof TypePrimitiv)) {

            if (type1 instanceof TypeRename) {

                typepim1 =type1.getType();

                while(typepim1 instanceof TypeRename){
                    typepim1 = typepim1.getType();
                }
            }
            if (!typepim1.getName().equals(typepim2.getName())) {
                throw new CompareTypeException("Les types ne sont pas les mêmes !!!\n");
            }
       }
       else if (!(type2 instanceof TypePrimitiv) && (type1 instanceof TypePrimitiv)) {
            if (type2 instanceof TypeRename) {
                typepim2 =type2.getType();
                while(typepim2 instanceof TypeRename){
                    typepim2 = typepim2.getType();
                }
            }
            if (!typepim2.getName().equals(typepim1.getName())) {
                throw new CompareTypeException("Les types ne sont pas les mêmes !!!\n");
            }

        else {
            System.out.print("Ton test sémantique ne marche pas trop poto !!\n");
        }
     }
    }

    public void checkZero(String fils_droit) throws ZeroException {

         if (fils_droit.equals("0")){
                throw new ZeroException("Division par 0 !\n");
        }
    }

    public void checkExistingFunction(String function) throws MissingFunctionException {

        if (!stack.searchType(function)) {

            throw new MissingFunctionException("La fonction appelée n'a pas été définie\n");

        }
    }

    public void checkNbArg(String function, ArrayList<Type> typeparams) throws WrongNumberOfArgumentException {

        //A supposer que la fonction est bien définie.

        Function fdec = (Function)stack.recupVar(function);

        int nbarg = typeparams.size();
        int nbparams = fdec.getParams().size();

        if(nbarg!=nbparams){

            throw new WrongNumberOfArgumentException(function + " : Expected " + nbparams + " arguments");

        }

    }

    public void checkArg(String function, ArrayList<Type> typeparams) throws CompareTypeException {

        //A supposer que la fonction soit définie et ait le bon nombre d'arguments.

        Function fdec = (Function)stack.recupVar(function);

        int n = typeparams.size();

        for (int i = 0; i<n; i++) {

            compareType(fdec.getParams().get(i).getType(),typeparams.get(i));

        }

    }

    public void checkExpression(Type type1, Type type2) throws InvalidOperationException {
            try {
                compareType(type1,type2);


            } catch (CompareTypeException e) {
                throw new InvalidOperationException("Opération arithmétique mal formulée !");
            }
        }

    



    public void sameNameTypes(String type_name) throws SameNameException {
        if(stack.searchType(type_name)){
             throw new SameNameException("Le nom de ce Type est déjà pris !!");
        }
    }

}