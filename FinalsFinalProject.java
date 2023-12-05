package exercises.finals;

import java.util.Random;
import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args) {

        int choice;

        displayTeamMemberNames();
        Scanner kbd = new Scanner(System.in);

        while(true){
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
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid input");
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid. Not a numeric value");
            }
        }
    } // End of Main Method




    // Display the names of the team members
    private static void displayTeamMemberNames() {
        System.out.println("Welcome to our Java Collection ");
        System.out.println("Bag-eo, Jim Hendrix");
        System.out.println("Sambot, Kyle Archilles Zinichi");
        System.out.println("Gapuz, Caleb");
        System.out.println("Calsado, Glaiza");
        System.out.println("Mendoza, Roxxanne");
        System.out.println("Angelo, Franz");
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







    

    /*
    Pseudocode: isLeapYear()

    1. Get user input for year with validation
    2. Check if leap year
    3. Display if leap year or not

     */
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
                if ((year % 4 == 0) && (year % 400 == 0 || year % 100 != 0)) checker = true;

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




    



    

/*
Pseudocode: incomeTaxComputation()

1. Get user input for annualIncomeTax with validation
2. Compute annual income tax
3. Display annual income tax
 */
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
                annualIncome = getPositiveIntegerInput(kbd, "Enter annual income: ");
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








    

/*
Pseudocode: insertElementInArray()

1. Create an array and fill through for loop
2. Display the pre-inserted array
3. Get user input for an element to insert
4. Get user input for index to insert it to, with validation
5. Call a method to insert the element at index k
    - Just shift the elements to the left, through for loop start from the last element until the index k
    - Set the index k to the element given
6. Display the post-inserted array (same method called with number 2)
 */

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
        boolean validIndex = false;

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
                while(!validIndex) {
                    // Get user input for the index
                    System.out.print("Enter the index: ");
                    index = Integer.parseInt(kbd.nextLine());

                    // Check if the index is valid
                    if (index < 0 || index > userArray.length - 1) System.out.println("Invalid index. Please enter an index between 0 and 9. \n");
                    else validIndex = true;
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
        // Shift the elements 1 position to the right until the index
        for (int k = userArray.length - 1; k > index; k--) {
            userArray[k] = userArray[k - 1];
        }

        // Insert the element in the array at index
        userArray[index] = insert;
    }

    // Method to display the elements of an array
    private static void displayArray(int[] userArray) {
        //Display the post-inserted array
        for (int i : userArray) System.out.print(i + " ");
        System.out.println(); // For console formatting
    }








    

/*
Pseudocode: deleteElementInArray()

1. Create an array and fill through for loop
2. Display the pre-deleted array
3. Get user input for an element to delete
5. Through for loop;
    if number is found
        - shift the elements to left starting from the last element until the index of the elementToBeDeleted
        - then set the last value - numberCount to be 0
    if not
        -display not found
6. Display the post-deleted array (same method called with number 2)
 */

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
        boolean numberFound = false;

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
                for (int i = 0; i < userArray.length; i++) {
                    if (elementToBeDeleted == userArray[i]) {
                        numberFound = true;
                        numberCount++;

                        // Shift elements to the left from the index to the last element
                        for (int k = i; k < userArray.length - numberCount; k++) {
                            userArray[k] = userArray[k + 1];
                        }

                        // Set the last element to 0
                        userArray[userArray.length - numberCount] = 0;
                        i--; // This goes back to the current position of k to recheck
                    }
                }

                // If the number to be deleted is not on the array
                if(!numberFound) System.out.println("Number not found");
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







    


/*
Pseudocode: displayMulTable()

1. Get rows and columns with validation
2. Create a 2d array with sizes of rows + 1 and columns + 1 entered
3. Populate the 2d array by rows
5. Display the 2d array in multiplication table format with spacing
 */

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
                row = getPositiveIntegerInput(kbd, "Rows: ") + 1;

                //Get user input for columns with validation
                column = getPositiveIntegerInput(kbd, "Columns: ") + 1;

                // Declare and Initialize the 2d array
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
        // Filling the 2D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0) {
                    multiplicationTable[i][j] = j;
                } else if (j == 0) {
                    multiplicationTable[i][j] = i;
                } else {
                    multiplicationTable[i][j] = multiplicationTable[i][0] * multiplicationTable[0][j];
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




    



/*
Pseudocode: removeVowels()
1. Create a StringBuilder
2. Get word with validation
3. Iterate through the word letter by letter{
        if vowel, then don't add it in the StringBuilder
        if not vowel, then add it in the StringBuilder
    }
4. Display the new word without vowels
*/
    private static void removeVowels(Scanner kbd) {
        //Display current program
        System.out.println("\n------------------------------------");
        System.out.println("Program: Remove all Vowels in a Word");
        System.out.println("------------------------------------");

        //Declare variables
        boolean validWord = false;
        String word = "";
        StringBuilder noVowelWord = new StringBuilder();

        // Get word with validation
        while (!validWord) {
            // Prompt the user to enter a word
            System.out.print("Enter a word: ");
            word = kbd.nextLine().trim();

            // Validate if the input consists only letters
            if (word.matches("[a-zA-Z]+")) validWord = true;

            // Display if invalid
            if (!validWord) System.out.println("Invalid input. Please enter a valid word. ");
        }

        // Iterate the word and check if the character is a vowel, if so, skip it
        for (char c : word.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) == -1) {
                noVowelWord.append(c);
            }
        }

        System.out.println("New Word: " + noVowelWord);
    } // End of Method -> removeVowels










    
/*
Pseudocode: removeDupLetters()

1. Get user input for text
2. Iterate through the text character per character
    -if it is a letter{
        {-then iterate again through the characters to check if there is a duplicate in the past characters
            -if there is a duplicate don't add
            - else if no duplicate is found then add
        }
    }
    - else if not a letter then just add (like numbers or symbols)
3. Display the new text
*/
    private static void removeDupLetters(Scanner kbd) {
        // Display current program
        System.out.println("\n------------------------------------");
        System.out.println("Program: Remove Duplicate Letters");
        System.out.println("------------------------------------");

        // Declare variables
        String text;
        StringBuilder newText = new StringBuilder();
        boolean duplicate;

        // Get user input for text
        System.out.print("Enter a text: ");
        text = kbd.nextLine();

        // Iterate through the characters in the input text
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            duplicate = false;

            // Check if the character is a letter
            if (Character.isLetter(currentChar)) {
                // Check if the letter has already been seen
                for (int j = 0; j < i; j++) {
                    if (text.charAt(j) == currentChar) {
                        duplicate = true;
                        break;
                    }
                }

                // If not a duplicate, append it to the new text
                if (!duplicate) {
                    newText.append(currentChar);
                }
            } else {
                // If not a letter, append it directly to the new text
                newText.append(currentChar);
            }
        }

        // Display the text without duplicate letters
        System.out.println("New Text: " + newText);
    }

} // End of the class
