import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class FindFirst {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6);

       Optional<Integer> x=list.stream().findFirst();
        System.out.println(x);

    }

}
