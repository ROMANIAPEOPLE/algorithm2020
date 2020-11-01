package ETC;

import java.util.Arrays;

public class 순열알고리즘 {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int r =3; // 순열에서 몇자리수를 뽑을건지
        int [] output = new int[r]; //출력 배열
        boolean [] visited = new boolean[arr.length];
        perm(arr,output,visited,0,arr.length,r);
    }

    private static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {

        if(depth == r){
            String str= "";
            for (int i : output) {
                str+=i;
            }
            System.out.println(str);
            return;
        }

        for(int i=0; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr,output, visited, depth+1, n, r);
                visited[i] = false;
            }
        }
    }
}
