package collectionFramework;

import java.util.HashMap;
import java.util.HashSet;

public class OccurenceOfEachCharacter {
    public static void main(String[] args) {
        String str = "cyber success";
        str = str.trim().toLowerCase();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (Character ch : str.toCharArray()) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        System.out.println(hm);
    }
}
