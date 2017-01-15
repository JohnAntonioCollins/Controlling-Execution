/**
 * Created by johncollins on 1/14/17.
 */
public class Responder {

    public String response(boolean guessEvaluation){

        if(guessEvaluation){
            //System.out.println("Yes!");
            return "Yes! You guessed the secret number in ";
        }
        else {
            //System.out.println("Guess again my friend!");
            return "Guess again my friend!";

        }
        //return "why does this need to be here?";
    }

}
