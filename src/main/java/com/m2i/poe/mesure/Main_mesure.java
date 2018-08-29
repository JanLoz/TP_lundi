package com.m2i.poe.mesure;

import java.io.*;
import java.util.StringTokenizer;

public class Main_mesure {

    public static void main(String[] args) { ///lecture de fichier par ligne
        try {

            System.out.println(System.getProperty ( "user.dir" ));
            BufferedReader reader= new BufferedReader (new FileReader ( "mesures.csv" ));
            MesureRepository repo = new MesureRepository ();
            repo.load ( "mesures.csv" );
            System.out.println ( repo.getMesureList () );
            System.out.println ( repo.getDifferenceList () );
            System.out.println ( repo.getQuadraticList () );
            System.out.println ( repo.getTimeDifferenceErrorList ( 0.1 ) );
            System.out.println ( repo.getTimeQuadraticErrorList ( 0.01 ) );
        } catch (FileNotFoundException ex) {
            ex.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
