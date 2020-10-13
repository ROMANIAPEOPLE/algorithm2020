package ETC;

public class lv1_2_개선 {
    static int solution(int n, int[] 생산, int[] 주문) {
        int 재고 = 0;
        int 가격 = 100;
        int sum =0;
        int day;
        for(day=0; day<n && 가격 >=25; ++day) {
            재고 += 생산[day];
            if(재고 >= 주문[day]) {
                sum += 주문[day] * 가격;
                재고 -= 주문[day];
                가격 = 100;
            }
            else {
                가격/=2;
            }
        }

        return sum/day;

    }

    public static void main(String[] args) {
        int[][] b = new int[][] {{6, 2, 1, 0, 2, 4, 3}, {3, 6, 6, 2, 3, 7, 6}};
        System.out.println(solution(b[0].length, b[0], b[1]));


    }
}
