package Day4_CollectionsFramework.mapInterface;

import java.util.HashMap;

public class HashMaps {
    public void result() {
        HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Bipin");
        studentMap.put(102, "Sita");
        studentMap.put(103, "Madhav");

        System.out.println(studentMap);

        System.out.println(studentMap.get(102));    //Sita

        //Iterate
        for(Integer id : studentMap.keySet()) {
            System.out.println("ID: " + id + ", Name: " + studentMap.get(id));
        }
    }
}
