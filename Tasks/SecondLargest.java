package Tasks;

public class SecondLargest {
    public int getSecondLargest(int[] arr)
{
    int n = arr.length;
    int large = arr[0];
    int secondLargest = arr[0];
    for(int i = 1; i < n; i++)
    {
       if(large < arr[i])
       {
        secondLargest= large;
        large = arr[i];
       }
       else if(arr[i] > secondLargest && arr[i] < large){
        secondLargest = arr[i];
       }
    }
  
    return secondLargest;
} 
public static void main(String[] args) {
    SecondLargest num = new SecondLargest();
    int [] array =  {2, 5,  9,7, 3, 5};
    int largest = num.getSecondLargest(array);
    System.out.println(" Second largest Number:" + largest);
}
}
