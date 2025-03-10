package WrapperClass;

import java.util.ArrayList;

class Food {
    private String name; // properties :private
    private int price;

    Food() {
    };

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
}

public class Hotel {
    public static void main(String[] args) {
        Food f1 = new Food();
        f1.setName("MoMo");
        f1.setPrice(150);

        Food f2 = new Food();
        f2.setName("Samosa");
        f2.setPrice(20);

       ArrayList<Food>  menu = new ArrayList<Food>();
          menu.add(f1);
          menu.add(f2);

         
        
    }
}
