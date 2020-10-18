package 프로그래머스;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 실패율 {

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        Map<Integer, Double> map = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            int currentStage = i;
            int stay = 0; //현재 스테이지에 도달했으나 ,다음 스테이지에 가지 못한놈
            int clearUser = 0; // 스테이지에 도달한 놈들
            for (int j = 0; j < stages.length; j++) {
                if (currentStage == stages[j]) {
                    stay++;
                }
                if (currentStage <= stages[j]) {
                    clearUser++;
                }
            }

            double failRate = 0;
            if (stay != 0 && clearUser != 0) {
                failRate = (stay / (double) clearUser);
            }
            map.put(currentStage, failRate);
        }

        for (int i = 0; i < N; i++) {
            double max = -1;
            int maxKey = -1;

            for (int key : map.keySet()) {
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
        int [] arr = {4,4,4,4,4};

        System.out.println(Arrays.toString(f.solution(4,arr))
        );
    }
}