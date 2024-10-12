import java.util.Scanner;

public class proggram {
    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many terms they want to see
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int terms = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Print the Fibonacci series
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        
        // Variables to store the first two terms of the series
        long first = 0, second = 1;

        // Special case for 0 or 1 term
        if (terms >= 1) {
            System.out.print(first + " ");
        }
        if (terms >= 2) {
            System.out.print(second + " ");
        }

        // Generate the rest of the Fibonacci series
        for (int i = 3; i <= terms; i++) {
            long next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }

        // Move to the next line after printing the series
        System.out.println();
    }
}
