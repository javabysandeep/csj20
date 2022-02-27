package array;

public class ArrayChars {
    public static void main(String[] args) {
        char[] chars = {'C', 'Y', 'B', 'E', 'R'};
        System.out.println(isEmpty(chars));
        System.out.println(toLowerCase(chars));
        System.out.println(contains('c', chars));
        System.out.println(replace('c', 'b', chars));
    }

    private static boolean contains(char c, char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                return true;
            }
        }
        return false;
    }
    private static char[] replace(char oldChar, char newChar, char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == oldChar) {
                chars[i] = newChar;
                return chars;
            }
        }
        return chars;
    }

    private static char[] toLowerCase(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return chars;
    }

    private static boolean isEmpty(char[] chars) {
        return chars.length == 0;
    }
}
