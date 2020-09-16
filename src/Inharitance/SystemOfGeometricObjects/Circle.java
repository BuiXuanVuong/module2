package Inharitance.SystemOfGeometricObjects;

class Circle extends Shape {
    private double radius;
    public Circle() {
        this.radius = 1;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        setColor(color);
        setFilled(filled);
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius " + radius + ", which is a subclass of " + super.toString();
    }

}
