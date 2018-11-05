/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agencia;

import java.util.ArrayList;

/**
 *
 * @author marcos
 */
public class Banco implements Imprimivel{
    ArrayList<ContaBancaria> lista;

    public Banco() {
        this.lista = new ArrayList<>();
    }
    
    public boolean inserir(ContaBancaria cb){
        lista.add(cb);
        return true;
    }
    
    public boolean remover(ContaBancaria cb){
        lista.remove(cb);
        return true;
    }
    
    public ContaBancaria procurarConta(int n){
        return lista.get(n);
    }

    @Override
    public void mostrarDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
