/**
 * Created by johncollins on 1/13/17.
 */
public class RespondToUser {
    boolean isAliceOrBob;
    String name;

    public RespondToUser(boolean isBobOrAlice, String name){
        this.isAliceOrBob = isBobOrAlice;
        this.name = name;
        if(isAliceOrBob){
            System.out.println("Hi " + name);
        }
        else{
            System.out.println("NO GREETING FOR YOU!");
        }

    }
}
