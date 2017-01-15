import java.util.Scanner;

/**
 * Created by johncollins on 1/13/17.
 */
public class AskUserNumber {
    Scanner userNumberScanner = new Scanner(System.in);

    public int askUserNumber(){
        System.out.println("Enter a number.");
        int userNumber = userNumberScanner.nextInt();
        return userNumber;

    }
}
