package lotto;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        LottoManager lottoManager = new LottoManager();
        System.out.println(" ―――――――――――――――――――――――――――――――――――");
        System.out.println("｜  로 또 번 호 랜 덤 추 첨 서 비 스  ｜");
        System.out.println(" ―――――――――――――――――――――――――――――――――――");

        Scanner sc = new Scanner(System.in);
        System.out.println("원하시는 서비스를 번호를 입력하세요.");
        System.out.println(" ★★★★★★1번 : 수동  ★★★★★★★");
        System.out.println(" ★★★★★★2번 : 자동  ★★★★★★★");

        int n = sc.nextInt();
        if(n == 1) {
            lottoManager.manual();
        }
        else if(n == 2) {
            lottoManager.auto();
        }else {
            throw  new Exception("잘못 입력하셨습니다.");
        }


    }
}
