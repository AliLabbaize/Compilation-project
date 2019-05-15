package decs;

import java.util.ArrayList;

public class TypeRecord extends Type{

    private ArrayList<Attribute> attributes;

    public TypeRecord(String name, ArrayList<Attribute> attributes2) {

        super(name, 0);

        this.attributes = new ArrayList<>();

        int cnt = 0;

        for (Attribute i : attributes2) {

            cnt += i.getType().getSize();
            
            this.attributes.add(i);

        }

        this.setSize(cnt);
        //System.out.println("CNT " +cnt);
       // this.attributes = (ArrayList<Attribute>)attributes2.clone();

    }

    public ArrayList<Attribute> getAttributes() {

        return this.attributes;

    }

    public Attribute recupAtt(String A){

        for (Attribute var : this.attributes) {
            //System.out.println(this.attributes.size());
            if (var.getName().equals(A)){

                return var;
            }
        }

        //throw exception
        return null;
    }

    public boolean searchAtt(String A){

        for (Attribute var : this.attributes) {
            //System.out.println(this.attributes.size());
            if (var.getName().equals(A)){

                return true;
            }
        }

        //throw exception
        return false;
    }

    @Override
    public String toString() {

        String s = "Name : " + this.getName() ;

        int j = 0 ;

        for (Attribute i : attributes) {

            j += 1;

            s += " ; Attribute " + j + " : [Name : " + i.getName() + " ; Type : " + i.getType().getName() +  " ; Size : " + i.getType().getSize() + "] ";

        }

        s += " ; Size : " + this.getSize() + "\n" ;

        return s;
    }



    @Override
    public Type getType() {

        return null;

    }

}
