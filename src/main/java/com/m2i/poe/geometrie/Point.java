package com.m2i.poe.geometrie;

public class Point {

    //Quoi, Why? class=DATA
    private double x;
    private double y;

    public Point (double x, double y) {
    this.setX(x);
    this.setY(y);
    }

    public Point() {

    }
    //COMPORTEMENT

    void moveTo(double x, double y) {
        this.x=x;
        this.y=y;
    }

    void display() {
        System.out.print("(" + x + "," + y + ")\n");
    }

    void moveRelative(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}