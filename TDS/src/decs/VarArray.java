package decs;

public class VarArray extends Var {

    private int numberElement;

    public VarArray(String name, Type type, int numberElement, int shift){

        super(name ,type, - numberElement * ((TypeArray)type).getTypeIntern().getSize(), numberElement * ((TypeArray)type).getTypeIntern().getSize());
        this.numberElement = numberElement; 
        
    }

    public int getNumberElement() {

        return this.numberElement;

    }

    @Override
    public String toString() {
        return "Name : " + this.getName() + " ; Type : " + this.getType().getName() + " ; Number of elements : " + this.getNumberElement() + " ; Shift : " + this.getShift() + "\n";
    }
}