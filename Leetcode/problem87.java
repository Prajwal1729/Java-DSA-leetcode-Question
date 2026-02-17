package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class problem87 {

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

         // Zig-Zag level Order Order Traversal(BFS) //

         public static List<List<Integer>> zigZagLevelorder(Node root){

            List<List<Integer>> res = new ArrayList<>();
            if(root==null){
                return res;
            }


            LinkedList<Node> node_q = new LinkedList<>();
            node_q.addLast(root);
            node_q.addLast(null);

            LinkedList<Integer> level_list = new LinkedList<>();
            boolean is_order_left = true;

            while(!node_q.isEmpty()){
                Node currNode = node_q.pollFirst();

                 if(currNode == null){
                    res.add(level_list);
                    level_list = new LinkedList<>();
                    is_order_left = !is_order_left;

                    if(!node_q.isEmpty()){
                        node_q.addLast(null);
                    }
                    continue;
                }


                if(is_order_left){
                    level_list.addLast(currNode.data);
                }
                else{
                    level_list.addFirst(currNode.data);
                }

                if(currNode.left!=null){
                    node_q.addLast(currNode.left);
                }
                if(currNode.right!=null){
                    node_q.addLast(currNode.right);
                }
    
            }

            return res;
            
         }

         //----------------------------------//
    }
    public static void main(String[] args) {

        Node root = null;
        root = Node.insert(root, 3);
        root = Node.insert(root, 9);
        root = Node.insert(root, 20);
        root = Node.insert(root, 15);
        root = Node.insert(root, 7);

        Node.preOrder(root);

       System.out.println("The zig-zag level order traversal is: ");
        List<List<Integer>> ans = Node.zigZagLevelorder(root);
        System.out.println(ans);

        
    }
}
