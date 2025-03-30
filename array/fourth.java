import java.util.*;
public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
  
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

       
        int flag =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                  flag =1;
              break;
             
                }
                
                
            }
           
        }
        
        if (flag == 0) {
            System.out.println("no du find");
        }

    }
   
}
