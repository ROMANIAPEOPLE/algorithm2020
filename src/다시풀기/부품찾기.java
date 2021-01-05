package 다시풀기;

import java.util.Arrays;
import java.util.Scanner;

public class 부품찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int [] part = new int[M];
        for(int i=0; i<M; i++){
            part[i] = sc.nextInt();
        }

//        solution1(arr,part);

        solution2(arr,part);

    }

    //계수정렬로 해결
    public static void solution2(int [] arr, int [] part) {
        Arrays.sort(part);
        int [] temp = new int[part[part.length-1] +1];

        for(int i=0; i<arr.length; i++){
            temp[arr[i]]++;
        }

        for(int i=0; i<part.length; i++){
            if(temp[part[i]] == 1) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }


    }





    //이진탐색트리
    public static void solution1(int [] arr, int [] part){
        for(int i=0; i<part.length; i++){
            if(!binarySearchByPartSearch(arr, part[i], 0, arr.length-1)) {
                System.out.println("no");
            }else {
                System.out.println("yes");
            }
        }
    }

    public static boolean binarySearchByPartSearch(int [] arr, int target, int start, int end) {
        while(start<=end) {
            int mid = (start+end)/2;
            if(arr[mid] == target) {
                return true;
            }
            else if(arr[mid] > target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return false;
    }
}
