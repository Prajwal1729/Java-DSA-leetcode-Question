package Leetcode;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class problem97 {


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

        public static String recserializeBST(Node root,String str){

            if(root==null){
                str+=null;
            }
            else{
                str+=String.valueOf(root.data) + ',';

                str = recserializeBST(root.left, str);
                str = recserializeBST(root.right, str);
            }

            return str;
        }

        public static String serializeBST(Node root){

            return recserializeBST(root, "");

        }

        public static Node redeserializeBST(List<String> str){
            if(str.get(0).equals("null")){
                str.remove(0);
                return null;
            }

            Node root = new Node(Integer.valueOf(str.get(0)));
            str.remove(0);
            root.left = redeserializeBST(str);
            root.right = redeserializeBST(str);

            return root;

        }

        public static Node deserializeBST(String data){

          String strArray[] = data.split(",");
          List<String> strlist = new LinkedList<>(Arrays.asList(strArray));
          return redeserializeBST(strlist);

        }
    }
    public static void main(String[] args) {
        Node root = null;
        root = Node.insert(root, 0);
        
    }
}
