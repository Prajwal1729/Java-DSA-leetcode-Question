package Leetcode;


public class problem48 {
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

        if(head == null){
            head = newNode;
        }

        else{
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = newNode;
        }

    }

    public static Node mergeTwoList(Node l1,Node l2){
        Node dummy = new Node(1);
        Node merge = dummy;
        while(l1!=null && l2!=null){
            if(l1.data <= l2.data){
                merge.next = l1;
                l1 = l1.next;
            } 
            else{
                merge.next = l2;
                l2 = l2.next;
            }
            merge = merge.next;
        }

        if(merge.next==l1 && l1==null){
            merge.next = l2;
        }
        else{
            merge.next = l1;
        }

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

        // addNode(1);
        // addNode(2);
        // addNode(4);
        // printLinkedList();

        
        // addNode(1);
        // addNode(3);
        // addNode(4);

        // LinkedList<Integer> l1 = new LinkedList<>();
        // LinkedList<Integer> l2 = new LinkedList<>();

        // l1.add(1);
        // l1.add(2);
        // l1.add(4);


        // l2.add(1);
        // l2.add(3);
        // l2.add(4);
        
        
        // Node mergelist = mergeTwoList(l1, l2);
        // System.out.println();

        
    }
}
