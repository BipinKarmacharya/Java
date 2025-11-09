package Day4_CollectionsFramework.setInterface;

import java.util.HashSet;

public class HashSets {
    public void result() {
        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Apple");   //Duplicate

        System.out.println(fruits); // Duplicates are ignored

        System.out.println(fruits.size());

        fruits.remove("Apple");

        System.out.println(fruits);

    }
}
