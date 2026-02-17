package Leetcode;

import java.util.ArrayList;

public class problem94 {
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

        public static ArrayList<Integer> inOrder(Node root,ArrayList<Integer> arr){
             if(root==null){
                return arr;
             }

             inOrder(root.left, arr);
             arr.add(root.data);
             inOrder(root.right, arr);

             return arr;
        }

        public static int kthSmallestElementBST(Node root,int k){

            ArrayList<Integer> nums = inOrder(root, new ArrayList<>());
            return nums.get(k-1);
        }
    }
    public static void main(String[] args) {

        Node root = null;
        root = Node.insert(root, 3);
        root = Node.insert(root, 1);
        root = Node.insert(root, 4);
        root = Node.insert(root, 2);

        Node.preOrder(root); 
        System.out.println();
        int k = 2;

        int res = Node.kthSmallestElementBST(root,k);
        System.out.println(res);
           

        
    }
}
