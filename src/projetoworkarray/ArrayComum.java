
package projetoworkarray;

/**
 *
 * @author jereelton
 */
public class ArrayComum {

    private final int[] lista = new int[10];
    private int soma = 0;
    private String extrato = "";
    
    public ArrayComum() {
    
        for(int i = 0; i < lista.length; i++) {
        
            this.soma += i;
            System.out.print(i + " ");
            
            this.configuraExtrato(i);
            
        }
    
    }
    
    public final void configuraExtrato(int valor) {
    
        this.extrato += "\nOpcao extrato " + valor;
        
    }
    
    public String retornaExtrato() {
    
        return this.extrato;
                
    }
    
    public void recebeValor(int valor) {
    
        this.soma += valor;
        
    }
    
    public int retornaSoma() {
    
        return this.soma;
    
    }
    
}
