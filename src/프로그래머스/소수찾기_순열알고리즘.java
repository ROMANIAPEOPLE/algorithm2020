package 프로그래머스;


import java.util.*;

public class 소수찾기_순열알고리즘 {


    private static char[] arr;
    private static boolean[] visited;
    private Set<Integer> set;

    public int solution(String numbers) {

        set = new HashSet<>();

        int size = numbers.length();
        for(int i=1; i<=size; i++){
            arr = new char[i];
            visited = new boolean[size];
            perm(0,i,size,numbers);
        }
        return set.size();

    }

    private void perm(int depth, int r, int size, String numbers) {


        if(depth == r){
            if(arr[0] == '0') return;

            int num = Integer.parseInt(String.valueOf(arr));

            if(isPrimeNumber(num)) {
                set.add(num);
            }

            return;
        }
        for(int i=0; i<size; i++){
            if(!visited[i]) {
                visited[i] = true;
                arr[depth] = numbers.charAt(i);
                perm(depth+1,r, size, numbers);
                visited[i] = false;
            }
        }

    }

    private boolean isPrimeNumber(int num) {
        if(num == 1 ) return false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;

    }

}
