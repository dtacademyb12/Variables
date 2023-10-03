public class Primitives {

    public static void main(String[] args) {

        // Java has 2 categories of variables: primitives and objects

        int age = 45; //primitives only store the data
        System.out.println(age);

        String name = "Bob";  // objects can not only store data but perform operations on the data
        System.out.println(name.toUpperCase());


        // Java offers 8 primitives: byte, short, int, long, float, double , char, boolean

        byte b = 127;  // 1 byte,  -128 to 127
//        byte b = 130;
        short sh = 67; // 2 bytes , around -32K to 32K
//        short sh2 = 33000;

        int i = 67; // 4 bytes (32 bit), around -2 Billion to 2Billion
//        int i2 = 3000000000;


        long l = 67L; // 8 bytes (64 bit)
        long distanceToSun = 149597870700L; // use L or l with long values


        float weight = 78.5F; // F or f , 4 bytes
        double pi = 3.14; // 8 bytes


        float number1 = 3.144444444444444F;
        double number2 = 3.144444444444444;

        System.out.println(number1);
        System.out.println(number2);

        char ch = 'a'; // uses single quotes
        char ch1 = 'A';
        char ch3 = '%';
        char ch5 = '$'; // 0 to 65535

//        char ch6 = 'ў';


        boolean isMarried = true;
        boolean hasKids = false;

        if(isMarried){
            System.out.println("Has a tax break");
        }else {
            System.out.println("Do not apply a break");
        }


        String first = "Bob";
        String last = "Dole";
        String sentence = "The full name: " + first + " " + last;

        System.out.println(sentence);

//        int public;

        //Concatenation -> String + anything = String
        // + is used for addition when used with numbers and concatenation when used with Strings

        System.out.println(5 + 6 + "7" + 8 + 9); // 11789
        System.out.println( 1 + 1 + "1" + (1 + 1) ); // 212


        System.out.println(
                "cdsvv " +
                "vjdsvj" +
                "vjgvvjjhv " +
                "jhsdvvj " +
                "jhvjhv");

        System.out.println("""
                           hsdjj
                           kdsbfh
                           dshfj
                           dhskjhjd
                           gdshfdsg
                           """);

        // John said "Hello, my name is John"

        String message = "\"Hello, my name is John\"";
        System.out.println("John said " + message);
//        System.out.println("John said \"Hello, my name is John\"");
        // To use " inside a String use \"


        System.out.println("""
                           Talk is cheap.
                           Show me the "code".
                           """);


         int height = 45;
         String color = "green";

         System.out.println("HEIGHT:" + height);
         System.out.println("COLOR:" + color);






         boolean liveInTexas = true;






    }
}
