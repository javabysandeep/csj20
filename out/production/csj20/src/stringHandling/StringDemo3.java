package stringHandling;

public class StringDemo3 {
    public static void main(String[] args) {
        byte[] arr = {65, 66, 67, 98};
        String byteArray = new String(arr);
        System.out.println(byteArray);

        char[] charArray = {'A','B','C','D'};
        String str1 = new String(charArray,2,2);
        System.out.println(str1);
    }
}
