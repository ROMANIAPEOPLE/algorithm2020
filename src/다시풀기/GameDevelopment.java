package 다시풀기;

import java.util.Scanner;

public class GameDevelopment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int direction = sc.nextInt();
        int [][] map = new int[n][m];
        boolean [][] visited = new boolean[n][m];
        visited[x][y]= true;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                map[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(map,x,y,direction,visited));

    }

    private static int turnLeft(int nowDirection) {
        int temp = nowDirection % 4;
        if(temp == 0) {
            return 3;
        }else {
            return temp-1;
        }
    }


    private static int solution(int[][] map, int x, int y, int direction, boolean [][] visited) {
        //북,서,남,동 순서로 전진
        int [] dx = {-1,0,1,0};
        int [] dy = {0,-1,0,1};
        int [] dir = {0,3,2,1};
        int count =1;
        int penalty =0;
        int cx = x;
        int cy = y;


        while(true) {
            direction = turnLeft(direction); //왼쪽으로 turn
            int i;
            System.out.println("방향 " + direction);
            for(i=0; i<4; i++) {
                if(direction == dir[i] ) {
                    cx += dx[i];
                    cy += dy[i];

                    if(visited[cx][cy] || map[cx][cy] == 1 ) { //이미 가봤거나, 바다인 경우
                        cx -=dx[i];
                        cy -=dy[i];
                        penalty++;
                        break;
                    }else {
                        visited[cx][cy] = true;
                        count++; // 방문횟수 +1 처리
                        penalty = 0;
                        break;
                    }

                }
            }
            if(penalty == 4) {
                cx -= dx[i];
                cy -= dy[i];

                penalty=0;
                if(map[cx][cy] == 1 ) {
                    break;
                }
            }
        }


        return count;
    }


}

