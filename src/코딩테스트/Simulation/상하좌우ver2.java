package 코딩테스트.Simulation;

import java.util.Scanner;

public class 상하좌우ver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        String [] s = sc.nextLine().split(" ");

        char [] warp = {'L','R','U','D'};

        int [] dx = {0,0,-1,1};
        int [] dy = {-1,1,0,0};

        int x=1;
        int y=1;

        for(int i=0; i<s.length; i++){
            int cx= 0;
            int cy= 0;
            char ch = s[i].charAt(0);
            for(int j=0; j<4; j++){
                if(ch == warp[j]) {
                    cx = x+dx[j];
                    cy = y+dy[j];
                }
            }

            if(cx<1 || cx>n || cy<1 || cy>n) {
                continue;
            }

           x= cx;
            y =cy;


        }

        System.out.println(x+" "+y);

    }
}
