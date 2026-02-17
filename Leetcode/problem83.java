package Leetcode;

public class problem83 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
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

         public static boolean isSymmetric(Node root){
            if(root==null){
                return true;
            }
            return isMirror(root.left,root.right);
         }

         public static boolean isMirror(Node left,Node right){
            if(left==null && right==null){
                return true;
            }
            if(left==null || right==null){
                return false;
            }

            return (left.data == right.data) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
         }

        
    }
    public static void main(String[] args) {

        Node root = null;
        root = Node.insert(root, 1);
        root = Node.insert(root,2);
        root = Node.insert(root,3);
        root = Node.insert(root,4);
        root = Node.insert(root, 2);
        root = Node.insert(root, 4);
        root = Node.insert(root, 3);

        Node.inOrder(root);
        
    }
}
