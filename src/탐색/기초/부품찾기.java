package 탐색.기초;

import java.util.Arrays;
import java.util.Scanner;

//이진탐색 사용하기
public class 부품찾기 {
    public static void main(String[] args) {
        /**
            입출력 처리하기
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] partAll = new int[N];
        for(int i=0; i<N; i++){
            partAll[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int [] part = new int[M];
        for(int i=0; i<M; i++){
            part[i] = sc.nextInt();
        }

        /**
         * 솔루션
         */
        Arrays.sort(partAll);
        boolean ck = true;
        for(int i=0; i<M; i++) {

            if(!search(partAll,part[i],0,partAll.length-1)){
                System.out.print("no");
            }
            else {
                System.out.print("yes");
            }
            System.out.print(" ");
        }



    }
    public static boolean search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            // 찾은 경우 중간점 인덱스 반환
            if (arr[mid] == target) return true;
                // 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
            else if (arr[mid] > target) end = mid - 1;
                // 중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
            else start = mid + 1;
        }
        return false;
    }
}
