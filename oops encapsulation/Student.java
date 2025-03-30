import java.util.*;

public class Student {
    private int roll;
    private int[] marks;

    public void setroll(int rol) {
        roll = rol;
    }

    public int getroll() {
        return roll;
    }

    public void setmarks(int number) {
        Scanner sc = new Scanner(System.in);
        
         marks = new int[number];
        for (int i = 0; i < number; i++) {
            marks[i] = sc.nextInt();
        }
       
    }

    public int[] getmarks() {
        return marks;
    }

    public static void main(String[] args) {
        Students obj = new Students();
        Scanner sc = new Scanner(System.in);
        obj.setroll(sc.nextInt());
        int number = sc.nextInt();
        obj.setmarks(number);
        System.out.println(obj.getroll());
        System.out.println(Arrays.toString(obj.getmarks()));
    }
}
