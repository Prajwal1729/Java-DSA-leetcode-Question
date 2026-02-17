package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class problem27 {

    // encode a list of strings to single string //
    public static String encode(List<String> strs){
         
         if(strs.size()==0){
            return Character.toString((char)258);
         }

         String sep = Character.toString((char)257);
         StringBuilder sb = new StringBuilder();

         for(String s: strs){
            sb.append(s);
            sb.append(sep);
         }

         sb.deleteCharAt(sb.length() -1);
         return sb.toString();
    }

    // decode a single string to list of strings //
    public static List<String> decode(String s){
        
        if(s.equals(Character.toString((char)258))){
            return new ArrayList<>();
        }

        String sep = Character.toString((char)257);
        return Arrays.asList(s.split(sep,-1));
    }

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("hello");
        strs.add("world");
        strs.add("this");
        strs.add("is");
        strs.add("java");

        String encoded_string = encode(strs);
        System.out.println("The encoded string is: "+ encoded_string);

        List<String> decode_list = decode(encoded_string);
        System.out.println("The decoded string is: "+ decode_list);

        

        

    }
}
