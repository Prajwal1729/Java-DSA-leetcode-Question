package Leetcode;
import java.util.HashMap;
import java.util.Map;

public class problem96 {

    public static int preOrderIdx = 0;
    public static Map<Integer,Integer> inOrderIdx = new HashMap<>();

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



        public static Node constructBST(int preOrder[],int inOrder[]){

            for(int i = 0;i<inOrder.length;i++){
                inOrderIdx.put(inOrder[i],i);
            }

            return arrayToTree(preOrder, 0, preOrder.length -1);
               
        }

        public static Node arrayToTree(int preOrder[],int left,int right){

            if(left > right){
                return null;
            }

            int rootval = preOrder[preOrderIdx];
            preOrderIdx++;

            Node root = new Node(rootval);
            root.left = arrayToTree(preOrder, left, inOrderIdx.get(rootval) - 1);
            root.right = arrayToTree(preOrder,inOrderIdx.get(rootval) + 1,right);

            return root;
        }

    }
    public static void main(String[] args) {

        Node root = null;
        root = Node.insert(root, 3);
        root = Node.insert(root, 9);
        root = Node.insert(root, 20);
        root = Node.insert(root, 15);
        root = Node.insert(root, 7);
        
    }
}
