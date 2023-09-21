/*
    Name: Bag-eo, Jim Hendrix T.
    Programming Date: 09/05/2023
    Activity Name and Number: Prelim Exercise Number 3
Problem:
Write a program that will show the hypotenuse of a Right Triangle with a given base and height.

Analysis:
    Input:
        base and height of a Right Triangle
    Processes:
        Compute the hypotenuse of the Right Triangle
        Display the data associated with the right triangle
    Output:
        hypotenuse

Algorithm:
1. Assign the base and height of the Right Triangle
2. Compute the hypotenuse: hypotenuse = square root of (base*base + height*height)
3. Show the given base and height of a right triangle
4. Show the computed hypotenuse of the right triangle with a given base and height
*/

package exercises.prelims;

import java.util.Scanner;

public class RightTriangle2 {
    public static void main(String[] args) {

        //declaring variables
        double base;
        double height;
        double hypotenuse;

        //creating a Scanner Object named triangle
        Scanner triangle = new Scanner (System.in);

        //prompting the user for 'base'
        System.out.println("Base of the right triangle: ");
        base = triangle.nextInt();

        //prompting the user for 'height'
        System.out.println("Height of the right triangle: ");
        height = triangle.nextInt();

        //closing the scanner
        triangle.close();

        //computing the hypotenuse
        hypotenuse =(Math.sqrt(base*base + height*height));

        //Show data about the circle
        System.out.println( );
        System.out.println( );
        System.out.println(" ********************************************************");
        System.out.println(" * Given base = " + base + " and height " + height + " of a right triangle *");
        System.out.println(" * Computed hypotenuse of the circle = " + hypotenuse + " *");
        System.out.print(" ********************************************************");
    } // end of the main method
} // end of Circle2 class
