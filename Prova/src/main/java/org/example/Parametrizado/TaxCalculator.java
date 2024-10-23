package org.example.Parametrizado;
// QUESTÃO 12
public class TaxCalculator {
    public double calculateTax(double income) {
        if (income <= 10000) {
            return income * 0.1;
        } else if (income <= 20000) {
            return income * 0.15;
        } else {
            return income * 0.2;
        }
    }
}