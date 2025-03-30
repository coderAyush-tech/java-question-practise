import java.util.*;

public class stud {
    String name;
    int age;
    double marks;

    public stud(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stud[] obj = new stud[3];

        for (int i = 0; i < obj.length; i++) {
            System.out.println("Enter the name:");
            String name = sc.nextLine();

            System.out.println("Enter the age:");
            int age = sc.nextInt();

            System.out.println("Enter the marks:");
            double marks = sc.nextDouble();

            sc.nextLine(); // Consume leftover newline character

            obj[i] = new stud(name, age, marks);
        }
  double temp=0;
        System.out.println("\nStudent Details:");
        for (int i = 0; i < obj.length; i++) {
            for(int j=i+1;i<obj.length;java.awt.datatransfer++){
                if(obj[i].marks>obj[j].marks){
                    temp = obj[i].marks;
                    obj[i].marks = obj[j].marks;
                    obj[j].marks=temp;
                }
                
            }
            // System.out.println("Name: " + obj[i].name);
            // System.out.println("Age: " + obj[i].age);
            // System.out.println("Marks: " + obj[i].marks);
            // System.out.println("-------------");
        }
        for(int i=0;i<obj.length;i++){
            System.out.println(obj[i].marks);
        }

        sc.close();
    }
}