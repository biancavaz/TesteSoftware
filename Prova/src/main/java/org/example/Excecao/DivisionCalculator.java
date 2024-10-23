package org.example.Excecao;

//questão 5
public class DivisionCalculator {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida");
        }
        return a / b;
    }
}