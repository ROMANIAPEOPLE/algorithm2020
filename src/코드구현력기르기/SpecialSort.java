package 코드구현력기르기;

import java.util.Arrays;
/*
음수는 왼쪽에, 양수는 오른쪽에
단, 순서는 바뀌면 안됨.
Bubble sort를 응용한 문제
 */

public class SpecialSort {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, -3, -2, 5, 6, -6};
        int length = arr.length;
        for(int i = 0; i<length-1; i++) {
            for(int j= 0; j<length-i-1; j++) {

                if(arr[j] > 0 && arr[j+1] <0) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));



    }
}
