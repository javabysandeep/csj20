package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveIterator {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(21);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Integer integer = (Integer) iterator.next();
            if(integer%2 !=0){
                iterator.remove();
            }
        }
        System.out.println(arrayList);



    }
}
