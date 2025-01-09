package DataStructure.Queue.Circular;

public class CircularQueueMain {
    public static void main(String args[]){

        Queue queue = new Queue(5);

        queue.enqueue(6);
        queue.enqueue(6);
        queue.enqueue(6);
        queue.enqueue(6);
        queue.enqueue(6);

        System.out.println("Deleted Value "+ queue.dequeue());
        queue.dequeue();
        queue.dequeue();


        queue.display();

    }
}
