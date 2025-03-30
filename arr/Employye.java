import java.util.*;

public class Employye { // Corrected class name
    String name;
    int id;
    double salary; // Changed to lowercase for convention

    public Employye(String name, int id, double salary) { // Corrected constructor
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayAll() { // Instance method to display details
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employye[] obj = new Employye[3]; // Corrected class name

        // Input employee details
        for (int i = 0; i < obj.length; i++) {
            System.out.println("Enter the name:");
            String name = sc.nextLine();

            System.out.println("Enter the ID:");
            int id = sc.nextInt();

            System.out.println("Enter the salary:");
            double salary = sc.nextDouble();

            sc.nextLine(); // Consume leftover newline character
            obj[i] = new Employye(name, id, salary);
        }

        // Sort employees by salary in descending order
        for (int i = 0; i < obj.length; i++) {
            for (int j = i + 1; j < obj.length; j++) {
                if (obj[i].salary < obj[j].salary) { // Compare salaries
                    Employye temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;
                }
            }
        }

        // Display sorted employee details
        System.out.println("\nSorted Employee Details:");
        for (Employye a : obj) { // For-each loop
            a.displayAll();
            System.out.println("-------------");
        }

        sc.close();
    }
}