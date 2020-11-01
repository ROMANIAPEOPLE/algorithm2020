package 백준.그리디;

import java.util.Scanner;

public class 신삥 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int i = 0; i < tc; i++) {
            int count = 1; //서류1등은 무조건 합격
            int testCase = sc.nextInt();

            int[] arr = new int[testCase + 1];
            for (int j = 0; j < arr.length-1; j++) {
                arr[sc.nextInt()] = sc.nextInt();
            }

            int cut = arr[1]; //무조건 합격하는 넘.
            for (int j = 2; j < arr.length; j++) {
                if (cut > arr[j]) {
                    cut = arr[j];
                    count++;
                }

            }


            System.out.println(count);

        }
    }
}
