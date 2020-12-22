class Flavor2Demo {
     static int x=10;
    // An anonymous class that implements Hello interface 
    static Hello h = new Hello() {
        public void show2() {
            System.out.println("here i am");
        }
        public void show() {
            System.out.println("i am in anonymous class"+x );
        }



    };

    public static void main(String[] args)
    {
        h.show();
        h.show2();
    }
}

interface Hello
{
    void show();
    void show2();
} 