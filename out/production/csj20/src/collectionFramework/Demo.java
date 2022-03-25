package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        System.out.println(arrayList);// this will print the content not hashcode
        System.out.println(arrayList.size());// 0: gives the no. of elements
        System.out.println(arrayList.isEmpty());// true: return size==0;

        System.out.println(arrayList.add(10));//true
        System.out.println(arrayList.add("Some string"));//true
        arrayList.add(0,40);// at given index
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());//false

        Collection anotherContainer = new ArrayList();
        anotherContainer.add(11);
        anotherContainer.add(12);
        anotherContainer.add(13);
        arrayList.addAll(0,anotherContainer);// adds another collection into existing one
        System.out.println(arrayList);
        System.out.println(arrayList.contains(13));//true: checks the existence of a single element
        System.out.println(arrayList.containsAll(anotherContainer));//true: checks the existence of a collection


        List list3 = new ArrayList();
        list3.add(111);
        list3.add(222);
        list3.add(333);

        List list4 = new ArrayList();
        list4.add(444);
        list4.add(555);
        list4.add(666);
        list4.add(666);

        list3.addAll(list4);
        System.out.println(list3.contains(666));
        System.out.println(list3.containsAll(list4));


        //remove the element
        System.out.println(list4.remove(2));//takes index to delete
        System.out.println(list4.remove(Integer.valueOf(444)));//takes index to delete
        System.out.println(list4);

    }
}
