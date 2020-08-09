import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamParallel {
    public static void main(String[] args)
    {
        IntStream stream= IntStream.range(1,10);
        stream.parallel().sorted().forEach(System.out::println);

        List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7);

      //  IntStream stream2= Arrays.stream();

    }
}
