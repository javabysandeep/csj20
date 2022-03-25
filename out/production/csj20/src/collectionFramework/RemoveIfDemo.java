package collectionFramework;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIfDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(21);
        arrayList.add(30);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);

        arrayList.remove(Integer.valueOf(10));
        System.out.println(arrayList);
        System.out.println("Remove IF");

        Predicate temp = (t) -> {
            Integer t1 = (Integer) t;
            if (t1 % 2 == 0) return true;
            return false;
        };
        arrayList.removeIf((obj) -> (Integer) obj % 2 == 0);
        arrayList.removeIf((obj) -> true);
        System.out.println(arrayList);

    }
}
