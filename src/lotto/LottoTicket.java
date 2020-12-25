package lotto;

import java.util.List;

public class LottoTicket {
    private final List<Integer> lotto;

    public LottoTicket(List<Integer> lotto) {
        validateDuplicate(lotto);
        validateRange(lotto);
        this.lotto = lotto;
        print();
    }

    public void print(){
        System.out.println(lotto.toString());
    }


    public void validateDuplicate(List<Integer> lotto) {
        long count = lotto.stream()
                .distinct()
                .count();
        if(count != 6) {
            throw new IllegalArgumentException("중복된 숫자는 입력할 수 없습니다.");
        }
    }

    public void validateRange(List<Integer> lotto) {
        long count = lotto.stream()
                .filter(v -> v > 0 && v<46)
                .count();
        if(count !=6) {
            throw new IllegalArgumentException("1 ~ 45 까지의 숫자만 입력할 수 있습니다.");
        }
    }

}
