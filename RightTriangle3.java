/*
Name: Jim Hendrix T. Bag-eo
Programming Date: 9 /8/2023
Activity Name and Number: Prelim Programming Exercise 4
Problem:
    Write a program that computes and shows the hypotenuse, perimeter, and the area of a right triangle with
    a given base and height. Let the base and height be entered through the keyboard at program runtime.

Analysis:
    Input:
        base and height of the right triangle
    Processes:
        Read the base and height of the right triangle
        Compute the hypotenuse of the right triangle
        Compute the perimeter of the right triangle
        Compute the area of the right triangle
        Display results
    Output:
        perimeter, area

Algorithm:
1. Read/Accept the width and length of the rectangle
2. Compute for the hypotenuse in a different method: Math.sqrt(base * base + height * height)
3. Compute for the perimeter in a different method: 2 * ( width + length)
4. Compute for the area in a different method: width * length
5. Show the hypotenuse of the right triangle
6. Show the perimeter of the right triangle
7. Show the area of the right triangle
*/

package exercises.prelims;

import java.util.Scanner;

public class RightTriangle3 {
    public static void main(String[] args) {

        // Declare variables to store the input and computed values
        double base, height, hypotenuse, perimeter, area;

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Get valid base and height from the user
        base = getBase(input); // Get valid base from the user
        height = getHeight(input); // Get valid height from the user

        // Compute Hypotenuse, Perimeter, and Area
        hypotenuse = computeHypotenuse(base, height);
        perimeter = computePerimeter(base, height, hypotenuse);
        area = computeArea(base, height);

        // Display the results
        displayResult(base, height, hypotenuse, perimeter, area);
    } // end of main method

    // Method to get a valid base value from the user


    private static double getBase(Scanner input) {
        do {
            try {
                System.out.print("Enter the base of the right triangle: ");
                double base = input.nextDouble();

                if (base < 0) {
                    System.out.println("Invalid input. Base cannot be negative. \n*\n*");
                    input.nextLine();
                    continue;
                }

                input.nextLine(); // Consume the newline character
                return base;

            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid base. \n*\n*");
                input.nextLine(); // Consume the newline character
            }
        } while (true);
    }



    // Method to get a valid height value from the user
    private static double getHeight(Scanner input) {
        do {
            try {
                System.out.print("\nEnter the height of the right triangle: ");
                double height = input.nextDouble();

                if (height < 0) {
                    System.out.println("Invalid input. Height cannot be negative. \n*\n*");
                    input.nextLine();
                    continue;
                }

                input.nextLine(); // Consume the newline character
                return height;

            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid height. \n*\n*");
                input.nextLine(); // Consume the newline character
            }
        } while (true);
    }



    // Method to compute the hypotenuse of the right triangle
    private static double computeHypotenuse(double base, double height) {
        return Math.sqrt(base * base + height * height);
    }


    // Method to compute the perimeter of the right triangle
    private static double computePerimeter(double base, double height, double hypotenuse) {
        return base + height + hypotenuse;
    }


    // Method to compute the area of the right triangle
    private static double computeArea(double base, double height) {
        return 0.5 * (base * height);
    }


    // Method to display the results
    private static void displayResult(double base, double height, double hypotenuse, double perimeter, double area) {
        System.out.println();
        System.out.println(" ***********************************************************");
        System.out.println(" * base of rectangle is " + base + " *");
        System.out.println(" * height of rectangle is " + height + " *");
        System.out.println(" * hypotenuse of rectangle is " + hypotenuse + " *");
        System.out.println(" * Perimeter of rectangle is " + perimeter + " *");
        System.out.println(" * Area of rectangle is " + area + " *");
        System.out.println(" **********************************************************");
        System.out.println();
    }
}
