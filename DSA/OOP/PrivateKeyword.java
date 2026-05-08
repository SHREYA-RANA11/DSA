import java.util.Scanner;

class Students {
    String name;
    private int rno;
    double cgpa;
    public void print() { // getter
        System.out.println(name + " " + cgpa + " " + rno);
    }

    int getRno() {
        return rno;
    }
    void setRno(int x){
        rno = x;
    }
}
public class PrivateKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students s1 = new Students();
        s1.print();
        s1.name = "shreya";
        s1.setRno(34);
        System.out.println(s1.getRno());
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
    }
}