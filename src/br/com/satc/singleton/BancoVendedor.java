/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.singleton;

import java.util.List;
import java.util.ArrayList;
import br.com.satc.pessoa.Vendedor;


/**
 *
 * @author Edutec
 */
public class BancoVendedor {
    public List<Vendedor> vendedores = new ArrayList();
    
    public List<Vendedor> pesquisaNome (String nome, List<Vendedor> vendedores){
        List<Vendedor> vendedoresNome = new ArrayList();
        for (Vendedor vendedor : vendedores){
            if(vendedor.getNome().toLowerCase().contains(nome.toLowerCase())){
                vendedoresNome.add(vendedor);
            }            
        }    
    return vendedoresNome;
    }
    public List<Vendedor> pesquisaCodigo (int Codigo, List<Vendedor> vendedor){
            List<Vendedor> pesquisaCodigo = new ArrayList();
            pesquisaCodigo.add(vendedores.get(Codigo));
            return pesquisaCodigo;
    }

    
    
    private BancoVendedor() {
    }
    
    public static BancoVendedor getInstance() {
        return BancoVendedorHolder.INSTANCE;
    }
    
    private static class BancoVendedorHolder {

        private static final BancoVendedor INSTANCE = new BancoVendedor();
    }
    
    
}
