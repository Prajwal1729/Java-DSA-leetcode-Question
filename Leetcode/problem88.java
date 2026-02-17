package Leetcode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class problem88 {

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

         public static List<Integer> rightSideView(Node root){
            List<Integer> res = new ArrayList<>();
            if(root==null){
                return res;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while(!q.isEmpty()){
                int size = q.size();

                for(int i = 0;i<size;i++){
                    Node currNode = q.poll();
                    if(i == size - 1){
                        res.add(currNode.data);
                    }

                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }

            }

            return res;


         }
        }
    public static void main(String[] args) {

        Node root = null;

        root = Node.insert(root, 1);
        root = Node.insert(root, 2);
        root = Node.insert(root, 4);
        root = Node.insert(root, 5);
        root = Node.insert(root, 3);
        root = Node.insert(root, 6);
        root = Node.insert(root, 7);


        Node.preOrder(root);
        System.out.println();
        List<Integer> res = Node.rightSideView(root);
        System.out.println(res);


                
    }
}
