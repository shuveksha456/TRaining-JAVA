public class Rectangle {
public int length;
public int breadth;

//Default Constructor  method of class used to initialize the instance variable of class
public Rectangle()
{
this.length = 0;
this.breadth = 0;

}

//Parameterized constructor
public Rectangle (int length, int breadth)
{
this.length = length;
this.breadth = breadth;

} 

//method to calculate area
public void area()
{
int result = length * breadth;
System.out.println("Result is :" + result);
}


//method to calculate perimeter
public void perimeter()
{
int result1 = 2*(length + breadth);
System.out.println("Result is :"+ result1);
}

public static void main (String[] args)
{
Rectangle myrect = new Rectangle(2, 4);

//Rectangle newrect = new Rectangle();
//newrect.length = 2;
//newrect.breadth = 4;

myrect.area();
myrect.perimeter();
}
} 