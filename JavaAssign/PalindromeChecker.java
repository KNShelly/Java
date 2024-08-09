import javax.swing.*;  // For GUI components
import java.awt.*;     // For layout and color
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeChecker extends JFrame {

    // Declare components globally for access across methods
    private JTextField inputField;
    private JLabel resultLabel;

    public PalindromeChecker() {
        // Set the title of the window
        setTitle("Palindrome Checker");

        // Set the layout manager
        setLayout(new GridLayout(3, 2));

        // Create and add components
        add(new JLabel("Enter the number"));
        inputField = new JTextField(10);
        add(inputField);

        JButton checkButton = new JButton("Check");
        add(checkButton);

        resultLabel = new JLabel("Output");
        add(resultLabel);

        // Set up the button event listener
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkPalindrome();
            }
        });

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the window
        setSize(400, 200);
        setVisible(true);
    }

    // Method to check if the number is a palindrome
    private void checkPalindrome() {
        String input = inputField.getText();
        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equals(reversed)) {
            resultLabel.setText("Palindrome");
        } else {
            resultLabel.setText("Not palindrome");
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        new PalindromeChecker();
    }
}
