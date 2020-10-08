package DataStructure;

import java.util.Scanner;


public class SeqSearch {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요소 수를 입력하세요");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("탐색하려는 value 입력");
        int values = sc.nextInt();

        int idx = search(arr, values);
        System.out.println(idx);
    }

    static int search(int[] a, int value) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                return i;
            }
        }
        return -1;

    }

}