package parcours;

import decs.*;

public class StructRetour {

    private int shift = -1; // valeur impaire
    private int numchainage = -1; // devient le nombrede chainage
    private String valeur = null;
    private Type type = null;
    private Var var = null;
    private int numTable = -1;
    private int registre = -1;
    private Parameter parameter = null;
    private int registreadresse = -1;
    private int taille = -1;

    public StructRetour(String valeur, int deplacement, int numchainage, Type type) {
        this.valeur = valeur;
        this.shift = deplacement;
        this.numchainage = numchainage;
        this.type = type;
    }

    public StructRetour(String valeur, Type type) {
        this.valeur = valeur;
        this.type = type;
    }

    public StructRetour(int deplacement, int nombrechainage) {
        this.shift = deplacement;
        this.numchainage = nombrechainage;
    }

    public StructRetour(int registre1) {
        this.registre = registre1;

    }

    public StructRetour(int registreaddr, Type type) {
        this.registreadresse = registreaddr;
        this.type = type;

    }

    // attention si vartrecord, le type est celui du param
    public StructRetour(int deplacement, int numchainage, int numTable, Var variable, Type type) {
        this.shift = deplacement;
        this.numchainage = numchainage;
        this.var = variable;
        this.numTable = numTable;
        this.type = type;
    }

    public String getValeur() {
        return this.valeur;
    }

    public int getNombreChainage() {
        return this.numchainage;
    }

    public Type getType() {
        return this.type;
    }

    public int getShift() {
        return this.shift;
    }

    public Var getVariable() {
        return this.var;
    }

    public int getNumTable() {
        return this.numTable;
    }

    public int getRegistre() {
        return this.registre;
    }

    public int getRegistre_Addr() {
        return this.registreadresse;
    }

    public void setRegistre(int value) {
        this.registre = value;
    }

    public Parameter getParameter() {
        return this.parameter;
    }

}