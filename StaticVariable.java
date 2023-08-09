class Mobile{
    String brand;
    int price;
    String name;
    
    public void show(){
        System.out.println("Brand : " + brand + "\nPrice : "+ price + "\nName : "+name);

    }
}

public class StaticVariable {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 100;
        obj1.name = "SmartPhone";


        obj1.show();

    }
}
