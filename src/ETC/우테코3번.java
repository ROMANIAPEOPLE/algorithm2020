package ETC;

public class 우테코3번 {

    public static void main(String[] args) {
        String[] ex = {"T", "T", "H", "H", "H"};
        String[] ac = {"H", "H", "T", "H", "T"};

        System.out.println(solution(1200, ex, ac));
    }

    public static int solution(int money, String[] expected, String[] actual) {
        int start = 100;
        int game;
        for (int i = 0; i < expected.length && money>0; i++) {
            System.out.println(start);
            if (expected[i] == actual[i]) {
                money += start;
                start = 100;
            } else {
                money -= start; //잃은
                if (money < 0) break;
                start *= 2;
                if (money < start) {
                    start = money;
                }
            }
        }
        return money;
    }
}