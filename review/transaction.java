import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.OptionalInt;
import java.util.stream.Stream;
public class transaction {
    public static void main(String[] args) {
        String fileName = "transaction.txt"; 
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            int sum = lines
                .map(String::trim)
                .filter(line -> {
                    try {
                        Integer.parseInt(line);
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                })
                .mapToInt(Integer::parseInt)
                .sum();
            try (Stream<String> lines2 = Files.lines(Paths.get(fileName))) {
                OptionalInt max = lines2
                    .map(String::trim)
                    .filter(line -> {
                        try {
                            Integer.parseInt(line);
                            return true;
                        } catch (NumberFormatException e) {
                            return false;
                        }
                    })
                    .mapToInt(Integer::parseInt)
                    .max();

                System.out.println("Sum of Transactions: " + sum);
                System.out.println("Max Transaction: " + (max.isPresent() ? max.getAsInt() : "No valid transactions"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}