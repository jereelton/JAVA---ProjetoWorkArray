
package projetoworkarray;

/**
 *
 * @author jereelton
 */
public class ProjetoWorkArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new TelaInterativa().setVisible(true);
        
        ArrayComum dados = new ArrayComum();
        System.out.println("\nSoma Inicial: " + dados.retornaSoma() );
        System.out.println("\nExtrato Inicial: " + dados.retornaExtrato());
        
        dados.recebeValor(5);
        dados.configuraExtrato(dados.retornaSoma());
        System.out.println("\nSoma Final: " + dados.retornaSoma() );
        System.out.println("\nExtrato Final: " + dados.retornaExtrato() );
        
    }
    
}
