 class Arithmetic {
    int add (int a, int b){
        return a + b ;
    }
}

public class Addition extends Arithmetic {
    public static void main(String[] args) {
        Addition a = new Addition();
        int result= a . add(2,4);
        System.out.println("Result:" + result);
    }
}