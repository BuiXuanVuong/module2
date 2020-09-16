package Inharitance;
class Cylinder extends Circle {
    private double height;
    Cylinder() {
    }
    Cylinder(double height, double radius, String color) {
        setColor(color);
        setRadius(radius);
        this.height = height;
    }
    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "A Cylinder has " + height + " has volume " + getVolume() + super.toString();
     }
}
