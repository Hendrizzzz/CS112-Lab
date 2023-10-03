//https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java


import java.util.Scanner;

/*
Name: Ang, Julienne S.
Date: August 15, 2022

Problem:
Write a program that displays "Hello World!" on the output screen.

 */
public class HelloWorld {
    public static void main(String[] args){

        Scanner kbd = new Scanner(System.in);

        int num = getNumber(kbd);
        String digitString = getDigits(num);
        int result = getResult(num, digitString);

        System.out.print(result);
    } // end of main method

    private static String getDigits(int num) {
        return String.valueOf(num);
    }

    private static int getNumber(Scanner kbd) {
        do {
            try {
                System.out.print("Enter the number: ");
                int num = kbd.nextInt();
                if (num > 11){
                    return num;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please input a positive integer more than 10");
            }
        } while (true);
    }

    private static int getResult(int num, String digitString) {
        int digits = Integer.parseInt(digitString);
        int[] number = new int[digits];
        int resultedNum = 1;
        int count = 0;

        if (num >= 100){
            int digit1 = num/100;
            num %= 100;
            int digit2 = num/10;
            num %= 10;
            int digit3 = num/10;
            num %= 10;

            number[0] = digit1;
            number[1] = digit1;
            number[2] = digit1;


        } else if (num >= 11){
            int digit2 = num/10;
            num %= 10;
            int digit3 = num/10;
            num %= 10;

            number[0] = digit2;
            number[1] = digit3;
        }

        while (true){
            for (int i : number){
                resultedNum *= i;
                if (resultedNum >= 100){
                    int digit1 = num/100;
                    num %= 100;
                    int digit2 = num/10;
                    num %= 10;
                    int digit3 = num/10;
                    num %= 10;

                    number[0] = digit1;
                    number[1] = digit1;
                    number[2] = digit1;


                } else if (resultedNum >= 11){
                    int digit2 = num/10;
                    num %= 10;
                    int digit3 = num/10;
                    num %= 10;

                    number[0] = digit2;
                    number[1] = digit3;
                }
                count++;
                if (resultedNum < 11) {
                    return count;
            }
            }
        }
    }
} // end of class
