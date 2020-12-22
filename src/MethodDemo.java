class Outer1 {
    void outerMethod() {
        System.out.println("inside outerMethod");
        // Inner class is local to outerMethod()
        class Inner {
            int a=10;
            void innerMethod() {
                System.out.println("inside innerMethod"+ a);
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }
}
class MethodDemo {
    public static void main(String[] args) {
        Outer1 x = new Outer1();
        x.outerMethod();
    }
}
