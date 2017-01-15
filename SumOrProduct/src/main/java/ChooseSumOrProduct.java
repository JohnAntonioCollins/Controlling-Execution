import java.util.Scanner;

/**
 * Created by johncollins on 1/13/17.
 */
public class ChooseSumOrProduct {
    Scanner sumOrProductScanner = new Scanner(System.in);
    AskUserNumber ask = new AskUserNumber();
    int answer;

    public int askSumOrNum(){
        System.out.println("Choose 'A' or 'M' to ADD or MULTIPLY all the integers from 1 to your number.");
        char addOrMultiply = sumOrProductScanner.next().charAt(0);
        switch (addOrMultiply) {
            case 'A' : answer = Adder.adder(ask.askUserNumber());
                break;
            case 'M' : answer =Multiplier.multiply(ask.askUserNumber());
                break;
            default:
        }
        return answer;
    }


}
