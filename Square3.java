/*
* Name: Bag-eo, Jim Hendrix T.
* Programming Date: 8/25/23
* Activity Name and Number: Prelim Exercise Number 2

-----------------------------------------------------------------
Input:
    Side length of a square (side)
Processes:
    Compute the perimeter of the square
    Compute the area of the square
    Display results
Output:
    Perimeter and area
------------------------------------------------------------------
Algorithm:
1. Prompt the user for the side length of the square, loop until valid input is received.
2. Compute the perimeter: perimeter = side * 4
3. Compute the area: area = side * side
4. Display the side length of the square
5. Display the perimeter of the square
6. Display the area of the square
 -------------------------------------------------------------------
*/

package exercises.prelims;

import java.util.Scanner;

public class Square3 {
    public static void main(String[] args) {

        double side;
        double perimeter;
        double area;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!");

        // Get the side length of the square from the user
        side = getSide(input);

        // Calculate the perimeter and area of the square
        perimeter = computePerimeter(side);
        area = computeArea(side);

        // Display the results
        displayResult(side, perimeter, area);

        // Close the input scanner
        input.close();
    }





    private static double getSide(Scanner input) {
        do {
            try {
                // Prompt the user to enter the side length of the square
                System.out.print("Enter the side length of the square: ");
                double side = input.nextDouble();

                if (side < 0) {
                    System.out.println("Invalid input. Square side cannot be negative. Please try again.\n*\n*");
                    input.nextLine(); // Consume the invalid input
                } else {
                    return side;
                }
            } catch (java.util.InputMismatchException e) {
                // Handle invalid input (non-numeric) with an error message
                System.out.println("Invalid input. Please enter a valid dimension (a number). Please try again.\n*\n*");
                input.nextLine(); // Consume the invalid input
            }
        } while (true); // Loop until valid input is provided
    }


    private static double computePerimeter(double side) {
        // Calculate the perimeter of the square
        return 4 * side;
    }


    private static double computeArea(double side) {
        // Calculate the area of the square
        return side * side;
    }


    private static void displayResult(double side, double perimeter, double area) {
        // Display the results with proper formatting
        System.out.println("\n**********************************************************");
        System.out.println("*");
        System.out.println("*");
        System.out.println("* The side length of the square is " + side + " *");
        System.out.println("* Perimeter of the square is " + perimeter + " *");
        System.out.println("* Area of the square is " + area + " *");
        System.out.println("*");
        System.out.println("*");
        System.out.print("**********************************************************");
    }
}