/*
Name: Jim Hendrix T. Bag-eo
Date of Completion: September 12, 2023
Class Code and Course Number: 9322B - CS112L
Algorithm:
    Initializing:
        1. Create a Scanner object ('kbd') to read user input.
        2. Define arrays ('productList') and ('unitPriceList') to store products and their prices.

    Input:
        Prompt the user to input the following and loop until valid input is read:
        1. Product
        2. Quantity
        3. Discount
        4. Cash Tendered

    Processes:
        1. Identify the unitPrice after the Quantity is read.
        2. Compute the Total Purchase Amount.
        3. Compute the Total Discount.
        4. Compute the Amount To Be Paid.
        5. Compute the Change.

    Output:
        Display the following:
        1. Total Purchase Amount
        2. Total Discount
        3. Amount To Be Paid
        4. Change
*/

package exercises.prelims;

import java.util.Scanner;
import java.util.Random;

public class AlingNenaStore {
    public static void main(String[] args) {

        Random discountRandom = new Random();
        Scanner kbd = new Scanner(System.in);

        String[] productList = {"eggs", "milk", "sardines", "cooking oil", "vinegar", "garlic", "onion", "salt", "coffee", "corned beef", "pancit canton"}; // List of the products
        double[] unitPriceList = {5.00, 18.75, 23.50, 10.0, 12.0, 4.5, 3.5, 10.0, 8.0, 19.50, 16.50}; // List of the prices of the products

        String product = getProduct(kbd, productList);
        int quantity = getQuantity(kbd);
        double unitPrice = getUnitPrice(product, productList, unitPriceList);
        double discount = getDiscount(discountRandom);
        double cashTendered = getCashTendered(kbd);

        double totalPurchaseAmount = computeTotalPurchaseAmount(quantity, unitPrice); //Computes for Total Purchase Amount
        double totalDiscount = computeTotalDiscount(discount, totalPurchaseAmount); //Computes for Total Discount
        double amountToBePaid = computeAmountToBePaid(totalPurchaseAmount, totalDiscount); //Computes for Amount To Be Paid
        double change = computeChange(cashTendered, amountToBePaid); //Computes for Change

        printReceipt(totalPurchaseAmount, totalDiscount, amountToBePaid, change); //Prints the Output
    }

    private static String getProduct(Scanner kbd, String[] productList) {
        do {
            System.out.print("Product: ");
            String product = kbd.nextLine().toLowerCase().trim();

            for (String i : productList) {
                if (product.equals(i)) {
                    return product;
                }
            }
            System.out.println("\nOur store doesn't sell " + product + " ");
        } while (true); //Loop until the kbd reads a Product from the array
    } // End of the getProduct method

    private static int getQuantity(Scanner kbd) {
        do {
            System.out.print("Quantity: ");
            if (kbd.hasNextInt()) {
                int quantity = kbd.nextInt();
                if (quantity > 0 && quantity <= 100) {
                    return quantity;
                }
            }
            System.out.println("\nInvalid input. Please enter a valid quantity. ");
            kbd.nextLine();
        } while (true); //Loop until the kbd reads a Quantity 1-100
    } // End of the getQuantity method

    private static double getUnitPrice(String product, String[] productList, double[] unitPriceList) {
        double unitPrice = 0;
        for (int i = 0; i < productList.length; i++) { //Find the Unit Price of the product entered
            if (product.equals(productList[i])) {
                unitPrice = unitPriceList[i];
            }
        }
        System.out.println("Unit Price: " + unitPrice);
        return unitPrice;
    } //End of the getUnitPrice Method

    private static double getDiscount(Random discountRandom) {

        int limit = 101;
        double discount = discountRandom.nextInt(limit); //Generates random numbers for discount
        System.out.print("Discount: " + discount + "\n");
        return discount;
    } // End of the getDiscountMethod

    private static double getCashTendered(Scanner kbd) {
        do {
            System.out.print("Cash Tendered: ");
            if (kbd.hasNextDouble()) {
                double cashTendered = kbd.nextDouble();
                if (cashTendered >= 0) {
                    return cashTendered;
                }
            }
            System.out.println("\nInvalid input. Please enter a valid Cash Amount. ");
            kbd.nextLine();
        } while (true); //Loops until kbd reads a Valid Cash Amount
    } // End of the getCashTendered method

    private static double computeTotalPurchaseAmount(int quantity, double unitPrice) {
        return quantity * unitPrice;
    } // End of the computeTotalPurchaseAmount method

    private static double computeTotalDiscount(double discount, double totalPurchaseAmount) {
        return totalPurchaseAmount * (discount / 100);
    } // End of the computeTotalDiscount method

    private static double computeAmountToBePaid(double totalPurchaseAmount, double totalDiscount) {
        return totalPurchaseAmount - totalDiscount;
    } // End of the totalAmountToBePaid method

    private static double computeChange(double cashTendered, double amountToBePaid) {
        return cashTendered - amountToBePaid;
    } // End of the computeChange method

    private static void printReceipt(double totalPurchaseAmount, double totalDiscount, double amountToBePaid, double change) {
        System.out.printf("%n%nTotal Purchase Amount: %.2f", totalPurchaseAmount);
        System.out.printf("%nTotal Discount: %.2f", totalDiscount);
        System.out.printf("%nAmount To Be Paid: %.2f", amountToBePaid);
        System.out.printf("%nChange: %.2f", change);
    } // End of the printReceiptMethod
} // End of class88
