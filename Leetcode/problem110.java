package Leetcode;
import java.util.LinkedList;
import java.util.Queue;

public class problem110 {

    private static final int INF = 2147483647;
    private static final int[] DIRS = {0,1,0,-1,0};

    public static void wallsAndGates(int rooms[][]){
        if(rooms == null || rooms.length == 0 || rooms[0].length == 0 ){ return; }
    

    Queue<int[]> q = new LinkedList<>();

    for(int i = 0;i<rooms.length;i++){
        for(int j = 0;j<rooms[0].length;j++){
            if(rooms[i][j] == 0){
                q.offer(new int[]{i,j});
            }
        }
    }

    // BFS //

    while(!q.isEmpty()){
        int gate[] = q.poll();
        int r = gate[0];
        int c = gate[1];

        for(int i = 0;i<4;i++){
            int nr = r + DIRS[i];
            int nc = c + DIRS[i+1];

            if(nr >=0 && nr < rooms.length && nc>=0 && nc <= rooms[0].length && rooms[nr][nc] == INF){
                rooms[nr][nc] = rooms[r][c] + 1;

                q.offer(new int[]{nr,nc});
            }
        }
    }

}
    public static void main(String[] args) {
        
    }
}
