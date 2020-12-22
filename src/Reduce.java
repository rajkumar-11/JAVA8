import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Reduce {
    public static void main(String[] args)
    {
      List<Integer> list= Arrays.asList(-1,2,5,3,8);

      int sum=list.stream().reduce(0,(a1,a2)->a1+a2);
      System.out.println(sum);
        List<String> words = Arrays.asList("GFG", "Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");

        Optional<String> string= words.stream().reduce((a1, a2)->a1.length()>a2.length()?a1:a2);

        System.out.println(string);

        String[] array = { "Geeks", "for", "Geeks" };

        Optional<String> String_combine= Arrays.stream(array).reduce((a1,a2)->a1+"-"+a2);

        System.out.println(String_combine);

        OptionalInt product= IntStream.range(2,9).reduce((a1, a2)->a1*a2);
        System.out.println(product);

    }

}
