import java.util.*;
public class user {

    private String password;

    public void setpassword(){
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        if(password.length()<8){
            System.out.println("plas enter upto eight character:");
        }else{
            this.password= password;
        }
    }
    public String getpassword(){
        if(password == null){
            return "invalid";
        }
       else{
        return password;
       }
       
    }
    public static void main(String[] args) {
        user obj = new user();
        obj.setpassword();
        System.out.println(obj.getpassword());
    }
}
