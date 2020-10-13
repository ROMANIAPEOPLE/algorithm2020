package ETC;

public class lv1_개선 {
    public static String solution(String a, String key) {

        StringBuilder builder = new StringBuilder();
        int index =0;
        for(char c : a.toCharArray()) {
            if(index >= key.length() || c != key.charAt(index)) {
                builder.append(c);
            }
            else {
                index++;
            }
        }

        return builder.toString();


    }

    public static void main(String[] args) {

        String a = "acbbcdc";
        String key = "abc";
        System.out.println(solution("kkaxbycyz", "abc"));

        System.out.println(solution(a, key));
    }
}