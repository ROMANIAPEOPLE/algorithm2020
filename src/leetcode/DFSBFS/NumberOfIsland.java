package leetcode.DFSBFS;


//1은 육지, 0은 바다.  육지의 총 개수를 구하시오.
public class NumberOfIsland {
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
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == '1') {
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        System.out.println(count);
    }

    public static void dfs(char [][] grid, int x, int y){

//        if(grid == null || grid.length==0 || grid[x].length == 0 ) {
//            return;
//        }


        if(x<0 || x >=n || y<0 || y>=m || grid[x][y] !='1' ) {
            return;
        }
        grid[x][y] = 'S';


        for(int i=0; i<4; i++){
            int cx = x+dx[i];
            int cy = y + dy[i];
            dfs(grid,cx,cy);
        }
    }
}
