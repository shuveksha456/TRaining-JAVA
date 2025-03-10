package WrapperClass;
import java.util.ArrayList;

class Example {
    String msg;
    
    // Constructor
    Example() {
        msg = "This is message";
    }
    
    
    void display() {
        System.out.println(msg);
    }
}

public class ArrayListExample { 
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(); 
        Example ex = new Example(); 
        
        list.add("Orange");
        list.add(1);
        list.add("Black");
        list.add(ex.msg); // Added Example object message

        System.out.println(list);
        
        System.out.println("-------------");

        list.remove(ex.msg);    //Remove Example object message
        System.out.println(list);

        System.out.println("-------------");

        boolean isContain = list.contains("Orange");
        System.out.println("Does orange exists in list:" + isContain);

        System.out.println("-----------");

        System.out.println(list);

        System.out.println("------------");

        list.remove(ex);
        System.out.println(list);

        System.out.println("-----------");

        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Brown");
        System.out.println("String List: " + stringList);
    }
}
