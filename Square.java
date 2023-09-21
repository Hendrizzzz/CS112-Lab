/*
* Name: Bag-eo, Jim Hendrix T.
* Programming Date: 8/25/23
* Activity Name and Number: Prelim Exercise Number 2

-----------------------------------------------------------------
Input:
    Radius of a circle (radius)
Processes:
    Compute the perimeter of the square
    Compute the area of the square
    Display results
Output:
    circumference, area
------------------------------------------------------------------
Algorithm:
1. Prompt the user for square side, loop until a valid input is read.
2. Compute the perimeter: perimeter = side*4
3. Compute the area: area =side*side
4. Show the side of the square
5. Show the perimeter of the square
6. Show the area of the square
 -------------------------------------------------------------------
*/

package exercises.prelims;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        // Declare variables
        double side;
        double perimeter;
        double area;
        boolean isValidSide = true;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Square Calculator!");

        do {
            try {
                // Prompt the user to enter the side of the square
                System.out.print("Enter the side length of the square: ");
                side = input.nextDouble();

                if (side < 0) {
                    System.out.println("Invalid input. Square side cannot be negative. Please try again.\n*\n*");
                    input.nextLine(); // Consume the invalid input
                    continue; // Go back to the beginning of the loop
                }

                // Calculate the perimeter and area of the square
                perimeter = 4 * side;
                area = side * side;

                // Display the results
                System.out.println("\n**********************************************************");
                System.out.println("*");
                System.out.println("*");
                System.out.println("* The side length of the square is " + side + " *");
                System.out.println("* Perimeter of the square is " + perimeter + " *");
                System.out.println("* Area of the square is " + area + " *");
                System.out.println("*");
                System.out.println("*");
                System.out.print("**********************************************************");
                isValidSide = false; // Set isValidSide to false to exit the loop
            } catch (java.util.InputMismatchException e) {
                // Handle invalid input with an error message
                System.out.println("Invalid input. Please enter a valid dimension (a number). Please try again.\n*\n*");
                input.nextLine(); // Consume the invalid input
            }
        } while (isValidSide);

        // Close the input scanner
        input.close();
    }
}
