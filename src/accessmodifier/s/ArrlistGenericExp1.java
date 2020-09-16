package accessmodifier.s;

import java.util.ArrayList;

public class ArrlistGenericExp1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
//        list.add(true);
//        list.add("String");
        list.add(456);
        list.add(new Integer(789));
        System.out.println(list);
    }
}
