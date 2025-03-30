import java.util.Scanner;
public class use {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the row");
        int row = sc.nextInt();
 
       int [][] arr = new int[row][];

        for(int i=0;i<row;i++){
            System.out.println("enter the size of the coloumn");
            int column = sc.nextInt();
            arr[i]=new int[column];
            for(int j =0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j =0;j<arr[i].length;j++){
                sum+=arr[i][j];
                // System.out.print(arr[i][j]+" ");
                System.out.print("Sum is :"+sum);
            }
            System.out.println();
        }

    }
}
