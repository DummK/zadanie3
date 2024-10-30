import java.util.Scanner;

public class Main {
    public static int MAX2(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe: ");
        int a = scan.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int b = scan.nextInt();
        System.out.println("Podaj trzecia liczbe: ");
        int c = scan.nextInt();

        int d = Main.MAX2(a, b);

        System.out.println("Największą liczba wynosi: " + Main.MAX2(d, c));

    }
}