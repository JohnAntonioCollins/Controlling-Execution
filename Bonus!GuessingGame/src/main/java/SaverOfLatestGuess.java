/**
 * Created by johncollins on 1/14/17.
 */
public class SaverOfLatestGuess {
    //int previousGuess;

    public void isRepeat(int userGuess, int previousGuess){
        if(userGuess == previousGuess){
            return;
        }
        else {
            previousGuess = userGuess;

        }

    }
}
