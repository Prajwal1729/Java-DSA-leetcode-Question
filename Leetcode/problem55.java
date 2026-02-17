package Leetcode;

public class problem55 {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    public static Node reverseNodesGroup(Node l1,int k){
        if(l1==null){
            return null;
        }

        Node curr = l1;
        Node currtail = null;
        Node newHead = null;

        while(curr!=null){
            int count = 0;
            curr = l1;
            
            while(count < k && curr!=null){
                curr = curr.next;
                count++;
            }

            if(count==k){
                Node revHead = reverseLinkedList(l1,k);

                if(newHead==null){
                    newHead = revHead;
                }

                if(currtail!=null){
                    currtail.next = revHead;
                }

                currtail = l1;
                l1 = curr;
            }
        }

        if(currtail!=null){
            currtail.next = l1;

        }
        return newHead == null ? l1:newHead;

    }

    public static Node reverseLinkedList(Node l,int k){
        Node curr = l;
        Node newHead = null;

        while(k>0){
           Node nextNode = curr.next;
           curr.next = newHead;
           newHead = curr;
           curr = nextNode;

           k--;
        }
        
        return newHead;
    }
    public static void main(String[] args) {
        
    }
}
