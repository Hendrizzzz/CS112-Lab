package exercises.finals;

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
                    case 3 -> insertElementInArray(kbd);
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
    } // End of Main Method




    // Display the names of the team members
    private static void displayNames() {
        System.out.println("Welcome to our Java Collection ");
        String[] names = {
                "Bag-eo, Jim Hendrix",
                "Sambot, Kyle Archilles Zinichi",
                "Gapuz, Caleb",
                "Calsado, Glaiza",
                "Mendoza, Roxxanne",
                "Angelo, Franz"
        };

        for (String name : names) {
            System.out.println(name);
        }
    } // End of Method -> displayNames





    // Get the user's choice from the menu
    private static int getUserChoice(Scanner kbd) {
        while (true) {
            System.out.print("\n\nPress [ENTER] to see Main Menu... ");
            if (kbd.nextLine().isBlank()) {
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
                System.out.println("Error ");
            }
        }
    } // End of Method -> getUserChoice





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
                // Get user input for year with validation
                year = getPositiveIntegerInput(kbd, "Enter year: ");

                // Check if the year is divisible by 4, but not divisible by 400 to determine leap year.
                if (year % 4 == 0) if (year % 400 == 0) checker = true;

                System.out.println((checker) ? year + " is a leap year. " : year + " is not a leap year. ");

                break; // Break the infinite prompt
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please only enter an integer. \n");
            }
        }
    } // End of Method -> isLeapYear

    private static int getPositiveIntegerInput(Scanner kbd, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int input = Integer.parseInt(kbd.nextLine());

                if (input >= 0) {
                    return input;
                } else {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }



    private static void incomeTaxComputation(Scanner kbd) {
        //Display current program
        System.out.println("\n-------------------------------");
        System.out.println("Program: Income Tax Computation");
        System.out.println("-------------------------------");

        //Declare variables
        double annualIncome;
        double calculatedIncomeTax;

        while(true){
            try{
                System.out.print("Enter annual income: ");
                annualIncome = Integer.parseInt(kbd.nextLine());

                // Check if input is negative
                if (annualIncome < 0) {
                    System.out.println("Invalid input. Annual income cannot be negative. Please enter a valid positive income. \n");
                    continue;
                }

                calculatedIncomeTax = computeIncomeTax(annualIncome);

                System.out.println("Income Tax: " + calculatedIncomeTax);
                break;
            } catch (NumberFormatException e){
                System.out.println( "Invalid input. Please enter a numeric value. \n");
            }
        }
    } // End of Method -> incomeTaxComputation


    // Compute income tax based on annual income
    private static double computeIncomeTax(double annualIncome) {
        final double RATE1 = 0.20;
        final double RATE2 = 0.25;
        final double RATE3 = 0.30;
        final double RATE4 = 0.32;
        final double RATE5 = 0.35;

        final double THRESHOLD1 = 250000;
        final double THRESHOLD2 = 400000;
        final double THRESHOLD3 = 800000;
        final double THRESHOLD4 = 2000000;
        final double THRESHOLD5 = 8000000;

        // Income Tax computation
        if (annualIncome < THRESHOLD1) return 0;
        else if (annualIncome < THRESHOLD2) return RATE1 * (annualIncome - THRESHOLD1);
        else if (annualIncome < THRESHOLD3) return 30000 + RATE2 * (annualIncome - THRESHOLD1);
        else if (annualIncome < THRESHOLD4) return 130000 + RATE3 * (annualIncome - THRESHOLD1);
        else if (annualIncome < THRESHOLD5) return 490000 + RATE4 * (annualIncome - THRESHOLD1);
        else return 2410000 + RATE5 * (annualIncome - THRESHOLD5);
    }





    // Method to insert an element in an array
    private static void insertElementInArray(Scanner kbd) {
        //Display current program
        System.out.println("\n-----------------------------------------");
        System.out.println("Program: Inserting an Element in an Array");
        System.out.println("-----------------------------------------");

        //Declare variables
        int[] userArray = new int[10];
        int insert;
        int index = 0;
        boolean isValidIndex = false;

        Random random = new Random();

        while(true) {
            try {
                // Generates random number from 1 to 100 to all the elements of the array
                for (int i = 0; i < userArray.length; i++) {
                    userArray[i] = random.nextInt(100) + 1;
                }

                // Display the pre-inserted array
                System.out.print("Initial Array: ");
                displayArray(userArray);

                // Get user input for the element to insert
                System.out.print("\nEnter an integer to insert: ");
                insert = Integer.parseInt(kbd.nextLine());

                // Get user input for the index with validation
                while(!isValidIndex) {
                    // Get user input for the index
                    System.out.print("Enter the index: ");
                    index = Integer.parseInt(kbd.nextLine());

                    // Check if the index is valid
                    if (index < 0 || index > userArray.length - 1) System.out.println("Invalid index. Please enter an index between 0 and 9. \n");
                    else isValidIndex = true;
                }

                // Insert the element at the specified index
                insertElementAtIndex(userArray, index, insert);

                // Display the new array
                System.out.println("Integer " + insert + " is successfully added in the array at index " + index + " ");
                System.out.print("\nNew Array: ");
                displayArray (userArray);

                break;
            } catch (NumberFormatException e){
                System.out.println("Invalid Input. Please enter a valid integer \n");
            }
        }
    } // End of Method -> insertElementInArray


    // Method to insert an element at a specific index in the array
    private static void insertElementAtIndex(int[] userArray, int index, int insert) {
        // Insert an element at index k
        for(int k = index; k < userArray.length; k++){
            int temp = userArray[k];
            userArray[k] = insert;
            insert = temp;
        }
    }

    // Method to display the elements of an array
    private static void displayArray(int[] userArray) {
        //Display the post-inserted array
        for (int i : userArray) System.out.print(i + " ");
        System.out.println(); // For console formatting
    }





    // Method to delete an element from an array
    private static void deleteElementInArray(Scanner kbd) {
        //Display current program
        System.out.println("\n---------------------------------------");
        System.out.println("Program: Deleting an Element in an Array");
        System.out.println("---------------------------------------");

        // Declare variables
        int[] userArray = new int[10];
        int elementToBeDeleted;
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
                displayArray(userArray);

                // Get user input for the element to elementToBeDeleted
                System.out.print("\nEnter an integer to delete: ");
                elementToBeDeleted = Integer.parseInt(kbd.nextLine());

                // Loop through the array to find and delete the specified element
                for (int k = 0; k < userArray.length; k++) {
                    if (elementToBeDeleted == userArray[k]) {
                        isNumberFound = true;
                        numberCount++;

                        // Shift elements to the left to fill the gap
                        for (int l = k; l < userArray.length - numberCount; l++) {
                            userArray[l] = userArray[l + 1];
                        }

                        // Set the last element to 0 to remove the duplicate
                        userArray[userArray.length - numberCount] = 0;
                        k--; // This goes back to the current position of k to recheck
                    }
                }

                // If the number to be deleted is not on the array
                if(!isNumberFound) System.out.println("Number not found");
                else {
                    // Display the post-deleted array
                    System.out.println("Integer " + elementToBeDeleted + " is successfully deleted. ");
                    System.out.println("\nNew Array: ");
                    displayArray(userArray);
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer. \n");
            }
        }
    } // End of Method -> deleteElementInArray




    private static void displayMulTable(Scanner kbd) {
        //Display current program
        System.out.println("\n---------------------------------------------------------");
        System.out.println("Program: Display the multiplication Table using 2D arrays");
        System.out.println("---------------------------------------------------------");

        // Declare variables
        int[][] multiplicationTable;
        int row;
        int column;

        while(true) {
            try {
                // Get user input for rows with validation
                row = getPositiveIntegerInput(kbd, "Rows: ");

                //Get user input for columns with validation
                column = getPositiveIntegerInput(kbd, "Columns: ");

                // Initialized the 2d array
                multiplicationTable = new int [row][column];

                // Fill the 2d array
                populateMultiplicationTable(multiplicationTable, row, column);

                // Print the 2d Array in Multiplication Table Format
                displayMultiplicationTable(multiplicationTable, row, column);
                break;
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid integer. \n");
            }
        }
    } // End of displayMulTable

    private static void populateMultiplicationTable(int[][] multiplicationTable, int row, int column) {
        // Filling the 2d array
        for(int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                if (i == 0) multiplicationTable [i][j] = j;
                if (i > 0) {
                    if (j == 0){
                        multiplicationTable[i][j] = i;
                    }
                    else {
                        multiplicationTable[i][j] = multiplicationTable[i][0] * multiplicationTable[0][j];
                    }
                }
            }
        }
    }

    private static void displayMultiplicationTable(int[][] multiplicationTable, int row, int column) {
        // Display the multiplication table with proper formatting
        for (int k = 0; k < row; k++){
            for (int l = 0; l < column; l++){
                if (multiplicationTable[k][l] > 999) System.out.print(multiplicationTable[k][l] + " ");
                else if (multiplicationTable[k][l] > 99) System.out.print(multiplicationTable[k][l] + "  ");
                else if (multiplicationTable[k][l] > 9) System.out.print(multiplicationTable[k][l] + "   ");
                else System.out.print(multiplicationTable[k][l] + "    ");
            }
            System.out.println();
        }
    }




    private static void removeVowels(Scanner kbd) {
        //Display current program
        System.out.println("\n------------------------------------");
        System.out.println("Program: Remove all Vowels in a Word");
        System.out.println("------------------------------------");

        //Declare variables
        boolean isValidWord = false;
        String word = "";
        StringBuilder noVowelWord = new StringBuilder();

        // Get word with validation
        while (!isValidWord) {
            // Prompt the user to enter a word
            System.out.print("Enter a word: ");
            word = kbd.nextLine().trim();

            // Validate if the input consists only letters
            if (word.matches("[a-zA-Z]+")) isValidWord = true;

            // Display if invalid
            if (!isValidWord) System.out.println("Invalid input. Please enter a valid word. ");
        }

        // Iterate the word and check if the character is a vowel, if so, skip it
        for (char c : word.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) == -1) {
                noVowelWord.append(c);
            }
        }

        System.out.println("New Word: " + noVowelWord);
    } // End of Method -> removeVowels




    private static void removeDupLetters(Scanner kbd) {
        //Display current program
        System.out.println("\n------------------------------------");
        System.out.println("Program: Remove Duplicate Letters");
        System.out.println("------------------------------------");

        // Declare variables
        String text;
        StringBuilder newText = new StringBuilder();

        // Get user input for text
        System.out.print("Enter a text: ");
        text = kbd.nextLine();

        // Iterate through the characters in the input text
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(currentChar)) {
                boolean isDuplicate = false;

                // Check if the letter has already been seen
                for (int j = 0; j < i; j++) {
                    if (Character.isLetter(text.charAt(j)) && text.charAt(j) == currentChar) {
                        isDuplicate = true;
                        break;
                    }
                }

                // If not a duplicate, append it to the new text
                if (!isDuplicate) {
                    newText.append(currentChar);
                }
            } else {
                // If not a letter, append it directly to the new text
                newText.append(currentChar);
            }
        }

        // Display the text without duplicate letters
        System.out.println("New Text: " + newText);
    } // End of Method -> removeDuplicateLetters

} // End of the class
