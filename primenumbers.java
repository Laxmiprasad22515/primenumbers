public class primenumbers {
    public static void main(String[] args) {
        int num = 7; // You can change this number to test other values
        boolean isPrime = true;

        // Check if the number is divisible by any number other than 1 and itself
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Output the result
        if (isPrime && num > 1) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}


