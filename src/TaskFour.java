import java.util.Scanner;

/**
 * Created by Damian on 23.10.2017.
 */
public class TaskFour {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kod pocztowy:");
        String code = scanner.next();

        if (code.length() == 6 && code.charAt(2) == '-' && Character.isDigit(code.charAt(0)) && Character.isDigit(code.charAt(1)) &&
                Character.isDigit(code.charAt(3)) && Character.isDigit(code.charAt(4)) && Character.isDigit(code.charAt(5))){
        }else {
            System.out.println("Podałeś niepoprawny kod pocztowy");
        }
    }
}
