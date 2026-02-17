package Leetcode;

public class problem125 {

    public static int robHousesCircle(int arr[]){
        int n = arr.length;

        int rob1 = 0;
        int rob2 = 0;

        int max1 = arr[0];
        int max2 = 0;

        for(int i = 0;i<n-1;i++){
            max1 = Math.max(rob1+arr[i],rob2);
            rob1 = rob2;
            rob2 = max1;
        }

        rob1 = 0;
        rob2 = 0;

        for(int i = 1;i<n;i++){
            max2 = Math.max(rob1+arr[i],rob2);
            rob1 = rob2;
            rob2 = max2;
        }

        return Math.max(max1,max2);

    }
    public static void main(String[] args) {
        // rob houses II //
        int arr[] = {1,2,3,1};
        int res = robHousesCircle(arr);
        System.out.println(res);
    }
}
