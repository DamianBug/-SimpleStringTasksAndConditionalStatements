import java.util.Scanner;

/**
 * Created by Damian on 24.10.2017.
 */
public class TaskEight {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy wyraz:");
        String word = scanner.next();
        System.out.println("Podaj drugi wyraz:");
        String secondWord = scanner.next();

        if (word.toLowerCase().equals(secondWord)){
            System.out.println("Podane wyrazy są równę");
        }else {
            System.out.println("Podane wyrazy nie są równę");
        }
    }
}
