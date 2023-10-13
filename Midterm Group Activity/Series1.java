package exercises.midterms;

import java.util.Scanner;

public class NestedForLoopSeries1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++){  //To print the number of lines

            for (int j = 1; j <= number - i; j++){ //To print the spaces
                System.out.print("   ");
            }

            for (int k = 1; k <= i; k++){ //To print the numbers from 1 to x
                System.out.print(k + "  ");
            }

            for (int l = i - 1; l > 0; l--){ //To print the numbers after x to 1
                System.out.print(l + "  ");
            }
            System.out.println(); //NextLine
        } 
    }
}
