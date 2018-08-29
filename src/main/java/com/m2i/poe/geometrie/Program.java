package com.m2i.poe.geometrie;


public class Program {

    public static void main(String[] args) {
        Point p1=new Point(); //Instanciation  : objet
        Point p2=new Point();
        p1.setX(3);
        p1.setY(4);
        p1.display();
        p1.moveTo(5,-2);
        p1.display();
        p1.moveRelative(-1,-1);
        p1.display();
    }

}

