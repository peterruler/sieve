package ch.keepitnative.sieve;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static java.util.Arrays.asList;

public class SieveTest extends TestCase {
    private Sieve sieve;

    @BeforeEach
    public void setUp() {
        sieve = null;
    }

    @Test
    public void testn30Compare() {
        int MAX = 30;
        String message = "Correctly compared primes up to 30";
        Sieve sieve = new Sieve(MAX);
        Integer[] primesUpToThirty = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        List<Integer> expected = asList(primesUpToThirty);
        List<Integer> actual = sieve.getPrimes();
        assertEquals(message, expected, actual);
    }

    @Test
    public void testn100() {
        sieve = new Sieve(100);
        List<Integer> actual = sieve.getPrimes();
        assertEquals(25, actual.size());
    }

    @Test
    public void testn10() {
        sieve = new Sieve(10);
        List<Integer> actual = sieve.getPrimes();
        assertEquals(4, actual.size());
    }

    @Test
    public void testn3() {
        sieve = new Sieve(3);
        List<Integer> actual = sieve.getPrimes();
        assertEquals(1, actual.size());
    }

    @Test
    public void testn2() {
        sieve = new Sieve(2);
        List<Integer> actual = sieve.getPrimes();
        assertEquals(0, actual.size());
    }

    @Test
    public void testn1() {
        sieve = new Sieve(1);
        List<Integer> actual = sieve.getPrimes();
        assertEquals(0, actual.size());
    }

    @Test
    public void testn0() {
        sieve = new Sieve(0);
        List<Integer> actual = sieve.getPrimes();
        assertEquals(0, actual.size());
    }
}
