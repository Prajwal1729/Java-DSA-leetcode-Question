package Leetcode;

import java.util.LinkedList;

 class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class problem40 {

   public static ListNode sortList(ListNode head){
         if(head==null || head.next==null){
            return null;
         }

         ListNode mid = getMid(head);
         ListNode left = sortList(head);
         ListNode right = sortList(mid);

         return merge(left,right);
   }

   private static ListNode getMid(ListNode head){
      ListNode prev = null;
      while(head!=null && head.next!=null){
        prev = (prev==null) ? head : (ListNode) prev.next;
        head = head.next.next;
      }
      ListNode mid = prev.next;
      prev.next = null;
      return mid;
   }

   private static ListNode merge(ListNode l1,ListNode l2){
       ListNode dummy = new ListNode(0);
       ListNode tail = dummy;

       while(l1!=null && l2!=null){
           if(l1.val < l2.val){
              tail.next = l1;
              l1 = l1.next;
           }
           else{
                tail.next = l2;
                l2 = l2.next;
           }

           tail = tail.next;
       }

       tail.next = (l1!=null) ? l1 : l2;
       return dummy.next;
   }
    public static void main(String[] args) {
        LinkedList<Integer> values = new LinkedList<>();
        values.add(4);
        values.add(2);
        values.add(1);
        values.add(3);

        // Convert LinkedList<Integer> to ListNode
        ListNode head = null, tail = null;
        for (int val : values) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

        ListNode sorthead = sortList(head);

        while(sorthead!=null){
            System.out.print(sorthead.val+" ");
            sorthead = sorthead.next;
        }
        System.out.println();





    }
}
