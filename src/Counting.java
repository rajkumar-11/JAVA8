import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Counting {
    public static void main(String[] args)
    {
     Stream<Integer> s= Stream.of(1,2,3,4,5);
     Long x=s.collect(Collectors.counting());
     System.out.println(x);

    }


}
