package stringHandling;

public class OutOfMemory {
    public static void main(String[] args) {
        for (long i = 0; i < Long.MAX_VALUE; i++) {
            String str = "";
        }
    }
}
