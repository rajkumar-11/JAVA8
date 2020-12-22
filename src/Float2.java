public class Float2 implements InterfaceTest
{
    public static void main(String[] args)
    {
        InterfaceTest abc= new Float2();
        System.out.println(abc.add(10,15));
    }

    @Override
    public int add(int a, int b)
    {
        return a+b;
    }
}
interface InterfaceTest
{
    int add(int a, int b);
}