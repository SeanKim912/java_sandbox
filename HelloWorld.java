public class HelloWorld {
    public static void main(String[] args) {
        /*
         * Compile files with command "javac HelloWorld.java".
         * Transformed into byte code by compiler and executed by
         * JVM (Java Virtual Machine).
         *
         * Do this to catch errors before running the code.
         *
         * After file is compiled, command produces an executable class. Thus in this case
         * you can run "java HelloWorld".
         */
        System.out.println("Hello, World!"); // short for "print line"

        System.out.print("What "); // prints without a newline
        System.out.print("is ");
        System.out.print("up?");

        String name = "Sean Kim"; // This is the String literal method of declaration. MUST be surrounded by double quotes "". Strings are objects in Java.
        String nickname = new String("Skim"); // This is the object method of declaration for strings.

        // Escape sequence beginning with \ allows you to add certain characters to a string. \\ adds "\", \" adds double quotes, etc. \n is a new line.

        // Remember, Java is CASE-SENSITIVE, and variable names can ONLY begin with a letter, $, or _

        // Variable naming conventions are CAMEL-CASE!

        char firstInitial = 'S'; // char can hold any single character, MUST be surrounded by single quotes ''.
        int yearCreated = 1993;
        double gpa = 3.62;
        boolean isCool = true;

        /**
         * Commenting is similar to other languages, but the syntax in this block is different
         * because it is a Javadoc comment. They are used to create documentation for APIs.
         * Might eventually be read by users.
         */
    }
}
