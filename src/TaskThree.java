import java.util.Scanner;

/**
 * Created by Damian on 23.10.2017.
 */
public class TaskThree {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz:");
        String word = scanner.next();

        System.out.println("Przedostatnia litera wyrazu to "+word.charAt(word.length() - 2));
    }
}
