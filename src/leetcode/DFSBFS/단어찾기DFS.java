package leetcode.DFSBFS;

public class 단어찾기DFS {
    public static void main(String[] args) {
        char[][] grid = {
                {'C', 'A', 'A'},
                {'A', 'A', 'A'},
                {'B', 'C', 'D'}
        };
        String word = "AAB";
        단어찾기DFS a = new 단어찾기DFS();
        System.out.println(a.solve(grid, word));
    }

    int[] dx = {0, 0, -1, 1};
    int[] dy = {-1, 1, 0, 0};
    public boolean solve(char [][] grid, String word) {
        int m = grid.length;
        int n = grid[0].length;
        boolean [][] visited = new boolean [m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) {
                if(dfs(grid,visited,word,0,i,j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] grid, boolean[][] visited, String word, int start, int x, int y) {
        int m = grid.length;
        int n = grid[0].length;
        if(start == word.length()) {
            return true;
        }
        if(x <0 || x>=m || y<0 ||y>=n ||grid[x][y]!= word.charAt(start)) {
            return false;
        }
        if(visited[x][y]) {
            return false;
        }
        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int cx = x+dx[i];
            int cy = y+dy[i];

            if(dfs(grid, visited, word, start+1, cx, cy)) {
                System.out.println("몇회");
                return true;
            }
        }
        System.out.println("실패는?");
        visited[x][y]=false;
        return false;


    }

}
