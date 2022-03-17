package collectionFramework;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(111, "A");
        map.put(12, "B");
        map.put(13, "C");
        map.put(1040, "D");
        map.put(1050, "E");
        map.put(106, "F");
        map.put(107, null);


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
