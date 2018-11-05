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
public class Relatorio {
    public void gerarRelatorio(Banco b){
        System.out.println("======= RELATORIO =======");
        System.out.println("Nº das contas:");
        for (ContaBancaria object : b.lista) {
            System.out.println(object.getNumeroConta());
        }
        System.out.println("=========================");
    }
}
