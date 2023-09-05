
class A extends Object{
    public A(){
        System.out.println("In A");
    }
    public A(int n){
        this();
        System.out.println("In A int");
    }
}

class B extends A{
    public B(){
        super(0);
        System.out.println("In B");
    }

    public B(int n){
        System.out.println("In B int");
    }
    
    public B(int x, int y){
        this();
        System.out.println("In B int x y");
    }
}

class ConstructorPrac{
    public static void main(String args[]){
        B b = new B(5,10);
    }
}