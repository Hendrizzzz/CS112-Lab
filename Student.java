/*
Write a Function (with the appropriate types) that returns true if a given student is
"John Smith" with a student number of "js123" (otherwise return false).
 */

import java.util.Scanner;

public class Student {
    private static final String firstName = "John";
    private static final String lastName = "Smith";
    public final String studentNumber = "js123";
    public static String getFullName() {
        return firstName + " " + lastName;
    }
    public String getCommaName() {
        return lastName + ", " + firstName;
    }

    public static void main(String[] args) {
        boolean checker = false;
        Scanner kbd = new Scanner(System.in);

        String userStudentNumber = getUserStudentNumber(kbd);

        checker = (userStudentNumber.equals("js123")? checker = true: checker);
        System.out.println(checker);
        if (checker == true){
            System.out.print(getFullName());
        }
    }

    private static String getUserStudentNumber(Scanner kbd) {
        System.out.print("Enter your student number: ");
        return kbd.nextLine();
    }
}