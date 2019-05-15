package decs;

public class TypeRename extends Type{

    private Type type;

    public TypeRename(String name,Type type) {

        super(name, type.getSize());
        this.type = type;

    }

    @Override
    public String toString() {
        return "Name : " + this.getName() + "; Type : " + this.type.getName()  + " ; Size : " + this.getSize() + "\n";
    }



    @Override
    public Type getType() {

        return this.type;

    }

}
