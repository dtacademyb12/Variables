import java.util.Scanner;

public class MultipleInputs {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers:");
        int num1 =  scanner.nextInt();
        int num2 =  scanner.nextInt();
        int num3 =  scanner.nextInt();

        System.out.println("Your numbers are:" + num1 + " " + num2 + " " + num3);



    }
}
