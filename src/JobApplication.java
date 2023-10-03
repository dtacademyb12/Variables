import java.util.Scanner;

public class JobApplication {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Duotech! Please enter the given information below.");

        System.out.print("Enter your first name:");
        String first = scanner.nextLine(); // gets the entire line of input

        System.out.print("Enter your last name:");
        String last = scanner.next(); // gets a single word till the whitespace

        System.out.print("Enter your annual income:" );
        double income = scanner.nextDouble();


        scanner.nextLine();// call this once before using nextLine() after any of the other next() methods
        System.out.print("Enter your address:");
        String address = scanner.nextLine();

        System.out.print("Enter your phone:" );
        long phone = scanner.nextLong();

        System.out.print("Are you married?(true/false)");
        boolean isMarried = scanner.nextBoolean();

        System.out.print("Enter your height in m:");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kgs:");
        double weight = scanner.nextDouble();

        System.out.println("Here's your info:");
        System.out.println("FIRST NAME: " + first);
        System.out.println("LAST NAME: " + last);
        System.out.println("INCOME: " + income);
        System.out.println("ADDRESS: " + address);
        System.out.println("PHONE: " + phone);
        System.out.println("MARRIED: " + isMarried);

        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
        System.out.printf("BMI: %.2f", bmi); // print the bmi limiting the decimal digits to 2
        System.out.println( String.format("BMI: %.2f", bmi) ); //same as above, more verbose





    }
}
