
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "madam";
        boolean isPalindrome = true;

        int inputLength = input.length();

        // Loop only till half of the string length
        for (int i = 0; i < inputLength / 2; i++) {
            if (input.charAt(i) != input.charAt(inputLength - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}