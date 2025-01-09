package DataStructure.Queue.Circular;

public class Queue {

    private int front;
    private int rear;
    private int size;
    int[] nums;

    Queue(int capacity){
        nums=new int[capacity];
        front=-1;
        rear=-1;
        size= 0;

    }

    // Enqueue operation
    public void enqueue(int value) {
        if ((rear + 1) % nums.length == front) {
            System.out.println("Queue is full!");
            return;
        } else if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % nums.length;
        nums[rear] = value;
        System.out.println("Inserted: " + value);
    }

    // Dequeue operation
    public int dequeue(){
        if(front == -1){
            System.out.println("Queue is empty");
            return -1;
        }

        int removedValue = nums[front];
        if(front == rear){
            front=rear=-1;
        } else {
            front =(front+1)% nums.length;
        }
        return removedValue;

    }

    // Display the queue
    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty!");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(nums[i] + " ");
            if (i == rear) break;
            i = (i + 1) % nums.length;
        }
        System.out.println();
    }
}


