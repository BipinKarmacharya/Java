package Day3_OOP_Concepts.inheritance.singleInheritance;

public class Person {
    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println("Name: " + name + ", Age: " +age);
    }
}
