package decs;

import java.util.*;

public class VarRecord extends Var {

    private ArrayList<Parameter> parameters;

    public VarRecord(String name, Type type,ArrayList<Attribute> attributes, int shift){
        
       
        
        super(name ,type, shift, type.getSize());
        
        
        this.parameters = new ArrayList<>();

        int j = 0; // Premier saut.

        for (Attribute i : attributes) {

            this.parameters.add(new Parameter(i.getName(),i.getType(), j));

            j += i.getType().getSize(); // Emplacement du prochain parametre.

        }

        
    }

    @Override
    public String toString() {

        String s = "Name : " + this.getName() + " ; Type : " + this.getType().getName() ;

        int j = 0 ;

        for (Parameter i : this.parameters) {

            j += 1;

            s += " ; Attribute " + j + " : [Name : " + i.getName() + "; Type : " + i.getType().getName()  + " ; Relativ Shift : " + i.getShift() + "]" ;

        }

        s += " ; Shift : " + this.getShift() + "\n";

        return s;
    }

    public ArrayList<Parameter> getParameters() {

        return this.parameters;

    }

    public void reverseParameters() {

        for (Parameter i : this.parameters){

            i.reverseShift();

        }

    }

}