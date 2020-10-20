package 백준.그리디;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class 잃어버린괄호2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        List<Integer> plusANdMinus = new ArrayList<>();
        List<Integer> value = new ArrayList<>();

        plusANdMinus.add(1);

        String s = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-') {
                if (str.charAt(i) == '+') {
                    plusANdMinus.add(1);
                } else if (str.charAt(i) == '-') {
                    plusANdMinus.add(-1);
                }
                value.add(Integer.parseInt(s));
                s = "";
            } else {
                s += str.substring(i, i + 1);
            }
        }

        value.add(Integer.parseInt(s));


        boolean check = false;
        int sum = 0;
        for (int i = 0; i < value.size(); i++) {
            if (plusANdMinus.get(i) == -1) {
                check = true;
            }

            if (check) {
                sum -= value.get(i);
            } else {
                sum += value.get(i);
            }
        }

        System.out.println(sum);

    }
}
