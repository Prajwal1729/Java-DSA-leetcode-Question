package Leetcode;

public class problem50 {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    public static Node addTwoNumbers(Node l1 ,Node l2){
          Node dummy = new Node(0);
          Node ans = dummy;
          int carry = 0;

          while(l1!=null || l2!=null || carry!=0){
            int x = (l1!=null) ? l1.data : 0;
            int y = (l2!=null) ? l2.data : 0;

            int sum = carry+x+y;
            carry = sum/10;

            ans.next = new Node(sum%10);
            ans = ans.next;

            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
          }

          return dummy.next;

    }
    public static void main(String[] args) {
        
    }
}
