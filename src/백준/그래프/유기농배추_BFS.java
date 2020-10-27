package 백준.그래프;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 유기농배추_BFS {

    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { 1, 0, -1, 0 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int count =0;
            int m = sc.nextInt();
            int n = sc.nextInt();

            int[][] baechu = new int[m][n];


            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                baechu[sc.nextInt()][sc.nextInt()] = 1;
            }
//
//            for(int q = 0; q<baechu.length; q++){
//                for(int w=0; w<baechu[q].length; w++){
//                    System.out.print(baechu[q][w] + " ");
//                }
//                System.out.println();
//            }

            for(int z=0; z<m; z++){
                for(int j=0; j<n; j++){
                    if(baechu[z][j] == 1) {
                        BFS(baechu,z,j);
                        count++;
                    }
                }
            }

            System.out.println(count);

        }



    }

    private static void BFS(int [][] baechu, int x, int y) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        int m = baechu.length;
        int n = baechu[0].length;

        while(!queue.isEmpty()) {
            int [] point = queue.poll();
            baechu[x][y] = -1;
            for(int i=0; i<4; i++){
                int cx = point[0] + dx[i];
                int cy = point[1] + dy[i];

                if(cx>=0 && cx<m && cy>=0 && cy<n && baechu[cx][cy] ==1) {
                    baechu[cx][cy] = -1;
                    queue.add(new int[] {cx,cy});
                }

            }

        }




    }
}