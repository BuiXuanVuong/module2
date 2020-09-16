package accessmodifier.t;


    class B {
        int cube(final int n) {
            int N = n + 1; // không thể thay đổi được khi n là final
            return N;
        }

        public static void main(String args[]) {
            B b = new B();
            System.out.println(b.cube(5));
        }
    }

