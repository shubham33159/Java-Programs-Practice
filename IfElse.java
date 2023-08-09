public class IfElse {
    public static void main(String args[]){
        // ***** if else ******
        int i = 100;
        if ( i > 10){
            System.out.println("Greator");
        }
        else{
            System.out.println("Lessor");
        }

        // turnary operator

        int result=0;
        result = 6>=6 ? 10 : 20;
        System.out.println(result);

        // Switch case

        String name = "Shub";
        switch (name) {
            case "Shubham":
                System.out.printf("I am %s\n",name);
                break;

            case "Shub":
                System.out.printf("I am %s\n",name);
                break;
        
            default:
                System.out.println("I am nothing");
                break;
        }

        String day = "Monday";
        String return_values = "";
        return_values = switch (day) {
            case "Monday","Tuesday" -> "Good Day";
            case "Wednesday" -> "Bad Day";
            case "Saturday" -> "Cool Day";
            default -> "No problem";
        };

        System.out.println(return_values);


        // for loop

        for (int inc = 0; inc<=10; inc++){
            System.out.println(inc);
        }

        // While loop

        int i_inc = 1;
        while (i_inc < 10){
            System.out.println(i_inc);
            i_inc++;
        }

    }
    
}
