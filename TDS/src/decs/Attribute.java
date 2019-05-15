package decs;

public class Attribute {

    private Type type;
    private String name;

    public Attribute(String name, Type type) {

        this.name=name;
        this.type = type;

    }

    public Type getType() {

        return this.type;

    }

    public String getName() {

        return this.name;

    }

    public String toString() {

        return "Name : " + this.name + " ; Type : " + this.type.getName()  + " ; Size : " + this.type.getSize() + "\n" ;

    }

}