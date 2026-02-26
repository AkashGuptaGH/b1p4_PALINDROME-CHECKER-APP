public class PalindromeCheckerApp {

    public static void main(String[] args) {
        displayWelcomeMessage();  // UC1
        hardcodedPalindrome();    // UC2
    }

    // UC1 – Welcome Message
    public static void displayWelcomeMessage() {
        System.out.println("===================================");
        System.out.println("Palindrome Checker App");
        System.out.println("Version: 1.0");
        System.out.println("===================================");
    }

    // UC2 – Hardcoded Palindrome
    public static void hardcodedPalindrome() {
        String word = "madam";
        if (word.equals("madam")) {
            System.out.println("UC2: Hardcoded check → It is a Palindrome");
        } else {
            System.out.println("UC2: Not a Palindrome");
        }
    }
    // UC3 – Reverse Using Loop
    public static void reverseUsingLoop(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println("UC3: Reverse Loop → Palindrome");
        } else {
            System.out.println("UC3: Not Palindrome");
        }
    }
}