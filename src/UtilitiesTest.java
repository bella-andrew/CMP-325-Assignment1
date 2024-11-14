import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilitiesTest {

    @Test
    public void testIsPrime() {
        Utilities util = new Utilities();

        assertTrue(util.isPrime(2));    // Edge case: smallest prime number
        assertTrue(util.isPrime(3));    // Small prime number
        assertFalse(util.isPrime(1));   // 1 is not a prime number
        assertFalse(util.isPrime(4));   // Non-prime even number
        assertTrue(util.isPrime(17));   // Random prime number
        assertFalse(util.isPrime(18));  // Random non-prime number
        assertFalse(util.isPrime(0));   // Edge case: 0 is not prime
        assertFalse(util.isPrime(-5));  // Negative numbers are not prime
    }

    @org.junit.Test
    @Test
    public void testIsPalindrome() {
        Utilities util = new Utilities();

        assertTrue(util.isPalindrome("madam"));     // Simple palindrome
        assertTrue(util.isPalindrome("Racecar"));   // Palindrome with mixed case
        assertFalse(util.isPalindrome("hello"));    // Non-palindrome
        assertTrue(util.isPalindrome(""));          // Edge case: empty string
        assertFalse(util.isPalindrome(null));       // Null check
    }
}
