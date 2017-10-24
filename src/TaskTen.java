import java.util.Scanner;

/**
 * Created by Damian on 24.10.2017.
 */
public class TaskTen {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        double a = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        double b = scanner.nextDouble();
        double temp;

        System.out.println("Liczby przed zamianą a to "+a+" b to "+b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("Liczby po zamianie, a to "+a+" b to "+b);
    }
}
