public class Store {
    // Constructor
    public Store() {
        public String name;
        public String address;
        public int size = 1000; // Default values when constructor does not have defined parameters
        public int capacity = 200;

        // Parameters defined below that you can include when initializing new instance.
        public Store(String title, String location) {
            name = title;
            address = location;
        }

        // Classes can have multiple constructors, differentiated by what parameters they have.
        public Car(int area, int people) {
            size = area;
            capacity = people;
        }
    }
    public void buyItems() {

    }
}
