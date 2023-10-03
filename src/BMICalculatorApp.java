import java.util.Scanner;

public class BMICalculatorApp {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // System.in -> keyboard

//        Ask the user for their weight in kilograms.
        System.out.println("Please enter your weight in kgs: ");
        double weight = input.nextDouble();

//        Ask the user for their height in meters.
        System.out.println("Please enter your height in meters:");
        double height = input.nextDouble();

//        Use the formula to calculate the BMI.
        double result = weight / (height * height);

//        Display the BMI to the user.

//        System.out.println("Your BMI is " + result);
        System.out.println("Your BMI is " + weight / (height * height) );

    }
}
