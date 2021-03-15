public class ThreadPractice {
    int N = 10;
    int i = 1;

    public synchronized void printEven() {

        while (i < 10) {
            if (i % 2 != 0) {

                try {
                    wait();
                } catch (Exception e) {
                    System.out.println(e.getStackTrace());
                }
            }
            System.out.print(i + " ");
            i++;
            notify();
        }

    }

    public synchronized void printOdd() {

        while (i < 10) {
            if (i % 2 == 0) {

                //   i++;
                try {
                    wait();
                } catch (Exception e) {
                    System.out.println(e.getStackTrace());
                }
            }
            System.out.print(i + " ");
            i++;
            notify();
        }


    }

    public static void main(String[] args) {

        ThreadPractice pr = new ThreadPractice();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                pr.printOdd();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                pr.printEven();
            }

        });
        t2.start();
        t1.start();


    }


}
