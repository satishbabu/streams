import java.util.stream.IntStream;

public class GetStarted {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.forEach(System.out::println);

        // Simplified
    }
}
