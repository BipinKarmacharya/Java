package Day3_OOP_Concepts.abstraction.interfaces;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car Starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped.");
    }
}
