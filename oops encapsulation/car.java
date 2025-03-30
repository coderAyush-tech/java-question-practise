public class car {
    private int speed;
    void accelerate(int increment){
        this.speed+=increment;
        System.out.println("speed is "+ speed);
    }
    void brake(int decrement){
       this. speed-=decrement;
        System.out.println("speed is"+speed);
        
    }
    public void setspeed(int speed){
      this.speed = speed;
    }
    public int getspeed(){
        return this.speed;
    }
    public static void main(String[] args) {
        car obj  = new car();
        obj.setspeed(30);
        obj.accelerate(20);
        obj.brake(10);
        System.out.println(obj.getspeed());

    }
    
}
