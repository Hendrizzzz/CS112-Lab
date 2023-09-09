/*
Name: Jim Hendrix T. Bag-eo
Programming Date: 9 /8/2023
Activity Name and Number: Prelim Programming Exercise 4
Problem:
 Write a program that computes and shows the perimeter and the area of a rectangle with
 a given length and width. Let the length and width be entered through the keyboard at program runtime.
Analysis:
Input: length and width of the rectangle
Processes:
Read the length and width of the rectangle
Compute the perimeter of the rectangle
Compute the area of the rectangle
Display results
Output: perimeter, area
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

        double width = 0;
        double length = 0;
        double perimeter = 0;
        double area = 0;


        Scanner input = new Scanner(System.in);


        System.out.print("Enter the width of the rectangle: ");
        width = input.nextDouble();


        System.out.print("Enter the length of the rectangle: ");
        length = input.nextDouble();


        perimeter = computePerimeter(width, length);
        area = computeArea(width, length);


        // The succeeding statements prints strings on the output screen
        System.out.println();
        System.out.println(" ***********************************************************");
        System.out.println(" * width of rectangle is " + width +" *");
        System.out.println(" * length of rectangle is " + length +" *");
        System.out.println(" * Perimeter of rectangle is " + perimeter + " *");
        System.out.println(" * Area of rectangle is " + area + " *");
        System.out.println(" **********************************************************");
        System.out.println();
    } // end of main method


    static double computePerimeter(double width1, double length1){
        //returning the computed value for perimeter of the rectangle
        return 2 * (width1 + length1);
    }//end of the computePerimeter method


    static double computeArea (double width2, double length2){
        //returning the computed value for area of the Circle
        return width2 * length2;
    } // end of the computeArea method
}
