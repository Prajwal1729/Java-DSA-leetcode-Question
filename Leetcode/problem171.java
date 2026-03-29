package Leetcode;
import java.util.HashMap;

public class problem171 {
    public static class Logger{
      public static HashMap<String,Integer> msgDict;

       public Logger(){
          msgDict = new HashMap<>();
       }

       public static boolean shouldPrintMessage(int timestamp,String message){
            
          if(!msgDict.containsKey(message)){
            msgDict.put(message,timestamp);
            return true;
          }

          int oldTimeStamp = msgDict.get(message);
          if(timestamp - oldTimeStamp >=10){
             msgDict.put(message,timestamp);
             return true;
          }
          else{
            return false;
          }

       }
    }
    public static void main(String[] args) {
        
    }
}
