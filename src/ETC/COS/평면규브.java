package ETC.COS;

import java.util.Scanner;

/**
 * U : fix = 0  [fix][i]  왼쪽으로 1칸         leftShift(cube,0);
 * U' : fix = 0 [fix][i]   오른쪽으로 1칸         rightShift(cube,0);
 * R : fix = 2 [i][fix]
 * L : fix = 0 [i][fix]
 * B : fix = 2 [fix][i]         rightShift(cube,2);
 * B` : fix = 2 [fix][i]         leftShift(cube,2);
 */
public class 평면규브 {
    public static void main(String[] args) {
        String[][] cube = {{"R", "R", "W"},
                {"G", "C", "W"},
                {"G", "B", "B"}};

        Scanner sc = new Scanner(System.in);
//        String input = sc.next();


        String input = sc.nextLine();
        while(!input.equals("Q")) {
            input = sc.nextLine();
            switch (input) {
                case "U":
                    leftShiftByUAndB(cube, 0);
                    break;
                case "U'":
                    rightShiftByUAndB(cube, 0);
                    break;

                case "B":
                    rightShiftByUAndB(cube, 2);
                    break;

                case "B'":
                    leftShiftByUAndB(cube, 2);
                    break;

                case "L":
                    rightShiftByRAndL(cube, 0);
                    break;

                case "L'":
                    leftShiftByRAndL(cube, 0);
                    break;

                case "R":
                    rightShiftByRAndL(cube, 2);
                    break;

                case "R'":
                    leftShiftByRAndL(cube, 2);
                    break;
            }
        }

        System.out.println("Bye~");

    }

    public static void leftShiftByUAndB(String[][] arr, int fix) {
        String temp = arr[fix][0];
        for (int i = 1; i < arr.length; i++) {
            arr[fix][i - 1] = arr[fix][i];
        }
        arr[fix][2] = temp;
    }

    public static void rightShiftByUAndB(String[][] arr, int fix) {
        String temp = arr[fix][arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[fix][i + 1] = arr[fix][i];
        }
        arr[fix][0] = temp;
    }

    public static void leftShiftByRAndL(String[][] arr, int fix) {
        String temp = arr[0][fix];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1][fix] = arr[i][fix];
        }
        arr[2][fix] = temp;
    }


    public static void rightShiftByRAndL(String[][] arr, int fix) {
        String temp = arr[arr.length - 1][fix];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1][fix] = arr[i][fix];
        }
        arr[0][fix] = temp;
    }

}
