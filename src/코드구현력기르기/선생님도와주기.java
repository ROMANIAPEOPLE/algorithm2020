package 코드구현력기르기;

import java.util.Scanner;

public class 선생님도와주기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            if(check(sc.nextInt(), sc.nextInt())) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }

    public static boolean check(int value,int res) {
        int sum =0;
        for(int i=0; i<=value; i++){
            sum+=i;
        }

        if(sum == res) {
            return true;
        }
        return false;
    }
}
