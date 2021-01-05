package 다시풀기;

import java.util.Scanner;

public class 네이버1번 {
    public static void main(String[] args) {
        int n = 7;
//        int[] p = {5, 4, 7, 2, 0, 6};
        int [] p = {6, 2, 1, 0, 2, 4, 3};
//        int[] c = {4, 6, 4, 9, 2, 3};
        int [] c = {3, 6, 6, 2, 3, 7, 6};

        System.out.println(solution2(n, p, c)
        );


    }

    private static double solution(int n, int[] p, int[] c) {
        int capacity = 0; // 현재 재고
        double price = 100;
        int penalty = 0;
        double sum = 0;
        int avg = n;
        for (int i = 0; i < n; i++) {

            System.out.println(i);


            capacity += p[i]; //그날 생산한 재고 add
            if (capacity >= c[i]) {//재고 충족
                sum += price * c[i];
                capacity -= c[i];
                price = 100;
                penalty = 0;
            } else { // 재고 충족 X
                price /= 2;
                penalty++;
            }

            if (penalty == 3) {
                avg=i+1;
                break;
            }
        }

        System.out.println(sum);
        return sum / avg;
    }
    public static double solution2(int n , int [] p , int [] c) {
        int index;
        int capacity =0;
        int price =100;
        int sum =0;
        for(index =0; index<n && price >=25; index++) {
            capacity += p[index];
            if(capacity >= c[index]) {
                sum += price * c[index];
                capacity -= c[index];
                price = 100;
            }
            else {
                price /=2;
            }


        }

        return (double)(sum/index);
    }
}
