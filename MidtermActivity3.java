package exercises.midterms;

import java.util.Scanner;

public class MidtermActivity3 {
    public static void main(String[] args) {

        //Declaration of Variables
        int oddNum = 0;
        int evenNum = 0;
        int fourMultiple = 0;

        Scanner kbd = new Scanner(System.in); //Create Scanner Object

        int[] userArray = new int[20]; //Declaration and Initialization of Array

        
        //For-loop for accessing and adding values to the array
        //No input validation
        for (int i = 0; i < userArray.length; i++) {
            System.out.print("Enter an integer for position " + (i + 1) + ": ");
            userArray[i] = Integer.parseInt(kbd.nextLine());
        }

        //For-loop for finding the number of odd, even, and multiples of four
        //You can combine it with the first loop to make it just one loop
        for (int j : userArray) {
            if (j % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }

            if (j % 4 == 0) {
                fourMultiple++;
            }
        }

        //Display the result
        System.out.println("Number of Even Numbers: " + evenNum);
        System.out.println("Number of Odd Numbers: " + oddNum);
        System.out.println("Number of Multiples of Four: " + fourMultiple);
    } //End of main method
} //End of class
