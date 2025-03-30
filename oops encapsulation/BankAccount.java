import java.util.*;
public class BankAccount {
    private int  accountnumber;
    private double balance;

    public void setnumber(int account){
        accountnumber = account;
    }
    public int getnumber(){
        return accountnumber;
    }
    public void setbaance(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
       
            while (count < 3) {
                System.out.println("enter ");
                double bala = scanner.nextDouble();
                if(bala<0){
                    
                    count++;

                }else{
                    balance = bala;
                    break;
                }  
            }
           
       
        // if(bala<0){
        //     System.out.println("negative balance not allowed");
        // }else{
        //     balance = bala;
        // }
        

    }
    public double getbalance(){

        return balance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount obj = new BankAccount();
        obj.setnumber(sc.nextInt());
        obj.setbaance();
        System.out.println(obj.getnumber());
        System.out.println(obj.getbalance());
    }
}
