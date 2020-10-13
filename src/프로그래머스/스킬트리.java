package 프로그래머스;

public class 스킬트리 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (int i = 0; i < skill_trees.length; i++) {
            String[] s = skill_trees[i].split("");
            int index = 0;
            boolean ck = true;

            for (int j = 0; j < s.length; j++) {
                if (index < skill.indexOf(s[j])) {
                    ck = false;
                    break;
                } else if (index == skill.indexOf(s[j])) {
                    index++;
                }
            }


            if (ck) {
                answer++;
            }

        }


        return answer;
    }
}
