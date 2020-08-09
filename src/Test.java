import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Test {
    public static void main(String[] args)
    {
       List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
       list.forEach(System.out::println);
       OptionalInt x=null;

        System.out.println(x);
        long y=list.stream().count();
        System.out.println(y);

    }

}
