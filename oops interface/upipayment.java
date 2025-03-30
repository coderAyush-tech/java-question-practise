interface payment {
    abstract void processpayment();
}
class Creditcardpayment implements payment{
  public  void processpayment(){
        System.out.println("processing payment");
    }
    
}
public class upipayment implements payment{
   public  void processpayment(){
        System.out.println("processing payment upi");
    }
    public static void main(String[] args) {
        payment obj = new Creditcardpayment();
        payment obj1 = new upipayment();
        obj.processpayment();
        obj1.processpayment();
    }
}
