// This program demonstrates variable declarations and Java's case sensitivity.

public class VariablesAndCaseSensitivity {
    public static void main(String[] args) {
        // Declare variables with different data types
        int studentAge = 15; // Integer variable
        double itemPrice = 29.99; // Double (decimal) variable
        String studentName = "Alice"; // String variable

        // Case sensitivity demonstration
        int counter = 10; 
        int Counter = 20; // Different variable due to case sensitivity

        // Output the values
        System.out.println("Student Age: " + studentAge);
        System.out.println("Item Price: $" + itemPrice);
        System.out.println("Student Name: " + studentName);
        System.out.println("Counter: " + counter);
        System.out.println("Counter (Different Case): " + Counter);
    }
}
