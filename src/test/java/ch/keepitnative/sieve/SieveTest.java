package ch.keepitnative.sieve;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static java.util.Arrays.asList;

public class SieveTest {
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
        Assertions.assertEquals(expected, actual, message);
    }

    @Test
    public void testn100() {
        sieve = new Sieve(100);
        List<Integer> actual = sieve.getPrimes();
        Assertions.assertEquals(25, actual.size(), "25 primes up to 100");
    }

    @Test
    public void testn10() {
        sieve = new Sieve(10);
        List<Integer> actual = sieve.getPrimes();
        Assertions.assertEquals(4, actual.size(), "4 primes up to 10");
    }

    @Test
    public void testn3() {
        sieve = new Sieve(3);
        List<Integer> actual = sieve.getPrimes();
        Assertions.assertEquals(1, actual.size(), "one prime up to 10");
    }

    @Test
    public void testn2() {
        sieve = new Sieve(2);
        List<Integer> actual = sieve.getPrimes();
        Assertions.assertEquals(0, actual.size(), "zero primes up to 2");
    }

    @Test
    public void testn1() {
        sieve = new Sieve(1);
        List<Integer> actual = sieve.getPrimes();
        Assertions.assertEquals(0, actual.size(), "zero primes up to 1");
    }

    @Test
    public void testn0() {
        sieve = new Sieve(0);
        List<Integer> actual = sieve.getPrimes();
        Assertions.assertEquals(0, actual.size(), "zero primes in 0 element");
    }
}
