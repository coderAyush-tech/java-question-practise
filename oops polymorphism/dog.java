 class animal {
    void makesound(){
        System.out.println("land");
    }
}
class cat extends animal{
    void makesound(){
        System.out.println("meow meow");
    }
}
public class dog extends animal{
    void makesound(){
        System.out.println("bow  bow");
    }
    public static void main(String[] args) {
        animal obj = new cat();
        obj.makesound();
        animal obj2 = new dog();
        obj2.makesound();
    }
}
