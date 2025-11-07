import Day2_OOP_Basics.methodOverloading.Calculator;
import Day3_OOP_Concepts.inheritance.singleInheritance.Student;

public class Main {
    public static void main(String[] args) {

//        Day 1

//         System.out.println("Hello and welcome!");

//        VariablesAndDataTypes obj1 = new VariablesAndDataTypes();
//        obj1.printAge();

//        Operators obj2 = new Operators();
//        obj2.operations();

//        Conditionals obj3 = new Conditionals();
//        obj3.printGrade(50);

//        Loops obj4 = new Loops();
//        obj4.forLoop();
//        obj4.whileLoop();

//        Functions obj5 = new Functions();
//        int result = obj5.demo(14,5);
//        System.out.println(result);

//        ClassesAndObjects obj6 = new ClassesAndObjects();
//        obj6.demoMain();


//        Day 2

//        DefaultConstructors c1 = new DefaultConstructors();
//        c1.display();

//        ParameterizedConstructors c2 = new ParameterizedConstructors("Bipin", 25);
//        c2.displayStudentDetails();

//        Account e1 = new Account("Bipin", 0);
//        Account e2 = new Account("Sanbi", 2000);
//        Account e3 = new Account("Bisan)", 2000);

//        System.out.println("Before: ");
//        e1.showDetails();
//        e2.showDetails();
//        e3.showDetails();

//        e1.deposit(5000);
//        e2.withdraw(500);
//        e3.deposit(900);

//        System.out.println("After: ");
//        e1.showDetails();
//        e2.showDetails();
//        e3.showDetails();

//        Calculator calc = new Calculator();
//        System.out.println("\nSum of two integers: " + calc.add(5, 10));
//        System.out.println("\nMethod overloading - Changing the Number of Parameters");
//        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));
//        System.out.println("\nMethod overloading - Changing Data Types of Parameters");
//        System.out.println("Sum of two decimal numbers: " + calc.add(5.5, 8.2));
//        System.out.println("\n\nMethod overloading - Changing the Order of Parameters");
//        calc.student("Bipin", 1);
//        calc.student(2, "Sanbi");

        Student s1 = new Student("Bipin", "25", "LEC");
        s1.showCollege();
    }
}