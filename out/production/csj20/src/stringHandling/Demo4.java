package stringHandling;

public class Demo4 {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = new String("abcd");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        str2 =  str2.intern();//this method gets reference from SCP
        System.out.println(str1 == str2);

        //To-DO
//        String[] strArr = {"shubham","shubham", "aniket"};
//        System.out.println(strArr[0]);
    }
}




















