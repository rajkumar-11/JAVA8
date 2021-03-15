import java.io.IOException;

public class Degree
{
 public void selectDegree() throws IOException
 {

 }

}
class Stream extends Degree
{

    public void selectDegree() throws IOException
    {
        super.selectDegree();

        throw new IOException();
    }

    public static void main(String[] args) {
        try{
            new Stream().selectDegree();
        }
        catch (IOException e)
        {
            System.out.println("IOExceptino Occured");
        }

    }

}