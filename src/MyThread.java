class MyThread
{
    public static void main(String[] args)
    {
        //Here we are using Anonymous Inner class 
        //that define inside argument, here constructor argument
        int x=10;
        Thread t = new Thread(new Runnable()
        {
            public void run()
            {
                System.out.println("Child Thread"+ x);
            }
        });

        t.start();

        System.out.println("Main Thread");
    }
} 