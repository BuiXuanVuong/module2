package oop.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    void setA(double a){
        this.a = a;
    }

    public double getB() {
        return b;
    }

    void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    void setC(double c) {
        this.c = c;
    }


    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if(this.getDiscriminant() >= 0) {
            return (-b + Math.sqrt(getDiscriminant()))/2;
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if(this.getDiscriminant() >= 0) {
            return (-b - Math.sqrt(getDiscriminant()))/2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = scanner.nextDouble();
        System.out.println("Input b: ");
        double b = scanner.nextDouble();
        System.out.println("Input c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Root 1 = " + quadraticEquation.getRoot1());
            System.out.println("Root 2 = " +quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Root 1 = Root 2 = " + quadraticEquation.getRoot1() );
        } else {
            System.out.println("The quation has no roots");
        }
    }
}
