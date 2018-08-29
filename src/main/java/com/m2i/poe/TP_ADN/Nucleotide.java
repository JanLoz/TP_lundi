package com.m2i.poe.TP_ADN;

public class Nucleotide {
    public boolean getStrand;
    private String symbol;
    private String name;
    private String family;
    private String apparie;
    private String complementary;

    public Nucleotide () {

    }

    public Nucleotide (String symbol) {
        this.symbol=symbol;
        if (symbol.equals ( "A" )) {
            name= "Adenine";
            family= "Purine" ;
        } else if (symbol.equals ( "C" )) {
            name="Cytosine";
            family=  "Pyrimidine" ;
        } else if (symbol.equals ( "G" )) {
            name="Guanine" ;
            family = "Purine" ;
        } else if (symbol.equals ( "T" )) {
            name= "Thymine" ;
            family= "Pyrimidine" ;
        } else {
           System.out.println("Error"+ " "+ symbol);
        }
    }

    public Nucleotide getApparie (boolean isRna) {
        if (symbol.equals ( "A" )) {
            if (isRna) {
                return new Nucleotide ( "U" );
            } else {
                return new Nucleotide ( "T" );
            }
        } else if (symbol.equals ( "T" )) {
            return new Nucleotide ( "A" );
        } else if (symbol.equals ( "C" )) {
            return new Nucleotide ( "G" );
        } else if (symbol.equals ( "G" )) {
            return new Nucleotide ( "C" );
        } else if (symbol.equals ( "A" )) {
            return new Nucleotide ( "U" );
        } else {
            return null;
        }
    }


    public String toString () {
        return (symbol+ ""+ name+ "" + apparie + ""+ family);
    }


    public void setApparie(String apparie) {
        this.apparie = apparie;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getComplementary() {
        return complementary;
    }

    public void setComplementary(String complementary) {
        this.complementary = complementary;
    }
}
