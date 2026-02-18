package Leetcode;

public class problem141 {

    public static int startingIndexGas(int arr[],int cost[]){

        int currAmount = 0;
        int totalAmount = 0;
        int startIndex = 0;

        for(int i = 0;i<arr.length;i++){
            currAmount+=arr[i] - cost[i];
            totalAmount+=arr[i] - cost[i];

            if(currAmount < 0){
                startIndex = i+1;
                currAmount = 0;
            }
        }

        return totalAmount < 0 ? -1 : startIndex;

    }
    public static void main(String[] args) {
        int gas[] = {1,2,3,4,5};
        int cost[] = {3,4,5,1,2};

        int res = startingIndexGas(gas, cost);
        System.out.println(res);
    }
}
