package Day2_OOP_Basics.constructors;

public class DefaultConstructors {
    String text;

    //Default Constructor
    public DefaultConstructors() {
        text = "Hi this is default constructor!";
    }

    public void display() {
        System.out.println(text);
    }
}

/* What is a Constructor?
A constructor is a special method that initializes an object when it is created.

Has the same name as the class
No return type
Called automatically when using new
*/