class Animal {
    void makesound(){
        System.out.println("dog");
    }
}
public class dog extends Animal{
    void  makesound(){
        System.out.println("dog barks");
    }
    public static void main(String[] args) {
        dog obj = new dog();
        obj.makesound();
    }
}
