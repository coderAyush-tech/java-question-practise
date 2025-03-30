
 class person {
   void perso(){
    System.out.println("person");
   } 
}
class employee extends person{
    void emp(){
      System.out.println("employee");  
    }
}
public class manager extends employee{
  void man(){
    System.out.println("manager");
  }
  public static void main(String[] args) {
    manager obj = new manager();
    obj.man();
    obj.emp();
    obj.perso();
  }
}

