package collectionFramework;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(10);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(40);
        arrayList2.add(50);
        arrayList2.add(60);
        arrayList2.add(70);
        arrayList2.add(10);
        arrayList.addAll(arrayList2);

        System.out.println(arrayList);
        arrayList2.remove(Integer.valueOf(70));
        arrayList2.remove(Integer.valueOf(60));
        System.out.println("After removal of elements from list2");
        System.out.println(arrayList);
        System.out.println("list2");
        System.out.println(arrayList2);
        arrayList2.add(100);
        System.out.println("Find "+arrayList.containsAll(arrayList2));

        //40,50,100
        arrayList.retainAll(arrayList2);
        System.out.println("Retain");
        System.out.println(arrayList);
    }
}
