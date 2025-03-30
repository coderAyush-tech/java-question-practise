import java.util.*;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        int radius = sc.nextInt();
        System.out.println(3.14 * radius * radius);
    }
}

public class Rectangle extends Shape {

    Scanner sc = new Scanner(System.in);
    


    void area() {
        System.out.println("enter the length and width:");
        int length = sc.nextInt();
        int width = sc.nextInt();
        System.out.println(length * width);
    }

    public static void main(String[] args) {
        Shape obj = new Circle();
        Shape obj1 = new Rectangle();
        obj.area();
        obj1.area();
    }
}