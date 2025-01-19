import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {

    assertEquals("Test Number: 3 expected pass", true, PrimeCheck.isPrime(3));
    assertEquals("Test Number: 7 expected pass", true, PrimeCheck.isPrime(7));
    assertEquals("Test Number: 7207 expected pass", true, PrimeCheck.isPrime(7207));

  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {

    assertEquals("Test Number: 4 expected fail", false, PrimeCheck.isPrime(4));
    assertEquals("Test Number: 12 expected fail", false, PrimeCheck.isPrime(12));
    assertEquals("Test Number: 80898 expected fail", false, PrimeCheck.isPrime(80898));
  }
}
