class HelloWorld
{
    public static void main(String args[])
    {
        System.out.println("Hello World");

        int  num1 = 100;
        int num2 = 200;
        System.out.println(num1 + num2);

        // integer variable declaration

        int a=5;
        float f= 5.6f;
        long b=600l; // e.g 578l, 100000l represent long integer type
        //byte c=127;
        short s=128; 


        int bin = 0b101;
        System.out.println(bin);


        char c = '0';
        c++;
        System.out.println(c);

        int five = 5;

        byte FIVE = (byte) five;

        System.out.println(FIVE);

        int I = 260;

        byte B = (byte) I;

        System.out.println(B);

        I += 100;
        System.out.println((I));


    }
}