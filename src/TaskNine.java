import java.util.Scanner;

/**
 * Created by Damian on 24.10.2017.
 */
public class TaskNine {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz:");
        String word = scanner.next();
        System.out.println("Pierwsze dwa znaki wyrazu to: "+" "+word.charAt(0)+word.charAt(1));
    }
}
