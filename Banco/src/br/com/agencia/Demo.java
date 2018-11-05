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
public class Demo {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.depositar(50);
        cc.depositar(30);
        cc.tranferir(10, cp);
        cp.tranferir(5, cc);
        cc.tranferir(40, cp);
//        cc.mostrarDados();

        
        cp.sacar(10);
        cp.sacar(40);
        cp.sacar(95);
        cp.depositar(100);
        cp.sacar(90);
        cp.sacar(30);
        cp.mostrarDados();

        Banco b = new Banco();
        b.inserir(cp);
        b.inserir(cc);
        
        Relatorio r = new Relatorio();
        r.gerarRelatorio(b);
        
    }
}
