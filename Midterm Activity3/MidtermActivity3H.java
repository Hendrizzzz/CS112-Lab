/*
To do:

Write a program to accept 20 integer numbers in a single Dimensional Array. Find and display the
following:
i. Number of even numbers.
ii. Number of odd numbers.
iii. Number of multiples of 4
*/


package exercises.midterms;

import java.util.Scanner;

public class MidtermActivity3 {
    public static void main(String[] args) {

        //Declaration of Variables
        int oddNum = 0;
        int evenNum = 0;
        int fourMultiple = 0;

        Scanner kbd = new Scanner(System.in); //Create Scanner Object

        int[] userArray = new int[20]; //Declaration and Initialization of Array to 20


        //For-loop for accessing and adding values to the array and
        //Determining the number of even, odd and multiple of four integers
        for (int i = 0; i < userArray.length; i++) {
            try {
                System.out.print("Enter an integer for position " + (i + 1) + ": ");
                userArray[i] = Integer.parseInt(kbd.nextLine()); //Add the input to the array

                if (userArray[i] % 2 == 0) { //Even
                    evenNum++;
                } else{     //Odd
                    oddNum++;
                }
                
                if (userArray[i] % 4 == 0){ //Multiples of Four
                    fourMultiple++;
                }

            } catch(NumberFormatException e){ //If input is non-numeric
                System.out.println("Invalid input. Please enter a valid input. \n"); //Error message
                i--; //Retain the i
            }
        }


        //Display the result
        System.out.println("Number of Even Numbers: " + evenNum);
        System.out.println("Number of Odd Numbers: " + oddNum);
        System.out.println("Number of Multiples of Four: " + fourMultiple);
    } //End of main method
} //End of class
