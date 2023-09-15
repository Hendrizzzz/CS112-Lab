/*
Name: Jim Hendrix T. Bag-eo
Programming Date: 9 /15/2023
Activity Name and Number: Prelim Programming Exercise 7
Problem:
 Write a program that will read the amount of money that will be withdrawn from an ATM (e.g. P500 or P1200)
then compute and output the least number of peso bills (P100 peso bills, P500 peso bills, P1000 peso bills) that
will be dispensed by the machine for the requested amount.
Analysis:
Input: money
Processes:
Prompt the user to input money to be withdrawn
Compute the number 1000, 500, 100 bills
Display Number Of Bills
Output: Display Number Of Bills
Algorithm:
1. Create a scanner object
2. Prompt user for money to be withdrawn by calling another method and reference it to 'money'
3. Find the number of 1000, 500, 100 bills of the money
5. Display the result
*/

package exercises.prelims;

import java.util.Scanner;

public class Dispenser {
    public static void main(String[] args) {

        Scanner moneyInput = new Scanner(System.in);

        int money = getMoney(moneyInput);
        int[] bills = geNumberOfBills(money);

        displayNumberOfBills(money, bills);
    }

    private static int getMoney(Scanner moneyInput) {
        do {
            System.out.print("Enter amount: ");
            if (moneyInput.hasNextInt()){
                return moneyInput.nextInt();
            } else {
                System.out.println("Invalid input. Please enter whole numbers only.");
                System.out.println();
            }
        } while (true);
    }

    private static int[] geNumberOfBills(int money) {
        int[] numberOfBills = new int[3];
        if (money>=1000){
            numberOfBills[0] = money/1000;
            money = money%1000;
        }
        if (money>=500){
            numberOfBills[1] = money/500;
            money = money%500;
        }
        if (money>=100){
            numberOfBills[2] = money/100;
        }
        return numberOfBills;
    }


    private static void displayNumberOfBills(int money, int[] bills) { //Display layout output'
        System.out.println();
        System.out.println(" PESO BILLS                 QUANTITY DISPENSED      AMOUNT");
        System.out.println("============              =====================    ========");
        System.out.println("P 1000" + "                              " + bills[0] + "                " + bills[0]*1000);
        System.out.println("P 500" + "                               " + bills[1] + "                " + bills[1]*500);
        System.out.println("P 100" + "                               " + bills[2] + "                " + bills[2]*100);
        System.out.println("------------              ---------------------    --------");
        System.out.print("Total Number of Bills              " + (bills[0]+bills[1]+bills[2]) + "                 " + money);
    }
}
