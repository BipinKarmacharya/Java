package Day1_JavaBasics;

public class Loops {
    public void forLoop() {
        for (int i =0; i < 10; i++) {
            for (int j = 10; j > i; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void whileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
}
