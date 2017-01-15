/**
 * Created by johncollins on 1/14/17.
 */
public class Responder {

    public String respond(boolean guessEvaluation, int numberOfTries){

        if(guessEvaluation){
            //System.out.println("Yes!");
            return "Yes! You guessed the secret number in " + numberOfTries + " attempts.";
        }
        else {
            //System.out.println("Guess again my friend!");
            return "Guess again my friend!";

        }
        //return "why does this need to be here?";
    }

}
