/**
 * Created by johncollins on 1/14/17.
 */
public class GuessChecker {
    
    public boolean isCorrect(int guess, int secret) {
        if(guess > secret){
            return true;

        }
        else if(secret < guess){
            return false;
        }
        else if(secret == guess){

        };
        
    }
}
