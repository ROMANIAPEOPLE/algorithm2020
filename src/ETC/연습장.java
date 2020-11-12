package ETC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 연습장  {

    public static void main(String[] args) {


        int [] arr ={1,2,3,4,5};
        int r=4;
        //순열(arr,자릿수를 담을 output배열, 자릿수, for문에 사용할 배열의 길이(굳이안넘겨도됨), depth값 시작은 0);
        int len = arr.length;
        int [] output = new int[r];
        boolean [] visited = new boolean[len];

        순열(arr,output, visited,r,len,0);


    }

    private static void 순열(int[] arr, int[] output,boolean[] visited, int r, int len, int depth) {


        if(depth == r) {
            StringBuilder bd = new StringBuilder();
            for (int val : output) {
                bd.append(val);
            }
            System.out.println(bd.toString());
            return;
        }

        for(int i=0; i<len; i++){
            if(!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                순열(arr,output,visited,r,len,depth+1);
                visited[i]= false;
            }

        }

    }
}
