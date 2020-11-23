package 코딩테스트.DFSBFS;

import java.util.Scanner;

public class 음료수얼려먹기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int [][] arr = new int[N][M];
        for(int i=0; i<N; i++){
            String [] str = sc.nextLine().split("");
            for(int j=0; j<M; j++){
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        int count =0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j] == 0) {
                    dfs(i,j, arr);
                    count++;
                }
            }
        }

        System.out.println(count);


    }

    private static void dfs(int x, int y, int [][] arr) {

        int [] dx = {-1,0,1,0};
        int [] dy = {0,-1,0,1};

        int n = arr.length;
        int m =arr[0].length;
        if(x<0 || x>=n || y<0 || y>=m || arr[x][y] !=0) return;
        arr[x][y] = -1; // 방문처리

        for(int i=0; i<4; i++){
            int cx = x+dx[i];
            int cy = y+dy[i];
            dfs(cx,cy,arr);
        }

    }
}
