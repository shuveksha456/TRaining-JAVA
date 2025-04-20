package WrapperClass;

import java.util.ArrayList;

class Food {
    private String name; // properties :private
    private int price;

    Food() {};

    void setName(String name) // private properties access garna get rw set banaako;
    {
        this.name = name;

    }

    void setPrice(int price) 
    {
        this.price = price;

    }

    String getName() {             // private properties access garna get rw set banaako;
        return this.name;
    }

    int getPrice() {
        return this.price;
    }

   @Override
    public String toString()
    {
     return  "Name :"+this.getName()+" "+"Price :"+this.getPrice();
    }
}

class Menu{
    String category;
    ArrayList<Food> menuItems;

    Menu(){
        menuItems = new ArrayList<>();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<Food> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<Food> menuItems) {
        this.menuItems = menuItems;
    }
    
   public void displayMenu(){
    System.out.println("Category: " + category);
    for (Food f: menuItems){
        System.out.println(f);
    }
   }

    
}

public class Hotel {
    public static void main(String[] args) {  
        Food f1 = new Food();
        f1.setName("MoMo");
        f1.setPrice(150);
        System.out.println(f1);

        Food f2 = new Food();
        f2.setName("Samosa");
        f2.setPrice(20);

       System.out.println(f2);

       ArrayList<Food>  menu = new ArrayList<Food>();
          menu.add(f1);
          menu.add(f2);

          for(Food f:menu)
          {
            System.out.println(f);
          }

         
     }
}
