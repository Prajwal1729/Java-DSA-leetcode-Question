package Leetcode;

public class problem35 {

    public static void sortColors(int nums[]){
        int l = 0,h=nums.length-1,curr = 0;

        while(curr<=h){
            if(nums[curr]==0){
                swap(nums,curr,l);
                l++;
                curr++;
            }
            else if(nums[curr]==2){
                swap(nums, curr, h);
                h--;
            }
            else{
                curr++;
            }
        }
    }

    private static void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        // dutch national flag algorithm //

        int nums[] = {1,2,0,0,1,1,2,1,2};
        sortColors(nums);

        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
