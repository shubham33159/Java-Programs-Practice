class Calculator{
    int num = 100;
    public int add(int x, int y){
        return x+y;
    }
}


public class TestClass {
    public static void main(String args[]){

        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();
        int result = c1.add(10,20);

        c1.num = 200;
        System.out.println(c1.num);
        System.out.println(c2.num);
        // System.out.println(result);

    }
    
}
