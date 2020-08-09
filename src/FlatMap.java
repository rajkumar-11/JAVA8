import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args)
    {
        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        List<Integer> list2= Arrays.asList(6,7,8,9,10);
        List<Integer> list3= Arrays.asList(11,12,13,14,15);
        List<List<Integer>>list4= Arrays.asList(list1,list2,list3);

       List<Integer>list5= list4.stream().flatMap(a->a.stream()).collect(Collectors.toList());
        System.out.println(list5.toString());

    }
}
