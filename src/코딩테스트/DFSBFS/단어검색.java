package 코딩테스트.DFSBFS;

public class 단어검색 {
    static char[][] grid ={
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'S','D','E','E'}
    };
    static String word ="ABCES";
    static int m = grid.length;
    static int n = grid[0].length;
    public static void main(String[] args) {
        boolean res = false;
        boolean [][] visited = new boolean[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++){
                if(dfs(i,j,0,visited)) {
                    res = true;
                }
            }
        }

        System.out.println(res);

    }

    private static boolean dfs(int x, int y, int start, boolean[][] visited) {
        if(start == word.length()) {
            return true;
        }

        if(x<0 || x>=m || y<0 || y>=n || visited[x][y]) {
            return false;
        }

        if(grid[x][y] != word.charAt(start)) {
            return false;
        }

        int [] dx = {-1,0,1,0};
        int [] dy = {0,-1,0,1};

        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int cx = x+dx[i];
            int cy = y+dy[i];
            if(dfs(cx,cy,start+1,visited)) {
                return true;
            }
        }

        visited[x][y] = false;
        return false;
    }
}
