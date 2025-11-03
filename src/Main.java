import Day1_JavaBasics.*;
import Day2_OOP_Basics.constructors.DefaultConstructors;
import Day2_OOP_Basics.constructors.ParameterizedConstructors;

public class Main {
    public static void main(String[] args) {

//        Day 1


//         System.out.println("Hello and welcome!");

        VariablesAndDataTypes obj1 = new VariablesAndDataTypes();
//        obj1.printAge();

        Operators obj2 = new Operators();
//        obj2.operations();

        Conditionals obj3 = new Conditionals();
//        obj3.printGrade(50);

        Loops obj4 = new Loops();
//        obj4.forLoop();
//        obj4.whileLoop();

        Functions obj5 = new Functions();
//        int result = obj5.demo(14,5);
//        System.out.println(result);

        ClassesAndObjects obj6 = new ClassesAndObjects();
//        obj6.demoMain();


//        Day 2

        DefaultConstructors c1 = new DefaultConstructors();
//        c1.display();

        ParameterizedConstructors c2 = new ParameterizedConstructors("Bipin", 25);
        c2.displayStudentDetails();

    }
}