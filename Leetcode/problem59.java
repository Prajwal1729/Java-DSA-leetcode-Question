package Leetcode;
import java.util.Stack;

public class problem59 {
    
    static class MaxStack{
        private Stack<Integer> stack;
        private Stack<Integer> maxStack;

        MaxStack(){
            stack = new Stack<>();
            maxStack = new Stack<>();
        }

        public void push(int val){
            int max = maxStack.isEmpty() ? val : Math.max(maxStack.peek(),val);
            stack.push(val);
            maxStack.push(max);
        }

        public int pop(){
            maxStack.pop();
            return stack.pop();
        }

        public int top(){
            return stack.peek();
        }

        public int peekMax(){
            return maxStack.peek();
        }

        public int popMax(){
            int max = peekMax();
            Stack<Integer> buffer = new Stack<>();

            while(top()!=max){
                buffer.push(pop());
            }

            pop();
            while(!buffer.isEmpty()){
                push(buffer.pop());
            }

            return max;
        }
    }
    public static void main(String[] args) {
        
    }
}
