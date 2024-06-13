public class Main {
    public static void main(String[] args) {
        /*
            If you were to print the new instance below, in the case where the class
            constructor has nothing in it, it would default to a memory address referring to
            the walmart instance of the Store class. "walmart" variable is declared as a
            reference type as a opposed to a primitive type (int, boolean, etc.).
         */
        Store walmart = new Store();
        System.out.println(walmart);
    }
}
