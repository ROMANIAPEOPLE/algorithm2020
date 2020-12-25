package 다시풀기;

import java.util.Scanner;

public class 상하좌우 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mapSize = sc.nextInt();
        sc.nextLine();
        String[] str = sc.nextLine().split(" ");

        int x = 1;
        int y = 1;

        char[] location = {'L', 'R', 'U', 'D'};
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        for (int i = 0; i < str.length; i++) {
            int cx = 0;
            int cy = 0;

            char map = str[i].charAt(0);

            for (int j = 0; j < 4; j++) {
                if (location[j] == map) {
                    cx += x+dx[j];
                    cy += y+dy[j];
                }
            }

            if (cx < 1 || cx > mapSize || cy < 1 || cy > mapSize) {
                continue;
            }

            x = cx;
            y = cy;
        }
        System.out.println(x + " " + y);
    }
}
