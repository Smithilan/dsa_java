package DataStructure.LinkedList;

class Node{
    int data;
    Node next;

   public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class LinkedList {
    Node head =null;

    public void add(int data){
        Node newNode = new Node(data);

        Node current = head;
        if(head == null)
            head = newNode; // If the list is empty, set the new node as the head
        else {
            // Traverse to the end of the list
            while (current.next != null) {
                current = current.next;
            }
            // Link the new node to the end
            current.next = newNode;
        }
    }

    public void addFirst(int i) {


        Node newNode1 = new Node(i);

        newNode1.next = head;
        head=newNode1;

    }

    public void printvalues() {
        Node current = head;

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public void deleteValue(int i) {
        Node current = head;

        while (current.next != null && current.next.data != i){
            current= current.next;
        }

        if(current.next != null){

            current.next = current.next.next;
        }
    }
}
