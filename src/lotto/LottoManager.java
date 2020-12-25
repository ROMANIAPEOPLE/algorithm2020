package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoManager {

    public LottoTicket manual() {
        return new LottoTicket(createManualNumbers());
    }

    public LottoTicket auto() {
        return new LottoTicket(createAutoNumbers());
    }

    private List<Integer> createManualNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 6개의 번호를 입력하세요.");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            numbers.add(sc.nextInt());
        }
        return numbers;
    }


    private List<Integer> createAutoNumbers(){
        List<Integer> numbers = new ArrayList<>();
        while(numbers.size() < 6) {
            int number = RandomUtils.nextInt();
            if(autoNumberValid(numbers, number)) {
                continue;
            }
            numbers.add(number);
        }
        return numbers;
    }

    private boolean autoNumberValid(List<Integer> numbers, int number) {
        return numbers.contains(number);

    }

}
