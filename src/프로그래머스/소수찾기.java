package 프로그래머스;

import java.util.ArrayList;
import java.util.List;

/**
 * numbers 의 길이 까지 모든 숫자 순열로 다 뽑고, 하나하나 소수인지 검사한다음에 총 몇개가 소수인지 리턴
 */

public class 소수찾기 {
    public int solution(String numbers) {
        int answer = 0;

        int primeCount = 0;
        String[] arr = numbers.split("");

        for (int i = 1; i <= numbers.length(); i++) {
            String[] output = new String[i];
            boolean[] visited = new boolean[numbers.length()];
            List<String> list = new ArrayList<>();
            // depth = 0;
            // 몇자리수를 뽑을껀지 ? = i
            // 총 몇자리인지는 number.length
            list = perm(arr, output, visited, 0, arr.length, i, list);
        }


        return answer;
    }

    private List<String> perm(String[] arr, String[] output, boolean[] visited, int depth, int size, int r, List<String> list) {
        if (depth == r) {
            for(String s : output) {
                list.add(s);
            }
            return list;
        }

        for (int i = 0; i < size; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[i] = arr[i];
                perm(arr, output, visited, depth + 1, size, r, list);
                visited[i] = false;
            }
        }

    }


}