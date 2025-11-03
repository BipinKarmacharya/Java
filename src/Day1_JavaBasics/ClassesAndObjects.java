package Day1_JavaBasics;

public class ClassesAndObjects {
    static class Student {
        String name;
        int age;

        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    public void demoMain() {
        Student s1 = new Student();
        s1.name = "Bipin";
        s1.age = 25;
        s1.display();

        Student s2 = new Student();
        s2.name = "Biyan";
        s2.age = 12;
        s2.display();
    }
}
