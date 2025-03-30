 class shape {
    void area(){

    }
}

class Rectangle extends shape{
void area(int length ,int breadth,int height){
    System.out.println(length*breadth*height);
}
}
public class Circle extends shape{
void area(double radius){
    System.out.println(3.14*radius*radius);
}
public static void main(String[] args) {
    Circle obj = new Circle();
    obj.area(3);
}
}