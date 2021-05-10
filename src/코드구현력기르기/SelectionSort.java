package 코드구현력기르기;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 5,  141, 13, 15, 23};


        for(int i=0; i<arr.length-1; i++) {
            int idx =i;

            for(int j=i+1; j<arr.length; j++) {
                if(arr[idx] > arr[j]) {
                    idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;


        }

        System.out.println(Arrays.toString(arr));





    }
}
