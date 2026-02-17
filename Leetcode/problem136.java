package Leetcode;

public class problem136 {

    public static int maximumSubArray(int arr[]){

        int n = arr.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            currSum +=arr[i];
            maxSum = Math.max(maxSum,currSum);

            if(currSum < 0){
                currSum = 0;
            }
        }

        return maxSum;

    }
    public static void main(String[] args) {
        // greedy(Algorithm) problems //

        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int res = maximumSubArray(nums);
        System.out.println(res);


    }
}
