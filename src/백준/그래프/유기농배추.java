package 백준.그래프;

import java.util.Scanner;

public class 유기농배추 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++){
            int count =0;
            int m = sc.nextInt();
            int n = sc.nextInt();

            int[][] baechu = new int[m][n];


            int k = sc.nextInt();
            for(int j=0; j<k; j++){
                baechu[sc.nextInt()][sc.nextInt()] = 1;
            }

//            for(int x = 0; x<baechu.length; x++) {
//                for(int y= 0; y<baechu[x].length; y++){
//                    System.out.print(baechu[x][y]+" ");
//                }
//                System.out.println();
//            }

            for(int a=0; a<baechu.length; a++){
                for(int b=0; b<baechu[a].length; b++){
                    if(baechu[a][b] == 1) {
                        count++;
                        dfs(baechu,a,b);
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static  void dfs(int [][] baechu, int a, int b) {
        int m= baechu.length;
        int n = baechu[0].length;

        if(a<0 || a>=m || b<0 || b>=n || baechu[a][b] !=1) {
            return;
        }

        baechu[a][b] = -1;

        dfs(baechu, a-1,b);
        dfs(baechu, a,b-1);
        dfs(baechu, a+1,b);
        dfs(baechu, a,b+1);




    }
}
