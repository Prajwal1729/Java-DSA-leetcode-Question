package Leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
public class problem78 {

    static class Interval {
        int start;
        int end;

        Interval(int start,int end){
            this.start = start;
            this.end = end;
        }
    }

    public static List<Interval> employeeFreeTime(List<List<Interval>> schedule){
         List<Interval> res = new ArrayList<>();
         PriorityQueue<Interval> pq = new PriorityQueue<>((a,b)-> a.start - b.start);

         for(List<Interval> interval: schedule){
            pq.addAll(interval);
         }

         Interval prev = pq.poll();

         while(!pq.isEmpty()){
            Interval curr = pq.poll();

            if(prev.end < curr.start){
                res.add(new Interval(prev.end, curr.start));
            }
            else{
                prev.end = Math.max(prev.end,curr.end);
            }
         }

        return res;
    }
    public static void main(String[] args) {
       List<List<Interval>> schedule = new ArrayList<>();
       schedule.add(Arrays.asList(new Interval(1,2), new Interval(1,3)));
       schedule.add(Arrays.asList(new Interval(5,6)));
       schedule.add(Arrays.asList(new Interval(4,10)));

       List<Interval> res = employeeFreeTime(schedule);
         System.out.println("The employee free time intervals are: ");
            for(Interval interval: res){
                System.out.println("[" + interval.start + ", " + interval.end + "]");
            }
       
    }
}
