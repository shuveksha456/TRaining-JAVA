package Tasks;

import java.util.Scanner;

public class LargestInteger {
  int []arr;
    public int getLargest( )
    {
        int n = arr.length;
        int large = arr[0];
        for(int i = 1; i < n; i++)
        {
           if(large < arr[i]  && arr[i] % 2 != 0)
           {

             large = arr[i];
           }
        }
        return large;
    }  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter array size: ");
        int arraySize = scanner.nextInt();
        
        LargestInteger num = new LargestInteger(); 
        num.arr = new int[arraySize]; 

        System.out.println("Enter " + arraySize + " elements:");
        for (int i = 0; i < arraySize; i++) {
            num.arr[i] = scanner.nextInt();
        }

        int largest = num.getLargest();
        System.out.println("Largest Number: " + largest);

        scanner.close();
    }
}
