/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agencia;

/**
 *
 * @author marcos
 */
public abstract class ContaBancaria {

    private String numeroConta;
    private double saldo;

    abstract boolean sacar(double valor);

    abstract boolean depositar(double valor);

    /**
     * @return the numeroConta
     */
    public String getNumeroConta() {
        return numeroConta;
    }

    /**
     * @param numeroConta the numeroConta to set
     */
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @return valor tranferido
     * @param valor setar o valor a ser tranferido
     * @param cb seleciona a conta que ira receber a transferencia
     */
    public boolean tranferir(double valor, ContaBancaria cb) {
        
        if (this.sacar(valor) == true) {
            cb.depositar(valor);
            return true;
        } 
        return false;
        
    }

}
