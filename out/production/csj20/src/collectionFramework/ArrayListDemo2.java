package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(101);
        arrayList.add(1);
        arrayList.add(-1);
        arrayList.add(0);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println("After sorting");
        System.out.println(arrayList);
        System.out.println("Reverse ");
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        List emptyList = Collections.EMPTY_LIST;
        Integer max = Collections.max(arrayList);
        System.out.println("max in arraylisyt "+max );


    }
}
