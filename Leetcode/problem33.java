package Leetcode;

public class problem33 {

    public static int[] firstlastPositionOfElement(int arr[],int tar){
        int n = arr.length;

        int l = 0;
        int r = n-1;

        while(l<=r){
            int mid = (l+r)/2;

            if(arr[mid]==tar){
                return new int[]{mid-1,mid};
            }
            else if(arr[mid] < tar){
                l = mid+1;
                
            }
            else{
                r = mid-1;
                
            }
            
        }

        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int tar = 8;

        int res[] = firstlastPositionOfElement(arr, tar);
        System.out.println("The first position of the array is: " + res[0]);
        System.out.println("The last position of the array is: " + res[1]);

    
    }
}
