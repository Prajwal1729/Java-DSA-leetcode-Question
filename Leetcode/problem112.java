package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class problem112 {

    public static boolean canFinish(int numofCourses,int [][] preq){
         
        HashMap<Integer,List<Integer>> courseMap = new HashMap<>();

        for(int[] p: preq){
            if(courseMap.containsKey(p[1])){
                courseMap.get(p[1]).add(p[0]);
            }
            else{
                List<Integer> nextCourse = new LinkedList<>();
                nextCourse.add(p[0]);
                courseMap.put(p[1],nextCourse);
            }
        }

        HashSet<Integer> vis = new HashSet<>();

        for(int currcourse = 0;currcourse < numofCourses;currcourse++){
          if(courseSchedule(currcourse,vis,courseMap) == false){
               return false;
          }  
        }
        
        return true;
    }

    public static boolean courseSchedule(int course,HashSet<Integer> vis,HashMap<Integer,List<Integer>> courMap){
        if(vis.contains(course)){
            return false;
        }

        vis.add(course);
        for(int pre: courMap.get(course)){
            if(courseSchedule(pre, vis, courMap) == false){
               return false;
            }
        }

        vis.remove(course);
        courMap.put(course,null);
        return true;
    }
    public static void main(String[] args) {
        
    }
}
