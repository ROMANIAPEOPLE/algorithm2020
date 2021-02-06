package 코딩테스트.Simulation;

public class 문자열압축 {

    public static void main(String[] args) {
        문자열압축 s = new 문자열압축();
        System.out.println(s.solution("xababcdcdababcdcd"));
    }

    public int solution(String s) {

        int ans = s.length();

        for(int i=1; i<=s.length()/2; i++) {
            String unit = s.substring(0,i);
            String comp ="";
            int count = 1;

            for(int j=i; j<s.length(); j+=i){

                String sub ="";
                for(int k = j; k<i+j && k<s.length(); k++) {
                    sub += s.charAt(k);
                }

                if(unit.equals(sub)) {
                    count++;
                }else {
                    comp += (count ==1) ? unit : unit+count;
                    count = 1;
                    unit = sub;
                }
            }

            comp += (count == 1) ? unit : unit+count;
            ans = Math.min(ans, comp.length());



        }

        return ans;

    }
}