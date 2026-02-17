package Leetcode;

public class problem107 {

    public static int[] findRedundantConnection(int edges[][]){

        int par[] = new int[edges.length + 1];

        for(int i = 1;i<= edges.length;i++){
            par[i] = i;
        }

        for(int [] edge: edges){
            int node1 = edge[0];
            int node2 = edge[1];

            int root1 = find(par,node1);
            int root2 = find(par,node2);

            if(root1 == root2){
                return edge;
            }

            par[root2] = root1;
        }

        return new int[0];
    }

    public static int find(int par[],int node){
        while(node!=par[node]){
            par[node] = par[par[node]];
            node = par[node];
        }

        return node;
    }
    public static void main(String[] args) {
        
    }
}
