package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class ReadArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(21);
        arrayList.add(40);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        // way 1
        System.out.println("way1 : traditional for loop");
        for (int index = 0; index < arrayList.size(); index++) {
            System.out.println(arrayList.get(index));
        }

        // way 2: enhanced for loop
        System.out.println("way2 : enhanced for loop");
        for (Object obj:arrayList) {
            System.out.println(obj);
        }

        // way 3: With the help of iterator
        Iterator iterator = arrayList.iterator();
        System.out.println("Way 3: using iterator");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
