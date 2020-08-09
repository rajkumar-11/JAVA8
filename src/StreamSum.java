import java.util.Arrays;
import java.util.List;

public class StreamSum
{
    public static void main(String[] args)
    {
       List<Integer> list= Arrays.asList(1,2,3,4,5,6);

        System.out.println(list.stream().mapToInt(a->a).sum());
     //  List<Integer>list= Arrays.
    }

}
