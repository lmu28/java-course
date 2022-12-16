package collections.other;

import java.util.Stack;

public class StackEx {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(7);
        stack.push(0);
        stack.push(-10);
        stack.push(25);
        stack.push(2);
        stack.push(13);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());




    }


}
