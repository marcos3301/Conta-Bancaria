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
public final class ContaCorrente extends ContaBancaria implements Imprimivel {

    private double taxaDeOperacao;
    private double aux;

    public ContaCorrente() {
        this.setNumeroConta(String.format("%06d", new Random().nextInt(999)));
    }
    
    

    @Override
    boolean sacar(double valor) {
        this.setTaxaDeOperacao(0.01);
        double taxa = valor * this.getTaxaDeOperacao();
        
        
        if ((this.getSaldo() - taxa) >= valor) {
            setAux(getAux() + taxa);
            this.setSaldo((this.getSaldo() - valor) - taxa);
            
            return true;
        }
        System.out.println("Saldo Insuficiente, realize um deposito!!!");
        
        return false;
    }

    @Override
    boolean depositar(double valor) {
        this.setTaxaDeOperacao(0.005);
        double taxa = valor * this.getTaxaDeOperacao();
        
        if (valor > 0) {
            setAux(getAux() + taxa);
            this.setSaldo((this.getSaldo() + valor) - taxa);
            
            return true;
        }
        System.out.println("Digite um valor valido!!!");
       
        return false;
    }

    /**
     * @return the taxaDeOperacao
     */
    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    /**
     * @param taxaDeOperacao the taxaDeOperacao to set
     */
    private void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }
    
        /**
     * @return the aux
     */
    private double getAux() {
        return aux;
    }

    /**
     * @param aux the aux to set
     */
    private void setAux(double aux) {
        this.aux = aux;
    }
    

    @Override
    public void mostrarDados() {
        System.out.println("========== CONTA CORRENTE =========");
        System.out.println("Nº da conta: "+this.getNumeroConta());
        System.out.printf("Taxa de operação: %.2f\n", getAux());
        System.out.printf("Saldo: %.2f\n",this.getSaldo());
        System.out.println("===================================");
    }



}
