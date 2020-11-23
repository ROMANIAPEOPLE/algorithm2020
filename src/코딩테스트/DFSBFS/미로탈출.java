package 코딩테스트.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로탈출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M =sc.nextInt();
        sc.nextLine();
        int [][] arr = new int[N][M];
        for(int i=0; i<N; i++){
            String str = sc.nextLine();
            for(int j=0; j<M; j++){
                arr[i][j] = str.charAt(j)-'0';
            }
        }

        int count = BFS(arr,0,0);
        System.out.println(count);

    }

    private static int BFS(int[][] arr,int x, int y) {

        int n = arr.length;
        int m = arr[0].length;
        int [] dx = {-1,0,1,0};
        int [] dy = {0,-1,0,1};

        Queue<int []> queue = new LinkedList<>();

        queue.add(new int[]{x,y});
        int count=1;
        while(!queue.isEmpty()){
            int [] point =queue.poll();
//            int cx = point[0];
//            int cy = point[1];

            for(int i=0; i<4; i++){
               int cx= point[0]+dx[i];
               int cy= point[1]+dy[i];

                if(cx>=0 && cx<n && cy>=0 && cy<m && arr[cx][cy] ==1) {
                    queue.add(new int[]{cx,cy});
                    arr[cx][cy]=arr[point[0]][point[1]]+1; //방문처리
                }

            }


        }

        return arr[n-1][m-1];

    }
}
