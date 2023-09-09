/*
Name: Jim Hendrix T. Bag-eo
Programming Date: 9 /8/2023
Activity Name and Number: Prelim Programming Exercise 4
Problem:
 Write a program that computes and shows the hypotenuse, perimeter, and the area of a right triangle with
 a given base and height. Let the base and height be entered through the keyboard at program runtime.
Analysis:
Input: base and height of the right triangle
Processes:
Read the base and height of the right triangle
Compute the hypotenuse of the right triangle
Compute the perimeter of the right triangle
Compute the area of the right triangle
Display results
Output: perimeter, area
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

        double base = 0;
        double height = 0;
        double hypotenuse = 0;
        double perimeter = 0;
        double area = 0;


        Scanner input = new Scanner(System.in);


        System.out.print("Enter the base of the right triangle: ");
        base = input.nextDouble();


        System.out.print("Enter the height of the right triangle: ");
        height = input.nextDouble();


        hypotenuse = computeHypotenuse(base, height);
        perimeter = computePerimeter(base, height, hypotenuse);
        area = computeArea(base, height);


        // The succeeding statements prints strings on the output screen
        System.out.println();
        System.out.println(" ***********************************************************");
        System.out.println(" * base of rectangle is " + base +" *");
        System.out.println(" * height of rectangle is " + height +" *");
        System.out.println(" * hypotenuse of rectangle is " + hypotenuse +" *");
        System.out.println(" * Perimeter of rectangle is " + perimeter + " *");
        System.out.println(" * Area of rectangle is " + area + " *");
        System.out.println(" **********************************************************");
        System.out.println();
    } // end of main method


    static double computeHypotenuse (double base, double height){
        //returning the computed value for perimeter of the right triangle
        return Math.sqrt(base * base + height * height);
    }//end of the computePerimeter method


    static double computePerimeter(double base1, double height1, double hypotenuse1){
        //returning the computed value for perimeter of the right triangle
        return base1 + height1 + hypotenuse1;
    }//end of the computePerimeter method


    static double computeArea (double base2, double height2){
        //returning the computed value for area of the right triangle
        return 0.5 * (base2 * height2);
    } // end of the computeArea method
}
