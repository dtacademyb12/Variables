public class StringFormatting {


    public static void main(String[] args) {


        String town = "Springfield";
        String animal = "Lion";
        String state = "VA";

       String sentence = String.format("The team is %s %ss from %s", town, animal,state);
//        System.out.println("The team is " + town + " " + animal + "s");
        System.out.println(sentence);

        //alternatively you can use printf()

        System.out.printf("The team is %s %ss from %s%n", town, animal,state);
        System.out.println("hello");

        System.out.printf("My age is %d. I was born in %d. I weigh %.2f", 57, 1965, 132.4532432423 );

    }
}
