package com.m2i.poe.TP_ADN;

import java.util.ArrayList;

public class DNA {

    private ArrayList<Nucleotide> strand = new ArrayList<>();

    public DNA() {
    }

    public DNA(String code) {
        for(char c : code.toCharArray()) {
            Nucleotide b = new Nucleotide (String.valueOf(c));
            if(c == 'U') {
                System.out.println("U is forbidden in DNA");
            }
            strand.add(b);
        }
    }

    public String toString() {
        String res = " ";
        for(Nucleotide b : strand) {
            res += b.getSymbol();
        }
        return res;
    }

    public ArrayList<Nucleotide> getComplementary() {
        ArrayList<Nucleotide> res = new ArrayList<>();
        for(Nucleotide b : strand) {
            res.add(b.getApparie(false));
        }
        return res;
    }

}
