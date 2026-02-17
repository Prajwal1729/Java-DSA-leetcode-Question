package Leetcode;

public class problem92 {

    public static Integer prev;
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

        public static boolean isValidBST(Node root){
            prev = null;
            return inOrderBST(root);
        }

        public static boolean inOrderBST(Node root){
            if(root==null){
                return true;
            }

            if(!inOrderBST(root.left)){
                return false;
            }

            if(prev!=null && root.data <= prev){
               return false;
            }

            prev = root.data;
            return inOrderBST(root.right);
        }

    }
    public static void main(String[] args) {

        Node root = null;
        root = Node.insert(root, 2);
        root = Node.insert(root, 1);
        root = Node.insert(root, 3);

        Node.inOrder(root);
    
        Boolean res = Node.isValidBST(root);
        System.out.println(res);


    }
}
