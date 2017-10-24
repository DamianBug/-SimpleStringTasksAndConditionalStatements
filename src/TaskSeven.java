import java.util.Scanner;

/**
 * Created by Damian on 24.10.2017.
 */
public class TaskSeven {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int number = scanner.nextInt();

        System.out.println("Ostatnia cyfra liczby to "+number % 10);
    }
}
