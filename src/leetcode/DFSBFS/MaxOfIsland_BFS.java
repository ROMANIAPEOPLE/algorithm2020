package leetcode.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

public class MaxOfIsland_BFS {
    public static void main(String[] args) {
        int[][] grid =
                {
                        {1, 1, 0, 1, 1},
                        {0, 1, 1, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 1, 0, 1, 1},
                        {1, 0, 1, 1, 1},
                        {1, 0, 1, 1, 1}};
        System.out.println(maxAreaOfIsland(grid));
    }

    private static int maxAreaOfIsland(int[][] grid) {

        int count =0;
        int max = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == 1) {
                    count =bfs(grid,i,j,0);
                    max = Math.max(max,count);
                }
            }
        }
        return count;
    }

    private static int bfs(int [][] grid, int x, int y, int count) {
        count++;
        grid[x][y] = 0; //방문 완료
        int xLength = grid.length;
        int yLength = grid[0].length;

        int [] dx = {1,0,-1,0};
        int [] dy = {0,1,0,-1};

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        while(!queue.isEmpty()) {
            int [] point = queue.poll();
            for(int i=0; i<dx.length; i++){
                int cx = point[0]+dx[i];
                int cy = point[1]+dy[i];

                if(cx>=0 && cx<xLength && cy>=0 && cy<yLength && grid[cx][cy] == 1){
                    grid[cx][cy] =0;
                    count++;
                    queue.add(new int[]{cx,cy});
                }

            }

        }


        return count;
    }


}
