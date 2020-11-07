//package leetcode.DFSBFS;
//
//public class MaxOfIsland {
//    public static void main(String[] args) {
//        int[][] grid =
//                {
//                        {1, 1, 0, 1, 1},
//                        {0, 1, 1, 0, 0},
//                        {0, 0, 0, 0, 0},
//                        {1, 1, 0, 1, 1},
//                        {1, 0, 1, 1, 1},
//                        {1, 0, 1, 1, 1}};
//        MaxOfIsland a = new MaxOfIsland();
//        System.out.println(a.maxAreaOfIsland(grid));
//    }
//
//    private int maxAreaOfIsland(int[][] grid) {
//
//        int max = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[i].length; j++) {
//                if (grid[i][j] == 1) {
//                    int count = dfs(i, j, grid, 0);
//                    max = Math.max(max,count);
//                }
//            }
//        }
//
//        return max;
//    }
//
//    private int dfs(int x, int y, int[][] grid, int count) {
//        int xlength = grid.length;
//        int ylength = grid[0].length;
//        if (x < 0 || x >= xlength || y < 0 || y >= ylength || grid[x][y] == 0) {
//            return count;
//        }
//        grid[x][y] = 0;
//
//        count++;
//        int[] dx = {-1, 0, 1, 0};
//        int[] dy = {0, 1, 0, -1};
//
//
//        for (int i = 0; i < dx.length; i++) {
//            int cx = dx[i] + x;
//            int cy = dy[i] + y;
//            count=dfs(cx, cy, grid, count);
//        }
//        return count;
//    }
//
//
//}
