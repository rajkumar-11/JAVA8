public class Child extends Parent {
    @Override
    public void walk() {
        System.out.println("child walk");
        super.walk();
    }

    @Override
    public void run() {
        System.out.println("child run");
        super.run();
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.run();
    }

}
