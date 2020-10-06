import java.util.Arrays;
import java.util.List;

public class ImperativeVsFunctional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // imperative
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // functional
        numbers.forEach((Integer i) ->
                {
                    System.out.println(i);
                }
        );
    }
}
