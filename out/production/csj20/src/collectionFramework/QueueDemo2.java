package collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue();
        System.out.println(queue.add(10));
        System.out.println(queue.add(20));
        System.out.println(queue.offer(30));
        System.out.println(queue.offer(40));

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        System.out.println(queue.element());



    }
}
