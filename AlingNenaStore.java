package exercises.prelims;


import java.util.Scanner;

public class AlingNenaStore {
    public static void main(String[] args) {

        Scanner kbd = new Scanner (System.in);

        String[] productList = {"eggs", "milk", "sardines"};

        String product = getProduct(productList, kbd);
        int quantity = getQuantity(kbd);
        double unitPrice = getUnitPrice(product);
        double purchaseAmount = computePurchaseAmount(unitPrice, quantity);
        double discount = getDiscount(kbd);
        double cashTendered = getCashTendered(kbd);
        printReceipt(product, quantity, purchaseAmount, discount, cashTendered);
    }



    private static String getProduct (String[] productList, Scanner kbd){
        String product;
        boolean isProduct = false;
        do {
            System.out.print("product: ");
            product = kbd.nextLine().toLowerCase().trim();

            for (String i : productList){
                if (product.equals(i)){
                    isProduct = false;
                } else {
                    System.out.print("\nOur store doesn't sell " + product + " ");
                }
            }
            kbd.nextLine();
        } while (isProduct);
        return product;
    }


    private static double getUnitPrice(String product) {
        double unitPrice = 0;
        switch (product){
            case "eggs":
                unitPrice = 5.00;
                break;
            case "milk":
                unitPrice = 18.75;
                break;
            case "sardines":
                unitPrice = 23.50;
                break;
        }
        return unitPrice;
    }


    private static int getQuantity(Scanner kbd) {
        int quantity = 0;
        do {
            System.out.print("Quantity: ");
            if (kbd.hasNextInt()) {
                quantity = kbd.nextInt();
                break;
            } else {
                System.out.print("\nEnter a valid quantity. ");
            }
        } while (true);
        return quantity;
    }

    private static double computePurchaseAmount(Double unitPrice, int quantity) {
        return (unitPrice * quantity);
    }

    private static int getDiscount(Scanner kbd) {
    }

    private static int getCashTendered(Scanner kbd) {
    }

    private static void printReceipt(String product, double quantity, double purchaseAmount, double discount, double cashTendered) {
    }
}
