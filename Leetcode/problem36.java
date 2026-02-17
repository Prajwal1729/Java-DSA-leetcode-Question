package Leetcode;

import java.util.HashMap;

public class problem36 {

    public static int majorityElement(int nums[]){
    
       HashMap<Integer,Integer> map = countNums(nums);

       HashMap.Entry<Integer,Integer> majorityEntry = null;
       for(HashMap.Entry<Integer,Integer> entry: map.entrySet()){
         if(majorityEntry==null || entry.getValue() > majorityEntry.getValue()){
            majorityEntry = entry;
         }
       }

       return majorityEntry.getKey();

    }

    private static HashMap<Integer,Integer> countNums(int nums[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,3};

        int res = majorityElement(nums);
        System.out.println("the majority element in the array is: "+ res);
    }
}
