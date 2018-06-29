package com.m2i.poe.shop;

public class Mainshop {

    public static void main (String [] args) {
        Media m =new Book("1", "Moby Dick",10, "Folio","Fiction" ); //create an object
        m= new Cd(); //faire pareil que la ligne precedent
        m= new Dvd ();
        System.out.println(m.getNetPrice());
        m.setPublisher(newPublisher(4, "Folio"));
        m.getAuthorList().add(new Author(5,"Hermann Merville"));

    }


}
