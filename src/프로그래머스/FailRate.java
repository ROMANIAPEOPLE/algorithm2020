package 프로그래머스;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FailRate {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> map = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            //i가 현재 스테이지임.

            int stay = 0;
            int stayAndClear = 0;

            double failRate = 0;

            for (int j = 0; j < stages.length; j++) {
                if (i == stages[j]) {
                    stay++;
                }
                if (i <= stages[j]) {
                    stayAndClear++;
                }
            }

            if (stay != 0 && stayAndClear != 0) {
                failRate = (stay / (double) stayAndClear);
            }

            map.put(i, failRate);
        }

        for (int i = 0; i < N; i++) {
            double max = Integer.MIN_VALUE;
            int maxKey = Integer.MIN_VALUE;

            for (Integer key : map.keySet()) {
                if (max < map.get(key)) {
                    max = map.get(key);
                    maxKey = key;
                }
            }
            answer[i] = maxKey;
            map.remove(maxKey);

        }


        return answer;
    }

    public static void main(String[] args) {
        실패율 f = new 실패율();
        int[] arr = {4, 4, 4, 4, 4};
        System.out.println(Arrays.toString(f.solution(4, arr)));
    }
}
