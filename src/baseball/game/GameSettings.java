package baseball.game;

import baseball.utils.Condition;
import baseball.utils.Numbers;
import baseball.utils.RandomUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

/**
 * GameSettings 클래스 역할
 * 1. 사용자가 뽑은 번호 list 생성 / 리턴
 * 2. 컴퓨터가 뽑은 번호 list 생성 / 리턴
 */
public class GameSettings {
    private final Scanner scanner;

    public GameSettings(Scanner scanner) {
        this.scanner=scanner;
    }

    //유저가 뽑는 번호 생성
    public Numbers userSelectedNumber() {
        String input = scanner.nextLine();
        List<String> user = Arrays.stream(input.split(""))
                .collect(toList());
        return new Numbers(user);
    }

    //컴퓨터 번호 생성
    public Numbers generateComputerNumber() {
        List<String> computer = new ArrayList<>();

        while(computer.size() < Condition.DEPTH) {
            String rand = String.valueOf(getRandomNumber());
            if(duplicateInspection(rand,computer)) {
                continue;
            }
            computer.add(rand);
        }

        System.out.println(computer.toString()); // 정답 보기 위한 임시 print
        return new Numbers(computer);
    }

    //컴퓨터가 뽑은 정수가 중복인지 여부 판단
    public static boolean duplicateInspection(String rand, List<String> computer) {
        return computer.contains(rand);
    }

    //랜덤 넘버 생성
    public int getRandomNumber() {
        return RandomUtils.nextInt(Condition.MIN_VALUE,Condition.MAX_VALUE);
    }

}
