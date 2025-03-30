import java.util.*;
public class two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the new size u have to ins");
        int n1 = sc.nextInt();
        int []arr2 = new int[n1];
        for(int j = 0;j<n1;j++){
          arr2[j] = sc.nextInt();
        }
        int[] merged = new int[n + n1];

        int k = 0;
        for (int i = 0; i < n; i++) {
            merged[k++] = arr[i];
        }
        for (int j = 0; j < n1; j++) {
            merged[k++] = arr2[j];
        }
    //   Arrays.sort(merged);
    for (int i = 0; i < merged.length ; i++) {
        for (int j = i + 1; j < merged.length; j++) {
            if (merged[i] > merged[j]) {
                int temp = merged[i];
                merged[i] = merged[j];
                merged[j] = temp;
            }
        }
    }


        System.out.println(Arrays.toString(merged));

    }
}
