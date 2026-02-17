package Leetcode;

public class problem98 {

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

        public static int maxPathSum(Node root){

            if(root==null){
                return 0;
            }

            int max = Integer.MIN_VALUE;

            int leftSum = Math.max(0,maxPathSum(root.left));
            int rightSum = Math.max(0,maxPathSum(root.right));


            int currsum = root.data + leftSum + rightSum;
            max = Math.max(leftSum + rightSum + root.data, max);
            return Math.max(currsum, Math.max(leftSum, rightSum));
        }

    }
    public static void main(String[] args) {

        Node root = null;
        root = Node.insert(root, 1);
        root = Node.insert(root, 2);
        root = Node.insert(root, 3);

        Node.preOrder(root);

        int res = Node.maxPathSum(root);
        System.out.println("\n"+res);
        
    }
}
