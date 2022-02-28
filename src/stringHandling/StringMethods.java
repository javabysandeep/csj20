package stringHandling;

public class StringMethods {
    public static void main(String[] args) {
        String str = new String("Late comers are supposed to pay 500 penalty.");
        str = str.toUpperCase();
        System.out.println(str);
        System.out.println("Length "+str.length());
        String[] words = str.split(" ");
        System.out.println("Total words "+words.length);
        /*for (String temp:words) {
            System.out.print(temp+ " ");
        }*/

        String str2 = new String("     cyber success     ");
        char[] charArray = str2.toCharArray();

        System.out.println(str2.contains("cyber"));

        str2 = str2.trim();
        System.out.println(str2);

        String str3 = "How How many objects are created";
        str3 = str3.replace("How", "What");
        System.out.println(str3);


    }
}
