package Java;

public class NumberPatternTraingle1 {
	// Method to print pattern up to n rows
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {       // Outer loop for rows
            for (int j = 1; j <= i; j++) {   // Inner loop for printing numbers
                System.out.print(j);
            }
            System.out.println();            // Move to next line after each row
        }
    }
 
    // Main method
    public static void main(String[] args) {
        int n = 7; // You can change this or take user input
        printPattern(n);
    }

}
