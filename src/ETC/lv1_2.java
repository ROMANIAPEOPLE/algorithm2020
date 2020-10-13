package ETC;

public class lv1_2 {
    static int solution(int n, int[] 생산, int[] 주문) {

        int j = 0;
        int count = 0; //재고
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(j == 3) {
                System.out.println(i);
                n=i;
                break;
            }
            count += 생산[i];
            if (count >= 주문[i]) {
                if (j == 0) {
                    sum += 주문[i] * 100;
                    count -= 주문[i];
                } else if (j == 1) {
                    sum += 주문[i] * 50;
                    j=0;
                    count -= 주문[i];

                } else {
                    sum += 주문[i] * 25;
                    j=0;
                    count -= 주문[i];

                }
            }
            else {
                j++;
            }

        }

        System.out.println(sum);
        return sum/n;
    }

    public static void main(String[] args) {
        int[][] b = new int[][] {{6, 2, 1, 0, 2, 4, 3}, {3, 6, 6, 2, 3, 7, 6}};
        System.out.println(solution(b[0].length, b[0], b[1]));


    }

}
