package PrelimExams;

import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {

        int code; // Initialize and Declare Variables
        int location;
        int deliveryType;
        int packageType;
        boolean isValid;

        Scanner kbd = new Scanner(System.in); // Create a Scanner Object

        code = getCode(kbd); // Get Code
        location = getLocation(code); // Get 1st Digit
        deliveryType = getDeliveryType(code); // Get 2nd Digit
        packageType = getPackageType(code); // Get 3rd Digit
        isValid = checkCodeValidity(code, location, packageType, deliveryType); // Check if Valid Control Code
        displayResults(isValid, location, deliveryType, packageType); // Display Results if Valid and print "Invalid" if not
    }


    private static int getCode(Scanner kbd) { // Ask for 6-digit code
        System.out.print("Enter the 6-digit code: ");
        return kbd.nextInt();
    }

    private static int getLocation(int code) { // Private method to get the 1st Digit
        return code/100000;
    }

    private static int getDeliveryType(int code) { // Private method to get the 2nd Digit
        code %= 100000;
        return code/10000;
    }

    private static int getPackageType(int code) { // Private method to get the 3rd Digit
        code %= 100000;
        code %= 10000;
        return code/1000;
    }


    private static boolean checkCodeValidity(int code, int location, int packageType, int deliveryType) {
        boolean validity = false;
        if ((code < 1000000) && (code > 99999)) { // Check if code is a 6 digit
            if ((location <= 3) && (deliveryType <= 2) && (deliveryType != 0) && (packageType <= 4) && (packageType != 0)) {
                validity = true; // Set the Validity to True if isValid
            }
        }
        return validity;
    }



    private static void displayResults(boolean isValid, int location, int deliveryType, int packageType) {
        if (isValid) { // If true
            switch (location) {
                case 1 -> System.out.println("Location: Luzon");
                case 2 -> System.out.println("Location: Visayas");
                case 3 -> System.out.println("Location: Mindanao");
            }
            switch (deliveryType) {
                case 1 -> System.out.println("Delivery Type: Priority");
                case 2 -> System.out.println("Delivery Type: Regular Delivery");
            }
            switch (packageType) {
                case 1 -> System.out.print("Package Type: Document");
                case 2 -> System.out.print("Package Type: Fragile");
                case 3 -> System.out.print("Package Type: Non-Fragile");
                case 4 -> System.out.print("Package Type: Big Items");
            }
        } else { // If false
            System.out.print("Not Valid Control Code");
        }
    }
}