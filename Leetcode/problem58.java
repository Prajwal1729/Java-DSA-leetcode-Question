package Leetcode;

public class problem58 {

    static class Node{
        int data;
        int min;
        Node next;

        Node(int data,int min,Node next){
            this.data = data;
            this.min = min;
            this.next = next;
        }
    }

    static class MinStack{
        private Node head;

        MinStack(){

        }

        public void push(int val){
            if(head==null){
              head = new Node(val,val,null);
            }
            else{
                head = new Node(val,Math.min(val,head.min),head);
            }
        }

        public void pop(){
            head = head.next;
        }

        public int top(){
            return head.data;
        }

        public int getMin(){
            return head.min;
        }
    }
    public static void main(String[] args) {

    
    }
}
