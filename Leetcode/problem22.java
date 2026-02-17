package Leetcode;

public class problem22 {

    public static int trappingRainWater(int height[]){
        int n = height.length;
        int l = 0;
        int r = n-1;
        int water = 0;
        int leftMax = height[0];
        int rightMax = height[r];
        
        while(l<r){
            if(height[l] < height[r]){
                leftMax = Math.max(leftMax, height[l]);
                if(leftMax - height[l] > 0){
                    water = water + leftMax - height[l];
                }
                l++;
            }
            else{
                rightMax = Math.max(rightMax,height[r]);
                if(rightMax - height[r] > 0){
                    water = water + rightMax - height[r];
                }
                r--;
            }
        
        }
        return water;
    }
    public static void main(String[] args) {

        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int res = trappingRainWater(height);

        System.out.println("The water it can trap after raining is: "+ res);
        
    }
}
