// import java.util.LinkedList;
public class dsa3 {

    static class Node {
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

    public static void deleteNode(int data){
        if(head == null){
            return;
        }

        if(head.data == data){
            head = head.next;
            return;
        }
        Node curr = head;
        while(curr.next!=null && curr.next.data!=data){
            curr = curr.next;
        }
        if(curr.next == null){
            return;
        }
        curr.next = curr.next.next;
    
    }

    public static void printLinkedList(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // LinkedList nums = new LinkedList<>();
        // nums.add(1);
        // nums.add(2);
        // nums.add(5);
        // nums.add(67);
        // nums.add(199);
        // nums.addFirst(23);

        // System.out.print(nums+" ");
        // System.out.println(nums.get(2));
        // System.out.println(nums.peek());
        // System.out.println(nums.peekLast());

        addNode(90);
        addNode(100);
        addNode(89);
        addNode(178);
        addNode(45);
        printLinkedList();

        deleteNode(89);
        printLinkedList();

        addFirst(7);
        printLinkedList();
  

     

      
        
    }
}
