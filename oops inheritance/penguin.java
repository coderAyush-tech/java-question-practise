 class bird {
    void fly(){

    }
}
public class penguin extends bird{
    void fly(){
        System.out.println("bird cannot fly");
    }
public static void main(String[] args) {
    penguin obj = new penguin();
    obj .fly();
}
}
