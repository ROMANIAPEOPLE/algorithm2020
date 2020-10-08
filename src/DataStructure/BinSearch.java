package DataStructure;

import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        System.out.println("요소 수 입력");
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt()];

        System.out.println("요소를 채워넣으시오.");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("찾고싶은 값은?");
        int value =sc.nextInt();

        System.out.println(searchBin(arr,value));

    }

    static int searchBin(int [] arr, int value) {
        int first = 0;
        int last = arr.length-1;

        do {
            int half = (first+last) /2;
            if(arr[half] == value) {
                return half;
            }

            else if(arr[half] < value) {
                first = half+1;
            }

            else {
                last = half-1;
            }

        }while(first <= last);

        return -1;

    }


}
