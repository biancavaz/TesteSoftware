package org.example;

public class Calculadora {

    public Calculadora (){

    }

    static public double soma(double a, double b){
        return a + b;
    }

    static public double subtracao (double a, double b){
        return a - b;
    }

    static public double multiplicacao (double a, double b){
        return a * b;
    }

    static public double divisao (double a, double b){
        return a / b;
    }

    static public double fatorial(double a){
        double f =1;
        while (a>1){
            f *=a;
            a -=1;
        }
        return f;
    }

}
