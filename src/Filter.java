import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filter
{
    public static void main(String[] args)
    {
       List<Integer> list= Arrays.asList(1,2,5,8,10,15,12,9,13);
       list.stream().filter(a->a%3==0).forEach(System.out::println);

        Stream<String> stream = Stream.of("Geeks", "foR",
                "GeEksQuiz", "GeeksforGeeks");

        stream.filter(s->s.endsWith("s")).forEach(System.out::println);
    }
}
