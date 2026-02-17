package Leetcode;

public class problem38 {
    public static int rotatedSortedArray(int nums[]){
       
        int l = 0;
        int r = nums.length - 1;
        int ans = nums[0];

        if(nums.length == 1){
            return nums[0];
        }

        while(l<=r){
            if(nums[l] < nums[r]){
                ans = Math.min(ans,nums[l]);
            }
            int mid = (l+r)/2;
            ans = Math.min(ans,nums[mid]);
            if(nums[l] <= nums[mid]){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }

        return ans;

    }
    public static void main(String[] args) {
        int nums[] = {3,4,5,1,2};
        int res = rotatedSortedArray(nums);
        System.out.println("The minimum value in rotated sorted array is: "+ res);
        
    }
}
