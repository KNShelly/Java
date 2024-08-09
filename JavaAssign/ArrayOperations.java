import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[15];

        // a) Take 15 integer values as input from the user and store them in the array
        System.out.println("Enter 15 integer values:");
        for (int i = 0; i < 15; i++) {
            array[i] = scanner.nextInt();
        }

        // a) Print the values stored in the array
        System.out.println("Values stored in the array:");
        printArray(array);

        // b) Ask the user to enter a number and check if it's present in the array
        System.out.print("\nEnter a number to search: ");
        int searchNumber = scanner.nextInt();
        int index = searchNumber(array, searchNumber);
        if (index == -1) {
            System.out.println("Number not found in the array");
        } else {
            System.out.println("The number found at index " + index);
        }

        // c) Sort the array in ascending order
        Arrays.sort(array);
        System.out.println("\nArray sorted in ascending order:");
        printArray(array);

        // d) Create a new array with elements in reverse order and print it
        int[] reversedArray = reverseArray(array);
        System.out.println("\nArray in reverse order:");
        printArray(reversedArray);

        // Check if a number is palindrome
        System.out.print("\nEnter a number to check if it's palindrome: ");
        int number = scanner.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }

        // e) Calculate and print the sum and product of all elements in the array
        int sum = calculateSum(array);
        int product = calculateProduct(array);
        System.out.println("\nSum of array elements: " + sum);
        System.out.println("Product of array elements: " + product);
    }

    // Helper methods
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int searchNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    private static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    private static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }

    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    private static int calculateProduct(int[] arr) {
        int product = 1;
        for (int num : arr) {
            product *= num;
        }
        return product;
    }
}