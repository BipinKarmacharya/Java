package Day4_CollectionsFramework.listInterface;

import java.util.LinkedList;

public class LinkedLists {
    public void result() {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");

        System.out.println(tasks);

        tasks.addFirst("Urgent task");

        System.out.println(tasks);

        tasks.add(2, "Inserted task");
        System.out.println(tasks);

        System.out.println(tasks.get(2));

        System.out.println(tasks.reversed());

    }
}
