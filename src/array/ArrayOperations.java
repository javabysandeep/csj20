package array;

public class ArrayOperations {
    public static void main(String[] args) {
        Array array = new Array(10);
        array.insertElement(100, 0);
        array.insertElement(200, 0);
        array.insertElement(100, 2);
        array.insertElement(100, 3);
        array.traverse();
    }
}
