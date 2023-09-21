/*
* Name: Bag-eo, Jim Hendrix T.
* Programming Date: 8/25/23
* Activity Name and Number: Prelim Exercise Number 2

-----------------------------------------------------------------
Input:
    Base, Height, and Hypotenuse of a right triangle
Processes:
    Compute the perimeter of the right triangle
    Compute the area of the right triangle
     Display results
Output:
    perimeter, area
-------------------------------------------------------------------
Algorithm:
1. Prompt the user for Base, Height, and Hypotenuse, loop until a valid input is read.
2. Compute the perimeter: perimeter = base + height + hypotenuse
3. Compute the area: area = (base*height)/2
4. Show the base, height, and hypotenuse of the right triangle
5. Show the perimeter of the right triangle
6. Show the area of the right triangle
 -------------------------------------------------------------------
*/

package exercises.prelims;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {

        //declaring variables
        double base;
        double height;
        double hypotenuse;
        double perimeter;
        double area;
        boolean isValidInput = true;

        //creating a Scanner method named 'input'
        Scanner input = new Scanner(System.in);

        do {
            try {
                //Getting the base of the Right Triangle from the user
                System.out.print("Please, enter the base of the Right Triangle: ");
                base = input.nextDouble();
                if (base < 0){
                    System.out.println("Invalid input. Base cannot be negative. \n*\n*");
                    input.nextLine();
                    continue;
                }

                //Getting the height of the Right Triangle from the user5
                System.out.print("Please, enter the height of the Right Triangle: ");
                height = input.nextDouble();
                if (height < 0){
                    System.out.println("Invalid input. Height cannot be negative. \n*\n*");
                    input.nextLine();
                    continue;
                }

                //Getting the hypotenuse of the Right Triangle from the user
                System.out.print("Please, enter the hypotenuse of the Right Triangle: ");
                hypotenuse = input.nextDouble();
                if (hypotenuse < 0){
                    System.out.println("Invalid input. Hypotenuse cannot be negative. \n*\n*");
                    input.nextLine();
                    continue;
                }


                //closing the scanner
                input.close();

                //formula for Perimeter and Area of a Square
                perimeter = base + height + hypotenuse;
                area = 0.5 * base * height;

                System.out.println();
                System.out.println();
                System.out.println(" ***********************************************************");
                System.out.println(" *                                                         *");
                System.out.println(" *                                                         *");
                System.out.println(" *      the base of the Right Triangle is " + base + "     *");
                System.out.println(" *      the height of the Right Triangle is " + height + " *");
                System.out.println(" *      the hypotenuse of the Right Triangle is " + hypotenuse + "*");
                System.out.println(" *      Perimeter of the Square is " + perimeter + "       *");
                System.out.println(" *      Area of the Square is " + area + "                 *");
                System.out.println(" *                                                         *");
                System.out.println(" *                                                         *");
                System.out.print(" ***********************************************************");

                isValidInput = false;
            } catch (java.util.InputMismatchException e){
                System.out.println("Invalid input. Please enter a valid dimension (a number). Please try again.\n*\n*");
                input.nextLine();
            }
        } while (isValidInput);
    }
}
