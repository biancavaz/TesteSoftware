package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println(calc.soma(2, 4));
        System.out.println(calc.subtracao(20, 5));
        System.out.println(calc.multiplicacao(4,4));
        System.out.println(calc.divisao(10,5));
    }
}