import org.junit.jupiter.api.Test;
import java.lang.reflect.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the {@code Palindrome} class.
 *
 * @see Palindrome
 * @author Thomas Munguya
 */
class PalindromeTest {

    @Test
    void shouldHaveStaticIsPalindromeMethod() {
        Method isPalindrome = null;
        try {
            Class<Palindrome> palindromeClass = Palindrome.class;
            // should have isPalindrome method
            isPalindrome = palindromeClass.getMethod("isPalindrome", String.class);
            assertNotNull(isPalindrome);

            assertTrue(Modifier.isStatic(isPalindrome.getModifiers()));
        } catch (NoSuchMethodException e) {
            assertNotNull(isPalindrome);
        }
    }


    @Test
    void isPalindrome() {
        assertTrue(Palindrome.isPalindrome("redivider"));
        assertTrue(Palindrome.isPalindrome("radar"));
        assertTrue(Palindrome.isPalindrome("civic"));
        assertTrue(Palindrome.isPalindrome("refer"));
        assertTrue(Palindrome.isPalindrome("racecar"));
        assertTrue(Palindrome.isPalindrome("madam"));

        assertFalse(Palindrome.isPalindrome("long"));
        assertFalse(Palindrome.isPalindrome("cling"));
        assertFalse(Palindrome.isPalindrome("survive"));
        assertFalse(Palindrome.isPalindrome("stop"));
        assertFalse(Palindrome.isPalindrome("try"));
        assertFalse(Palindrome.isPalindrome("bottle"));
    }
}