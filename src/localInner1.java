public class localInner1{
    private int data=30;//instance variable
    void display(){
        class Local{
             private int a=10;
            void msg(){System.out.println(data);
                System.out.println("a= "+a);}
        }
        Local l=new Local();
        l.msg();
    }
    public static void main(String args[]){
        localInner1 obj=new localInner1();
        obj.display();
    }
}
