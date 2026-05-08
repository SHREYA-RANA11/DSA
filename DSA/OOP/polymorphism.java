public class polymorphism {
    public static class Dog {
        void speak() {
            System.out.println("bhau bhau ");
        }

    }

    public static class cat {
        void speak() {
            System.out.println("meow meow");
        }

    }

    public static class Lion {
        void speak() {
            System.out.println("rrrr");
        }

    }

    public static class Pikachu {
        void speak() {
            System.out.println("pika pika");
        }

    }

    public static void main(String[] args) {
        Pikachu p = new Pikachu();
        cat c = new cat();
        Dog d = new Dog();
        Lion l = new Lion();



        p.speak();
        c.speak();
        d.speak();
        l.speak();
    }
}
