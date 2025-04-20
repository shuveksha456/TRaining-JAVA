package Task;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    // Constructor to initialize length and width with user input
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter and Setter methods
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate area
    public double area() {
        return length * width;
    }

    // Method to calculate perimeter
    public double perimeter() {
        return 2 * (length + width);
    }

    // Method to display rectangle details
    public void displayDetails() {
        System.out.println("Length: " + length + ", Width: " + width + ", Area: " + area() + ", Perimeter: " + perimeter());
    }

    // Method to find and display the rectangle with the largest area
    public static void displayLargestRectangle(Rectangle[] rectangles) {
        Rectangle largest = rectangles[0]; // Assume first rectangle is the largest
        for (Rectangle rect : rectangles) {
            if (rect.area() > largest.area()) {
                largest = rect;
            }
        }
        System.out.println("\nRectangle with the Largest Area:");
        largest.displayDetails();
    }

    // Method to sort rectangles in descending order of area (Bubble Sort)
    public static void sortRectanglesByArea(Rectangle[] rectangles) {
        int n = rectangles.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (rectangles[j].area() < rectangles[j + 1].area()) {
                    // Swap rectangles[j] and rectangles[j + 1]
                    Rectangle temp = rectangles[j];
                    rectangles[j] = rectangles[j + 1];
                    rectangles[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rectangles: ");
        int n = scanner.nextInt();

        Rectangle[] rectangles = new Rectangle[n];

        // Taking user input for n rectangles
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Rectangle " + (i + 1) + ":");
            System.out.print("Length: ");
            double length = scanner.nextDouble();
            System.out.print("Width: ");
            double width = scanner.nextDouble();
            rectangles[i] = new Rectangle(length, width);
        }

        // Sorting rectangles by area in descending order
        sortRectanglesByArea(rectangles);

        // Displaying all rectangles after sorting
        System.out.println("\nRectangles sorted by area (Descending Order):");
        for (Rectangle rect : rectangles) {
            rect.displayDetails();
        }

        // Displaying the rectangle with the largest area
        displayLargestRectangle(rectangles);

        scanner.close();
    }
}

