package Leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class problem67 {

private ArrayList<Integer> nums;

   public void MyQueue(){
      nums = new ArrayList<>();
   }

   public void push(int val){
      nums.add(val);
   }

   public Integer pop(){
      if(!isEmpty()){
        return nums.remove(nums.size()-1);
      }

      return null;
   }

   public Integer peek(){
        if(!isEmpty()){
            return nums.get(nums.size()-1);
        }

        return null;
   }

   public boolean isEmpty(){
      return nums.isEmpty();
   }
    public static void main(String[] args) {
        
        Stack<Integer> s1 = new Stack<>();

        s1.push(10);
        s1.push(20);
        s1.push(30);

        s1.pop();
        s1.pop();
        s1.peek();

        System.out.println("the popped element"+ s1);
        System.out.println("the peeked element is: "+s1);




    }
}
