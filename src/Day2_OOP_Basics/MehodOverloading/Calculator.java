package Day2_OOP_Basics.MehodOverloading;

public class Calculator {
    public int  add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public void student (String name, int roll) {
        System.out.println("Name = :" + name + ", Roll no = " + roll);
    }

    public void student(int roll, String name) {
        System.out.println("Roll no = " + roll + ", Name = " + name);
    }
}
