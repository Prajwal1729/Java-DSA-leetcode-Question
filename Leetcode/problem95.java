package Leetcode;
import java.util.ArrayList;
import java.util.List;

public class problem95 {

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

        public static Node removeLeaves(Node root,List<Integer> leaves){
            if(root==null){
                return null;
            }

            if(root.left==null && root.right==null){
                leaves.add(root.data);
                return null;
            }
            root.left = removeLeaves(root.left,leaves);
            root.right = removeLeaves(root.right,leaves);

            return root;

        }

        public static List<List<Integer>> leavesOfBST(Node root){
            List<List<Integer>> res = new ArrayList<>();
            while(root!=null){
                List<Integer> leaves = new ArrayList<>();
                root = removeLeaves(root,leaves);
                res.add(leaves);
            }

            return res;
            
        }

    }
    public static void main(String[] args) {
       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.right = new Node(6);

       List<List<Integer>> res = Node.leavesOfBST(root);
       System.out.println(res);
    }
}
