

class vechile {
    String brand;
    int speed;
    public vechile(String brand,int speed){
        this.brand = brand;
        this.speed=speed;
    }
}
public class car extends vechile {
String fueltype;
public car(String brand,int speed,String fueltype){
    super(brand, speed);
    this.fueltype  = fueltype;
}
 void display(){
System.out.println("brand is"+brand);
System.out.println("speed is"+speed);
System.out.println("fueltype is "+fueltype);
}
public static void main(String[] args) {
    car obj = new car("audi", 190, "disel");
   obj. display();
}
    
}