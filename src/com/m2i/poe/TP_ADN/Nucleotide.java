package com.m2i.poe.TP_ADN;

public class Nucleotide {
    private char symbol;
    private String name;
    private String family;
    private String apparie;
    private String Nucleotide;
    private String complementaire;


    public Nucleotide (char symbol) {
        this.setSymbol(symbol);
        switch (symbol) {
            case 'A':
                this.setName("Adenine");
                this.setFamily("Purine");
                break;
            case 'C':
                this.setName("Cytosine");
                this.setFamily("Pyrimidine");
                break;
            case 'G':
                this.setName("Guanine");
                this.setFamily("Purine");
                break;
            case 'T':
                this.setName("Thymine");
                this.setFamily("Pyrimidine");
                break;
            case 'U':
                this.setName("Uracil");
                this.setFamily("Pyrimidine");
                break;
        }

    }

    public void display() {
        System.out.print(this.getComplementaire());
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setApparie(String apparie) {
        this.apparie = apparie;
    }

    public void setNucleotide(String nucleotide) {
        Nucleotide = nucleotide;
    }

    public void setComplementaire(String complementaire) {
        this.complementaire = complementaire;
    }

    public String getFamily() {
        return family;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public String getApparie() {
        return apparie;
    }

    public String getNucleotide() {
        return Nucleotide;
    }

    public String getComplementaire() {
        return complementaire;
    }
}
