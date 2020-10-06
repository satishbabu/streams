import java.nio.file.Files;
import java.nio.file.Paths;

public class OopAndFunctional {
    public static void main(String[] args) throws Exception {
        Files.lines(Paths.get("trades.txt"))
                .map(Trade::crateTrade)
                .filter(trade -> trade.getPresentValue() >= 200)
                .forEach(System.out::println);
    }
}
