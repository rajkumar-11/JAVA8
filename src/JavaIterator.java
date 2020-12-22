import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaIterator
{
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        Iterator<Integer>itr= list.iterator();
        while(itr.hasNext())
        {
            itr.next();
            itr.remove();

        }
        System.out.println(list.size());

    }


}
