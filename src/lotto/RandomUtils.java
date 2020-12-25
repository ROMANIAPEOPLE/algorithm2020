package lotto;
import java.util.Random;

public class RandomUtils {
    private static final Random RANDOM = new Random();

    private RandomUtils() {
    }

    public static int nextInt() {

        return 1 + RANDOM.nextInt(45);
    }
}