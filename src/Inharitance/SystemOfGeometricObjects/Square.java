package Inharitance.SystemOfGeometricObjects;

class Square extends Rectangle {
    private double side;
    public Square( double side) {
        setWidth(side);
        setLength(side);
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side =  side;
    }
    @Override
    public void setWidth(double side) {
        setWidth(side);
    }

    @Override
    public void setLength(double side) {
        setLength(side);
    }

    @Override
    public String toString(){
        return "A square with side = " + side + " , which is a subclass " + super.toString();
    }

}
