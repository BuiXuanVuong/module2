package Inharitance.SystemOfGeometricObjects;

import jdk.jfr.Frequency;

class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        setColor(color);
        setFilled(filled);
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimetere() {
        return  2 * (width + length);
    }
    @Override
    public String toString(){
        return "A Rectangle with width = " + width + " and length " + length + ", which is a subclass of " + super.toString();
    }
}
