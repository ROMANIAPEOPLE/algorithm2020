package baseball.utils;

import java.util.List;
import java.util.stream.Stream;

public class Numbers {
    private final List<String> numbers;

    public Numbers(List<String> numbers) {
        validator(numbers);
        this.numbers = numbers;
    }


    public int getStrike(Numbers user) {
        int st = (int) user.numbers.stream()
                .filter(s -> s.equals(numbers.get(user.numbers.indexOf(s))))
                .count();
        return st;
    }


    public  int getBall(Numbers user) {
        int overlapCount = (int) numbers.stream()
                .filter(s -> user.numbers.contains(s))
                .count();

        return overlapCount - getStrike(user);

    }


    public void validator(List<String> numbers) {
        int count = (int) numbers.stream()
                .distinct()
                .count();
        //1. 중복 있을때
        if (count < Condition.DEPTH) {
            throw new IllegalArgumentException("중복된 숫자는 입력할 수 없습니다.");
        }
        //2. 1~9에 벗어난 값 입력 또는 4자리 입력시 예외처리
        if (numbers.size() > Condition.DEPTH) {
            throw new IllegalArgumentException("1~9 사이의 값과, 3개의 숫자만 입력할 수 있습니다.");
        }
        //3. 0 입력시 예외처리
        int zeroSize = (int) numbers.stream()
                .filter(s -> s.equals("0"))
                .count();

        if (zeroSize > 0) {
            throw new IllegalArgumentException("0은 입력할 수 없습니다.");
        }
    }

}
