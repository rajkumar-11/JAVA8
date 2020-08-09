import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlatMapToInt {
    public static void main(String[] args)
    {
        List<String> list1= Arrays.asList("rajkumar","navhal");
        List<String> list2= Arrays.asList("dravita","sharma");
        List<List<String>> list3= Arrays.asList(list1,list2);

//         list3.stream().flatMapToInt(a->a.stream().mapToInt(b->b.length())).forEach(System.out::println);

//        list3.stream().flatMapToInt(a-> IntStream.of(a.size())).forEach(System.out::println);

    }

}
