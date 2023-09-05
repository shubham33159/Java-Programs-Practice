class Mobile{
    String brand;
    int price;
    static String name;
    
    public void show(){
        System.out.println("Brand : " + brand + "\nPrice : "+ price + "\nName : "+name);

    }
}

public class StaticVariable {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 100;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 200;
        Mobile.name = "Phone";     


        obj1.show();
        obj2.show();

    }
}
