package com.m2i.poe.TP_ADN;


import java.util.ArrayList;

public class RNA {

    private ArrayList<Nucleotide> strand=new ArrayList<>();


    public void setStrand(ArrayList<Nucleotide> strand) {
        this.strand= strand;
    }

    public String toString() {
        String res = "";
        for(Nucleotide a : strand) {
            res += a.getSymbol();
        }
        return res;
    }

    public ArrayList<Nucleotide> getStrand() {
        return strand;
    }

    public void add(Nucleotide n1) { ///Methode add
        this.getStrand().add(n1);
    }


}
