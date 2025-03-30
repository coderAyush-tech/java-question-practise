import java.util.*;
public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // for(int i=n-1;i>=0;i--){
        //   System.out.println(arr[i]);
        // }
        int temp=0;
        for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
          System.out.println(arr[i]);
        }
        
        
    }
}
