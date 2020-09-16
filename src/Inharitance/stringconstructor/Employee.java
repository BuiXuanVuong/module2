package Inharitance.stringconstructor;

class Employee extends Person {

    Employee() {
        this("Employee overloading its tasks");
        System.out.println("Employee performing its tasks!");
    }

    Employee(String s) {
        System.out.println(s);
    }
}
