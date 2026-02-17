package Leetcode;
import java.util.ArrayList;
import java.util.HashMap;

public class problem108 {

    static class Node{
        int val;
        ArrayList<Node> list;

        public Node(int val, ArrayList<Node> list){
            this.val = val;
            this.list = list;
        }
    }

   static HashMap<Node,Node> vis;
    public static Node cloneGraph(Node node){
        if(node==null){
            return node;
        }

        if(vis.containsKey(node)){
           return vis.get(node);
        }

        Node clonenode = new Node(node.val,new ArrayList<>());
        vis.put(node,clonenode);

        for(Node neigh: node.list){
            clonenode.list.add(cloneGraph(neigh));
        }

        return clonenode;
    }
    public static void main(String[] args) {
        
    }
}
