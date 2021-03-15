package 코드구현력기르기;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 아나그램 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str1 = sc.nextLine().split("");
        String[] str2 = sc.nextLine().split("");
        Arrays.sort(str1);
        Arrays.sort(str2);

        if(str1.length != str2.length) {
            System.out.println("NO");
            return;
        }
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();


        int length = str1.length;
        for (int i = 0; i < length; i++) {
            if (map.get(str1[i]) == null) {
                map.put(str1[i], 1);
            } else {
                map.put(str1[i], (map.get(str1[i]) + 1));
            }
        }

        for (int i = 0; i < length; i++) {
            if (map2.get(str2[i]) == null) {
                map2.put(str2[i], 1);
            } else {
                map2.put(str2[i], (map2.get(str2[i]) + 1));
            }
        }


        for(int i=0; i<length; i++){
            if(map.get(str1[i]) != map2.get(str2[i])) {
                System.out.println("NO");
                return;
            }
        }


        System.out.println("YES");




    }
}
