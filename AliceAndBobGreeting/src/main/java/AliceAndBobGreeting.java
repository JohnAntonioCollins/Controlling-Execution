/** JOHN S HELPED ME HOOK IT ALL TOGETHER, DUDE IS SOLID!
 * Created by johncollins on 1/13/17.
 * Objectives

 To demonstrate your understanding of objects
 To demonstrate your understanding of operators
 To demonstrate your understanding of user input
 To demonstrate your understanding of strings
 Overview

 Write a program that asks the user for his/her name and only the users Alice and Bob are greeted with their names.

 Unit Test

 No Unit Test

 Instructions

 Understand how to get input from user
 Create conditional to check against Alice and Bob
 Print greeting to screen if Alice or Bob are true
 */
public class AliceAndBobGreeting {
    public static void main(String[] args) {
        NameInputScanner nameInputScanner = new NameInputScanner();
        String userName = nameInputScanner.getUserName();

        AreYouBobOrAlice areYouAliceOrBob = new AreYouBobOrAlice();
        boolean isAliceOrBob = areYouAliceOrBob.areYouBobOrAlice(userName);

        RespondToUser respondToUser = new RespondToUser(isAliceOrBob, userName);
    }
}
    