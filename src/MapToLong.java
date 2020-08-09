import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapToLong {
    public static void main(String[] args)
    {
        List<String>list= Arrays.asList("1","2","3","4","5");

        list.stream().mapToLong(a->Long.parseLong(a)).forEach(System.out::println);


    }
}
