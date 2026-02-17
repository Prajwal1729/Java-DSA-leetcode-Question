package Leetcode;
import java.util.Arrays;
import java.util.Comparator;
public class problem41 {

    public static String largestNumber(int nums[]){
       String [] strs = new String[nums.length];

       for(int i=0;i<strs.length;i++){
          strs[i] = String.valueOf(nums[i]);
       }

       Arrays.sort(strs,new Comparator<String>(){
         public int compare(String s1,String s2){
            String o1 = s1+s2;
            String o2 = s2+s1;
            return o2.compareTo(o1);
         }
       });

       if(strs[0].equals("0")){
        return "0";
       }

       StringBuilder sb = new StringBuilder();

       for(String numasStr: strs){
          sb.append(numasStr);
       }

       return sb.toString();
    }
    public static void main(String[] args) {
       int nums[] = {10,2};
       String res = largestNumber(nums);
       System.out.println("The largest Number that can be form is: "+ res);
    }
}
