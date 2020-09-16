package oop.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan.toString());
        Fan fan1 = new Fan(3,true,5,"blue");
        System.out.println(fan1.toString());
    }
}
