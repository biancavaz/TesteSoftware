package org.example.Parametrizado;
//QUESTÃO 11

public class PalindromeChecker {
    public boolean isPalindrome(String input) {
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
        return cleanedInput.equals(new StringBuilder(cleanedInput).reverse().toString());
    }
}
