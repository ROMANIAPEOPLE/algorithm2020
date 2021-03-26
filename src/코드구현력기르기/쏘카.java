package 코드구현력기르기;
import java.util.Scanner;

public class 쏘카 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int front = -1;
        int back = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            String[] arr = sc.next().split("~");
            String[] start = arr[0].split(":");
            String[] end = arr[1].split(":");

            front = Math.max(front, Integer.parseInt(start[0]) * 60 + Integer.parseInt(start[1]));
            back = Math.min(back, Integer.parseInt(end[0]) * 60 + Integer.parseInt(end[1]));
        }

        if (front > back) {
            System.out.println("-1");
        } else {
            System.out.print(makePrint(front / 60));
            System.out.print(":");
            System.out.print(makePrint(front % 60));
            System.out.print("~");
            System.out.print(makePrint(back / 60));
            System.out.print(":");
            System.out.print(makePrint(back % 60));
        }
    }

    private static String makePrint(int i) {
        StringBuilder builder = new StringBuilder();

        if (i <= 9) {
            builder.append(0);
        }

        builder.append(i);
        return builder.toString();
    }
}
