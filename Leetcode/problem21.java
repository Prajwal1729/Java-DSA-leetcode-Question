package Leetcode;

public class problem21 {
    
    public static int maximumAmountWater(int height[]){
        int n = height.length - 1;

        int l = 0;
        int r = n;
        int maxArea = 0;

        while(l < r){
            int ht = Math.min(height[l],height[r]);

            int width = r - l;
            int area = ht*width;
            maxArea = Math.max(area,maxArea);

            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
        }

        return maxArea;
        
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        int res= maximumAmountWater(height);

        System.out.println("The maximum amount of water in container is: "+ res);
    }
}
