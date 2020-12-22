import java.util.ArrayList;
import java.util.List;

public class Lambda
{
    public static void main(String[] args)
    {
        List<Product> list=new ArrayList<Product>();

        //Adding Products
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(3,"Keyboard",300f));
        list.add(new Product(2,"Dell Mouse",150f));

        System.out.println("Sorting on the basis of name...");

        list.sort((a1,a2)->a1.name.compareTo(a2.name));

        for(Product p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }



    }

}
class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
