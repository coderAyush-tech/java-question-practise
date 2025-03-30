import java.util.*;;
public class person {

   private int age;
   public void setage(){
    int count =0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the age");
    while (count<2) {
      
        int age= sc.nextInt();
    
        if(age<0){
            
            count++;
            
        }else{
           this. age= age;
            break;
        }
        System.out.println("enter valid age");
       
    }
  
   }
   public int getage(){
    return age;
   }
   public static void main(String[] args) {
    person obj = new person();
    obj .setage();
    System.out.println(obj.getage());
   }

}
