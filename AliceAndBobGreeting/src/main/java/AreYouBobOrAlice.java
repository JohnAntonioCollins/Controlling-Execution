/**
 * Created by johncollins on 1/13/17.
 */
public class AreYouBobOrAlice {

    public boolean areYouBobOrAlice(String name) {
        if (name.equals("Bob") || name.equals("Alice")){
            return true;
        }
        else{
            return false;
        }
    }
}