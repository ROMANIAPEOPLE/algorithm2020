package 코딩테스트.greedy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 볼링공고르기 {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int [] arr = new int[n];
    for(int i=0; i<n; i++) {
      arr[i] = sc.nextInt();
      if(arr[i] > m) {
        throw new Exception("입력 에러");
      }
    }

    Arrays.sort(arr);

    int count = 0;
    for(int i=0; i<n; i++){

      for(int j=0; j<n; j++){
        if(arr[i] < arr[j]) {
          count++;
        }
      }
    }

    System.out.println(count);


  }

}
