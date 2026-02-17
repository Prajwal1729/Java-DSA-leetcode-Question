package Leetcode;

public class problem84 {

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

         public static void preOrder(Node root){
            if(root!=null){
                System.out.print(root.data+" ");
                preOrder(root.left);
                preOrder(root.right);
            }
         }

         public static Node invertBinaryTree(Node root){
             if(root == null){
                return null;
             }

             Node left = invertBinaryTree(root.left);
             Node right = invertBinaryTree(root.right);

             root.left = right;
             root.right = left;
             return root;
         }
    }
    public static void main(String[] args) {

        Node root = null;
        root= Node.insert(root, 4);
        root= Node.insert(root, 2);
        root= Node.insert(root, 7);
        root= Node.insert(root, 1);
        root= Node.insert(root, 3);
        root= Node.insert(root, 6);
        root= Node.insert(root, 9);


        System.out.println("The inorder traversal is: ");
        Node.preOrder(root);
        System.out.println();

        System.out.println("The invert binary tree is: ");
        Node.invertBinaryTree(root);


         
    }
}
