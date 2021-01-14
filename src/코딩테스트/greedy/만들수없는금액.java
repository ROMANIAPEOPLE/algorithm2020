package 코딩테스트.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 만들수없는금액 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);
    int target = 1;

    for(int i=0; i<arr.length; i++){
      if(arr[i] <= target) {
        target+=arr[i];
      }else {
        break;
      }
    }
    System.out.println(target);



  }

}
