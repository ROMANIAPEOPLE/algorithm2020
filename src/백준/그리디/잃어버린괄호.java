package 백준.그리디;

import java.util.Scanner;

public class 잃어버린괄호 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String [] arr = str.split("-");

        int sum =0;
        int tmp =0;
        String [] first = arr[0].split("\\+");
        for (String f : first) {
            sum += Integer.parseInt(f);
        }

        for(int i=1; i<arr.length; i++){
            String [] temp = arr[i].split("\\+");
            for (String t : temp) {
                tmp += Integer.parseInt(t);
            }

        }
        System.out.println(sum-tmp);
    }
}
