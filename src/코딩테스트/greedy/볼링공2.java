package 코딩테스트.greedy;

import java.util.Scanner;

public class 볼링공2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] weight = new int[11];

    for (int i = 0; i < n; i++) {
      int value = sc.nextInt();
      weight[value] += 1;
    }

    int res = 0;

    for (int i = 0; i <= m; i++) {
      n -= weight[i];
      res += weight[i] * n;
    }

    System.out.println(res);

  }

}
