package Leetcode;

public class problem89 {

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

         // subtree of another tree //
         public static boolean isSubTree(Node root,Node subRoot){

            if(root==null){
                return false;
            }

            if(isSame(root, subRoot)){
                return true;
            }

            return isSubTree(root, subRoot.left) || isSubTree(root.right, subRoot);
              
         }

        // helper //
         public static boolean isSame(Node r1,Node r2){
            if(r1==null && r2==null){
                return true;
            }

            if(r1==null || r2==null){
                return false;
            }

            if(r1.data!=r2.data){
                return false;
            }

            return isSame(r1.left, r2.left) && isSame(r1.right, r2.right);

         }

         //----------------------------//
    
    }
    public static void main(String[] args) {

        

        
    }
}
