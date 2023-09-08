/*
Name: Bag-eo, Jim Hendrix T.
Programming Date: 09/05/2023
Activity Name and Number: Prelim Exercise Number 3
Problem:
Write a program that will show the radius of a circle with a given area.
Analysis:
Input: area of a circle (area)
Processes: Compute the radius of the circle
 Display the data associated with the circle
Output: radius
Algorithm:
1. Assign the area of the circle
2. Compute the radius: radius = square root of (area/PI)
3. Show the given area of a circle
4. Show the computed radius of the circle with a given area
*/

package exercises.prelims;

import java.util.Scanner;

public class Circle2{
    public static void main(String[] args) {

        double areaOfTheCircle = 0;
        double radiusOfTheCircle = 0;

        Scanner input = new Scanner (System.in);

        System.out.println("Area of the circle: ");

        areaOfTheCircle = input.nextInt();

        input.close();

        radiusOfTheCircle = (Math.sqrt(areaOfTheCircle/Math.PI));

        //Show data about the circle
        System.out.println( );
        System.out.println( );
        System.out.println(" ********************************************************");
        System.out.println(" * Given area of circle = " + areaOfTheCircle + " *");
        System.out.println(" * Computed radius of the circle = " + radiusOfTheCircle + " *");
        System.out.println(" ********************************************************");
    } // end of the main method
} // end of Circle2 class