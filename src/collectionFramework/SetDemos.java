package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

public class SetDemos {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(35);
//        set.add(null);
//        set.add("String");

        Set set2 = new HashSet();
        set2.addAll(set);

//        set.remove(null);
//        set.removeAll(set2);
//        set.removeIf((obj->(Integer)obj%2==0));
        System.out.println(set.contains(null));
        System.out.println(set.containsAll(set2));
        System.out.println(set);
        System.out.println(set2);
        System.out.println("Size "+set.size());
        Iterator iterator = set.iterator();
        System.out.println(iterator.next());
    }
}
