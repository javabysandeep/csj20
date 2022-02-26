package array;

//Binary Search
public class BinarySearch {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int low = 0;
        int high = numbers.length - 1;
        int mid = (low + high) / 2;
        int key = 11;

        while (low <= high) {
            if (key < numbers[mid]) {
                high = mid - 1;
                mid = (low + high) / 2;
            } else if (key > numbers[mid]) {
                low = mid + 1;
                mid = (low + high) / 2;
            } else if (numbers[mid] == key) {
                System.out.println("Key is found at " + mid);
                break;
            }
        }

    }
}
