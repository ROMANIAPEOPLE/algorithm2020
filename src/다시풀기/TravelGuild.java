package 다시풀기;

import java.util.Arrays;

public class TravelGuild {
    public static void main(String[] args) {
        int k = 5;
        int[] arr = {2, 3, 1, 2, 2};
        Arrays.sort(arr);

        int sum = 0;
        int result = 0;

        for (int i = 0; i < k; i++) {
            sum++;
            if (sum >= arr[i]) {
                result++;
                sum = 0;
            }
        }

        System.out.println(result);



    }
}
