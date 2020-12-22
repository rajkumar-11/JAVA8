import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArbitaryObject
{
    public static void main(String[] args)
    {
        List<String> personList
                = new ArrayList<>();

        // Add Elements
        personList.add("vicky");
        personList.add("poonam");
        personList.add("sachin");

        Collections.sort(
                personList,
                String::compareToIgnoreCase);
        personList.forEach(
                System.out::println);

    }

}
