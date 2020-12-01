package 탐색.기초;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class 부품찾기ver3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int m =sc.nextInt();
        int [] part = new int[m];
        for(int i=0; i<m; i++){
            part[i] = sc.nextInt();
        }


        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++) {
            set.add(arr[i]);
        }

        for(int i=0; i<m; i++){

            if(set.remove(part[i])) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }


    }
}
