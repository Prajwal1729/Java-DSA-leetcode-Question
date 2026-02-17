package Leetcode;

public class problem44 {

    public static float medianSortedArrays(int nums1[],int nums2[]){
       
        int m = nums1.length;
        int n = nums2.length;
        int merged[] = new int[m+n];

        int i =0,j=0,k=0;

        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                merged[k++] = nums1[i++];
            }
            else{
                merged[k++] = nums2[j++];
            }
        }

        while(i<m){
            merged[k++] = nums1[i++];
        }

        while(j<n){
            merged[k++] = nums2[j++];
        }

        if(merged.length % 2==0){
            int mid1 = merged.length/2;
            int mid2 = mid1-1;
            return (merged[mid1] +merged[mid2])/2.0f;
        }
        else{
            int mid1 = merged.length/2;
            return merged[mid1];
        }

    }
    public static void main(String[] args) {
        
        int nums1[] = {1,2};
        int nums2[] = {3,4};

        float res = medianSortedArrays(nums1, nums2);
        System.out.println("The median of two sorted array is: "+ res);

    }
}
