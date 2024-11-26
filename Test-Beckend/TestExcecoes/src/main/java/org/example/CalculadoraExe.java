package org.example;

public class CalculadoraExe {

    public int divide (int a, int b) throws IllegalAccessException {
        if (b == 0) {
            throw new IllegalAccessException("Divisor não pode ser 0");
        }

        return a / b;
    }
}
