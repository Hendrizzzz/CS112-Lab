import java.util.Random;
import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args) {

        boolean exit = false;
        int choice;

        displayNames();
        Scanner kbd = new Scanner(System.in);

        while(!exit){
            try{
                choice = getUserChoice(kbd);

                switch(choice){
                    case 1 -> isLeapYear(kbd);
                    case 2 -> incomeTaxComputation(kbd);
                    case 3 -> insertElementInElement(kbd);
                    case 4 -> deleteElementInArray(kbd);
                    case 5 -> displayMulTable(kbd);
                    case 6 -> removeVowels(kbd);
                    case 7 -> removeDupLetters(kbd);
                    case 8 -> {
                        System.out.println("Thank you for using the program. Good bye!");
                        exit = true;
                    }
                    default -> System.out.println("Invalid input");
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid. Not a numeric value");
            }
        }
    }



    private static void displayNames() {
        System.out.println("Welcome to our Java Collection ");
        System.out.println("Bag-eo, Jim Hendrix ");
        System.out.println("Bag-eo, Jim Hendrix ");
        System.out.println("Bag-eo, Jim Hendrix ");
        System.out.println("Bag-eo, Jim Hendrix ");
        System.out.println("Bag-eo, Jim Hendrix ");
        System.out.print("Bag-eo, Jim Hendrix ");
    }

    private static int getUserChoice(Scanner kbd) {
        while (true) {
            System.out.println("\n\nPress [ENTER] to see Main Menu ");
            if (kbd.nextLine().trim().isEmpty()) {
                System.out.println("Please choose among the Java Program ");
                System.out.println("------------------------------------ ");
                System.out.print("""
                        1. Determine if a year is a Leap Year
                        2. Income Tax Computation
                        3. Inserting an Element in an Array
                        4. Deleting an Element in an Array
                        5. Display all the multiplication Table using 2D arrays
                        6. Remove all vowels in a word
                        7. Remove duplicate letters
                        8. Exit Program
                        """);
                System.out.println("------------------------------------ \n");
                System.out.print("Input the number corresponding to your choice: ");
                return Integer.parseInt(kbd.nextLine());
            } else {
                System.out.println("error");
            }
        }
    }


    private static void isLeapYear(Scanner kbd) {
        // Display current program
        System.out.println("\n-------------------------------------------");
        System.out.println("Program: Determine if a year is a Leap Year");
        System.out.println("-------------------------------------------");

        //Declare variables
        int year;
        boolean checker = false;

        while(true) { // Loop until the user inputs an integer
            try {
                System.out.print("Enter a year: ");
                year = Integer.parseInt(kbd.nextLine());

                // Check if input is negative
                if (year < 1) {
                    System.out.println("Invalid input. Please enter a valid year greater than 0.");
                    continue;
                }

                // Check if leap year or not
                if (year % 4 == 0) if (year % 400 != 0) checker = true;

                System.out.println((checker) ? year + " is a leap year. " : year + " is not a leap year. ");

                break; // Break the infinite prompt
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please only enter an integer. \n");
            }
        }
    }

    private static void incomeTaxComputation(Scanner kbd) {
        //Display current program
        System.out.println("\n-------------------------------");
        System.out.println("Program: Income Tax Computation");
        System.out.println("-------------------------------");

        //Declare variables
        double taxableIncome;
        double incomeTax;

        while(true){
            try{
                System.out.print("Enter an annual salary: ");
                taxableIncome = Integer.parseInt(kbd.nextLine());

                // Check if input is negative
                if (taxableIncome < 0) {
                    System.out.println("Invalid input. Salary cannot be negative. Please provide a valid income.");
                    continue;
                }

                // Income Tax computation
                if(taxableIncome < 250000) incomeTax = 0;
                else if (taxableIncome < 400000) incomeTax = 0.20 * (taxableIncome - 250000);
                else if (taxableIncome < 800000) incomeTax = 30000 +  (0.25 * (taxableIncome - 250000));
                else if (taxableIncome < 2000000) incomeTax = 130000 + (0.30 * (taxableIncome - 250000));
                else if (taxableIncome < 8000000) incomeTax = 490000 + (0.32 * (taxableIncome - 250000));
                else incomeTax = 2410000 + (0.35 * (taxableIncome - 8000000));

                System.out.println("Income Tax: " + incomeTax);
                break;
            } catch (NumberFormatException e){
                System.out.println("Invalid Input. Please enter a numeric value only. \n");
            }
        }
    }

    private static void insertElementInElement(Scanner kbd) {
        //Display current program
        System.out.println("\n---------------------------------------");
        System.out.println("Program: Inserting an Element in an Array");
        System.out.println("---------------------------------------");

        //Declare variables
        int[] userArray = new int[10];
        int insert;
        int index = 0;
        int temp; // For swapping data in array insertion
        boolean isValidIndex = false;

        Random random = new Random();

        while(true) {
            try {
                // Generates random number from 1 to 100 to all the elements of the array
                for (int i = 0; i < userArray.length; i++) {
                    userArray[i] = random.nextInt(100) + 1;
                }

                // Display the pre-inserted array
                System.out.println("Initial Array: ");
                for (int j : userArray) System.out.print(j + " ");

                // Get user input for the element to insert
                System.out.print("\nEnter an integer to insert: ");
                insert = Integer.parseInt(kbd.nextLine());

                // Get user input for the index with validation
                while(!isValidIndex) {
                    // Get user input for the index
                    System.out.print("\nEnter the index: ");
                    index = Integer.parseInt(kbd.nextLine());

                    // Check if the index is valid
                    if (index < 0 || index > userArray.length - 1) System.out.println("Invalid index. Please enter a valid index within the range. ");
                    else isValidIndex = true;
                }

                // Insert an element at index k
                for(int k = index; k < userArray.length; k++){
                    temp = userArray[k];
                    userArray[k] = insert;
                    insert = temp;
                }

                //Display the post-inserted array
                System.out.println("New Array: ");
                for (int l : userArray) System.out.print(l + " ");

                break;
            } catch (NumberFormatException e){
                System.out.println("Invalid Input. Please enter a valid integer \n");
            }
        }
    }

    private static void deleteElementInArray(Scanner kbd) {
        //Display current program
        System.out.println("\n---------------------------------------");
        System.out.println("Program: Deleting an Element in an Array");
        System.out.println("---------------------------------------");

        // Declare variables
        int[] userArray = new int[10];
        int delete;
        int numberCount = 0;
        boolean isNumberFound = false;

        Random random = new Random();

        while (true){
            try {
                // Generates random number from 1 to 50 to all the elements of the array
                for (int i = 0; i < userArray.length; i++) {
                    userArray[i] = random.nextInt(100) + 1;
                }

                // Display the pre-inserted array
                System.out.println("Initial Array: ");
                for (int j : userArray) System.out.print(j + " ");

                // Get user input for the element to delete
                System.out.print("\n\nEnter an integer to delete: ");
                delete = Integer.parseInt(kbd.nextLine());

                // I spent 20mins just thinking about these for loop bruh
                for (int k = 0; k < userArray.length; k++) {
                    if (delete == userArray[k]) {
                        isNumberFound = true;
                        numberCount++;
                        for (int l = k; l < userArray.length - numberCount; l++) {
                            userArray[l] = userArray[l + 1];
                        }
                        userArray[userArray.length - numberCount] = 0;
                        k--; // This goes back to the current position of k to recheck
                    }
                }

                // If the number to be deleted is not on the array
                if(!isNumberFound) System.out.println("Number not found");
                else {
                    // Display the post-inserted array
                    System.out.println("\nNew Array: ");
                    for (int m : userArray) System.out.print(m + " ");
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer. ");
            }
        }
    }

    private static void displayMulTable(Scanner kbd) {
        //Display current program
        System.out.println("\n---------------------------------------------------------");
        System.out.println("Program: Display the multiplication Table using 2D arrays");
        System.out.println("---------------------------------------------------------");

        // Declare variables
        int[][] userArray;
        int row;
        int column;

        while(true) {
            try {
                // Get user input for rows
                System.out.print("Rows: ");
                row = Integer.parseInt(kbd.nextLine()) + 1;

                //Get user input for columns
                System.out.print("Columns: ");
                column = Integer.parseInt(kbd.nextLine()) + 1;

                // Initialized the 2d array
                userArray = new int [row][column];

                // Filling the 2d array
                for(int i = 0; i < row; i++){
                    for (int j = 0; j < column; j++){
                        if (i == 0) userArray [i][j] = j;
                        if (i > 0) {
                            if (j == 0){
                                userArray[i][j] = i;
                            }
                            else {
                                userArray[i][j] = userArray[i][0] * userArray[0][j];
                            }
                        }
                    }
                }

                // Printing the 2d Array in Multiplication Table Format
                for (int k = 0; k < row; k++){
                    for (int l = 0; l < column; l++){
                        if (userArray[k][l] > 999) System.out.print(userArray[k][l] + " ");
                        else if (userArray[k][l] > 99) System.out.print(userArray[k][l] + "  ");
                        else if (userArray[k][l] > 9) System.out.print(userArray[k][l] + "   ");
                        else System.out.print(userArray[k][l] + "    ");
                    }
                    System.out.println();
                }

                break;
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid integer. \n");
            }
        }

    }

    private static void removeVowels(Scanner kbd) {
        //Display current program
        System.out.println("\n------------------------------------");
        System.out.println("Program: Remove all Vowels in a Word");
        System.out.println("------------------------------------");

        //Declare variables
        char[] letterArray;
        boolean isValidWord = false;
        String word = "";
        StringBuilder noVowelWord = new StringBuilder();

        // Get word with validation
        while (!isValidWord) {
            // Prompt the user to enter a word
            System.out.print("Enter a word: ");
            word = kbd.nextLine();

            // Validate if the input consists only letters
            if (word.matches("[a-zA-Z]+")) isValidWord = true;

            // Display if invalid
            if (!isValidWord) System.out.println("Invalid input. Please enter only letters. ");
        }

        // Place all the letters in an array
        letterArray = word.toCharArray();

        // Iterate the array and check if the element is vowel, if so then replace it with blank
        for(int i = 0; i < letterArray.length; i++) {
            if (letterArray[i] == 'a' || letterArray[i] == 'e' || letterArray[i] == 'i' ||
                letterArray[i] == 'o' || letterArray[i] == 'u' || letterArray[i] == 'A' ||
                letterArray[i] == 'E' || i == 'I' || letterArray[i] == 'O' || letterArray[i] == 'U')   {
                letterArray[i] = ' '; // Replace it with Empty Character
            }
        }

        // Iterate the array then append to the StringBuilder
        for(char j : letterArray){
            if (j != ' ') noVowelWord.append(j); // If blank character, then do not append
        }

        System.out.println("New Word: " + noVowelWord.toString().trim());

    }

    private static void removeDupLetters(Scanner kbd) {
        //Display current program
        System.out.println("\n------------------------------------");
        System.out.println("Program: Remove all Vowels in a Word");
        System.out.println("------------------------------------");

        //Declare variables
        char[] letterArray;
        boolean isValidWord = false;
        String word = "";
        StringBuilder noDuplicateLetterWord = new StringBuilder();


        // Get word with validation
        while (!isValidWord) {
            // Prompt the user to enter a word
            System.out.print("Enter a word: ");
            word = kbd.nextLine();

            // Validate if the input consists only letters
            if (word.matches("[a-zA-Z]+")) isValidWord = true;

            // Display if invalid
            if (!isValidWord) System.out.println("Invalid input. Please enter only letters. ");
        }

        // Place all the letters in an array
        letterArray = word.toCharArray();

        // Iterate to check if there are duplicate letters and replace them with ' '
        for (char i : letterArray) {
            int count = 0; // For counting duplicate letters
            for (char letter : letterArray) {
                if (i == letter) count++;
            }
            if ((count - 1)  != 0){
                    for (int k = 0; k < letterArray.length; k++){
                        if (letterArray[k] == i) {
                            letterArray[k] = ' ';
                        }
                    }
            }
        }

        // Iterate the array then append to the StringBuilder
        for(char l : letterArray){
            if (l != ' ') noDuplicateLetterWord.append(l); // If blank character, then do not append
        }

        System.out.println("New Word: " + noDuplicateLetterWord.toString().trim());
    }

} // End of the class
