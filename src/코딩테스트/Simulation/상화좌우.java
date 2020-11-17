package 코딩테스트.Simulation;

import java.util.Scanner;

public class 상화좌우 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        s = s.replace(" ", "");

        int x = 1;
        int y = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                if (check(x, y-1,n)) {
                    y -= 1;
                }
            }else if(s.charAt(i)=='R') {
                if(check(x,y+1,n)) {
                    y+=1;
                }
            }else if(s.charAt(i) == 'U') {
                if(check(x-1,y,n)) {
                    x-=1;
                }
            }else {
                if(check(x+1,y,n)) {
                    x+=1;
                }
            }
        }

        System.out.println(x + " " + y);


    }

    private static boolean check(int x, int y, int n) {
        if(x<1 || x>n || y<1 || y>n) {
            return false;
        }
        return true;
    }

}
