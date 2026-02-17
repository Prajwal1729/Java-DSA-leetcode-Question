package Leetcode;

import java.util.Stack;

public class problem66 {

    public static int areaLargestRectangleInHistogram(int arr[],int w){
        Stack<Integer> st = new Stack<>(); 
        int area = 0;

        for(int i =0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                int height = arr[st.pop()];
                int width = i - (st.isEmpty() ? 0 : st.peek() + 1);

                 area = Math.max(area,height*width);
            }
            st.push(i);
        }

        return area;
    }
    public static void main(String[] args) {
        int nums[] = {2,1,5,6,2,3};
        int width = 1;

        int area = areaLargestRectangleInHistogram(nums, width);
        System.out.println("The area of largest rectangle that which can histogram form is: "+ area);
    }
}
