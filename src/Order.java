public class Order {
    String orderID;

    Order() {
        orderID = "0000A";
        System.out.println(orderID);
    }

    Order(String od) {
        orderID = od;
        System.out.println(orderID);

    }

}
class RaiseTicket extends Order
{
  String orderID;

   RaiseTicket(){
       orderID="xxxB";
       System.out.println(orderID);

   }
   RaiseTicket(String od)
   {
       orderID=od;
       System.out.println(orderID);
   }

}