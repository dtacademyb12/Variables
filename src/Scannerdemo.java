import java.util.Scanner;

//import java.util.Scanner; // import statement is used to make classes outside the current package available
// import statement has to be before the class
public class Scannerdemo {



    public static void main(String[] args) {

        // Create  the object of Scanner
        Scanner input = new Scanner(System.in);
        // Give prompt on what data to enter
        System.out.println("Please enter your year of birth: ");

        // get the year of birth as input
        int year = input.nextInt();

        // Calculate the age
        int age = 2023 - year;

        //Display age
        System.out.println("Based on your entered year of birth, your age is " + age);

    }
}
