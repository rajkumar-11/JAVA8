import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args)
	{
		Integer[] arr= new Integer[]{1,2,3,4,5};
		List<Integer> list= Arrays.asList(arr);
		System.out.println(list.toString());
		List<Integer> list2=list.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println(list2.toString());


	}
}
