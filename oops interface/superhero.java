interface flyable {
	abstract void fly();
}

interface swimmable {
	abstract void swim();
}
public class superhero implements flyable,swimmable{
   public void fly(){
    System.out.println("flying");
   } 
   public void swim(){
    System.out.println("swimable");
   }
   public static void main(String[] args) {
    superhero obj =new superhero();
    obj.fly();
    obj.swim();
   }
}