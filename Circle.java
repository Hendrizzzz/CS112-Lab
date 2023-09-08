package exercises.prelims;

/*
* Name: Bag-eo, Jim Hendrix T.
* Programming Date: 8/25/23
* Activity Name and Number: Prelim Exercise Number 2

-----------------------------------------------------------------
Input: Radius of a circle (radius)
Processes: Compute the circumference of the circle
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

import java.util.Scanner;                 //importing a scanner

public class Circle {
    public static void main(String[] args) {


        float radius;                                                   //declaring initializing variables
        double circumference;
        double areaOfCircle;

        System.out.println("Welcome to the Circle Calculator!");

        Scanner input = new Scanner (System.in);                          //creating a scanner method named 'input'

        System.out.print("Please, enter the radius of the circle: ");     //storing a value inputted by the user to radius
        radius = input.nextInt();
        input.close();

        circumference = 2 * 3.1416 * radius;                               //formula for finding the circumference of  a circle

        areaOfCircle = 3.1416 * radius * radius;                          //formula for the area of a circle

//output layout
        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" * *");
        System.out.println(" * *");
        System.out.println(" * Radius of circle is " + radius +" *");
        System.out.println(" * Circumference of circle is " + circumference + " *");
        System.out.println(" * Area of circle is " + areaOfCircle +" *");
        System.out.println(" * *");
        System.out.println(" * *");
        System.out.println(" **********************************************************");
    } // end of main method
} // end of class



