//package 객체지향;
//
//import java.awt.print.Pageable;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Random;
//import java.util.Scanner;
//
///**
//1. 1~9 사이의 랜덤 숫자를 3개 생성한다 (중복X 음수 X) -> 컴퓨터가 뽑은 숫자
// 2. 1~9 사이의 사용자 입력 숫자를 3개 생성한다 (중복X 음수X) -> 유저가 뽑은 숫자
// 3. 랜덤 숫자와 사용자 입력 숫자의 위치와 숫자가 모두 같은 경우 -> strike
// 4. 랜덤 숫자와 사용자 입력 숫자의 위치는 다르고, 숫자만 같은경우 -> ball
// 5. 기회는 총 10번
// 6. 기회를 모두 소진하거나, 정답을 입력시 replay 여부 체크
// 7. Y또는 y 입력시 랜덤 숫자 생성부터 다시, N또는 n 입력시 종료
// */
//
//public class BaseBallGame {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        do {
//            int count =0;
//            int strike =0;
//            int ball =0;
//            int chance = 10;
//            boolean win = false;
//            Random ran = new Random();
//            ArrayList<Integer> computer = new ArrayList<>();
//
//            while(count <3) { //컴퓨터 번호 뽑기
//                int number = ran.nextInt(10);
//                if(computer.contains(number)) {
//                    continue;
//                }
//                computer.add(number);
//                count++;
//            }
//            System.out.println("나만보는 정답 : " + computer.toString());
//
//
//            ArrayList<Integer> user = new ArrayList<>();
//
//            for(int i=0; i<chance; i++){
//                strike = ball = 0;
//                System.out.println("남은기회: " + (chance-i));
//                System.out.println("3개의 숫자를 순서대로 입력하세요!");
//
//                for(int j=0; j<3; j++) { //3개의 숫자 차례대로 입력.
//                    user.add(sc.nextInt());
//                }
//
//                Iterator<Integer> comList = computer.iterator();
//                Iterator<Integer> userList = user.iterator();
//
//                while(comList.hasNext()) {
//                    Integer comNumber = comList.next();
//                    Integer userNumber = userList.next();
//
//                    if(comNumber == userNumber) {
//                        strike++;
//                    }else if(computer.contains(userNumber)) {
//                        ball++;
//                    }
//
//                }
//
//                System.out.println("현재 스트라이크 :"+strike + "  볼 : " + ball);
//
//                if(strike == 3) {
//                    win = true;
//                    break;
//                }
//
//                user.clear();
//            }
//
//            if(win) {
//                System.out.println("승리 !");
//            }else {
//                System.out.println("패배..T_T");
//                System.out.println("정답 : " + computer.toString());
//            }
//
//
//            System.out.println("Y를 입력하면 다시,N을 입력하면 게임 종료");
//            String str = sc.next();
//
//            if(str.equals("Y") || str.equals("y")) {
//                System.out.println("게임을 다시시작 합니다.!");
//                continue;
//            }else if(str.equals("N") || str.equals("n")) {
//                System.out.println("게임을 종료합니다.");
//                break;
//            }else {
//                System.out.println("입력 오류. 게임 종료");
//                break;
//            }
//        }while(true);
//
//
//    }
//
//}
