import java.util.Scanner;

public class tScanner {
    public static void main(String[] args) {
        System.out.println("entrer l'age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("age = " + age);
    }
}
