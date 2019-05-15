package parcours;

import decs.*;

import java.lang.*;
import java.util.ArrayList;

public class PileRegionOuvert {

    public ArrayList<TDSstruct> alltable;
    ArrayList<TDSstruct> pile;
    int numid;

    public PileRegionOuvert() {

        pile = new ArrayList<TDSstruct>(1);
        alltable = new ArrayList<TDSstruct>(1);
        this.numid = 0;
    }

    public void addtostack(TDSstruct tds) {
        this.pile.add(tds);
    }

    public void removetostack(TDSstruct tds) {
        this.pile.remove(tds);
    }

    public TDSstruct current() {
        return (TDSstruct) pile.get(pile.size() - 1);
    }

    public TDSstruct current(int numid) {
        this.pile.add((TDSstruct) alltable.get(numid));
        return (TDSstruct) alltable.get(numid);
    }

    public int newTDS(int shift, TDSstruct numFather) {
        if (this.numid == 0) {
            TDSstruct tds = new TDSstruct(this.numid, numFather, pile.size(), shift);
            this.addtostack(tds);
            this.alltable.add(tds);
        } else {
            TDSstruct tds = new TDSstruct(this.numid, this.current(), pile.size(), shift);
            this.addtostack(tds);
            this.alltable.add(tds);
        }

        this.numid++;

        return (this.numid - 1);
    }

    public void depileTDS() {
        this.pile.remove(pile.size() - 1);
    }

    public void PrintAllTable() {

        for (Object w : alltable) {

            TDSstruct z = (TDSstruct) w;
            System.out.println("Affichage TDS");
            System.out.println(z.toString());
        }
    }

    public void PrintPile() {

        for (Object w : pile) {

            TDSstruct z = (TDSstruct) w;
            // System.out.println(z.toString());
        }
    }

    public ArrayList<TDSstruct> getPile() {
        return pile;
    }

    public boolean searchType(String name) {
        for (TDSstruct TDS : pile) {
            // System.out.println(TDS.getImbrication());
            for (Type var2 : TDS.getTableType()) {
                // System.out.println(var2.getName());

                if (var2.getName().equals(name)) {
                    return true;
                }

            }
        }

        return false;
    }

    public Type recupType(String name) {
        for (TDSstruct TDS : pile) {
            // System.out.println(TDS.getImbrication());
            for (Type var2 : TDS.getTableType()) {
                // System.out.println(var2.getName());
                if (var2.getName().equals(name)) {
                    return var2;
                } else {
                }
            }
        }

        return null;
    }

    public Var recupVar(String name) {

        for (TDSstruct TDS : pile) {
            // System.out.println(TDS.getImbrication());
            for (Var var2 : TDS.getTableTDS()) {
                // System.out.println(var2.getName());
                if (var2.getName().equals(name)) {
                    return var2;
                }
            }
        }

        return null;
    }

    public Var recupVar(String name, int num) {

        for (TDSstruct tds : this.alltable) {

            if (num == tds.getTableNum()) {

                for (Var var2 : tds.getTableTDS()) {
                    // System.out.println(var2.getName());
                    if (var2.getName().equals(name)) {

                        return var2;
                    }
                }

                if (tds.getNumFather() != null) {

                    return this.recupVar(name, tds.getNumFather().getTableNum());
                } else {

                    return null;
                }

            }
        }

        return null;

    }

    public int recupImbric(String name, int num, int i) { // i doit etre initialisé à 0;

        for (TDSstruct tds : this.alltable) {

            if (num == tds.getTableNum()) {

                for (Var var2 : tds.getTableTDS()) {
                    // System.out.println(var2.getName());
                    if (var2.getName().equals(name)) {
                        return i;
                    }
                }

                if (tds.getNumFather() != null) {
                    return this.recupImbric(name, tds.getNumFather().getTableNum(), i + 1);
                } else {

                    return -1;
                }
            }

        }

        return -1;

    }

    public boolean searchVar(String name) {

        for (TDSstruct TDS : pile) {
           // System.out.println("imbrication " + TDS.getImbrication());
            for (Var var2 : TDS.getTableTDS()) {
               // System.out.println(var2.getName());
                if (var2.getName().equals(name)) {
                   // System.out.println("le name " + name + " ne marche pas avec pile taille " + pile.size());
                    return true;
                }
            }
        }

        return false;
    }

    public int recupChainage(String name) {
        for (TDSstruct TDS : pile) {
            // System.out.println(TDS.getImbrication());
            for (Var var2 : TDS.getTableTDS()) {
                // System.out.println(var2.getName());
                if (var2.getName().equals(name)) {
                    return TDS.getImbrication();
                }
            }
        }

        return 0;
    }

    public int recupNumTable(String name) {
        for (TDSstruct TDS : pile) {
            // System.out.println(TDS.getImbrication());
            for (Var var2 : TDS.getTableTDS()) {
                // System.out.println(var2.getName());
                if (var2.getName().equals(name)) {
                    return TDS.getTableNum();
                }
            }
        }

        return 0;
    }

    public int getNumberofBlock() {
        return this.alltable.size();
    }

}