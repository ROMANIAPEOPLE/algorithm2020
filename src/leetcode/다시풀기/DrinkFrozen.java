package leetcode.다시풀기;

import java.util.Scanner;

public class DrinkFrozen {
    //0뚫 1막

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine();

        int [][] arr = new int[M][N];

        for(int i=0; i<M; i++){
            String [] str = sc.nextLine().split("");
            for(int j=0; j<N; j++){
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        int count =0;
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j] == 0) {
                    DFS(i,j,arr);
                    count++;
                }
            }
        }

        System.out.println(count);




    }

    private static void DFS(int x, int y, int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int [] dx = {-1,0,1,0};
        int [] dy = {0,-1,0,1};

        if(x<0 || x>=m || y<0 || y>=n || arr[x][y] !=0) {
            return;
        }


        arr[x][y] = -1; //방문처리

        for(int i=0; i<4; i++){
            int cx = x+dx[i];
            int cy = y+dy[i];

            DFS(cx,cy,arr);

        }









    }
}
