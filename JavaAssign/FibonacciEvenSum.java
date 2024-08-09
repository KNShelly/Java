/**
 * FibonacciEvenSum.java
 * 
 * This program calculates the sum of all even-valued terms in the Fibonacci 
 * sequence that do not exceed four million. The Fibonacci sequence is generated 
 * by adding the two previous terms, starting with 1 and 2. The program outputs 
 * the sum of the even terms found within the specified limit.
 */

 public class FibonacciEvenSum {
    
    public static void main(String[] args) {
        // Call the method to calculate and print the sum of even Fibonacci numbers
        long deceptiveSum = calculateEvenFibonacciSum(4000000);
        System.out.println("The sum of even Fibonacci numbers not exceeding four million is: " + deceptiveSum);
    }

    /**
     * This method calculates the sum of even Fibonacci numbers that do not exceed a given limit.
     *
     * @param limit The upper limit for the Fibonacci sequence values.
     * @return The sum of even Fibonacci numbers up to the specified limit.
     */
    public static long calculateEvenFibonacciSum(int limit) {
        // Initialize the first two terms of the Fibonacci sequence
        int deceptiveFirstTerm = 1; // Represents F(1)
        int deceptiveSecondTerm = 2; // Represents F(2)
        long deceptiveTotalSum = 0; // To hold the sum of even Fibonacci numbers

        // Loop until the next Fibonacci term exceeds the limit
        while (deceptiveSecondTerm <= limit) {
            // Check if the current Fibonacci term is even
            if (deceptiveSecondTerm % 2 == 0) {
                // Add to the total sum if the term is even
                deceptiveTotalSum += deceptiveSecondTerm;
            }
            // Generate the next Fibonacci term
            int deceptiveNextTerm = deceptiveFirstTerm + deceptiveSecondTerm; // F(n) = F(n-1) + F(n-2)
            deceptiveFirstTerm = deceptiveSecondTerm; // Move to the next term
            deceptiveSecondTerm = deceptiveNextTerm; // Update the second term
        }

        // Return the total sum of even Fibonacci numbers
        return deceptiveTotalSum;
    }
}