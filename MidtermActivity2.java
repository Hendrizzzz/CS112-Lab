/*
To do:
Write a program WhileLoops that uses while loops to perform the following steps:
1. Prompt the user the input two positive integers: firstNum and secondNum (firstNum must be
smaller than secondNum)
2. Output all the even numbers between firstNum and secondNum inclusive
3. Output the sum of all the even numbers between firstNum and secondNum inclusive
4. Output all the odd numbers between firstNum and secondNum inclusive
5. Output the sum of all odd numbers between firstNum and secondNum inclusive


Output:
Enter an integer:
3
Enter another integer larger than the first one:
10
Even numbers: 4 6 8 10
Sum of even numbers = 28
Odd numbers: 3 5 7 9
Sum of odd numbers = 24
*/



package exercises.midterms;

import java.util.Scanner;

public class MidtermActivity2 {
    public static void main(String[] args){

        //Declaring and Initializing Variables
        int num1;
        int num2;
        int evenSum = 0;
        int sumOdd = 0;
        int tempEven;
        StringBuilder even = new StringBuilder();
        StringBuilder odd= new StringBuilder();

        Scanner kbd = new Scanner(System.in); //Creating a Scanner Object

        num1 = getFirstNumber(kbd);
        num2 = getSecondNumber(kbd, num1);
        tempEven = num1; //temporary variable


        //While Loop for Even Numbers
        while (tempEven <= num2){

            if(tempEven % 2 == 1){
                tempEven++;
            }

            evenSum += tempEven;
            even.append(tempEven).append(" ");
            tempEven += 2;
        }

        //While Loop for Odd Numbers
        while (num1 <= num2){

            if(num1 % 2 == 0){
                num1++;
            }

            sumOdd += num1;
            odd.append(num1).append(" ");
            num1 += 2;
        }

        displayResults(even.toString(), evenSum, odd.toString(), sumOdd); //Display Result
    } // end of main method






    private static int getFirstNumber(Scanner kbd) { //Method to get the valid first Number
        while(true) {
            try {
                System.out.print("Enter an integer: ");
                int num1 = Integer.parseInt(kbd.nextLine());

                if (num1 > 0){
                    return num1;
                }

            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please input a valid input. ");
            }
        }
    }//End of method


    private static int getSecondNumber(Scanner kbd, int num1) { //Method to get the valid second number
        while(true) {
            try {
                System.out.print("Enter another integer larger than the first one: ");
                int num2 = Integer.parseInt(kbd.nextLine());
                if ((num1 > 0) && (num2 > num1)) {
                    return num2;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please input a valid input. ");
            }
        }
    } //End of method


    private static void displayResults(String even, int evenSum, String odd, int sumOdd) {//Method to Display the result
        System.out.println("\nEven numbers: " + even);
        System.out.println("Sum of even numbers = " + evenSum);
        System.out.println("Odd Numbers: " + odd);
        System.out.println("Sum of odd numbers = " + sumOdd);
    }// End of method
} // end of class
