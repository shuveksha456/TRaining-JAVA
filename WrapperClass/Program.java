import java.util.ArrayList;
import java.util.Scanner;

class Food {
    String name;
    int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return"Name:"+ name +"Price:" + price;
    }
}

class Menu {
    String category;
    ArrayList<Food> foodList;

    public Menu(String category) {
        this.category = category;
        this.foodList = new ArrayList<>();
    }

    public void addFood(Food food) {
        foodList.add(food);
    }

   

    public boolean removeFood(String foodName) {
        for (Food item : foodList) {
            if (item.name.equalsIgnoreCase(foodName)) {
                foodList.remove(item);
                return true;
            }
        }
        return false;
    }

    public void display() {
        if (foodList.isEmpty()) {
            System.out.println("No food items available.");
            return;
        }
        System.out.println("Food Items in " + category + ":");
        for (Food item : foodList) {
            System.out.println("- " + item);
        }
    }
}

public class Program {
    public static void main(String[] args) {
        Menu menu1 = new Menu("Category1");
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Food Item");
            System.out.println("2. Remove Food Item");
            System.out.println("3. Display Food Items");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scan.nextInt();
            scan.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter food name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter food price: ");
                    int price = scan.nextInt();
                    scan.nextLine(); 

                    menu1.addFood(new Food(name, price));
                    System.out.println("Food added successfully!");
                    break;

                case 2:
                    System.out.print("Enter food name to remove: ");
                    String removeName = scan.nextLine();

                    if (menu1.removeFood(removeName)) {
                        System.out.println(removeName + " removed successfully!");
                    } else {
                        System.out.println("Food item not found.");
                    }
                    break;

                case 3:
                    menu1.display();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
