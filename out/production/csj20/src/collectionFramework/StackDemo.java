package collectionFramework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        /*for (int i:stack) {
            System.out.println(i);
        }*/
        // check who is on the top
        System.out.println("On Top "+stack.peek());
        System.out.println("Size of an stack "+stack.size());
        System.out.println("Search "+stack.search(50));

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
