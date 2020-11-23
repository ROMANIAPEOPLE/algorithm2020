package leetcode.다시풀기;

import java.util.Scanner;

public class GameDevelopment {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited = new boolean[50][50];
    static int [][] map = new int[50][50];
    static int M,N,A,B,d;

    public static void main(String[] args) {
        int count = 1;
        int dicCount = 0;
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
         N = sc.nextInt();
         A = sc.nextInt();
         B = sc.nextInt();
         d = sc.nextInt();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        visited[A][B] = true;

        while (true) {
            turn_left();
            System.out.println(d);
            int cx = A + dx[d];
            int cy = B + dy[d];

            if (map[cx][cy] == 0 && !visited[cx][cy]) {
                A = cx;
                B = cx;
                visited[cx][cy] = true; // 방문처리
                count++; //방문수증가
                dicCount = 0; // dicCount 초기화화
                continue;
            } else {
                dicCount++;
            }

            if (dicCount == 4) {
                cx = A-dx[d];
                cy = A-dy[d];
                if (map[cx][cy] == 0) {
                    A = cx;
                    B = cy;
                } else {
                    break;
                }
                dicCount = 0;

            }

        }


        System.out.println(count);

    }

    public static void turn_left() {
        d -= 1;
        if (d == -1) {
            d = 3;
        }


    }


}
