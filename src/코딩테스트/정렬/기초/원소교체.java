package 코딩테스트.정렬.기초;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 원소교체 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =sc.nextInt();

        Integer [] a = new Integer[n];
        Integer [] b = new Integer[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }


        Arrays.sort(a); //a는 오름차순으로 정렬
        Arrays.sort(b, Collections.reverseOrder()); //내림차순

        for(int i=0; i<k; i++){
            if(a[i] < b[i]) {
               int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }else {
                break;
            }
        }


        int sum = Arrays.stream(a).reduce(0,Integer::sum);


        System.out.println(sum);








    }
}
