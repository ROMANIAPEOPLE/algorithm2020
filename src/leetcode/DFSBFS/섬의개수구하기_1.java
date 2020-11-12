package leetcode.DFSBFS;

public class 섬의개수구하기_1 {
    static char[][] grid= {
            {'1','1','0','0','0'},
            {'1','1','1','0','0'},
            {'0','0','1','0','0'},
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
                    count =dfs(i,j,count);
                    max = Math.max(count,max);
                    count =0;
                }
            }
        }
        System.out.println(max);
    }

    private static int  dfs(int x, int y, int count) {

        if(x<0 || x >= n || y<0 || y>=m || grid[x][y] != '1') {
            return count;
        }

        count++;
        grid[x][y] = '0';

        for(int i=0; i<4; i++){
            int cx = x+dx[i];
            int cy = y +dy[i];
            count =dfs(cx,cy,count);
        }



        return count;
    }
}
