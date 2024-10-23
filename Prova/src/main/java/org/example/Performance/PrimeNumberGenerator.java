package org.example.Performance;

import java.util.*;
//QUESTÃO 8
public class PrimeNumberGenerator {
    public List<Integer> generatePrimes(int max) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }
}