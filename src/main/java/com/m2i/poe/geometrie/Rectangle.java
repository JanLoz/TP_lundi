package com.m2i.poe.geometrie;

public class Rectangle {

    //Why
    private double width; //declaration parameters
    private double heigth;
    private Point origin = new Point(0,0); //relation 1

    public Rectangle(double width, double height) {
        this.width = width;
        this.heigth = heigth;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    public double setSurface() {
        return width*heigth;
    }
}