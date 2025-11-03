package Day2_OOP_Basics.constructors;

public class ParameterizedConstructors {
    String studentName;
    int studentAge;

    public ParameterizedConstructors (String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public void displayStudentDetails() {
        System.out.println("The name of Student is: " + studentName +" and age is : " + studentAge);
    }
}
