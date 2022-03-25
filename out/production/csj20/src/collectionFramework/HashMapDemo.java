package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(101, "AKash");
        map.put(102, "AKash");
        map.put(103, "AKash");
        map.put(104, "AKash");
        map.put(105, "AKash");
        map.put(null, null);
        map.put(106, null);
        map.put("Key", null);
        System.out.println(map);

        Map map2 = new HashMap();
        map2.putAll(map);

        System.out.println("Get a value " + map2.get(105));
        System.out.println("contains a key " + map2.containsKey(105));
        System.out.println("contains a key " + map2.containsValue("AKash"));
        System.out.println("Size of an map " + map2.size());
        System.out.println("is empty " + map2.isEmpty());

        map2.remove(105);
        System.out.println(map2);

    }
}

interface I1 {
    interface I2 {
        void getKey();

        void getValue();
    }
}

class Child implements I1.I2 {

    @Override
    public void getKey() {

    }

    @Override
    public void getValue() {

    }
}