package Leetcode;

public class problem26 {

    public static String longestCommonPrefix(String arr[]){
       
        if(arr==null || arr.length == 0){
             return "";
        }

        String prefix = arr[0]; // first string in array

        for(int i =1;i<arr.length;i++){
            while(arr[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length() -1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }

        return prefix;

    }
    public static void main(String[] args) {
        
        String strs[] = {"Flow","Flower","Float","Flight"};
        String res = longestCommonPrefix(strs);

        System.out.println("The longest common prefix in the array of strings are: " + res);

       
    }
}
