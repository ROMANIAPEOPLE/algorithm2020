package 코드구현력기르기;

import java.util.Arrays;

public class 버블팝 {
    public static void main(String[] args) {
        int[] arr = {80, 96, 75, 82, 96, 92, 100};

        int length = arr.length;

        for(int i=0; i< length-1; i++) {
            for(int j=0; j<length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

        System.out.println(Arrays.toString(arr));



    }
}
