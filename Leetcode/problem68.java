package Leetcode;
import java.util.LinkedList;
import java.util.Queue;
public class problem68 {

    class MyStack{
        private Queue<Integer> q1;
        private Queue<Integer> q2;

        public MyStack(){
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }

        public void push(int val){
            q2.offer(val);

            while(!q1.isEmpty()){
                q2.offer(q1.poll());
            }

            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        public int pop(){
            return q1.poll();
        }

        public int top(){
            return q1.peek();
        }
    }
    public static void main(String[] args) {
        // implement stack using 2 queues //
    }
}
