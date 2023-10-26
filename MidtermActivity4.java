package exercises.midterms;

import java.util.Scanner;
public class MidtermActivity4 {
    public static void main(String[] args) {

        boolean loop = true;
        int count = 0;

        Scanner kbd = new Scanner(System.in);

        long [] userArray = new long[20]; //I used long datatype to handle big numbers for perfect numbers

        fillArray(userArray, kbd);
        process(kbd, userArray, loop, count);
    }
    
    

    private static void fillArray(long[] userArray, Scanner kbd) {
        for (int i = 0; i < userArray.length; i++){ //Iterate the array input
            try{
                System.out.print("Enter integer " + (i+1) + ": ");
                userArray[i] = Long.parseLong(kbd.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("INVALID INPUT");
                i--;
            }
        }
    }

    private static void process(Scanner kbd, long[] userArray, boolean loop, int count) {
        while(loop){ //loop the menu until user exits
            try{
                System.out.println("\n\nChoose an option."); //The Menu
                System.out.println("1. Buzz Numbers");
                System.out.println("2. Perfect Numbers");
                System.out.println("3. Exit");
                int userInput = Integer.parseInt(kbd.nextLine());

                for (long j : userArray){ //Iterate the elements of the array
                    switch (userInput) { //Take the userInput
                        case 1 -> {
                            if ((j % 7 == 0) || (j % 10 == 7)) { //Buzz Numbers
                                System.out.print(j + " ");
                                count++;
                            }
                        }
                        case 2 -> { //Perfect Numbers
                            long sum = 0;
                            for (long k = 1; k <= j / 2; k++) {
                                if (j % k == 0) {
                                    sum += k;
                                }
                            }
                            if (sum == j) {
                                System.out.print(j + " ");
                                count++;
                            }
                        }
                        case 3 ->
                            loop = false; //Loop breaks
                    }
                }
                if (count == 0){ //To check if the array stores such number
                    if(userInput == 1) {
                        System.out.println("No Buzz Numbers.");
                    } else{
                        System.out.println("No Perfect Numbers.");
                    }
                }
            } catch (NumberFormatException e){ //For error input
                System.out.println("INVALID INPUT.PLEASE SELECT A NUMBER\n\n");
            }
        }
        System.out.print("Exited program.");
    }
}
