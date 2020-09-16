package accessmodifier.t;

public class MyClass {
        static public int X = 2;
        int A1 = X + 1;
        static {
            X = 1;
        }
        int A2 = X + 9;

//        static public void method() {
//            X = 5;
//        }

        public static void main(String[] args) {
            MyClass o = new MyClass();
//            System.out.println("X " + o.X);
//
//            MyClass.method();
//            System.out.println("X " + o.X);
//            MyClass.X = 10;

            System.out.println("X " + MyClass.X);
            System.out.println("A1 " + o.A1);
            System.out.println("A2 " + o.A2);

//            System.out.printf("x=%d, y=%d", o.X, MyClass.X);
        }
}
