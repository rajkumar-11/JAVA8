import java.util.stream.*;
public class PrintElements {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Geeks", "For",
                "Geeks", "A",
                "Computer", "Portal");

        // Print the stream
      stream.forEach(System.out::println);
    }
}
