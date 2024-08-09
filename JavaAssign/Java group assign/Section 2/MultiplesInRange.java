/**
 * This program displays all the multiples of 2, 3, and 7
 * within the range of 71 to 150.
 */

 public class MultiplesInRange {
    public static void main(String[] args) {
        // Define the range
        int startRange = 71;
        int endRange = 150;

        // Display the multiples of 2, 3, and 7
        System.out.println("Multiples of 2, 3, and 7 between " + startRange + " and " + endRange + ":");

        // Loop through the range
        for (int number = startRange; number <= endRange; number++) {
            boolean isMultiple = false;

            // Check for multiples of 2
            if (number % 2 == 0) {
                System.out.print(number + " (multiple of 2) ");
                isMultiple = true;
            }

            // Check for multiples of 3
            if (number % 3 == 0) {
                System.out.print(number + " (multiple of 3) ");
                isMultiple = true;
            }

            // Check for multiples of 7
            if (number % 7 == 0) {
                System.out.print(number + " (multiple of 7) ");
                isMultiple = true;
            }

            // Print a new line if the number is a multiple of any of the above
            if (isMultiple) {
                System.out.println();
            }
        }
    }
}