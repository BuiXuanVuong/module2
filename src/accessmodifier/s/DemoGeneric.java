package accessmodifier.s;

public class DemoGeneric {
    public static void main(String[] args) {
        Dictionary<String, String> d = new Dictionary<String, String>("Study","hoc");
        String english = d.getKey();
        String vietnamese = d.getValue();
        System.out.println(english + ": " + vietnamese);
    }
}
