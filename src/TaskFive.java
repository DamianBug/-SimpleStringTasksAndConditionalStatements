import java.util.Scanner;

/**
 * Created by Damian on 24.10.2017.
 */
public class TaskFive {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int number = scanner.nextInt();

        if (number % 3 == 0){
            System.out.println("Liczba jest podzielna przez 3");
        }else {
            System.out.println("Liczba nie jest podzielna przez 3");
        }
    }
}
