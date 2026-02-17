package Leetcode;

public class problem39 {

     public static int searchInRotatedSortedArray(int nums[],int tar){
        int l = 0;
        int r = nums.length - 1;
        int ans = nums[0];

        while(l<=r){
            int mid = (l+r)/2;

            if(nums[mid]==tar){
                return mid;
            }

            if(nums[l] < nums[mid]){
                if(tar >= nums[l] && tar<nums[mid]){
                    r = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
            else{
                if(tar > nums[mid] && tar<nums[r]){
                    l = mid+1;
                }
                else{
                    r = mid -1;
                }
            }

            ans = Math.min(ans,nums[mid]);
            mid++;
            
        }
        return ans;
     }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int tar = 0;

        int res = searchInRotatedSortedArray(nums, tar);
        System.out.println("The given element lie at index: "+ res);
    }
}
