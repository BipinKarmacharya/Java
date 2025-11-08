package Day4_CollectionsFramework.listInterface;

import java.util.ArrayList;

public class ArrayLists {
    public void result() {
        ArrayList<String> students = new ArrayList<>();

        students.add("Bipin");
        students.add("Sita");
        students.add("Gita");
        students.add("Madhav");


        System.out.println(students);   //  [Bipin, Sita, Ram]

        //  Access and Modify
        System.out.println(students.get(1));    //  Sita

        students.set(2, "Hari");
        System.out.println(students);


        //  Loop
        for (String s : students) {
            System.out.println("Student: " + s);
        }

        System.out.println("Size = " + students.size());

        students.remove(2);
        System.out.println(students);

        System.out.println("Size after removing data = " + students.size());
    }
}
