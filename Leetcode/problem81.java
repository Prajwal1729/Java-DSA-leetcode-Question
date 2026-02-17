package Leetcode;

public class problem81 {

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

        public static int maxDepthBST(Node root){
            if(root == null){
                return 0;
            }

            int leftDepth = maxDepthBST(root.left);
            int rightDepth = maxDepthBST(root.right);

            return Math.max(leftDepth, rightDepth) + 1;
        }

    }
    public static void main(String[] args) {
        // Trees //
        // General Tree, Binary Tree, Ternary Tree, N-ary Tree, BST //
        Node root = null;
        root = Node.insert(root, 9);
        root = Node.insert(root, 3);
        root = Node.insert(root, 15);
        root = Node.insert(root, 20);
        root = Node.insert(root, 7);

        // In-order Traversal
        System.out.println("In-order Traversal:");
        Node.inOrder(root);
        System.out.println();

        int res = Node.maxDepthBST(root);
        System.out.println("The maximum depth of BST is: "+ res);
       
    }
}
