package Leetcode;

import java.util.HashMap;

public class problem53 {

    static class Node{
        int data;
        Node next;
        Node random;

        Node(int data){
            this.data = data;
            this.next = null;
            this.random = null;
        }
    }

    static Node head;

    static HashMap<Node,Node> visNode = new HashMap<>();
    public static Node deepCopyLinkedList(Node n1){
         if(n1==null){
            return null;
         }

         if(visNode.containsKey(n1)){
            return visNode.get(n1);
         }

         Node newNode = new Node(n1.data);

         visNode.put(n1,newNode);
         newNode.next = deepCopyLinkedList(n1);
         newNode.random = deepCopyLinkedList(n1);

         return newNode;
    }
    public static void main(String[] args) {
        
    }
}
