import java.util.Optional;

public class OfNullable
{
    public static void main(String[] args)
    {
      String[] string= new String[10];
        Optional<String>s1= Optional.ofNullable(string[5]);
        System.out.println(s1);

    }

}
