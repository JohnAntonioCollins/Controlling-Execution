import java.util.Scanner;
//package collins.john;



// Understand how to get input from user


public class GetInput {
    Scanner getInput = new Scanner(System.in);

    public Integer getUserInt(){
        System.out.println("Guess the secret number between one and ten.");
        Integer userInt = getInput.nextInt();
        return userInt;
    }

}