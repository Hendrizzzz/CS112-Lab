/*
Name: Jim Hendrix T. Bag-eo
Programming Date: 9 /8/2023
Activity Name and Number: Prelim Programming Exercise 4
Problem:
 Write a program that computes and shows the area and the circumference of a circle with
 a given radius. Let the radius be entered through the keyboard at program runtime.
Analysis:
Input: Radius of a circle (radius)
Processes:
Read the radius of the circle
Compute the circumference of the circle
Compute the area of the circle
Display results
Output: circumference, area
Algorithm:
1. Read/Accept the radius of the circle
2. Compute the circumference: circumference = 2 * PI * radius
3. Compute the area: area = PI * radius * radius
4. Show the radius of the circle
5. Show the circumference of the circle
6. Show the area of the circle
*/

package exercises.prelims;

import java.util.Scanner;

public class Circle3 {
    public static void main(String[] args) {

        double radius;
        double circumference = 0;
        double area = 0;


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();


        circumference = computeCircumference(radius);
        area = computeArea(radius);


        // The succeeding statements prints strings on the output screen
        System.out.println();
        System.out.println(" ***********************************************************");
        System.out.println(" * Radius of circle is " + radius +" *");
        System.out.println(" * Circumference of circle is " + circumference + " *");
        System.out.println(" * Area of circle is " + area + " *");
        System.out.println(" **********************************************************");
        System.out.println();
    } // end of main method


    public static double computeCircumference(double radius1){
        //returning the computed value for circumference of the Circle
        return 2 * Math.PI * radius1;
    }//end of the completeCircumference method



    static double computeArea (double radius2){
        //returning the computed value for area of the Circle
        return Math.PI * radius2 *radius2;
    } // end of the computeArea method
} // end of class
