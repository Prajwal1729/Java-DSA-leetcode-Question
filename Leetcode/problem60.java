package Leetcode;

import java.util.Stack;

public class problem60 {

    public static int[] maxTempratures(int temps[]){
        int n = temps.length;
        int ans[] = new int[n];

        Stack<Integer> s = new Stack<>();

        for(int i = 0;i<n;i++){
            while(!s.isEmpty() && temps[i] > temps[s.peek()]){
                int idx = s.pop();
                ans[idx] = i - idx;
            }

            s.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {73,74,75,71,69,72,76,73};
        int res[] = maxTempratures(nums);

        for(int n: res){
            System.out.print(n+" ");
        }

    }
}
