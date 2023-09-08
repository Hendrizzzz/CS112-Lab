//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package exercises.prelims;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        //declaring variables
        double side = 0;
        double perimeter = 0;
        double area = 0;

            //creating a Scanner method named 'input'
            Scanner input = new Scanner(System.in);

            System.out.println("Welcome");


        while (true) {

            //Getting the side of the Square from the user
            System.out.print("Please enter the side of the Square: ");
            if (input.hasNextDouble()) {
                side = input.nextDouble();
                break;
            } else {
                input.nextLine();
                continue;
            }
        }

            //formula for Perimeter and Area of a Square
            perimeter = 4 * side;
            area = side * side;   //or side * 4
            ;
            System.out.println();
            System.out.println();
            System.out.println(" **********************************************************");
            System.out.println(" * *");
            System.out.println(" * *");
            System.out.println(" * the Side of the Square is " + side + " *");
            System.out.println(" * Perimeter of the Square is " + perimeter + " *");
            System.out.println(" * Area of the Square is " + area + " *");
            System.out.println(" * *");
            System.out.println(" * *");
            System.out.println(" **********************************************************");
        }
    }
