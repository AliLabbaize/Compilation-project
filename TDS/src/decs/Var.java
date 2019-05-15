package decs;

public abstract class Var {

    private int shift;
    private Type type;
    private String name;
    private int memory_size;

    public Var(String name, Type type, int shift, int memory_size){
        
        this.shift = shift;
        this.type = type;
        this.name = name;
        this.memory_size = memory_size;
        
        
    }

    public int getShift() {

        return this.shift;

    }

    public int getSize() {

        return this.memory_size;

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

    public abstract String toString();


}
