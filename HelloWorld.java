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

        String name = "Sean Kim";
        int yearCreated = 1993;

        /**
         * Commenting is similar to other languages, but the syntax in this block is different
         * because it is a Javadoc comment. They are used to create documentation for APIs.
         * Might eventually be read by users.
         */
    }
}
