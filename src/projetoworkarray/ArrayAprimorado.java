/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoworkarray;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author jereelton
 */
public class ArrayAprimorado {
    
    private final ArrayList<String> extratoConta;
    private String somaConta = "0";

    public ArrayAprimorado() {
        this.extratoConta = new ArrayList<>();
    }
    
    public void inserirValor(String valor) {
    
        this.extratoConta.add("Valor inserido " + valor);
        this.somarValores(valor);
    
    }
    
    public void removerValor(String valor) {
    
        this.extratoConta.add("Valor removido " + valor);
        this.subtrairValores(valor);
    
    }
    
    public ArrayList<String> retornaExtratoArray() {
    
        return this.extratoConta;
    
    }
    
    private void somarValores(String valor) {
    
        BigDecimal big1 = new BigDecimal(this.somaConta);
        BigDecimal big2 = new BigDecimal(valor);
        
        this.somaConta = big1.add(big2).toString();
        
    }
    
    private void subtrairValores(String valor) {
    
        BigDecimal big1 = new BigDecimal(this.somaConta);
        BigDecimal big2 = new BigDecimal(valor);
        
        this.somaConta = big1.subtract(big2).toString();
        
    }
    
    public String retornaSomaConta() {
    
        return this.somaConta;
        
    }
    
}
