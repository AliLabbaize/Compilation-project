package decs;

public class TypePrimitiv extends Type {

    public TypePrimitiv(String name, int size) {
        super(name, size);
    }

    @Override
    public String toString() {
        return "Name : " + this.getName()  + " ; Size : " + this.getSize() + "\n";
    }



    @Override
    public Type getType() {

        return null;

    }

    public Boolean equals (TypePrimitiv A){
        if (A.getName().equals(this.getName())){
            return true;
        }
        return false;
    }
}
