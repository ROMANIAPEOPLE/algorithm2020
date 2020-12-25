package 다시풀기;

import java.util.Scanner;

public class KnightOfKingdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int x = str.charAt(1)-'0';//행
        int y = str.charAt(0)-'a'+1;
        int  max = 8;
        int count = 0;
        int [] dx = {-2,-2,2,2,-1,1,1,-1};
        int [] dy = {1,-1,1,-1,2,-2,2,-2};

        for(int i=0; i<8; i++){
            int cx = x + dx[i];
            System.out.println("x : " + cx);
            int cy = y + dy[i];
            System.out.println("y : " + cy);

            if(cx < 1 || cx > 8 || cy<1 || cy > 8) {
                cx = 0;
                cy = 0;
                continue;
            }

            count++;


        }

        System.out.println(count);




    }

}
