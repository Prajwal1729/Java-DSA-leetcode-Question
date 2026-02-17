package Leetcode;

public class problem140 {
    
    public static boolean targetTriplets(int triplets[][],int tar[]){
        int maxValues[] = new int[3];

        for(int triplet[]: triplets){
            if(triplet[0] <= tar[0] && triplet[1] <= tar[1] && triplet[2] <= tar[2]){
                maxValues[0] = Math.max(maxValues[0],triplet[0]);
                maxValues[1] = Math.max(maxValues[1],triplet[1]);
                maxValues[2] = Math.max(maxValues[2],triplet[2]);

            }
        }

        if(maxValues[0] == tar[0] && maxValues[1] == tar[1] && maxValues[2] == tar[2]){
            return true;
        }
        
        return false;

    }


    public static void main(String[] args) {
        int arr[][] = {{2,5,3},{1,8,4},{1,7,5}};
        int tar[] = {2,7,5};
        System.out.println(targetTriplets(arr, tar));
    }
}
