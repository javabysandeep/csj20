package stringHandling;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("some value");
        StringBuilder stringBuilder2 = new StringBuilder("some value");
        //two objects are created inside the heap

        stringBuilder1.append('A');
        stringBuilder1.append(100.0f);
        stringBuilder1.append(" string appended at last");
        stringBuilder1.insert(0,"At the beginning ");
        stringBuilder2.replace(0,10, "cyber");
        stringBuilder2.deleteCharAt(0);
        stringBuilder2.delete(0, 3);
        System.out.println(stringBuilder2);
        System.out.println(stringBuilder1);

        StringBuilder sb = new StringBuilder();
        sb.append("capacity and size demo");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        String str = new String(sb);
        StringBuilder sb1 = new StringBuilder(str);

    }
}
