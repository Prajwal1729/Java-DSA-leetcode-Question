package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;

public class problem120 {

    public static List<String> findItinerary(List<List<String>> tickets){
        Map<String,List<String>> graph = new HashMap<>();

        for(List<String> ticket: tickets){
            String src = ticket.get(0);
            String dest = ticket.get(1);
            graph.computeIfAbsent(src, k -> new ArrayList<>());
            graph.get(src).add(dest);
            
        }

        for(List<String> destination: graph.values()){
            Collections.sort(destination);
        }

        LinkedList<String> iternerary = new LinkedList<>();
        dfs("JFK",graph,iternerary);
        return iternerary;
    }

    public static void dfs(String airport, Map<String,List<String>> graph, LinkedList<String> iternerary) {
        List<String> destinations = graph.get(airport);

        while(destinations!=null && !destinations.isEmpty()){
            String next = destinations.remove(0);
            dfs(next,graph,iternerary);

        }

        iternerary.addFirst(airport);
        
    }
    public static void main(String[] args) {
        
    }
}
