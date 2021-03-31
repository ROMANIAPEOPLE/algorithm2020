package 코드구현력기르기;

import java.util.Scanner;

public class 카드게임WLD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];

        int countA = 0;
        int countB = 0;
        int lastWinner =0;

        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            if (A[i] == B[i]) {
                countA++;
                countB++;
                continue;
            }

            if (A[i] > B[i]) {
                countA+=3;
                lastWinner = 1;
            } else {
                countB+=3;
                lastWinner = 2;
            }
        }

        System.out.println(countA + " " + countB);
        if(lastWinner == 0) {
            System.out.println("D");
        }else if (lastWinner == 1) {
            System.out.println("A");
        }else{
            System.out.println("B");
        }


    }
}
