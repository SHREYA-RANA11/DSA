import java.util.Scanner;

public class UserDefinedDataType {
    public static class car {
        int seats;
        String name;
        double length;
        String type;
        int torque;

        void print() {
            System.out.println(name + " " + +length + " " + type + " " + torque);
        }
    }

    public static class Student {
        String name;
        int rno;
        double cgpa;

    }

    public static void main(String[] args) {

        car c = new car();
        c.length = 3.99;
        c.name = "kia";
        c.seats = 5;
        c.torque = 179;
        c.type = "suv";
        change(c);
        System.out.println(c.seats);
        c.print();

        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "shreya";
        s1.rno = 23;
        s1.cgpa = 8.5;

        Student s2 = new Student();
        s2.name = "yoyo";
        s2.rno = 23;
        s2.cgpa = 8.5;

        Student s3 = new Student();
        s3.name = "hehe";
        s3.rno = sc.nextInt();
        s3.cgpa = 8.5;

        System.out.println(s1.name + " " + s1.cgpa + " " + s1.rno);
        s2.cgpa = 9.8;
        System.out.println(s3.rno);

    }

    private static void change(UserDefinedDataType.car x) {
        x.seats = 4;
    }
}
