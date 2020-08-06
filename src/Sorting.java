import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

        String arr[] = {"5", "1237637463746732323",
                "97987", "12" };

        sortArr(arr);

       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+" ");
       }

    }

    private static void sortArr(String[] arr)
    {
        Arrays.sort(arr,(a,b)->{
            if(a.length()!=b.length())
                return a.length()-b.length();
            return a.compareTo(b);
        });


    }
}
