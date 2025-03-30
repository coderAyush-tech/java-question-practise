 interface playable {
abstract void play();     
}
 class football implements playable{
    public void play(){
        System.out.println("playing football");
    }
}
public class guitar implements playable{
   public void play(){
        System.out.println("playing guitar");
    }
    public static void main(String[] args) {
        playable obj = new football();
        playable obj1 = new guitar();
        obj.play();
        obj1.play();
        
    }
}

