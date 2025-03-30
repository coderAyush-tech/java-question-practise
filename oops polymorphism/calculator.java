
public class calculator {
  public  int add(int a , int b){
        int sum;
        return sum = a+b;
    }
    public int add (int c , int d,int e ){
        int sum=c+d+e;
        return sum ;

    }
    public int add (int c , int d,int e ,int f){
        int sum=c+d+e+f;
        return sum ;

    }
    public static void main(String[] args) {
        calculator obj = new calculator();
        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(1, 2, 3));
        System.out.println(obj.add(1, 02, 03, 04));
    }
}
