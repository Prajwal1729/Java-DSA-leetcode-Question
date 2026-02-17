package Leetcode;


public class problem45 {

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

        public static void addFirst(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public static void reverseLinkedList(){
          Node prev = null;
          Node curr = head;
          Node next;

          while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
    
          }
          head = prev;

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

       reverseLinkedList(); // reversed a linked list
       printLinkedList();


    }
}
