package 코드구현력기르기;

public class 숫자만추출_amazon {
    public static void main(String[] args) {
        String s = "g0en2Ts8eSoft";
        solution1(s);
        solution2(s);
    }

    private static void solution2(String s) {
        char[] arr = s.toCharArray();
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 48 && arr[i] <= 57) {
                res = res * 10 + (arr[i] - 48);
            }
        }

        System.out.println(res);


    }

    public static void solution1(String s) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))) {
                builder.append(s.charAt(i));
            }
        }

        int value = Integer.parseInt(builder.toString());

        int measure = 0;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                measure++;
            }
        }
        System.out.println(value);
        System.out.println(measure);
    }
}
