import javax.sound.midi.Soundbank;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat
{
    public static void main(String[] args)
    {
        SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy zzzz HH:mm:ss z");
        Date date= new Date();
        System.out.println(formatter.format(date));
        System.out.println(date);


    }

}
