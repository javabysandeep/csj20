package collectionFramework;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(101, "A");
        map.put(102, "B");
        map.put(103, "C");
        map.put(104, "D");
        map.put(105, "E");
        map.put(106, "F");


        //only keys
        Set<Integer> keys = map.keySet();
        System.out.println("Only keys "+keys);

        //only values
        Collection<String> values = map.values();
        System.out.println("Only values "+values);

        //entrySet
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
