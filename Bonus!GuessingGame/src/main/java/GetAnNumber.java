import java.util.Scanner;

/**
 * Created by johncollins on 1/14/17.
 */
public class GetAnNumber {
    Scanner getGuess = new Scanner(System.in);

    public int makeUsersGuess(){
        System.out.println("Try to guess the secret number between one and ten!");
        int userGuess = getGuess.nextInt();
        //int previousGuess = userGuess;
        return userGuess;


    }


}
