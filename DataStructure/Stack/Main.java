package DataStructure.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.printStack();
        stack.push(60);

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());




        System.out.println();
        stack.printStack();
        System.out.println();
        System.out.println(stack.peek());
    }
}


