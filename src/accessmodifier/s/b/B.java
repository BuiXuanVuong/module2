package accessmodifier.s.b;

import accessmodifier.s.a.A;

public class B extends A {
    public static void main(String[] args) {
//        A a = new A();
        B b = new B();
//        A c = new B();
//        B e = (B) new A();
//        A g = (B) new A();
        b.index = 6;
        b.index1 = 10;
//        System.out.println("a " + a.index);
        System.out.println("b " + b.index);
//        System.out.println(c.index);
//        System.out.println("e " + e.index);
//        System.out.println(g.index);
    }
}
