package collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue((o1, o2) -> {
            Integer integer1 = (Integer) o1;
            Integer integer2 = (Integer) o2;
            return integer2 - integer1;
        });

        queue.add(160);
        queue.add(60);
        queue.add(11);
        queue.add(22);
        queue.add(31);
        queue.add(50);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
