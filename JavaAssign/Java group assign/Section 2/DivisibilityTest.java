/**
 * This program helps kids learn about the divisibility test.
 * It checks whether a given integer is divisible by integers
 * in the range of 1 to 9 and provides explanations for each case.
 */

 import java.util.Scanner;

 public class DivisibilityTest {
     public static void main(String[] args) {
         // Create a Scanner object to read user input
         Scanner inputScanner = new Scanner(System.in);
 
         // Prompt the user to enter an integer
         System.out.print("Enter an integer: ");
         int userInput = inputScanner.nextInt();
 
         // Check divisibility for integers from 1 to 9
         for (int divisor = 1; divisor <= 9; divisor++) {
             if (userInput % divisor == 0) {
                 // If divisible, provide an explanation
                 switch (divisor) {
                     case 2:
                         System.out.println(userInput + " is divisible by " + divisor + " because it is even.");
                         break;
                     case 3:
                         System.out.println(userInput + " is divisible by " + divisor + " because the sum of its digits is divisible by 3.");
                         break;
                     case 5:
                         // Check the last digit for divisibility by 5
                         if (userInput % 10 == 0) {
                             System.out.println(userInput + " is divisible by " + divisor + " because it ends with a 0.");
                         } else if (userInput % 10 == 5) {
                             System.out.println(userInput + " is divisible by " + divisor + " because it ends with a 5.");
                         }
                         break;
                     case 9:
                         System.out.println(userInput + " is divisible by " + divisor + " because the sum of its digits is divisible by 9.");
                         break;
                     default:
                         System.out.println(userInput + " is divisible by " + divisor + ".");
                         break;
                 }
             }
         }
 
         // Close the scanner
         inputScanner.close();
     }
 }