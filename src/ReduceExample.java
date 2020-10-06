import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReduceExample {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);

        // reduce initialValue, lambda
        int sum = stream
                .reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(sum);

        // simplify with Integer::sum


        // Pattern on String
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String result = letters.stream().reduce("", (a, e) -> a + e);

        // simplify String::concat
    }
}
