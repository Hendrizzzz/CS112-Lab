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




    private static void displayNames() {
        System.out.println("Welcome to our Java Collection ");
        System.out.println("Bag-eo, Jim Hendrix ");
        System.out.println("Sambot, Kyle Archilles Zinichi ");
        System.out.println("Gapuz, Caleb ");
        System.out.println("Calsado, Glaiza ");
        System.out.println("Mendoza, Roxxanne ");
        System.out.print("Angelo, Franz ");
    } // End of Method -> displayNames





    private static int getUserChoice(Scanner kbd) {
        while (true) {
            System.out.print("\n\nPress [ENTER] to see Main Menu ");
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
                System.out.print("Enter a year: ");
                year = Integer.parseInt(kbd.nextLine());

                // Check if input is negative
                if (year < 1) {
                    System.out.println("Invalid input. Please enter a valid year. \n");
                    continue;
                }

                // Check if the year is divisible by 4, but not divisible by 400 to determine leap year.
                if (year % 4 == 0) if (year % 400 != 0) checker = true;

                System.out.println((checker) ? year + " is a leap year. " : year + " is not a leap year. ");

                break; // Break the infinite prompt
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please only enter an integer. \n");
            }
        }
    } // End of Method -> isLeapYear






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

    private static double computeIncomeTax(double annualIncome) {
        // Income Tax computation
        if(annualIncome < 250000) return 0;
        else if (annualIncome < 400000) return 0.20 * (annualIncome - 250000);
        else if (annualIncome < 800000) return 30000 +  (0.25 * (annualIncome - 250000));
        else if (annualIncome < 2000000) return 130000 + (0.30 * (annualIncome - 250000));
        else if (annualIncome < 8000000) return 490000 + (0.32 * (annualIncome - 250000));
        else return 2410000 + (0.35 * (annualIncome - 8000000));
    }





    // Method to insert an element in an array
    private static void insertElementInArray(Scanner kbd) {
        //Display current program
        System.out.println("\n---------------------------------------");
        System.out.println("Program: Inserting an Element in an Array");
        System.out.println("---------------------------------------");

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
                System.out.println("Element " + insert + " is successfully added in the array at index " + index + " ");
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
                displayArray(userArray);

                // Get user input for the element to delete
                System.out.print("\nEnter an integer to delete: ");
                delete = Integer.parseInt(kbd.nextLine());

                // Loop through the array to find and delete the specified element
                for (int k = 0; k < userArray.length; k++) {
                    if (delete == userArray[k]) {
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
                    System.out.println("\nNew Array: ");
                    displayArray(userArray);
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer. ");
            }
        }
    } // End of Method -> deleteElementInArray




    private static void displayMulTable(Scanner kbd) {
        //Display current program
        System.out.println("\n---------------------------------------------------------");
        System.out.println("Program: Display the multiplication Table using 2D arrays");
        System.out.println("---------------------------------------------------------");

        // Declare variables
        int[][] user2dArray;
        int row;
        int column;

        while(true) {
            try {
                // Get user input for rows with validation
                while(true) {
                    System.out.print("Rows: ");
                    row = Integer.parseInt(kbd.nextLine()) + 1;

                    if (row > 0) break;
                    else System.out.println("Invalid input. Row/s cannot be negative. \n");
                }

                //Get user input for columns with validation
                while (true) {
                    System.out.print("Columns: ");
                    column = Integer.parseInt(kbd.nextLine()) + 1;

                    if (column > 0) break;
                    else System.out.println("Invalid input. Column/s cannot be negative. \n");
                }

                // Initialized the 2d array
                user2dArray = new int [row][column];

                // Filling the 2d array
                fill2dArray(user2dArray, row, column);

                // Printing the 2d Array in Multiplication Table Format
                for (int k = 0; k < row; k++){
                    for (int l = 0; l < column; l++){
                        if (user2dArray[k][l] > 999) System.out.print(user2dArray[k][l] + " ");
                        else if (user2dArray[k][l] > 99) System.out.print(user2dArray[k][l] + "  ");
                        else if (user2dArray[k][l] > 9) System.out.print(user2dArray[k][l] + "   ");
                        else System.out.print(user2dArray[k][l] + "    ");
                    }
                    System.out.println();
                }
                System.out.flush();
                break;
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid integer. \n");
            }
        }
    } // End of displayMulTable

    private static void fill2dArray(int[][] user2dArray, int row, int column) {
        // Filling the 2d array
        for(int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                if (i == 0) user2dArray [i][j] = j;
                if (i > 0) {
                    if (j == 0){
                        user2dArray[i][j] = i;
                    }
                    else {
                        user2dArray[i][j] = user2dArray[i][0] * user2dArray[0][j];
                    }
                }
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
    } // End of Method -> removeVowels

    private static void removeDupLetters(Scanner kbd) {
        //Display current program
        System.out.println("\n------------------------------------");
        System.out.println("Program: Remove Duplicate Letters");
        System.out.println("------------------------------------");

        //Declare variables
        String text;
        char[] charArray;
        char temp;

        // Get user input for text
        System.out.print("Enter a text: ");
        text = kbd.nextLine();

        // Store it in an array char per char
        charArray = text.toCharArray();

        // Iterate the array of characters
        for (int i = 0; i < charArray.length; i++){

            //Check if the character is not a letter
            if (!Character.isLetter(charArray[i])) continue; // We can also use 'Character.isCharacter(charArray[i]) or Character.toString(myChar).matches("[a-zA-Z]")

            //iterate to check if there is a duplicate
            for (int j = 0; j < charArray.length; j++){
                // End this one iteration j = i (which is equal to its self)
                if (j == i) continue;

                // Check if there is a duplicate then iterate through the word to replace default values to the letters
                if (charArray[i] == charArray[j]) {
                    temp = charArray[j];
                    for (int k = 0; k < charArray.length; k++){
                        if (temp  == charArray[k]) charArray[k] = '\u0000';
                    }
                }
            }
        }
        
        //Iterate the char array and text without duplicate letters
        System.out.print("New Text: ");
        for (char a : charArray){
            if (a != '\u0000') System.out.print(a);
        }
    } // End of Method -> removeDuplicateLetters

} // End of the class
