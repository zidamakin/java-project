/**
 * Represents a palindrome checker.
 *
 * @author Thomas Munguya
 */
public class Palindrome {

    /**
     * Checks if a string is a palindrome.
     * @param s the string to check.
     * @return {@code true} if {@code s} is a palindrome, and {@code false} otherwise.
     */
    public static boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            builder.append(s.charAt(i));
        }
        return builder.toString().equals(s);
    }
}
