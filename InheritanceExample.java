public class InheritanceExample {
    public int a;
    public int b; 

   
    class Arithmetic {

        public void addTwoDigits() {
            int result = a + b;  
            System.out.println("Add two digits: " + result);
        }
    }
 
  
    class Addition {
        Arithmetic add;

        public Addition() {
            add = new Arithmetic();
        }

        public void performAddition() {
            add.addTwoDigits();
            
        }
    }

    
    public static void main(String[] args) {
        InheritanceExample obj = new InheritanceExample();
        obj.a = 10;
        obj.b = 20;

        InheritanceExample.Addition additionObj = obj.new Addition();
        additionObj.performAddition();
    }
}
