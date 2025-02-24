import java.util.Scanner;

public class Number1 {
    int[] array;

    public int getsmallest() {
        int n = array.length;
        int small = array[0]; 
        
        for (int i = 1; i < n; i++) {
            if (small > array[i]) {
                small = array[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter array size: ");
        int arraySize = scanner.nextInt();

        Number1 num = new Number1(); 
        num.array = new int[arraySize]; 

        System.out.println("Enter " + arraySize + " elements:");
        for (int i = 0; i < arraySize; i++) {
            num.array[i] = scanner.nextInt();
        }

        int smallest = num.getsmallest();
        System.out.println("Smallest Number: " + smallest);

        scanner.close();
    }
}
