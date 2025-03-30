abstract class Bank {
    abstract void getIntrestRate();
}
class Sbi extends Bank{
    void getIntrestRate(){
        System.out.println("5.0% intrest rate");
    }

}
public class Hdfc extends Bank{
    void getIntrestRate(){
        System.out.println("7.5% intrest rate");
    }
    public static void main(String[] args) {
        Bank obj = new Sbi();
        Bank obj1 = new Hdfc();
        obj.getIntrestRate();
        obj1.getIntrestRate();
    }
}