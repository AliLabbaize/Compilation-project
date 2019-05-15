package decs;

public class VarSimple extends Var {

    public VarSimple(String name, Type type, int shift){
        
        super(name ,type, shift, type.getSize());

    }

    @Override
    public String toString() {
        return "Name : " + this.getName() + " ; Type : " + this.getType().getName() + " ; Shift : " + this.getShift() + "\n";
    }
}