import java.util.Scanner;

/**
 * Created by Damian on 23.10.2017.
 */
public class TaskOne {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b:");
        int b = scanner.nextInt();
        System.out.println("Podaj liczbę c:");
        int c = scanner.nextInt();
        boolean isFound = false;

        if (((a >= b && a <= c) || (a >= c && a <= b)) && !isFound){
            isFound = true;
            System.out.println(a);
        }
        if (((b >= a && b <= c )|| (b >= c && b <= a)) && !isFound){
            isFound = true;
            System.out.println(b);
        }
        if (((c >= b && c <= a) || (c >= a && c <= b)) && !isFound){
            isFound = true;
            System.out.println(c);
        }
    }
}
