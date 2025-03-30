import java.util.*;

public class Students {
    String name;
    int age;
    double marks;

    public Students(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void displayAll() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students[] obj = new Students[3];
      

        for (int i = 0; i < obj.length; i++) {
            System.out.println("Enter the name:");
            String name = sc.nextLine();

            System.out.println("Enter the age:");
            int age = sc.nextInt();

            System.out.println("Enter the marks:");
            double marks = sc.nextDouble();

            sc.nextLine(); // Consume the leftover newline character

            obj[i] = new Students(name, age, marks);
        }

        System.out.println("\nStudent Details:");
        for (Students student : obj) {
            student.displayAll();
            System.out.println("-------------");
        }

        sc.close();
    }
}