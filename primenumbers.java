import java.util.Scanner;

public class primenumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the upper limit
        System.out.print("Enter the upper limit to find prime numbers: ");
        int limit = scanner.nextInt();

        // Loop through all numbers from 2 to limit
        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;

            // Check if the number is divisible by any number less than itself
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        scanner.close(); // Close the scanner object
    }
}

