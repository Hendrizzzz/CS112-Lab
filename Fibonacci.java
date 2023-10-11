import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {


        int firstTerm = 0;
        int secondTerm = 1;
        int num = 0;
        boolean valid = true;


        Scanner input = new Scanner(System.in);


        do {
            try {
                System.out.print("Enter the number of fibonacci terms: ");
                num = Integer.parseInt(input.nextLine());
                if (num > 0){
                    valid = false;
                } else {
                    System.out.println("\nInvalid input. Please enter a positive integer. ");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nInvalid input. Please enter a valid quantity. ");
            }
        } while(valid);



        for (int i = 0; i < num; i++){
            System.out.print(firstTerm + " ");
            int temp = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = temp;
        }
        
    }
}
