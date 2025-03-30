interface Innerremotecontrol {
abstract void turnon();
abstract void turnoff();
}
class Television implements Innerremotecontrol{
    public void turnon(){
        System.out.println("television is on");
    }
    public void turnoff(){
        System.out.println("televion is off");
    }
}
public class fan implements Innerremotecontrol{
    public void turnon(){
        System.out.println("fan is on");
    }
    public void turnoff(){
        System.out.println("fan is off");
    }
    public static void main(String[] args) {
        Innerremotecontrol obj = new Television();
        Innerremotecontrol obj1 = new fan();
        obj.turnon();
        obj.turnoff();
        obj1.turnon();
        obj1.turnoff();
    }
} 