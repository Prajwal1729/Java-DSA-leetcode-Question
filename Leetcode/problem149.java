package Leetcode;
import java.util.Arrays;

public class problem149 {

    public static int meetingRoomsII(int arr[][]){
        if(arr.length == 0){
            return 0;
        }

        
        int start[] = new int[arr.length];
        int end[] = new int[arr.length];

        for(int i = 0;i<arr.length;i++){
            start[i] = arr[i][0];
            end[i] = arr[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int startPointer = 0;
        int endPointer = 0;
        int res = 0;

        while(startPointer < start.length){
            if(start[startPointer] >= end[endPointer]){
                res--;
                endPointer++;
            }

            res++;
            startPointer++;
        }

        return res;
      
    }
    public static void main(String[] args) {
        int arr[][] = {{0,30},{5,10},{15,20}};
        int res = meetingRoomsII(arr);
        System.out.println(res);
    }
}
