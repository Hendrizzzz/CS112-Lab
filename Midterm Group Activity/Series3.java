package exercises.midterms;
public class NestedForLoopSeries3 {
    public static void main(String[] args) {

        int number = 5; //Number of lines

        for (int row = 1; row <= number; row++){ //outer for-loop for row
            //iterates until 5th row

            for (int space = 1; space <= number - row; space++){ //inner for-loop to print spaces
                System.out.print("   ");  //3 spaces
            }

            for (int num = 1; num <= row; num++){ //inner for-loop to print number per row
                System.out.print(num + "  "); //2 spaces
            }

            System.out.println(); //prints nextline

        }  // end of outer loop

    } // end of main method
} // end of class
