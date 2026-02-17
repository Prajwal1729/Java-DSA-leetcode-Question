package Leetcode;
import java.util.Arrays;

public class problem34 {

    public static void merge(int nums1[],int nums2[],int m,int n){
        int p1 = m-1,p2 = n-1,i=m+n-1;

        while(p2>=0){
            if(p1>=0 && nums1[p1] > nums2[p2]){
                nums1[i] = nums1[p1];
                p1--;
            }
            else{
                nums1[i] = nums2[p2];
                p2--;
            }
            i--;
        }
    }
    public static void main(String[] args) {
        
        int nums1[] = {1,3,5};
        int nums2[] = {2,4,6};
      
        int m = nums1.length;
        int n = nums2.length;

        // Resize nums1 to hold the merged elements
        nums1 = Arrays.copyOf(nums1, m + n);
        merge(nums1, nums2, m, n);
        System.out.println("The merged array is: ");
        for(int num: nums1){
            System.out.print(num+" ");
        }

        
    }
}
