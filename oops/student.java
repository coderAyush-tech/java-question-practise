
public class student {
  private String name;
  private int roll;
  private int [] marks ;

  public student(String name,int roll,int[]marks){
    this.name =name;
    this.roll = roll;
    this.marks =marks;
  }
  public String getname(){
    return name;
  }
  public void setname(String n){
    name =n;
  }
  public int getroll(){
    return roll;
  }
  public void setroll(int r){
    roll =r;
  }

  public int[] getmarks(){
    return marks;
  }
  public void setmarks(int [] m){
    marks =m;
  }

  public static void main(String[] args) {
    
  }
}
