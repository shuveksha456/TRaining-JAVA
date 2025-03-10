package WrapperClass;

public class Convert {
    public static void main(String[] args) {
        int num = 5;
        String a = String.valueOf(num); // Convert int to String
        System.out.println("Converted int to String: " + a);

        String Id = "1001";
        int b = Integer.parseInt(Id); // Convert String to int
        System.out.println("Converted String to int: " + b);
    }
}

