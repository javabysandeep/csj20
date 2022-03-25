package stringHandling;

public class ReverseString {
    public static void main(String[] args) {
        String str = "cyber success";
        char[] chars = str.toCharArray();
        for (int left = 0, right = chars.length - 1; left < right; left++, right--) {
            char ch = chars[left];
            chars[left] = chars[right];
            chars[right] = ch;
        }
        for(char ch:chars){
            System.out.print(ch);
        }
       /* for (int i = str.length()-1; i >=0 ; i--) {
            rev = rev + str.charAt(i);
        }*/


    }
}
