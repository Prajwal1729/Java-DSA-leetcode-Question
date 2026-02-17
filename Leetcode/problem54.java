package Leetcode;

import java.util.PriorityQueue;

public class problem54 {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node mergekSortedLinkedList(Node lists[]){
    
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(Node list: lists){
            while(list!=null){
                minHeap.add(list.data);
                list = list.next;
            }
        }
        Node dummy = new Node(1);
        Node merge = dummy;

        while(!minHeap.isEmpty()){
            merge.next = new Node(minHeap.remove());
        }

        return dummy.next;

    }
    public static void main(String[] args) {
        
    }
}
