package Leetcode;

public class problem56 {

    static class Node{
        int data;
        Node next;
        Node left;
        Node right;

        Node(int data,Node left,Node right){
            this.data = data;
            this.next = null;
            this.right = right;
            this.left = left;
        }
    }

    public static Node flattenTree(Node head){
        if(head == null){
            return null;
        }
 
        if(head.left == null && head.right==null){
            return head;
        }

        Node leftTail = flattenTree(head.left);
        Node rightTail = flattenTree(head.right);
        
        if(leftTail!=null){
            leftTail.right = head.right;
            head.right = head.left;
            head.left = null;
        }

       return rightTail == null ? leftTail : rightTail;


    }

    public static void flatten(Node root){
        flattenTree(root);
    }

    public static void main(String[] args) {
        
    }
}
