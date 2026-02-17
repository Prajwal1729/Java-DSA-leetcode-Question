package Leetcode;

public class problem46 {

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

    public static Node middleNodeLinkedList(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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
        addNode(6);
        printLinkedList();

        // Middle node of linked list
        Node middleNode = middleNodeLinkedList();
        System.out.println("Middle Node: "+middleNode.data);
        printLinkedList();

        
    }
}
