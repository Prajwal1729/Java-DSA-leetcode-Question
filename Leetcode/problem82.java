package Leetcode;

public class problem82 {
    static class Node{
        int data;
        Node left;
        Node right;

         Node(int data){
            this.data = data;
         }

         public static Node insert(Node root,int data){
            if(root==null){
                root = new Node(data);
            }
            else if(data < root.data){
                root.left = insert(root.left, data);
            }
            else if(data > root.data){
                root.right = insert(root.right, data);
            }
            return root;
         }

         public static void inOrder(Node root){
            if(root!=null){
                inOrder(root.left);
                System.out.print(root.data+" ");
                inOrder(root.right);
            }
         }

         public static boolean isSameTree(Node root1,Node root2){
             if(root1==null && root2==null){
                return true;
             }

             Node r1 = root1.left;
             Node r2 = root2.left;
             Node r3 = root1.right;
             Node r4 = root2.right;

             if(r1==r2){
                return true;
             }
             else if(r3==r4){
                return true;
             }
             else{
                return false;
             }

         }
    }
    public static void main(String[] args) {

        Node root1 = null;
        root1 = Node.insert(root1, 1);
        root1 = Node.insert(root1, 2);
        root1 = Node.insert(root1, 3);

        Node.inOrder(root1);

        Node root2 = null;
        root2 = Node.insert(root2, 1);
        root2 = Node.insert(root2, 2);
        root2 = Node.insert(root2, 3);
        System.out.println();
        Node.inOrder(root2);

        boolean res = Node.isSameTree(root1,root2);
        System.out.println(res);




        
    }
}
