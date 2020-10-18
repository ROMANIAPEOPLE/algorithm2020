package 프로그래머스;

public class LV1_1 {
    public String solution(String s) {

        StringBuilder builder = new StringBuilder();
        if(s.length() %2 !=0) {
            builder.append(s.charAt(s.length()/2));
        }else{
            builder.append(s.charAt((s.length()/2)-1 ));
            builder.append(s.charAt(s.length()/2));

        }

        return builder.toString();
    }

    public static void main(String[] args) {
        LV1_1 s = new LV1_1();

        System.out.println(s.solution("qw"));
    }
}