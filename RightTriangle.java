//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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

        //creating a Scanner method named 'input'
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Perimeter and Area of Right Triangle Solver!");

        //Getting the base of the Right Triangle from the user
        System.out.print("Please, enter the base of the Right Triangle: ");
        base = input.nextDouble();

        //Getting the height of the Right Triangle from the user5
        System.out.print("Please, enter the base of the Right Triangle: ");
        height = input.nextDouble();

        //Getting the hypotenuse of the Right Triangle from the user
        System.out.print("Please, enter the base of the Right Triangle: ");
        hypotenuse = input.nextDouble();

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
        System.out.println(" ***********************************************************");
    }
}

