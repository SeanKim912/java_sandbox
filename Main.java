public class Main {
    public static void main(String[] args) {
        /*
            If you were to print the new instance below, in the case where the class
            constructor has nothing in it, it would default to a memory address referring to
            the walmart instance of the Store class. "walmart" variable is declared as a
            reference type as a opposed to a primitive type (int, boolean, etc.).

            Can set it equal to null to initialize a reference-type value with no reference.
         */
        Store walmart = new Store();
        System.out.println(walmart);

        walmart = null;
        System.out.println(walmart);
    }
}
