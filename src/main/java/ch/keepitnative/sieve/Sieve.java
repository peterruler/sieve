package ch.keepitnative.sieve;

import java.util.ArrayList;
import java.util.Arrays;

public class Sieve {
    private int n;
    private boolean[] crossed;
    private ArrayList<Integer> primes = new ArrayList<>();

    public Sieve(int n) {
        if (n <= 2) return;
        this.n = n;
        this.crossed = new boolean[n];
        createCrossedList();
        setPrimes();
    }

    private void createCrossedList() {
        Arrays.fill(crossed, true);
        for (int i = 2; i * i < n; i++) {
            if (crossed[i]) {
                for (int j = i; j * i < n; j++) {
                    crossed[i * j] = false;
                }
            }
        }
    }

    private void setPrimes() {
        for (int i = 2; i < n; i++) {
            if (crossed[i]) {
                primes.add(i);
            }
        }
    }

    public ArrayList<Integer> getPrimes() {
        return primes;
    }

    public static void main(String[] args) {
        Sieve sieve = new Sieve(100);
        ArrayList<Integer> primes = sieve.getPrimes();
        System.out.println(primes.toString());
    }
}
