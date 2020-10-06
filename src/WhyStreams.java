import java.util.Arrays;
import java.util.List;

public class WhyStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Calculate the total of double of even numbers
        int result = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if(i % 2 == 0) {
                result += numbers.get(i * 2);
            }
        }
        System.out.println(result);


        // functional
        result = numbers.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(e -> e * 2)
                .sum();
    }
}
