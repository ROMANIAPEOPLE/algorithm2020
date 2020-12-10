package ETC.COS;

import java.util.Arrays;
import java.util.Scanner;

public class 단어밀어내기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("");
        int n = sc.nextInt();
        String dir = sc.next();
        boolean minus = false;

        if (n < 0) {
            minus = true;
        }

        if (minus) {
            if (dir.equals("L")) {
                for (int i = 0; i < Math.abs(n); i++) {
                    rightShift(arr);
                }
            } else {
                for (int i = 0; i < Math.abs(n); i++) {
                    leftShift(arr);
                }
            }
        } else {
            if (dir.equals("L")) {
                for (int i = 0; i < Math.abs(n); i++) {
                    leftShift(arr);
                }
            } else {
                for (int i = 0; i < Math.abs(n); i++) {
                    rightShift(arr);
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
        }

        System.out.println(builder.toString());

    }

    private static void leftShift(String[] arr) {
        String temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    private static void rightShift(String[] arr) {
        String temp = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
    }

}
