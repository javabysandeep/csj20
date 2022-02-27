package stringHandling;

public class StringDemo1 {
    public static void main(String[] args) {
        char[] chars = {'C','B','Y','E','R'};
        String str = new String(chars);
        System.out.println(str.toString());
        System.out.println(str.length());
        int[] arr = new int[10];
        System.out.println(arr);
        /*char[] arr = new char[0];
        System.out.println(arr.length);
        System.out.println(arr[0]);*/

        // way2: literal way
        String str2 = "cyber success";
    }
}
