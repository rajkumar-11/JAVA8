import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args)
	{
		List<Integer>list= Arrays.asList(1,2,3,4,5);
		System.out.println(list.stream().anyMatch(a->a*a==24));

	}
}
