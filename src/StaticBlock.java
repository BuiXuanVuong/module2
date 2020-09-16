public class StaticBlock {
    public static String X;
    public static int Y = 6;

    public static void main(String[] args) {
        System.out.println("Main is invoked");
        System.out.println("X: " + X);
        System.out.println("Y: " + Y);
    }

    static {
        System.out.println("Static Block 1 is invoked");
        X = "Hello!";
    }

    static {
        System.out.println("Static Block 2 is invoked ");
        Y = 8;
    }
}
