package DataStructure.LinkedList;

public class Main {

    public static void main(String args[]){

        LinkedList nums =new LinkedList();
        nums.add(5);
        nums.add(2);

        nums.addFirst(3);

        nums.deleteValue(2);
        nums.printvalues();


    }
}
