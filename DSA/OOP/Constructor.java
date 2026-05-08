public class Constructor {
    public static class Car {
        int seats; // 0
        String name; // null
        double length; // 0.0
        // constructor overloading

        Car() { // default constructor
                
        }

        Car(int x, String s, double d) {
            seats = x;
            name = s;
            length = d;
        }

        void print() {
            System.out.println(seats + " " + name + " " + length);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(5, "kia", 3.99);
        c1.print();
        c1.length = 7.8;
        System.out.println(c1.length);

        Car c2 = new Car(4, "alto", 4.5);
        c2.print();

    }
}
