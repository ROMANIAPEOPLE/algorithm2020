package 백준.그리디;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class lost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String [] arr = str.split("-");

//        System.out.println(Arrays.toString(arr));

        String [] sumArr=arr[0].split("\\+");
        int tempSum =0;
        for (String s : sumArr) {
            tempSum += Integer.parseInt(s);
        }

//        System.out.println(tempSum);

        int minusSum =0;
        for(int i=1; i<arr.length; i++){
            String [] temp = arr[i].split("\\+");
            for (String minus : temp) {
                minusSum+=Integer.parseInt(minus);
            }
        }
        System.out.println(tempSum-minusSum);
    }
}
