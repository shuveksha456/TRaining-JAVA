public class Cuboid{
public int length;
public int breadth;
public int height;

//Default Constructor  method of class used to initialize the instance variable of class
public Cuboid()
{
this.length = 0;
this.breadth = 0;
this.height = 0;

}

//Parameterized constructor
public Cuboid (int length, int breadth, int height)
{
this.length = length;
this.breadth = breadth;
this.height = height;

} 

//method to calculate volume
public void volume()
{
int result = length * breadth * height;
System.out.println("Result is :" + result);
}


public static void main (String[]args)
{
Cuboid mycuboid = new Cuboid(2, 4, 2);
//Cuboid newrect = new Cuboid();
//newrect.length = 2;
//newrect.breadth = 4;
//newrect.height = 2;


mycuboid.volume();
}
} 