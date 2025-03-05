package Tasks;
class Parent {
    void method1() {
        System.out.println("Parent: Method 1");
    }

    void method2() {
        System.out.println("Parent: Method 2"); 
    }

    void method3() {
        System.out.println("Parent: Method 3 (Not Overridden)");
    }
}

// Child class
class Child extends Parent {
    
    void method1() {  // Overriding method1
        System.out.println("Child: Overridden Method 1");
    }

    
    void method2() {  // Overriding method2
        System.out.println("Child: Overridden Method 2");
    }
    
   
}

// Main class
public class OverRiding1{
    public static void main(String[] args) {
       
        Child obj = new Child();
        
        // Calling methods
        obj.method1(); 
        obj.method2(); 
        obj.method3(); 
    }
}
