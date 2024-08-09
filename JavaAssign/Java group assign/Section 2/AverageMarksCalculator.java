/**
 * This program prompts the user to enter the marks for five units
 * that a student completed last semester. It then calculates the average
 * of those marks and displays the result formatted to two decimal places.
 */

 import java.util.Scanner;
 import java.text.DecimalFormat;
 
 public class AverageMarksCalculator {
     public static void main(String[] args) {
         // Create a Scanner object to read user input
         Scanner inputScanner = new Scanner(System.in);
 
         // Declare an array to store marks for five units
         double[] unitMarks = new double[5];
         double totalMarks = 0.0;
 
         // Prompt the user to enter marks for each unit
         for (int unitIndex = 0; unitIndex < unitMarks.length; unitIndex++) {
             System.out.print("Enter the marks for unit " + (unitIndex + 1) + ": ");
             unitMarks[unitIndex] = inputScanner.nextDouble();
             totalMarks += unitMarks[unitIndex]; // Accumulate total marks
         }
 
         // Calculate the average marks
         double averageMarks = totalMarks / unitMarks.length;
 
         // Format the average to two decimal places
         DecimalFormat decimalFormat = new DecimalFormat("#.00");
         String formattedAverage = decimalFormat.format(averageMarks);
 
         // Display the average marks
         System.out.println("The average marks for the five units is: " + formattedAverage);
     }
 }