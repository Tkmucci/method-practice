package com.pluralsight;

public class CompareNumbers {



    //My Main method that will call the data from other methods and print the result.
    public static void main(String[] args) {

        System.out.println(isEven(24));
        System.out.println(isPositive(-2));

    }

    //My isEven method that checks if the userInput is even or odd
     public static boolean isEven(int number) {


         return number % 2 == 0;
     }

     //My isPositive method that checks if the userInput is positive, negative or zero
     public static boolean isPositive(double number) {

         return number > 0;

    }
}


