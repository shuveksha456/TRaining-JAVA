package Task;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private double grade;

    // Constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    // Method to find and display the student with the highest grade
    public static void displayTopStudent(Student[] students) {
        Student topStudent = students[0]; // Assume first student has highest grade
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGrade() > topStudent.getGrade()) {
                topStudent = students[i];
            }
        }
        System.out.println("\nTop Student:");
        topStudent.displayDetails();
    }

    // Method to sort students in descending order of grade using Bubble Sort
    public static void sortStudentsByGrade(Student[] students) {
        int n = students.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getGrade() < students[j + 1].getGrade()) {
                    // Swap students[j] and students[j + 1]
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps were made, the array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        // Taking user input for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Grade: ");
            double grade = scanner.nextDouble();
            students[i] = new Student(name, age, grade);
        }

        // Sorting students by grade in descending order using Bubble Sort
        sortStudentsByGrade(students);

        // Displaying all students after sorting
        System.out.println("\nStudents sorted by grade (Descending Order):");
        for (Student student : students) {
            student.displayDetails();
        }

        // Displaying the student with the highest grade
        displayTopStudent(students);

        scanner.close();
    }
}

