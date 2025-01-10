package DataStructure.Tree;

 class Node{
     int data;
     Node left;
     Node right;

     public Node(int data){
         this.data=data;
     }
 }
public class Tree {
     Node root=null;

     public void insert(int data){
         root = insertRecord(root,data);
     }

    private Node insertRecord(Node root, int data) {
         if (root ==null){
             root=new Node(data);
         } else if (data< root.data) {
             root.left=insertRecord(root.left,data);

         } else if (data> root.data) {
             root.right=insertRecord(root.right,data);

         }

         return root;
    }


    public void inorder() {
         inorderRecord(root);

    }

    private void inorderRecord(Node root) {
        if (root != null) {
            inorderRecord(root.left);
            System.out.print(root.data + " ");
            inorderRecord(root.right);
        }

    }
}
