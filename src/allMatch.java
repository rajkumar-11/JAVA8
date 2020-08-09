import java.util.Arrays;
import java.util.List;

public class allMatch
{
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,6,9,12,15);

        boolean x=list.stream().allMatch(a->a%3==0);

        System.out.println(x);
    }
}
