package leetcode.다시풀기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EscapeMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();

        int [][] arr = new int[n][m];
        boolean [][] visited = new boolean[n][m];
        sc.nextLine();

        for(int i=0; i<n; i++) {
            String [] str= sc.nextLine().split("");
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        System.out.println(bfs(arr,visited));

    }

    private static int bfs(int[][] arr , boolean [][] visited) {


        visited[0][0] = true;

        int n = arr.length;
        int m = arr[0].length;


        int [] dx = {-1,0,1,0};
        int [] dy = {0,-1,0,1};

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0}); //시작점은 0,0임.

        while(!queue.isEmpty()){
            int [] point = queue.poll();
            int x = point[0];
            int y = point[1];

            for(int i=0; i<4; i++){
                int cx= x +dx[i];
                int cy= y +dy[i];

                if(cx>=0 && cx<n && cy>=0 && cy<m && arr[cx][cy] == 1 && !visited[cx][cy]){
                    visited[cx][cy] = true;
                    arr[cx][cy] = arr[x][y]+1;
                    queue.add(new int[]{cx,cy});
                }

            }

        }

        return arr[n-1][m-1];
    }
}
