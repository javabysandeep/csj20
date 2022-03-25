package stringHandling;

public class StringMethodsRevision {
    public static void main(String[] args) {
        String str = "java online training";
        str = str.toUpperCase();
        System.out.println(str);

        String str2 = "    paytm par 5000 received   ";
        str2 = str2.trim();
        System.out.println(str2);

        char c = str2.charAt(10);
        System.out.println(c);

        boolean isEmpty = str2.isEmpty();
        System.out.println(isEmpty);

        String replace = str2.replace("5000", "350");
        System.out.println(replace);

        String str4 = "Students are not studying";
        String[] strings = str4.split(" ");
        System.out.println(strings);
        for (String temp : strings) {
            System.out.println(temp);
        }
        //substring
        String substring = str4.substring(10);
        System.out.println(substring);

        //length of string
        int noOfCharsInString = str4.length();
        System.out.println(noOfCharsInString);

        // Get array of characters from a given string
        char[] chars = str4.toCharArray();

        for (char ch : chars) {
            System.out.println(ch);
        }

        for (int i = 0; i < 5; i++) {

        }

        CharSequence charSequence = str4.subSequence(0, 10);
        System.out.println(charSequence);

        //concat
        String str5 = "java";
        String str6 = str5.concat(" programming");
        System.out.println(str6);

        int intValue = 1234567;
        String intToString = String.valueOf(intValue);
        System.out.println(intToString);

        int index = str5.indexOf("v");
        System.out.println(index);

        System.out.println(str5.startsWith("j"));
        System.out.println(str5.endsWith("a"));

        int[] intArr = new int[1000];
        for (int i = 0; i < intArr.length; i++) {

        }
        for (int t : intArr) {
            System.out.println(t);
        }

    }
}
