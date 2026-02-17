package Leetcode;

public class problem42 {

    public static int minimumSpeed(int nums[],int h){
        int l = 0;
        int r = nums.length - 1;

        while(l<r){
            int mid = (l+r)/2;
            int time = 0;

            for(int n:nums){
                time+= Math.ceil((double)n/mid);
            }

            if(time > h){
               l = mid+1;

            }
            else{
              r = mid-1;
            }
            
        }
        return l;

           
    }
    public static void main(String[] args) {
       int nums[] = {30,11,23,4,20};
       int h = 6;
       int speed = minimumSpeed(nums, h);
       System.out.println("Minimum speed: " + speed);
    }
}
