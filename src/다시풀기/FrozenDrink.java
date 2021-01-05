package 다시풀기;

import java.util.Scanner;

public class FrozenDrink {

    static int n;
    static int m;
    static int[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    dfs(i, j);
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    private static void dfs(int x, int y) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        if (x < 0 || x >= n || y < 0 || y >= m || map[x][y] != 0) {
            return;
        }

        map[x][y] = 1;

        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];
            dfs(cx, cy);
        }
    }
}
