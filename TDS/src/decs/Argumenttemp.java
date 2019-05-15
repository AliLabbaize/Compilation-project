package decs;

import java.util.ArrayList;

public class Argumenttemp {
    
    ArrayList<valeuraddr> tablearg;


    public class valeuraddr {
        String valeur;  // valeur ou adresse
        int chainage;
        
        public valeuraddr(String valeur, int chainage){
            this.valeur = valeur;  
            this.chainage = chainage;
        }

        public String getValeur(){
            return this.valeur;
        }

        public int getChainage(){
            return this.chainage;
        }




    }

    public Argumenttemp(){
        tablearg = new ArrayList<>();
    }

    public void addArg(String valeur, int chainage){

        valeuraddr a = new valeuraddr(valeur, chainage);
        tablearg.add(a);
    }

    public ArrayList<valeuraddr> getTabArg(){
        return this.tablearg;
    }




}