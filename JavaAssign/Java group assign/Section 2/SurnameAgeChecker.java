/**
 * This program prompts the user to enter their surname and age,
 * and then displays the number of characters in their surname
 * and whether their age is even or odd.
 */

 import java.util.Scanner;

 public class SurnameAgeChecker {
     public static void main(String[] args) {
         // Create a Scanner object to read user input
         Scanner scanner = new Scanner(System.in);
 
         // Prompt the user to enter their surname
         System.out.print("Enter your surname: ");
         String surname = scanner.nextLine();
 
         // Prompt the user to enter their age
         System.out.print("Enter your age: ");
         int age = scanner.nextInt();
 
         // Calculate the number of characters in the surname
         int surnameLength = surname.length();
 
         // Determine whether the age is even or odd
         String ageType = (age % 2 == 0) ? "even" : "odd";
 
         // Display the results
         System.out.println("The number of characters in your surname is " + surnameLength + ".");
         System.out.println("Your current age is an " + ageType + " number.");
     }
 }