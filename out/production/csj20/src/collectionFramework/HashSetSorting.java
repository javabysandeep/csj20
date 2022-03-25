package collectionFramework;

import java.util.*;

public class HashSetSorting {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("collection");
        stringSet.add("exception handling");
        stringSet.add("multithreading");
        stringSet.add("file handling");

        Collections.sort(Arrays.asList(stringSet.toArray()), (o1, o2)->{
            String str1  = (String)o1;
            String str2  = (String)o2;
            return str1.compareTo(str2);
        });
        System.out.println(stringSet);
    }
}
