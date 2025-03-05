package Tasks;

 class Name {
    void College(){
        System.out.println("My college name is Nepathya Coleege.");
    }
}

class Address extends Name{
    void College(){
        System.out.println("It lies in Manigram, Tilottama.");
    }
}

public class OverRiding{
    public static void main(String[] args) {
        Name mycollege = new Name();
        mycollege.College();

        Address collAddress = new Address();
        collAddress.College();
    }
}


