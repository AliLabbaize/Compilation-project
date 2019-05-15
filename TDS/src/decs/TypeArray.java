package decs;

public class TypeArray extends Type {

    private Type type_intern;

    public TypeArray(String name, Type type_intern) {

        super(name, 2);

        this.type_intern = type_intern;

    }

    public Type getTypeIntern() {
        return this.type_intern;
    }

    public String toString() {
        return "Name : " + this.getName() + " ; Type : " + this.type_intern.getName() + " ; Size : " + this.getSize()
                + "\n";
    }

    public Type getType() {

        return null;

    }
}
