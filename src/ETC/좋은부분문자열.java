package ETC;

import java.util.*;

public class 좋은부분문자열 {
    public int solution(String s) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length() + 1; j++) {
                if (i == j) continue;
                String str = s.substring(i, j);
                if (check(str)) {
                    if (!res.contains(str)) {
                        res.add(str);
                    }
                }
            }
        }

        return res.size();
    }

    private boolean check(String str) {

        String[] temp = str.split("");
        Set<String> set = new HashSet<>(Arrays.asList(temp));
        return temp.length == set.size();

    }

    public static void main(String[] args) {
        String s = "zxzxz";

        좋은부분문자열 st = new 좋은부분문자열();
        System.out.println(st.solution(s));


    }
}


