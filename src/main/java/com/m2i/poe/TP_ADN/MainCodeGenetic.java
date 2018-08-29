package com.m2i.poe.TP_ADN;


public class MainCodeGenetic {

    public static void main(String[] args) {

        Nucleotide n1 = new Nucleotide ( "A" );
        System.out.println(n1.toString () ); //imprime le donne de nucleotide
        System.out.println(n1.getApparie(false));

        System.out.println(n1.getComplementary ());


        Nucleotide u = new Nucleotide ( "U" );
        System.out.println(u);//Instantiation de nucleotide
        Nucleotide g = new Nucleotide ( "G" );
        System.out.println(g);
        Nucleotide t = new Nucleotide ( "T" );
        System.out.println(t);
        Nucleotide c = new Nucleotide ( "C" );
        System.out.println(c);
       //RNA rna = new RNA ();
       //rna.add ( u ); //liason de RNA et main


    }
}