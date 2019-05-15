package decs;

public abstract class Type {

    private String name;
    private int size;

    public Type(String name,int size) {

        this.name = name;
        this.size=size;

    }

    public int getSize() {

        return this.size;

    }

    public String getName() {

        return this.name;

    }

    public abstract String toString() ;

    public void setSize(int size) {

        this.size=size;

    }

    public abstract Type getType() ;
    

}
