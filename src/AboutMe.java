import java.util.Scanner;

public class AboutMe {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.next();

        System.out.println("Hello," + name);

        System.out.println("That's a cool program.");

    }
}
