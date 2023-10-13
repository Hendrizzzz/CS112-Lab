package exercises.midterms;

import java.util.Scanner;

public class NestedForLoopSeries3 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            System.out.println(); //Just for formatting
            System.out.println();

            for (int row = 1; row <= number; row++){ //outer for-loop for row
                //iterates until 5th row


                for (int space = 1; space <= number - row; space++){ //inner for-loop to print spaces
                    System.out.print("  ");  //Double space
                }


                for (int num = 1; num<= row; num++){ //inner for-loop to print number per row
                    System.out.print(num + " ");
                }


                System.out.println(); //prints nextline

            }  // end of outer loop

        } // end of main method
    } // end of class
