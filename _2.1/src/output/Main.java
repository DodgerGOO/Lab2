package output;

import logic.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("Stack elements:");
        for (Integer element : stack) {
            System.out.println(element);
        }
    }
}
