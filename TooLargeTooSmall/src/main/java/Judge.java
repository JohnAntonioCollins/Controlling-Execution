/**
 * Created by johncollins on 1/14/17.
 */
public class Judge {

    public void judge(int usersGuess, int secret, int currentCount){

        if (usersGuess > secret) {
            System.out.println("Too high.");
        } else if (usersGuess < secret) {
            System.out.println("Too low");
        } else if (usersGuess == secret) {
            System.out.println("You guessed it in " + currentCount + " attempts!");
        }
        }
    }

