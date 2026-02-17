package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class problem30 {

    public static List<String> textJustification(String strs[],int maxWidth){
          List<String> lines = new ArrayList<>();
          int idx = 0;
          
          while(idx < strs.length){
             int count = strs[idx].length();
             int last = idx+1;

             while(last < strs.length){
                if(count + 1 + strs[last].length() > maxWidth){
                    break;
                }
                count+=1 + strs[last].length();
                last++;
             }

             StringBuilder sb = new StringBuilder();
             sb.append(strs[idx]);
             int diff = last - idx +1;

             if(last==strs.length || diff==0){
                for(int i = idx+1; i<last;i++){
                    sb.append(" ");
                    sb.append(strs[i]);
                }

                for(int i = sb.length();i<maxWidth;i++){
                    sb.append(" ");
                }
             }
             else{
                int spaces = (maxWidth - count) / diff;
                int extraspaces = (maxWidth - count) % diff;
                for(int i = idx+1;i<last;i++){
                    for(int s = spaces;s>0;s--){
                        sb.append(" ");
                    }
                    if(extraspaces > 0){
                        sb.append(" ");
                        extraspaces--;
                    }
                    sb.append(" ");
                    sb.append(strs[i]);
                }
                lines.add(sb.toString());
                idx = last;
             }

          }
          return lines;
    }
    public static void main(String[] args) {
        String strs[] = {"this","is","an","example","of","text","justification."};
        int maxWidth = 16;


        List<String> res = textJustification(strs, maxWidth);
        System.out.println("The justified text is: ");
        for(String line: res){
            System.out.println("|"+ line + "|");
        }   

        
    }
}
