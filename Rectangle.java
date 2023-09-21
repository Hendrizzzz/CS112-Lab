// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)

package exercises.prelims;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        // Declare variables to store length, width, perimeter, and area
        double length;
        double width;
        double perimeter;
        double area;

        // Create a Scanner object named 'input' to read user input
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!");

        // Get the length of the Rectangle from the user
        System.out.print("Please, enter the length of the Rectangle: ");
        length = input.nextDouble();

        // Get the width of the Rectangle from the user
        System.out.print("Please, enter the width of the Rectangle: ");
        width = input.nextDouble();

        // Close the scanner to release resources
        input.close();

        // Calculate the perimeter and area of the Rectangle using formulas
        perimeter = (2 * length) + (2 * width);
        area = length * width;

        // Display the results
        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" * *");
        System.out.println(" * *");
        System.out.println(" * the Length " + length + " and width " + width + " are the dimensions of the Rectangle *");
        System.out.println(" * Perimeter of the Rectangle is " + perimeter + " *");
        System.out.println(" * Area of the rectangle is " + area + " *");
        System.out.println(" * *");
        System.out.println(" * *");
        System.out.println(" **********************************************************");
    }
}
