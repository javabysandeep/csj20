package collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        //this method throws an expcetion if we try to remove the elements from a given empty queue
        // It throws NoSuchElementException
        //queue.remove();

        // //this method does not throw an exception if we try to remove the elements from a given empty queue
        // it returns a special value null.
        //System.out.println(queue.poll());

        // who is next?
        //peek()
//        queue.peek();
        //this method does not throw an exception if we try to examine[who's next] the elements from a given empty queue
        // it returns a special value null.

        // elements
        //this method throws an exception if we try to examine[who's next] the elements from a given empty queue
        // It throws NoSuchElementException
//        queue.element();
        queue.offer(null);

    }
}
