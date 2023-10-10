//Write a program to calculate the sum of first 10 natural number.


import java.util.Scanner;
public class FactorialDemo {
    public static void main(String[] args){

        Scanner kbd = new Scanner(System.in);
        int factorial = 1;

        do {
            try {
                System.out.print("Enter the number: "); //Prompt for a number
                int number = Integer.parseInt(kbd.nextLine()); //Place the input in "variable"
                factorial = 1; //Declare and initialize the factorial

                for (int i = number; i > 0; i-- ){ //The process in solving for the factorial
                    factorial *= i;
                }
                break;
            } catch (NumberFormatException e) { //Run this block if input is not numeric
                System.out.println("Invalid input. Please enter a valid quantity. ");
            }
        } while (true); //Loop if input is not numeric

        System.out.print(factorial); //Display the result
    } // end of main method
} // end of class

