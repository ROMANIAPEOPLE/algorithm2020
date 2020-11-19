package leetcode.다시풀기;

public class WordSearch {

    public static void main(String[] args) {

        char[][] grid = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'S', 'D', 'E', 'E'}
        };
        String word = "ABCESEF";
        WordSearch ws = new WordSearch();

        System.out.println(ws.solve(grid,word));
    }

    private boolean solve(char[][] grid, String word) {

        int m =grid.length;
        int n =grid[0].length;
        boolean [][] visited = new boolean[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(dfs(grid,word,i,j,visited,0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] grid, String word,int x, int y, boolean [][] visited, int depth) {
        int m =grid.length;
        int n =grid[0].length;


        int [] dx ={0,0,-1,1};
        int [] dy ={-1,1,0,0};

        if(depth == word.length()) return true;

        if(x<0 || x>=m || y<0 || y>=n || visited[x][y]) return false;

        if(grid[x][y] != word.charAt(depth)) return false;


        visited[x][y] = true;
        for(int i=0; i<4; i++){
            int cx = x+dx[i];
            int cy = y+dy[i];

            if(dfs(grid, word, cx, cy, visited, depth+1)) {
                return true;
            }

        }

        visited[x][y] = false;
        return false;


    }


}


