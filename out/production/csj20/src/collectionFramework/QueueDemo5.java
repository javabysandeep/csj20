package collectionFramework;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo5 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();

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
