package Tasks;

public class Sort {

    public static void main(String[] args) {
        int[] numbers={3,16,22,6,10,12,38,90};
        int size=numbers.length;
        System.out.println("Before sorting: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(numbers[i]+" ");
        }
        // Sorting Logic
        for ( int i = 0; i < size; i++){
            for (int  j = 0; j < size - i - 1; j++){
                if (numbers[j+1] > numbers[j ]){
                    int temp = numbers[j ];
                    numbers[j ] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("After sorting: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(numbers[i]+" ");
        }
    }

}
        
       
           

