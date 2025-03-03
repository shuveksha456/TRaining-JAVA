// public class InheritanceSecondExample {
    
// }

//Parent class 
class Car{
   void startEngine(){
    System.out.println("Engine is starting");
    System.out.println("I am in car class of method startengine ");
   }

   void closeEngine(){
    System.out.println("Engine is closing");
      System.out.println("I am in car class of method closeengine ");
   }
}

// 1st child class
class BMW extends Car{
   void startAndCloseEngine(){
    System.out.println("Engine is starting and closing");
    super.startEngine();
    super.closeEngine();
   }
}

//2nd child class (main body)
class Toyota extends BMW{
    public static void main (String[]args){
        BMW b = new BMW();
        b.startAndCloseEngine();
        Toyota t = new Toyota();
        t. startAndCloseEngine();
        
       
    }
}

  
