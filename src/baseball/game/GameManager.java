package baseball.game;

import baseball.utils.Condition;
import baseball.utils.Numbers;

/**
 * GameManager 클래스
 * 1. computer와 user 를 생성자로 받음
 * 2. 스트라이크 개수와 볼 개수 구하기
 * 3. 게임결과 리턴 / 출력
 */
public class GameManager {
    private final Numbers computer;
    private final Numbers user;
    private boolean gameClear;
    private Condition condition;

    public GameManager(Numbers computer, Numbers user) {
        this.computer = computer;
        this.user = user;
        gameClear=false;
    }

    public void printAndResult() {
        int strike = getStrike();
        int ball = getBall();

        System.out.println("스트라이크 : " + strike + " 볼 : " + ball);

        if(strike == condition.DEPTH) {
            gameClear=true;
            System.out.println("정답입니다 !! 게임종료");
        }

    }

    public int getStrike() {
        return computer.getStrike(user);
    }

    public int getBall() {
        return computer.getBall(user);
    }

    public boolean isGameClear() {
        return gameClear;
    }



}
