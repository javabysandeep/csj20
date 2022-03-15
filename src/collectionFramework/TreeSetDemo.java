package collectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set set = new TreeSet<>();
        set.add(101);
        set.add(20);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(10);
       // set.add("String");
        //set.add(null);
        System.out.println(set);
    }
}
