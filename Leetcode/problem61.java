package Leetcode;

public class problem61 {

    public static int carFleet(int pos[],int speeds[],int tar){
         
      int n = pos.length;
      double time[] = new double[n];
       
      for(int i =0;i<n;i++){
        time[i] = (double)(tar-pos[i])/speeds[i];
      }

      double currTime = 0;
      int fleets = 0;

      for(int i=n-1;i>=0;i--){
        if(time[i] > currTime){
            fleets++;
            currTime = time[i];
        }
      }

      return fleets;

    }
    public static void main(String[] args) {
        int pos[] = {10,8,0,5,3};
        int speeds[] = {2,4,1,1,3};
        int tar = 12;

        int res = carFleet(pos, speeds, tar);
        System.out.println("The no.of fleets are: "+ res);
    }
}
 