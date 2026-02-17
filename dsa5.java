// import java.util.LinkedList;
// import java.util.Queue;

import javax.management.RuntimeErrorException;

public class dsa5 {

    private int arr[] = new int[5];
    private int front = 0;
    private int rear = -1;
    private int size = 0;


    public void enqueue(int data){

        if(!isFull()){
            rear = (rear + 1) % 5;;
            arr[rear] = data;
            size++;
        }
        else{
            System.out.println("Queue is full");
        }
        
    }

    public int dequeue(){

        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        int data = arr[front];
        front = (front + 1) % 5;
        size--;
        return data;
    }

    public boolean isFull(){
        return size==5;
    }

    public boolean isEmpty(){
        return size==0;
    }

    // public int peek(){
        // int data = arr[front];
        // return data;
    // }

    public void printQueue(){
        for(int n: arr){
            System.out.print(n+ " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        // Queue<Integer> q = new LinkedList<>();
        // q.add(10);
        // q.add(90);
        // q.add(78);
        // System.out.println(q+" ");
        // System.out.println(q.peek());
        // System.out.println(q.remove());
        // System.out.println(q.peek()); 

        dsa5 q = new dsa5();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(34);
        q.printQueue();
        System.out.println(q.dequeue());
        q.enqueue(56);
        q.printQueue();

    }
}
