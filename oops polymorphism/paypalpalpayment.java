 class payment {
    void pay(){
        System.out.println("this is a payment  option");
    }
}
 class creditcardpayment extends payment{
    void pay(){
        System.out.println("this is creditcart payment");
    }
    public static void main(String[] args) {
        creditcardpayment obj = new creditcardpayment();
        payment obj2 = new payment();
        obj.pay();
        obj2.pay();
    }
}
public class paypalpalpayment extends payment{
    void pay(){
        System.out.println("this is paypal payment");
    }
    public static void main(String[] args) {
        paypalpalpayment obj =new paypalpalpayment();
   
       
        obj.pay();
       
    }
}
