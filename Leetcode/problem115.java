package Leetcode;

public class problem115 {

    private static int numofPeople;
    public static boolean isCelebrity(int i){
        
        for(int j = 0;j<numofPeople;j++){
            if(i == j){
                continue;
            }
            if(knows(i,j) || knows(j,i)){
                return false;
            }
        }
        return true;
    }

    public static boolean knows(int i, int j) {
       
        throw new UnsupportedOperationException("knows API is not implemented");
    }

    public static int findCelebrity(int n){

        numofPeople = n;
        int candidate = 0;
        for(int i = 0;i<n;i++){
            if(knows(candidate,i)){
                candidate = i;
            }
        }

        if(isCelebrity(candidate)){
            return candidate;
        }

        return -1;
    }

    public static void main(String[] args) {
         

    }
}
