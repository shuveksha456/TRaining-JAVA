public class Number {
    int [] array1;
public int getLargest(int[] arr)
{
    int n = arr.length;
    int large = arr[0];
    for(int i = 1; i < n; i++)
    {
       if(large < arr[i])
       {
         large = arr[i];
       }
    }
    return large;
}  
public int getsmallestt(int[] arr)
{
    int n = arr.length;
    int small = arr[0];
    for(int i = 1; i < n; i++)
    {
       if(small > arr[i])
       {
         small = arr[i];
       }
    }
    return small;
}  
public static void main(String[] args) {
    Number num = new Number();
    int [] array =  {2, 5, 7, 9, 3, 5};
    int largest = num.getLargest(array);
    System.out.println("largest Number:" + largest);
     int smallest = num.getsmallestt(array);
     System.out.println("Smallest Number:" + smallest);
}
}
