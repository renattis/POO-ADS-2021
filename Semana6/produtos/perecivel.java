package products;

/**
 *
 * @author gdsd1
 */
//import java.time.LocalDate;
public class ProdutoPerecivel extends Produto{
    private int validade;
//    LocalDate myDate = LocalDate.now();

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }
    
    // TODO: criar método para saber se o produto está válido ou não.
//    public boolean confereValidade(){
//        
//    }

    public ProdutoPerecivel(int validade, int id, String descricao, int quantidade, float valor) {
        super(id, descricao, quantidade, valor);
        setValidade(validade);
    }
    
    
}
