/**
 * Created by johncollins on 1/14/17.
 */
public class TooLargeTooSmall {

    public static void main (String[] args)

    {
        Judge judgeyMcJudgerton = new Judge();
        GetInput guess = new GetInput();

        int secret = (int) ((Math.random() + 1) * 5); //generates a random integer between 1 and 10.

        int previousGuess = 0;
        int currentCount =0;


        int usersGuess;
        do {
            usersGuess = guess.getUserInt();

            if(usersGuess != previousGuess) {
                currentCount++;
            }

            judgeyMcJudgerton.judge(usersGuess, secret, currentCount); //returns hi, low, or winner.

            previousGuess = usersGuess;
        }
        while (usersGuess != secret);




    }
}
