package Day3_OOP_Concepts.employeeManagementSystem;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonus() {
        System.out.println("Manager Bonus: " + (0.20 * salary));
    }
}
