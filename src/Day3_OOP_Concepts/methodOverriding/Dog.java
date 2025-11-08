package Day3_OOP_Concepts.methodOverriding;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark.. Bark..");
    }
}
