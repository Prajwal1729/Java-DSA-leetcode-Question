package Leetcode;

public class problem47 {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    public static void addNode(int data){
        Node newNode = new Node(data);
        Node curr = head;

        if(head==null){
           head = newNode;
        }
        else{
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public static void printLinkedList(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static boolean hasCycle(){

        if(head==null){
            return false;
        }

         Node slow = head;
         Node fast = head.next;

         while(fast!=null || slow!=null){

            if(fast.next==null || fast==null){
                return false;
            }

             if(slow==fast){
                return true;
            }

            slow = slow.next;
            fast = fast.next.next;

         }

         return false;

    }

    public static void main(String[] args) {
        
        addNode(3);
        addNode(2);
        addNode(0);
        addNode(-4);

        printLinkedList();
        
    }
}
