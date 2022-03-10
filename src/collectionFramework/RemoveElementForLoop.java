package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElementForLoop {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(21);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
       /* for (Object obj : arrayList) {
            if ((Integer) obj % 2 != 0) {
                arrayList.remove(obj);
            }
        }*/
       /* for (int index = 0; index < arrayList.size(); index++) {
            arrayList.remove(index);
        }*/
        /*for (Object obj:arrayList) {
            arrayList.remove(obj);
        }*/
        System.out.println(arrayList);
    }
}
