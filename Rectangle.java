//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package exercises.prelims;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        //declaring variables
        double length;
        double width;
        double perimeter;
        double area;

        //creating a Scanner method named 'input'
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Perimeter and Area of Rectangle Solver!");

        //Getting the length of the Rectangle from the user
        System.out.print("Please, enter the length of the Rectangle: ");
        length = input.nextDouble();

        //Getting the width of the Rectangle from the user
        System.out.print("Please, enter the width of the Rectangle: ");
        width = input.nextDouble();

        //closing the scanner
        input.close();

        //formula for Perimeter and Area of a Rectangle
        perimeter = (2 * length) + (2*width);
        area = length * width
        ;
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

