package stringHandling;

class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("a b c  b a"));
    }
    public static boolean isPalindrome(String s) {
        String str = s.trim().replace(" ","").toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);

        //to do: remvoe non-alphanumeric
        //https://leetcode.com/tag/string/
        //https://leetcode.com/problems/valid-palindrome/
    }
}