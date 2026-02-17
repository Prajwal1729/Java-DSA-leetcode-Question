package Leetcode;

public class problem49 {
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

    public static Node removeNthNode(){

        Node dummy = new Node(0);
        Node first = dummy;
        Node second = dummy;

        dummy.next = head;
        int n = 2;


        for(int i=1;i<=n+1;i++){
            first = first.next;
        }

        while(first!=null){
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        
        return dummy.next;
    }

    public static void printLinkedList(){
        Node curr = head;

        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);
        printLinkedList();
        
    }
}
