package Leetcode;

public class problem85 {

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

          // height of left subtree and height of right subtree is less than or equal to 1 //
         public static boolean heightBalanceTree(Node root){
               if(root==null){
                 return true;
               }

               int leftHeight = getHeight(root.left);
               int rightHeight = getHeight(root.right);

               if(Math.abs(leftHeight - rightHeight) > 1){
                   return false;
               }

               return heightBalanceTree(root.left) && heightBalanceTree(root.right);

         }

        private static int getHeight(Node root){
            if(root==null){
                return 0;
            }

            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);

            return Math.max(leftHeight,rightHeight) + 1;
        }
    }
    public static void main(String[] args) {
        
    }
}
