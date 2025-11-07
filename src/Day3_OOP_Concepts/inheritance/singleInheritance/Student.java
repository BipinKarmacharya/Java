package Day3_OOP_Concepts.inheritance.singleInheritance;

public class Student extends Person{
    String college;
    public Student(String name, String age, String college) {
        super(name, age);
        this.college = college;
    }

    public void showCollege() {
        System.out.println("College: " +college);
    }
}
