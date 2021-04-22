package 코드구현력기르기;

import java.util.Scanner;

public class 말아톤 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        int [] res = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 1;
        for(int i=0; i<n; i++){
            res[i] = count++;
        }


        for(int i=n-1; i>=1; i--) {
            for(int j=0; j<i; j++) {
                if(arr[i] > arr[j] && res[i] > 1) {
                    res[i]--;
                }
            }
        }

        for(int rank : res) {
            System.out.print(rank+ " ");
        }


    }
}
