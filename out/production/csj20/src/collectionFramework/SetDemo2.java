package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(35);

        //iterate: enhanced
        for (Object obj:set) {
            System.out.println(obj);
        }

        // Iterator
        System.out.println("Iterator way");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
