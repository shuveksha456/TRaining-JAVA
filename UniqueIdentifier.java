class Subject{
    private int math;
    private int science;
    private int english;
 
    public void setMath(int marks){
       this.math= marks;
    }
 
    public int getMath(){
       return this.math;
    }
 }
 public class UniqueIdentifier{
  public static void main(String[]args){
    Subject subject= new Subject();
    subject.setMath(55);
    System.out.println("Math Marks:"+ subject.getMath());
 }
 }