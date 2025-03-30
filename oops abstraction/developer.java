abstract class Employee {
abstract void  calculatesalary();
abstract void getdetail();
}
public class developer extends Employee {
void calculatesalary(){
    System.out.println("the calculated salary is 20000");
}
void getdetail(){
    System.out.println("detail");
}
public static void main(String[] args) {
    developer obj = new developer();
    obj.calculatesalary();
    obj.getdetail();

}
}