package leetcode.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

public class 섬의개수구하기_BFS {
    static char[][] grid= {
            {'1','1','0','0','0'},
            {'1','1','1','0','0'},
            {'0','0','1','1','0'},
            {'0','0','0','1','1'}
    };
    static int n = grid.length;
    static int m = grid[0].length;
    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { 1, 0, -1, 0 };


    public static void main(String[] args) {
        int count =0;
        int max =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == '1') {
                   count = BFS(i,j,count);
                   max = Math.max(max,count);
                   count =0;
                    System.out.println("D");
                }
            }
        }
        System.out.println(max);
    }

    private static int BFS(int x, int y, int count) {
        count++;

        Queue<int[]> queue = new LinkedList<>();
        grid[x][y] = '0';

        queue.add(new int[]{x,y});

        while(!queue.isEmpty()) {
            int [] point = queue.poll();
            for(int i=0; i<4; i++){
                int cx = point[0] + dx[i];
                int cy = point[1] + dy[i];

                if(cx>=0 && cx<n && cy>=0 && cy<m && grid[cx][cy] == '1') {
                    grid[cx][cy] = '0';
                    count++;
                    queue.add(new int[]{cx,cy});
                }
            }
        }


        return count;
    }

}
