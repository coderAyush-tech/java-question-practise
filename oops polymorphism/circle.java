 class shape {
    void draw(){
        System.out.println("this is a shape");
    }
}
class rectangle extends shape{
     void draw(){
        System.out.println("this is a rectangle");
     }
}
class triangle extends shape{
    void draw(){
        System.out.println("this is a triangle");
    }
}
public class circle extends shape{
        void draw(){
            System.out.println("this is a circle");
        }
        public static void main(String[] args) {
            shape obj= new circle();
            obj.draw();
            shape obj1= new rectangle();
            obj1.draw();
            shape obj2=new triangle();
            obj2.draw();
        }
}