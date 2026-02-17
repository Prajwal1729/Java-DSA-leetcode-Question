package Leetcode;

public class problem51 {
    
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

    public static void reOrderLinkedList(Node n1){
        if(n1==null){
            return;
        }

        Node slow = head;
        Node fast = head;


        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        Node curr = slow;
        Node next;


        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

       Node f = n1, s = prev;

       while(s.next!=null){
           next = f.next;
           f.next = s;
           f = curr;

           next = s.next;
           s.next = f;
           s = curr;
       }

    }

   
    public static void printLinkedList(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
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
