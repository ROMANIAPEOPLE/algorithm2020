package 코딩테스트.greedy;

import java.util.Scanner;

public class number1이될때까지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();

        System.out.println(solve1(N,K));
        System.out.println(solve2(N,K));




    }

    private static int solve2(int n, int k) {

        int count =0;
        while(true) {
            if(n<k) {
                break;
            }
            int target = (n/k) *k;
            count+=n-target; //빼주는거 완료

            n = target/k;
            count++;



        }
        return count+(n-1);

    }

    private static int solve1(int n, int k) {
        int count =0;
        while(true) {
            if(n%k == 0) {
                n/=k;
            }else {
                n-=1;
            }
            count++;

            if(n<k) {
                break;
            }

        }
        return count+(n-1);
    }
}
