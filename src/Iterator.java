import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

public class Iterator {
    public static void main(String[] args) {
        IntStream x = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        PrimitiveIterator.OfInt itr = x.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.nextInt());
        }


    }

}
