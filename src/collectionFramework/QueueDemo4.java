package collectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo4 {
    public static void main(String[] args) {
        Comparator<String> comparator = Comparator.comparingInt(String::length);
        Queue<String> queue = new PriorityQueue(comparator);

        queue.add("Swapnil");
        queue.add("Saurabh");
        queue.add("Sanket");
        queue.add("Shantu");
        queue.add("vaishanv");
        queue.add("Guru");
        queue.add("Akash");
        queue.add("Rahul");
        queue.add("Shubham");

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());


    }
}
