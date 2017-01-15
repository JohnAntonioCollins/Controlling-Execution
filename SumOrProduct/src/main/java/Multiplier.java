/**
 * Created by johncollins on 1/13/17.
 */
public class Multiplier {

    int n = 0;
    static int j = 1;

    static public int multiply(int n){
        for(int i = 1; i < n+1; i++){
            j *= i;
        }

    return j;
    }

}


