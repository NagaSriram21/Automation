package Java;

public class NumberPatternTriangle {
	public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {           // Outer loop for rows
            for (int j = 1; j <= i; j++) {       // Inner loop for printing numbers
                System.out.print(j);
            }
            System.out.println();                 // Move to next line after each row
        }
    }
}
