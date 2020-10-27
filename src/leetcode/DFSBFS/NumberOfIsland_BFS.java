package leetcode.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland_BFS {

    static char[][] grid= {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
    };
    static int n = grid.length;
    static int m = grid[0].length;
    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { 1, 0, -1, 0 };

    public static void main(String[] args) {
        int count =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == '1') {
                    count++;
                    BFS(i,j);
                }
            }
        }
        System.out.println(count);
    }
    static void BFS(int x, int y) {
        grid[x][y] = '0';
        Queue<int []> queue =new LinkedList<>();
        queue.add(new int[] {x,y});
        while(!queue.isEmpty()) {
            int [] point = queue.poll();
            for(int i=0; i<4; i++){
                int cx = dx[i] + point[0];
                int cy = dy[i]  + point[1];

                if(cx>=0 && cx<n && cy>=0 && cy<m && grid[cx][cy] == '1') {
                    grid[cx][cy] = '0';
                    queue.add(new int[] {cx,cy});
                }
            }
        }
    }
}
