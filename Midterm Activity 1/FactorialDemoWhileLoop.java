import java.util.Scanner;
public class FactorialDemoWhileLoop {
    public static void main(String[] args){

        Scanner kbd = new Scanner(System.in);
        int factorial = 1;

        do {
            try {
                System.out.print("Enter the number: ");
                int number = Integer.parseInt(kbd.nextLine());
                factorial = 1;

                do {
                    factorial *= number;
                    number--;
                } while (number != 0);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid quantity. ");
            }
        } while (true);

        System.out.print(factorial);
    } // end of main method
} // end of class
