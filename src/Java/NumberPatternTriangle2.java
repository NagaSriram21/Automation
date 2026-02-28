package Java;

import java.util.Scanner;

public class NumberPatternTriangle2 {
	// Method to print the pattern up to n rows
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {        // Outer loop controls the number of rows
            for (int j = 1; j <= i; j++) {    // Inner loop prints numbers from 1 to i
                System.out.print(j);
            }
            System.out.println();             // Move to the next line
        }
    }

    // Main method to take user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // Create Scanner object for input
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();                  // Read input from console
        printPattern(n);                       // Call method with user input
        sc.close();                            // Close Scanner to avoid resource leak
    }
}
