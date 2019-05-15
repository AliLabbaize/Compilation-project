package decs;

public class Parameter {

    private Type type;
    private String name;
    private int shift;

    public Parameter(String name, Type type, int shift) {

        this.name=name;
        this.type = type;
        this.shift = shift;

    }

    public int getShift() {

        return this.shift;

    }

    public void setShift(int shift) {

        this.shift=shift;

    }

    public Type getType() {

        return this.type;

    }

    public String getName() {

        return this.name;

    }

    public String toString() {

        return "Name : " + this.name + " ; Type : " + this.type.getName()  + " ; Shift : " + this.getShift() + "\n" ;

    }

    public void reverseShift(){

        this.shift=-this.shift;

    }

}