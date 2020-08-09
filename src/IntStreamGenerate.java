import java.util.stream.IntStream;

public class IntStreamGenerate
{
    public static void main(String[] args)
    {
        IntStream stream= IntStream.generate(()->{return (int)(Math.random()*10000);});
        stream.limit(7).forEach(System.out::println);

    }
}
