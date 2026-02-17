package Leetcode;

public class problem91 {

    public static int diameter=0;
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


        // diameter of binary tree //

        public static int diameterOfBinaryTree(Node root){
            getHeight(root);
            return diameter;

        }

        public static int getHeight(Node root){
            if(root==null){
                return 0;
            }

            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);

            diameter = Math.max(diameter,leftHeight + rightHeight);

            return 1+ Math.max(leftHeight, rightHeight);
        }

        //-------------------------//
    }
    public static void main(String[] args) {
        
        Node root = null;
        root = Node.insert(root, 5);
        root = Node.insert(root, 4);
        root = Node.insert(root, 2);
        root = Node.insert(root, 3);
        root = Node.insert(root, 1);
        root = Node.insert(root, 6);

        int res = Node.diameterOfBinaryTree(root);
        System.out.println(res);

    }
}
