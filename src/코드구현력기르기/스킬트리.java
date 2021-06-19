package 코드구현력기르기;

public class 스킬트리 {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i=0; i<skill_trees.length; i++){
            String [] skills = skill_trees[i].split("");
            int index=0;
            boolean ck = true;

            for(int j=0; j<skills.length; j++){
                if(index < skill.indexOf(skills[j])) {
                    ck  = false;
                    break;
                }else if(index == skill.indexOf(skills[j])) {
                    index++;

                }
            }


            if(ck) {
                answer++;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        String [] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        String skill = "CBD";

        System.out.println(solution(skill,skill_trees));

    }
}
