package com.m2i.poe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalMain  {
    public static void main (String[] args) {
        Function <Double, Double> f = x-> x + 1;
        System.out.println(f.apply(1.0));
        Function <Double, Boolean> predicat = x -> x<10;   //f(x)=x<10
        //expression lambda
        ArrayList<Double> l= new ArrayList<> ( Arrays.asList (2.0, 47.0, 72.0, 9.0, 45.0, 65.0, 50.0, 20.0, 46.0, 53.0));

        /*List<Double> res= new ArrayList<>();
        for (double d:l) {
            if (d<10)  {
                res.add(d);
            }
        }*/

        //res=l.stream ().filter (x-> x<10).collect(Collectors.toList () );
        Stream<Double> stream= l.stream ().filter(x-> x<10);
        stream= l.stream ().filter(x->x<10).filter(x-> x>2); //Lazy loading  , le filtre est un cas particulier de map
        //res= stream.collect(Collectors.toList ()); //Declanche le lazy loading

        //map
        stream =l.stream ().map(x-> x+1) ;//Aplique x+1 (function matematique) sur chaque element de la list
        stream = l.stream ().map(x-> Math.cos(x));  //Applique la function coseno
        stream= l.stream ().map(x->Math.cos(x)).filter(x-> Math.abs(x)<0.5); //donne la signal
        Stream<Boolean> stream2=l.stream().map(x-> x<10);
        System.out.println(stream2.collect (Collectors.toList ()));

        //1 Creer une collection de 10 doubles
        //2 Filtrer les chiffres pairs
        //3 Filtrer les chiffres pairs+ appliquer un cos
        //4 Filtrer les nombres premiers
        //5 Filtrer les nombres pairs + appliquer une tan +filtrer les positifs = superier a cero

        stream=l.stream ().filter ( x-> x%2==0); //1
        System.out.println(stream.collect (Collectors.toList()));

        stream=l.stream ().filter(x-> x%2==0).map(x->Math.cos(x));
        System.out.println(stream.collect (Collectors.toList()));

        stream=l.stream ().filter ( x-> x%2==0).map ( x-> Math.tan ( x )).filter(x-> x<0);
        System.out.println(stream.collect (Collectors.toList()));

        //Reduce  , la reduction doit abaisse de 1, ex sume, addition
        double i=l.stream ().mapToDouble ( x-> x ).sum (); // mapToDouble convert a int into double
        i=l.stream().mapToDouble(x-> x).reduce ( 0, (x,y) -> x+y );
        System.out.println(i);

    }

    public static double f(double d) {
            return d + 1;
    }

}