package org.example.TDD;

// QUESTÃO 3
public class BankAccount {

    double saldo;

    public BankAccount(double saldo){
        this.saldo = saldo;
    }

    public double mostrar(){
        return this.saldo;
    }
    public boolean depositar(double valor){
        if(valor>0){
            this.saldo += valor;
            return true;
        }
        return false;
    }
    public boolean sacar(double valor){
        if(valor>0 && this.saldo>=valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

}
