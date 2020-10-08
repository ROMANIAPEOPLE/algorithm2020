package DataStructure;

import java.util.Scanner;

//선형 검색 (보초법)
public class SeqSearchSen {

    public static void main(String[] args) {

        System.out.println("요소의 개수:");
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt() +1];

        System.out.println("요소 입력");
        for(int i=0; i<arr.length-1; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("찾을 value 입력");
        int value = sc.nextInt();

        System.out.println( search_sen(arr,arr.length-1, value)
        );

    }


    static int search_sen(int [] arr , int n , int value){
        arr[n] = value;

        int i=0;

        while(true) {
            if(arr[i] == value) {
                break;
            }
            i++;
        }
        return i == n ? -1 : i;

    }
}
