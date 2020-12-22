class Demo {

    public Demo()
    {
        System.out.println("Hey");
    }

    void show() {
        System.out.println("i am in show method of super class");
    }
    void show2()
    {
        System.out.println("rajkumar");
    }
}
class Flavor1Demo {

    //  An anonymous class with Demo as base class

    
    static Demo d = new Demo() {

        class abc
        {
            void abc()
            {
            //    System.out.println("rajkumar");
            }
        }

        void answer()
        {
            System.out.println("answer");
        }
        void show() {
            super.show();
            System.out.println("i am in Flavor1Demo class ");
        }
        void show2() {
            super.show2();
            System.out.println("jai shree ram");
        }
    };
    public static void main(String[] args){
        d.show();
        d.show2();
    }
}