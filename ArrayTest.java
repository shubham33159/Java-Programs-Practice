class Student{
    int rollNo;
    int marks;
    String name;
}

public class ArrayTest {
    public static void main(String args[]){

        // Single Diamentional array
        int arr[] = {5,3,100,3,9};
        // System.out.println(arr[0]);
        // System.out.println(arr[arr.length-1]);

        // for (int i=0; i<arr.length; i++){

        //     System.out.println(arr[i]);
        // }

        // for(int value: arr){
        //     System.out.println(value);
        // }
        

        // int array[] = new int[10];
        // System.out.println(array);

        // System.out.println(array[0]);


        // Multi Diamentional array

        int MulArray[][] = new int[2][3];
        MulArray[0][0] = 100;
        MulArray[1][2] = 50;

        // System.out.println(MulArray[0][0]);
        // System.out.println(MulArray[0][1]);

        // for(int i=0; i<MulArray.length;i++){
        //     for(int j=0; j<MulArray[i].length;j++){
        //         System.out.print(MulArray[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        // for (int[] L1Array: MulArray){
        //     for (int L2Array: L1Array){
        //         System.out.print(L2Array + " ");
        //     }

        //     System.out.println();
        // }


        // Jagged Array

        

        // Practive Array
        Student s1 = new Student();
        s1.name = "Shubham";
        s1.rollNo = 33159;
        s1.marks = 100;
        

        Student s2 = new Student();
        s2.name = "Sumit";
        s2.rollNo = 33159;
        s2.marks = 100;


        Student s3 = new Student();
        s3.name = "Manas";
        s3.rollNo = 33159;
        s3.marks = 100;

        Student students[] = {s1,s2,s3};
        // System.out.println(students[0].name + students[0].marks);
        for (Student stud: students){
            System.out.println(stud.name + " " + stud.marks);
        }

    }
}
