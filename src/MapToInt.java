import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapToInt
{
    public static void main(String[] args)
    {
       List<String> list= Arrays.asList("1","2","3","4","5");

       list.stream().mapToInt(a->Integer.valueOf(a)).forEach(System.out::println);

     //   String x="5";
   //     Integer.valueOf(x);


    }

}
