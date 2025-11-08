package Day3_OOP_Concepts.employeeManagementSystem;

public class Developer extends Employee{
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonus() {
        System.out.println("Developer bonus: " + (0.10 * salary));
    }
}
