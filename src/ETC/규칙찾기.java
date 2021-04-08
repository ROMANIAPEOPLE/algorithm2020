package ETC;

public class 규칙찾기 {
    public int solution(int n) {
        int count = 0;
        for (long p = 5; p <= n; p *= 5) {
            count += n / p;
        }
        return count;
    }
}
