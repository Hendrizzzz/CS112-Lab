/*
* Name: Bag-eo, Jim Hendrix T.
* Programming Date: 8/25/23
* Activity Name and Number: Prelim Exercise Number 2

-----------------------------------------------------------------
Input: Radius of a circle (radius)
Processes:
    Compute the circumference of the circle
    Compute the area of the circle
    Display results
    Output: circumference, area
------------------------------------------------------------------
Algorithm:
1. Assign the radius of the circle
2. Compute the circumference : circumference = 2*(3.1416)*radius
3. Compute the area: area = PI*radius*radius
4. Show the radius of the circle
5. Show the circumference of the circle
6. Show the area of the circle
 -------------------------------------------------------------------
*/

package exercises.prelims;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        // Greet the user
        System.out.println("Welcome to the Circle Calculator!");

        // Declare and initialize variables
        double radius;
        double circumference;
        double areaOfCircle;
        boolean isValidRadius = true;

        // Create a scanner object named 'input' for user input
        Scanner input = new Scanner(System.in);

        do {
            try {
                // Prompt the user to enter the radius of the circle
                System.out.print("Please, enter the radius of the circle: ");
                radius = input.nextDouble();

                // Input validation: Check if radius is negative, if so, ask for input again
                if (radius < 0) {
                    System.out.println("Invalid input. Radius cannot be negative. Please try again.\n");
                    input.nextLine(); // Consume the invalid input
                    continue; // Go back to the beginning of the loop
                }

                // Calculate the circumference and area
                circumference = 2 * Math.PI * radius;
                areaOfCircle = Math.PI * radius * radius;

                // Display the results
                System.out.println("\n**********************************************************");
                System.out.println("*");
                System.out.println("*");
                System.out.println("* Radius of circle is " + radius + " *");
                System.out.println("* Circumference of circle is " + circumference + " *");
                System.out.println("* Area of circle is " + areaOfCircle + " *");
                System.out.println("*");
                System.out.println("*");
                System.out.print("**********************************************************");

                isValidRadius = false; // Set checker to false to exit the loop
            } catch (java.util.InputMismatchException e) {
                // Handles invalid input with an error message
                System.out.println("Invalid input. Please enter a valid number for the radius.\n");
                input.nextLine(); // Consume the invalid input
            }
        } while (isValidRadius); // Continue the loop until checker is false

        // Close the input scanner
        input.close();
    }
}
