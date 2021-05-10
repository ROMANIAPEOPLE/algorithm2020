package 코드구현력기르기;

import java.util.Arrays;

public class 삼등찾기 {
    public static void main(String[] args) {
        int[] grades = {80, 96, 75, 82, 96, 92, 100};


        int idx = 0;
        for (int i = 0; i < grades.length - 1; i++) {
            for (int j = i + 1; j < grades.length; j++) {
                if (grades[idx] < grades[j]) {
                    idx = j;
                }
            }

            int temp = grades[idx];
            grades[idx] = grades[i];
            grades[i] = temp;
        }

        System.out.println(Arrays.toString(grades));

        int count =0;
        for(int i=1; i<grades.length; i++) {
            if(grades[i] != grades[i-1]) {
                count++;
            }

            if(count == 2) {
                System.out.println(grades[i]);
                break;
            }

        }


    }
}
