
class MethodReference1 {
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
    public static void main(String[] args) {
        // Referring static method  
     //   System.out.Println(M);
        Runnable saySomething = MethodReference1::saySomething;
        // Calling interface method  
        saySomething.run();
    }
}