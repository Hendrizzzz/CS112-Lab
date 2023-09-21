/*
Name: Jim Hendrix T. Bag-eo
Programming Date: 9 /8/2023
Activity Name and Number: Prelim Programming Exercise 4
Problem:
    Write a program that computes and shows the perimeter and the area of a rectangle with
    a given length and width. Let the length and width be entered through the keyboard at program runtime.

Analysis:
    Input:
        length and width of the rectangle
    Processes:
        Read the length and width of the rectangle
        Compute the perimeter of the rectangle
        Compute the area of the rectangle
        Display results
    Output:
        perimeter, area

Algorithm:
1. Read/Accept the width and length of the rectangle
2. Compute the perimeter in a different method: 2 * ( width + length)
3. Compute the area in a different method: width * length
4. Show the perimeter of the rectangle
5. Show the area of the rectangle
*/


package exercises.prelims;

import java.util.Scanner;

public class Rectangle3 {
    public static void main(String[] args) {

        double width, length, perimeter, area; // Declare variables

        Scanner input = new Scanner(System.in);

        while (true) {
            width = getWidth(input); // Get width from the user
            length = getLength(input); // Get length from the user

            // Check for negative input
            if (width < 0 || length < 0) {
                System.out.println("Invalid input. Width and/or Length can't be negative. Please input a positive dimension. \n*\n*");
                input.nextLine();
                continue;
            }

            perimeter = computePerimeter(width, length); // Compute for Perimeter
            area = computeArea(width, length); // Compute for Area

            displayResults(width, length, perimeter, area); // Print the result
            break; // Exit the loop
        }
    } // end of main method



    // Method to get a valid width value from the user
    private static double getWidth(Scanner input) {
        do {
            try {
                System.out.print("Enter the width: \n");
                return input.nextDouble();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please input a valid quantity. \n");
                input.nextLine();
            }
        } while (true);
    }


    // Method to get a valid length value from the user
    private static double getLength(Scanner input) {
        do {
            try {
                System.out.print("Enter the length: \n");
                return input.nextDouble();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please input a valid quantity. \n");
                input.nextLine();
            }
        } while (true);
    }



    // Method to compute the perimeter of the rectangle
    static double computePerimeter(double width1, double length1) {
        //returning the computed value for perimeter of the rectangle
        return 2 * (width1 + length1);
    }//end of the computePerimeter method



    // Method to compute the area of the rectangle
    static double computeArea(double width2, double length2) {
        //returning the computed value for area of the Circle
        return width2 * length2;
    } // end of the computeArea method



    // Method to display the results
    private static void displayResults(double width, double length, double perimeter, double area) {
        // The succeeding statements prints strings on the output screen
        System.out.println();
        System.out.println(" ***********************************************************");
        System.out.println(" * width of rectangle is " + width + " *");
        System.out.println(" * length of rectangle is " + length + " *");
        System.out.println(" * Perimeter of rectangle is " + perimeter + " *");
        System.out.println(" * Area of rectangle is " + area + " *");
        System.out.println(" **********************************************************");
        System.out.println();
    }
}
