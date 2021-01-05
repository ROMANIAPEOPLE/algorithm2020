package 다시풀기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로탐색 {
    static int n;
    static int m;
    static int[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] str = sc.nextLine().split("");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(str[j]);
            }
        }

        System.out.println(bfs(0,0));


    }

    private static int bfs(int x, int y) {

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};


        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] point = queue.poll();


            for (int i = 0; i < 4; i++) {
                int cx = point[0] + dx[i];
                int cy = point[1] + dy[i];

                if (cx >= 0 && cx < n && cy >= 0 && cy < m && map[cx][cy] == 1) {
                    queue.add(new int[]{cx, cy});
                    map[cx][cy] = map[point[0]][point[1]] + 1;
                }

            }
        }

        return map[n-1][m-1];
    }


}
