import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Map
{
    public static void main(String[] args) {
         List<Integer> list1= Arrays.asList(1,2,3,4,5);
        List<Integer> list2= Arrays.asList(1,2,3,4,5);
        List<List<Integer>>list3= Arrays.asList(list1,list2);   

        list1.stream().map(a->a*a*a).collect(Collectors.toList());

     //   List<Integer>list4= list3.stream().flatMap(a->a*a).collect(Collectors.toList());
      //  System.out.println(list4.toString());

    }

}
