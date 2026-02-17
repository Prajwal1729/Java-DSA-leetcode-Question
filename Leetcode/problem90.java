package Leetcode;

public class problem90 {

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

         public static int goodNodesBinaryTree(Node root){
            return countGoodNodes(root,Integer.MIN_VALUE);
         }

         public static int countGoodNodes(Node root,int max){
            if(root==null){
                return 0;
            }

            int count = 0;
            if(root.data > max){
                count = 1;
                max = root.data;
            }

            count+=countGoodNodes(root.left, max);
            count+=countGoodNodes(root.right, max);

            return count;
        }


     }
    public static void main(String[] args) {

        Node root = null;
        root = Node.insert(root, 3);
        root = Node.insert(root, 1);
        root = Node.insert(root, 3);
        root = Node.insert(root, 5);
        root = Node.insert(root, 4);
        root = Node.insert(root, 2);

        Node.preOrder(root);
        System.out.println();
        
        int res = Node.goodNodesBinaryTree(root);
        System.out.println("The good nodes in the binary tree is: "+ res);

        
    }
}
