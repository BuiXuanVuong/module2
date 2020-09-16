package accessmodifier.s.b;

import accessmodifier.s.a.Student;

public class Basic extends Student {
    public static void main(String[] args) {
        Basic basicA = new Basic();
        System.out.println(basicA.id); // kết quả ra 001
        System.out.println(basicA.index);
    }
}
