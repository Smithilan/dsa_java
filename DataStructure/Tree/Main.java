package DataStructure.Tree;



public class Main {
    public static void main(String args[]){
        Tree tree = new Tree();
        tree.insert(8);
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(2);

        tree.inorder();

    }
}
