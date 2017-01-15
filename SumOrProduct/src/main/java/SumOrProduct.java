/**
 * Created by johncollins on 1/13/17.
 * Sum or Product

 Objectives

 To demonstrate your understanding of objects
 To demonstrate your understanding of operators
 To demonstrate your understanding of user input
 To demonstrate your understanding of functions
 Overview

 Write a program that asks the user for a number n and gives him the possibility to choose between computing the sum and computing the product of 1,…,n

 Unit Test

 No Unit Test

 Instructions

 Get input from user for number n and choice of Sum or Product
 Create separate functions for Sum and Product
 Compute for Sum/Product
 Print final output to screen
 */
public class SumOrProduct {
    public static void main(String[] args) {
        ChooseSumOrProduct askSumOrProduct = new ChooseSumOrProduct();
        int addOrMultiply = askSumOrProduct.askSumOrNum();


        //AskUserNumber askUserNumber = new AskUserNumber();
        //int userNumber = askUserNumber.askUserNumber();



        FinalOutputter outPut = new FinalOutputter();
        outPut.finalOutput(addOrMultiply);


    }


}
