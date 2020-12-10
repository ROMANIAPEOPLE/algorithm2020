package ETC;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 연습장 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = sc.next().split("");
        int n = sc.nextInt();
        String dir = sc.next();


        //2 3 4 4 5
        //2 3 4 5 1

        String temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;


//        String temp = arr[arr.length-1];
//        for(int i=arr.length-2; i>=0; i--) {
//            arr[i+1] = arr[i];
//        }
//        arr[0] = temp;



        System.out.println(Arrays.toString(arr));

    }
}
