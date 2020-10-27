package 백준.그리디;
//매우 간단한건데 생각이 외않나지??????????????????????????????????????

import java.util.ArrayList;
        import java.util.Scanner;

public class 한줄로서기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n+1];
        for(int i=1; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }


        ArrayList<Integer> list = new ArrayList<>();
        for(int i=n; i>=1; i--){
            list.add(arr[i], i);
        }

        for (Integer integer : list) {
            System.out.print(integer +" ");
        }
    }
}
