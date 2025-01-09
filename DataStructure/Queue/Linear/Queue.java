package DataStructure.Queue.Linear;

public class Queue {


        private int size ;
        private int rear;
        private int front ;
        int[] nums ;

        Queue(int capacity){
            nums=new int[capacity];
            size=0;
            rear=-1;
            front=0;

        }

    // Enqueue operation
    public void enqueue(int value) {
        if (size == nums.length) {
            System.out.println("Queue is full!");
        } else {
            rear++;
            nums[rear] = value;
            size++;
        }
    }

    public void print() {
        for (int i = front; i <= rear;i++ ){
            System.out.print(nums[i] + " ");
        }
    }

    // Dequeue operation
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            int removedValue = nums[front];
            front++;
            size--;
            return removedValue;
        }
    }
}

