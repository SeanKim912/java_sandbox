public class Operators {
    public static void main(String[] args) {
        // Incrementing and decrementing work similarly to Javascript. +=, -=, %= also same.
        int age = 30;
        age++;
        System.out.println(age);
        age--;
        System.out.println(age);

        // Note that code below prints 2 instead of 2.5, as int floors decimal results.
        int unevenlyDivided = 10/4;
        System.out.println(unevenlyDivided);

        /*
         * In Java, you cannot compare objects like strings using primitive operators, so you must use the .equals() method.
         */

        String str1 = "John";
        String str2 = "Jim";

        System.out.println(str1.equals(str2)); // false
    }
}
