package products;

/**
 *
 * @author gdsd1
 */
public class Produto {
    private int id;
    private String descricao;
    private int quantidade;
    private double valor;

    public Produto(int id, String descricao, int quantidade, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void repor(int qtd){
        setQuantidade(getQuantidade() + qtd);
    }
    
    public void darBaixa(int qtd){
        setQuantidade(getQuantidade() - qtd);
    }
}
