package Leetcode;

import java.util.TreeMap;

public class problem142 {

public static boolean rearrangeCards(int arr[],int groupSize){
      
    int n = arr.length;
    if(n%groupSize!=0){
        return false;
    }

    TreeMap<Integer,Integer> cardCounts = new TreeMap<>();

    for(int card: arr){
        cardCounts.put(card,cardCounts.getOrDefault(card, 0)+1);
    }

    while(!cardCounts.isEmpty()){
        int first = cardCounts.firstKey();
        for(int i = 0;i<groupSize;i++){
            int currcard = first+i;
            if(!cardCounts.containsKey(currcard)){
                return false;
            }

        int count = cardCounts.get(currcard);
        if(count == 1){
            cardCounts.remove(currcard);
        }
        else{
            cardCounts.put(currcard,count-1);
         }
        }
    }

    return true;
}
    public static void main(String[] args) {
        int hand[] = {1,2,3,6,2,3,4,7,8};
        int groupSize = 3;

        boolean res = rearrangeCards(hand, groupSize);
        System.out.println(res);
    }
}
