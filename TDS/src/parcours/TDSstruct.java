package parcours;

import decs.*;

import java.util.*;

public class TDSstruct {

    private int num;
    private TDSstruct numFather;
    private ArrayList<Var> tableTDS;
    private ArrayList<Type> tableType;
    private int nombreimbrication;
    private int nombreLigne;
    private int deplacement;

    public TDSstruct(int num, TDSstruct numFather, int nbimbrication, int shift) {
        this.num = num;
        this.tableTDS = new ArrayList<Var>();
        this.tableType = new ArrayList<Type>();
        this.nombreLigne = 0;
        this.numFather = numFather;
        this.nombreimbrication = nbimbrication;
        this.deplacement = shift;

    }

    public TDSstruct getNumFather() {

        return this.numFather;

    }

    public void setImbrication(int nb) {
        this.nombreimbrication = nb;
    }

    public int getImbrication() { // chainage statique
        return this.num;
    }

    public void addTableTDS(Var var) {
        for (Var vara : this.tableTDS) {
            if (vara.getName().equals(var.getName())) {
                vara = var;
                return;
            }
        }

        this.tableTDS.add(var);
    }

    public void addTableType(Type type) {

        this.tableType.add(type);

    }

    public ArrayList<Type> getTableType() {
        return this.tableType;
    }

    public int getTableNum() {
        return this.num;
    }

    public ArrayList<Var> getTableTDS() {
        return this.tableTDS;
    }

    public String toString() {

        String s = "--------------------\n";
        s += "Number : " + this.num + " ; Imbrication : "
                + this.nombreimbrication /* + " ; Deplacement : " + this.deplacement */ + "\n";
        s += "----------\n";
        s += "Type Declarations :\n";

        for (Type i : this.tableType) {
            // System.out.println(i.toString());
            s += i.toString();

        }

        s += "----------\n";
        s += "Variable Declarations :\n";

        for (Var j : this.tableTDS) {
            // System.out.println("C'est la vie");
            // System.out.println(j.getName());

            s += j.toString();

        }

        s += "--------------------\n";
        s += "\n";

        return s;

    }

}