package Leetcode;
import java.util.HashMap;
import java.util.Map;

public class problem162 {

    private static Map<Integer,Map<Integer,Integer>> pointsCount;

    public static class DetectSquare{

        public DetectSquare() {
           pointsCount = new HashMap<>();
        }

        public static void add(int point[]){
           int x = point[0],y = point[1];
           pointsCount.putIfAbsent(x, new HashMap<>());
           pointsCount.get(x).put(y,pointsCount.get(x).getOrDefault(y, 0) + 1);

        }

        public static int count(int point[]){
            int x1 = point[0], y1 = point[1];
            int totalSqaures = 0;

            if(!pointsCount.containsKey(x1)){
                return 0;
            }

            for(Map.Entry<Integer,Integer> e: pointsCount.get(x1).entrySet()){
                  int y2 = e.getKey();
                  int countY2 = e.getValue();

                  if(y2 == y1){
                    continue;
                  }

                  int sideLength = Math.abs(y2-y1);
                  totalSqaures += countSqaures(x1,y1,x1+sideLength,y1,y2,countY2);
                  totalSqaures += countSqaures(x1,y1,x1-sideLength,y1,y2,countY2);

            }

            return totalSqaures;

        }

        public static int countSqaures(int x1,int y1,int x3,int y3,int y2,int countY2){
             if(pointsCount.containsKey(x3)){
                Map<Integer,Integer> x3points = pointsCount.get(x3);
                return x3points.getOrDefault(y1, 0) * x3points.getOrDefault(y2, 0) * countY2;
             }

             return 0;
        }
          
        
    }
    public static void main(String[] args) {
        
    }
}
