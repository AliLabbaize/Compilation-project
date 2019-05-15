package decs;

import java.util.ArrayList;

public class Function extends Var {

    private ArrayList<Parameter> parameters;
    private Type retour;
    private String alias;
    private int deplacement;

    public Function(String name, Type retour, String alias, Type typef, ArrayList<Attribute> attributes) {

        super(name, typef, 0, 0);
        this.retour = retour;
        this.parameters = new ArrayList<>();
        this.alias = alias;

        int j = +4; // Premier saut.

        for (Attribute i : attributes) {

            this.parameters.add(new Parameter(i.getName(), i.getType(), j));
           // System.out.println("la taille" + i.getType().getSize());
            j += i.getType().getSize(); // Emplacement du prochain parametre.

        }

    }

    public Type getTypeReturn() {
        return this.retour;
    }

    public Function(String name, String alias, Type typef, ArrayList<Attribute> attributes) {

        super(name, typef, 0, 0);
        this.parameters = new ArrayList<>();
        this.retour = new TypePrimitiv("void", 0);
        this.alias = alias;

        int j = 4; // Premier saut.

        for (Attribute i : attributes) {

            this.parameters.add(new Parameter(i.getName(), i.getType(), j));

            j += i.getType().getSize(); // Emplacement du prochain parametre.

        }

    }

    public ArrayList<Parameter> getParams() {
        return this.parameters;
    }

    public String toString() {

        String s = "Name : " + this.getName() + " ; Type : " + this.retour.getName() + " ; alias : " + this.alias;

        int j = 0;

        for (Parameter i : parameters) {

            j += 1;

            s += " ; Parameter " + j + " : [Name : " + i.getName() + " ; Type : " + i.getType().getName()
                    + " ; Shift : " + i.getShift() + "] ";

        }

        s += " ; Addr : " + this.getShift();

        s += "\n";

        return s;

    }

    public ArrayList<Var> getVar() {

        ArrayList<Var> r = new ArrayList<>();

        for (Parameter i : this.parameters) {

            r = rec(r, i.getName(), i.getType(), i.getShift());

        }

        return r;

    }

    protected ArrayList<Var> rec(ArrayList<Var> r, String name, Type type, int shift) {

        if (type instanceof TypeRecord) {

            VarRecord tmp = new VarRecord(name, type, ((TypeRecord) type).getAttributes(), shift);
            tmp.reverseParameters();

            r.add(tmp);

            return r;

        } else if (type instanceof TypeArray) {

            VarArray tmp = new VarArray(name, type, 10000, shift);

            r.add(tmp);

            return r;

        } else if (type instanceof TypePrimitiv) {

            VarSimple tmp = new VarSimple(name, type, shift);

            r.add(tmp);

            return r;

        } else if (type instanceof TypeRename) {

            return rec(r, name, type.getType(), shift);

        } else {

            System.out.println("Erreur de generation du nouvel environnement.");

            return r;

        }

    }

    public void addShift(int deplacement) {

        int j = 4;
        for (Parameter i : this.parameters) {

            j += i.getType().getSize(); // Emplacement du prochain parametre.

        }

        this.deplacement = j;

    }

    public int getShift() {
        return this.deplacement;
    }

    public String getAlias() {

        return this.alias;

    }

}
