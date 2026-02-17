package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class problem86 {

   public static List<List<Integer>> ans = new ArrayList<>();
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

         // level order traversal //

         public static void order(Node root,int level){
             if(ans.size() == level){
                 ans.add(new ArrayList<>());
             }

             ans.get(level).add(root.data);

             if(root.left!=null){
                order(root.left, level+1);
             }

              if(root.right!=null){
                order(root.right, level+1);
             }

         }

         //----------------------------//

         public static List<List<Integer>> levelOrder(Node root){
            if(root==null){
                return ans;
            }

            order(root, 0);
            return ans;

         }
         
    }
    public static void main(String[] args) {

        Node root = null;

        root = Node.insert(root, 3);
        root = Node.insert(root, 9);
        root = Node.insert(root, 20);
        root = Node.insert(root, 15);
        root = Node.insert(root, 7);

        System.out.println("the pre order traversal is: ");
        Node.preOrder(root);
        System.out.println();

        System.out.println("The level order traversal is; ");
       List<List<Integer>> list =  Node.levelOrder(root);
       System.out.println(list);



        
    }
}
