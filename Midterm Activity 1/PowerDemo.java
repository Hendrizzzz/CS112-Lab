//two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.

import java.util.Scanner;

public class PowerDemo
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        //Declaring variables
        int base;
        int power;
        double result = 1; //Need to initialize to 1 because it will later be used (needs to be 1)


        System.out.println("Enter the base: "); //Prompt for base and placed it to base
        base = console.nextInt();

        System.out.println("Enter the power: "); //Prompt for power and placed it to power
        power = console.nextInt();

        for (int i = power; i > 0; i--){ //The process which calculates for the result
            result *= base;
        }

        System.out.println(result); //Display the result
    } //end of the main method
}// end of the class
