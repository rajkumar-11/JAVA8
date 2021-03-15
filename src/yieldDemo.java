// Java program to illustrate yield() method
// in Java
import java.lang.*;

// MyThread extending Thread
class MyThread1 extends Thread
{
    public void run()
    {




    }
}

// Driver Class
public class yieldDemo
{
    public static void main(String[]args)
    {
        ABC abc= new ABC();
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {

                abc.printValues();
            }
        });
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {

                abc.printValues();
            }
        });
        Thread t3= new Thread(new Runnable() {
            @Override
            public void run() {

                abc.printValues();
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
class ABC
{
    public void printValues()
    {
        System.out.println(Thread.currentThread().getName()+ " is waiting");

        synchronized (this)
        {
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}