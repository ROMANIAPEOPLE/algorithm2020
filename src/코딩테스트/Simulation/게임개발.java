package 코딩테스트.Simulation;

import java.util.Scanner;

//난이도 중, 풀이시간 40분
public class 게임개발 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int dicCount = 0;
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] map = new int[50][50];
        int[][] visit = new int[50][50];
        int A = sc.nextInt();
        int B = sc.nextInt();
        int d = sc.nextInt();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int[] dic = {3, 2, 1, 0};
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};
        boolean ck = false;
        map[A][B] = -1;
        while (true) {


            if (dicCount == 4) {
                for (int i = 0; i < 4; i++) {

                    if (d == dic[i]) {
                        if (map[A + (dx[i] * -1)][B + (dy[i] * -1)] == 0) {
                            A = A + Math.abs(dx[i]);
                            B = B + Math.abs(dy[i]);
                            visit[A][B] = 1;
                            dicCount = 0;
                        } else {
                            ck = true;
                        }
                        break;
                    }
                }
                if (ck) {
                    break;
                }

            }

            d -= 1;
            if (d < 0) {
                d = 3;
            } //바라보는 위치 구하기

            for (int i = 0; i < 4; i++) {

                if (d == dic[i]) { //바라보는 곳 구하기

                    if (A + dx[i] < 0 || B + dy[i] < 0) {
                        continue;
                    }

                    if (map[A + dx[i]][B + dy[i]] == 0 && visit[A + dx[i]][B + dy[i]] == 0) {

                        count++;
                        A = A + dx[i];
                        B = B + dy[i]; // A,B(현재위치) 이동
                        visit[A][B] = 1; //방문처리
                        dicCount = 0;
                    } else {

                        dicCount++;
                    }
                    break; //바라보는 곳을 구했으면 더이상 for문을 진행하면 안됨.
                }
            }

        }
        System.out.println(count);
    }
}
