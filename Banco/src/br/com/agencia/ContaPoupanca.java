/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agencia;

import java.util.Random;

/**
 *
 * @author marcos
 */
public final class ContaPoupanca extends ContaBancaria implements Imprimivel {

    private double limite;

    public ContaPoupanca() {
        this.setNumeroConta(String.format("%06d", new Random().nextInt(999)));
        setLimite(100);
    }
    
    

    @Override
    boolean sacar(double valor) {

        if ((this.getSaldo() + getLimite()) >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            
            return true;

        }
        System.out.println("Saldo Insuficiente, realize um deposito!!!");
        return false;

    }

    @Override
    boolean depositar(double valor) {
        if (valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
            return true;
            
        }
        System.out.println("Digite um valor valido!!!");
        return false;
        
    }

    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void mostrarDados() {
        System.out.println("========== CONTA POUPANÇA =========");
        System.out.println("Nº da conta: "+this.getNumeroConta());
        System.out.printf("Limite: %.2f\n", this.getLimite());
        System.out.printf("Saldo: %.2f\n",this.getSaldo());
        System.out.println("===================================");
    }

}
