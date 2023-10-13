public class Haha {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++){ //outer for-loop for row
                                            //iterates until 5th row


                for (int space = 1; space <= 5 - row; space++){ //inner for-loop to print spaces
                        System.out.print("  ");  //Double space
                }


                for (int num = 1; num<= row; num++){ //inner for-loop to print number per row
                        System.out.print(num + " "); 
                }


            System.out.println(); //prints nextline

        }  // end of outer loop

    } // end of main method
} // end of class
