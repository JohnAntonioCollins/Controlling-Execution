package collins.john;
import java.util.Scanner;
/**
 * Created by johncollins on 1/13/17.
 * Objectives

 To demonstrate your understanding of objects
 To demonstrate your understanding of operators
 To demonstrate your understanding of user input/output
 Overview

 Write a program that asks the user for a number n and prints the sum of the numbers 1 to n

 Unit Test

 No Unit Test

 Instructions

 Understand how to get input from user
 Find solution to sum numbers from 1 to n
 Print final answer to screen
 */
public class SumOfTheNumbers {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("Enter a number.");
        int userInput = userInputScanner.nextInt();
        System.out.println(userInput + " is a great number!");
        //this equation sums the integers from zero to an integer saved in userInput.
        int outputSum = ((userInput*userInput)+userInput)/2;
        System.out.println(outputSum + " is the sum of all integers from zero to " + userInput);

    }
}
