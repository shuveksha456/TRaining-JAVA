public class Largestnumber {
    
    void largest(int a, int b){
        if (a > b){
            System.out.println("a is largest");
        }
        else{
           System.out.println("b is largest");
        }
    }
    public static void main(String[] args) {
        Largestnumber obj1= new Largestnumber();
        obj1.largest(10,20);

    }
}

