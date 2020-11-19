package 코딩테스트.Simulation;

import java.util.Scanner;
//    행 :    int row   열: int col
//시간20분, 난이도 하
public class 왕실의나이트 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        int row = input.charAt(1)-'0';
//        int col = input.charAt(0)-'a'+1;

        String [] location = sc.nextLine().split("");
        int row = Integer.parseInt(location[1]); //행
        int col = (int)location[0].charAt(0)-96; //열

        System.out.println(row + " " + col);

        int count=check(row,col);

        System.out.println(count);
    }
    private static int check(int row, int col) {
        int [] dx ={-2,2,-2,2,-1,1,-1,1};
        int [] dy ={1,-1,-1,1,2,2,-2,-2};
        int count=0;
        for(int i=0; i<8; i++){
            int cx = row+dx[i];
            int cy = col+dy[i];
            if(cx >= 1 && cx<9 && cy>=1 && cy<9){
                count++;
            }
        }





        return count;
    }
}
