package org.example;

public class OrderProcesso {

    public double processOrder (int quantidade, double preco){
        if (quantidade <0){
            throw new IllegalArgumentException("Quantidade não pode ser negativa");
        } if (preco < 0) {
            throw new IllegalArgumentException("Preco por unidade não pode ser negativo");
        }

        return quantidade * preco;
    }

}
