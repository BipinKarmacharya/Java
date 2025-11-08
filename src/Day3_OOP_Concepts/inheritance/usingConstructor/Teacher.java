package Day3_OOP_Concepts.inheritance.usingConstructor;

public class Teacher extends Person{
    String college;

    public Teacher(String name, int age, String college) {
        super(name, age);   // call parent constructor
        this.college = college;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", College: " +college);
    }
}
