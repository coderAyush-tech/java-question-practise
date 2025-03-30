interface flyable {
    abstract void fly();  
} 
class aeroplane implements flyable{
  public  void fly(){
        System.out.println(" aeroplane is flying");
    }
}
public class bird implements flyable{
    public void fly(){
        System.out.println("bird is flying");
    }
    public static void main(String[] args) {
        flyable obj = new aeroplane();
        flyable obj1 = new bird();
        obj.fly();
        obj1.fly();
    }
}
