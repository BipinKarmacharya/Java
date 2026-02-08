import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");  // --> 19
        int age = scan.nextInt();   // age = 19

        if (age > 18) {   // 19 > 18   --> true
            System.out.println("You are eligible to vote");
        } else if (age > 16 ){
            System.out.println("You are adult but not eligible to vote.");
        } else {
            System.out.println("You are not eligible!!");
        }

        System.out.println("This is outside if condition!!");
    }
}
