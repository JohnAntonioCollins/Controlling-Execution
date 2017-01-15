/**
 * Too Large Too Small

 Objectives

 To demonstrate your understanding of objects
 To demonstrate your understanding of operators
 To demonstrate your understanding of user input
 To demonstrate your understanding of functions
 Overview

 Write a guessing game where the user has to guess a secret number. After every guess the program tells the user whether their number was too large or too small. At the end the number of tries needed should be printed. It counts only as one try if they input the same number multiple times consecutively.

 Unit Test

 No Unit Test

 Instructions

 Break problem into pieces
 Solve for each piece of the problem
 Bring pieces together
 Print final output to screen

 * Created by johncollins on 1/14/17.
 */
public class TooLargeTooSmall {

    public static void main(String[] arg){

        int usersGuess = 0;
        int previousGuess= 0;
        boolean thisEvaluation = false;
        int currentCount = 0;


        GetAnNumber thisNumber = new GetAnNumber();
        GuessChecker checkThisGuess = new GuessChecker();
        Responder thisResponse = new Responder();
        CheckerOfUniqueGuess thisGuess = new CheckerOfUniqueGuess();
        //SaverOfLatestGuess repeatChecker = new SaverOfLatestGuess();
        //CounterOfAttempts thisCounter = new CounterOfAttempts();
        //int currentCount = thisCounter.count(c);


        CounterOfAttempts thisCounter = new CounterOfAttempts();
        //int currentCount = thisCounter.count(0);
        //thisCounter.count(currentCount);

        RandomNumber currentSecret = new RandomNumber();
        int secretNumber = currentSecret.RandNumToTen();
        //this is just to test my random number generator
        System.out.println("//This is for code testing; the secret number is " + secretNumber);

        //start game loop here
        do {
            usersGuess = thisNumber.makeUsersGuess();
            //System.out.println("code test: userGuess is now: " + usersGuess);

            //if(usersGuess > )
            thisEvaluation = checkThisGuess.isCorrect(usersGuess, secretNumber);
            //System.out.println("code test: guess checker: " + checkThisGuess.isCorrect(usersGuess, secretNumber));

            boolean isUnique = thisGuess.isUnique(usersGuess, previousGuess);

            if(isUnique) {
                currentCount = thisCounter.increasesByOne(currentCount);

            System.out.println(thisResponse.respond(thisEvaluation, currentCount));



            }
            System.out.println("//code test: currentCount now equals: " + currentCount);
            //if(usersGuess != previousGuess){
                //currentCount++;
            //}
            previousGuess = usersGuess;
            //System.out.println("//this is for code testing: int previousGuess now equals " + previousGuess);
            //System.out.println("//this is for code testing: the current attempt count is " + currentCount);



             }
             while(!thisEvaluation);


    }


}
