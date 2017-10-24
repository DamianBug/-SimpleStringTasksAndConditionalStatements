import java.util.Scanner;

/**
 * Created by Damian on 23.10.2017.
 */
public class TaskTwo {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b:");
        int b = scanner.nextInt();
        System.out.println("Podaj liczbę c:");
        int c = scanner.nextInt();

        System.out.println("średnia z trzech liczb to: "+(a + b + c)/3.0);

    }
}
