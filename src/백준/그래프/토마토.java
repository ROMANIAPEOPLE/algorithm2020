package 백준.그래프;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//토마토 2차원 버전 : BFS로만 풀 수 있음
public class 토마토 {

    static int[][] tomato;
    static int m, n;
    static int ans;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        tomato = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tomato[i][j] = sc.nextInt();
            }
        }
        bfs();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(tomato[i][j] == 0){
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(ans);

    }


    private static void bfs() {
         Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(tomato[i][j] == 1) {
                    queue.add(new int[]{i,j});
                }
            }
        }


        while (!queue.isEmpty()) {

            int[] point = queue.poll();
            for (int i = 0; i < 4; i++) {
                int cx = point[0] + dx[i];
                int cy = point[1] + dy[i];

                if (cx >= 0 && cx < n && cy >= 0 && cy < m && tomato[cx][cy] == 0) {
                    tomato[cx][cy] = tomato[point[0]][point[1]] + 1;
                    ans = tomato[point[0]][point[1]];
                    queue.add(new int[]{cx, cy});
                }

            }
        }
    }
}
