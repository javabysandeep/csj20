package stringHandling;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeatChar {
    public static void main(String[] args) {
        String str = "abcabcddezfge";
        char[] chars = str.toCharArray();
        firstNonRepeatCharSol1(chars);
        firstNonRepeatCharSol2(chars);

    }

    private static int firstNonRepeatCharSol2(char[] chars) {
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if(map.containsKey(chars[i])){
                map.put(chars[i], map.get(chars[i])+1);
            } else{
                map.put(chars[i], 1);
            }
        }
        for (int i = 0; i <map.size() ; i++) {

        }
        return -1;
    }

    private static int firstNonRepeatCharSol1(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            int counter = 0;
            for (int j = 0; j < chars.length; j++) {
                if (i != j && chars[i] == chars[j]) {
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println("first non-repeat char " + chars[i]);
                return i;
            }
        }
        return -1;
    }
}
