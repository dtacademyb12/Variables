public class Variables {

    public static void main(String[] args) {


        //Variables are containers that store values to be used later in the program
        // If you need to change the value of a variable

        String name = "Bob"; // store Bob in a variable called name of type String
        int age = 23; // store 23 in a variable called age of type integer

        System.out.println( name +  " is a guy who is " + age + " years old");
        System.out.println( name +  " is a guy who is " + age + " years old");
        System.out.println( name +  " is a guy who is " + age + " years old");
        System.out.println( name +  " is a guy who is " + age + " years old");
        System.out.println( name +  " is a guy who is " + age + " years old");
        System.out.println( name +  " is a guy who is " + age + " years old");
        System.out.println( name +  " is a guy who is " + age + " years old");
        System.out.println( name +  " is a guy who is " + age + " years old");
        System.out.println( name +  " is a guy who is " + age + " years old");
        System.out.println( name + " is a guy who is " + age + " years old");



        //Declare variables

        int numberOfStudents;

        // multiple declaration
        int num1, num2, num3;
//        int num4, int num5, num6;  // does not compile
//        int num4, String num5, num6;

        numberOfStudents = 23; // initialization

        // declare and initialize in the same line
        int count = 88;


        // multiple declaration and initialization

        int a = 4, b = 5, c = 6;

        int x, y = 6, z; //x and z are declared only, y is declared and initialized

      //In Java a variable must be initialized before using
//        int myNum;
//        System.out.println(myNum); //variable might not have been initialized


        // Refactoring -> changing the code after you already typed it


        int height = 56; // assignment means value on the right is stored in a variable on the left
        //System.out.println(34 == 22); //java has a separate equality operator  ==


      // Re-assignment

        int number = 45;
        System.out.println(number);
        number = 55; // re-assign 55
        System.out.println(number + 20);
        System.out.println(number * number);







    }
}
