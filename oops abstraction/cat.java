abstract class Animal {
    abstract void makesound();
}
class Dog extends Animal{
    void makesound(){
        System.out.println("bow bow");
    }
}
public class cat extends Animal{
    void makesound(){
        System.out.println("meow mwoe");
    }
    public static void main(String[] args) {
        Animal obj = new cat();
        Animal obj1 = new Dog();
        obj.makesound();
        obj1.makesound();

    }
}

