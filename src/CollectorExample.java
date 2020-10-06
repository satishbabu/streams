import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorExample {
    public static void main(String[] args) {
        List<String> dogs = Arrays.asList("Mowgli", "Lilly", "Max", "Panda", "Daisy");


        List<String> dogsInUpperCase = dogs.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(dogsInUpperCase);
    }
}
