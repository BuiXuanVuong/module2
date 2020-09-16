package Inharitance;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.p(10);
        a.p(10.0);
        A a1 = (A) new B();
        B b = new A();

        a1.p(50);
    }
}

class A extends B {
    public void p(double number) {
        System.out.println(number);
    }
}

class B {
    public void p(int number) {
        System.out.println(number * 2);
    }
}