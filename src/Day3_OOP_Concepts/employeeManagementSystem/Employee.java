package Day3_OOP_Concepts.employeeManagementSystem;

public abstract class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void calculateBonus();

    public void showDetails() {
        System.out.println(name + " earns " + salary);
    }
}
