package leetcode.DFSBFS;

public class WordSearch_DFS {
    public boolean exist(char [][] grid, String word){
        int m= grid.length;
        int n =grid[0].length;

        boolean [][] visit = new boolean[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(dfs(grid,word,visit,i,j,0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] grid, String word, boolean[][] visit, int x, int y, int start) {
        int m= grid.length;
        int n =grid[0].length;
        if(word.length()== start) return true;
        if(x<0 || x>=n || y<0 || y>=m || grid[x][y] != word.charAt(start) ) {
            return false;
        }
        if(visit[x][y] ) {
            return false;
        }
        int [] dx = {0,0,-1,1};
        int [] dy = {-1,1,0,0};
        visit[x][y] = true;
        for(int i=0; i<4; i++){
            int cx = x+dx[i];
            int cy = y+dy[i];

            if(dfs(grid,word,visit,cx,cy,start+1)) {
                return true;
            }
        }

        visit[x][y] = false;
        return false;
    }
}
