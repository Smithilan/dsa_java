package DataStructure.Stack;

public class Stack {

    int[] nums = new int[5];
    int top;
    int size;

    public Stack() {
        top = -1;
        size = nums.length;
    }

    public void push(int i) {
        if (top < size - 1) {
            //top ++
            nums[++top] = i;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public int pop() {

        if (top >= 0) {

            return nums[top--];
            //top--

        } else {
            System.out.println("Stack underflow");
            return -1;
        }
    }

    public int peek() {
        if (top >= 0) {
            return nums[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

}
