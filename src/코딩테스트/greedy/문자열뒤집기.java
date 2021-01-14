package 코딩테스트.greedy;

import java.util.Scanner;

public class 문자열뒤집기 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    solution1(str);
    solution2(str);

  }

  public static void solution1(String str) {
    String [] arr = str.split("0");
    String [] arr2 = str.split("1");

    int count1 = 0;
    int count2 = 0;

    for(int i=0; i<arr.length; i++){
      if(!arr[i].equals("")) {
        count1++;
      }
    }

    for(int i=0; i<arr2.length; i++){
      if(!arr2[i].equals("")) {
        count2++;
      }
    }

    System.out.println(Math.min(count1,count2));

  }

  public static void solution2(String str) {

    int count0 = 0;
    int count1 = 0;


    if(str.charAt(0) == '1') {
      count0++;
    }else {
      count1++;
    }

    for(int i=1; i<str.length()-1; i++){
      if(str.charAt(i) != str.charAt(i+1)) {
        if(str.charAt(i+1) == '1') {
          count0++;
        }else {
          count1++;
        }
      }
    }

    System.out.println(Math.min(count0,count1));

  }


}
