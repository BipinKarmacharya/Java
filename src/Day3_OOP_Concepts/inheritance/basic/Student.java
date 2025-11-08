package Day3_OOP_Concepts.inheritance.basic;

public class Student extends Person {
    public String college;

    public void showCollege() {
        System.out.println("College: " + college);
    }
}
