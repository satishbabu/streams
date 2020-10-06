import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

public class GroupingByExample {
    public static void main(String[] args) throws IOException {

        // group by book
        Map<String, List<Trade>> bookGrouping =
                Files.lines(Paths.get("trades.txt"))
                        .map(Trade::crateTrade)
                        .collect(groupingBy(Trade::getBook));

        System.out.println(bookGrouping);


        // Total for each book
        Map<String, Double> bookValues =
                Files.lines(Paths.get("trades.txt"))
                        .map(Trade::crateTrade)
                        .collect(groupingBy(Trade::getBook, summingDouble(Trade::getPresentValue)));
        System.out.println(bookValues);
    }
}
