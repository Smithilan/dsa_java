package DataStructure.Queue.Linear;

public class LinearQueueMain {
public static void main(String args[]) {

    Queue queue = new Queue(4);

    queue.enqueue(3);
    queue.enqueue(3);
    queue.enqueue(3);
    queue.enqueue(3);
    queue.enqueue(3);

    System.out.println("Delete Value is " + queue.dequeue());
    queue.print();
    }
}