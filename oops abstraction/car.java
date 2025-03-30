abstract class vechiles {
    abstract void start();
}
class bikes extends vechiles{
    void start(){
        System.out.println("bike has started");
    }
}
public class  car extends vechiles {
    void start(){
        System.out.println("car has started");

    }
    public static void main(String[] args) {
        vechiles obj = new bikes();
        vechiles obj1 = new car();
            obj.start();
            obj1.start();
        }
    
}